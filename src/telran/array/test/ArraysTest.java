package telran.array.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import telran.array.ArraysInt;

public class ArraysTest {
@Test
void initalTest() {
int[]ar1 = {1,2,3};
int[]ar2 = {1,2,3};
int[]ar2_3 =ar2;
assertFalse(ar1==ar2);
assertTrue(ar2==ar2_3);
assertArrayEquals(ar1,ar2);
ar2_3[0]=10;
ar1[0] = 10;
assertArrayEquals(ar1,ar2);

}
@Test
void copyOfIntTest() 
{
	int [] ar1 = {10, 5, 15};
	int [] expected1 = {10, 5, 15};
	int [] expected2 = {10, 5};
	int [] expected3 = {10, 5, 15, 0, 0};
	assertArrayEquals(expected1,Arrays.copyOf(ar1, 3));
	assertArrayEquals(expected2,Arrays.copyOf(ar1, 2));
	assertArrayEquals(expected3,Arrays.copyOf(ar1, 5));
}
@Test
void addNumberTest()
{
	int [] ar1 = {10, 5, 15};
	int number = 20;
	int [] expected = {10, 5, 15, number};
	assertArrayEquals(expected,ArraysInt.addNumber(ar1, number));
}
@Test
void arrayCopyTest()
{
	int [] src = {1, 2, 3, 4, 5, 6, 7};
	int [] dest = {10, 20, 30, 40, 50, 60, 70};
	int [] expected5 = {10, 20, 30, 40, 1, 2, 3};
	System.arraycopy(src, 0, dest, 4, 3);
	assertArrayEquals(expected5,dest);	
}
@Test
void insertNumberTest()
{
	int [] src = {1, 2, 3, 4, 5, 6, 7};
	int number = 20;
	int index = 3;
	int [] expected1 = {1, 2, 3, 20, 4, 5, 6, 7};
	assertArrayEquals(expected1,ArraysInt.insertNumber(src,index, number));
	number = 30;
	index = 0;
	int [] expected2 = {30, 1, 2, 3, 4, 5, 6, 7};
	assertArrayEquals(expected2,ArraysInt.insertNumber(src,index, number));
	number = 40;
	index = 7;
	int [] expected3 = {1, 2, 3, 4, 5, 6, 7, 40};
	assertArrayEquals(expected3,ArraysInt.insertNumber(src,index, number));
}
@Test
void removeNumberTest()
{
	int [] src = {1, 2, 3, 4, 5, 6, 7};
	int index = 3;
	int [] expected1 = {1, 2, 3, 5, 6, 7};
	assertArrayEquals(expected1,ArraysInt.removeNumber(src, index));
	index = 5;
	int [] expected4 = {1, 2, 3, 4, 5, 7};
	assertArrayEquals(expected4,ArraysInt.removeNumber(src, index));
	index = 0;
	int [] expected2 = { 2, 3, 4, 5, 6, 7};
	assertArrayEquals(expected2,ArraysInt.removeNumber(src, index));
	index = src.length-1;
	int [] expected3 = {1, 2, 3, 4, 5, 6};
	assertArrayEquals(expected3,ArraysInt.removeNumber(src, index));
	index = 10;
	int [] expected6 = {};
	assertArrayEquals(expected6,ArraysInt.removeNumber(src, index));
}
@Test
void binarySearchTest()
{
	int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 12, 15};
	int index = Arrays.binarySearch(ar, 1);
	assertEquals(0, index);
	index = Arrays.binarySearch(ar, 4);
	assertTrue(3 == index);
	index = Arrays.binarySearch(ar, 15);
	assertTrue(ar.length-1 == index);
	index = Arrays.binarySearch(ar, 10);
	assertTrue(0 > index);
	index = Arrays.binarySearch(ar, 11);
	assertEquals(-9, index);
}

@Test
void insertNumberSortedTest()
{
	int [] src = {1, 2, 3, 5, 6, 7};
	int number = 8;
	int [] expected1 = {1, 2, 3, 5, 6, 7, 8};
	assertArrayEquals(expected1,ArraysInt.insertNumberSorted(src, number));
	number = 5;
	int [] expected2 = {1, 2, 3, 5, 5, 6, 7};
	assertArrayEquals(expected2,ArraysInt.insertNumberSorted(src, number));
	number = 0;
	int [] expected3 = {0, 1, 2, 3, 5, 6, 7};
	assertArrayEquals(expected3,ArraysInt.insertNumberSorted(src, number));
	number = 4;
	int [] expected4 = {1, 2, 3, 4, 5, 6, 7};
	assertArrayEquals(expected4,ArraysInt.insertNumberSorted(src, number));
	number = -4;
	int [] expected5 = {-4, 1, 2, 3, 5, 6, 7};
	assertArrayEquals(expected5,ArraysInt.insertNumberSorted(src, number));
}
@Test

void maxLongTest()
{
	assertEquals(Long.MAX_VALUE,getLongMax());
}
private long getLongMax()
{
	long res = 1;
	while(res > 0)
	{res*=2;}
	return res-1;
}
@Test
void maxIntTest()
{
	assertEquals(Integer.MAX_VALUE,getIntMax());
}
private int getIntMax()
{
	int res = 1;
	while(res > 0)
	{res++;}
	return res-1;
}

@Test
void standartBinarySearchTest()
{
	int[] ar = {1, 1, 1, 2 ,2, 2, 2, 2, 2, 5, 6,};
	int number = 2;
	assertEquals(3,ArraysInt.newBinarySearchNumberStandart(ar, number));
	number = 3;
	assertEquals(-10,ArraysInt.newBinarySearchNumberStandart(ar, number));
	number =5;
	assertEquals(9,ArraysInt.newBinarySearchNumberStandart(ar, number));
}
@Test
void muchRepeatedTestBubble () 
{
	int N_ELEMENTS = 100000;
	int array [] = new int[N_ELEMENTS];
	for (int i = 0; i < array.length; i++)
	{
	    array[i] = ArraysInt.getRandomInt(0,100);
	}
	int index = ArraysInt.getRandomInt(0,99999);
	ArraysInt.bubbleSort(array);
	assertTrue(array[index] <= array[index+1]);
	index = ArraysInt.getRandomInt(0,99999);
	assertTrue(array[index+1] >= array[index]);
}

@Test
void muchRepeatedTestQuickSort () 
{
int N_ELEMENTS = 100000;
int array [] = new int[N_ELEMENTS];
for (int i = 0; i < array.length; i++) 
{
array[i] = ArraysInt.getRandomInt(0,100);
}
int index = ArraysInt.getRandomInt(0,99999);
ArraysInt.quickSort(array);
assertTrue(array[index] <= array[index+1]);
index = ArraysInt.getRandomInt(0,99999);
assertTrue(array[index+1] >= array[index]);
}

@Test
void ourBinarySearchTest()
{
	int[] ar = {1, 1, 1, 2 ,2, 2, 2, 2, 2, 5, 6,};
	int number = 2;
	assertEquals(3,ArraysInt.newBinarySearchNumberOur(ar, number));
	number = 1;
	assertEquals(0,ArraysInt.newBinarySearchNumberOur(ar, number));
	number = 1;
	assertEquals(0,ArraysInt.newBinarySearchNumberOur(ar, number));
	number =4;
	assertEquals(-10,ArraysInt.newBinarySearchNumberStandart(ar, number));
}





}

