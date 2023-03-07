import java.util.ArrayList;
public class Developer{
    // attributes
    public ArrayList<String> languages = new ArrayList<String>();
    public String name;
    public double sleep;
    public int salary;
    public ArrayList<Project> projects = new ArrayList<Project>();

    // methods
    public void displayStatus(){
        System.out.println("name: " + this.name + "\n" +
                            "sleep: " + this.sleep + "\n" +
                            "salary: " + this.salary + "\n" +
                            "languages: " + this.languages + "\n"+
                            "projects: "
        );
        for (Project project : this.projects ){
            project.displayInfo();
            System.out.println("\n");
        }
    }

    public void addProject (Project project){
        this.projects.add(project);
    }
}