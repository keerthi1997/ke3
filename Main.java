import java.util.*;
import java.io.*;
class Main{
  public static void main(String arg[])throws IOException 
  {
    int n,p,result=1;
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    n=Integer.parseInt(br.readLine());
    p=Integer.parseInt(br.readLine());
    if(n>=0&&p==0)
     {
        result=1;
     }
    else if(n==0&&p>=1)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
   {
            result=result*n;
   }      
     }
    System.out.println(result);
  
  }
}
