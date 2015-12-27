package project2;
import java.util.Scanner;

public class TicTacToe {

private static char turn;
    
    private static boolean didWin(char [][] twoD,char turn){
        boolean win = false;
        //horizontal
        if(twoD[1][1]==turn && twoD[1][2]==turn && twoD[1][3]==turn)
        	win=true;
        if(twoD[2][1]==turn && twoD[2][2]==turn && twoD[2][3]==turn)
        	win=true;
        if(twoD[3][1]==turn && twoD[3][2]==turn && twoD[3][3]==turn)
        	win=true;
        //vertical
        if(twoD[1][1]==turn && twoD[2][1]==turn && twoD[3][1]==turn)
        	win=true;
        if(twoD[1][2]==turn && twoD[2][2]==turn && twoD[3][2]==turn)
        	win=true;
        if(twoD[1][3]==turn && twoD[2][3]==turn && twoD[3][3]==turn)
        	win=true;
        //diagnoal
        if(twoD[1][1]==turn && twoD[2][2]==turn && twoD[3][3]==turn)
        	win=true;
        return win;
    }
    
    private static void welcomePeople(){
    	 int [][] twoD2 = new int[5][5];
         int count=0;
         twoD2[0][2]=1;
         twoD2[0][3]=2;
         twoD2[0][4]=3;
          
         twoD2[1][2]=4;
         twoD2[1][3]=5;
         twoD2[1][4]=6;
         
         
         twoD2[2][2]=7;
         twoD2[2][3]=8;
         twoD2[2][4]=9;
         
         //blank table
          System.out.println("Welcome");
          System.out.println("|"+twoD2[0][2]  + "|" + twoD2[0][3] + "|" + twoD2[0][4]+ "|");  
          System.out.println("-------");
          System.out.println("|"+twoD2[1][2]  + "|" + twoD2[1][3] + "|" + twoD2[1][4]+ "|");  
          System.out.println("-------");
          System.out.println("|"+twoD2[2][2]  + "|" + twoD2[2][3] + "|" + twoD2[2][4]+ "|");  
    	
          //choices of board
          System.out.println();
          System.out.println();
          System.out.println("|"+ " " + "|" + " " + "|" + " "+ "|");  
          System.out.println("-------");
          System.out.println("|"+"" + " " + "|" + " " + "|" + " "+ "|");  
          System.out.println("-------");
          System.out.println("|"+"" + " " + "|" + " " + "|" + " "+ "|"); 
    	
    }
    
    
  
   //checks to see if users number choice is between 1 and 9
   public static boolean isRight(int num)
   {
	   if(num>0 && num<=9)
		   return true;
	   return false;
   }
   //checks to see if space is clear and marks it if it is
   public static boolean isSpace(char twoD[][], int num,char turn){
	   switch(num){
	   case 1: if (twoD[0][1] == ' ') 
	   			twoD[0][1] = turn;
	   			System.out.println(twoD[0][1]);
	   			return true;
	   			
       case 2: if (twoD[0][2] == ' ')
    	   		twoD[0][2] = turn;
       			return true;
				
       case 3: if (twoD[0][3] == ' ')
    	   		twoD[0][3] = turn;
       			return true;
       			
	   case 4: if (twoD[1][1] == ' ')
	   			twoD[1][1] = turn;
	   			return true;
	   			
	   case 5:  if (twoD[1][2] == ' ')
	   		twoD[1][2] = turn;
	   			return true;
	   			
	   case 6:  if (twoD[1][3] == ' ')
	   			twoD[0][2] = turn;
	   			return true;
	   		
	   case 7:  if (twoD[2][1] == ' ')
	   			twoD[2][1] = turn;
	   			return true;
	   			
	   case 8:  if (twoD[2][2] == ' ')
	   			twoD[2][2] = turn;
	   			return true;
	   			
	   case 9:  if (twoD[2][3] == ' ')
	   			twoD[2][3] = turn;
	   			return true;
	   			
	   default:
		   
		   return false;
	   		
	   
	   
	   }
	   
   }
   //
   public static int getInput(){
	   Scanner getInput= new Scanner(System.in);
	   int input=getInput.nextInt();
	   if(isRight(input)==true){
		   return input;
		   
	   }else{
		   System.out.println("Sorry, number not valid");
		   input=getInput();
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
        	}else{
        		turn='X';
        	}
        	printCurrTable(twoD);
        	System.out.println("It is " + turn + "'s turn.");
        	int input =getInput();
        	if (isSpace(twoD,input,turn)==true){
        			if(didWin(twoD,turn)==true){
        				
        				System.out.println(turn+"'s"+" won!");
        				break;
        			}else{
        				num++;
        			}
        		}
        		
        		
        	 else{
        		 System.out.println("Sorry.Space taken");
        	 }
        }
        		
        			
        		
        	}
        
        	
        
        
        }
        
        
        
        
        
        /*
        
        showBoardCurrentState();
        showNumpad();
        
        //create turn, test if it is X/O's turn
        turn = 'X';
        System.out.println("It is " + turn + "'s turn.");
        boolean notWin = true;
        while(notWin){
        int input = getInput();
        
        //one method:
        convert from 1-9 to 2D array
            if not 1-9, repeat this step of getting input
            
        //one method:    
        at that spot, is it empty?
            if not, try again.

            notWin = win();
            //yes: done
            //no: repeat && change turn.
            changeTurn();
                    
                    if (turn == 'X')
                        turn = 'O';
                    else
                        turn = 'X';
        }
        /*
        int input = 3;

        char [][] myTic = { {' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '} };
        char turn = 'X';

        boolean worked = true;

        do{
            worked = true;
            if (input == 1 && myTic[0][0] == ' ') myTic[0][0] = turn;
            else if(input == 2 && myTic[0][1] == ' ') myTic[0][1] = turn;
            else if(input == 3 && myTic[0][2] == ' ') myTic[0][2] = turn;
            else{
                System.out.println("Sorry! The only values accepted are the digits of 1 through 9.");
                worked = false;
            }
        }
        while(worked == true);

        switch(input){
        case 1: if (myTic[0][0] == ' ') myTic[0][0] = turn;
        case 2: if (myTic[0][1] == ' ') myTic[0][1] = turn;
        case 3: if (myTic[0][2] == ' ') myTic[0][2] = turn;
        //as many cases as you want.
        default: System.out.println("Sorry! The only values accepted are the digits of 1 through 9.");
        }

        //output should be 0,2
        */
    
   
	



