package com.soft1851.spring.boot.validator.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/30
 */
public class RegionValidator implements ConstraintValidator<Region,String > {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext){
        HashSet<Object> regions = new HashSet<>();
        regions.add("China");
        regions.add("China-Taiwan");
        regions.add("China-HongKong");
        return regions.contains(s);
    }
}
