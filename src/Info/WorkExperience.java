package Info;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class WorkExperience implements WorkExperienceInfo {

    String companyName = "";
    String position ="";
    String startDate ="";
    String finishDate ="";
    String description ="";
    WorkExperienceInfo nextWorkExperience=null;

    public void setNextWorkExperience(WorkExperienceInfo nextWorkExperience) {
        this.nextWorkExperience = nextWorkExperience;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }
    public String getPosition() {
        return position;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getFinishDate() {
        return finishDate;
    }
    public String getDescription() {
        return description;
    }
    public WorkExperienceInfo getNextWorkExperience() {
        return nextWorkExperience;
    }

    @Override
    public void print_Header1(BufferedWriter writer) {

        String text="<h2>Work Experience</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {

        String text="<div class=\"section\">\n" +
                "\t\t<h2>Work Experience</h2>\n" +
                "\t\t<div class=\"content\">";
        write(writer,text);
    }

    @Override
    public void print_Closer2(BufferedWriter writer) {

        String text="\t</div>\n" +
                "\t</div>";
        write(writer,text);
    }

    @Override
    public void print_Header3(BufferedWriter writer) {
        print_Header2(writer);
    }

    @Override
    public void print_Closer3(BufferedWriter writer) {
        print_Closer2(writer);
    }

    @Override
    public void print_1(WorkExperienceInfo w, BufferedWriter writer)  {

        String text="<span class=\"date\">"+w.getStartDate()+" - "+w.getFinishDate()+"</span>\n" +
                "\t<h3>"+w.getPosition()+"</h3>\n" +
                "\t<address>"+w.getCompanyName()+", "+w.getPosition()+"</address>\n" +
                "\t<ul>\n" +
                "\t\t<li>"+w.getDescription()+"</li>\n" +
                "\t</ul>" ;

        while(w.getNextWorkExperience()!=null){
            w=w.getNextWorkExperience();
            text=text+"<span class=\"date\">"+w.getStartDate()+" - "+w.getFinishDate()+"</span>\n" +
                    "\t<h3>"+w.getPosition()+"</h3>\n" +
                    "\t<address>"+w.getCompanyName()+", "+w.getPosition()+"</address>\n" +
                    "\t<ul>\n" +
                    "\t\t<li>"+w.getDescription()+"</li>\n" +
                    "\t</ul>" ;
        }
        write(writer,text);
    }

    @Override
    public void print_2(WorkExperienceInfo w, BufferedWriter writer)  {

        String text="<span class=\"date\">"+w.getStartDate()+" - "+w.getFinishDate()+"</span>\n" +
                "\t<h3>"+w.getPosition()+"</h3>\n" +
                "\t<address>"+w.getCompanyName()+", "+w.getPosition()+"</address>\n" +
                "\t<ul>\n" +
                "\t\t<li>"+w.getDescription()+"</li>\n" +
                "\t</ul>" ;
        while(w.getNextWorkExperience()!=null){
            w=w.getNextWorkExperience();
            text=text+"<span class=\"date\">"+w.getStartDate()+" - "+w.getFinishDate()+"</span>\n" +
            "\t<h3>"+w.getPosition()+"</h3>\n" +
            "\t<address>"+w.getCompanyName()+", "+w.getPosition()+"</address>\n" +
            "\t<ul>\n" +
            "\t\t<li>"+w.getDescription()+"</li>\n" +
            "\t</ul>" ;

        }
        write(writer,text);
    }

    @Override
    public void print_3(WorkExperienceInfo w, BufferedWriter writer)  {

        String text="<span class=\"date\">"+w.getStartDate()+" - "+w.getFinishDate()+"</span>\n" +
                "\t<h3>"+w.getPosition()+"</h3>\n" +
                "\t<address>"+w.getCompanyName()+", "+w.getPosition()+"</address>\n" +
                "\t<ul>\n" +
                "\t\t<li>"+w.getDescription()+"</li>\n" +
                "\t</ul>" ;
        while(w.getNextWorkExperience()!=null) {
            w = w.getNextWorkExperience();
            text=text+"<span class=\"date\">"+w.getStartDate()+" - "+w.getFinishDate()+"</span>\n" +
                    "\t<h3>"+w.getPosition()+"</h3>\n" +
                    "\t<address>"+w.getCompanyName()+", "+w.getPosition()+"</address>\n" +
                    "\t<ul>\n" +
                    "\t\t<li>"+w.getDescription()+"</li>\n" +
                    "\t</ul>" ;
        }
        write(writer,text);

    }

    @Override
    public void write(BufferedWriter writer,String text) {
        try {
            writer.write(text);
            writer.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
