package ua.od.hillel;

public class Fish extends Animal {
    public Fish(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public static String getVoice() {
        return "...";
    }
}
