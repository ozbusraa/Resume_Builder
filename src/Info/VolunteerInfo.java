package Info;

import java.io.BufferedWriter;

public interface VolunteerInfo {

    void setProjectName(String projectName);
    void setDescription(String description);
    void setNextVolunteerInfo(VolunteerInfo volunteerInfo);

    VolunteerInfo getNextVolunteerInfo();
    String getProjectName();
    String getDescription();

    void print_Header1(BufferedWriter writer);
    void print_Header2(BufferedWriter writer);
    void print_Header3(BufferedWriter writer);
    void print_Closer(BufferedWriter writer);
    void print_1(VolunteerInfo volunteerInfo, BufferedWriter writer);
    void print_2(VolunteerInfo volunteerInfo, BufferedWriter writer);
    void print_3(VolunteerInfo volunteerInfo, BufferedWriter writer);
    void write(BufferedWriter writer,String text);
}