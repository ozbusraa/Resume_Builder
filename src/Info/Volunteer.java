package Info;

public class Volunteer implements VolunteerInfo {
    VolunteerInfo nextVolunteerInfo=null;
    @Override
    public void setNextVolunteerInfo(VolunteerInfo volunteerInfo) {
        this.nextVolunteerInfo=volunteerInfo;
    }
}
