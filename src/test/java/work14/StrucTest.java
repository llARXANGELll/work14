package work14;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
//import static org.hamcrest.MatcherAssert.assertThat;

public class StrucTest {

    @Test
    public void aser() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 7);
        List<Integer> numbers2 = Arrays.asList(33, 43, 52, 64365, 36, 63);
        int max = Struc.findMax(numbers);
        int max2 = Struc.findMax(numbers2);
        assertThat(max).isEqualTo(7);
        assertThat(max2).isEqualTo(64365);

    }


//    @Test //так нифига и не понялкак с ними работать. На уроках не показали, за то дз дали по ним... :(
//    public void hamc(){
//        String one = "один";
//        String two = "Два";
//        assertThat(one)
//    }
}
