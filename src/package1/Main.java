package package1;

public class Main{

    public static void main(String[] args){
        Person asian = new Person("Kim", "Brown", 20,5.4);

        //asian.talk();
        System.out.println(asian.getName());
        System.out.println(asian.getSkin_color());
        System.out.println(asian.getAge());
        System.out.println(asian.getHeight());

        Person european = new Person("Ramsey", "White", 34, 5.8);
        System.out.println(european.getName());
        System.out.println(european.getSkin_color());
        System.out.println(european.getAge());
        System.out.println(european.getHeight());

        //european.name = "Ramsey";
        //european.talk();

    }
}
