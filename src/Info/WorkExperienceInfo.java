package Info;

import java.util.Date;

public interface WorkExperienceInfo {
    void setCompanyName(String companyName);
    void setPosition(String position);
    void setStartDate(String startDate);
    void setFinishDate(String finishDate);
    void setDescription(String description);

    void setNextWorkExperience(WorkExperienceInfo nextWorkExperince) ;

}
