package TestSample;

import java.util.*;

class Library {
	Book b1;

	public void AddBook(Book b) {
		this.b1 = b;
}

	public void SearchByTitle(String stitle) {
		if (b1.getTitle().equalsIgnoreCase(stitle)) {
			System.out.println(b1.getTitle() + "\t" + b1.getAuthor() + "\t" + b1.getIsbn());
		}

	}

	public void SearchByAuthors(String sauthor) {

		if (b1.getAuthor().equalsIgnoreCase(sauthor)) {
			System.out.println(b1.getTitle() + "\t" + b1.getAuthor() + "\t" + b1.getIsbn());
		}

	}

	public void DisplyData(int count) {
		if (count == 0) {
			System.out.println("Library is empty");
		} 
		else 
		{
			System.out.println(b1);
				
		}

		
	}

}

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book b[] = new Book[5];
		Library l = new Library();
		int count = 0;

		int c;
		do {
			System.out.println("\n1.AddBook\n2.Search BY Title\n3.Search by Author\n4.Display Book");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < b.length; i++) {
					System.out.println("Enter Title and Author and ISBN(International Standard Book Number)");
					String title = sc.next();
					String author = sc.next();
					String isbn = sc.next();

					b[i] = new Book();
					b[i].setTitle(title);
					b[i].setAuthor(author);
					b[i].setIsbn(isbn);
					l.AddBook(b[i]);
					count++;
				}
				break;
			case 2:
				if (count == 0) {
					System.out.println("Library is empty");
				} else {

					System.out.println("Enter the title you Search");
					String stitle = sc.next();
					l.SearchByTitle(stitle);

				}

				break;

			case 3:
				if (count == 0) {
					System.out.println("Library is empty");
				} else {
					System.out.println("Enter the authors you Search");
					String sauthors = sc.next();
					l.SearchByAuthors(sauthors);

				}
				break;

			case 4:
				l.DisplyData(count);

			}
			System.out.println("Do yo want to continue yes(1)/No(0)");
			c = sc.nextInt();
		} while (c == 1);

	}
}
