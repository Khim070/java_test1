import java.util.Arrays;
import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int InvetorySize = 3, op, ProductCount=0;
        String[] InventoryProduct = new String[InvetorySize];
        int[] ProductAmount = new int[InvetorySize];
        do{
            System.out.println("\n1. View available products and their quantities.");
            System.out.println("2. Add a new product to the inventory with a specified quantity.");
            System.out.println("3. Update the quantity of an existing product in the inventory.");
            System.out.println("4. Remove a product from the inventory.");
            System.out.println("5. Exit");
            System.out.print("Please input the number of operation: ");
            op = input.nextInt();
            switch (op){
                case 1:
                    if(ProductCount==0){
                        System.out.println("The inventory is empty!");
                    }else{
                        for(int i=0;i<ProductCount;i++){
                            System.out.println(InventoryProduct[i]+" has "+ProductAmount[i]);
                        }
                    }
                    break;
                case 2:
                    if(ProductCount < InvetorySize){
                        System.out.print("Input the product name: ");
                        String newProduct = input.next();
                        System.out.print("Input the amount of "+newProduct+" : ");
                        int quantity = input.nextInt();
                        InventoryProduct[ProductCount] = newProduct;
                        ProductAmount[ProductCount] = quantity;
                        ProductCount++;
                    }else{
                        System.out.println("Inventory is full. Cannot add more products.");
                    }

                    break;
                case 3:
                    System.out.print("Input the name of product to update: ");
                    String UpdateProduct = input.next();
                    int UpdateIndex = -1;
                    for(int i=0;i<ProductCount;i++){
                        if(InventoryProduct[i].equalsIgnoreCase(UpdateProduct)){
                            UpdateIndex = i;
                            break;
                        }
                    }
                    if(UpdateIndex == -1){
                        System.out.println("Product not found in inventory!!!");
                    }else{
                        System.out.print("Input the new amount of the "+UpdateProduct+" : ");
                        int NewAmount = input.nextInt();
                        ProductAmount[UpdateIndex] = NewAmount;
                        System.out.println(UpdateProduct+" quantity update to "+NewAmount+" Successfully!!!");
                    }
                    break;
                case 4:
                    System.out.print("Input the name of product to remove: ");
                    String RemoveProduct = input.next();
                    int RemoveIndex = -1;
                    for(int i=0;i<ProductCount;i++){
                        if(InventoryProduct[i].equalsIgnoreCase(RemoveProduct)){
                            RemoveIndex = i;
                            break;
                        }
                    }
                    if(RemoveIndex == -1){
                        System.out.println("Product not found in inventory!!!");
                    }else{
                        for(int i=RemoveIndex;i<ProductCount;i++){
                            InventoryProduct[i] = InventoryProduct[i+1];
                            ProductAmount[i] = ProductAmount[i+1];
                        }
                        ProductCount--;
                        System.out.println(RemoveProduct+" removed from inventory successfully!!!");
                    }
                    break;
                case 5:
                    return;
            }
        }while(op!=5);
        input.close();
    }
}
