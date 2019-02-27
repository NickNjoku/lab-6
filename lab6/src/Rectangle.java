
public class Rectangle extends Polygon {

	private double height;
	private double width;
	
	/**
	 * Rectangle constructor. A rectangle is a four sided polygon where the width on both sides are the same as one another
	 * and the lengths on both sides are the same as one another.
	 * 
	 * @param id
	 * @param height
	 * @param width
	 */
	public Rectangle(String id, double height, double width) 
	{
		super(id);
		
		this.height = height;
		this.width = width;
		
		//Adds the two  height sides of the Rectangle and adds the two width sides of the Rectangle
		sideLengths.add(height);
		sideLengths.add(height);
		sideLengths.add(width);
		sideLengths.add(width);
	}
	
	/**
	 * Gets the area of Rectangle
	 * Formula for a Rectangle is Length * Width (Height * Width)
	 * 
	 */
	@Override 
	public double getArea()
	{
		// Computes the Area and returns the value
		double area = width * height;
		
		return area;
	}
	
	/**
	 * Gets the type of the shape
	 */
	@Override
	public String getShapeType()
	{
		return "Rectangle"; 
	}

}
