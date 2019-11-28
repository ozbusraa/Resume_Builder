package Info;

import Info.EducationInfo;
import Info.SkillsInfo;
import Info.VolunteerInfo;
import Info.WorkExperienceInfo;
import Resume.ResumeFactory;

public class User {
EducationInfoFactory ef;

    public String choosenResumeType;
    EducationInfo educationInfo;
    WorkExperienceInfo workExperienceInfo;
    SkillsInfo skillsInfo;
    VolunteerInfo volunteerInfo;

    String name;
    String email;
    String telNo;
    String address;
    Integer age;
    public void showEducationInfo(){
        educationInfo.showInfo();
    }

    public void setEducationInfo(EducationInfo educationInfo) {
        this.educationInfo = educationInfo;
    }

    public void setWorkExperienceInfo(WorkExperienceInfo workExperienceInfo) {
        this.workExperienceInfo = workExperienceInfo;
    }

    public void setSkillsInfo(SkillsInfo skillsInfo) {
        this.skillsInfo = skillsInfo;
    }

    public void setVolunteerInfo(VolunteerInfo volunteerInfo) {
        this.volunteerInfo = volunteerInfo;
    }
    public void createNewEducationInfo(EducationInfo a){
        EducationInfo educationInfo1;
    }
}
