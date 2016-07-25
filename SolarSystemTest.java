import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SolarSystemTest {

  SolarSystem solarsystem;
  Planet planet;

  @Before
  public void setup() {
    solarsystem = new SolarSystem("Sol", 4.5, 100, 250);
    planet = new Planet();
  }

  @Test
  public void hasName() {
    SolarSystem solarsystem2 = new SolarSystem("Home");
    assertEquals("Home", solarsystem2.getName());
  }

  @Test
  public void canTakePlanet() {
    solarsystem.take(planet);
    assertEquals(1, solarsystem.planetsCount());
  }

  @Test
  public void tooManyPlanets() {
    for(int i=0; i<9; i++) {
      solarsystem.take(planet);
    }
    assertEquals(8, solarsystem.planetsCount());
  }

  @Test
  public void hasAge() {
    assertEquals(4.5, solarsystem.getAge(), 0.1);
  }

  @Test
  public void hasWeight() {
    assertEquals(100, solarsystem.getWeight(), 0.1);
  }

  @Test
  public void hasWidth() {
    assertEquals(250, solarsystem.getWidth(), 0.1);
  }

  @Test
  public void isDestroyed() {
    solarsystem.destroyed();
    assertEquals(0, solarsystem.planetsCount());
  }

}
