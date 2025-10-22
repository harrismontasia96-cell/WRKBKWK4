package com.pluralsight;

public class Hotel {
    public static void main(String[] args) {

    }
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;
    }

    Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() >= numberOfRooms) {
                this.bookedSuites += numberOfRooms;
                System.out.println(numberToBook + " suite(s) booked successfully.");
                return true;
            }
        } else {
            System.out.println("Not enough suites available!");
            return false;
        }
    } else {
            if (getAvailableRooms() >= numberOfRooms) {
                this.bookedBasicRooms += numberOfRooms;
                System.out.println(numberToBook + " basic room(s) booked successfully.");
                return true;
            } else {
                System.out.println("Not enough basic rooms available!");
                return false;
            }
        }
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }




