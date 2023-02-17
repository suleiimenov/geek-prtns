package com.example.geekprtn;

import com.example.geekprtn.utils.Generator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GeneratorTest {

    @Test
    void generate_whenStartValue() {
        String str = "a0a0";
        String actual = Generator.generate(str);
        String expected = "a0a1";
        assertEquals(expected, actual);
    }

    @Test
    void generate_whenLargeValue() {
        String str = "a0a0z9a9r9v9d9w9v9d9n9h9";
        String actual = Generator.generate(str);
        String expected = "a0a0z9a9r9v9d9w9v9d9n9i0";
        assertEquals(expected, actual);
    }

    @Test
    void generate_whenBorderValue() {
        String str = "z9z9z9";
        String actual = Generator.generate(str);
        String expected = "a0a0a0a0";
        assertEquals(expected, actual);
    }
}
