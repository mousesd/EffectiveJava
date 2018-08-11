package net.homenet.rule02;

public class AppMain {
    public static void main(String[] args) {
        NutritionFact cocaCola = new NutritionFact.Builder(240, 8)
            .setCalories(100)
            .setSodium(35)
            .setCarbohydrate(27)
            .Build();

        System.out.println(cocaCola);
    }
}
