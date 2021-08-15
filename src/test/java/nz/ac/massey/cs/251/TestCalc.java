package nz.ac.massey.cs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jdk.internal.jline.internal.TestAccessible;

/**
 * Unit test for simple App.
 */
public class TestCalc
{
	private final Calc calc = new Calc();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAddPositives()
    {
        assertEquals(5, calc.add(3, 2));
    }
	
	@Test
	public void shouldAddNegatives()
	{
		assertEquals(-5, calc.add(-3, -2));
	}

    @Test
    public void shouldSubtractPositives()
    {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void shouldSubtractNegatives()
    {
        assertEquals(-2, calc.subtract(-5, -3));
    }
}