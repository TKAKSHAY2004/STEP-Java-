package Day7;

public class Patient extends person {
    private String patientID;
    // private String patient_Name;
    // private int age;
    // private String gender;
    private String diagonsis;

    // Static counter to generate unique patient IDs
    private static int idCounter = 1000;

    //no args constructor
    public Patient(){
        super();
        this.patientID = "Unknown";
        // this.patient_Name = "Unknown";
        // this.age = 0;
        // this.gender = "Unknown";
        this.diagonsis = "Unknown";
    }

    //parametrized constructor
    public Patient(String patientID , String patient_Name , int age ,String gender, String diagonsis ){

        super(patient_Name, age , gender); //super for construstor should  be top of the all the variable
        this.patientID = patientID;
        // this.patient_Name = patient_Name;
        // this.age = age;
        // this.gender = gender;
        
        this.diagonsis = diagonsis;
    }

    //partial paramterized construtor;
    public Patient(String patientID  , int age , String diagonsis ){
        super(age);
        this.patientID = patientID;
        // this.age = age;
        this.diagonsis = diagonsis;
    }

    // Private method to generate unique patient ID
    private static String generatePatientId() {

        return "PAT" + (++idCounter);
        //return "PAT" + (idCounter++);
    }

    //for set methos where it will retrive from private member
    public void setID(String patientID){
        this.patientID = patientID;
    }
    // public void setname(String patient_Name){
    //     this.patient_Name = patient_Name;
    // }
    // public void setage(int age){
    //     this.age = age;
    // }
    // public void setgender(String gender){
    //     this.gender = gender;
    // }
    public void setdiagonsis(String diagonsis){
        this.diagonsis = diagonsis;
    }


    public String getID(){
        return generatePatientId();
    }
    // public String getname(){
    //     return patient_Name;
    // }
    // public int getage(){
    //     return age;
    // }
    // public String getgender(){
    //     return gender;
    // }
    public String getdiagonsis(){
        return diagonsis;
    }

    
    public void displayInfo(){
        
        System.out.println("Patient ID         : " + patientID);
        // System.out.println("Patient Name       : " + patient_Name);
        // System.out.println("Patient Age        : " + age);
        // System.out.println("Patient Gender(M/F): " + gender);
        super.displayInfo();
        System.out.println("Patient Diagonsis  : " + diagonsis);
    }

    //Overloaded method to display info in a specific format
    public void displayInfo(String format) {
        if (format.equalsIgnoreCase("json")) {
            System.out.println("{");
            System.out.println("  \"patientId\": \"" + patientID + "\",");
            System.out.println("  \"name\": \"" + getName() + "\",");
            System.out.println("  \"age\": " + getAge() + ",");
            System.out.println("  \"gender\": \"" + getGender()+ "\",");
            System.out.println("  \"diagnosis\": \"" + diagonsis + "\"");
            System.out.println("}");
        } else {
            displayInfo(); // default format
        }
    }

    public static void main(String[] args) {
        Patient obj = new Patient();
        System.out.println("Patient 1");
        obj.displayInfo();

        System.out.println();

        System.out.println("Patient 2");
        Patient obj2 = new Patient(generatePatientId(), "Lohith", 21,"Male", "Throat pain");
        obj2.displayInfo();

        System.out.println();

        System.out.println("Patient 3");
        obj.setage(21);
        obj.setname("Yeshwin");
        obj.setID(generatePatientId());
        obj.setgender("Male");
        obj.setdiagonsis("Dysentry");
        obj.displayInfo();

        //calling by get method
        // System.out.println(obj.getage());



        System.out.println();

        System.out.println("Patient 4");
        Patient pt3 = new Patient(generatePatientId() ,"Jayadeep" , 20 , "Male" , "Fever");
        pt3.displayInfo("Json");

    }

    
}


/*
 package org.example;

public class Patient {

    // Private fields (Encapsulation)
    private String name;
    private int age;
    private String gender;
    private String patientId;
    private String diagnosis;
    String demo;
    public String publicdemo;

    // Static counter to generate unique patient IDs
    private static int idCounter = 1000;

    // No Arg  constructor
    public Patient() {
//        this.name = "";
//        this.age = 0;
//        this.gender = "";
//        this.diagnosis = "Not Diagnosed";
//        this.patientId = generatePatientId();
    }

     //Parameterized constructor
    public Patient(String name, int age, String gender, String diagnosis) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diagnosis = diagnosis;
        this.patientId = generatePatientId();
    }

     //Overloaded constructor (partial info)
    public Patient(String nm, int age, String gender) {
        this.name = name;
        name=nm;
        this.age = age;
        this.gender = gender;
        this.diagnosis = "Not Diagnosed";
        this.patientId = generatePatientId();
    }

    // Private method to generate unique patient ID
    private String generatePatientId() {

        return "PAT" + (++idCounter);

        //return "PAT" + (idCounter++);
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getPatientId() { return patientId; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name      : " + this.name);
        System.out.println("Age       : " + age);
        System.out.println("Gender    : " + gender);
        System.out.println("Diagnosis : " + diagnosis);
    }

    // Overloaded method to display info in a specific format
    public void displayInfo(String format) {
        if (format.equalsIgnoreCase("json")) {
            System.out.println("{");
            System.out.println("  \"patientId\": \"" + patientId + "\",");
            System.out.println("  \"name\": \"" + name + "\",");
            System.out.println("  \"age\": " + age + ",");
            System.out.println("  \"gender\": \"" + gender + "\",");
            System.out.println("  \"diagnosis\": \"" + diagnosis + "\"");
            System.out.println("}");
        } else {
            displayInfo(); // default format
        }
    }



//    public static void main(String[] args) {
//       
//
//        int i =10;
//        Patient pt1 = new Patient();
//        pt1.setName("Rohit");
//        pt1.setAge(20);
//        pt1.setGender("Male");
//        pt1.setDiagnosis("Corona Virus");
//        //pt1.demo = "Sample content to explain Default Access Modifier";
//        pt1.publicdemo = "Sample content to explain public Access Modifier";
//        pt1.displayInfo();
//
//        Patient pt2 = new Patient("Ravi", 20,"Male");
//        // pt2.diagnosis = "Fever";
//        pt2.setDiagnosis("Fever");
//        System.out.println("Patient 2 ID " + pt2.getPatientId());
//        System.out.println("Patient 2 ID " + pt2.getDiagnosis());
//
//
//        Patient pt3 = new Patient("Sonam", 21, "Female", "HeadAche");
//        pt3.displayInfo("json");
//
//    }

// default constructor
    //static variable for Hospital Name

    //NonAccess Modifier/Specifier --  final , abstract, static
    // 3 diff types



    // runner class
//            -  same class (patient and Main  method )
//            - Different class (in same package)
//            -  Difference classes (in diff packages)
//    // package
    // access modifiers/specifier - private, public, protected, default

}

 */
