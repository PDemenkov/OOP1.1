public class Main {
    public static void main(String[] args) {
        int currentYear =2022;
        ///Задание 1 + 2
        Human maxim = new Human(null, null, 1998,"Brand-manager");
        Human ann = new Human("Ann", "Moscow", 1998,"methodist");
        Human Kate = new Human("Kate", "Kaliningrad", 1997,"Product-manager");
        Human Artem = new Human("Artem", "Moscow", 1996,"Director");
        Human vladimir = new Human("Vladimir", "Kazan", currentYear - 21,null);
        System.out.println("Привет! Меня зовут " + maxim.name +". Я из города " + maxim.getCity() + ". Я родился в " + maxim.getYearOfBirth() + ". Мне " + (currentYear - maxim.getYearOfBirth()) + ". Работаю " + maxim.job);
        printInfo(vladimir);
    }

    private static void printInfo(Human human) {
        int currentYear =2022;
        System.out.println("Привет! Меня зовут " + human.name +". Я из города " + human.getCity() + ". Я родился в " + human.getYearOfBirth() + ". Мне " + (currentYear - human.getYearOfBirth()) + ". Работаю " + human.job);
    }
}