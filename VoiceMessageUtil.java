import java.util.Date;
public class VoiceMessageUtil {

    public static String greeting(){
        return "hello world";
    }

    public String greeting(String name){
        return "hello " + name;
    }

    public String greeting(int count){
        return "hello " + count;
    }

    public String greeting(String name, int count){
        return "hello " + name + count;
    }

    public void getCurrentDate(){
        Date today = new Date();
        System.out.println("Hello, the current date is: " + today);
    }
}