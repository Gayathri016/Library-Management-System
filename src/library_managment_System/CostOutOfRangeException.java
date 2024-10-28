package library_managment_System;

public class CostOutOfRangeException extends RuntimeException
{
	public String toString()
	{
		return "You entered cost out of range, cost must be between 200 to 1500";
	}
}
