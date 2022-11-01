package race.domian;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import race.strategy.ForwardStrategy;
import race.strategy.HoldStrategy;

class CarTest {

    public static final int START_POSITION = 0;
    public static final int DISTANCE_TO_MOVE_AT_ONCE = 1;
    private static Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void getInitialLocation() {
        assertThat(car.getPosition()).isEqualTo(START_POSITION);
    }

    @Test
    void moveOnce() {
        ForwardStrategy forwardStrategy = new ForwardStrategy();
        car.move(forwardStrategy);
        assertThat(car.getPosition()).isEqualTo(DISTANCE_TO_MOVE_AT_ONCE);
    }

    @Test
    void hold() {
        HoldStrategy holdStrategy = new HoldStrategy();
        car.move(holdStrategy);
        assertThat(car.getPosition()).isEqualTo(START_POSITION);
    }
}