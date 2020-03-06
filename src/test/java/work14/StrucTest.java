package work14;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class StrucTest {

      @Test
      public void personTest (){
          List<String> prof = Arrays.asList("Pety", "Coly");
          Person ivan = new Person("Иван", 45 , prof);
          assertThat(ivan)
                  .as("Иван")
                  .hasFieldOrProperty("name")
                  .hasFieldOrProperty("age")
                  .isInstanceOf(Person.class)
                  .hasFieldOrPropertyWithValue("name", "Иван")
                  .hasFieldOrPropertyWithValue("age", 45);


  }
}
