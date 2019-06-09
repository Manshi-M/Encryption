import java.math.*;
import java.util.*;
public class Solution {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s=s.replaceAll("\\s","");
        int l,a,r,c;
        double p;
        l=s.length();
        p=Math.sqrt(l);
        a=(int)Math.abs(p);
        if((p-a)>0)
        {
            r=a;
            c=a+1;
        }
        else
        {
            r=a-1;
            c=a;
        }
        if((r*c)<l)
        {
            if(r>c)
                c=r;
            else
                r=c;
        } 
        char m[][]= new char[r][c];
        a=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a<l)
                m[i][j]=s.charAt(a++);
                else
                m[i][j]='-';
            }
        }        
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
                if(m[j][i]!='-')
                System.out.print(m[j][i]);    
            System.out.print(" ");
        }
        
    }
}
