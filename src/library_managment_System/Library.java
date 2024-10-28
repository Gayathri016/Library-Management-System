package library_managment_System;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Library 
{
	private int libraryId;
	private String location;
	private Book b;
	
	ArrayList<Book> book=new ArrayList<Book>();
	
	//addBook()
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book added succesfully");
	}
	
	//Display
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.out.println("Books not yet added");
		}
		else
		{
			for(Book b:book)
				b.display();
		}
	}
	//search book based on id
	public void searchBookBasedOnId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("Book found "+b.getBookTitle());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new IdNotFoundException();
		}
	}
	//search book based on author
	public void searchBookBasedOnauthor(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor().equalsIgnoreCase(author))
				{
					System.out.println("Book found "+b.getBookTitle());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new AuthorNameMissMatchException();
		}
	}
	//Update based bookcost based on title
	public void updateCostBasedOntitle(String title)
	{
		boolean isUpdated=false;
		if(book.isEmpty())
		{
			System.out.println("Books not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getBookTitle().equalsIgnoreCase(title))
				{
					b.setCost(1000);
					isUpdated=true;
					for(Book b2:book)
					b.toString();
					System.out.println("Updated succesfully");
				}
			}
		}
		if(isUpdated==false)
		{
			throw new TitleNameMissMatchException();
		}
	}
	//remove based on Id
	public void removeBookBasedOnId(int id)
	{
		boolean isRemoved=false;
		Iterator<Book>itr=book.iterator();
		if(book.isEmpty())
		{
			System.out.println("Books not yet added");
		}
		else
		{
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getId()==id)
				{
					itr.remove();
					System.out.println("Removed succesfully");
					for(Book b1:book)
					b.display();
					isRemoved=true;
				}
			}
		}
		if(isRemoved==false)
		{
			throw new IdNotFoundException();
		}
	}
}
