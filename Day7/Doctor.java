package Day7;


public class Doctor {
    private String DoctorID;
    private String name;
    private int age;
    private String gender;
    private String specialization;

    private static int idcounter = 1000;

    public Doctor() {
        this.DoctorID = "Unknown";
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
        this.specialization = "Unknown";

    }

    public Doctor(String DoctorID , String name , int age , String gender , String specialization) {
        this.DoctorID = DoctorID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specialization = specialization;

    }

    public Doctor(String DoctorID , int age , String gender) {
        this.DoctorID = DoctorID;
        this.age = age;
        this.gender = gender;
        this.name = "Unknown";
        this.specialization = "Unknown";
    }
    private static String generateDoctorID(){
        return "DR" + (++idcounter);
    }

    public void setID(String DoctorID){
        this.DoctorID = DoctorID;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setgender(String gender){
        this.gender= gender;
    }
    public void setspec(String specialization){
        this.specialization = specialization;
    }
    public String getID(){
        return this.DoctorID;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getgender(){
        return gender;
    }
    public String getspec(){
        return specialization;
    }

    public void displayInfo(){
        System.out.println("Doctor ID         : " + DoctorID);
        System.out.println("Doctor Name       : " + name);
        System.out.println("Doctor Age        : " + age);
        System.out.println("Doctor Gender(M/F): " + gender);
        System.out.println("Doctor Specialization  : " + specialization);
    }

    // Overloaded method to display info in a specific format
    public void displayInfo(String format) {
        if (format.equalsIgnoreCase("json")) {
            System.out.println("{");
            System.out.println("  \"doctorId\": \"" + DoctorID + "\",");
            System.out.println("  \"name\": \"" + name + "\",");
            System.out.println("  \"age\": " + age + ",");
            System.out.println("  \"gender\": \"" + gender + "\",");
            System.out.println("  \"specialization\": \"" + specialization + "\"");
            System.out.println("}");
        } else {
            displayInfo(); // default format
        }
    }


    

    public static void main(String[] args) {
        Doctor doc1 = new Doctor();
        System.out.println("Doctor 1");
        doc1.displayInfo();

        System.out.println();
        Doctor doc2 = new Doctor();
        System.out.println("Doctor 2");

        System.out.println("DoctorId      : " + doc2.getID());
        System.out.println("Name          : " + doc2.getname());
        System.out.println("Age           : " + doc2.getage());
        System.out.println("Gender        : " + doc2.getgender());
        System.out.println("Specialization: " + doc2.getspec());

        System.out.println();

        Doctor doc3 = new Doctor(generateDoctorID() , 45 , "Male");
        System.out.println("Doctor 3");
        doc3.displayInfo();

        System.out.println();

        Doctor doc4 = new Doctor(generateDoctorID() , "Abishake" , 50 ,  "Male" , "gynaecologist");
        System.out.println("Doctor 4");
        doc4.displayInfo();

        System.out.println();
        
        Doctor doc5 = new Doctor(generateDoctorID() , "Suban" , 35 , "Male" ,  "Neurologist" );
        System.out.println("Doctor 5");
        doc5.displayInfo("json");

    }
    
}

