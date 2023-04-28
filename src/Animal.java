public abstract class Animal {
    protected String name;
    protected int age;
    protected String animalSpecial;

    public void show() {
        System.out.print("name:" + name + ",age:" + age + ",\"" + animalSpecial + "\"");
    }
}
