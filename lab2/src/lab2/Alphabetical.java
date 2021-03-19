package lab2;
/**
 * Date:17/03/2021
 * @author REDDY
 *Write a program to get the sorted list of Products name
 */
import java.util.Arrays;
public class Alphabetical
{
	public static void main(String[] args) 
	{
		String[] countries = {"Zimbabwe", "South-Africa", "India",
				"America", "Yugoslavia", " Australia", "Denmark", 
				"France", "Netherlands", "Italy", "Germany"};  
		int size = countries.length;  
		//logic for sorting   
		for(int i = 0; i<size-1; i++)   
		{  
			for (int j = i+1; j<countries.length; j++)   
			{  
		//compares each elements of the array to all the remaining elements  
				if(countries[i].compareTo(countries[j])>0)   
				{  
		//swapping array elements  
				String temp = countries[i];  
				countries[i] = countries[j];  
				countries[j] = temp;  
				}  
				
				
			}  
		}  
		//prints the sorted array in ascending order  
		System.out.println(Arrays.toString(countries));  
	}	

}