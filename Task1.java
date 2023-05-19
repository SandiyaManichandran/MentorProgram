import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1
{
    public static void main(String[] args)
    {
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2=new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3=new ArrayList<Integer>();
        //  int i = 0;
        int a = list1.size();
        int j = 0;

        for(int i = 0;i<list1.size()+list2.size();i++ )
        {
            if (i < a)
            {
                list3.add(list1.get(i));
            }
            else
            {

                list3.add(list2.get(j));
                j++;

            }


        }
        //  for(int j = 0; j< list2.size();j++)
        //  {
        //      list3.add(list2.get(j));
        //  }

        System.out.println("output "+ list3);

    }
}