  const array = 
                        [
                            [1, 2, 3],
                            [4, 5, 6],
                            [7, 8, 9]
                          ];  
    
    
    for(let index = 0; index < array.length; index++){
      for(let indexOne = 0; indexOne < array.length-1; indexOne++){
        for(let count = indexOne + 1; count < array[index].length; count++){
          if (array[index][indexOne] < array[index][count]){
             exchange = array[index][indexOne];
            array[index][indexOne] = array[index][count];
            array[index][count] = exchange;
            
        }
      }
    }
  }
      for(let index = 0; index < array.length; index++){
      for(let count = 0; count < array[index].length; count++){
        console.log(array [index][count] + " ");
        
      }
       
      }
     
