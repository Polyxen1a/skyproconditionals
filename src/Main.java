public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        // Задание 1
        int age = 17;
        if (age <= 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        int age2 = 20;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        // Задание 2
        int age3 = 7;
        if (age3 >= 7) {
            System.out.println("Ребёнок ходит в школу");
        }
        int age4 = 18;
        if (age4 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        int age5 = 24;
        if (age5 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задание 3
        int passengers = 105;
        if (passengers >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
        int passengers2 = 90;
        int sittingPlace = 60;
        int standingPlace = passengers2 - sittingPlace;
        System.out.println("Свободно " + standingPlace + " стоячих мест");
        if (passengers2 <= 102) {
            System.out.println("Есть места в вагоне");
        }
        // Домашнее задание 2
        // Задание 1
        // Положительный ответ
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        // Отрицательный ответ
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        // Задание 2
        // Положительный ответ
        if (age3 >= 7) {
            System.out.println("Ребёнок ходит в школу");
        } else {
            System.out.println("Ребёнок ходит в сад");
        }
        if (age4 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age5 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек учится в университете");
        }
        // Отрицательный ответ
        int age6 = 5;
        if (age6 >= 7) {
            System.out.println("Ребёнок ходит в школу");
        } else {
            System.out.println("Ребёнок ходит в сад");
        }
        if (age >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age4 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек учится в университете");
        }
        // Задание 3
        if (passengers2 <= 102) {
            System.out.println("Есть места в вагоне");
            System.out.println("Свободно " + standingPlace + " стоячих мест");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        if (passengers <= 102) {
            System.out.println("Есть места в вагоне");
            System.out.println("Свободно " + standingPlace + " стоячих мест");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        // Домашнее задание 3
        System.out.println("Домашнее задание 3.1");
        // Задание 1
        int age7 = 18;
        if (age7 >= 2 && age7 <= 6) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в детский сад");
        } else if (age7 >= 6 && age7 <= 18) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в школу");
        } else if (age7 >= 18 && age7 <= 24) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в университет");
        } else if (age7 >= 24) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить на работу");
        }
        // Задание 2
        System.out.println("Домашнее задание 3.2");
        if (age7 < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (age7 < 14) {
            System.out.println("Он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
        // Задание 3
        System.out.println("Домашнее задание 3.3");
        int one = 101;
        int two = 6;
        int three = 23;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
        }
    } else if (two > one) {
        if (two >= three) {
            System.out.println("Максимальное число - " + two);
        } else {
            System.out.println("Максимальное число - " + three);
        }
        } else {
            if (one > three) {
                    System.out.println("Максимальное число - " + one);
                } else if (three > one) {
                    System.out.println("Максимальное число - " + three);
                } else {
                    System.out.println("Все 3 числа равны");
                }
        }


    }
}