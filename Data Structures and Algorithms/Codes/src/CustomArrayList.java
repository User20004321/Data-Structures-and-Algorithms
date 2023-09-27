
public class CustomArrayList
{
	public static void main(String[] args)
	{
		TheArrayList myArray = new TheArrayList();
		TheArrayList myOtherArray = new TheArrayList(5);
		TheArrayList myOtherOtherArray = new TheArrayList(20);
		
		for(int i = 0; i < 21; ++i)
		{
			myArray.appendElement(i + 1);
		}

		myArray.printArray();
		
		myArray.deleteElementByIndex(4);
		myArray.deleteElementByValue(18);
		
		myArray.printArray();
		
		myArray.insertElement(99, 8);
		
		myArray.printArray();
	}
}