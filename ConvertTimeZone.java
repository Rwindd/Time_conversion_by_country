import java.util.*;
import java.text.*;

class ConvertTimeZone
{
    public static void main(String[] args)
    {
       
        String format="dd-M-yyyy hh:mm:ss a";
        SimpleDateFormat dateFormat=new SimpleDateFormat(format);
       
        Date dt=new Date();


        String defaultTZ=TimeZone.getDefault().getID();
        System.out.println(defaultTZ);


        Calendar cal=new GregorianCalendar();
        cal.setTime(dt);


        System.out.println("Date:"+dateFormat.format(cal.getTime()));
        System.out.println("TimeZOne:"+cal.getTimeZone().getID());
        System.out.println("Timezone Name:"+cal.getTimeZone().getDisplayName());


        TimeZone jnbTZ=TimeZone.getTimeZone("Africa/Johannesburg");
        SimpleDateFormat jnbFormat=new SimpleDateFormat(format);
        jnbFormat.setTimeZone(jnbTZ);


        cal.setTimeZone(jnbTZ);


        System.out.println("After Conversion");
        System.out.println("Date:"+jnbFormat.format(cal.getTime()));
        System.out.println("TimeZOne:"+cal.getTimeZone().getID());
        System.out.println("Timezone Name:"+cal.getTimeZone().getDisplayName());

    }

}
