package programs;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=null;
System.out.println("our string is s:" +s);
try
{
	char ch =s.charAt(3);
	System.out.println("char at 3rd :" +ch);
}
catch(Exception e)
{
	System.out.println("we are in catch box....");
}
System.out.println("thank you");
	}

}
