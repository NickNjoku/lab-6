
public class Rectangle extends Polygon {

	private double height;
	private double width;
	
	
	public Rectangle(String id, double height, double width) 
	{
		super(id);
		
		this.height = height;
		this.width = width;
	}
	
	
	
	public double getArea()
	{
		return width * height;
	}
	
	
	
	public String getShapeType()
	{
		return "Rectangle";
	}

}
