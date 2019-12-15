package Info;

import java.io.BufferedWriter;
import java.io.IOException;

public class ProjectInfo implements Project {

    String projectName="";
    String description="";
    Project nextProject=null;

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setNextProject(Project nextProject) {
        this.nextProject = nextProject;
    }

    public String getProjectName() {
        return projectName;
    }
    public String getDescription() {
        return description;
    }
    public Project getNextProject() {
        return nextProject;
    }

    @Override
    public void print_Header1(BufferedWriter writer) {
        String text="<h2>Projects</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {
        String text="<div class=\"section\">\n" +
                "\t\t<h2>Projects</h2>\n" +
                "\t\t<div class=\"content\">";
        write(writer,text);
    }

    @Override
    public void print_Closer2(BufferedWriter writer) {
        String text="\t\t</div>\n" +
        "\t</div>";
        write(writer,text);
    }

    @Override
    public void print_Header3(BufferedWriter writer) {
        String text="<div class=\"section\">\n" +
                "\t\t<h2>Projects</h2>\n" +
                "\t\t<div class=\"content\">";
        write(writer,text);
    }

    @Override
    public void print_Closer3(BufferedWriter writer) {
        print_Closer2(writer);

    }

    @Override
    public void print_1(Project project, BufferedWriter writer) {

    String text="<h3>"+project.getProjectName()+"</h3>\n" +
        "\t<ul>\n" +
        "\t\t<li>"+project.getDescription()+"</li>\n" +
        "\t</ul>";

    while(project.getNextProject()!=null){
        project=project.getNextProject();
        text=text+"<h3>"+project.getProjectName()+"</h3>\n" +
                "\t<ul>\n" +
                "\t\t<li>"+project.getDescription()+"</li>\n" +
                "\t</ul>";
    }
        write(writer,text);
    }

    @Override
    public void print_2(Project project, BufferedWriter writer) {

        String text="<span class=\"date\">"+project.getProjectName()+"</span>\n" +
        "\t\t\t<address>"+project.getDescription()+"</address>";

        while(project.getNextProject()!=null){
            project=project.getNextProject();
            text=text+"<span class=\"date\">"+project.getProjectName()+"</span>\n" +
                    "\t\t\t<address>"+project.getDescription()+"</address>";
        }
        write(writer,text);
    }

    @Override
    public void print_3(Project project, BufferedWriter writer) {

        String text= "<h3>Project Title</h3>\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li>Bullet one Bullet one</li>\n" +
                "\t\t\t\t<li>Bullet two Bullet two</li>\n" +
                "\t\t\t\t<li>Bullet three Bullet three</li>\n" +
                "\t\t\t</ul>" ;
        while(project.getNextProject()!=null){
            project=project.getNextProject();
            text= text+"<h3>Project Title</h3>\n" +
                    "\t\t\t<ul>\n" +
                    "\t\t\t\t<li>Bullet one Bullet one</li>\n" +
                    "\t\t\t\t<li>Bullet two Bullet two</li>\n" +
                    "\t\t\t\t<li>Bullet three Bullet three</li>\n" +
                    "\t\t\t</ul>" ;
        }
        write(writer,text);
    }

    @Override
    public void write(BufferedWriter writer, String text) {
        try {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
