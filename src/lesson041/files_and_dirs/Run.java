package lesson041.files_and_dirs;

import java.io.*;
import java.nio.file.Files;
import java.util.Objects;

public class Run {
    public static void main(String[] args) throws IOException {

        String fileName = "test.txt";

        String str;

        File file = new File(Objects.requireNonNull(Run.class.getClassLoader().getResource(fileName)).getFile());

        System.out.println("File Found : " + file.exists());



        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("New STRING");
        fileWriter.append("String");
        fileWriter.write("New STRING");
        fileWriter.write("New STRING");
        fileWriter.flush();
        fileWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        while ((str = bufferedReader.readLine()) != null)
            System.out.println(str);


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));


        bufferedWriter.write("bufferedWriter");
        bufferedWriter.flush();
        bufferedWriter.close();


        while ((str = bufferedReader.readLine()) != null)
            System.out.println(str);

    }
}
