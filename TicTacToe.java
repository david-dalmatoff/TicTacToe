/* Purpose Statement	: Program constructs a 2-Dimensional game of tic tac toe
 * Author		: David Dalmatoff
 * File	Name	: TicTacToe.java
 * Date Started	: 
 * Date Ended	: 
 */


import java.util.Scanner;

public class TicTacToe {

private static char turn;
    
	//function that declares winning conditions
    private static boolean didWin(char [][] twoD,char turn){
        boolean win = false;												//initializes win to false. Switches to true after a winner has been declared accordingly
        
		//horizontal win
        if(twoD[1][1]==turn && twoD[1][2]==turn && twoD[1][3]==turn)		//if top row contains same values
        	win=true;
        if(twoD[2][1]==turn && twoD[2][2]==turn && twoD[2][3]==turn)		//if middle row contains same values
        	win=true;
        if(twoD[3][1]==turn && twoD[3][2]==turn && twoD[3][3]==turn)		//if bottom row contains same values
        	win=true;
        
		//vertical win
        if(twoD[1][1]==turn && twoD[2][1]==turn && twoD[3][1]==turn)		//if first column contains same values
        	win=true;
        if(twoD[1][2]==turn && twoD[2][2]==turn && twoD[3][2]==turn)		//if second column contains same values
        	win=true;
        if(twoD[1][3]==turn && twoD[2][3]==turn && twoD[3][3]==turn)		//if third column contains same values
        	win=true;
        
		//diagonal win
        if(twoD[1][1]==turn && twoD[2][2]==turn && twoD[3][3]==turn)		//if diagonal top left to bottom right contains same values
        	win=true;
		if(twoD[3][1]==turn && twoD[2][2]==turn && twoD[1][3]==turn)		//if diagonal top right to bottom left contains same values
        	win=true;
        return win;
    }
    
    private static void welcomePeople(){
    	 int [][] twoD2 = new int[5][5];		//creates two-dimensional array 5x5, 3 rows 3 columns and border between, totalling 5 rows and columns 
         int count=0;
         twoD2[0][2]=1;				//places a 1 in top left
         twoD2[0][3]=2;				//places a 2 in top middle
         twoD2[0][4]=3;				//places a 3 in top right
          
         twoD2[1][2]=4;				//places a 4 in middle row, left column
         twoD2[1][3]=5;				//places a 5 in middle row, middle column (dead center of playing board)
         twoD2[1][4]=6;				//places a 6 in middle row, right column
         
         
         twoD2[2][2]=7;				//places a 7 in bottom left
         twoD2[2][3]=8;				//places an 8 in bottom middle
         twoD2[2][4]=9;				//places a 9 in bottom right
         
         //prints a blank table with borders
          System.out.println("Welcome");
          System.out.println("|"+twoD2[0][2]  + "|" + twoD2[0][3] + "|" + twoD2[0][4]+ "|");	//prints first row
          System.out.println("-------");
          System.out.println("|"+twoD2[1][2]  + "|" + twoD2[1][3] + "|" + twoD2[1][4]+ "|");  	//second row
          System.out.println("-------");
          System.out.println("|"+twoD2[2][2]  + "|" + twoD2[2][3] + "|" + twoD2[2][4]+ "|");  	//third row
    	
          //prints the choices of board
          System.out.println();												//two blank lines for aesthetics 
          System.out.println();
          System.out.println("|"+ " " + "|" + " " + "|" + " "+ "|");		//prints first row of vertical borders that separate columns
          System.out.println("-------");									//row of horizontal lines to separate rows
          System.out.println("|"+"" + " " + "|" + " " + "|" + " "+ "|");  	//second row of vertical border
          System.out.println("-------");									//second row of horizontal lines
          System.out.println("|"+"" + " " + "|" + " " + "|" + " "+ "|"); 	//third row of vertical border
    	
    }
    
    
  
   //function to determine if user input was valid (entered 1 through 9)
   public static boolean isRight(int num)
   {
	   if(num>0 && num<=9)
		   return true;
	   return false;
   }
   
