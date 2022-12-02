package com.example.test4;

public class PersonTest {
    class Person {
        // 멤버 필드
        private String name;
        private int age;

        // 생성자
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 게터와 세터
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
    }
}
