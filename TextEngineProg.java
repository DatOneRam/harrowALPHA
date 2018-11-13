/************************************************************
*Made By Ramsey Alsheikh                                    *
*Last Modified 10/01/28                                     *
*Objective: Make an game engine for running text based games*
************************************************************/
package harrow.TextEngine;
import java.util.Scanner;

public class TextEngineProg
{  
   //the only important things here are the stats and name
   private String name, enteredString, noMessageHolder;
   private short hp, atk, def, spd, hunger, thirst;
   private Scanner prompt = new Scanner(System.in);
   char enteredChar;
   private String errorm = "--I'm sorry, I did not understand thee, please type in A, B, or C--";
   
   //constructors to set name and hp at start (or not, if they want the default)
   public void TextEngine(String chosenName, short chosenHp)
   {
      chosenName = name;
      hp = chosenHp;
   }
   
   public void setName(String chosenName)
   {
      name = chosenName;
   }
   
   public String getName()
   {
      return name;
   }
   
   //set a stat to a specific value
   //returns void
   //two parameters to hold what stat they want and want they want it to be
   public void setStat(String chosenStat, short value)
   {
        chosenStat = chosenStat.toLowerCase();
        if (value < 0)
        {
          value = 0;
        }
       
        switch(chosenStat)
        {
            case "hp":
            case "health":
            {
                hp = value;
                break;
            }
            
            case "atk":
            case "attack":
            {
                atk = value;
                break;
            }
            
            case "def":
            case "defense":
            {
                def = value;
                break;
            }
            
            case "spd":
            case "speed":
            {
                spd = value;
                break;          
            }
            
            case "hunger":
            case "hung":
            {
                hunger = value;
                break;
            }
            
            case "thirst":
            case "thir":
            {
                thirst = value;
                break;
            }
            
            default:
            {
                System.out.println("--The developer using TextEngine tried to set a stat that doesn't exist. If you are the developer, 1. You are a failure and will never succeed in life, 2. Please look through the program for the included stats. If you aren't, sorry for this. bYYYYYeee--");
            }
        }
      }
              
      public short getStat(String chosenStat)
      {
        short returnedStat = 0;;
        
        chosenStat = chosenStat.toLowerCase();
        switch(chosenStat)
        {
            case "hp":
            case "health":
            {
                returnedStat = hp;
                break;
            }
            
            case "atk":
            case "attack":
            {
                returnedStat = atk;
                break;
            }
            
            case "def":
            case "defense":
            {
                returnedStat = def;
                break;
            }
            
            case "spd":
            case "speed":
            {
                returnedStat = spd;
                break;          
            }
            
            case "hunger":
            case "hung":
            {
                returnedStat = hunger;
                break;
            }
            
            case "thirst":
            case "thir":
            {
                returnedStat = thirst;
                break;
            }
            
            default:
            {
                System.out.println("--The developer using TextEngine tried to get a stat that doesn't exist. If you are the developer, 1. You are a failure and will never succeed in life, 2. Please look through the program for the included stats. If you aren't, sorry for this. bYYYYYeee--");
            }
        }
        return returnedStat;
      }
      
      public void changeStat(String chosenStat, short value)
      {  
      
         switch(chosenStat)
         {
            case "hp":
            case "health":
             {
                hp += value;
                if (hp < 0)
                {
                    hp = 0;
                }
                break;
             }
             case "atk":
             case "attack":
             {
                atk += value;
                if (atk < 0)
                {
                    atk = 0;
                }
                break;
             }
            
            
            case "def":
            case "defense":
            {
                def += value;
                if (def < 0)
                {
                    def = 0;
                }
                break;
            }
         
            case "spd":
            case "speed":
            {
                spd += value;
                if (spd < 0)
                {
                    spd = 0;
                }
                break;
            }
            
            
            case "hunger":
            case "hung":
            {
                hunger += value;
                if (hunger < 0)
                {
                    hunger = 0;
                }
                break;
            }
         
            case "thirst":
            case "thir":
            {
                thirst += value;
                if (thirst < 0)
                {
                    thirst = 0;
                }
                break;
            }
            
         default:
         {
            System.out.println("--The developer using this tried to add to a field that doesn't exist. If you are that developer, please look through your code and try to fix the error. Good Luck!");
         }
        }
      }
      
      public String readInput(String message)
      {
         System.out.println(message);
         message = prompt.nextLine();
         return message;
      }
      
      public String readInput()
      {
         enteredString = prompt.nextLine();
         return enteredString;
      }
      
      public String multipleChoice(String message, String a, String b, String c)
      {
         System.out.println(message);
         System.out.printf("A.%s, B.%s, or C.%s?\n(Type in the letter of your choice:)\n", a, b ,c);
         while (true)
         {  
            enteredString = readInput();
            enteredString += " ";
            enteredChar = (enteredString.toUpperCase()).charAt(0);
            if (enteredChar == 'A')
            {
               return "A";
            }
            else if (enteredChar == 'B')
            {
               return "B";
            }
            else if (enteredChar == 'C')
            {
             return "C";
            }
            else
            {
             System.out.println(errorm);
            }
         }
      }
      
      public void showStats(String mode)
      {
         if (mode == "all")
         {
            System.out.printf("\"%s\":\nHP:%,d\nATK:%,d\nDEF:%,d\nSPD:%,d\nHUNGER:%,d\nTHIRST:%,d\n", hp, atk, def, spd, hunger, thirst);
         }
         else if (mode == "hp")
         {
            System.out.printf("\"%s\":\nHP:%,d\n", hp);
         }
         else if (mode == "food")
         {
            System.out.printf("\"%s\":\nHP:%d\nHUNGER:%d\nTHIRST:%d\n", name, hp, hunger ,thirst);
         }
         else
         {
            System.out.printf("\"%s\":\nHP:%,d\nATK:%,d\nDEF:%,d\nSPD:%,d", hp, atk, def, spd);
         }
      }
}