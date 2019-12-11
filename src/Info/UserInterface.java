package Info;

public interface UserInterface {
    //String choosenResumeType=null;
    String name=null;
    String lastName=null;
    String email=null;
    String telNo=null;
    String address=null;

    void setChoosenResumeType(String choosenResumeType) ;
    void setName(String name);
    void setLastName(String lastNamename);
    void setEmail(String email);
    void setTelNo(String telNo) ;
    void setAddress(String address);
    String getChoosenResumeType() ;

    void setEducationInfo(EducationInfo educationInfo);
    void setWorkExperienceInfo(WorkExperienceInfo workExperienceInfo);
    void setSkillsInfo(SkillsInfo skillsInfo);
    void setVolunteerInfo(VolunteerInfo volunteerInfo);

    void save();

}
