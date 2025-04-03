
package org.example;

import java.time.LocalDate;
import java.util.*;

public class DataStore {
    public static List<Employee> getSampleEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Daniel", "Agar", LocalDate.of(2018,1,17), 105945.50,
                new PensionPlan("EX1089", LocalDate.of(2023,1,17), 100.00)));
        list.add(new Employee(2, "Benard", "Shaw", LocalDate.of(2022,9,3), 197750.00, null));
        list.add(new Employee(3, "Carly", "Agar", LocalDate.of(2014,5,16), 842000.75,
                new PensionPlan("SM2307", LocalDate.of(2019,11,4), 1555.50)));
        list.add(new Employee(4, "Wesley", "Schneider", LocalDate.of(2022,7,21), 74500.00, null));
        list.add(new Employee(5, "Anna", "Wiltord", LocalDate.of(2022,6,15), 85750.00, null));
        list.add(new Employee(6, "Yosef", "Tesfalem", LocalDate.of(2022,10,31), 100000.00, null));
        return list;
    }
}
