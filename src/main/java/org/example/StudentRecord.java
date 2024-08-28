package org.example;

public record StudentRecord(
        String id,
        String firstName,
        String lastName,
        int age) {
    public void sayHello() {
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}
