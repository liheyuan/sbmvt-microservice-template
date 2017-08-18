/**
 * @(#)RpcServerConfiguration.java, Jul 31, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package @packageName@.server.configuration;

import @packageName@.thrift.@CamelName@Thrift;
import @packageName@.server.thrift.ThriftServerHandler;
import org.apache.thrift.TProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author coder4
 */
@Configuration
@ConditionalOnProperty(name = "thriftServer.enabled", matchIfMissing = true)
public class ThriftProcessorConfiguration {

    @Bean(name = "thriftProcessor")
    public TProcessor processor(ThriftServerHandler handler) {
        return new @CamelName@Thrift.Processor(handler);
    }

}
