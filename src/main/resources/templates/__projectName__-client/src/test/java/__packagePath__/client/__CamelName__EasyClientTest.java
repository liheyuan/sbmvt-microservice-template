/**
 * @(#)MySampleClientTest.java, Aug 01, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package @packageName@.client;

import @packageName@.thrift.@CamelName@Thrift;
import com.coder4.sbmvt.thrift.client.ThriftClient;

import java.util.concurrent.Future;

/**
 * @author coder4
 */
public class @CamelName@EasyClientTest {

    public static void test1() {
        ThriftClient<@CamelName@Thrift.Client> client = @CamelName@EasyClientBuilder
                .buildClient("127.0.0.1", 3000);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i<10000; i++) {
            String ret = client.call(cli -> cli.sayHi());
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        //System.out.println(ret);
    }

    public static void test2() throws Exception {
        ThriftClient<@CamelName@Thrift.Client> client = @CamelName@EasyClientBuilder
                .buildClient("127.0.0.1", 3000);

        Future<String> fRet = client.asyncCall(cli -> cli.sayHi());
        System.out.println(fRet.get());
    }

    public static void main(String [] args) throws Exception {
        test1();
        //test2();
    }

}
