package delamey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuyiming
 * @description
 * @date 2020-09-11 10:48
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderOne {
    public static void main(String[] args) {
        SpringApplication.run(ProviderOne.class,args);
    }
}
