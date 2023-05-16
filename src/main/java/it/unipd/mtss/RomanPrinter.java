////////////////////////////////////////////////////////////////////
// ANNALISA EGIDI 1216745
// GIULIA HU 2009118
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class RomanPrinter{
    public static String print(int num) throws InputNumberException{
    
        return printAsciiArt(IntegerToRoman.converti(num));
    }

    private static String printAsciiArt(String romanNumber){
           
        char[] arrayStr = romanNumber.toCharArray();
        String returnString="";
        for (char x : arrayStr) {
            switch(x)
            {
                case 'I':
                    returnString +="  _____ \r\n"+ " |_   _|\r\n"+ "   | |  \r\n"+ "   | |  \r\n"+ "  _| |_ \r\n"+ " |_____|\n";
                    break;
                case 'V':
                   returnString+= " __      __\r\n"+ " \\ \\    / /\r\n"+ "  \\ \\  / / \r\n"+ "   \\ \\/ /  \r\n"+ "    \\  /   \r\n"+ "     \\/    \n";
                   break;
                case 'X':
                   returnString+="__   __\r\n"+ " \\ \\ / /\r\n"+ "  \\ V / \r\n"+ "   > <  \r\n"+ "  / . \\ \r\n"+ " /_/ \\_\\\r\n"+ "        \n";
                   break;
                case 'D':
                    returnString+="  _____  \r\n"+ " |  __ \\ \r\n"+ " | |  | |\r\n"+ " | |  | |\r\n"+ " | |__| |\r\n"+ " |_____/ \r\n"+ "         \n";
                   break;
                case 'M': 
                    returnString+="  __  __ \r\n"+ " |  \\/  |\r\n"+ " | \\  / |\r\n"+ " | |\\/| |\r\n"+ " | |  | |\r\n"+ " |_|  |_|\r\n"+ "         \n";
                    break; 
                case 'L': 
                    returnString+="  _      \r\n"+ " | |     \r\n"+ " | |     \r\n"+ " | |     \r\n" 
                      + " | |____ \r\n" + " |______|\r\n" + "         \n";
                    break; 
                case 'C': 
                    returnString+="   _____ \r\n"+ "  / ____|\r\n"+ " | |     \r\n"+ " | |     \r\n"+ " | |____ \r\n"+ "  \\_____|\n";
                    break;
                
            }
        }
        //System.out.println(returnString);
        return returnString;
    }  
}
