import java.util.Scanner;

//Class Friends
public class Friends extends Human implements IHuman
{
	
	//private String name = ""; //name
	//private String surname = ""; //surname
	
	public Friends() //constructor
{
	super("", "");
	//name = ""; //name
	//surname = ""; //surname
}

public Friends(String NAME) //constructor 1
{
	super(NAME, "");
	//name = NAME; //name
	//surname = ""; //surname
}

public Friends(String NAME, String SURNAME) //constructor all
{
	super(NAME, SURNAME);
	//name = NAME; //name
	//surname = SURNAME; //surname
}

public void Setname(String NAME) //Set name
{
	name = NAME; //name
}

public void Setsurname(String SURNAME) //Set surname
{
	surname = SURNAME; //surname
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
@Override public void InpHuman() 
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
public void DisplayInfo() 
{
		System.out.println("Your friend's name: " + name);
		System.out.println("Your friend's surname: " + surname);
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


	public String FirstSimbFromFIO()
	{
		return (name.substring(0, 0) + surname.substring(0, 0));
	}
	
	
	@Override public String WhoIs()
    {
        return "друг";
    }

    
    public void SayHello()
    {
    	System.out.println( WhoIs() + " говорит привет!");
    }
    
    
	public String ToString()
	{
		return (name + " " + surname);
	}

    public Friends ShallowCopy()
    {
        return (Friends)this;
    }

    
    public Friends(Friends otherMark)
    {
        name = otherMark.name;
        surname = otherMark.surname;
    }
    
	
}