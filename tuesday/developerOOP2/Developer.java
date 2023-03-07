import java.util.ArrayList;
import java.util.List;
public class Developer{
    // attributes
    private ArrayList<String> languages;
    private String name;
    private double sleep;
    private int salary;
    private ArrayList<Project> projects;

    // Consturctor
    public Developer() {
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    };

    public Developer(String name, double sleep, int salary) {
        this.name = name;
        this.sleep = sleep;
        this.salary = salary;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }


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

    public void addLanguage (String language){
        this.languages.add(language);
    }


    // Getters and setters 
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public double getSleep(){
        return this.sleep;
    }

    public void setSleep(double sleep){
        this.sleep = sleep;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public List<String> getLanguages(){
        return (List<String>) this.languages;
    }

    public void setLanguages(ArrayList<String> languages){
        this.languages = languages;
    }
}