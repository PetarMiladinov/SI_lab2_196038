import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList)//1 {
        List<Integer> result = new ArrayList<>()//2;

        for (int i = 0 /*3*/ ; i < timesList.size()/*4*/; i++/*21*/) {
            int hr = timesList.get(i).getHours()/*5*/;
            int min = timesList.get(i).getMinutes()/*6*/;
            int sec = timesList.get(i).getSeconds()/*7*/;
            if (hr < 0 || hr > 24)/*8   */{
                if (hr < 0)/*9*/{
                    throw new RuntimeException("The hours are smaller than the minimum")/*10*/;
                }
                else {
                    throw new RuntimeException("The hours are grater than the maximum")/*11*/;
                }
            }
            else if (hr < 24)/*12*/ {
                if (min < 0 || min > 59)/*13*/
                    throw new RuntimeException("The minutes are not valid!")/*14*/;
                else {
                    if (sec >= 0 && sec <= 59) /*15*/
                        result.add(hr * 3600 + min * 60 + sec); /*16*/
                    else
                        throw new RuntimeException("The seconds are not valid"); /*17*/
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) /*18*/ {
                result.add(hr * 3600 + min * 60 + sec); /*19*/
            }
            else {
                throw new RuntimeException("The time is greater than the maximum"); /*20*/
            }
        }
        return result; /*21*/
    }
}