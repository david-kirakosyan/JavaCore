package homework.chapter14;

public class Stars<T extends Number> {
    T[] nums;

    Stars(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Stars<?> ob) {
        if (average() == ob.average()){
            return true;
        }
        return false;
    }
}
