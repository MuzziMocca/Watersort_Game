
/**
 * Main class to run the program.
 */
import java.util.Scanner;
import java.util.*;
public class mainWatersort
{
       
     private static StackAsMyArrayList<Character> bottles[] = new StackAsMyArrayList[5];
     
     private static StackAsMyArrayList<Character> bottle1 = new StackAsMyArrayList<Character>();
     private static StackAsMyArrayList<Character> bottle2 = new StackAsMyArrayList<Character>();
     private static StackAsMyArrayList<Character> bottle3 = new StackAsMyArrayList<Character>();
     private static StackAsMyArrayList<Character> bottle4 = new StackAsMyArrayList<Character>();
     private static StackAsMyArrayList<Character> bottle5 = new StackAsMyArrayList<Character>();
     
     private static Character red = new Character('r');
     private static Character blue = new Character('b');
     private static Character yellow = new Character('y');
     
    public static void main(String[] args) {
     
     
     bottles[0] = bottle1;
     bottles[1] = bottle2;
     bottles[2] = bottle3;
     bottles[3] = bottle4;
     bottles[4] = bottle5;
     
     char peekVar;
     
     //Scrumbble the bottles and display for watersorting.
     fillBottles();
     showAll();
     
     System.out.print("\nBegin watersort (r - red; b - blue; y - yellow and q - quit: \n");
     
     Scanner sc = new Scanner(System.in);
         System.out.print("Enter source bottle number: ");
         int sourcBottle = sc.nextInt();
         System.out.print("Enter target bottle number: ");
         int targetBottle = sc.nextInt();
        
         //I want to use while and the isStackSolved() method  to let the user play until the game is solved or terminated.
         //But I am struggling to use the isStackSolved method.
         /**
          * while(bottle1.checkStackUniform() == false && bottle2.checkStackUniform() == false && bottle3.checkStackUniform() == false && 
             bottle4.checkStackUniform() == false && bottle5.checkStackUniform() == false)
                 "Code for watersorting goes here..."
         */
        
        //For testing and debugging purposes of the "watersorting code", I used a ForLoop.
        for(int i = 0; i < 100; i++){
             
                 
             if(sourcBottle == targetBottle){
             System.out.print("Cannot load on same bottle!!!" + " \n");
            }
             else if(targetBottle == 1 && bottle1.getStackSize() == 4 || targetBottle == 2 && bottle2.getStackSize() == 4 ||
             targetBottle == 3 && bottle3.getStackSize() == 4 || targetBottle == 4 && bottle4.getStackSize() == 4 || targetBottle == 5 && bottle5.getStackSize() == 4){
                 System.out.print("Target bottle full!!!" + "\n");
                }
             else{
                 if(sourcBottle == 1 && targetBottle == 2){
                    peekVar = bottle1.peek();           //Identify the Peek Variable (last in) for the source bottle.
                    bottle1.pop();                      //Remove the peek variable in the bottle.
                    bottle2.push(new Character(peekVar));//Place the peek variable in the target bottle.
                }
                else if(sourcBottle == 1 && targetBottle == 3){
                    peekVar = bottle1.peek();
                    bottle1.pop();
                    bottle3.push(new Character(peekVar));
                }
                else if(sourcBottle == 1 && targetBottle == 4){
                    peekVar = bottle1.peek();
                    bottle1.pop();
                    bottle4.push(new Character(peekVar));
                }
                else if(sourcBottle == 1 && targetBottle == 5){
                    peekVar = bottle1.peek();
                    bottle1.pop();
                    bottle5.push(new Character(peekVar));
                }
                else if(sourcBottle == 2 && targetBottle == 1){
                    peekVar = bottle2.peek();
                    bottle2.pop();
                    bottle1.push(new Character(peekVar));
                }
                else if(sourcBottle == 2 && targetBottle == 3){
                    peekVar = bottle2.peek();
                    bottle2.pop();
                    bottle3.push(new Character(peekVar));
                }
                else if(sourcBottle == 2 && targetBottle == 4){
                    peekVar = bottle2.peek();
                    bottle2.pop();
                    bottle4.push(new Character(peekVar));
                }
                else if(sourcBottle == 2 && targetBottle == 5){
                    peekVar = bottle2.peek();
                    bottle2.pop();
                    bottle5.push(new Character(peekVar));
                }
                else if(sourcBottle == 3 && targetBottle == 1){
                    peekVar = bottle3.peek();
                    bottle3.pop();
                    bottle1.push(new Character(peekVar));
                }
                else if(sourcBottle == 3 && targetBottle == 2){
                    peekVar = bottle3.peek();
                    bottle3.pop();
                    bottle2.push(new Character(peekVar));
                }
                else if(sourcBottle == 3 && targetBottle == 4){
                    peekVar = bottle3.peek();
                    bottle3.pop();
                    bottle4.push(new Character(peekVar));
                }
                else if(sourcBottle == 3 && targetBottle == 5){
                    peekVar = bottle3.peek();
                    bottle3.pop();
                    bottle5.push(new Character(peekVar));
                }
                else if(sourcBottle == 4 && targetBottle == 1){
                    peekVar = bottle4.peek();
                    bottle4.pop();
                    bottle1.push(new Character(peekVar));
                }
                else if(sourcBottle == 4 && targetBottle == 2){
                    peekVar = bottle4.peek();
                    bottle4.pop();
                    bottle2.push(new Character(peekVar));
                }
                else if(sourcBottle == 4 && targetBottle == 3){
                    peekVar = bottle4.peek();
                    bottle4.pop();
                    bottle3.push(new Character(peekVar));
                }
                else if(sourcBottle == 4 && targetBottle == 5){
                    peekVar = bottle4.peek();
                    bottle4.pop();
                    bottle5.push(new Character(peekVar));
                }
                else if(sourcBottle == 5 && targetBottle == 1){
                    peekVar = bottle5.peek();
                    bottle5.pop();
                    bottle1.push(new Character(peekVar));
                }
                else if(sourcBottle == 5 && targetBottle == 2){
                    peekVar = bottle5.peek();
                    bottle5.pop();
                    bottle2.push(new Character(peekVar));
                }
                else if(sourcBottle == 5 && targetBottle == 3){
                    peekVar = bottle5.peek();
                    bottle5.pop();
                    bottle3.push(new Character(peekVar));
                }
                else if(sourcBottle == 5 && targetBottle == 4){
                    peekVar = bottle5.peek();
                    bottle5.pop();
                    bottle4.push(new Character(peekVar));
                }
                else{
                    System.out.print("Select a correct bottle!!!" + " \n");
                }
            }
            
             //Display the bottles to be watersorted.
             showAll();
             
             System.out.print("\nEnter source bottle number: ");
             sourcBottle = sc.nextInt();
             System.out.print("Enter target bottle number: ");
             targetBottle = sc.nextInt();
        }
     
     //Display the watersorted bottles.
     showAll();
     
    }
    
