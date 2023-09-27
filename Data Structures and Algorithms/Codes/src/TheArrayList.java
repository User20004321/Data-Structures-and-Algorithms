import java.util.*;

public class TheArrayList
{
	private int[] array;
	private int usedIndicies;
	
	TheArrayList()
	{
		array = new int[10];
		usedIndicies = 0;
	}
	
	TheArrayList(int size)
	{
		if (size < 0)
		{
			array = new int[10];
		}
		else
		{
			array = new int[size];
		}
		
		usedIndicies = 0;
	}
	
	public void appendElement(int element)
	{
		if(usedIndicies >= array.length)
		{
			doubleArray();
		}
		
		array[usedIndicies] = element;
		usedIndicies++;
	}
	
	public void insertElement(int value, int index)
	{
		if(usedIndicies >= array.length)
		{
			doubleArray();
		}
		
		int[] temp = new int[array.length];
		
		for(int i = 0; i < index; ++i)
		{
			temp[i] = array[i];
		}
		
		temp[index] = value;
		
		for(int i = index + 1; i < array.length - 1; ++i)
		{
			temp[i] = array[i - 1];
		}
		
		array = temp;
		
		usedIndicies++;
	}
	
	public void replaceElementByIndex(int value, int index)
	{
		array[index] = value;
	}
	
	public void deleteElementByIndex(int index)
	{
		int[] temp = new int[array.length];
		
		for(int i = 0; i < index; ++i)
		{
			temp[i] = array[i];
		}
		
		for(int i = index + 1; i < array.length; ++i)
		{
			temp[i - 1] = array[i];
		}
		
		array = temp;
		
		usedIndicies--;
		
		if(usedIndicies <= array.length / 4 )
		{
			halfArray();
		}
	}
	
	public void deleteElementByValue(int value)
	{
		int element = findElementByValue(value);
		
		if (element >= 0) 
		{
			deleteElementByIndex(element);
		}
		else
		{
			System.out.println("Value not found.");
		}
	}
	
	public void printArray()
	{
		for(int i = 0; i < usedIndicies; ++i)
		{
			System.out.println(array[i]);
		}
	}
	
	public int findElementByValue(int value)
	{
		for(int i = 0; i < array.length; ++i)
		{
			if(array[i] == value)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public double currentUsage()
	{
		return usedIndicies / array.length;
	}
	
	public int capacity()
	{
		return array.length;
	}
	
	private void doubleArray()
	{
		int[] temp = new int[array.length * 2];
		
		for(int i = 0; i < array.length; ++i)
		{
			temp[i] = array[i];
		}
		
		array = temp;
	}
	
	private void halfArray()
	{
		int[] temp = new int[array.length / 2];
		
		for(int i = 0; i < array.length; ++i)
		{
			temp[i] = array[i];
		}
		
		array = temp;
	}
}