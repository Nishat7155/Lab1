package software;

import java.util.Scanner;

public class Person {

    private String name ;
    private int age;


    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.age <0){
            age = 0;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            age=0;
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Object reverseName(String  name){
        StringBuilder NameRes = new StringBuilder();
        char[] characters= this.name.toCharArray();
        for (int i= characters.length-1; i >=0; i--){
            NameRes.append(characters[i]);
        }
        return NameRes.toString();
    }
}
