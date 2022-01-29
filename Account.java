import java.util.Scanner;

//Class Account
public class Account
{
	//ACCOUNT
	private String name = ""; //name
	private String surname = ""; //surname
	private String email = ""; //email
	private String password = ""; //password
	//FIGURE
	private int FigureFigure = 0; //Figure
	private int FigureColor = 0; //Color
	//FRIENDS
	private String[] FriendsName = new String[2]; //Name
	private String[] FriendsSurname = new String[2]; //Surname
	//MUSIC
	private String[] MusicTitle = new String[2]; //Title
	private String[] MusicExecutor = new String[2]; //Executor
	//MESSAGES
	private String MessagestoWhom = ""; //to whom message
	private String MessagesfromWhom = ""; //from whom message
	private String Messagesmessage = ""; //text message
	//LIKE
	public int amount = 0; //amount likes
	
	public Account() //constructor
{
	 name = ""; //name
	 surname = ""; //surname
	 email = ""; //email
	 password = ""; //password
	 FigureFigure = 0;
	 FigureColor = 0;
	 for (int i = 0; i < 2; i++)
	 {
	 FriendsName[i] = "";
	 FriendsSurname[i] = "";
	 MusicTitle[i] = "";
	 MusicExecutor[i] = "";
	 }
	 MessagestoWhom = "";
	 MessagesfromWhom = "";
	 Messagesmessage = "";
	 amount = 0;
}

	public Account(String NAME) //constructor 1
{
	 name = NAME; //name
	 surname = ""; //surname
	 email = ""; //email
	 password = ""; //password
	 FigureFigure = 0;
	 FigureColor = 0;
	 for (int i = 0; i < 2; i++)
	 {
	 FriendsName[i] = "";
	 FriendsSurname[i] = "";
	 MusicTitle[i] = "";
	 MusicExecutor[i] = "";
	 }
	 MessagestoWhom = "";
	 MessagesfromWhom = "";
	 Messagesmessage = "";
	 amount = 0;
}

	public Account(String NAME, String SURNAME, String EMAIL, String PASSWORD) //constructor all
{
	 name = NAME; //name
	 surname = ""; //surname
	 email = ""; //email
	 password = ""; //password
	 FigureFigure = 0;
	 FigureColor = 0;
	 for (int i = 0; i < 2; i++)
	 {
	 FriendsName[i] = "";
	 FriendsSurname[i] = "";
	 MusicTitle[i] = "";
	 MusicExecutor[i] = "";
	 }
	 MessagestoWhom = "";
	 MessagesfromWhom = "";
	 Messagesmessage = "";
	 amount = 0;
}

//Set name
public void Setname(String NAME)
{
	name = NAME;
}

//Set surname
public void Setsurname(String SURNAME)
{
	surname = SURNAME;
}

//Set email
public void Setemail(String EMAIL)
{
	email = EMAIL;
}

//Set password
public void Setpassword(String PASSWORD)
{
	password = PASSWORD;
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
public String Getemail()
{
	    return this.email;
}
public String Getpassword()
{
	    return this.password;
}
//Init
public void InitAccount(String NAME, String SURNAME, String EMAIL, String PASSWORD) 
{
	this.name = NAME;
	this.surname = SURNAME;
	this.email = EMAIL;
	this.password = PASSWORD;
}
//Input
public void InputAccount() 
{
	    String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);

	System.out.println("\nPlease enter a name: ");
	name = in.nextLine();
	System.out.println("\nPlease enter a surname: ");
	surname = in.nextLine();
	System.out.println("\nPlease enter a email: ");
	email = in.nextLine();
	System.out.println("\nPlease enter a password: ");
	password = in.nextLine();
	in.close();
}
//Output
public void OutputAccount() 
{
	System.out.println("ACCOUNT");
	if (name == "" && surname == "" && email == "" && password == "")
	{
		System.out.println("Name: empty");
		System.out.println("Surname: empty");
		System.out.println("Email: empty");
		System.out.println("Password: empty");
	}
	else
	{
		System.out.println("Name: " + name );
		System.out.println("Surname: " + surname);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	System.out.println("");
	System.out.println("FIGURE");
	if (FigureFigure == 0)
		System.out.println("Figure: Empty");
	if (FigureFigure == 1)
		System.out.println("Figure: Triangle");
	if (FigureFigure == 2)
		System.out.println("Figure: Circle");
	if (FigureFigure == 3)
		System.out.println("Figure: Square");
	if (FigureColor == 0)
		System.out.println("Color: Empty");
	if (FigureColor == 1)
		System.out.println("Color: Red");
	if (FigureColor == 2)
		System.out.println("Color: Green");
	if (FigureColor == 3)
		System.out.println("Color: Blue");
	System.out.println("");
	System.out.println("FRIENDS");
		for (int i = 0; i < 2; i++)
	{
		if ((FriendsName[i] == "") && (FriendsSurname[i] == ""))
		{
			System.out.println(i+1);
			System.out.println("Your friend's name: Empty");
			System.out.println("Your friend's surname: Empty");
		}
		else
		{
			System.out.println(i+1);
			System.out.println("Your friend's name: " + FriendsName[i]);
			System.out.println("Your friend's surname: " + FriendsSurname[i]);
		}
	}
	System.out.println("");
	System.out.println("MUSIC");
		for (int i = 0; i < 2; i++)
	{
		if (MusicExecutor[i] == "" && MusicTitle[i] == "")
		{
			System.out.println(i+1);
			System.out.println("Empty - Empty\n");
		}
		else
		{
			System.out.println(i+1);
			System.out.println(MusicExecutor[i] + " - " + MusicTitle[i]);
		}
	}
	System.out.println("");
	System.out.println("MESSAGES");
	if (MessagestoWhom == "" && MessagesfromWhom == "" && Messagesmessage == "")
	{
		System.out.println("To whom the message: Empty");
		System.out.println("From whom the message: Empty");
		System.out.println("Message: Empty");
	}
	else
	{
		System.out.println("To whom the message: " + MessagestoWhom);
		System.out.println("From whom the message: " + MessagesfromWhom);
		System.out.println("Message: " + Messagesmessage);
	}
	System.out.println("");
	System.out.println("LIKE");
	if (amount == 0)
	{
		System.out.println("Likes amount: Empty");
	}
	else
	{
		System.out.println("Likes amount: " + amount);
	}
	System.out.println("");
}
//Delete
public void DeleteAccount() 
{
	
	this.name = "";
	this.surname = "";
	this.email = "";
	this.password = ""; 
	this.FigureFigure = 0; 
	this.FigureColor = 0;
	for (int i = 0; i < 2; i++)
	{
	this.FriendsName[i] = "";
	this.FriendsSurname[i] = "";
	this.MusicTitle[i] = "";
	this.MusicExecutor[i] = "";
	}
	this.MessagestoWhom = "";
	this.MessagesfromWhom = "";
	this.Messagesmessage = "";
}
	
}
