package cn.tjuscs.st;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class TriangleTest {
	private int sideA;
	private int sideB;
	private int sideC;
	private String expected;
	private Triangle triangle = null;
	
	public TriangleTest(int sideA, int sideB, int sideC, String expected){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.expected = expected;
	}
	
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
	}

	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{3, 3, 3, "equilateral"},
			{4, 4, 5, "isosceles"},
			{3, 4, 5, "scalene"}
		});
	}
	
	@Test
	public void testIdentifyTriangle() {
		//fail("Not yet implemented");
		assertThat(this.expected, equalTo(triangle.identifyTriangle(sideA, sideB, sideC)));
		/*
		assertThat("equilateral", equalTo(triangle.identifyTriangle(3, 3, 3)));
		assertThat("isosceles", equalTo(triangle.identifyTriangle(3, 3, 4)));
		assertThat("scalene", equalTo(triangle.identifyTriangle(3, 4, 5)));
		*/
	}

}
