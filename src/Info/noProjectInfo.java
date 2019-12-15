package Info;

import java.io.BufferedWriter;

public class noProjectInfo implements Project {

    String projectName="";
    String description="";
    Project nextProject=null;

    public void setProjectName(String projectName) { }
    public void setDescription(String description) { }
    public void setNextProject(Project nextProject) { }

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

    }

    @Override
    public void print_Header2(BufferedWriter writer) {

    }

    @Override
    public void print_Closer2(BufferedWriter writer) {

    }

    @Override
    public void print_Header3(BufferedWriter writer) {

    }

    @Override
    public void print_Closer3(BufferedWriter writer) {

    }

    @Override
    public void print_1(Project project, BufferedWriter writer) {

    }

    @Override
    public void print_2(Project project, BufferedWriter writer) {

    }

    @Override
    public void print_3(Project project, BufferedWriter writer) {

    }

    @Override
    public void write(BufferedWriter writer, String text) {

    }
}
