package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2017/1/18.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface DIActivity {
}
