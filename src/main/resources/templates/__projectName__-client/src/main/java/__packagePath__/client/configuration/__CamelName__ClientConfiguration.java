package @packageName@.client.configuration;

import @packageName@.client.@CamelName@EasyClientBuilder;
import @packageName@.client.@CamelName@EurekaClientBuilder;
import @packageName@.thrift.@CamelName@Thrift;
import @packageName@.thrift.@CamelName@Thrift.Client;
import com.coder4.sbmvt.thrift.client.ThriftClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author coder4
 */
@Configuration
public class @CamelName@ClientConfiguration {

    @Bean(name = "@camelName@ThriftClient")
    @ConditionalOnMissingBean(name = "@camelName@ThriftClient")
    @ConditionalOnProperty(name = {"@camelName@ThriftServer.host", "@camelName@ThriftServer.port"})
    public ThriftClient<Client> easyClient(
            @Value("${@camelName@ThriftServer.host}") String host,
            @Value("${@camelName@ThriftServer.port}") int port
    ) {
        // TODO LOG
        return @CamelName@EasyClientBuilder.buildClient(host, port);
    }

    @Bean(name = "@camelName@ThriftClient")
    @ConditionalOnMissingBean(name = "@camelName@ThriftClient")
    public ThriftClient<@CamelName@Thrift.Client> eurekaClient() {
        // TODO LOG
        return @CamelName@EurekaClientBuilder.buildClient("@projectName@-thrift-server");
    }

}
