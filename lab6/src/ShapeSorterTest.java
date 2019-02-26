import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 * "%s\t ID = %s\t area = %.3f\t perimeter = %.3f"
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("Rect1", 10.0, 5.0);
		Shape b = new EquilateralTriangle("Tri1", 8.0);
		Shape c = new Trapezoid("Trap1", 8.0, 4.0,10.0, 20.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		
		
		Assert.assertEquals("Rectangle\t ID = Rect1\t area = 50.000\t perimeter = 30.000Equilateral Triangle\t ID = Tri1\t area = 27.713\t perimeter = 24.000Trapezoid\t ID = Trap1\t area = 45.596\t perimeter = 42.000", sorter.toString());
		
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		
		ShapeSorter sorter = new ShapeSorter();
		ShapeAreaComparator area = new ShapeAreaComparator();
		
		Shape a = new Rectangle("Rect1", 10.0, 5.0);
		Shape b = new EquilateralTriangle("Tri1", 8.0);
		Shape c = new Trapezoid("Trap1", 8.0, 4.0,10.0, 20.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		
		sorter.sortShapes(area);
		
		Assert.assertEquals("Equilateral Triangle\t ID = Tri1\t area = 27.713\t perimeter = 24.000Trapezoid\t ID = Trap1\t area = 45.596\t perimeter = 42.000Rectangle\t ID = Rect1\t area = 50.000\t perimeter = 30.000", sorter.toString());
		
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		ShapePerimeterComparator perimeter = new ShapePerimeterComparator();
		
		Shape a = new Rectangle("Rect1", 10.0, 5.0);
		Shape b = new EquilateralTriangle("Tri1", 8.0);
		Shape c = new Trapezoid("Trap1", 8.0, 4.0,10.0, 20.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		
		sorter.sortShapes(perimeter);
		
		Assert.assertEquals("Equilateral Triangle\t ID = Tri1\t area = 27.713\t perimeter = 24.000Rectangle\t ID = Rect1\t area = 50.000\t perimeter = 30.000Trapezoid\t ID = Trap1\t area = 45.596\t perimeter = 42.000", sorter.toString());

		
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("Rect1", 10.0, 5.0);
		Shape b = new EquilateralTriangle("Tri1", 8.0);
		Shape c = new Trapezoid("Trap1", 8.0, 4.0,10.0, 20.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		
		Assert.assertEquals("Rectangle\t ID = Rect1\t area = 50.000\t perimeter = 30.000Equilateral Triangle\t ID = Tri1\t area = 27.713\t perimeter = 24.000Trapezoid\t ID = Trap1\t area = 45.596\t perimeter = 42.000", sorter.toString());

	}
}
