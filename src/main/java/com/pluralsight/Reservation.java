package com.pluralsight;

public class Reservation {

    private String RoomType;
    private double Pricepernight;
    private int NumberOfNights;
    private boolean isWeekend;
    private double ReservationTotal;


    public Reservation(String RoomType, double Pricepernight, int NumberOfNights, boolean isWeekend) {
        setRoomType(RoomType);
        this.Pricepernight = Pricepernight;
        this.NumberOfNights = NumberOfNights;
        this.isWeekend = isWeekend;


    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        this.RoomType = roomType.toLowerCase().trim();

        if (this.RoomType.equals("king")) {
            this.Pricepernight = 139.00;
        }
        else if (this.RoomType.equals("double") || this.RoomType.equals("double bed")) {
            this.Pricepernight = 124.00;
        }
        else {
            throw new IllegalArgumentException("Invalid room type. Must be 'king' or 'double bed'.");
        }
    }

    public double getPrice () {
        if (isWeekend) {
            return Pricepernight * 1.10;
        } else {
            return Pricepernight;
        }
    }


    public int getNumberOfNights () {
        return NumberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.NumberOfNights = numberOfNights;
    }

    public boolean isWeekend()  {
        return isWeekend;
    }
    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return getPrice() * NumberOfNights;

    }
    public static void main(String[] args) {
        Reservation r1 = new Reservation("king", 139.00, 3,true);
        System.out.println("Room Type: " + r1.getRoomType());
        System.out.println("Price per Night: $" + r1.getPrice());
        System.out.println("Number of Nights: " + r1.getNumberOfNights());
        System.out.println("Weekend Stay: " + r1.isWeekend());
        System.out.println("Total: $" + r1.getReservationTotal());
    }
}





