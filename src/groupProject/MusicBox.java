package groupProject;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 2;

        System.out.println("Availible music types are Classical, Pop and Country");

        System.out.println("Please enter the music type: ");
        String musicType = scanner.nextLine();
        if (musicType.trim().equalsIgnoreCase("Classical")) {
            System.out.println("Four Season, Fur Elise, Finlandia, Vocalise, The Planets is available songs under Classical music");
            System.out.println("Which one do you want to listen?");
            String song = scanner.nextLine();
            if (song.trim().equalsIgnoreCase("four season")) {

                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();

                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("Fur Elise")) {

                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }

            } else if (song.trim().equalsIgnoreCase("Finlandia")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("Vocalise")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }

            } else if (song.trim().equalsIgnoreCase("The Planets")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else {
                System.out.println("Sorry, " + song + " is not available on this device yet.");
                System.out.println("It will be in next updating our application.");
                System.out.println("you can listen to the songs available on this device, ");
                System.out.println("or visit the web version of our application: ****online.group1.batch13.com****");
            }


        } else if (musicType.trim().equalsIgnoreCase("Pop")) {
            price = 3;
            System.out.println("Bad guy, Talk, Please Me, 7 Ring, Without Me - is available songs under Pop music");
            System.out.println("Which one do you want to listen?");
            String song = scanner.nextLine();
            if (song.trim().equalsIgnoreCase("Bad guy")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("Talk")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("Please Me")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("7 Ring")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }

            } else if (song.trim().equalsIgnoreCase("Without Me")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else {
                System.out.println("Sorry, " + song + " is not available on this device yet.");
                System.out.println("It will be in next updating our application.");
                System.out.println("you can listen to the songs available on this device, ");
                System.out.println("or visit the web version of our application: ****online.group1.batch13.com****");
            }

        } else if (musicType.trim().equalsIgnoreCase("Country")) {
            price = 4;
            System.out.println("Songs are available  under Country music:");
            System.out.println("Meant to Be, Heaven, Simple, One Number Away, Get Along");
            System.out.println("Which one do you want to listen?");
            String song = scanner.nextLine();
            if (song.trim().equalsIgnoreCase("Meant to Be")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("Heaven")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("Simple")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else if (song.trim().equalsIgnoreCase("One Number Away")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }

            } else if (song.trim().equalsIgnoreCase("Get Along")) {
                System.out.println("Please enter $" + price + " for this song");
                double payment = scanner.nextDouble();
                while (payment < price) {
                    System.out.println("$" + payment + " is not enough. Please enter $" + (price - payment) + " more");
                    double extraPayment = scanner.nextDouble();
                    payment = payment + extraPayment;
                }
                double reminder = payment - price;
                if (reminder == 0) {
                    System.out.println(song + " is playing. Enjoy the song!");
                } else {
                    System.out.println("You have entered $" + reminder + " dollars more.");
                    System.out.println("Please wait for the change.");
                    System.out.println(song + " is playing. Enjoy the song!");
                }


            } else {
                System.out.println("Sorry, " + song + " is not available on this device yet.");
                System.out.println("It will be in next updating our application.");
                System.out.println("you can listen to the songs available on this device, ");
                System.out.println("or visit the web version of our application: ****online.group6.batch13.com****");
            }

        } else {
            System.out.println("Sorry, " + musicType + " category is not available on this device yet.");
            System.out.println("It will be in next updating our application.");
            System.out.println("you can listen to the songs available on this device, ");
            System.out.println("or visit the web version of our application: ****online.group1.batch13.com****");

        }


    }
}