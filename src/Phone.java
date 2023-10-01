import java.util.Scanner;

public class Phone {
    private String number, model;
    private Short weight;

    public static int PhoneId;

    public Phone() {
        System.out.printf("Создаём телефон номер %d%n", ++PhoneId);
    }

    public static int getPhoneId() {
        return PhoneId;
    }

    public Phone(String number, String model, Short weight) {
        System.out.printf("Создаём телефон номер %d%n", ++PhoneId);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        System.out.printf("Создаём телефон номер %d%n", ++PhoneId);
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public void receiveCall(String CallersName){
        System.out.printf("На телефон модели %s, номер %s идет вызов от контакта: %s%n", getModel(), getNumber(), CallersName);

    }


}
