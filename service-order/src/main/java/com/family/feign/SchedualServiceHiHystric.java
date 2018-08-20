package com.family.feign;

import org.springframework.stereotype.Component;

/**
 * @Author: houcc
 * @Date: 2018/8/20
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
