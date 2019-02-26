import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for shapes and their comparators.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeTest
{
	//==================================================================================================================
	// Basic Shape Testing:
	//==================================================================================================================
    /**
     * Tests for the square class.
     */
	@Test
	public void SquareTest()
	{
		//Creates Shape object, Rectangle
		Shape sqr = new Square("Square1", 3.0);
		
		//Checks to see Area, Perimeter, Shape Type, and Shape ID are correct
		Assert.assertEquals("Square area incorrect.", 9.0, sqr.getArea(), 0.0001);
		Assert.assertEquals("Square perimeter incorrect.", 12.0, sqr.getPerimeter(), 0.0001);
		Assert.assertEquals("Square type incorrect.", "Square", sqr.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Square1", sqr.getId());
	}

	/**
     * Tests for the rectangle class.
     */
	@Test
	public void RectangleTest()
	{
		// TODO: complete this...
		
		//Creates Shape object, Rectangle
		Shape Rec = new Rectangle("Rectangle1", 4.0, 5.0);
		
		//Checks to see Area, Perimeter, Shape Type, and Shape ID are correct
		Assert.assertEquals("Rectangele area incorrect.", 20.0, Rec.getArea(), 0.0001);
		Assert.assertEquals("Rectangle perimeter incorrect.", 18.0, Rec.getPerimeter(), 0.0001);
		Assert.assertEquals("Rectangle type incorrect. ", "Rectangle", Rec.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Rectangle1", Rec.getId());
	}

	/**
     * Tests for the EquilateralTriangle class.
     */
	@Test
	public void TriangleTest()
	{
		// TODO: complete this...
		
		//Creates Shape object, Triangle
		Shape Tri = new EquilateralTriangle("Triangle1", 8.0);
		
		//Checks to see Area, Perimeter, Shape Type, and Shape ID are correct
		Assert.assertEquals("Triangle area incorrect.", 27.71281, Tri.getArea(), 0.0001);
		Assert.assertEquals("Triangle perimeter incorrect.", 24.0, Tri.getPerimeter(), 0.0001);
		Assert.assertEquals("Triangle type incorrect. ", "Equilateral Triangle", Tri.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Triangle1", Tri.getId());
		
	}

	/**
     * Tests for the trapezoid class. Also test that IDs are done correctly.
     */
	@Test
	public void TrapezoidTest()
	{
		// TODO: complete this...
		
		// Creates Shape object, Trapezoid
		Shape Trap = new Trapezoid("Trapezoid1", 10.0, 15.0, 35.0, 20.0);
		
		//Checks to see Area, Perimeter, Shape Type, and Shape ID are correct
		Assert.assertEquals("Trapezoid area incorrect.", 259.27248, Trap.getArea(), 0.0001);
		Assert.assertEquals("Trapezoid perimeter incorrect.", 80.0, Trap.getPerimeter(), 0.0001);
		Assert.assertEquals("Trapezoid type incorrect. ", "Trapezoid", Trap.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Trapezoid1", Trap.getId());
		
		
	}

	/**
     * Tests for the ellipse class. Also test that IDs are done correctly.
     */
	@Test
	public void EllipseTest()
	{
		Shape circ = new Ellipse("Ellipse1", 3.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(3, 2) + Math.pow(3, 2)) / 2),
				circ.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse1", circ.getId());

		Shape circs = new Ellipse("Ellipse2", 5.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3*5, circs.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(5.0, 2) + Math.pow(3.0, 2)) / 2),
				circs.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse2", circs.getId());
	}

	/**
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	@Test
	public void CircleTest()
	{
		// TODO: complete this...
		
		// Creates Shapes object, Circle
		Shape circ = new Circle("Circle1", 5.0);
		
		//Checks to see Area, Perimeter, Shape Type, and Shape ID are correct
		Assert.assertEquals("Circle area incorrect.", Math.PI * 5.0 * 5.0, circ.getArea(), 0.0001);
		Assert.assertEquals("Circle perimeter incorrect.", 2 *Math.PI * 5.0, circ.getPerimeter(), 0.0001);
		Assert.assertEquals("Circle type incorrect.", "Circle",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle1", circ.getId());
		
	}

	/**
	 * Tests for Shape's toString().
	 * Format of toString :"%s\t ID = %s\t area = %.3f\t perimeter = %.3f"
	 */
	@Test
	public void ShapeToStringTest()
	{
		// TODO: complete this...
		
		//Test toString output
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		Shape trap = new Trapezoid("T1", 10.0, 12.0, 15.0, 20.0);
		
		// Checcks to see Strings are being outputted correctly. error if it does match.
		Assert.assertEquals("Rectangle\t ID = R1\t area = 9.000\t perimeter = 12.000", rect.toString());
		Assert.assertEquals("Square\t ID = S1\t area = 9.000\t perimeter = 12.000", sqr.toString());
		Assert.assertEquals("Trapezoid\t ID = T1\t area = 171.812\t perimeter = 57.000", trap.toString());


		
	}

	//==================================================================================================================
	// Comparisons:
	//==================================================================================================================
	/**
     * Tests for the Shape Area Comparator class.
     */
	@Test
	public void CompareAreaTest()
	{
	    // Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapeAreaComparator sc = new ShapeAreaComparator();
		Assert.assertEquals("ShapeAreaComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapeAreaComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
     * Tests for the Shape Perimter Comparator class.
     */
	@Test
	public void ComparePerimeterTest()
	{
		// TODO: complete this...
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		// Test unequal perimeter:
		Shape rect = new Rectangle("R1", 5.0,4.0);
		Shape sqr = new Square("S1", 3.0);
		Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1 ,sc.compare(rect, sqr));
		Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(sqr, rect));
		Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr, rect));
		 
		//Test equal Perimeters
		Shape rect2 = new Rectangle("R1", 3.0,3.0);
		Shape sqr2 = new Square("S1", 3.0);
		Assert.assertEquals("ShapePerimeterComparator should find shapes equal.", 0, sc.compare(rect2, sqr2));
		Assert.assertTrue("ShapePerimeterComparator should find shapes equal.", sc.equals(rect2,sqr2));
		
	}

	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
	@Test
    public void NaturalCompareTest()
    {
		// TODO: complete this...
		//Create new shape objects
		Shape rect = new Rectangle("R1", 5.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		Shape sqr2 = new Square("S2", 3.0);
		Shape trap = new Trapezoid("T1", 10.0, 12.0, 15.0, 20.0);
		
		//Test when object comparing to other shape object is bigger
		Assert.assertEquals(1, rect.compareTo(sqr));
		//Test when object comparing to other shape object is smaller
		Assert.assertEquals(-1, sqr.compareTo(rect));
		Assert.assertEquals(1, rect.compareTo(sqr));
		//Test when things being compared equals each other 
		Assert.assertEquals(0, sqr.compareTo(sqr2));
		
		
    }
}
