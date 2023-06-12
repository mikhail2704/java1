public class Person {
   private String firstName;
   private String lastName;
   private int age;
   private String gender;
   private String occupation; // дополнительное поле для примера

   // Конструктор класса Person
   public Person(String firstName, String lastName, int age, String gender, String occupation) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.gender = gender;
       this.occupation = occupation;
   }

   // Методы доступа (геттеры и сеттеры) для полей класса
   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public String getGender() {
       return gender;
   }

   public void setGender(String gender) {
       this.gender = gender;
   }

   public String getOccupation() {
       return occupation;
   }

   public void setOccupation(String occupation) {
       this.occupation = occupation;
   }

   // Переопределение метода toString() для класса Person
   @Override
   public String toString() {
       return "Person{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", age=" + age +
               ", gender='" + gender + '\'' +
               ", occupation='" + occupation + '\'' +
               '}';
   }

   // Переопределение метода equals() для класса Person
   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Person person = (Person) o;
       return age == person.age &&
               Objects.equals(firstName, person.firstName) &&
               Objects.equals(lastName, person.lastName) &&
               Objects.equals(gender, person.gender) &&
               Objects.equals(occupation, person.occupation);
   }

   // Переопределение метода hashCode() для класса Person
   @Override
   public int hashCode() {
       return Objects.hash(firstName, lastName, age, gender, occupation);
   }

   // Дополнительный метод для примера
   public void greet() {
       System.out.println("Привет, меня зовут " + firstName + " " + lastName + "!");
   }

   public static void main(String[] args) {
       Person[] people = {
               new Person("Иван", "Иванов", 25, "Мужской", "Студент"),
               new Person("Мария", "Сидорова", 30, "Женский", "Врач"),
               new Person("Петр", "Петров", 18, "Мужской", "Школьник"),
               new Person("Анна", "Кузнецова", 40, "Женский", "Программист")
       };

       for (Person person : people) {
           if (person.getAge() > 20) {
               System.out.println(person);
           }
       }
   }
}