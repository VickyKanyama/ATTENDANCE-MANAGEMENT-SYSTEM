public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name=name;
    }
    private int getAge(){
        return age;
    }
    private void setAge(int age){
        this.age=age;
    }
}

