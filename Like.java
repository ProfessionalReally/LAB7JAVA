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
    this.amount = AMOUNT;
}

//Init(SET)
public void Set(int v)
{
    amount = v;
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
    System.out.print("Please enter a amount likes: ");
    amount = in.nextInt();
    System.out.println();
	in.close();
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
public void reprint()
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

public void NewL()
{
	lastLike = null;
}
}