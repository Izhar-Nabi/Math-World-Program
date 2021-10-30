import java.util.Scanner;
class MathWorld{
	public int add (int a, int b){
	return(a+b);}
	public int sub (int a, int b){
	return(a-b);}
	public int Multi(int a, int b){
	return(a*b);	}
	public float division(int a ,int b){
	int divi=a/b;
	return divi;	}
	public long Factorial(long a){
	long fact=1;
	for(int i=1; i<=a; i++){
	fact*=i;}
	return(fact);
		}
	public int square(int a){
	return (a*a);	}
	public int cube(int a){
	return(a*a*a);	}
	public void table(int a){
	for(int j=1; j<=10; j++){
	System.out.println(a+ "*" +j +" ="+a*j);}
	}
	public static void main(String args[]){
	MathWorld Game= new MathWorld();
	System.out.println("\n\t\t\t WellCome To The MathWorld");
	Scanner num= new Scanner(System.in);
	System.out.println("Choose Any Number From Math-World");
	System.out.println("1- Addition \n" +"2- Substruction \n" +"3-Division \n" +"4-Multiplication \n" +"5-Factorial \n" +"6-Square \n" +"7-cube \n" +"8-Table \n");
	int c= num.nextInt();
	if(c==1){
	System.out.println("Enter the Number for Sum");
	int a= num.nextInt();
	int b= num.nextInt();
	System.out.println("Addition Of Given Number is ");
	int sum = Game.add(a,b);
	System.out.println(sum);}
	if(c==2){
	System.out.println("Enter the Number for Substration");
	int a= num.nextInt();
	int b= num.nextInt();
	System.out.println("Substraction Of Given Number is ");
	int subt = Game.sub(a,b);
	System.out.println(subt);}
	if(c==3){
	System.out.println("Enter the Number for Division");
	int a= num.nextInt();
	int b= num.nextInt();
	System.out.println("Division Of Given Number is ");
	float divide =Game.division(a,b);
	System.out.println(divide);}
	if(c==4){
	System.out.println("Enter the Number for Multiplication");
	int a= num.nextInt();
	int b= num.nextInt();
	System.out.println("Multplication Of Given Number is ");
	int Multiply=Game.Multi(a,b);
	System.out.println(Multiply);	}
	if(c==5){
	System.out.println("Enter the Number for Factorial");
	int a= num.nextInt();
	//int b= num.nextInt();
	System.out.println("Factorial Of Given Number is ");
	long facto= Game.Factorial(a);
	System.out.println(facto);}
	if(c==6){
	System.out.println("Enter the Number for Square");
	int a= num.nextInt();
	System.out.println("Square Of Given Number is ");
	int sq= Game.square(a);
	System.out.println(sq);}
	if(c==7){
	System.out.println("Enter the Number for Cube");
	int a= num.nextInt();
	System.out.println("Cube of Given Number is ");
	int cbe=Game.cube(a);
	System.out.println(cbe);}
	if(c==8){
	System.out.println("Enter the Number for Creating Table");
	int a= num.nextInt();
	System.out.println("Table Of Given Number is ");
	Game.table(a);
}	
		}
}