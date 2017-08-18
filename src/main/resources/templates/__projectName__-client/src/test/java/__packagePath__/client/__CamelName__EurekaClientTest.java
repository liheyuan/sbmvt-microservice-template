/**
 * @(#)MySampleEurekaClientTest.java, Aug 10, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package @packageName@.client;

import @packageName@.client.@CamelName@EurekaClientBuilder;
import @packageName@.thrift.@CamelName@Thrift;
import com.coder4.sbmvt.thrift.client.ThriftClient;

/**
 * @author coder4
 */
public class @CamelName@EurekaClientTest {

    public static void main(String[] args) throws InterruptedException {
        String serviceName = "@name@-thrift-server";
        ThriftClient<@CamelName@Thrift.Client> client = @CamelName@EurekaClientBuilder.buildClient(serviceName);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            try {
                String str = client.call(cli -> cli.sayHi());
            } catch (Exception e) {
                i--;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
