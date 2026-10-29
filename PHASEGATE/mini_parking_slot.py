def mini_parking_system(parking_slot):
    space = []
    
    for index in parking_slot:
        slot = '0'
        
        mini_parking_lot_menu = """
      ++++++++++++++++++++++++++++++++++++++++++
                    MINI PARKING SLOT
       +++++++++++++++++++++++++++++++++++++++++
                     
            1.  Display Parking Space
            2.  Available space
            3.  Monitor when a car leaves
            0.  Exit
       
                """
        print(mini_parking_lot_menu);
        
        is_real = False
        
        while True:
            slot_number = input("They are twenty parking slots available pick a slot number from 1 to 20 to select your preffered space: ")
        
            row = slot_number - 1;

        if row >= 1 && row < 20:
                  
            if slot[row -1 ] == '0':
                slot[row -1 ] = '1'
                
                for index in parking_slot:
                    print(parkingSlot, " ");
                        print();
                    break;
            
            else:
                print("Sorry, space already occupied.")
                 
        else: 
            print("Invalid space selection. Try again");
                is_real = False
