package com.example.dyupdate.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Component
public @interface ElasticJob {

    String cron();

}
