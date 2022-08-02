package guru.qa;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        PersonalData traveler = new PersonalData("Таисия", 70000, "Северная Америка");
        traveler.enterName();
        traveler.checkBudget();
        traveler.checkRegion();
    }
}
