package telran.array.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.array.ArraysInt;
import telran.array.InterviewTasks;

import static telran.array.MatricesInt.*;

class MatricesTest {

	@Test
	void multiplyConstantTest()
	{
		int [][] src = {{1,10,20},{30,10,15}};
		int [][] expected = {{2,20,40},{60,20,30}};
		assertArrayEquals(expected, multiplyConstant(2,src));
	}
	@Test
	void getColumnTest()
	{
		int [][] src = {{1,10,20,50},{30,10,15,34}};
		int [] expected = {50,34};
		assertArrayEquals(expected, getColumn(src, 3));
		int [] expected2 = {10,10};
		assertArrayEquals(expected2, getColumn(src, 1));
	}
	@Test
	void getTranspMatrixTest()
	{
		int [][] src = {{1,10,20},{30,10,15}};
		int [][] expected = {{1,30},{10,10},{20,15}};
		assertArrayEquals (expected, transpMatrix(src));
		int [][] src1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] expected1 = {{1,4,7},{2,5,8},{3,6,9}};
		assertArrayEquals (expected1, transpMatrix(src1));
	}
	@Test
	void getMaxWithNegativeTest() {
	short[] array = {1, 1, 1,-1, 20,100,200, 100-100,-100,-20,-40, 80};
	short[] array1 = {-40, 1,-40,-6, 2, 3, 40};
	short[] array2 = {40, 1, 2, 3, 40,-30};
	assertEquals(100, InterviewTasks.getMaxWithNegativePresentation(array));
	assertEquals(40, InterviewTasks.getMaxWithNegativePresentation(array1));
	assertEquals(-1, InterviewTasks.getMaxWithNegativePresentation(array2));
	}
	
	@Test
	void sortTest()
	{
//		short N_ELEMENTS = 100;
//		short array [] = new short [N_ELEMENTS];
//		for (short i = 0; i < array.length; i++) 
//		{
//			short num = (short)(Math.random() * Short.MAX_VALUE);
//		}
		short [] array = {1,2,3,3,4,4,5,6,9,8,7};
		int index = ArraysInt.getRandomInt(0,10);
		InterviewTasks.sort(array);
		assertTrue(array[index] <= array[index+1]);
		index = ArraysInt.getRandomInt(0,10);
		assertTrue(array[index+1] >= array[index]);
	}
	

}
