import java.util.Date;
import java.util.ArrayList;
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

    public int totalMessages(int[] intArr){
        int sum = 0;
        // Traditional for loop
        // for (int i = 0 ; i < intArr.length; i++){
        //     sum += intArr[i];
        // }

        for(int number : intArr){
            sum += number;
        }
        return sum;
    }
    
    public void printMessages(ArrayList<String> messages){

        for (String message : messages){
            System.out.println(message);
        }
        // for(int i = 0; i< messages.size(); i++){
        //     System.out.println(messages.get(i));
        // }
    }

}