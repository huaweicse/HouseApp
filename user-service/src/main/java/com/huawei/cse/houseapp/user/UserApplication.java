package com.huawei.cse.houseapp.user;/**
 * Created by m00416667 on 2017/11/9.
 */

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;

@SpringBootApplication(exclude = DispatcherServletAutoConfiguration.class)
@EnableServiceComb
public class UserApplication {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(UserApplication.class, args);
  }
}
