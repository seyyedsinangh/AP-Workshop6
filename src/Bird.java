public abstract class Bird extends Animal {
    protected double heightOfFly;

    @Override
    public void show() {
        System.out.print("name:" + name + ",age:" + age + ",height of fly:" + heightOfFly + ",\"" + animalSpecial + "\"");
    }
}