package ClassandObject2;

class student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Co {
    public static void main(String[] args) {
        student obj = new student();

        obj.setName("Abhey");
        obj.setAge(30);

        System.out.println(obj.getName());

        System.out.println(obj.getAge());

    }
}
