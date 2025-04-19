import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        int t=S.nextInt();
        while(t-->0)
        {
            int n=S.nextInt();
            int temp=n;
            int count=0;
            while(temp>0)
            {
                int digit=temp%10;
                if(digit!=0 && n%digit==0)
                {
                    count++;
                }
                temp=temp/10;
            }
        System.out.println(count);
    }}
}