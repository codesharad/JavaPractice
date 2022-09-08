public class Constructor {
    public static void main(String...args){
        Student s1 = new Student("Karan", 123, 5.6f);
        Student s2 = new Student("Piyush", 23, 5.9f);

        s1.displayProfile();
        s1.calcPercentage();

        s2.displayProfile();
        s2.calcPercentage();
    }
}

class Student{
    String name;
    int roll;
    float cgpa;
    public Student(String name, int roll, float cgpa){
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }
    void displayProfile(){
        System.out.println(name + " " + roll+ " "+ cgpa);
    }
    void calcPercentage(){
        System.out.println(10*this.cgpa);
    }


}