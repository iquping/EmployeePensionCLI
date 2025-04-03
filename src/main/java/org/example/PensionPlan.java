
package org.example;

import java.time.LocalDate;

public class PensionPlan {
    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private double monthlyContribution;

    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, double monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
    }

    @Override
    public String toString() {
        return String.format("{ \"planReferenceNumber\": \"%s\", \"enrollmentDate\": \"%s\", \"monthlyContribution\": %.2f }",
                planReferenceNumber, enrollmentDate, monthlyContribution);
    }

}
