package guru.qa;

import java.util.Objects;

public class PersonalData {
    String name;
    int budget;
    String region;

    public PersonalData(String name, int budget, String region) {
        this.name = name;
        this.budget = budget;
        this.region = region;
    }
    void enterName() {
        System.out.println("Здравствуйте, " + name + "!");
    }
    void checkBudget() {
        System.out.println(name + ", бюджет вашего путешествия: " + budget);
        if (budget<=20000){
            System.out.println("К сожалению, для такого бюджета вариантов нет.");
        }
        else {
            System.out.println(name + ", из представленных направлений Вы выбрали: " + region);
        }
    }

    void checkRegion() {
        if (region.equals("Северная Америка")){
            System.out.println("К сожалению, на ближайшие несколько недель доступных туров в Северную Америку нет.");
        }
        else if ((region.equals("Европа") || region.equals("Азия") || region.equals("Африка")) && budget <= 100000) {
            System.out.println("К сожалению, в рамках Вашего бюджета для выбранного региона туры не найдены.");
        }
        else if (region.equals("Европа") || region.equals("Азия") || region.equals("Африка")) {
            System.out.println("В течение дня мы свяжемся с Вами и предложим Вам подхоядщие туры в выбранный регион!");
        }
        else if (region.equals("Россия")){
            System.out.println("Курорты Красндорского края Вас ждут!");
        }
        else {
            System.out.println("К сожалению, мы вам предложить ничего не можем.");
        }
    }
}
