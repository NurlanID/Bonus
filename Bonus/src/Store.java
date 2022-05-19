    import java.util.Scanner;

    public class Store {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Если вы хотите Французский багет напишите 1\n" +
                    "Если вы хотите Тандырная лепёшка напишите 2\n" +
                    "Если вы хотите Армянский  лаваш  напишите 3\n" +
                    "Если вы хотите Хлеб ромашка напишите 4");
            int choice = sc.nextInt();

            if (choice == 1) {
                FrenchBaguette FrenchBaguette = new FrenchBaguette();
                FrenchBaguette.setWeight(200);
                FrenchBaguette.setPrice(2.7);
                FrenchBaguette.setProduceCompany("Paris");
                FrenchBaguette.setLength(20.5);
                FrenchBaguette.TitleBaguette();
                System.out.println(FrenchBaguette);
                FrenchBaguette.scarring();
                System.out.println();
                FrenchBaguette.pack();
                FrenchBaguette.packBaguette();
            }

            if (choice == 2) {
                TandyrBread TandyrBread = new TandyrBread();
                TandyrBread.setPrice(0.7);
                TandyrBread.setProduceCompany("Sonun nan");
                TandyrBread.setRadius(17.7);
                System.out.println(TandyrBread);
                TandyrBread.Weight();
                TandyrBread.Patterns();
                TandyrBread.Varnish();
                TandyrBread.pack();
            }
            if (choice == 3) {
                ArmenianLavash ArmenianLavash = new ArmenianLavash();
                ArmenianLavash.setWeight(500);
                ArmenianLavash.setPrice(0.9);
                ArmenianLavash.setProduceCompany("U Ashota");
                ArmenianLavash.setRadius(30.5);
                ArmenianLavash.setThickness(0.5);
                ArmenianLavash.TitleLavash();
                System.out.println(ArmenianLavash);
                ArmenianLavash.WrapUp();
                ArmenianLavash.Baked();
            }
            if (choice == 4) {
                ChamomileBread chamomileBread = new ChamomileBread();
                chamomileBread.setWeight(300);
                chamomileBread.setPrice(0.5);
                chamomileBread.setProduceCompany("Fresh aromat");
                chamomileBread.setNumChamomile(20);
                System.out.println(chamomileBread);
            }
        }
    }

