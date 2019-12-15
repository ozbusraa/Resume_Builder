package Info;

import java.io.BufferedWriter;

public class noWorkExperienceInfo implements WorkExperienceInfo {

    String companyName = "";
    String position ="";
    String startDate ="";
    String finishDate ="";
    String description ="";
    WorkExperienceInfo nextWorkExperience=null;

    public void setNextWorkExperience(WorkExperienceInfo nextWorkExperience) {  }
    public void setCompanyName(String companyName) { }
    public void setPosition(String position) { }
    public void setStartDate(String startDate) { }
    public void setFinishDate(String finishDate) {  }
    public void setDescription(String description) {  }

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
    System.out.println("No work experinece");
    }

    @Override
    public void print_Header2(BufferedWriter writer) {

    }

    @Override
    public void print_Closer2(BufferedWriter writer) {

    }

    @Override
    public void print_Header3(BufferedWriter writer) {

    }

    @Override
    public void print_Closer3(BufferedWriter writer) {

    }

    @Override
    public void print_1(WorkExperienceInfo workExperienceInfo, BufferedWriter writer) {

    }

    @Override
    public void print_2(WorkExperienceInfo workExperienceInfoo, BufferedWriter writer) {

    }

    @Override
    public void print_3(WorkExperienceInfo workExperienceInfo, BufferedWriter writer) {

    }

    @Override
    public void write(BufferedWriter writer, String text) {

    }
}
