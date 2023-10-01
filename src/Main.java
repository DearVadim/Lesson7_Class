public class Main {
    public static void main(String[] args) {

        Phone Samsung = new Phone("+79999999999","Samsung Galaxy S20",(short)190);
        System.out.printf("Телефон %d. Модель: %s,\t номер: %s,\t вес: %d г.\n\n", Samsung.getPhoneID(), Samsung.getModel(), Samsung.getNumber(), Samsung.getWeight());

        Phone Xiaomi = new Phone("+79999999988","Xiaomi Redmi 10A");
        System.out.printf("Модель: %s,\t номер: %s,\t вес: %d г.\n", Xiaomi.getModel(), Xiaomi.getNumber(), Xiaomi.getWeight());
        Xiaomi.setWeight((short) 194);
        System.out.println("Добавили вес. Стало:");
        System.out.printf("Телефон %d. Модель: %s,\t номер: %s,\t вес: %d г.\n\n", Xiaomi.getPhoneID(), Xiaomi.getModel(), Xiaomi.getNumber(), Xiaomi.getWeight());

        Phone Apple = new Phone();
        Apple.setModel("Apple iPhone 15 Pro");
        Apple.setNumber("+79999999977");
        Apple.setWeight((short) 187);
        System.out.printf("Телефон %d. Модель: %s,\t номер: %s,\t вес: %d г.\n\n", Apple.getPhoneID(), Apple.getModel(), Apple.getNumber(), Apple.getWeight());

        Xiaomi.receiveCall("Иван Петрович");
        Xiaomi.receiveCall("Семен Павлов");
        Samsung.receiveCall("Дарья Синицына");
        Apple.receiveCall("тетя Даша");

    }
}