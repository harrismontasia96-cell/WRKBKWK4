package com.pluralsight;

public class Room {
            private int NumberOfBeds;
            private double Price;
            private boolean Occupied;
            private boolean Dirty;



    public Room( int NumberOfBeds, double Price, boolean Occupied, boolean Dirty){
                this.NumberOfBeds = NumberOfBeds;
                this.Price = Price;
                this.Occupied = Occupied;
                this.Dirty = Dirty;

            }

            public int getNumberOfBeds () {
                return NumberOfBeds;
            }

            public double getPrice () {
                return Price;
            }

            public boolean isOccupied () {
                return Occupied;
            }

            public boolean isDirty () {
                return Dirty;
            }

            public boolean isAvailable () {
                return !Occupied && !Dirty;
            }

            // Example main method to test
            public static void main (String[]args){
                Room room1 = new Room(2, 150.00, false, false);

                System.out.println("Beds: " + room1.getNumberOfBeds());
                System.out.println("Price: $" + room1.getPrice());
                System.out.println("Occupied: " + room1.isOccupied());
                System.out.println("Dirty: " + room1.isDirty());
                System.out.println("Available: " + room1.isAvailable());
            }
        }










