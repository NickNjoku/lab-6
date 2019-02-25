
public class Rectangle extends Polygon {

	private double height;
	private double width;
	
	
	public Rectangle(String id, double height, double width) 
	{
		super(id);
		
		this.height = height;
		this.width = width;
	}
	
	
	@Override 
	public double getArea()
	{
		double area = width * height;
		
		return area;
	}
	
	
	
	public String getShapeType()
	{
		return "Rectangle";
	}

}
