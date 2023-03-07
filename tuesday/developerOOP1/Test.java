public class Test{
    public static void main(String[] args){
        Developer dev1 = new Developer();
        System.out.println(dev1);

        dev1.name = "Abrar";
        dev1.sleep = 4.0;
        dev1.salary = 100000;
        dev1.languages.add("Java");
        

        Project project1 = new Project();
        project1.title ="Lookify";
        project1.language= "java";

        Project project2 = new Project();
        project2.title ="Netflix clone";
        project2.language= "C#";

        dev1.addProject(project1);
        dev1.addProject(project2);
        dev1.displayStatus();
    }
}