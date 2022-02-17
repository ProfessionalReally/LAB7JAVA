
import java.util.Scanner;

interface IHuman
{
    
    void InpHuman();

    
    void DisplayInfo();

   
    String WhoIs();
}

public class Human implements IHuman  {
    protected String name = "";       //name
    protected String surname = "";       //surname


	
	public Human()
	{
	    name = "";
	    surname = "";
	}
	
	
    public Human(String NAME)
    {
        name = NAME;
        surname = "";
    }

    
    public Human(String NAME, String SURNAME)
    {
        name = NAME;
        surname = SURNAME;
    }
	
	
	public String GetName()
	{
	    return this.name;
	}
	
	public String GetSurname()
	{
	    return this.surname;
	}
	
	
    public void SetSurname(String SURNAME)
    {
        surname = SURNAME;
    }

    
    public void SetName(String NAME)
    {
        name = NAME;
    }
	
	
	public void Set(String NAME, String SURNAME)
	{
	    this.name = NAME;
	    this.surname = SURNAME;
	}
	
	
	public void InpHuman()
	{
	    Scanner in = new Scanner(System.in);  
	    System.out.println("Please enter your friend's name: ");
		name = in.nextLine();
		System.out.println("Please enter your friend's surname: ");
		surname = in.nextLine();
	    in.close();
	}
	
	
	public void DisplayInfo()
	{
	   System.out.println("name: " + name);
		System.out.println("surname: " + surname);
	}
	
	
	public void AdditionSapces()
	{
		name = name + "  ";
		surname = surname + "  ";
	}
	
	
	public String FirstSimbFromFIO()
	{
		return (name.substring(0, 0) + surname.substring(0, 0));
	}
	
	
    public String WhoIs()
    {
        return "неизвестный";
    }

   
    public void SayHello()
    {
    	System.out.println( WhoIs() + " говорит привет!");
    }
    
 
    public Human ShallowCopy()
    {
        return (Human)this;
    }

    
    public Human(Human otherMark)
    {
        name = otherMark.name;
        surname = otherMark.surname;
    }

}
