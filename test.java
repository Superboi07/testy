import java.util.ArrayList;

public class test {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> huh = new ArrayList<>();
        ArrayList<Integer> hi = new ArrayList<>();
        ArrayList<Integer> hi2 = new ArrayList<>();
        huh.add(hi);
        huh.add(hi2);
        huh.add(hi);
        hi.add(4);
        System.out.println(huh.get(0).get(0));
    }
}