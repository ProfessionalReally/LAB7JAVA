import java.util.Scanner;

//Class Friends
public class Like
{
  private  int amount = 0;  // Likes amount
  private static Like lastLike;  
  private Like prev;        
  private Like next;    
  
// Constructor
public Like()
{
    amount = 0;
}

// Constructor
public Like(int AMOUNT)
{
    this.amount = 0;
        if (IsRightLike(AMOUNT))
            this.amount = AMOUNT;

}

//Init(SET)
public void Set(int v)
{
    this.amount = 0;
        if (IsRightLike(v))
            this.amount = v;

}

//GET
public int Get()
{
    return this.amount;
}

public Account GetLike()
	{
	    Account a  = new Account();
	        a.amount = amount;
			return a;
	}

//Input
public void InpLike()
{
	Scanner in = new Scanner(System.in);
    	String str = new String();
    	int number = 0;

    	System.out.print("Enter amount likes:  ");
        try                                                         
        {
        	if (in.hasNextInt()) 
			{
		      	 	number = in.nextInt();
		      	 	str = in.nextLine();
		      	 	Set(number);
		   	} 
        	else
        		throw new Exception("It string is not number!");       
        }
        catch (Exception ex)                       
        {
        	System.out.print("Error: " + ex.getMessage() + '\n');
        }
}


//Cheak int or not
    public boolean IsRightLike(int like)
    {
        boolean res = true;
        try                                                    
        {
            if (like < 0)                          
                throw new Exception("Incorrect amount.");       
            return res;
        }
        catch (Exception ex)           						  
        {
        	System.out.println("Error: " + ex.getMessage() + '\n');
            res = false;
            return res;
        }
    }


	//Surface copy
    public Like ShallowCopy()
    {
        return (Like)this;
    }

    //Offer Builder (Deep Copy)
    public Like(Like otherLike)
    {
        amount = otherLike.amount;
    }


//Output
public void Displayamount()
{
    System.out.println("Amount likes: " + amount);
}

//Add
public void Add()
{
    if (lastLike == null)
        this.prev = null;
    else
    {
        lastLike.next = this;
        prev = lastLike;
    }
    lastLike = this;
    this.next = null;
}

//Print
public static void reprint()
{
    Like uk;   // Вспомогательный ссылка
    uk = lastLike;
    if (uk == null)
    {
       System.out.println("List is empty!");
        return;
    }
    else
        System.out.println("\nList content :\n");

    // Цикл печати в обратном порядке значений элементов списка:
    while (uk != null)
    {
        System.out.println(uk.amount + "\t");
        uk = uk.prev;
    }
}

public static void NewL()
{
	lastLike = null;
}
}