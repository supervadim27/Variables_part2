// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public class Main {
            public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
                task8();
            }

            public static void task1() {
                int apples = 10;
                byte bags = 4;
                short cats = 5669;
                long dogs = 10569;
                float speed = 3.5f;
                double weight = 1823.2383487;
                System.out.println();
                System.out.println("Задание №1");
                System.out.println("Значение переменной apples c типом int равно " + apples);
                System.out.println("Значение переменной bags c типом byte равно " + bags);
                System.out.println("Значение переменной cats c типом short равно " + cats);
                System.out.println("Значение переменной dogs c типом long равно " + dogs);
                System.out.println("Значение переменной speed с типом float равно " + speed);
                System.out.println("Значение переменной weight с типом double равно " + weight);
            }
            public static void task2() {
                System.out.println();
                System.out.println("Задание №2");
                double a = 27.12f;
                long b = 987678965549L;
                float c = 2.786f;
                int d = 569;
                short e = 159;
                long f = 27897;
                byte g = 67;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                System.out.println(g);
            }
            public static void task3() {
                byte LPClassmates = 23;
                byte ASClassmates = 27;
                byte EAClassmates = 30;
                int totalSheets = 480;
                int sheetsPerPerson = totalSheets/(LPClassmates+ASClassmates+EAClassmates);
                System.out.println();
                System.out.println("Задание №3");
                System.out.println("На каждого ученика рассчитано "+sheetsPerPerson+" листов бумаги");    }
            public static void task4() {
                byte bottleMashineCapacityMin = 16;
                int bottleMashineCapacity20Min = bottleMashineCapacityMin*20;
                int bottleMashineCapacityDay = bottleMashineCapacityMin*60*24;
                int bottleMashineCapacity3Days = bottleMashineCapacityDay*3;
                int bottleMashineCapacityMonth = bottleMashineCapacityDay*30;
                System.out.println();
                System.out.println("Задание №4");
                System.out.println("За 20 минут машина произвела "+bottleMashineCapacity20Min+" штук бутылок");
                System.out.println("За сутки машина произвела "+bottleMashineCapacityDay+" штук бутылок");
                System.out.println("За 3 дня машина произвела "+bottleMashineCapacity3Days+" штук бутылок");
                System.out.println("За месяц машина произвела "+bottleMashineCapacityMonth+" штук бутылок");
            }
            public static void task5() {
                int totalCans = 120;
                int whiteCansPerClass = 2;
                int brownCansPerClass = 4;
                int totalClasses = totalCans/(whiteCansPerClass+brownCansPerClass);
                int totalWhiteCans = totalClasses*whiteCansPerClass;
                int totalBrownCans = totalClasses*brownCansPerClass;
                System.out.println();
                System.out.println("Задание №5");
                System.out.println("В школе, где "+totalClasses+" классов, нужно "+totalWhiteCans+" белой краски и "+totalBrownCans+" банок коричневой краски");
            }
            public static void task6() {

                int bananaWeight = 80;
                int milkWeight100Ml = 105;
                int iceCreamWeight = 100;
                int eggWeight = 70;
                int totalBananaWeight = bananaWeight * 5;
                int totalMilkWeight = milkWeight100Ml * 2;
                int totalIceCreamWeight = iceCreamWeight * 2;
                int totalEggWeight = eggWeight * 4;
                int totalBreakfastWeightGr = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
                double totalBreakfastWeightKg = totalBreakfastWeightGr / 1000.0;
                System.out.println();
                System.out.println("Задание №6");
                System.out.println("Общий вес завтрака " + totalBreakfastWeightGr + " гр или " + (totalBreakfastWeightKg) + " кг");
            }
            public static void task7() {
                int grammPerDay1 = 250;
                int grammPerDay2 = 500;
                int weightLoss = 7*1000;
                int dayToBeReady = weightLoss/grammPerDay1;
                int dayToBeReady2 = weightLoss/grammPerDay2;
                int middleDayToBeReady =(dayToBeReady+dayToBeReady2)/2;
                System.out.println();
                System.out.println("Задание №7");
                System.out.println("Если худеть на "+grammPerDay1+" грамм ежедневно, то чтобы добиться результата спортсмену потребуется "+dayToBeReady+" дней");
                System.out.println("Если худеть на "+grammPerDay2+" грамм ежедневно, то чтобы добиться результата спортсмену потребуется "+dayToBeReady2+" дней");
                System.out.println("В среднем может потребоваться "+middleDayToBeReady+" день");
            }
            public static void task8() {
                int MashaSalary = 67760;
                int DenisSalary = 83690;
                int KristinaSalary = 76230;
                int MashaNewSalary = (int) (MashaSalary*1.1);
                int DenisNewSalary = (int) (DenisSalary*1.1);
                int KristinaNewSalary = (int)(KristinaSalary*1.1);

                int oldMashaIncome = MashaSalary*12;
                int oldDenisIncome = DenisSalary*12;
                int oldKristinaIncome = KristinaSalary*12;
                int newMashaIncome = MashaNewSalary*12;
                int newDenisIncome = DenisNewSalary*12;
                int newKristinaIncome = KristinaNewSalary*12;
                System.out.println();
                System.out.println("Задание №8");
                System.out.println("Маша теперь получает "+MashaNewSalary+" рублей. Годовой доход вырос на "+(newMashaIncome-oldMashaIncome)+" рублей");
                System.out.println("Денис теперь получает "+DenisNewSalary+" рублей. Годовой доход вырос на "+(newDenisIncome-oldDenisIncome)+" рублей");
                System.out.println("Кристина теперь получает "+KristinaNewSalary+" рублей. Годовой доход вырос на "+(newKristinaIncome-oldKristinaIncome)+" рублей");

            }
        }

