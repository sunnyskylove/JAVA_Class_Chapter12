package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. Map 의 자료구조에 대해 이해하고 hashmap 을 이용할 수 있다. */
        /* 필기.
        *   Map 인터페이스의 특징
        *   Collection 인터페이스 와는 다른 저장 방식을 가진다.
        *   # 키(key) 와 값(value) 를 하나의 쌍으로 저장하는 방식을 사용한다.
        *
        * 필기.
        *  키(key) 란?
        *  값(value) 를 찾기 위한 이름 역할을 하는 객체를 의미한다.
        *  1. 요소의 저장 순서를 유지하지 않는다.
        *  2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
        *
        * 필기.
        *  HashMap, HashTable, TreeMap 등이 대표적인 클래스이다.
        *  HashMap 이 가장 많이 쓰인다.
        * */

        HashMap hmap = new HashMap();   // 모든타입을 key와 value으로 사용할 수 있다. 특정 없을땐, <Object>로 생성한다.

//        Map hmap2 = new HashMap();
//        List list = new ArrayList<>();

        // 키와 값 쌍으로 저장한다.
        // 키와 값 둘 다 반드시 객체여야 한다.
        hmap.put("one", new Date());
        hmap.put(12,"red apple");
        hmap.put(33, 123);
        //autoBoxing 처리 됨 : 12 => new Integer(12)

        System.out.println("hmap = " + hmap);   //랜덤순서로 한줄로 출력됨...

        hmap.put(12,"fine apple");
        System.out.println("hmap = " + hmap);

        hmap.put(11,"fine apple");
        System.out.println("hmap = " + hmap);
        
        hmap.remove(11);
        System.out.println("hmap = " + hmap);

        System.out.println("키 12번에 대한 객체 : " + hmap.get(12));

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one", "java");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");
        System.out.println("hmap2 = " + hmap2);

    }

}