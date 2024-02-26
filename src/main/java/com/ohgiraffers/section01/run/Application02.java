package com.ohgiraffers.section01.run;

import java.util.LinkedList;
import java.util.List;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. LinkedList 에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *   LinkedList
        *   ArrayList 가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안됨.
        *   내부는 이중 연결 리스트로 되어있다.
        *
        *  필기.
        *   이중 연결 리스트
        *   : 단일 연결 리스트는 다음 요소만 링크(주소 참조)하는 반면 이중 연결 리스트는
        *     이전 요소도 링크하여 이전 요소로 접근한기 쉽게 고안된 자료구조이다.
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");
        System.out.println(linkedList.size());                      // >>5개

        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(i + " : " + linkedList.get(i));      //>>인덱스 순서대로 5개가 연달아 출력됨
        }

        // 삭제
        linkedList.remove(1);                   // 1번째 인덱스 삭제
        System.out.println(linkedList);

        // 변경
        linkedList.set(0,"pineapple");              // 0번째 인덱스를 파인애플로 변경후 출력
        System.out.println(linkedList);

        // 비었니? 물음
        System.out.println(linkedList.isEmpty());       // 비어있는지 확인(boolean 타입으로 나옴)

        // 비우기~!!
        linkedList.clear();                             // 안에 있는 요소들 모두 비워두는 것
        System.out.println(linkedList.isEmpty());       //>> 위에 비움명령후에 비었는지 확인 출력



    }
}
