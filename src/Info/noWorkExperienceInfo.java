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
}
