package brocode.OOP;

public enum M30Day {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), PIZZADAY(8);

    private final int dayNumber;

    M30Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}
