public class Task
{
    public static void main(String args[])
    {
        int count=1,a =1, b= 8;
        for(int i=0;i<3;i++)
        {
            for(int k=0;k<=b;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++)
            {
                System.out.print(count+" ");
                count= count *10;
            }
            count= (i+1)*10;
            a = a+2;
            System.out.println();
            b = b-4;
        }
    }
}