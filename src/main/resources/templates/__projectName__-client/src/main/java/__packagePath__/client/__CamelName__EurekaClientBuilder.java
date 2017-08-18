/**
 * @(#)MySampleClientBuilder.java, Aug 01, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package @packageName@.client;

import @packageName@.thrift.@CamelName@Thrift;
import com.coder4.sbmvt.thrift.client.builder.EurekaThriftClientBuilder;
import com.coder4.sbmvt.thrift.client.ThriftClient;

/**
 * @author coder4
 */
public class @CamelName@EurekaClientBuilder extends EurekaThriftClientBuilder<@CamelName@Thrift.Client> {

    public @CamelName@EurekaClientBuilder(String serviceName) {
        setThriftClass(@CamelName@Thrift.class);

        setThriftServiceName(serviceName);
    }

    public static ThriftClient<@CamelName@Thrift.Client> buildClient(String serviceName) {
        return new @CamelName@EurekaClientBuilder(serviceName).build();
    }

}
