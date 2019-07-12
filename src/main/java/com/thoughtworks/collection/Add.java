package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;


public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if (leftBorder > rightBorder) {
            int tmp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tmp;
        }
       return  IntStream.range(leftBorder,rightBorder+1).filter((e)->e%2==0).sum();
    }


    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().map((e) -> e * 3 + 2).reduce(0, (x, y) -> x + y);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
      return arrayList.stream().map((e)->{
          if(e%2!=0){
              return e*3+2;
          }
          return e;
      }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {

        return arrayList.stream().filter((e)->e%2==0).collect(Collectors.averagingDouble((x)->x));
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().distinct().filter((e)->(e%2==0)).collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
