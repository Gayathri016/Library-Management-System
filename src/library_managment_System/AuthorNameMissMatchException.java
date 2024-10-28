package library_managment_System;

public class AuthorNameMissMatchException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "Author name is not matched,Give valid author name";
	}
}
