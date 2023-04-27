public class sab {
    public static void main(String args[]) {
        int count = 10, a = 1, b = 8,c=1;
        for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k <= b; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++)
            {
                System.out.print(c + " ");
                c= count * 10;
            }
            //count = (i + 1) * 10;
            a++;
            count++;
            System.out.println();
            b = b - 4;
        }
    }
}
