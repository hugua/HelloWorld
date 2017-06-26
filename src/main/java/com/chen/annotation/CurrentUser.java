package com.chen.annotation;

import com.chen.constant.Constant;

import java.lang.annotation.*;

/**
 * Created by cvter on 2017/6/7.
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {
    String value() default Constant.CURRENT_USER;
}
