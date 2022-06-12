package com.gongzhy.test;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 静态工厂方法测试
 */
public class StaticFactoryMethodTest {

    public static void main(String[] args) {
        List<String> test = Stream.of("","").collect(Collectors.toList());

    }
}