   //function to determine if the desired space is open to be marked
   public static boolean isSpace(char twoD[][], int num,char turn){
	   
	   switch(num){						//if the space is open, return true (9 cases for each of the 9 spots on the board)
	   case 1: if (twoD[0][1] == ' ')			//if space 1 is blank 
	   			twoD[0][1] = turn;				//add the current turn's marker into the space
	   			//System.out.println(twoD[0][1]);
	   			return true;
	   			
       case 2: if (twoD[0][2] == ' ')			//if space 2 is blank 
    	   		twoD[0][2] = turn;				//add the current turn's marker into the space
       			return true;
				
       case 3: if (twoD[0][3] == ' ')			//if space 3 is blank 
    	   		twoD[0][3] = turn;				//add the current turn's marker into the space
       			return true;
       			
	   case 4: if (twoD[1][1] == ' ')			//if space 4 is blank 
	   			twoD[1][1] = turn;				//add the current turn's marker into the space
	   			return true;
	   			
	   case 5:  if (twoD[1][2] == ' ')			//if space 5 is blank 
				twoD[1][2] = turn;				//add the current turn's marker into the space
	   			return true;
	   			
	   case 6:  if (twoD[1][3] == ' ')			//if space 6 is blank 
	   			twoD[0][2] = turn;				//add the current turn's marker into the space
	   			return true;
	   		
	   case 7:  if (twoD[2][1] == ' ')			//if space 7 is blank 
	   			twoD[2][1] = turn;				//add the current turn's marker into the space
	   			return true;
	   			
	   case 8:  if (twoD[2][2] == ' ')			//if space 8 is blank 
	   			twoD[2][2] = turn;				//add the current turn's marker into the space
	   			return true;
	   			
	   case 9:  if (twoD[2][3] == ' ')			//if space 9 is blank 
	   			twoD[2][3] = turn;				//add the current turn's marker into the space
	   			return true;
	   			
	   default:
		   
		   return false;				//if the space is not open, then returns false to isSpace
	   		
	   
	   
	   }
	   
   }
   
   //function allows the user to input through keyboard
   public static int getInput(){
	   Scanner getInput= new Scanner(System.in);
	   int input = getInput.nextInt();
	   
	   if(isRight(input)==true)
		   return input;
	   else {
		   System.out.println("Sorry, number is invalid.");		//prints error if the input is invalid
		   input = getInput();
	   }
	   return 0;
   }
   
   
   public static void printCurrTable(char[][] twoD ){
	   System.out.println("|"+twoD[1][1]  + "|" + twoD[1][2] + "|" + twoD[1][3]+ "|");  
       System.out.println("-------");
       System.out.println("|"+twoD[2][1]  + "|" + twoD[2][2] + "|" + twoD[2][3]+ "|");  
       System.out.println("-------");
       System.out.println("|"+twoD[3][1]  + "|" + twoD[3][2] + "|" + twoD[3][3]+ "|");  
       
 	
       //choices of board
       System.out.println();
       System.out.println();
       System.out.println("|"+ " " + "|" + " " + "|" + " "+ "|");  
       System.out.println("-------");
       System.out.println("|"+"" + " " + "|" + " " + "|" + " "+ "|");  
       System.out.println("-------");
       System.out.println("|"+"" + " " + "|" + " " + "|" + " "+ "|");
       
       for(int i=0;i<twoD.length;i++){
    	   for(int j=0;j<twoD[i].length;j++){
    		   System.out.print(twoD[i][j]);
    	   }
       }
	   
   }
   
    public static void main(String[] args) {
        
    	welcomePeople();
    	char [][] twoD = new char[5][5];
    	
    	char turn = 'X';
    	int num=1;
      
        
        boolean notWin = true;
       
        while(notWin){
        	if(num%2==0){
        		turn='O';
        	}
			else{
        		turn='X';
        	}
        	printCurrTable(twoD);
        	System.out.println("It is " + turn + "'s turn.");
        	int input =getInput();
        	
			if (isSpace(twoD,input,turn)==true){
        		if(didWin(twoD,turn)==true){
					System.out.println(turn+"'s"+" won!");
        			break;
        			}
					else{
        				num++;
        			}
        	}
        	else{
        		 System.out.println("Sorry.Space taken");
        	}
        }
    }
}
   
	



