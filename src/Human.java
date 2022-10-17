public class Human {
    String name;
    String city;
    int birthDate;

    String job;

    Human(String name, String city, int birthDate, String job) {

        if (name==null) {
           this.name = "Информация не указана";
        } else this.name = name;
        if (city==null) {
            this.city = "Информация не указана";
        } else this.city = city;
        if (birthDate <= 0) {
            this.birthDate = 0;
        } else {
            this.birthDate = birthDate;
        }
        if (job==null) {
            this.job = "Информация не указана";
        } else this.job = job;

    }

    void printOut() {
        System.out.println("My name is " + name +
                " Im from " + city +
                " I was born in " + birthDate +
                " I work as "+ job +
                " Bydem znakomi");
    }
}
