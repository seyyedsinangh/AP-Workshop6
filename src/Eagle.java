public class Eagle extends Bird implements Hunter {
    public Eagle(int age,double heightOfFly,String animalSpecial) {
        this.name = "Eagle";
        this.age = age;
        this.heightOfFly = heightOfFly;
        this.animalSpecial = animalSpecial;
    }

    @Override
    public void hunt(Prey prey) {
        System.out.printf("%s hunted %s\n", this.name, prey.getName());
    }
}
