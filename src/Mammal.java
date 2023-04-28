public abstract class Mammal extends Animal {
    protected double speed;

    @Override
    public void show() {
        System.out.print("name:" + name + ",age:" + age + ",height of fly:" + speed + ",\"" + animalSpecial + "\"");
    }
}
