package Info;

public class noVolunteerInfo implements VolunteerInfo {
    VolunteerInfo nextVolunteerInfo=null;
    String projectName="";
    String description="";

    public void setProjectName(String projectName) {

    }
    public void setDescription(String description) {

    }
    @Override
    public void setNextVolunteerInfo(VolunteerInfo volunteerInfo) {
        //do nothing;
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
