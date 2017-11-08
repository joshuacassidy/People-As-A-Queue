/**
 * Created by Josh on 08/11/2017.
 */
public class Person implements IPerson{
    private String name, pps;
    private int age;

    public Person(String name, String pps, int age) {
        this.name = name;
        this.pps = pps;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPps() {
        return pps;
    }

    @Override
    public int getAge() {
        return age;
    }
}
