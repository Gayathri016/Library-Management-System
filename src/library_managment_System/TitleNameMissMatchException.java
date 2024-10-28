package library_managment_System;

public class TitleNameMissMatchException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "Title name is not matched,Give valid book title";
	}
}
