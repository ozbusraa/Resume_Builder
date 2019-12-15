package Info;

public class Volunteer implements VolunteerInfo {
    VolunteerInfo nextVolunteerInfo=null;
    String projectName="";
    String description="";

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public void setNextVolunteerInfo(VolunteerInfo volunteerInfo) {
        this.nextVolunteerInfo=volunteerInfo;
    }

    public VolunteerInfo getNextVolunteerInfo() {
        return nextVolunteerInfo;
    }
    public String getProjectName() {
        return projectName;
    }
    public String getDescription() {
        return description;
    }
}
