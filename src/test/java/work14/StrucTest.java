package work14;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions.*;

public class StrucTest {

    @Test
    public void ase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int max = Struc.findMax(numbers);


    }
}
