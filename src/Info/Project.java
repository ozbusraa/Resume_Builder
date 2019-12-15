package Info;

public interface Project {

    void setProjectName(String projectName);
    void setDescription(String description);
    void setNextProject(Project nextProject);

    String getProjectName();
    String getDescription();
    Project getNextProject();
}

