import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CerealRunner {
    public static void main(String[] args) throws FileNotFoundException {
        File list = new File("/workspaces/testy/CerealLab/cereal.csv");
        Scanner scan = new Scanner(list);
        ArrayList<Cereal> cereals = new ArrayList<Cereal>();
        while (scan.hasNext()) {
            Scanner temp = new Scanner(scan.nextLine());
            temp.useDelimiter(",");
            cereals.add(new Cereal(temp.next(), temp.nextDouble(), temp.nextDouble(), temp.nextDouble(),
                    temp.nextDouble(), temp.nextDouble(), temp.nextDouble(), temp.nextDouble(), temp.nextDouble()));
            temp.close();
        }
        Cereal temp = lowSugar(cereals);
        System.out.println("Cereal w/ lowest sugar is " + temp.name + " w/ a sugar content of " + temp.sugars);
        System.out.println("The average caloric content is " + avgCalories(cereals));
        temp = lowhighRating(cereals, true);
        System.out.println("Cereal w/ lowest rating is " + temp.name + " w/ a rating of " + temp.rating);
        temp = lowhighRating(cereals, false);
        System.out.println("Cereal w/ highest rating is " + temp.name + " w/ a rating of " + temp.rating);
    }

    static Cereal lowSugar(ArrayList<Cereal> list) {
        Cereal temp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (temp.sugars > list.get(i).sugars) {
                temp = list.get(i);
            }
        }
        return temp;
    }

    static double avgCalories(ArrayList<Cereal> list) {
        double temp = 0.0;
        for (Cereal c : list) {
            temp += c.calories;
        }
        temp /= list.size();
        return temp;
    }

    static Cereal lowhighRating(ArrayList<Cereal> list, boolean islow) {
        Cereal temp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (islow) {
                if (temp.rating > list.get(i).rating) {
                    temp = list.get(i);
                }
            } else {
                if (temp.rating < list.get(i).rating) {
                    temp = list.get(i);
                }
            }
        }
        return temp;
    }
}
