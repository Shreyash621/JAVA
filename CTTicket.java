import java.util.*;
public class CTTicket
{
	public static void main(String[] args) {
	    double tc=0.0;
	    double dis,c;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char circle=sc.next().charAt(0);
		char ref=sc.next().charAt(0);
		char coup=sc.next().charAt(0);
		if(n<5 || n>40){
		    System.out.println("Invalid");
		    return;
		}
		else{
		    if(n>20){
		        if(circle=='p'){
		            tc=tc+n*70;
		        }
		        else{
		            tc=tc+n*150;
		        }
		        dis=(tc*10)/100;
		        tc=tc-dis;
		    }
		    else{
		        if(circle=='p'){
		            tc=tc+n*70;
		        }
		        else{
		            tc=tc+n*150;
		        }
		    }
		    if(ref=='y'){
		        tc=(tc+(n*50));
		    }
		    else{
		        tc=tc;
		    }
		    if(coup=='y'){
		        c=((tc*2)/100);
		        tc=tc-c;
		    }
		    else{
		        tc=tc;
		    }
		    System.out.println(tc);
		}
	}
}
