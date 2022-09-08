public class GetterSetter {
    public static void main(String...args){
        Person p1 = new Person();
        p1.setName("Ankit");
        System.out.println(p1.getName());
    }
    
}
class Person{
    private String name;
    // public Person(String name){
    //     setName(name);
    // }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
