package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
• Write an exception class called StringTooLongException. This
        exception will be thrown whenever a string is discovered
        that has too many characters in it, say more than 20

• Write a main program that reads lines from a file and prints
        them to the console. If a line has too many characters, the
        exception is thrown

• Catch and handle the exception when it is thrown. Handle
        the exception by printing the exception message and
        truncating the offending line down to 20 characters before
        printing it as well and continuing on to the next line
 */
public class Main {

    public static void main(String[] args) {
        try(
        Scanner s =new Scanner(new File("./src/exception/test.txt"))){
            while (s.hasNextLine()){
                String line=s.nextLine();
                try{if(line.length()>20){
                    throw new StringTooLongException();
                }
                else{
                System.out.println(line);}}
                catch ( StringTooLongException st){
                    System.out.println("Line is too long:~~ "+ line);
                }
            }
        }
        catch (FileNotFoundException e ){e.printStackTrace();}

    }





    public static class StringTooLongException extends IllegalArgumentException{
        private StringTooLongException(){}
    private StringTooLongException(String msg) {
            super(msg);
        }
    }



 }
