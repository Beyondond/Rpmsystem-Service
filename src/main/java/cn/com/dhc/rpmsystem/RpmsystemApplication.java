package cn.com.dhc.rpmsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("cn.com.dhc.rpmsystem.*.dao")
public class RpmsystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(RpmsystemApplication.class, args);
    }

}
