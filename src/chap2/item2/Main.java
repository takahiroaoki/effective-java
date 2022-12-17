package chap2.item2;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts1 = new NutritionFacts.Builder(1, 1).build();
        System.out.println(nutritionFacts1.getServingSize());
        System.out.println(nutritionFacts1.getServings());
        System.out.println(nutritionFacts1.getCalories());
        System.out.println(nutritionFacts1.getFat());
        System.out.println(nutritionFacts1.getSodium());
        System.out.println(nutritionFacts1.getCarbohydrate());

        NutritionFacts nutritionFacts2 = new NutritionFacts.Builder(2, 3)
                .calories(100)
                .fat(1234)
                .sodium(1)
                .carbohydrate(123)
                .build();
        System.out.println(nutritionFacts2.getServingSize());
        System.out.println(nutritionFacts2.getServings());
        System.out.println(nutritionFacts2.getCalories());
        System.out.println(nutritionFacts2.getFat());
        System.out.println(nutritionFacts2.getSodium());
        System.out.println(nutritionFacts2.getCarbohydrate());
    }
}
