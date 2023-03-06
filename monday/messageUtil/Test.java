import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        VoiceMessageUtil messageUtil = new VoiceMessageUtil();
        System.out.println(VoiceMessageUtil.greeting());
        messageUtil.getCurrentDate();


        // -----------Fixed Arrays and for-loops------------
        int[] messagesPerDay = new int[5];
        messagesPerDay[0] = 5;
        messagesPerDay[1] = 5;
        messagesPerDay[2] = 5;

        int[] messagesPerDay1 = {5,5,5};

        String[] messages = {"string1", "string2", "string3"};

        System.out.println(messageUtil.totalMessages(messagesPerDay));

        // -----------Dynamic arrays: ArrayList-------------
        ArrayList<Double> intsArray = new ArrayList<Double>();
        intsArray.add(34.4);

        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Finish cafe bussiness logic");
        todoList.add("Read ahead for oop");
        messageUtil.printMessages(todoList);


        // ----------------Type Casting---------------------
        int days = 7;
        double costOfLiving = 7.59;

        double weeklyTotalCostOfLiving = days * costOfLiving;

        int weeklyTotalCostOfLiving1 = days * (int) costOfLiving;
        System.out.println(weeklyTotalCostOfLiving1);

    }
}