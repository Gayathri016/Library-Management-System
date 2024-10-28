package library_managment_System;

public class NoOfPagesInvalidException extends RuntimeException{
	@Override
	public String toString()
	{
		return getClass()+": no of pages should be in between 500 to3000";
	}

}
