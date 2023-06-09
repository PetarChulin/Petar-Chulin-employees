package Pair_Of_Employees_Working_Longest_Together.service;

import Pair_Of_Employees_Working_Longest_Together.entity.Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import static Pair_Of_Employees_Working_Longest_Together.constants.ApplicationConstants.*;

public class  ImportDataServiceImpl implements ImportDataService{

    @Override
    public List<Project> importData() throws IOException {
        String data;
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));

        List<Project> projects = new ArrayList<>();
        int count = 0;
        while ((data = br.readLine()) != null) {
            if (data.trim().isEmpty()) {
                continue;
            }

            String[] splitData = data.split(", ");
            count++;
            if(splitData.length != 4) {
                System.out.printf(INVALID_LINE_FORMAT_MSG + "%n", count);
                continue;
            }

            int empId = Integer.parseInt(splitData[0].trim());
            int projectId = Integer.parseInt(splitData[1].trim());
            LocalDate dateFrom;
            try {
                dateFrom = LocalDate.parse(splitData[2].trim());
            } catch (DateTimeParseException e) {
                System.out.printf(INVALID_DATE_FROM_FORMAT_MSG + "%n", count);
                continue;
            }

            LocalDate dateTo;
            if (splitData[3].trim().equalsIgnoreCase("NULL")) {
                dateTo = LocalDate.now();
            } else {
                try {
                    dateTo = LocalDate.parse(splitData[3].trim());
                } catch (DateTimeParseException e) {
                    System.out.printf(INVALID_DATE_TO_FORMAT_MSG + "%n", count);
                    continue;
                }
            }

            projects.add(new Project(empId, projectId, dateFrom, dateTo));
        }
        return projects;
    }
}
