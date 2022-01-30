import java.util.Scanner;

public class Network
{
	public static void main(String[] args)
	{
		/*String os = System.getProperty("os.name");
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
		System.out.println(Human[0].returned());*/
		/*System.out.print("Лабраторная 8:\n\n");
		System.out.print("=========\nМодифицировать ваши проекты на С++, C# и Java путем добавления в один из классов\nкак минимум одного статического поля и одного статического метода.\n=========\n\n");

		System.out.print("(Использовались статический член класса\'Mark\' \'lastMark\'и\nстатические методы класса \'NewList\' и \'reprint\')\n\n");
		//Set Like:
	Like A = new Like(1);
	Like B = new Like(2);
	Like C = new Like(3);
	Like D = new Like(4);
	
		System.out.print("Вызов статической компанентной функции: \'Новый список\'\n\n");
	//Init
	A.NewL();
		System.out.print("Вызов статической компанентной функции: \'Напечатать список\'\n\n");
	//reprint
	D.reprint();
	System.out.print("\n\nДобавление элементов в список.\n\n");
	//Add
	A.Add(); B.Add(); C.Add(); D.Add();
	System.out.print("Вызов статической компанентной функции: \'Напечатать список\'\n\n");
	System.out.print("===================================\n");
	//reprint:
	D.reprint();
	System.out.print("\n===================================\n");*/
		/*Account account1 = new Account();
		Account account2 = new Account("Artur");
		Account account3 = new Account("Nikolay", "Ivanov", "NikolayIvanov@yandex.ru", "123");

		System.out.println("Лабораторная 9");
		System.out.println();
		System.out.println("Конструкторы класса Account:");
		System.out.println("1) Конструктор без параметров:");
		account1.OutputAccount();
		System.out.println("2) Конструктор с 1-им параметром:");
		account2.OutputAccount();
		System.out.println("3) Конструктор с параметрами:");
		account3.OutputAccount();
		System.out.println("\n\n");
		
		Figure figure1 = new Figure();
		Figure figure2 = new Figure(1);
		Figure figure3 = new Figure(2,3);

		System.out.println("Лабораторная 9");
		System.out.println();
		System.out.println("Конструкторы класса figure:");
		System.out.println("1) Конструктор без параметров:");
		figure1.OutputFigure();
		System.out.println("2) Конструктор с 1-им параметром:");
		figure2.OutputFigure();
		System.out.println("3) Конструктор с параметрами:");
		figure3.OutputFigure();
		System.out.println("\n\n");
		
		Friends friend1 = new Friends();
		Friends friend2 = new Friends("Egor");
		Friends friend3 = new Friends("Gloria", "Jean");

		System.out.println("Лабораторная 9");
		System.out.println();
		System.out.println("Конструкторы класса Friends:");
		System.out.println("1) Конструктор без параметров:");
		friend1.OutputFriends();
		System.out.println("2) Конструктор с 1-им параметром:");
		friend2.OutputFriends();
		System.out.println("3) Конструктор с параметрами:");
		friend3.OutputFriends();
		System.out.println("\n\n");
		
		Music music1 = new Music();
		Music music2 = new Music("Not Afraid");
		Music music3 = new Music("Here We Go", "Eminem");

		System.out.println("Лабораторная 9");
		System.out.println();
		System.out.println("Конструкторы класса Music:");
		System.out.println("1) Конструктор без параметров:");
		music1.OutputMusic();
		System.out.println("2) Конструктор с 1-им параметром:");
		music2.OutputMusic();
		System.out.println("3) Конструктор с параметрами:");
		music3.OutputMusic();
		System.out.println("\n\n");
		
		Messages message1 = new Messages();
		Messages message2 = new Messages("Nikolay Krasnov");
		Messages message3 = new Messages("My teacher", "Student", "Good morning!");

		System.out.println("Лабораторная 9");
		System.out.println();
		System.out.println("Конструкторы класса Messages:");
		System.out.println("1) Конструктор без параметров:");
		message1.OutputMessages();
		System.out.println("2) Конструктор с 1-им параметром:");
		message2.OutputMessages();
		System.out.println("3) Конструктор с параметрами:");
		message3.OutputMessages();
		System.out.println("\n\n");
		
		
		Like like1 = new Like(), like2 = new Like(3);

		System.out.println("Лабораторная 9");
		System.out.println();
		System.out.println("Конструкторы класса Like:");
		System.out.println("1) Конструктор без параметров:");
		like1.Displayamount();
		System.out.println("2) Конструктор с 1-им параметром, он же с параметрами:");
		like2.Displayamount();
		System.out.println("\n\n");


		System.out.println("Лабораторная 9");
		System.out.println();
		Friends[] friends = new Friends[3];
		for (int j = 0; j < 3; j++)
			friends[j] = new Friends("Ivanov" + (j + 1));
		System.out.println("Инициализировать небольшой массив конструктором с одним параметром:");
		for (int j = 0; j < 3; j++)
			friends[j].OutputFriends();
		System.out.println("\n\n");
		
		
		System.out.println("Лабораторная 9");
		System.out.println();
		System.out.println("Продемонстрировать различие между мелким и глубоким копированием:");
		Like likeTestCopy1 = new Like(4), likeTestCopy2 = new Like(5);

		likeTestCopy2 = likeTestCopy1;

		System.out.println("Поверхностная копия 1-го объекта во 2-ой:");
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("");
		System.out.println("Изменение 1-го объекта, а 2-ой не трогается:");
		likeTestCopy1.Set(3);
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("");

		likeTestCopy1.Set(4);
		likeTestCopy2 = new Like(likeTestCopy1);

		System.out.println("Глубокая копия 1-го объекта во 2-ой:");
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("");
		System.out.println("Изменение 1-го объекта, а 2-ой не трогается:");
		likeTestCopy1.Set(3);
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("\n\n");*/
		Like like1 = new Like();

		System.out.println("Лабораторная 10\n");
		System.out.println("Введите количество оценок - число в пределах от 0 до бессконечности!\n");

		while (like1.Get() == 0)
		{
			like1.InpLike();
		}

		System.out.println("Введенное количество оценок: " + like1.Get());


	}
}