package ie.atu.Storing_data;

import java.io.*;
import java.util.Scanner;

public class Storing_Data {
    public static void main(String[] args) {
        {
            File myFile = new File("Myfile.txt");
            System.out.println("My file is located at" + myFile.getAbsolutePath());
            String content = "Details to write";
            /*
            try {
                PrintWriter MyWriter = new PrintWriter(
                        new FileWriter("New Line"), true);
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("This is a another file\t\n");
                myWriter.close();
            */

                Scanner keyboard = new Scanner(System.in);
                System.out.print("Enter filename: ");
                String filename = keyboard.nextLine();

                try (Scanner inputfile = new Scanner(new File(filename)))
                {
                    while(inputfile.hasNext())
                    {
                        String str = inputfile.nextLine();
                        System.out.println(str);
                    }
                }
                catch (FileNotFoundException e)
                     {
                e.printStackTrace();
            }
        }
    }
}
