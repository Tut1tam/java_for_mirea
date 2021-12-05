enum Planet {
    Mercury(3, 2440),
    Venus(41,6052),
    Earth(60,6378),
    Mars(6, 3397),
    Jupiter(20000,71490),
    Saturn(5000,60270),
    Uranus(800,25560),
    Neptune(1000,24760);
    public int mass;
    public int radius;
    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }
}
