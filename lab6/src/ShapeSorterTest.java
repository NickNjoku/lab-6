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
		//Shape c = new Square("test3", 3);
		//Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		//sorter.addShape(c);
		//sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		//Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		//Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("Rectangle1", 10.0, 5.0);
		Shape b = new EquilateralTriangle("Triangle1", 8.0);
		Shape c = new Circle("Circle1", 5.8);
		Shape d = new Trapezoid("Trapezoid1", 8.0, 4.0,10.0, 20.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		
		Assert.assertEquals("Shape in wrong order.","Rectangle1, Triangle1, Circle1, Trapezoid1", sorter.toString());
		
		
		
		
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("Rectangle1", 10.0, 5.0);
		Shape b = new EquilateralTriangle("Triangle1", 8.0);
		Shape c = new Circle("Circle1", 5.8);
		Shape d = new Trapezoid("Trapezoid1", 8.0, 4.0,10.0, 20.0);
		
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		
		
	}
}
