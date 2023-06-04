package telran.array;

import java.util.Arrays;
import java.util.Random;


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
	if (index >= 0 && index <= array.length-1)
	{int [] res = new int[array.length-1];
	System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index+1, res, index, res.length - index);
	return res;}
	int [] fail = {};
	return fail;
}

public static int [] insertNumberSorted (int[] ar, int number)
{
	Arrays.sort(ar);
	int index = Arrays.binarySearch(ar, number);
	if (index<0) 
	{index =  -index-1;}	
	return insertNumber(ar, index, number);	
}

	public static int searchNumber(int[] array, int number)
	{
		int index = 0;
		while(index < array.length && array[index] != number)
		{index++;}
		return index<array.length? index: -1;
	}
	 
	public static int binarySearchNumber (int [] array, int number)
	{
		int left = 0;
		int rigth = array.length-1;
		int middle = rigth/2;
		while(left <= rigth && array[middle] != number)
		{
			if (number < array[middle])
			{
				rigth = middle -1;
			}
			else 
			{
				left = middle + 1; 
			}
			middle = (left+rigth)/2;
		}
		return left<= rigth ? middle : -1;	
	}
	
	public static void quickSort(int [] array)
	{
		Arrays.sort(array);
	}
	public static void bubbleSort(int [] array)
	{
		int length =  array.length;
		boolean flSorted = false;
		do {
			length --;
			flSorted = true;
			for(int i = 0; i < length; i++)
			{
				if (array[i] > array[i+1])
				{
					swap(array, i, i+1);
					flSorted = false;
				}
			}
		}
		while(!flSorted);
	}
	private static void swap(int[] array, int i, int j) 
	{
		int temp = array[i];
		array[i]= array[j];
		array[j] = temp;	
	}
	
	public static int getRandomInt(int min, int max) {
	    Random gen = new Random();
	    return gen.nextInt((max - min) + 1) + min;
	}
	
	public static int newBinarySearchNumberStandart (int [] array, int number)
	{
		int index = Arrays.binarySearch(array,  number);
		if (index > 0) {
	            while (index > 0 && array[index - 1] == number) 
	            {
	                index--;
	            }
		}
		return index;
	}
	
		public static int newBinarySearchNumberOur (int [] array, int number)
		{
			int left = 0;
			int rigth = array.length-1;
			int middle = rigth/2;
			int index = 0;
			boolean flagOfEqual= false;
			while(rigth>=left )
			{
				if (array[middle]==number)
				{
					flagOfEqual= true ;
				}
				if (array[middle] < number)
				{
					left = middle + 1;
				}
				else 
				{
					rigth = middle - 1; 
				}
				middle = (left+rigth)/2;
			}
			if (left>rigth)
				{index = -left-1;}
			return flagOfEqual? -index-1:index ;	
		}
}
