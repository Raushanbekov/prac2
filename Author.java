public class Author {
private String name;
private String email;
private char gender;
public Author(String a, String b, char c)
	{
	name = a;
	email = b;
	gender = c;
	}

public String getName()
{
	return name;
}

public String getEmail()
{
	return email;
}

public void setEmail(String a)
{
	email = a;
}

public char getGender()
{
	return gender;
}

public String toString()
{
	 return  " @ ("+this.name+", "+this.gender+" , "+"at"+", "+this.email+").";
}

}
