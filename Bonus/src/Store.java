    package month2.Bread;

    import java.util.Scanner;

    public class Score {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Если вы хотите Французский багет напишите 1\n" +
                    "Если вы хотите Тандырная лепёшка напишите 2\n" +
                    "Если вы хотите Армянский  лаваш  напишите 3\n" +
                    "Если вы хотите Хлеб ромашка напишите 4");
            int choice = sc.nextInt();

            if (choice == 1) {
                FrenchBaguette frenchBaguette = new FrenchBaguette();
                frenchBaguette.setWeight(350);
                frenchBaguette.setPrice(2.5);
                frenchBaguette.setProduceCompany("Frunze");
                frenchBaguette.setLength(30.5);
                frenchBaguette.TitleBaguette();
                System.out.println(frenchBaguette);
                frenchBaguette.scarring();
                System.out.println();
                frenchBaguette.pack();
                frenchBaguette.packBaguette();
            }

            if (choice == 2) {
                Cake cake = new Cake();
                cake.setPrice(0.5);
                cake.setProduceCompany("Madina");
                cake.setRadius(15.8);
                System.out.println(cake);
                cake.Weight();
                cake.Patterns();
                cake.Varnish();
                cake.pack();
            }
            if (choice == 3) {
                Lavash Lavash = new Lavash();
                Lavash.setWeight(100);
                Lavash.setPrice(0.3);
                Lavash.setProduceCompany("Uncle Ashot");
                Lavash.setRadius(20.4);
                Lavash.setThickness(0.3);
                Lavash.TitleLavash();
                System.out.println(Lavash);
                Lavash.WrapUp();
                Lavash.Baked();
            }
            if (choice == 4) {
                ChamomileBread chamomileBread = new ChamomileBread();
                chamomileBread.setWeight(500);
                chamomileBread.setPrice(0.7);
                chamomileBread.setProduceCompany("Globus");
                chamomileBread.setNumChamomile(10);
                System.out.println(chamomileBread);
            }
        }
    }

