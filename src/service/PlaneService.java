package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Model: ");
        String model = s.next();
        System.out.println("Enter Country: ");
        String country = s.next();
        System.out.println("Enter Year: ");
        int year = s.nextInt();
        System.out.println("Enter Hours: ");
        long hours = s.nextLong();
        System.out.println("Enter if Military: ");
        boolean isMilitary = s.nextBoolean();
        System.out.println("Enter Weight: ");
        int weight = s.nextInt();
        System.out.println("Enter Wingspan: ");
        byte wingspan = s.nextByte();
        System.out.println("Enter topSpeed: ");
        int topSpeed = s.nextInt();
        System.out.println("Enter number of seats: ");
        int seats = s.nextInt();
        System.out.println("Enter cost: ");
        double coast = s.nextDouble();
        return new Plane(model, country, year, hours, isMilitary, weight, wingspan, topSpeed, seats, coast);
    }

    //Task1
    public void planeInfo(Plane plane) {
        plane.printInfo();
    }

    //Task2
    public void planeIfMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(plane.getCost() + " " + plane.getTopSpeed());
        } else if (!plane.isMilitary()) {
            System.out.println(plane.getModel() + " " + plane.getCountry());
        }
    }

    //Task3
    public Plane newerPlane(Plane p1, Plane p2) {
        if (p1.getYear() > p2.getYear() || p1.getYear() == p2.getYear()) {
            return p1;
        } else {
            return p2;
        }
    }

    //Task4
    public Plane biggerWingspan(Plane p1, Plane p2) {
        if (p1.getWingspan() < p2.getWingspan() || p1.getWingspan() == p2.getWingspan()) {
            return p2;
        } else {
            return p1;
        }
    }

    //Task5
    public void smallestSeats(Plane p1, Plane p2) {
        if (p1.getSeats() < p2.getSeats() || p1.getSeats() == p2.getSeats()) {
            System.out.println(p1.getCountry());
        } else {
            System.out.println(p2.getCountry());
        }
    }

    //Task6
    public void notMilitary(Plane[] planes) {
        for (Plane x : planes) {
            if (!x.isMilitary()) {
                x.printInfo();
                System.out.println();
            } else {
                System.out.println("All planes are military");
            }
        }
    }

    //Task7
    public void moreThen100(Plane[] planes) {
        for (Plane x : planes) {
            if (x.isMilitary() && x.getHours() > 100) {
                x.printInfo();
                System.out.println();
            } else {
                System.out.println("No Planes");
            }
        }
    }

    //Task8
    public Plane minimalWeight(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getWeight() <= min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

    //Task9
    public Plane militaryMinimal(Plane[] planes) {
        Plane min = null;
        for (int i = 0; i < planes.length; i++) {
            if (min == null) {
                if (planes[i].isMilitary()) {
                    min = planes[i];
                }
            }
        }
        if (min != null) {
            for (int i = 0; i < planes.length; i++) {
                if (planes[i].isMilitary() && planes[i].getCost() < min.getCost()) {
                    min = planes[i];
                }
            }
        }
        return min;
    }

    //Task10
    public void ascendingPlanes(Plane[] planes) {
        Plane temp = null;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j - 1].getYear() > planes[j].getYear()) {
                    temp = planes[j - 1];
                    planes[j - 1] = planes[j];
                    planes[j] = temp;
                }
            }
        }
        for (Plane x : planes) {
            x.printInfo();
        }
    }
}
