package Info;

import java.io.BufferedWriter;

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

    @Override
    public void print_Header1(BufferedWriter writer) {

    }

    @Override
    public void print_Header2(BufferedWriter writer) {

    }

    @Override
    public void print_Header3(BufferedWriter writer) {

    }

    @Override
    public void print_Closer(BufferedWriter writer) {

    }

    @Override
    public void print_1(VolunteerInfo volunteerInfo, BufferedWriter writer) {

    }

    @Override
    public void print_2(VolunteerInfo volunteerInfo, BufferedWriter writer) {

    }

    @Override
    public void print_3(VolunteerInfo volunteerInfo, BufferedWriter writer) {

    }

    @Override
    public void write(BufferedWriter writer, String text) {

    }
}
