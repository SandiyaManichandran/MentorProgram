import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarMain
{
    public static void main(String[] args)
    {
        Car s1=new Car();
        s1.setColor("Red");
        s1.setBrandName("Swift");
        s1.setChasisNumber("SV30-0169266");
        List<String> myCar = new ArrayList<String>();
        myCar.add("Brake");
        myCar.add("AC");
        myCar.add("MusicSystem");
        s1.setFeatures(myCar);

        Car s2=new Car();
        s2.setColor("White");
        s2.setBrandName("Tiago");
        s2.setChasisNumber("SV30-0169267");
        List<String> myCar1 = new ArrayList<String>();
        myCar1.add("Lock");
        myCar1.add("Airbags");
        myCar1.add("Sensors");
        s2.setFeatures(myCar1);

        Car s3=new Car();
        s3.setColor("Black");
        s3.setBrandName("Indigo");
        s3.setChasisNumber("SV30-0169268");
        List<String> myCar2 = new ArrayList<String>();
        myCar2.add("ArmRest");
        myCar2.add("ChildLock");
        myCar2.add("IRVM");
        s3.setFeatures(myCar2);

        Car s4=new Car();
        s4.setColor("Green");
        s4.setBrandName("Tata");
        s4.setChasisNumber("SV30-0169269");
        List<String> myCar3 = new ArrayList<String>();
        myCar3.add("Bumpers");
        myCar3.add("Door Handles");
        myCar3.add("Power Steering");
        s4.setFeatures(myCar3);

        Car s5=new Car();
        s5.setColor("Yellow");
        s5.setBrandName("Benz");
        s5.setChasisNumber("SV30-0169260");
        List<String> myCar4 = new ArrayList<String>();
        myCar4.add("Socket");
        myCar4.add("Seatbelts");
        myCar4.add("Sunroof");
        s5.setFeatures(myCar4);

        Map<String,Car> ca = new HashMap<String,Car>();

        ca.put(s1.getChasisNumber(),s1);
        ca.put(s2.getChasisNumber(),s2);
        ca.put(s3.getChasisNumber(),s3);
        ca.put(s4.getChasisNumber(),s4);
        ca.put(s5.getChasisNumber(),s5);

        //keys
//        for(String k: ca.keySet())
//        {
//            Car caa = ca.get(k);
//            System.out.println(caa.getColor()+ " "+caa.getBrandName()+" "+caa.getChasisNumber()+" "+ caa.getFeatures());
//        }

    //valuesqa
        for(Car caa: ca.values())
        {

            System.out.println(caa.getColor()+ " "+caa.getBrandName()+" "+caa.getChasisNumber()+" "+ caa.getFeatures());
        }



//        System.out.println(s.getColor());
//        System.out.println(s.getBrandName());
//        //System.out.println(s.getChasisNumber());
//        System.out.println(s.getFeatures());




    }
}
