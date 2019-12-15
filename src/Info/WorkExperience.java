package Info;

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
}
