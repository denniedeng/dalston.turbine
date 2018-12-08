package cloud.dalston.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@EnableTurbine /** 只出来json数据，暂时未出来图形监控。待跟进问题所在 **/
@EnableDiscoveryClient
public class TurbineInitApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(TurbineInitApplication.class, args);
    }
}
