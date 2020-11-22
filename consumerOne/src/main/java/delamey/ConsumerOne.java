package delamey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuyiming
 * @description
 * @date 2020-09-11 10:58
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerOne {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOne.class,args);
    }
}
