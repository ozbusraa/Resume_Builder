package Info;

public interface VolunteerInfo {

    void setProjectName(String projectName);
    void setDescription(String description);

    void setNextVolunteerInfo(VolunteerInfo volunteerInfo);
}
