package programs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example_2_compile_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	FileInputStream fil =new FileInputStream("ex.txt");
}
catch(FileNotFoundException e)
{
	e.printStackTrace();
}
	}

}
