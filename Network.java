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
		System.out.print("�����ୠ� 8:\n\n");
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
	System.out.print("\n===================================\n");
	}
}