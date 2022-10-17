public class Main {
    public static void main(String[] args) {
        ///Задание 1 + 2
        Human Maxim = new Human(null, null, 1999,"Brand-manager");
        Maxim.printOut();
        Human Ann = new Human("Ann", "Moscow", 1998,"methodist");
        Ann.printOut();
        Human Kate = new Human("Kate", "Kaliningrad", 1997,"Product-manager");
        Kate.printOut();
        Human Artem = new Human("Artem", "Moscow", 1996,"Director");
        Artem.printOut();
    }
}