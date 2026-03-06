public class Cereal {
    String name;
    double calories, protein, fat, sodium, fiber, carbo, sugars, rating;
    public Cereal(String name, double calories, double protein, double fat, double sodium, double fiber, double carbo, double sugars, double rating) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbo = carbo;
        this.sugars = sugars;
        this.rating = rating;
    }

    public String toString() {
        return name + "\ncalories: " + calories  + "\nprotein: " + protein + "\nfat: " + fat + "\nsodium: " + sodium + "\nfiber: " + fiber + "\ncarbohydrates: " + carbo + "\nsugars: " + sugars + "\nrating: " + rating;
    }
}