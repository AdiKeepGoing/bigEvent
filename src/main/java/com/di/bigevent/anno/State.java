package com.di.bigevent.anno;

import com.di.bigevent.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented//元注解
@Target({ElementType.FIELD})//元注解，filed在属性中能够使用
@Retention(RetentionPolicy.RUNTIME)//元注解
@Constraint(
        validatedBy = {StateValidation.class}
)//用哪个类里的校验规则
public @interface State {


    //提供校验失败后的提示信息
    String message() default "state参数的值只能是草稿或者已发布";

    //指定分组
    Class<?>[] groups() default {};

    //负载  获取到State注解的附加信息 //一般用不到不用管
    Class<? extends Payload>[] payload() default {};
}
