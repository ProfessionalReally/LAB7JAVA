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
	System.out.print("\n\n���������� ����⮢ � ᯨ᮪.\n\n");
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
		Messages message3 = new Messages("My teacher", "Student", "Good morning!");

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
		Like like1 = new Like();

		System.out.println("������ୠ� 10\n");
		System.out.println("������ ������⢮ �業�� - �᫮ � �।���� �� 0 �� ���᪮��筮��!\n");

		while (like1.Get() == 0)
		{
			like1.InpLike();
		}

		System.out.println("��������� ������⢮ �業��: " + like1.Get());


	}
}