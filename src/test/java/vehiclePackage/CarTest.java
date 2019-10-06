package vehiclePackage;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CarTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarTest.class);
    private Vehicle testVehicle;

    @BeforeClass
    public static void carTestSetup(){
        LOGGER.info("Before all test.");
    }

    @Before
    public void testSetup(){
        LOGGER.info("Before each test.");
        testVehicle = new Car(30);
    }

    @Test
    public void testMaxSpeedIsReachable(){
        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();
        for(int i = startSpeed; i < maxSpeed; i++){
            testVehicle.increaseSpeed();
        }
      //  assertTrue(testVehicle.getCurrentSpeed() == maxSpeed);
        assertEquals(maxSpeed, testVehicle.getCurrentSpeed());

    }

    @Test (expected = Vehicle.VehicleCrashedExeption.class)
    public void testMaxSpeedCannotBeExcedeed(){
        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();
        for(int i = startSpeed; i <= maxSpeed; i++){
            testVehicle.increaseSpeed();
        }
    }

    @After
    public void testCleanup(){
        LOGGER.info("After each test.");
    }

    @AfterClass
    public static void finalizeTestingProgram(){
        LOGGER.info("Finalizing testing program");
    }
}
