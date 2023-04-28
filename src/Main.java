import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Animal cheetah = new Cheetah(5, 110, "is iranian :)");
        Animal eagle = new Eagle(3, 500, "is yellow");
        Animal giraffe = new Girafe(10, 15, "is deraz");
        Animal parrot = new Parrot(2, 30, "talks and it's beautiful");

        String ord = "";
        while(!ord.equals("finish")) {
            System.out.println("Hi, welcome to this jungle, here's a list of our animals:\n1- Cheetah\n2- Eagle\n3- Giraffe\n4- Parrot\n\nBy entering each name the related method for that animal will be called and you will see the result.\n");
            ord = scanner.nextLine();
            if(ord.equalsIgnoreCase("cheetah") || ord.equalsIgnoreCase("Eagle")) {
                System.out.println("which animal do you want them to eat?\n1- giraffe\n2- parrot\n");
                Animal hunter = (ord.equalsIgnoreCase("cheetah"))?(cheetah):(eagle);
                ord = scanner.nextLine();
                if(ord.equalsIgnoreCase("giraffe") || ord.equalsIgnoreCase("parrot")) {
                    Animal toBeHunted = ord.equalsIgnoreCase("giraffe")?(giraffe):(parrot);
                    hunter.show();
                    System.out.println();
                    toBeHunted.show();
                    System.out.println();
                    if(hunter instanceof Cheetah){
                        if(toBeHunted instanceof Parrot)
                            ((Cheetah) hunter).hunt((Parrot)toBeHunted);
                        else
                            ((Cheetah) hunter).hunt((Girafe)toBeHunted);
                    }
                    else {
                        if(toBeHunted instanceof Parrot)
                            ((Eagle) hunter).hunt((Parrot)toBeHunted);
                        else
                            ((Eagle) hunter).hunt((Girafe)toBeHunted);
                    }
                }
            }
            else {
                Animal toBeShown = ord.equalsIgnoreCase("giraffe")?(giraffe):(parrot);
                toBeShown.show();
                System.out.println();
            }

        }
    }
}