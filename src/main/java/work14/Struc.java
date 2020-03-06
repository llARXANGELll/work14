package work14;

import java.util.List;

public class Struc {

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (max <current) {
                max = current;
            }
        }
        return max;
    }
}
