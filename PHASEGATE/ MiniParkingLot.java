import java.util.Scanner;
public class MiniParkingSlot{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
    
    
        char slots [] = new char[20];

        for (int index = 0; index < slots.length; index++){
                slots[index] = '0';
            }
        
        
        String menu = """
          +++++++++++++++++++++++++++++++++++++++++++
                  MINI PARKING SLOT
          +++++++++++++++++++++++++++++++++++++++++++
                1. Display parking space
                2. Available slots 
                3. Monitor when a car leaves
                4. Exit 
                Choose an option:
                """;
                
          System.out.print(menu);
          
          boolean isReal = false;       
        while (true){   

        System.out.println("Available Slots");

        for (int index = 0; index < slots.length; index++){
            
                System.out.print(slots[index] + "  ");
            }
            System.out.println();
        

      
        System.out.print("They are twenty parking slots available pick a slot number from 1 to 20 to select your preffered space : ");
        int row = input.nextInt();

      
        if(row >= 1 && row <= 20){
        

            if (slots[row-1] == '0'){
                slots[row-1] = '1';

                System.out.println("Updated ParkingLot spaces");

                for (int index = 0; index < slots.length; index++){
                        System.out.print(slots[index] + "  ");
                    }
                    System.out.println();
                    break;

            } else{
                System.out.println("Sorry, this slot is already occupied.");
            }

        } else{
            System.out.println("Invalid selection. Please enter a valid row (1-20).");
        }
            isReal = false;
            
       
    }
}
}
