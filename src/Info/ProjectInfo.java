package Info;

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
}
