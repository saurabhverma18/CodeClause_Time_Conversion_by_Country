import java.util.*;

public class GetTimeZone {
    public static void main(String args[]) {
        String[] ids = TimeZone.getAvailableIDs();

        for (String id : ids) {
            System.out.println(id);
        }
    }
}