    //Display all the bottles and their colours.
    public static void  showAll()
        {
            int j = 1;
             for(int i = 0; i <  bottles.length; i++)
            {
                System.out.println("Bottle " + j + " " + bottles[i].toString());
                j++;
            }
            
            
        }
        
        //Fill/Stack the bottles with random colours.
        public static void fillBottles(){
    
        
        int prvNum = 0;
        
        for(int a=0; a<3; a++){
            
            int randNum = 1 + new Random().nextInt(3);
            
            if(randNum == prvNum){
                Random rand = new Random();
                randNum = 1 + rand.nextInt(3);
            }
            
            if(randNum == 1){
                bottle1.push(red);
                bottle2.push(yellow);
                bottle3.push(blue);
                bottle3.push(yellow);
                bottle5.push(blue);
                }
            else if(randNum == 2){
                bottle1.push(red);
                bottle2.push(blue);
                bottle3.push(red);
                bottle4.push(yellow);
                bottle5.push(red);
            }
            else{
                bottle1.push(blue);
                bottle2.push(yellow);
                bottle3.push(blue);
                bottle4.push(red);
                bottle5.push(yellow);
            }
            
            prvNum = randNum;
            
        }
        
    }    
        //Check if the stacked bottles are in the same stack of colours.
        public static boolean solved(StackAsMyArrayList bottles[]){
        
            boolean isSolved = true;
            
            for(int j = 0; j < bottles.length; j++){
                if(bottles[j].getStackSize() != 4 && !bottles[j].checkStackUniform()){
                    isSolved = false;
                }
            }
            
            return isSolved;
    }
    
    
}
