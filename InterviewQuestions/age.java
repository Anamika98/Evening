package InterviewQuestions;
import java.util.*;
class input{
	public int id;
	public String name;
	public double age;
	input(int id,String name,double age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
class hello
{
    public static input lowestAge(input arr[])
  {
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=0;j<arr.length-i-1;j++)
    		{
    			if((arr[j].age)>(arr[j+1].age))
                  {
    				 input temp=arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]=temp;
    				
    				
    				
	
                   }
    			
    		}
    	}
    return arr[1];
	
  }
}
public class age {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		input arr[]=new input[4];
		/*for(int i=0;i<4;i++)
		{
		  	int a=sc.nextInt();
		  	String b=sc.nextLine();
		  	double c=sc.nextDouble();
		  	arr[i]=new input(a,b,c);
		}*/
		arr[0]=new input(1,"ana",32);
		arr[1]=new input(2,"anam",90);
		arr[2]=new input(3,"anae",87);
		arr[3]=new input(4,"anai",110);
		hello hel=new hello();
		input obj=hel.lowestAge(arr);
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

}
