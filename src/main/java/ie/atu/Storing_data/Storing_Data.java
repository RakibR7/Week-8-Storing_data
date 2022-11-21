package ie.atu.Storing_data;

import java.io.*;

public class Storing_Data {
    public static void main(String[] args) {

        {
            File myFile = new File( "MyFile.txt");
            System.out.println("My file is located at"+ myFile.getAbsolutePath());
            try {
                PrintWriter MyWriter = new PrintWriter(
                    new FileWriter("New Line"),true);

                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("This is a another file\t\n");
                myWriter.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }



        }
    }
}
