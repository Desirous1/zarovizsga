package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    public String minWork(String file) {
        String result = "";
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            List<Employee> empList = readLines(reader);
            int minHour = Integer.MAX_VALUE;
            for ( Employee oi: empList) {
                if( oi.getWorkHour() < minHour ) {
                    minHour = oi.getWorkHour();
                    result = oi.getName() + ": " + oi.getLocalDate();
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return result;
    }

    public List<Employee> readLines(BufferedReader reader) throws IOException {
        String line;
        List<Employee> employeeList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(",");
            Employee paramEmp =  new Employee(split[0], Integer.parseInt(split[1]), LocalDate.parse(split[2]));
            employeeList.add(paramEmp);
        }
        return employeeList;
    }


}