package cn.cncoders.springconfiglocation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author eric
 * @Version V1.0.0
 * @Date 2019/6/12
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "世界你好！";


    }
}
