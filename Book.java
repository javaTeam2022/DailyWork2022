package queueInterface;

class Book implements Comparable<Book> {
	int bookid;
	String author, bookname, publisher;
	int price;

	public Book(int bookid, String author, String bookname, String publisher, int price) {
		this.bookid = bookid;
		this.author = author;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Book o) {
		if (bookid > o.bookid) {
			return 1;
		} else if (bookid < o.bookid) {
			return -1;
		} else
			return 0;
	}

	@Override
	public String toString() {
		return "[bookid=" + bookid + ", author=" + author + ", bookname=" + bookname + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}

}
