class Triangle extends Shape {
	private double base;
	private double height;

	// default constructor 
  public Triangle() {}

	public Triangle(String color, boolean filled, double base, double height) {
		super(color, filled);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

  @Override
  public double getArea() {
    return base*height/2;
  }
}
