class Registration
{
	String firstname;
	String middlename;
	String lastname;
	String address;

	Registration()
	{
	
	}

	Registration(String firstname,String middlename, String lastname, String address)
	{
	this.firstname = firstname;
	this.middlename = middlename;
	this.lastname = lastname;
	this.address = address;
	}

	public String getFirstname()
	{
		return this.firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname=firstname;
	}
	public String getMiddlename()
	{
		return this.middlename;
	}
	public void setMiddlename(String middlename)
	{
		this.middlename=middlename;
	}
	public String getLastname()
	{
		return this.lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname=lastname;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return this.firstname+","+this.middlename+","+this.lastname+","+this.address;
	}
}