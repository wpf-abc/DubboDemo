package wpf.example.dubbo.bootorderconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class BootOrderConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderConsumerApplication.class, args);
    }

}
