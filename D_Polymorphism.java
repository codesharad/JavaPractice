public class D_Polymorphism {
    public static void main(String...args){
        Student s1 = new Student("Sharad", 1);
        Student s2 = new ResearchStudent("Abhinav", 2, "AI");
        Student s3 = new PhdStudent("Raksesh", 3,"SE","WaterFlow_Schema");

        Student[] array = {s1,s2,s3};
        printDetails(array);
    }
    public static void printDetails(Student[] students){
        for(Student student: students){
            System.out.println(student.getDetails());
        }
    }
    
}

class Student{
    protected String name;
    protected int year;
    protected static int annualFees = 1;
    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + computeFees();
      }
    
      public int computeFees() {
        return Student.annualFees * year;
      }
}
class ResearchStudent extends Student{
    protected String researchArea;
    public ResearchStudent(String name, int year, String researchArea){
        super(name, year);
        this.researchArea = researchArea;
    }
    public String getDetails() {
        return this.name + " is a research student with research area" + researchArea + " and he/she is in his/her year: " + year;
    }
    

}

class PhdStudent extends ResearchStudent{
    private String thesisTitle;
    public PhdStudent(String name, int year, String researchArea, String thesisTitle){
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
    }

    public String getDetails() {
        return this.name + " is a PhD student with research area" + researchArea + " and he/she is in his/her year: " + year + ". He/She working on the thesis titled " + thesisTitle;
      }

}
