package com.InternProjects.e_commerce.utilits;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Updates {

    private Updates(){}

    public static <T> T updateFields(T source, T target) {
        Field[] fields = source.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = ReflectionUtils.getField(field, source);

            if (value != null) {
                ReflectionUtils.setField(field, target, value);
            }
        }

        return target;
    }


    public static <T> T updateValues(T source, T target) {


        Arrays.stream(source.getClass().getDeclaredFields())
                .peek(field -> field.setAccessible(true))
                .filter(field -> ReflectionUtils.getField(field, source) != null)
                .forEach(field -> {
                    Object value = ReflectionUtils.getField(field, source);
                    ReflectionUtils.setField(field, target, value);
                });
        return target;
    }



}


