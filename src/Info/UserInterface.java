package Info;

public interface UserInterface {
    //String choosenResumeType=null;


    void setChoosenResumeType(String choosenResumeType) ;
    void setName(String name);
    void setLastName(String lastName);
    void setEmail(String email);
    void setTelNo(String telNo) ;
    void setAddress(String address);
    String getChoosenResumeType() ;

    void setEducationInfo(EducationInfo educationInfo);
    void setWorkExperienceInfo(WorkExperienceInfo workExperienceInfo);
    void setSkillsInfo(SkillsInfo skillsInfo);
    void setVolunteerInfo(VolunteerInfo volunteerInfo);
    void setHobbies(Hobbies hobbies);
    void setProject(Project project);
    void setCertificates(Certificates certificates);
    void setReference(Reference reference);

    void printEducationInfo1();
    void save();

}
