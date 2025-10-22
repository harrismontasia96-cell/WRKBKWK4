package com.pluralsight;

public class Room {
            private int NumberOfBeds;
            private double Price;
            private boolean Occupied;
            private boolean Dirty;
            private boolean Cleanroom;
            private int checkIn;
            private int checkOut;



    public Room( int NumberOfBeds, double Price, boolean Occupied, boolean Dirty, boolean Cleanroom, int checkIn, int checkOut){
                this.NumberOfBeds = NumberOfBeds;
                this.Price = Price;
                this.Occupied = Occupied;
                this.Dirty = Dirty;
        this.Cleanroom = Cleanroom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;

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
    public boolean Cleanroom () {
        return Cleanroom;
    }
    public int getCheckIn () {
        return checkIn;
    }
    public int getCheckOut () {
        return checkOut;
    }
    public void setCheckIn (int checkIn) {
        this.checkIn = checkIn;
    }
    public void setCheckOut (int checkOut) {
        this.checkOut = checkOut;
    }

            public boolean isAvailable () {
                return !Occupied && !Dirty;
            }

            public static void main (String[]args){
        Room room1 = new Room(2, 150.00, false, false, true, 101, 105);


                System.out.println("Beds: " + room1.getNumberOfBeds());
                System.out.println("Price: $" + room1.getPrice());
                System.out.println("Occupied: " + room1.isOccupied());
                System.out.println("Dirty: " + room1.isDirty());
                System.out.println("Available: " + room1.isAvailable());
            }
        }










