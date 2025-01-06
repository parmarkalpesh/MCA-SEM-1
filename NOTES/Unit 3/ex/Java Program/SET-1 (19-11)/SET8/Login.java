class Login
{
	String username;
	String password;
	Login()
	{
	this.username = "admin";
	this.password = "password";
	}

	Login(String username,String passowrd)
	{
	this.username = "admin";
	this.password = "password";
	}

	public String getUsername()
	{
		return this.username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
}