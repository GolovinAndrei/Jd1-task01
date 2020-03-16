package by.stech.les08.book;

public class Book {

	private int iD;
	private String name;
	private String author;
	private String publishing;
	private int yearOfPub;
	private int numbOfPages;
	private int price;
	private char typeOfBind;

	public Book() {

	}

	public Book(int iD, String name, String authors, String publishing, int yearOfPub, int numbOfPages, int price,
			char typeOfBind) {
		super();
		this.iD = iD;
		this.name = name;
		this.author = authors;
		this.publishing = publishing;
		this.yearOfPub = yearOfPub;
		this.numbOfPages = numbOfPages;
		this.price = price;
		this.typeOfBind = typeOfBind;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String authors) {
		this.author = authors;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public int getYearOfPub() {
		return yearOfPub;
	}

	public void setYearOfPub(int yearOfPub) {
		this.yearOfPub = yearOfPub;
	}

	public int getNumbOfPages() {
		return numbOfPages;
	}

	public void setNumbOfPages(int numbOfPages) {
		this.numbOfPages = numbOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getTypeOfBind() {
		return typeOfBind;
	}

	public void setTypeOfBind(char typeOfBind) {
		this.typeOfBind = typeOfBind;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + iD;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numbOfPages;
		result = prime * result + price;
		result = prime * result + ((publishing == null) ? 0 : publishing.hashCode());
		result = prime * result + typeOfBind;
		result = prime * result + yearOfPub;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (iD != other.iD)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numbOfPages != other.numbOfPages)
			return false;
		if (price != other.price)
			return false;
		if (publishing == null) {
			if (other.publishing != null)
				return false;
		} else if (!publishing.equals(other.publishing))
			return false;
		if (typeOfBind != other.typeOfBind)
			return false;
		if (yearOfPub != other.yearOfPub)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [iD=" + iD + ", name=" + name + ", authors=" + author + ", publishing=" + publishing
				+ ", yearOfPub=" + yearOfPub + ", numbOfPages=" + numbOfPages + ", price=" + price + ", typeOfBind="
				+ typeOfBind + "]";
	}

}
