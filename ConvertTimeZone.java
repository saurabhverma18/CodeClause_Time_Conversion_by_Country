import java.util.*;
import java.text.*;

class ConvertTimeZone {

    public static void main(String args[]) {
        String format = "dd-mm-yyyy hh:mm:ss a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        Date dt = new Date();

        String defaultTZ = TimeZone.getDefault().getID();
        System.out.println("\n\n----Before Conversion----");
        System.out.println(defaultTZ);

        Calendar cal = new GregorianCalendar();
        cal.setTime(dt);

        System.out.println("Date:" + dateFormat.format(cal.getTime()));
        System.out.println("TimeZone:" + cal.getTimeZone().getID());
        System.out.println("Timezone Name:" + cal.getTimeZone().getDisplayName() + "\n");

        System.out.print(
                "Enter the Country name with continent in which to convert time in format Continent/Country: ");

        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        System.out.println("\n");

        TimeZone convert = TimeZone.getTimeZone(country);
        SimpleDateFormat date = new SimpleDateFormat(format);

        date.setTimeZone(convert);
        cal.setTimeZone(convert);

        System.out.println("-----After Conversion-----");
        System.out.println("Date:" + date.format(cal.getTime()));
        System.out.println("TimeZone:" + cal.getTimeZone().getID());
        System.out.println("TimeZone Name:" + cal.getTimeZone().getDisplayName());

        ;
    }
}