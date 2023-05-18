// Matthew Gutierrez
// CIT 63
// 05/13/23

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FinalProgramJazzieIQ {

    // starting functions
    static String genBirthDay(int yearOld, String birthSeason) {
        int year = 2023 - yearOld;
        String monthDay = switch (birthSeason) {
            case "spring," -> "03-19";
            case "summer," -> "5-21";
            case "fall," -> "08-19";
            case "winter," -> "12-19";
            default -> "01-01";
        };
        String newDate = year + "-" + monthDay;
        return newDate;
    }

    static String genUniqueID(String speciesName, int numOfSpecies) {
        return switch (speciesName) {
            case "hyena" -> "Hy0" + numOfSpecies;
            case "lion" -> "Li0" + numOfSpecies;
            case "tiger" -> "Ti0" + numOfSpecies;
            case "bear" -> "Be0" + numOfSpecies;
            default -> "error";
        };
    }

    public static void main(String[] args) {
        class docs {
            static final String animalNames = "animalNames.txt";
            static String names;
            static final String arrivingAnimals = "arrivingAnimals.txt";
            static String[] animals;

        }

        // Initial Objects

        class Animal {
            public static String hab;
            public String birthday;
            public Integer age;

            public String sex;

            public String species;

            public String color;

            public String weight;
            public String name;
            public String id;

            public LocalDate arrival;

            public String TBA;

            public LocalDate preQuart;

            public LocalDate inTaking;
        }

        LinkedList<Animal> hyenaHabitat = new LinkedList<>();
        LinkedList<Animal> lionHabitat = new LinkedList<>();
        LinkedList<Animal> tigerHabitat = new LinkedList<>();
        LinkedList<Animal> bearHabitat = new LinkedList<>();

        // program Starts

        out.println("""


                ** Welcome to Mac Mac's Program for Creating Habitats. **

                I will be using the info below:
                """);

        // document retrieval

        try {
            // Scanner for animalNames.txt
            String animalNamesFilePath = docs.animalNames;

            File animalNamesFile = new File(animalNamesFilePath);
            Scanner animalNamesScanner = new Scanner(animalNamesFile);

            StringBuilder resultNames = new StringBuilder();

            while (animalNamesScanner.hasNextLine()) {
                String line = animalNamesScanner.nextLine().trim();
                if (!line.isEmpty()) {
                    resultNames.append(line).append("\n");
                }
            }

            docs.names = String.valueOf(resultNames).replace("Names:\n", "Habitat: ").replace("Ryker\n", "Ryker");
            animalNamesScanner.close();
            out.print(docs.names + "\n");

            // Arriving Animals file
            String arrivingAnimalsFilePath = docs.arrivingAnimals;

            File arrivingAnimalsFile = new File(arrivingAnimalsFilePath);
            Scanner arrivingAnimalsScanner = new Scanner(arrivingAnimalsFile);

            String[] resultAnimals = new String[16];
            // Process arriving animals

            int arrivingLineCount = 0;
            while (arrivingAnimalsScanner.hasNextLine() && arrivingLineCount < 16) {
                String line = arrivingAnimalsScanner.nextLine();
                resultAnimals[arrivingLineCount] = line;
                out.println(line);
                arrivingLineCount++;
            }
            docs.animals = resultAnimals;
            arrivingAnimalsScanner.close();
            // out.print(Arrays.toString(docs.animals));
        } catch (FileNotFoundException e) {
            out.println("A file error occurred...");
            e.printStackTrace();
        }
        out.println("\nLet's begin!\n");
        out.println("\n\n Creating Habitats... \n\n");

        try {
            FileWriter file = new FileWriter("zooHabitats.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("""
                    Created Habitat Enclosures

                    New Animals to the Following Habitats.

                    """);
            class dates {
                static String birthdate;
                static final LocalDate arrival = LocalDate.now();
                static final LocalDate inTaking = arrival.minusDays(7);
                static final LocalDate preQuart = arrival.minusMonths(4).minusDays(12);
            }
            class integers {
                static int yearsOld = 0;
                static int numOfHyenas = 0;
                static int numOfLions = 0;
                static int numOfTigers = 0;
                static int numOfBears = 0;
                static int j;
                static int indexKey;
                static int endKey;
            }
            class strings {
                static String season;
                static String sex;
                static String species;
                static String color;
                static String origin;
                static String weight;
                static String uniqueID = "xyz";
                static final String TBA = "To-Be-Announced";
                static final String[] habs = new String[4];
                static String newChar;
                static String[] splitTxt;
                String noBlankLns;
                static final String[] hyenas = new String[13];
                static final String[] lions = new String[13];
                static final String[] tigers = new String[13];
                static final String[] bears = new String[13];

            }
            String id = docs.names;
            // strings.newChar = id.replace(",", "");
            strings.splitTxt = id.split("[:,]", 52);
            // out.print(Arrays.toString(strings.splitTxt)+ "\n");
            for (integers.j = 0; integers.j < 13; integers.j++) {
                // if (integers.j < strings.splitTxt.length) {
                if (strings.splitTxt[integers.j].equals("Hyena Habitat")) {
                    strings.habs[0] = strings.splitTxt[integers.j];
                } else {
                    strings.hyenas[integers.j] = strings.splitTxt[integers.j];
                }
                // }
            }
            out.print("These names are for " + strings.habs[0] + ":");
            for (integers.j = 0; integers.j < 5; integers.j++) {
                if (strings.hyenas[integers.j] != null) {
                    out.print(strings.hyenas[integers.j]);
                }
            }
            out.println();

            for (integers.j = 13; integers.j < 26; integers.j++) {
                if (integers.j < strings.splitTxt.length) {
                    if (strings.splitTxt[integers.j].equals("Lion Habitat")) {
                        strings.habs[1] = strings.splitTxt[integers.j];
                    } else {
                        strings.lions[integers.j - 13] = strings.splitTxt[integers.j];
                    }
                }
            }
            out.print("These names are for " + strings.habs[1] + ":");
            for (integers.j = 13; integers.j < 17; integers.j++) {
                if (strings.lions[integers.j - 13] != null) {
                    out.print(strings.lions[integers.j - 13]);
                }
            }
            out.println();

            for (integers.j = 26; integers.j < 39; integers.j++) {
                if (integers.j < strings.splitTxt.length) {
                    if (strings.splitTxt[integers.j].equals("Bear Habitat")) {
                        strings.habs[2] = strings.splitTxt[integers.j];
                    } else {
                        strings.bears[integers.j - 26] = strings.splitTxt[integers.j];
                    }
                }
            }
            out.print("These names are for " + strings.habs[2] + ":");
            for (integers.j = 26; integers.j < 30; integers.j++) {
                if (strings.bears[integers.j - 26] != null) {
                    out.print(strings.bears[integers.j - 26]);
                }
            }
            out.println();

            for (integers.j = 39; integers.j < 49; integers.j++) {
                if (integers.j < strings.splitTxt.length) {
                    if (strings.splitTxt[integers.j].equals("Tiger Habitat")) {
                        strings.habs[3] = strings.splitTxt[integers.j];
                    } else {
                        strings.tigers[integers.j - 39] = strings.splitTxt[integers.j];
                    }
                }
            }
            out.print("These names are for " + strings.habs[3] + ":");
            for (integers.j = 39; integers.j < 43; integers.j++) {
                if (strings.tigers[integers.j - 39] != null) {
                    out.print(strings.tigers[integers.j - 39]);
                }
            }
            out.println();

            // end of Habitat Splitter //
            // out.print (strings.habs[0] + strings.hyenas[0-4] + "\n" + strings.habs[1] +
            // strings.lions + "\n" +
            // strings.habs[2] + strings.tigers + "\n" + strings.habs[3] + strings.bears +
            // "\n");

            for (int i = 0; i < 16; i++) {
                String[] splitAnimals = docs.animals[i].split(" ", 0);
                String[] splitStrComma = docs.animals[i].split(",", 0);
                /*
                 * for (String a: splitAnimals) {
                 * out.println( a + "\n\n");}
                 * for (String s: splitStrComma) {
                 * System.out.println(s);
                 * }
                 */
                out.print("\n");
                integers.yearsOld = Integer.parseInt(splitAnimals[0]);
                // String arrived = splitStrComma[4];
                strings.season = splitAnimals[7];
                strings.species = splitStrComma[0].split(" ")[4];
                // out.print (splitAnimals[7]);
                // out.println("species is: " + strings.species);
                // System.out.println("position of comma is: " + position);
                dates.birthdate = genBirthDay(integers.yearsOld, strings.season);
                // out.println("birthDate is: " + dates.birthdate);
                // out.println(integers.yearsOld + " years old");
                strings.sex = splitAnimals[3];
                // out.println("sex is: " + strings.sex);
                strings.color = splitStrComma[2];
                // out.println("color ; " + strings.color);
                strings.weight = splitStrComma[3];
                strings.origin = splitStrComma[4] + "," + splitStrComma[5];
                // out.println("weight ; " + strings.weight);
                // out.println("origin ; " + strings.origin);
                switch (strings.species) {
                    case "hyena" -> {
                        // out.print("Arriving "+ dates.arrival +"\n");
                        // output.write("\n" + "Arriving " + dates.arrival + "; ");
                        integers.numOfHyenas++;
                        strings.uniqueID = genUniqueID(strings.species, integers.numOfHyenas);
                        // out.println(strings.uniqueID + ": " + strings.hyenas[integers.numOfHyenas]);
                        // output.write(strings.uniqueID + ": " + strings.hyenas[integers.numOfHyenas]);
                        Animal animal = new Animal();
                        animal.id = strings.uniqueID;
                        animal.name = strings.hyenas[integers.numOfHyenas].replace(" ", "");
                        animal.birthday = genBirthDay(integers.yearsOld, strings.season);
                        animal.color = strings.color.replaceFirst(" ", "");
                        animal.sex = strings.sex.replace(" ", "");
                        animal.weight = strings.weight.replace("  ", " ");
                        animal.arrival = dates.arrival;
                        animal.age = integers.yearsOld;
                        out.print(animal.id + ": " + animal.name + "\n" + animal.age + " years old " + animal.sex + "."
                                + "\nBirthday: " + animal.birthday + "\n" + animal.color + " " + animal.weight + "\n"
                                + "Arrival" + " " + animal.arrival);
                        hyenaHabitat.add(animal);
                    }
                    case "lion" -> {
                        // out.print("Intaking "+ dates.inTaking +"\n");
                        // output.write("\n" +"Intaking " + dates.inTaking + "; ");
                        integers.numOfLions++;
                        strings.uniqueID = genUniqueID(strings.species, integers.numOfLions);
                        // out.println(strings.uniqueID + ": " + strings.lions[integers.numOfLions -
                        // 1]);
                        // output.write(strings.uniqueID + ": " + strings.lions[integers.numOfLions -
                        // 1]);
                        Animal animal = new Animal();
                        animal.id = strings.uniqueID;
                        animal.name = strings.lions[integers.numOfLions].replace(" ", "");
                        animal.birthday = genBirthDay(integers.yearsOld, strings.season);
                        animal.color = strings.color.replaceFirst(" ", "");
                        animal.sex = strings.sex.replace(" ", "");
                        animal.weight = strings.weight.replace("  ", " ");
                        animal.arrival = dates.arrival;
                        animal.age = integers.yearsOld;
                        out.print(animal.id + ": " + animal.name + "\n" + animal.age + " years old " + animal.sex + "."
                                + "\nBirthday: " + animal.birthday + "\n" + animal.color + " " + animal.weight + "\n"
                                + "Arrival" + " " + animal.arrival);
                        lionHabitat.add(animal);
                    }
                    case "tiger" -> {
                        // out.print("Previous quarter "+ dates.preQuart +"\n");
                        // output.write("\n" +"Previous quarter " + dates.preQuart + "; ");
                        integers.numOfTigers++;
                        strings.uniqueID = genUniqueID(strings.species, integers.numOfTigers);
                        // out.println(strings.uniqueID + ": " + strings.tigers[integers.numOfTigers -
                        // 1]);
                        // output.write(strings.uniqueID + ": " + strings.tigers[integers.numOfTigers -
                        // 1]);
                        Animal animal = new Animal();
                        animal.id = strings.uniqueID;
                        animal.name = strings.tigers[integers.numOfTigers].replace(" ", "");
                        animal.birthday = genBirthDay(integers.yearsOld, strings.season);
                        animal.color = strings.color.replaceFirst(" ", "");
                        animal.sex = strings.sex.replace(" ", "");
                        animal.weight = strings.weight.replace("  ", " ");
                        animal.arrival = dates.arrival;
                        animal.age = integers.yearsOld;
                        out.print(animal.id + ": " + animal.name + "\n" + animal.age + " years old " + animal.sex + "."
                                + "\nBirthday: " + animal.birthday + "\n" + animal.color + " " + animal.weight + "\n"
                                + "Arrival" + " " + animal.arrival);
                        tigerHabitat.add(animal);
                    }
                    case "bear" -> {
                        // out.print(strings.TBA +"\n");
                        // output.write("\n" + strings.TBA + "; ");
                        integers.numOfBears++;
                        strings.uniqueID = genUniqueID(strings.species, integers.numOfBears);
                        // out.println(strings.uniqueID + ": " + strings.bears[integers.numOfBears -
                        // 1]);
                        // output.write(strings.uniqueID + ": " + strings.bears[integers.numOfBears -
                        // 1]);
                        Animal animal = new Animal();
                        animal.id = strings.uniqueID;
                        animal.name = strings.bears[integers.numOfBears].replace(" ", "");
                        animal.birthday = genBirthDay(integers.yearsOld, strings.season);
                        animal.color = strings.color.replaceFirst(" ", "");
                        animal.sex = strings.sex.replace(" ", "");
                        animal.weight = strings.weight.replace("  ", " ");
                        animal.arrival = dates.arrival;
                        animal.age = integers.yearsOld;
                        out.print(animal.id + ": " + animal.name + "\n" + animal.age + " years old " + animal.sex + "."
                                + "\nBirthday: " + animal.birthday + "\n" + animal.color + " " + animal.weight + "\n"
                                + "Arrival" + " " + animal.arrival);
                        bearHabitat.add(animal);
                    }
                    default -> out.println("Error tabulating number of species");
                }
                out.println("\n");
                // output.write(", " + integers.yearsOld + " yearsOld:" + dates.birthdate + ","
                // + strings.color + ", "
                // + strings.sex + "," + strings.weight + "," + strings.origin + "\n");
            }
            out.println("numOfHyenas = " + integers.numOfHyenas);
            out.println("numOfLions = " + integers.numOfLions);
            out.println("numOfTigers = " + integers.numOfTigers);
            out.println("numOfBears = " + integers.numOfBears);

            // Printing linked lists
            // Hyenas Habitat
            output.write('"' + strings.habs[0] + '"' + "\n");
            for (Animal animal : hyenaHabitat) {
                output.write(animal.id + " " + animal.name + " " + animal.age + " years old" + ", birthday is "
                        + animal.birthday + ", " + animal.color + ", sex is " + animal.sex + ", weight is"
                        + animal.weight + "\n");
            }
            // Lions Habitat
            output.write("\n" + '"' + "Lion Habitat" + '"' + "\n");
            for (Animal animal : lionHabitat) {
                output.write(animal.id + " " + animal.name + " " + animal.age + " years old" + ", birthday is "
                        + animal.birthday + ", " + animal.color + ", sex is " + animal.sex + ", weight is"
                        + animal.weight + "\n");
            }
            // Tigers Habitat
            output.write("\n" + '"' + "Tiger Habitat" + '"' + "\n");
            for (Animal animal : tigerHabitat) {
                output.write(animal.id + " " + animal.name + " " + animal.age + " years old" + ", birthday is "
                        + animal.birthday + ", " + animal.color + ", sex is " + animal.sex + ", weight is"
                        + animal.weight + "\n");
            }
            // Bears Habitat
            output.write("\n" + '"' + "Bear Habitat" + '"' + "\n");
            for (Animal animal : bearHabitat) {
                output.write(animal.id + " " + animal.name + " " + animal.age + " years old" + ", birthday is "
                        + animal.birthday + ", " + animal.color + ", sex is " + animal.sex + ", weight is"
                        + animal.weight + "\n");
            }
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // buffered Writer
        // main
    }
    // zooPopulation
}
