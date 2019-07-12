package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if (left > right) {
            return IntStream.rangeClosed(right, left).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        } else return IntStream.rangeClosed(left, right).boxed().collect(Collectors.toList());

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if (left > right) {
            return IntStream.rangeClosed(right, left).filter(e -> e % 2 == 0).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        } else return IntStream.rangeClosed(left, right).filter(e -> e % 2 == 0).boxed().collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).boxed().filter(e -> e % 2 == 0).collect(Collectors.toList());

    }

    public int popLastElment(int[] array) {

        return array[array.length-1];

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
