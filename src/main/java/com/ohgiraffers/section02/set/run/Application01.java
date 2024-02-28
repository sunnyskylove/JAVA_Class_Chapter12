package com.ohgiraffers.section02.set.run;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 HashMap을 이용할 수 있다.*/
        /* 필기.
         *   Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
         *   1. 요소의 저장 순서를 유지하지 않는다.
         *   2. 같은 요소의 중복 저장을 허용하지 않는다.
         *
         * 필기.
         *  HashSet 클래스
         *  Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
         * */

        HashSet<String> hset = new HashSet<>();   //HashSet = Set 둘다 작성 가능

        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");
        System.out.println("hset = " + hset);       // 순서없이 무작위로 출력된다.

        hset.add("java");
        System.out.println("hset = " + hset);       // 첫번째 무작위 출력값과 동일하게 출력된다.
                                                    // "java" 가 추가되었어도 동일한 값이기 때문에 중복으로 출력되지 않는다.


        System.out.println("포함하고 있는지? : " + hset.contains("mysql")); // 포함 확인



        /* 목차. 1. toArray() : 배열로 바꿈 */
        Object[] arr = hset.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);    // 순서 없음, 출력본이 원래 순서는 아님!!
        }


        /* 목차. 2. iterator() 로 목록을 만들어 연속 처리*/
        Iterator<String> iter = hset.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }



    }

}
