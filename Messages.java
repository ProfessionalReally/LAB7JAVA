import java.util.Scanner;

//Class Messages
public class Messages
{
	private String toWhom = ""; //to whom message
	private String fromWhom = ""; //from whom message
	private String message = ""; //text message
	
	public Messages() //constructor
{
	toWhom = ""; //to whom message
	fromWhom = ""; //from whom message
	message = ""; //text message
}

Messages(String TOWHOM) //constructor 1
{
	toWhom = TOWHOM; //to whom message
	fromWhom = ""; //from whom message
	message = ""; //text message
}

Messages(String TOWHOM, String FROMWHOM, String MESSAGE) //constructor all
{
	toWhom = TOWHOM; //to whom message
	fromWhom = FROMWHOM; //from whom message
	message = MESSAGE; //text message
}

void SettoWhom(String TOWHOM) //Set to whom message
{
	toWhom = TOWHOM; //to whom message
}

void SetfromWhom(String FROMWHOM) //Set from whom message
{
	fromWhom = FROMWHOM; //from whom message
}

void Setmessage(String MESSAGE) //Set text message
{
	message = MESSAGE; //text message
}



//GET
public String GettoWhom()
{
	return this.toWhom;
}

public String GetfromWhom()
{
	return this.fromWhom;
}

public String Getmessage()
{
	return this.message;
}

//Init
public void InitMessages(String TOWHOM ,String FROMWHOM, String MESSAGE) 
{
	this.toWhom = TOWHOM;
	this.fromWhom = FROMWHOM;
	this.message = MESSAGE;
}
//Input
public void InputMessages() 
{
	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
	
	System.out.println("Please enter a to whom the message: ");
	toWhom = in.nextLine();
	System.out.println("Please enter a from whom the message: ");
	fromWhom = in.nextLine();
	System.out.println("Please enter a message: ");
	message = in.nextLine();
	in.close();
	
}
//Output
public void OutputMessages() 
{
	if (toWhom == "" && fromWhom == "" && message == "")
	{
		System.out.println("To whom the message: Empty");
		System.out.println("From whom the message: Empty");
		System.out.println("Message: Empty");
	}
	else
	{
		System.out.println("To whom the message: " + toWhom);
		System.out.println("From whom the message: " + fromWhom);
		System.out.println("Message: " + message);
	}
	System.out.println("");
}
//Delete
public void DeleteMessages() 
{
	this.toWhom = "";
	this.fromWhom = "";
	this.message = "";
}
}