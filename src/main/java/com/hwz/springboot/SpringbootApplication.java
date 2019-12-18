package com.hwz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;
import java.util.LinkedList;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        System.out.println("1111111111111111111111111111111111");
        System.out.println("122222222222222222222222222222222222");
        System.out.println("3333333333333333333333");

        System.out.println("<<<MMMMmmmMMMMMMMMMMMMMMMMMMM>>>>>");

        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();

            System.out.println(next);
        }

    }

}
