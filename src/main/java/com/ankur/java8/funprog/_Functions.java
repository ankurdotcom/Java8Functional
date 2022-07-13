package com.ankur.java8.funprog;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {
        System.out.println(incrementByOne(3));
        System.out.println(incrementByOne(4));
        System.out.println(incrementByOne.apply(2));

        System.out.println(multiplyBy10.andThen(incrementByOne).apply(5));
        System.out.println(incrementByOne.andThen(multiplyBy10).apply(5));

        System.out.println(incrementAndMultiplyBy.apply(10,2));

        System.out.println(incrementAndMultiplyBy.andThen(incrementByOne).apply(10,2));

        // Nesting of BiFunction in andThen in not allowed, Because its expecting two value as input, but we always
        // return single value
        // System.out.println(incrementByOne.andThen(incrementAndMultiplyBy).apply(1));
        //System.out.println(incrementAndMultiplyBy.andThen(incrementAndMultiplyBy).apply(1));
    }

    static int incrementByOne(int num) {
        return num + 1;
    }

    static Function<Integer, Integer> incrementByOne = integer -> integer + 1;

    static Function<Integer, Integer> multiplyBy10 = integer -> integer * 10;

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBy = (integer, integer2) -> ++integer * integer2;
}
