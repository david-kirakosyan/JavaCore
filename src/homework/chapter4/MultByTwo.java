package homework.chapter4;

public class MultByTwo {

    public static void main(String[] args) {

        int num = 0xFFFFFFE;
        for (int i = 0; i < 4; i++) {
            num <<= 1;
            System.out.println(num);
        }
    }
}
