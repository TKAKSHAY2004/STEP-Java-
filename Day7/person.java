package Day7;

public class person {
    private String name;
    private String gender;
    private int age;

    public void setname(String patient_Name){
        this.name = patient_Name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setgender(String gender){
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    public person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public person(int age) {
        this.age = age;
    }
    
    public person() {
        this.name ="";
        this.age = 0;
        this.gender = "";
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

/*
 public class Person{
    private String name;
    private int age;
    private String gender;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public Person() {
        this.name ="";
        this.age = 0;
        this.gender = "";
    }
    public String getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
 */
