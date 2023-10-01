public class Phone {
    private String number, model;
    private Short weight;
    private final int PhoneID;

    public static int PhoneCounter;

    public Phone() {
        System.out.printf("Создаём телефон номер %d%n", ++PhoneCounter);
        this.PhoneID = PhoneCounter;
    }

    public Phone(String number, String model, Short weight) {
        System.out.printf("Создаём телефон номер %d%n", ++PhoneCounter);
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.PhoneID = PhoneCounter;
    }

    public Phone(String number, String model) {
        System.out.printf("Создаём телефон номер %d%n", ++PhoneCounter);
        this.number = number;
        this.model = model;
        this.PhoneID = PhoneCounter;
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

    public int getPhoneID() {
        return PhoneID;
    }

    public void receiveCall(String CallersName){
        System.out.printf("На %d-й телефон модели %s, номер %s идет вызов от контакта: %s%n", PhoneID, model, number, CallersName);

    }


}
