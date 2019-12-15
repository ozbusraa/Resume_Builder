package Info;

import java.io.BufferedWriter;

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


    void printEducationInfo1(BufferedWriter writer);
    void printEducationInfo2(BufferedWriter writer);
    void printEducationInfo3(BufferedWriter writer);

    void printWorkInfo1(BufferedWriter writer);
    void printWorkInfo2(BufferedWriter writer);
    void printWorkInfo3(BufferedWriter writer);

    void printCertificateInfo1(BufferedWriter writer);
    void printCertificateInfo2(BufferedWriter writer);
    void printCertificateInfo3(BufferedWriter writer);

    void printReferenceInfo1(BufferedWriter writer);
    void printReferenceInfo2(BufferedWriter writer);
    void printReferenceInfo3(BufferedWriter writer);

    void printVolunteerInfo1(BufferedWriter writer);
    void printVolunteerInfo2(BufferedWriter writer);
    void printVolunteerInfo3(BufferedWriter writer);

    void printSkillInfo1(BufferedWriter writer);
    void printSkillInfo2(BufferedWriter writer);
    void printSkillInfo3(BufferedWriter writer);

    void printHobbyInfo1(BufferedWriter writer);
    void printHobbyInfo2(BufferedWriter writer);
    void printHobbyInfo3(BufferedWriter writer);

    void printProjectInfo1(BufferedWriter writer);
    void printProjectInfo2(BufferedWriter writer);
    void printProjectInfo3(BufferedWriter writer);

    void printPersonalInfo1(BufferedWriter writer);
    void printPersonalInfo2(BufferedWriter writer);
    void printPersonalInfo3(BufferedWriter writer);

    void save();

}
