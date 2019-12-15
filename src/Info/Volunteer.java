package Info;

import java.io.BufferedWriter;
import java.io.IOException;

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

    @Override
    public void print_Header1(BufferedWriter writer) {
        String text= "<h2>Volunteer</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {
        String text= "<div class=\"section\">\n" +
                "\t\t<h2>Volunteer Works</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header3(BufferedWriter writer) {
        String text= "<div class=\"section\">\n" +
                "\t\t<h2>Volunteer Projects</h2>";
        write(writer,text);
    }

    @Override
    public void print_Closer(BufferedWriter writer) {
        String text= "</div>";
        write(writer,text);
    }

    @Override
    public void print_1(VolunteerInfo volunteerInfo, BufferedWriter writer) {
        String text= "<h3>"+volunteerInfo.getProjectName()+"</h3>\n" +
                "\t<ul>\n" +
                "\t\t<li>"+volunteerInfo.getDescription()+"</li>\n" +
                "\t</ul>";
        while(volunteerInfo.getNextVolunteerInfo()!=null) {
            volunteerInfo = volunteerInfo.getNextVolunteerInfo();
            text += "<h3>"+volunteerInfo.getProjectName()+"</h3>\n" +
                    "\t<ul>\n" +
                    "\t\t<li>"+volunteerInfo.getDescription()+"</li>\n" +
                    "\t</ul>";

        }
        write(writer,text);
    }

    @Override
    public void print_2(VolunteerInfo volunteerInfo, BufferedWriter writer) {
        String text= "<div class=\"content\">\n" +
                "\t\t\t<span class=\"date\">"+volunteerInfo.getProjectName()+"</span>\n" +
                "\t\t\t<address>"+volunteerInfo.getDescription()+"</address>\n" +
                "\t\t</div>";

        while(volunteerInfo.getNextVolunteerInfo()!=null) {
            volunteerInfo = volunteerInfo.getNextVolunteerInfo();
            text += "<div class=\"content\">\n" +
                    "\t\t\t<span class=\"date\">"+volunteerInfo.getProjectName()+"</span>\n" +
                    "\t\t\t<address>"+volunteerInfo.getDescription()+"</address>\n" +
                    "\t\t</div>";
        }
        write(writer,text);
    }

    @Override
    public void print_3(VolunteerInfo volunteerInfo, BufferedWriter writer) {
        String text= "<div class=\"content\">\n" +
                "\t\t\t<h3>"+volunteerInfo.getProjectName()+"</h3>\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li>"+volunteerInfo.getDescription()+"</li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>";
        while(volunteerInfo.getNextVolunteerInfo()!=null) {
            volunteerInfo = volunteerInfo.getNextVolunteerInfo();
            text += "<div class=\"content\">\n" +
                    "\t\t\t<h3>"+volunteerInfo.getProjectName()+"</h3>\n" +
                    "\t\t\t<ul>\n" +
                    "\t\t\t\t<li>"+volunteerInfo.getDescription()+"</li>\n" +
                    "\t\t\t</ul>\n" +
                    "\t\t</div>";
        }
        write(writer,text);
    }

    @Override
    public void write(BufferedWriter writer, String text) {
        try {
            writer.write(text);
            writer.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
