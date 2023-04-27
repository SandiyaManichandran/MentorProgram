public class Try
{
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int data = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Here the ");
        }
    }
}
