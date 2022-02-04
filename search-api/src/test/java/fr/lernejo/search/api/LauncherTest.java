package fr.lernejo.search.api;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class LauncherTest {

    @Test
    void main_terminates_before_20_sec() {
        assertTimeoutPreemptively(
            Duration.ofSeconds(20L),
            () -> Launcher.main(new String[]{}));
    }

}
