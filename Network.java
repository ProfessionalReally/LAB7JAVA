import java.util.Scanner;

public class Network
{
	public static void main(String[] args)
	{
		String os = System.getProperty("os.name");
		String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		Scanner in = new Scanner(System.in, consoleEncoding);
		
		System.out.println("6) Продемонстрировать работу с массивом объектов");
		System.out.println("===========================================================================================");
		System.out.println("На примере объектов класса лайк");
		
		//Set
		Friends[] Human = new Friends[2];
		
		//Init	
		for (int j = 0; j < 2; j++)
		{
			Human[j] = new Friends();
		}
		Human[0].InitFriends("Ivan", "Ivanov");
		Human[1].InitFriends("Sergey", "Sergeev");
		
		//Output
		Human[0].OutputFriends();
		Human[1].OutputFriends();
		
		System.out.println("7) Продемонстрировать возврат целочисленного значения из метода через вспомогательный класс");
		System.out.println("===========================================================================================");
		System.out.println("На примере объектов класса Account и Like");
		//Set
		Like likeA = new Like();
		Account account = new Account();

		likeA.Set(4);
		//Get
		account = likeA.GetLike();
		account.InitAccount("Anton", "Petrov", "Petrov22@gmail.com", "111222333");
		
		//Output
		System.out.println("");
		System.out.println("CLASS LIKE");
		System.out.println("");
		likeA.Displayamount();
		System.out.println("");
		System.out.println("CLASS ACCOUNT");
		System.out.println("");
		account.OutputAccount();
		
		System.out.println("8) Продемонстрировать разумное использование оператора this");
		System.out.println("===========================================================================================");
		System.out.println("На примере класса Like");
	//Set Like:
	Like A = new Like(1);
	Like B = new Like(2);
	Like C = new Like(3);
	Like D = new Like(4);
	
	//Init
	A.NewL();
		
	//reprint
	D.reprint();

	//Add
	A.Add(); B.Add(); C.Add(); D.Add();

	//reprint:
	D.reprint();


		System.out.println("9) Продемонстрировать обработку строк (String)");
		System.out.println("===========================================================================================");
		System.out.println("На примере класса Friends, сравнение строк\n");
		//Init	
		Human[0].InitFriends("Artur", "Osipov");
		//Output
		Human[0].OutputFriends();
		//String processing
		Human[0].AdditionSapces();
		//Output
		System.out.println("Friend: ");
		System.out.println(Human[0].returned());
	}
}