package expectionfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public void readFile() {

        String fileName = "/Users/sumit/Desktop/Eclipse_java/Exception/src/expectionfile/Sales_data.txt";

        try {

            BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));

            String line;

            while ((line = br.readLine()) != null) {

                String lineArr[] = line.split(",");

                String city = lineArr[2].trim();

                if (city.equals("Bangalore")) {

                    System.out.println(line);
                }
            }

            br.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        FileReader file = new FileReader();

        file.readFile();
    }
}