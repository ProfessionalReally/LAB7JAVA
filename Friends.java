import java.util.Scanner;

//Class Friends
public class Friends
{
	
	private String name = ""; //name
	private String surname = ""; //surname
	
	public Friends() //constructor
{
	name = ""; //name
	surname = ""; //surname
}

//Get
public String Getname()
{
	return this.name;
}

public String Getsurname()
{
	return this.surname;
}
//Init
public void InitFriends(String NAME, String SURNAME) 
{
	this.name = NAME;
	this.surname = SURNAME;
}
//Input
public void InputFriends() 
{
	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
		
	System.out.println("Please enter your friend's name: ");
	name = in.nextLine();
	System.out.println("Please enter your friend's surname: ");
	surname = in.nextLine();
	in.close();
}
//Output
public void OutputFriends() 
{
	if (name == "" && surname == "")
	{
		System.out.println("Your friend's name: Empty");
		System.out.println("Your friend's surname: Empty");
	}
	else
	{
		System.out.println("Your friend's name: " + name);
		System.out.println("Your friend's surname: " + surname);
	}
	System.out.println("");
}
//Delete
public void DeleteFriends() 
{
	this.name = "";
	this.surname = "";
}

//String processing
public void AdditionSapces()
{
	name = name + "  ";
	surname = surname + "  ";
}
	
//String return	
public String returned()
{
	return (name + surname);
}
	
}