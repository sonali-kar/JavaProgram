import java.util.Scanner;
public class timee {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock(1, false);
        Clock clock3 = new Clock(1, 10, 59, true);
        clock1.getHours();
        clock2.getIsAM();
        clock3.getMinutes();
        clock1.getSeconds();
    }
}

class Clock{
    private int Hours;
    private int Minutes;
    private int Seconds;
    private String period;

    Clock(){
        Hours = 12;
        Minutes = 0;
        Seconds = 0;
        period = "am";
    }
    Clock(int hour, Boolean isAM){
        if(isAM){
            period = "am";
        }else{
            period = "pm";
        }
        Hours = hour;
        Minutes = 0;
        Seconds = 0;
    }
    Clock(int hour, int minute, int sec, Boolean isAM){
        if(isAM){
            period = "am";
        }else{
            period = "pm";
        }
        Hours = hour;
        Minutes = minute;
        Seconds = sec;
    }

    void getHours(){
        System.out.println(Hours);
    }
    void getIsAM(){
        System.out.println(period);
    }
    void getMinutes(){
        System.out.println(Minutes);
    }
    void getSeconds(){
        System.out.println(Seconds);
    }


}

