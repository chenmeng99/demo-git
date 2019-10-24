package com.mr.demogit.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author chen
 * @Date 2019/10/23
 * @Version V1.0
 **/
@RestController
public class TestController {


    @GetMapping("test")
    public String test(){
        return "test - git";
    }

}
