import java.util.HashMap;
import java.util.Map;

public class StudentMain
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Maanya");
        s1.setPhoneNumber(9867564210L);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Sandiya");
        s2.setPhoneNumber(9867564211L);

        Student s3 = new Student();
        s3.setId(3);
        s3.setName("Sabari");
        s3.setPhoneNumber(9867564212L);

        Student s4 = new Student();
        s4.setId(4);
        s4.setName("Dharshini");
        s4.setPhoneNumber(9867564213L);

        Student s5 = new Student();
        s5.setId(5);
        s5.setName("Vishnu");
        s5.setPhoneNumber(9867564214L);

        Map<Integer, Student> s = new HashMap<>();
        s.put(s1.getId(),s1);
        s.put(2,s2);
        s.put(3,s3);
        s.put(4,s4);
        s.put(5,s5);
//        for (Map.Entry<Integer, Student> i : s.entrySet()) {
//                System.out.println(i.getValue().getId() +" "+i.getValue().getName()+" "+i.getValue().getPhoneNumber());
//            }

          for(Student i:s.values())
          {
              System.out.println(i.getId() +" "+i.getName()+" "+i.getPhoneNumber());
          }


//                System.out.println(s1.getId() +" "+s1.getName()+" "+s1.getPhoneNumber());
//                System.out.println(s2.getId() +" "+s2.getName()+" "+s2.getPhoneNumber());
//                System.out.println(s3.getId() +" "+s3.getName()+" "+s3.getPhoneNumber());
//                System.out.println(s4.getId() +" "+s4.getName()+" "+s4.getPhoneNumber());
//                System.out.println(s5.getId() +" "+s5.getName()+" "+s5.getPhoneNumber());
//



//        m.put(stu.getId(), stu);
//        //s1.put(2,"stu");
//        //s1.put(3,"stu");
//        Student stu1 = m.get(stu.getId());
//        System.out.println(stu1.getId());
//        System.out.println(stu1.getName());
//        System.out.println(stu1.getPhoneNumber());


    }
}
