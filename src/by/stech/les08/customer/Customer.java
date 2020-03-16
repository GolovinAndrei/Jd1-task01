package by.stech.les08.customer;

public class Customer {

	private int iD;
	private String name;
	private String lastName;
	private String adres;
	private int creditCard;
	private int bankAccount;
	
	public Customer() {
	
	}

	public Customer(int iD, String name, String lastName, String adres, int creditCard, int bankAccount) {
	
		this.iD = iD;
		this.name = name;
		this.lastName = lastName;
		this.adres = adres;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Customer [iD=" + iD + ", name=" + name + ", lastName=" + lastName + ", adres=" + adres + ", creditCard="
				+ creditCard + ", bankAccount=" + bankAccount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adres == null) ? 0 : adres.hashCode());
		result = prime * result + bankAccount;
		result = prime * result + creditCard;
		result = prime * result + iD;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (adres == null) {
			if (other.adres != null)
				return false;
		} else if (!adres.equals(other.adres))
			return false;
		if (bankAccount != other.bankAccount)
			return false;
		if (creditCard != other.creditCard)
			return false;
		if (iD != other.iD)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
		
}
