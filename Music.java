import java.util.Scanner;

//Class Music
public class Music
{
	private String title = ""; //title
	private String executor = ""; //executor
	
	public Music() //constructor
{
	title = ""; //title
	executor = ""; //executor
}

public Music(String TITLE) //constructor 1
{
	title = TITLE; //title
	executor = ""; //executor
}

public Music(String TITLE, String EXECUTOR) //constructor all
{
	title = TITLE; //title
	executor = EXECUTOR; //executor
}

public void Settitle(String TITLE) //Set title
{
	title = TITLE; //title
}

public void Setexecutor(String EXECUTOR) //Set executor
{
	executor = EXECUTOR; //executor
}


//GET
public String Gettitle()
{
	return this.title;
}

public String Getexecutor()
{
	return this.executor;
}
//Init
public void MUSICinit(String EXECUTOR, String TITLE) 
{
	this.executor = EXECUTOR;
	this.title = TITLE;
}
//Input
public void MUSICinput() 
{
	String os = System.getProperty("os.name");
        String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
	System.out.println("Please enter a executor: ");
	executor = in.nextLine();
	System.out.println("Please enter a title: ");
	title = in.nextLine();
	in.close();
}
//Output
public void OutputMusic() 
{
	if (executor == "" && title == "")
	{
		System.out.println("Empty - Empty");
	}
	else
	{
		System.out.println(executor + " - " + title);
	}
	System.out.println("");
}
//Delete
public void DeleteMusic() 
{
	this.title = "";
	this.executor = "";
}

}
