import jdk.jfr.Description;

public class ProjectTest {
    public static void main(String[] args) {
        Project p = new Project();

        p.setName("DEFAULT NAME");
        p.setDescription("DEFAULT DESCRIPTION");

        System.out.println(p.Project("Song 1", "Description 1"));
        System.out.println(p.Project("Song 2"));
        System.out.println(p.Project());

        p.setName("SET NAME");
        p.setDescription("SET DESCRIPTION");
        System.out.println(p.getName() + " : " + p.getDescription());

        
    }
}