package com.pluralsight;

public class Reservations {

    private String RoomType;
    private double Pricepernight;
    private boolean NumberOfNights;
    private boolean isWeekend;
    private double ReservationTotal;



    public Reservations( String RoomType, double Pricepernight, boolean NumberOfNights, boolean isWeekend, double ReservationTotal ) {
        setRoomType(RoomType);
        this.Pricepernight = Pricepernight;
        this.NumberOfNights = NumberOfNights;
        this.isWeekend= isWeekend;
        this.ReservationTotal= ReservationTotal;

    }

    public String getRoomType() {
        return RoomType;
    }

        public void setRoomType(String roomType) {
            this.roomType = roomType.toLowerCase(); // make it case-insensitive
            if (this.roomType.equals("king")) {
                this.pricePerNight = 139.00;
            } else if (this.roomType.equals("double")) {
                this.pricePerNight = 124.00;
            } else {
                throw new IllegalArgumentException("Invalid room type. Must be 'king' or 'double'.");
            }

    }

    public double getPrice () {
        if (isWeekend) {
            return pricePerNight * 1.10;
        } else {
            return pricePerNight;
        }
    }


    public boolean getNumberOfNights () {
        return NumberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend()  {
        return isWeekend;
    }
    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;

    }
    public static void main(String[] args) {
        Reservation r1 = new Reservation("king", 3, true);
        System.out.println("Room Type: " + r1.getRoomType());
        System.out.println("Price per Night: $" + r1.getPrice());
        System.out.println("Number of Nights: " + r1.getNumberOfNights());
        System.out.println("Weekend Stay: " + r1.isWeekend());
        System.out.println("Total: $" + r1.getReservationTotal());
    }
}





