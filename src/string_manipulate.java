import java.util.Scanner;

public class string_manipulate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st1 = "";
        int op, count=0;
        System.out.print("Input the sentences: ");
        st1 = input.nextLine();
        do{
            System.out.println("\n\n1. Count the number of characters in the sentence.");
            System.out.println("2. Count the number of words in the sentence.");
            System.out.println("3. Convert the sentence to uppercase.");
            System.out.println("4. Convert the sentence to lowercase.");
            System.out.println("5. Exit");
            System.out.print("Input the number of operation: ");
            op = input.nextInt();
            switch (op){
                case 1:{
                    for(int i=0;i<st1.length();i++){
                            count++;
                        }
                    System.out.println("The amount of characters is : "+count);
                    break;
                    }
                case 2:{
                    int countwords = st1.split(" ").length;
                    System.out.println("The number of the word is: "+countwords);
                    break;
                }
                case 3:{
                    System.out.println("The uppercase of the sentences is: "+st1.toUpperCase());
                    break;
                }
                case 4:{
                    System.out.println("The lowercase of the sentences is: "+st1.toLowerCase());
                    break;
                }
                case 5: {
                    System.out.println("GoodBye!!!");
                    return;
                }
                default:
                    System.out.println("Invalid Input number!!!");
                    break;
            }
        }while(op!=5);
        input.close();
    }
}
