package library_managment_System;

import java.util.Scanner;
public class MainApp 
{
	public static void main(String[] args) 
	{
		String title;
		 int id;
		 int cost;
		 int pages;
		 String author;
		Library l=new Library();
		Scanner s=new Scanner(System.in);
		boolean check=true;
		while(check)
		{
			System.out.println("Enter the Choice \n 1.Adding of Books \n 2.DisplayBooks \n 3.Search Book Based On Id \n 4.Search Book Based On Author \n 5.Update Book Cost Based On Title \n 6.Remove Book Based on ID \n 7.Exit");
	         
	         int choice=s.nextInt();
	         switch(choice)
	         {
		         case 1: 
		         {
		      			 System.out.println("Enter the Book Title");
		            	  title=s.next();
		            	   System.out.println("Enter the  Book Cost");
		            	   cost=s.nextInt();
		            	   System.out.println("Enter the BookPages");
		            	   pages=s.nextInt();
		            	   System.out.println("Enter the Book Author");
		            	   author=s.next();
		            	   l.addBook(new Book(title, cost, pages, author));   		
		         }
		         break;
		         case 2:
		         {
		        	 l.displayBook();
		         }
		         break;
		         case 3:
		         {
		        	 System.out.println("Enter the id to search Book");
		        	   id=s.nextInt();
		        	   l.searchBookBasedOnId(id);
		         }
		         break;
		         case 4:
		         {
		        	 System.out.println("Enter the Author of the Book");
		        	   author=s.next();
		        	   l.searchBookBasedOnauthor(author);
		         }
		         break;
		         case 5:
		         {
		        	 System.out.println("Enter the Book title");
		        	   title=s.next();
		        	   l.updateCostBasedOntitle(title);
		         }
		         break;
		         case 6:
		         {
		        	 System.out.println("Enter id to Remove Book");
		        	   id=s.nextInt();
		        	   l.removeBookBasedOnId(id);
		         }
		         break;
		         case 7:
		         {
		        	 check=false;
		        	   System.out.println("Thank You....");
		         }
		         break;
		         default:
		         {
		        	 System.out.println("Invalid choice please choose valid option");
		         }
	         }
		}
	}
}
