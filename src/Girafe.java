public class Girafe extends Mammal implements Prey {
    public Girafe(int age,double speed,String animalSpecial) {
        this.name = "Girafe";
        this.age = age;
        this.speed = speed;
        this.animalSpecial = animalSpecial;
    }

    @Override
    public String getName() {
        return this.name;
    }
}