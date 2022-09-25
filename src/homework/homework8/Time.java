package homework.homework8;

public class Time {
    int hour;
    int minute;
    int second;
    int month;
    int year;
    String amPm = "";
    String[] monthes = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int numberOfMonth = 0;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public Time(int month, int year) {
        this.month = month;
        this.year = year;

    }

    public Time(int hour, int minute, int second, int month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.year = year;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;

    }

    public int getSecond() {
        return second;

    }

    public int getMonth() {
        return month;

    }

    public int getYear() {
        return year;

    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 24) {
            hour = 0;
        } else {
            this.hour = hour;
        }

    }

    public void setMinutes(int minute) {
        if (minute < 0 || minute > 60) {
            minute = 0;
        } else {
            this.minute = minute;
        }

    }

    public void setSecond(int second) {
        if (second < 0 || second > 60) {
            second = 0;
        } else {
            this.second = second;
        }

    }

    public void setMonth(int month) {
        if (month < 0 || month > 12) {
            month = 0;
        } else {
            this.month = month;
        }

    }

    public void setYear(int year) {
        if (year < 0) {
            year = 0;
        } else {
            this.year = year;
        }
    }

    public String amPm(int hour) {

        if (hour < 12) {
            amPm = "am";
        } else {
            amPm = "pm";

        }
        return amPm;
    }

    public String season(int month) {
        if (month <= 0 || month > 12) {
            return "No Season Found";
        } else {

            for (int i = 0; i < monthes.length; i++) {
                if (numberOfMonth < month) {
                    numberOfMonth++;
                } else if (i < 2 || i == 11) {
                    return monthes[i] + " is Winter";


                } else if (i < 5) {
                    return monthes[i] + " is Spring";


                } else if (i < 8) {
                    return monthes[i] + " is Summer";


                }
            }
        }

                    return monthes[monthes.length-1] + " is Fall";



        }

    public String timeInfo(){
        return hour+":"+minute+":"+second;
    }public String date(){
        return month+"/"+year;
    }
    public String toString(){
        return hour+":"+minute+":"+second+" - "+month+"/"+year;
    }
}






