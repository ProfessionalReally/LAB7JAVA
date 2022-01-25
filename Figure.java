import java.util.Scanner;

//Class Figure
public class Figure
{
	private int figure = 0; //Figure
	private int color = 0; //color
	
	public Figure() //constructor
{
	figure = 0; //Figure
	color = 0; //color
}
//Get
public int Getfigure()
{
	return this.figure;
}
public int Getcolor()
{
	return this.color;
}
//Init
public void InitFigure(int FIGURE, int COLOR) 
{
	this.figure = FIGURE;
	this.color = COLOR;
}
//Input
public void InputFigure() 
{
	String os = System.getProperty("os.name");
       String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        Scanner in = new Scanner(System.in, consoleEncoding);
		
	System.out.println("Please enter a figure(1 - Triangle, 2 - Circle, 3 - Square): ");
	figure = in.nextInt();
	System.out.println("Please enter a color(1 - Red, 2 - Green, 3 - Blue): ");
	color = in.nextInt();
	in.close();
}
//Output
public void OutputFigure() 
{
	if (figure == 0)
		System.out.println("Figure: Empty");
	if (figure == 1)
		System.out.println("Figure: Triangle");
	if (figure == 2)
		System.out.println("Figure: Circle");
	if (figure == 3)
		System.out.println("Figure: Square");
	if (color == 0)
		System.out.println("Color: Empty");
	if (color == 1)
		System.out.println("Color: Red");
	if (color == 2)
		System.out.println("Color: Green");
	if (color == 3)
		System.out.println("Color: Blue");
	System.out.println("");
	
}
//Delete
public void DeleteFigure() 
{
	this.figure = 0;
	this.color = 0;
}
}
