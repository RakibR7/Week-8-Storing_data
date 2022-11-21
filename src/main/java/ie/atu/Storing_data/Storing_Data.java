package ie.atu.Storing_data;
import java.io.*;

public class Storing_Data {
    public static void main(String[] args) {

        {
            File myFile = new File( "MyFile.txt");
            System.out.println("My file is located at "+ myFile.getAbsolutePath());
        }

    }
}
