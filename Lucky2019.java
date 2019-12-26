/*
This Java application prints the first 314 lucky numbers to the standard output stream. 
The format is: the number of the list (ie 1, 2, 3 ...), then three periods, then the actual lucky number (ie 1, 3, 7 ...). 

@creator: John Cody
@created: 02019.01.30
*/

public class Lucky2019 {
 public static void main(String[] argv) {
     int cursor = 2;
     int counter = 0;
     boolean numbers[] = new boolean[2400]; 
     
     for(int i = 0; i < 2400; i++) {
         if((i % 2) == 1) {
             numbers[i] = true;
         }
         else {
             numbers[i] = false;
         }
     }
     
     System.out.println(1 + "..." + 1);
     
     for(int i = 2; i < 315; i++){
         counter = 0;
         while(!numbers[cursor]) {
             cursor++;
         }
         
         for(int j = 1; j < 2400; j++) {
             if(numbers[j]){
                 counter++;
                 if(counter == cursor){
                     numbers[j] = false;
                     counter = 0;
                 }
             }
         }
         
         System.out.println(i + "..." + cursor);
         cursor++;
     }
 }
}