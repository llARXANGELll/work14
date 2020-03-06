package work14;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.*;
public class StrucTest {

    @Test
    public void personTest() {
        List<String> prof = Arrays.asList("Грузчик", "Водитель", "Инженер");
        Person ivan = new Person("Иван", 45, prof);
        assertThat(ivan)
                .as("Иван")
                .hasFieldOrProperty("name")
                .hasFieldOrProperty("age")
                .isInstanceOf(Person.class)
                .hasFieldOrPropertyWithValue("name", "Иван")
                .hasFieldOrPropertyWithValue("age", 45);

        assertThat(ivan.getProf())
                .contains("Грузчик")
                .containsExactlyInAnyOrder("Водитель", "Инженер");


    }
}
