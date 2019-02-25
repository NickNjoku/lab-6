
public class Rectangle extends Polygon {

	private double height;
	private double width;
	
	
	public Rectangle(String id, double height, double width) 
	{
		super(id);
		
		this.height = height;
		this.width = width;
		
		sideLengths.add(height * 2);
		sideLengths.add(width * 2);
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
