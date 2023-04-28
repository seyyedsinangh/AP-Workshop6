public class Parrot extends Bird implements Prey {
    public Parrot(int age,double heightOfFly,String animalSpecial) {
        this.name = "Parrot";
        this.age = age;
        this.heightOfFly = heightOfFly;
        this.animalSpecial = animalSpecial;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
