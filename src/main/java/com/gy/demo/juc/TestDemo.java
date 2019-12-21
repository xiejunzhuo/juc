package com.gy.demo.juc;

import javafx.scene.effect.SepiaTone;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public class TestDemo {

    public void SetString(String str){
        str = "xxx";
    }

    public static void main(String[] args) {
      /*  User zs = new User("zhangsan",23);
        User ls = new User("lisi",24);
        AtomicReference atomicReference = new AtomicReference(User.class);
        atomicReference.set(zs);
        System.out.println(atomicReference.compareAndSet(zs, ls)+"\t"+atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(zs, ls)+"\t"+atomicReference.get().toString());
       // new HashSet<>().add()

        List lit = new CopyOnWriteArrayList(new ArrayList());
        Set set = new CopyOnWriteArraySet(new HashSet());
        Map map = new ConcurrentHashMap();
*/
        TestDemo ss = new TestDemo();

      String str = new String ("adbb");
        ss.SetString(str);
       System.out.println(str);

    }

    class Person {
        private int age;
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
