package homework.chapter4;

public class Ternary {

    public static void main(String[] args) {

        int i, k;
        i = 10;
        k = i < 0 ? -i : i;

        System.out.println(i + " հավասար " + k);

        i = -10;
        k = i < 0 ? -i : i;

        System.out.println(i + " հավասար " + k);
    }
}
