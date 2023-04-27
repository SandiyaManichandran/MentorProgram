public class Task2
{
    public static void main(String args[])
        {
            int count=1,a =1;
            for(int i=1;i<=3;i++)
            {
                for(int k=3;k>=i;k--)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=a;j++)
                {
                    System.out.print(count);
                    count++;
                }
                a = a+2;
                System.out.println();
            }
        }
    }

