	/**
	 * Square constructor
	 * A square is a rectangle with four sides that are the same length
	 * Extension of Rectangle class 
	 * @author nicholasnjoku
	 *
	 */
public class Square extends Rectangle {
	/**
	 * Invokes constructor of superclass: Rectangle
	 * size is the length of the sides of the square. All four sides equal the same
	 * @param id
	 * @param size
	 */
	public Square(String id,double size) 
	{
		//size is put into the rectangle constructor twice for width and height since there is no difference in the length and height for a square
		super(id,size,size); 
		
	}
	/**
	 * gets type of shape
	 */
	public String getShapeType()
	{
		return "Square";
	}

}
