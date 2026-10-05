import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testApplicationMessage() {

        String message = "Hello from Jenkins + GitHub CI/CD Project!";

        assertEquals(
                "Hello from Jenkins + GitHub CI/CD Project!",
                message
        );
    }
}