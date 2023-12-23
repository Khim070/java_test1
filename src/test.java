import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        System.out.print("Input idNumber: ");
        str1 = s.next();
        System.out.print("Input dob: ");
        str2 = s.next();
        System.out.print("Input gender(M/F): ");
        str3 = s.next();
        System.out.print("Input lastNameEn: ");
        str4 = s.next();
        System.out.print("Input firstNameEn: ");
        str5 = s.next();
        System.out.print("Input expiredDate: ");
        str6 = s.next();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
    }
}