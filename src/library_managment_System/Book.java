package library_managment_System;

import java.util.Random;

public class Book 
{
	private String bookTitle;
	private int id;
	private int cost;
	private int pages;
	private String author;
	
	Random r=new Random();
	public Book(String bookTitle, int cost, int pages, String author) 
	{
		if(validateBookTitle(bookTitle))
			this.bookTitle = bookTitle;
		else
			throw new TitleNameMissMatchException();
		this.id = r.nextInt(123);
		if(validateBookCost(cost))
			this.cost = cost;
		else
			throw new CostOutOfRangeException();
		if(validateNofOfPages(pages))
			this.pages = pages;
		else
			throw new NoOfPagesInvalidException();
		if(validateAuthor(author))
			this.author = author;
		else
			throw new AuthorNameMissMatchException();
	}
	public boolean validateBookTitle(String bookTitle)
	{
		if(bookTitle.equalsIgnoreCase("java")||bookTitle.equalsIgnoreCase("python")||bookTitle.equalsIgnoreCase("sql"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateBookCost(int cost)
	{
		if(cost>=200 && cost <=1500)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateNofOfPages(int noOfPages)
	{
		if(noOfPages>=500 && noOfPages<=3000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateAuthor(String author)
	{
		if(author.equals("james")||author.equals("scott")||author.equals("alean"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getBookTitle() 
	{
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) 
	{
		this.bookTitle = bookTitle;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void display()
	{
		System.out.println("Book title: "+getBookTitle());
		System.out.println("Book id: "+getId());
		System.out.println("Book cost: "+getCost());
		System.out.println("Book pages: "+getPages());
		System.out.println("Book author: "+getAuthor());
		System.out.println("-----------------------------------------");
	}
	@Override
	public String toString() {
		return "bookTitle=" + bookTitle + ", id=" + id + ", cost=" + cost + ", pages=" + pages + ", author="+ author ;
	}
	
	
}
