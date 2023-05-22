package org.example;

import java.util.*;

public class Util {
    static void getFilter(Set<Laptop> set) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> result = new HashSet<>(set);
        boolean end = true;
        while(end) {
            System.out.println("1 - Бренд");
            System.out.println("2 - Операционная система(windows,linux,macOS");
            System.out.println("3 - Размер оперативной памяти");
            System.out.println("4 - Размер жёсткого диска");
            System.out.println("5 - Цвет");
            System.out.println("0 - искать ноутбук");
            System.out.print("Укажите параметры компьютера для поиска: ");
            String answer = scanner.nextLine();
            switch (answer) {
                case("1") -> {
                    System.out.print("введите название брэнда(dell, lenovo, samsung, apple): ");
                    String brand = scanner.nextLine();
                    for(Laptop lap : set) {
                        if (!lap.getBrand().equalsIgnoreCase(brand)) {
                            result.remove(lap);
                        }
                    }
                }
                case("2") -> {
                    System.out.print("введите название операционной системы(windows,linux,macOS): ");
                    String operatingSystem = scanner.nextLine();
                    for(Laptop lap : set) {
                        if (!lap.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                            result.remove(lap);
                        }
                    }
                }
                case("3") -> {
                    System.out.print("введите минимальное значение RAM(GB): ");
                    String ramSize = scanner.nextLine();
                    int valueRam = Integer.parseInt(ramSize);
                    for(Laptop lap : set) {
                        if (lap.getRamSize()< valueRam) {
                            result.remove(lap);
                        }
                    }
                }
                case("4") -> {
                    System.out.print("введите минимальное значение HDD(GB): ");
                    String diskCapacity = scanner.nextLine();
                    int diskCapacityGB = Integer.parseInt(diskCapacity);
                    for(Laptop lap : set) {
                        if (lap.getHardDriveCapacity()< diskCapacityGB) {
                            result.remove(lap);
                        }
                    }
                }
                case("5") -> {
                    System.out.print("введите цвет(white, silver, black): ");
                    String color = scanner.nextLine();
                    for(Laptop lap : set) {
                        if (!lap.getColor().equalsIgnoreCase(color)) {
                            result.remove(lap);
                        }
                    }
                }
                case("0") -> end = false;
                default -> System.out.println("Ошибка, попробуйте ещё");
            }
        }
        scanner.close();
        System.out.println("=====================================================================");
        if (result.isEmpty()) {
            System.out.println("Подходящих компьютеров нет");
        } else {
            System.out.println("Результаты поиска: ");
            result.forEach(System.out::println);
        }

    }

}
