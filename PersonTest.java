package classAndConstructor;

public class PersonTest {
    //멤버 필드
    private String name;
    private int age;
    //생성자
    public void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter, setter
    public String netName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
}
