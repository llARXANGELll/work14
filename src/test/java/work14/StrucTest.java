package work14;

import org.assertj.core.util.Arrays;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.List;

public class StrucTest {

      @Test
      public void personTest (){
          List<String> prof = Arrays.asList("Водитель","Инженер");

          Person pety = new Person("Петя", 2,"Водитель" );

  }
}
