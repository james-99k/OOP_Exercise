package package1;

public class Person {
    private String name;
    private String skin_color;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private static void talk(){
        System.out.println("I do talk!");
    }

    public Person (String newName, String skinColor, int newAge, double newHeight){
        name = newName;
        skin_color = skinColor;
        age = newAge;
        height = newHeight;
    }

}
