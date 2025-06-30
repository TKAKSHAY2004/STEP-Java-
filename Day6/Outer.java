
class Outer{
    
    static class Inner{
        void display(){
            System.out.println("Static class");
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}