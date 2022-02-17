import java.util.Scanner;

public class Network
{
	public static void main(String[] args)
	{
		/*String os = System.getProperty("os.name");
		String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		Scanner in = new Scanner(System.in, consoleEncoding);
		
		System.out.println("6) �த�������஢��� ࠡ��� � ���ᨢ�� ��ꥪ⮢");
		System.out.println("===========================================================================================");
		System.out.println("�� �ਬ�� ��ꥪ⮢ ����� ����");
		
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
		
		System.out.println("7) �த�������஢��� ������ 楫��᫥����� ���祭�� �� ��⮤� �१ �ᯮ����⥫�� �����");
		System.out.println("===========================================================================================");
		System.out.println("�� �ਬ�� ��ꥪ⮢ ����� Account � Like");
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
		
		System.out.println("8) �த�������஢��� ࠧ㬭�� �ᯮ�짮����� ������ this");
		System.out.println("===========================================================================================");
		System.out.println("�� �ਬ�� ����� Like");
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


		System.out.println("9) �த�������஢��� ��ࠡ��� ��ப (String)");
		System.out.println("===========================================================================================");
		System.out.println("�� �ਬ�� ����� Friends, �ࠢ����� ��ப\n");
		//Init	
		Human[0].InitFriends("Artur", "Osipov");
		//Output
		Human[0].OutputFriends();
		//String processing
		Human[0].AdditionSapces();
		//Output
		System.out.println("Friend: ");
		System.out.println(Human[0].returned());*/
		/*System.out.print("�����ୠ� 8:\n\n");
		System.out.print("=========\n������஢��� ��� �஥��� �� �++, C# � Java ��⥬ ���������� � ���� �� ����ᮢ\n��� ������ ������ ����᪮�� ���� � ������ ����᪮�� ��⮤�.\n=========\n\n");

		System.out.print("(�ᯮ�짮������ ����᪨� 童� �����\'Mark\' \'lastMark\'�\n����᪨� ��⮤� ����� \'NewList\' � \'reprint\')\n\n");
		//Set Like:
	Like A = new Like(1);
	Like B = new Like(2);
	Like C = new Like(3);
	Like D = new Like(4);
	
		System.out.print("�맮� ����᪮� ��������⭮� �㭪樨: \'���� ᯨ᮪\'\n\n");
	//Init
	A.NewL();
		System.out.print("�맮� ����᪮� ��������⭮� �㭪樨: \'�������� ᯨ᮪\'\n\n");
	//reprint
	D.reprint();
	System.out.print("\n\n���������� ������⮢ � ᯨ᮪.\n\n");
	//Add
	A.Add(); B.Add(); C.Add(); D.Add();
	System.out.print("�맮� ����᪮� ��������⭮� �㭪樨: \'�������� ᯨ᮪\'\n\n");
	System.out.print("===================================\n");
	//reprint:
	D.reprint();
	System.out.print("\n===================================\n");*/
		/*Account account1 = new Account();
		Account account2 = new Account("Artur");
		Account account3 = new Account("Nikolay", "Ivanov", "NikolayIvanov@yandex.ru", "123");

		System.out.println("������ୠ� 9");
		System.out.println();
		System.out.println("���������� ����� Account:");
		System.out.println("1) ��������� ��� ��ࠬ��஢:");
		account1.OutputAccount();
		System.out.println("2) ��������� � 1-�� ��ࠬ��஬:");
		account2.OutputAccount();
		System.out.println("3) ��������� � ��ࠬ��ࠬ�:");
		account3.OutputAccount();
		System.out.println("\n\n");
		
		Figure figure1 = new Figure();
		Figure figure2 = new Figure(1);
		Figure figure3 = new Figure(2,3);

		System.out.println("������ୠ� 9");
		System.out.println();
		System.out.println("���������� ����� figure:");
		System.out.println("1) ��������� ��� ��ࠬ��஢:");
		figure1.OutputFigure();
		System.out.println("2) ��������� � 1-�� ��ࠬ��஬:");
		figure2.OutputFigure();
		System.out.println("3) ��������� � ��ࠬ��ࠬ�:");
		figure3.OutputFigure();
		System.out.println("\n\n");
		
		Friends friend1 = new Friends();
		Friends friend2 = new Friends("Egor");
		Friends friend3 = new Friends("Gloria", "Jean");

		System.out.println("������ୠ� 9");
		System.out.println();
		System.out.println("���������� ����� Friends:");
		System.out.println("1) ��������� ��� ��ࠬ��஢:");
		friend1.OutputFriends();
		System.out.println("2) ��������� � 1-�� ��ࠬ��஬:");
		friend2.OutputFriends();
		System.out.println("3) ��������� � ��ࠬ��ࠬ�:");
		friend3.OutputFriends();
		System.out.println("\n\n");
		
		Music music1 = new Music();
		Music music2 = new Music("Not Afraid");
		Music music3 = new Music("Here We Go", "Eminem");

		System.out.println("������ୠ� 9");
		System.out.println();
		System.out.println("���������� ����� Music:");
		System.out.println("1) ��������� ��� ��ࠬ��஢:");
		music1.OutputMusic();
		System.out.println("2) ��������� � 1-�� ��ࠬ��஬:");
		music2.OutputMusic();
		System.out.println("3) ��������� � ��ࠬ��ࠬ�:");
		music3.OutputMusic();
		System.out.println("\n\n");
		
		Messages message1 = new Messages();
		Messages message2 = new Messages("Nikolay Krasnov");
		Messages message3 = new Messages("My Friends", "Student", "Good morning!");

		System.out.println("������ୠ� 9");
		System.out.println();
		System.out.println("���������� ����� Messages:");
		System.out.println("1) ��������� ��� ��ࠬ��஢:");
		message1.OutputMessages();
		System.out.println("2) ��������� � 1-�� ��ࠬ��஬:");
		message2.OutputMessages();
		System.out.println("3) ��������� � ��ࠬ��ࠬ�:");
		message3.OutputMessages();
		System.out.println("\n\n");
		
		
		Like like1 = new Like(), like2 = new Like(3);

		System.out.println("������ୠ� 9");
		System.out.println();
		System.out.println("���������� ����� Like:");
		System.out.println("1) ��������� ��� ��ࠬ��஢:");
		like1.Displayamount();
		System.out.println("2) ��������� � 1-�� ��ࠬ��஬, �� �� � ��ࠬ��ࠬ�:");
		like2.Displayamount();
		System.out.println("\n\n");


		System.out.println("������ୠ� 9");
		System.out.println();
		Friends[] friends = new Friends[3];
		for (int j = 0; j < 3; j++)
			friends[j] = new Friends("Ivanov" + (j + 1));
		System.out.println("���樠����஢��� ������让 ���ᨢ ��������஬ � ����� ��ࠬ��஬:");
		for (int j = 0; j < 3; j++)
			friends[j].OutputFriends();
		System.out.println("\n\n");
		
		
		System.out.println("������ୠ� 9");
		System.out.println();
		System.out.println("�த�������஢��� ࠧ��稥 ����� ������ � ��㡮��� ����஢�����:");
		Like likeTestCopy1 = new Like(4), likeTestCopy2 = new Like(5);

		likeTestCopy2 = likeTestCopy1;

		System.out.println("�����孮�⭠� ����� 1-�� ��ꥪ� �� 2-��:");
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("");
		System.out.println("��������� 1-�� ��ꥪ�, � 2-�� �� �ண�����:");
		likeTestCopy1.Set(3);
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("");

		likeTestCopy1.Set(4);
		likeTestCopy2 = new Like(likeTestCopy1);

		System.out.println("��㡮��� ����� 1-�� ��ꥪ� �� 2-��:");
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("");
		System.out.println("��������� 1-�� ��ꥪ�, � 2-�� �� �ண�����:");
		likeTestCopy1.Set(3);
		likeTestCopy1.Displayamount();
		likeTestCopy2.Displayamount();
		System.out.println("\n\n");*/
		/*Like like1 = new Like();

		System.out.println("������ୠ� 10\n");
		System.out.println("������ ������⢮ �業�� - �᫮ � �।���� �� 0 �� ���᪮��筮��!\n");

		while (like1.Get() == 0)
		{
			like1.InpLike();
		}

		System.out.println("��������� ������⢮ �業��: " + like1.Get());
*/

	/*Like[] like1 = new Like[3]; Like [][] like2 = new Like[2][2];

		like1[0] = new Like();
		like1[1] = new Like();
		like1[2] = new Like();

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				like2[i][j] = new Like();


		// ��ᢠ������
		//=================================
		like1[0].Set(3);
		like1[1].Set(4);
		like1[2].Set(5);

		int bases = 4;

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				like2[i][j].Set(bases + j);
		//=================================

		// �뢮�
		//=================================
		System.out.println("�������� ���ᨢ ࠧ��஬ [3]");
		for (int i = 0; i < 3; i++)
		{
			like1[i].Displayamount();
			System.out.println();
		}
		System.out.println();

		System.out.println("��㬥�� ���ᨢ ࠧ��஬ [2][2]");
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
			{
				like2[i][j].Displayamount();
				System.out.println();
			}
		//=================================
*/	
				
				
				/*Human human1 = new Human("Ivan", "Ivanov");
				
						
					System.out.println("3) Продемонстрировать перегрузку метода базового");
					System.out.println("  класса в производном классе(с вызовом метода базового");
					System.out.println("  класса и без такого вызова)\n");
				
						human1.DisplayInfo();
						friend1.DisplayInfo();
						System.out.println();
						human1.SayHello();
						friend1.SayHello();
						System.out.println(human1.WhoIs());
						System.out.println(friend1.WhoIs());
	
						*/
						/*Friends friend1 = new Friends("Anton", "Antonov");
						friend1.DisplayInfo();
						*/
						/*Friends friend1 = new Friends("Anton", "Antonov");
						System.out.println("6) Заменить методы Display используя метод toString для Java\n");
						System.out.println("Name and Surname: " + friend1.ToString());
						*/
						/*Friends friend1 = new Friends("Anton", "Antonov");
						Human human1 = new Human("Ivan", "Ivanov");
			System.out.println("7) Придумать разумное использование виртуальных функций и создать их в вашем проекте.\n");

		human1.DisplayInfo();
		friend1.DisplayInfo();
		System.out.println();
		human1.SayHello();
		friend1.SayHello();

		Human Humane = new Human("Anatoliy", "Sidorov");
		Friends Friend = new Friends("Vladimir", "Smirnov");
		Human pHumane = Friend;
		Friends pFriend = Friend;
		Human pHumane2 = Humane;

		System.out.println("========================================================");
		System.out.println();
		System.out.println("Объект класса Friends");
		Friend.DisplayInfo();
		System.out.println();
		System.out.println("Указатель класса Human на класс Friends");
		pHumane.DisplayInfo();
		System.out.println();
		System.out.println("Указатель класса Human на класс Friends");
		pHumane2.DisplayInfo();
		System.out.println();
		System.out.println("Вызов виртуальной функции через не виртуальную базового класса");
		System.out.println("от объекта класса Friends");
		Friend.SayHello();
		System.out.println();
		System.out.println("Вызов виртуальной функции через не виртуальную базового класса");
		System.out.println("от объекта класса Human");
		Humane.SayHello();
		System.out.println();
		System.out.println("от указателя Human на объект класса Friends");
		System.out.println(pHumane.WhoIs());
		System.out.println();
		System.out.println("от указателя Human на объект класса Human");
		System.out.println(pHumane2.WhoIs());
		System.out.println();
		System.out.println("от указателя Friends на объект класса Friends");
		System.out.println(pFriend.WhoIs());
 
		/*Friends friend1 = new Friends("Marina","Ivanova");
		System.out.println("8) В проектах на C++,  Java, C# придумать разумное использовани\nабстрактного класса и создать его. Продемонстрировать его использование;\n");
		friend1.InpHuman();
		System.out.println();
		friend1.DisplayInfo();
*/
	/*	Friends friend1 = new Friends("Anton", "Antonov");
	    Account account1 = new Account();
	    account1.SetSurname("Gerasimov");
	    account1.SetName("Nikolay");
	    

		System.out.println("9) В  проектах Java, C# придумать разумное использование интерфейсов.\nПродемонстрировать их использование");
		System.out.println();
		
		
		friend1.DisplayInfo();
		account1.DisplayInfo();

		System.out.println();

		System.out.println(friend1.WhoIs());
		System.out.println(account1.WhoIs());
*/
		System.out.println("10) Продемонстрировать различие между мелким и глубоким копированием:");
		Friends friend1 = new Friends("Anton", "Antonov");
		Friends friend2 = new Friends("Ivan", "Ivanov");

		
		friend2 = friend1;

		System.out.println("Поверхностная копия 1-го объекта во 2-ой:");
		friend1.DisplayInfo();
		friend2.DisplayInfo();
		System.out.println("");
		System.out.println("Изменение 1-го объекта, а 2-ой не трогается:");
		friend1.Set("Anton", "Antonov");
		friend1.DisplayInfo();
		friend2.DisplayInfo();
		System.out.println("");

		friend1.Set("Vladimir", "Gerasimov");
		friend2 = new Friends(friend1);

		System.out.println("Глубокая копия 1-го объекта во 2-ой:");
		friend1.DisplayInfo();
		friend2.DisplayInfo();
		System.out.println("");
		System.out.println("Изменение 1-го объекта, а 2-ой не трогается:");
		friend1.Set("Ivan", "Ivanov");
		friend1.DisplayInfo();
		friend2.DisplayInfo();
		System.out.println("\n\n");

	}


}