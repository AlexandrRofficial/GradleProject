package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();

        Person person = new Person("Oleksandr", "Rybalka");

        String json = gson.toJson(person);

        System.out.println(json);
    }
}

class Person {
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}