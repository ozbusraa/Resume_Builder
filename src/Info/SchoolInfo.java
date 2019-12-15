package Info;

import java.io.BufferedWriter;
import java.io.IOException;

public class SchoolInfo implements EducationInfo{

    String schoolName;
    String department;
    String startDate;
    String finishDate;
    String gpa;
    EducationInfo nextEducationInfo=null;
    @Override
    public void setSchoolName(String schoolName) {
        this.schoolName=schoolName;
    }
    @Override
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    @Override
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
    @Override
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public void setNextEducationInfo(EducationInfo educationInfo) {
        nextEducationInfo=educationInfo;
    }

    public String getSchoolName() {
        return schoolName;
    }
    public String getDepartment() {
        return department;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getFinishDate() {
        return finishDate;
    }
    public String getGpa() {
        return gpa;
    }
    public EducationInfo getNextEducationInfo() {
        return nextEducationInfo;
    }

    @Override
    public void print_Header1(BufferedWriter writer) {

        String text="<h2>Education</h2>";
        write(writer,text);
    }

    @Override
    public void print_Header2(BufferedWriter writer) {

        String text="<div class=\"section\">\n" +
                "\t\t<h2>Education</h2>\n" +
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
    public void print_1(EducationInfo e, BufferedWriter writer)  {

        String text="<ul><li>"+e.getSchoolName()+" ,"+e.getDepartment()+ " ,"+ e.getStartDate()+" - "+ e.getFinishDate()+" , "+ e.getGpa()+"</li>	</ul>";
        while(e.getNextEducationInfo()!=null){
            e=e.getNextEducationInfo();
        text=text+"<ul><li>"+e.getSchoolName()+" ,"+e.getDepartment()+ " ,"+ e.getStartDate()+" - "+ e.getFinishDate()+" , "+ e.getGpa()+"</li>	</ul>";
        }

        write(writer,text);
    }

    @Override
    public void print_2(EducationInfo e, BufferedWriter writer)  {

        String text="<span class=\"date\">"+e.getStartDate()+" - "+e.getFinishDate()+"</span>\n" +
                "\t\t\t<h3>"+e.getSchoolName()+", "+e.getDepartment()+"</h3>\n" +
                "\t\t\t<address>"+e.getGpa()+"</address>" ;
        while(e.getNextEducationInfo()!=null){
            e=e.getNextEducationInfo();
        text=text+"<span class=\"date\">"+e.getStartDate()+" - "+e.getFinishDate()+"</span>\n" +
                "\t\t\t<h3>"+e.getSchoolName()+", "+e.getDepartment()+"</h3>\n" +
                "\t\t\t<address>"+e.getGpa()+"</address>" ;

        }
        write(writer,text);
    }

    @Override
    public void print_3(EducationInfo e, BufferedWriter writer)  {

        String text="<span class=\"date\">"+e.getStartDate()+" - "+ e.getFinishDate()+"</span>\n" +
                "\t\t\t<h3>"+e.getSchoolName()+"</h3>\n" +
                "\t\t\t<address>"+e.getDepartment()+"</address>\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li>Gpa: "+ e.getGpa()+"</li>\n" +
                "\t\t\t</ul>" ;
        while(e.getNextEducationInfo()!=null){
            e=e.getNextEducationInfo();
        text=text+"<span class=\"date\">"+e.getStartDate()+" - "+ e.getFinishDate()+"</span>\n" +
                "\t\t\t<h3>"+e.getSchoolName()+"</h3>\n" +
                "\t\t\t<address>"+e.getDepartment()+"</address>\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li>Gpa: "+ e.getGpa()+"</li>\n" +
                "\t\t\t</ul>" ;
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
