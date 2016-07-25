class SolarSystem {
  private String name;
  private double age;
  private double weight;
  private double width;
  private Planet[] planets;
  private int planetCount;

  public SolarSystem(String name) {
    this.name = name;
    this.planets = new Planet[8];
    planetCount = 0;
  }

  public SolarSystem(String name, double age) {
    this.name = name;
    this.age = age;
    this.planets = new Planet[8];
    planetCount = 0;
  }

  public SolarSystem(String name, double age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.planets = new Planet[8];
    planetCount = 0;
  }

  public SolarSystem(String name, double age, double weight, double width) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.width = width;
    this.planets = new Planet[8];
    planetCount = 0;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAge() {
    return this.age;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getWidth() {
    return this.width;
  }

  public void take(Planet planet) {
    if (isPlanetsFull()) return;
    planets[planetCount] = planet;
    planetCount++;
  }

  public int planetsCount() {
    return planetCount;
  }

  public boolean isPlanetsFull() {
    return (planetCount >= planets.length);
  }

  public void destroyed() {
    for(int i = 0; i<planets.length; i++) {
      planets[i] = null;
    }
    planetCount = 0;
  }

}
