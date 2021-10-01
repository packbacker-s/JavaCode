/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/08
 * @Time:17:21
 */
class PERSON {
    private String name;
    private int age;
   /* public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = Name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int Age) {
        this.age = Age;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("My name is " + this.name + ", I am " + this.age + " years old.");
    }
}
public class ClassPractise {
    public static void main(String[] args) {
        PERSON person = new PERSON();
        person.setName("Minghao");
        person.setAge(18);
        String str = person.getName();
        int age = person.getAge();
        System.out.println(str);
        System.out.println(age);
        person.show();
    }
}
