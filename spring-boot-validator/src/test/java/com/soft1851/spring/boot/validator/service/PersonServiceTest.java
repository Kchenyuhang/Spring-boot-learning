package com.soft1851.spring.boot.validator.service;

import com.soft1851.spring.boot.validator.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.validation.*;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/30
 */
@SpringBootTest
class PersonServiceTest {
    @Resource
    private PersonService personService;

    @Test
    @ExceptionHandler(ConstraintViolationException.class)
    void validatePerson() {
        Person person = new Person();
        person.setId("123");
        person.setName("Archer");
        person.setAge(18);
        person.setPhone("18932386185");
        person.setEmail("Archer@gamil.com");
        person.setSex("Man");
        personService.validatePerson(person);
    }

    @Test
    void checkManually() {
        //通过Validator工厂类获得的Validator实例，也可以通过注入的方式
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person();
        person.setId("123");
        person.setSex("Man22");
        person.setEmail("abc");
        //对参数进行校验，得到一组结果
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        for (ConstraintViolation<Person> constraintViolation : violations) {
            System.out.println(constraintViolation.getMessage());
        }
    }

    @Test
    void checkPhoneNumber() {
        //通过Validator工厂类获得的Validator实例，也可以通过注入的方式
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person();
        person.setId("123");
        person.setName("Archer");
        person.setAge(18);
        person.setPhone("18851697959");
        person.setEmail("Archer@gamil.com");
        person.setSex("Man");
        //对参数进行校验，得到一组结果
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        for (ConstraintViolation<Person> constraintViolation : violations) {
            System.out.println(constraintViolation.getMessage());
        }
    }
}