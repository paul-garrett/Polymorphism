abstract class Shape {
	private String color;
	private boolean filled;

	// default constructor
  public Shape() {}
  //   public double getArea() {
  //     return 0;
  //   }
  // }

  // Super Constructor
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public boolean getFilled() {
		return filled;
	}

  abstract double getArea();
}
