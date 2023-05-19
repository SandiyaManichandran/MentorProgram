public class TaskSab
{
    public static void main(String[] args)
    {
        int count=1,a=1;
        for(int i=1;i<5;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print(count + " ");
                count = count * 10;
            }
            a = a +2;
            count = a;

            System.out.println( );

        }
    }
}
