package Info;

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
}
