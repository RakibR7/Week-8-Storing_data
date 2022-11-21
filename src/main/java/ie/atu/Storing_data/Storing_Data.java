package ie.atu.Storing_data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Storing_Data {
    public static void main(String[] args) {

        {
            File myFile = new File( "MyFile.txt");
            System.out.println("My file is located at "+ myFile.getAbsolutePath());

            try {
                FileWriter myWriter = new FileWriter(myFile);
                myWriter.write("This is my first file");
                myWriter.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }




        }

    }
}
