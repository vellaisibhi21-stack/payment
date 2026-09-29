package dev.lanesync;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet("LaneSync"));
    }
}
