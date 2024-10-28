package library_managment_System;

public class IdNotFoundException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "You have given invalid book id, give valid book id";
	}
}
