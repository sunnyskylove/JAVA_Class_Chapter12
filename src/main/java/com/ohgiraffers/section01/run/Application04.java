package com.ohgiraffers.section01.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. Queue 에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *   Queue 는 선형 메모리 공간에 데이터를 저장하는
        *   선입선출(FIFO - First in First out)
        *   Queue 는 인터페이스이기 때문에 대부분 LinkedList 로 인스턴스를 생성한다.
        * */

         Queue<String> que = new LinkedList<>();

         /* Queue 에 데이터를 넣을 때는 offer() 를 이용한다. */
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);     // 차례대로 배열처럼 다 나옴

        /* 필기.
        *   큐에서 데이터를 꺼내는 방식
        *   peek() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소) 를 반환___처음 것을 조회만 한다.
        *   poll() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소) 를 반환 후 제거___처음 것을 조회후 삭제한다.
        * */

        System.out.println("peek() : " + que.peek());
        System.out.println("peek() : " + que.peek());
        System.out.println("que : " + que);                // >>조회이기 떄문에 first 만 2번 출력된다.

        System.out.println("poll() : " + que.poll());       //>>first
        System.out.println("poll() : " + que.poll());       //>>second
        System.out.println("que : " + que);                //>> 남은것은 2번째까지 삭제되고 나머지 3개만 나옴





    }
}
