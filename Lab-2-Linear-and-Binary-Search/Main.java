import java.util.*;  


class Main{

public static void main(String[] args)
  {
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size for your Array: ");
    int size = scan.nextInt();
    int[] array = new int[size];
    
    
  
       

    for (int i=0; i < size; i++) {
    int randomNum = (int)(Math.random()*10* size + 1); 
      array[i] = randomNum;
    
   System.out.println(array[i]);
    }
    // linear search bio o - O(N)
    System.out.print("Search for a number: ");
    int searching = scan.nextInt();
    var found = false;
    int count = 0;
    for (int i=0; i < size; i++)  {
        if (searching == array[i]){
        found = true;
        System.out.println("Linear search for " + array[i] + " took " + i + " steps.");
       }
        
    }
     if(found == false){
        System.out.println("Not found: " + size);
      }
    
    
      
            
    
    
    
    
      
     Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    
    
    System.out.print("Search for a number: ");
    int sort = scan.nextInt();
    int low = 0;
    int high = size - 1;
    int steps = 0;
    
    // Binary search bio o - O(log n)
    while (low <= high) {
    int middle = (low + high) / 2;
    if (sort == array[middle] ){
      found = true;
      steps += 1;
      System.out.println("Binary search for " + sort + " was found in element " + middle + " and took " + steps + " steps");
      break;
    }
     else if (sort < array[middle]){
        high = middle - 1;
       steps += 1;
        
      }
      else {
        low = middle + 1;
       steps += 1;
      }
      
    }
     if(found == false){
        System.out.println("Not found");
     }
    
    }
      
    
    }

    
    
    

    

  



