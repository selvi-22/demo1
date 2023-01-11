package practice.loop;

import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        //int t=in.nextInt();
      //  for(int i=0;i<t;i++){
            int a = in.nextInt();//5
            int b = in.nextInt();//3
            int n = in.nextInt();//5
            
            for(int j=1;j<=n;j++)
            {
               for(int k=1;k<=j;k--)
                {
                    System.out.println(a+(j*b));
                    //5+1*3=8
                    //5+2*3=11
                }
               System.out.println(a+(j*b));

            }
        }
    //}
}

