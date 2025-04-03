
package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = DataStore.getSampleEmployees();

        System.out.println("\nAll Employees (Sorted by Salary DESC, LastName ASC):");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getYearlySalary).reversed()
                        .thenComparing(Employee::getLastName))
                .forEach(System.out::println);

        System.out.println("\nQuarterly Upcoming Enrollees:");
        LocalDate nextQuarterStart = LocalDate.of(2025, 4, 1);
        LocalDate nextQuarterEnd = LocalDate.of(2025, 6, 30);

        employees.stream()
                .filter(e -> e.getPensionPlan() == null)
                .filter(e -> {
                    LocalDate qualifiedDate = e.getEmploymentDate().plusYears(3);
                    return (qualifiedDate.isEqual(nextQuarterStart) || qualifiedDate.isAfter(nextQuarterStart))
                        && (qualifiedDate.isBefore(nextQuarterEnd) || qualifiedDate.isEqual(nextQuarterEnd));
                })
                .sorted(Comparator.comparing(Employee::getEmploymentDate).reversed())
                .forEach(System.out::println);
    }
}
