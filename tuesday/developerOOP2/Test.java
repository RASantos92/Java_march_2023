import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        Developer dev1 = new Developer();
        System.out.println(dev1);

        dev1.setName("Abrar") ;
        dev1.setSleep(4.0) ;
        dev1.setSalary(100000);
        dev1.addLanguage("Java");
        

        Project project1 = new Project();
        project1.title ="Lookify";
        project1.language= "java";

        Project project2 = new Project();
        project2.title ="Netflix clone";
        project2.language= "C#";

        dev1.addProject(project1);
        dev1.addProject(project2);


        Developer dev2 = new Developer("Ashot", 5, 1000000);

        // dev2.displayStatus();

        List<String> dev1Languages = dev1.getLanguages();
        dev1Languages.add("test");
        dev1.displayStatus();


    }
}