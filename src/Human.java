public class Human {
    String name;
   private String city;
  private int yearOfBirth;
    String job;

    Human(String name, String city, int yearOfBirth, String job) {

        if (name==null) {
           this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (city==null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (job==null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;}

    }

    void printOut() {
        System.out.println("My name is " + name +
                " Im from " + city +
                " I was born in " + yearOfBirth +
                " I work as "+ job +
                " Bydem znakomi");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null || !city.isEmpty() || city.isBlank()) {
            this.city = city;
        } else {
            this.city = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setBirthDate(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }
}
