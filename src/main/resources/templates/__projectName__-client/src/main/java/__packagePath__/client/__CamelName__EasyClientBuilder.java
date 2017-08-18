/**
 * @(#)MySampleClientBuilder.java, Aug 01, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package @packageName@.client;

import @packageName@.thrift.@CamelName@Thrift;
import com.coder4.sbmvt.thrift.client.builder.EasyThriftClientBuilder;
import com.coder4.sbmvt.thrift.client.ThriftClient;

/**
 * @author coder4
 */
public class @CamelName@EasyClientBuilder extends EasyThriftClientBuilder<@CamelName@Thrift.Client> {

    public @CamelName@EasyClientBuilder(String host, int port) {
        setThriftClass(@CamelName@Thrift.class);

        setHost(host);
        setPort(port);
    }

    public static ThriftClient<@CamelName@Thrift.Client> buildClient(String host, int port) {
        return new @CamelName@EasyClientBuilder(host, port).build();
    }

}
