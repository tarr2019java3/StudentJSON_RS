package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUtils {

    ObjectMapper objectMapper = new ObjectMapper();

    public void writeList(String fileName, List<Student> students) {
        try {
            objectMapper.writeValue(new File(fileName), students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readList(String filename) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
           Student [] students = objectMapper.readValue(new File(filename), Student[].class);
           for (Student stu: students) {
               System.out.print(stu.getName() + "  " + stu.getLastname() + "  index: " + stu.getIndex());
               System.out.println(" ");

           }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
