package org.example.handmapping;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

public class BeanMapping implements InstantiationAwareBeanPostProcessor {
    //    在实例化之前执行
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("执行了postProcessBeforeInstantiation");
        return null;
    }
    //postProcessBeforeInstantiation返回null后执行，在实例化之后执行
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("执行了postProcessAfterInstantiation");
        return true;
    }

    //postProcessAfterInstantiation返回true执行，修改属性值
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("执行了postProcessPropertyValues");
        return pvs;
    }

    // 在postProcessPropertyValues之后执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行了postProcessBeforeInitialization");
        return bean;
    }
    //在对象初始化后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行了postProcessAfterInitialization");
        return bean;
    }
}
