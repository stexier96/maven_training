package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_add() {
        Sample sample = new Sample();
        int result = sample.op(ADD, 5,7);
        Assertions.assertThat(result)
            .as("5 + 7")
            .isEqualTo(12);
    }

    @Test
    void op_mult() {
        Sample sample = new Sample();
        int result = sample.op(MULT, 5,7);
        Assertions.assertThat(result)
            .as("5 * 7")
            .isEqualTo(35);
    }

    @Test
    void fact() {
        Sample sample = new Sample();
        int result = sample.fact(4);
        Assertions.assertThat(result)
            .as("factoriel de 4")
            .isEqualTo(24);
    }

    @Test
    void fact_of_0_should_equal_1() {
        Sample sample = new Sample();
        int result = sample.fact(0);
        Assertions.assertThat(result)
            .as("factoriel de 0")
            .isEqualTo(1);
    }

    @Test
    void fact_a_negative_should_throw() {
        Sample sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(()->sample.fact(-4))
            .withMessage("N should be positive");
    }
}
