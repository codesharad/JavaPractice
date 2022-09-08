public class Inheritence {
    public static void main(String...args){
        Student s1 = new Student("Sharad", 2, 10000);
        ResearchStudent rs1 = new ResearchStudent("ResearchStudent", 3, 30000, "XYZ_Project");
        PhDStudent phd = new PhDStudent("PhD Student", 1, 600000, "Human Intelligence");
        s1.getDetails();
        rs1.getDetails();
        phd.getDetails();
    }
    
}

class Student{
    private String name;
    private int year;
    private int fees;
    public Student(String name, int year, int fees){
        this.name = name;
        this.year = year;
        this.fees = fees;
    }

    public int computeFees(){
        return year*fees;
    }

    public void getDetails(){
        System.out.println("name :"+name+"fees"+computeFees());
    }
}

class ResearchStudent extends Student{
    private String thesisTitle;
    public ResearchStudent(String name, int year, int fees, String thesisTitle){
        super(name, year, fees);
        this.thesisTitle = thesisTitle;
    }
}

class PhDStudent extends Student{
    private String researchArea;
    public PhDStudent(String name, int year, int fees, String researchArea){
        super(name, year, fees);
        this.researchArea = researchArea;
    }
}