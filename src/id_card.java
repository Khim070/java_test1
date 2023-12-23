import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class id_card {
    public static void main(String[] args) {
        String s = "IDKHM1603633111<<<<<<<<<<<<<<<9501016M2406215KHM<<<<<<<<<<<6MEN<<CHENDA<<<<<<<<<<<<<<<<<<<";
        System.out.println(s.substring(5,14));
        try {
            SimpleDateFormat mrzDOB = new SimpleDateFormat("yyMMdd");
            Date date = mrzDOB.parse(s.substring(30, 36));
            SimpleDateFormat desireDOB = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDOB = desireDOB.format(date);
            System.out.println(formattedDOB);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(s.substring(37,38));
        System.out.println(s.substring(60,63));
        System.out.println(s.substring(65,71));
        try {
            SimpleDateFormat mrzDOB = new SimpleDateFormat("yyMMdd");
            Date date = mrzDOB.parse(s.substring(38,44));
            SimpleDateFormat desireDOB = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDOB = desireDOB.format(date);
            System.out.println(formattedDOB);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}