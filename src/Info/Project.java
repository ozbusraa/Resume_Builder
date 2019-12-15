package Info;

import java.io.BufferedWriter;

public interface Project {

    void setProjectName(String projectName);
    void setDescription(String description);
    void setNextProject(Project nextProject);

    String getProjectName();
    String getDescription();
    Project getNextProject();

    void print_Header1(BufferedWriter writer);
    void print_Header2(BufferedWriter writer);
    void print_Closer2(BufferedWriter writer);
    void print_Header3(BufferedWriter writer);
    void print_Closer3(BufferedWriter writer);
    void print_1(Project project, BufferedWriter writer);
    void print_2(Project project, BufferedWriter writer);
    void print_3(Project project, BufferedWriter writer);
    void write(BufferedWriter writer,String text);
}

