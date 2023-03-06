public class Test {
    public static void main(String[] args){
        VoiceMessageUtil messageUtil = new VoiceMessageUtil();
        System.out.println(VoiceMessageUtil.greeting());
        System.out.println(VoiceMessageUtil.greeting());
        System.out.println(messageUtil.greeting("Ashot"));
        System.out.println(messageUtil.greeting("Ashot", 29));
        System.out.println(messageUtil.greeting(29));
        messageUtil.getCurrentDate();

    }
}