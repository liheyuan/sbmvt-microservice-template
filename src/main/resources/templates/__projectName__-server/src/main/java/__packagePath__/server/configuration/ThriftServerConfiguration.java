/**
 * @(#)ThriftServerRunnable.java, Jul 31, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package @packageName@.server.configuration;

import com.coder4.sbmvt.thrift.server.ThriftServerRunnable;
import com.netflix.discovery.EurekaClient;
import org.apache.thrift.TProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author coder4
 */
@Configuration
@ConditionalOnBean(value = TProcessor.class, name = "thriftProcessor")
@EnableEurekaClient()
public class ThriftServerConfiguration implements InitializingBean, DisposableBean {

    private Logger LOG = LoggerFactory.getLogger(ThriftServerConfiguration.class);

    @Autowired
    private TProcessor processor;

    @Autowired
    private EurekaClient eurekaClient;

    private ThriftServerRunnable thriftServer;

    private Thread thread;

    @Override
    public void destroy() throws Exception {
        // Unregister from eureka server & Sleep for 6 seconds
        LOG.info("ThriftServerConfiguration destroy, shutdown eureka client.");
        eurekaClient.shutdown();

        Thread.sleep(TimeUnit.SECONDS.toMillis(6));
        LOG.info("ThriftServerConfiguration destroy, shutdown rpc server.");
        thriftServer.stop();
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        thriftServer = new ThriftServerRunnable(processor);

        thread = new Thread(thriftServer);
        thread.start();
    }
}
