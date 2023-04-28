public class Cheetah extends Mammal implements Hunter {
    public Cheetah(int age,double speed,String animalSpecial) {
        this.name = "Cheetah";
        this.age = age;
        this.speed = speed;
        this.animalSpecial = animalSpecial;
    }
    @Override
    public void hunt(Prey prey) {
        System.out.printf("%s hunted %s\n", this.name, prey.getName());
    }
}
