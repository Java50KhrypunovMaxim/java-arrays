package telran.array;

import java.util.Arrays;

public class ArraysInt 
{
public static int [] addNumber( int [] array, int number)
{
	int[] res = Arrays.copyOf(array, array.length + 1);
	res [array.length] = number;
	return res;
}
public static int [] insertNumber(int[] array, int index, int number)
{
	int [] res = new int[array.length+1];
	System.arraycopy(array,0, res, 0, index);
	res[index]= number;
	System.arraycopy(array, index, res, index+1, array.length-index);		
	return res;	
}
public static int [] removeNumber (int[] array, int index)
{
	int [] res = new int[array.length-1];
	if (index == 0)
	{System.arraycopy(array, index+1 , res, 0, res.length);}
	else if  (index == array.length-1)
	{System.arraycopy(array, 0 , res, 0, res.length);}
	else
	{System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index+1, res, index, res.length - index);}	
	return res;	
}

public static int [] insertNumberSorted (int[] ar, int number)
{
	Arrays.sort(ar);
	int index = Arrays.binarySearch(ar, number);
	if (index<0) 
	{index =  -index-1;}
	int [] res = new int[ar.length+1];
	System.arraycopy(ar, 0, res, 0, index);
	res[index]= number;
	System.arraycopy(ar, index, res, index+1, ar.length-index);		
	return res;	
}
	
}
