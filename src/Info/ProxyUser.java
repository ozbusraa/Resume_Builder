package Info;

import java.io.BufferedWriter;

public class ProxyUser implements UserInterface{

    String choosenResumeType;
    String name;
    String lastName;
    String email;
    String telNo;
    String address;

    private User user;


    EducationInfo educationInfo;
    WorkExperienceInfo workExperienceInfo;
    SkillsInfo skillsInfo;
    VolunteerInfo volunteerInfo;
    Hobbies hobbies;
    Project project;
    Certificates certificates;
    Reference reference;

    public void setHobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setCertificates(Certificates certificates) {
        this.certificates = certificates;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }



    @Override
    public void printEducationInfo1(BufferedWriter writer) {
        user.printEducationInfo1(writer);
    }

    @Override
    public void printEducationInfo2(BufferedWriter writer) {
        user.printEducationInfo2(writer);
    }

    @Override
    public void printEducationInfo3(BufferedWriter writer) {
        user.printEducationInfo3(writer);
    }

    @Override
    public void printWorkInfo1(BufferedWriter writer) {
        user.printWorkInfo1(writer);
    }

    @Override
    public void printWorkInfo2(BufferedWriter writer) {
        user.printWorkInfo2(writer);
    }

    @Override
    public void printWorkInfo3(BufferedWriter writer) {
        user.printWorkInfo2(writer);
    }

    @Override
    public void printCertificateInfo1(BufferedWriter writer) {
        user.printCertificateInfo1(writer);
    }

    @Override
    public void printCertificateInfo2(BufferedWriter writer) {
        user.printCertificateInfo2(writer);
    }

    @Override
    public void printCertificateInfo3(BufferedWriter writer) {
        user.printCertificateInfo3(writer);
    }

    @Override
    public void printReferenceInfo1(BufferedWriter writer) {
        user.printReferenceInfo1(writer);
    }

    @Override
    public void printReferenceInfo2(BufferedWriter writer) {
        user.printReferenceInfo2(writer);
    }

    @Override
    public void printReferenceInfo3(BufferedWriter writer) {
        user.printReferenceInfo3(writer);
    }

    @Override
    public void printVolunteerInfo1(BufferedWriter writer) {
        user.printVolunteerInfo1(writer);
    }

    @Override
    public void printVolunteerInfo2(BufferedWriter writer) {
        user.printVolunteerInfo2(writer);
    }

    @Override
    public void printVolunteerInfo3(BufferedWriter writer) {
        user.printVolunteerInfo3(writer);
    }

    @Override
    public void printSkillInfo1(BufferedWriter writer) {
        user.printSkillInfo1(writer);
    }

    @Override
    public void printSkillInfo2(BufferedWriter writer) {
        user.printSkillInfo2(writer);
    }

    @Override
    public void printSkillInfo3(BufferedWriter writer) {
        user.printSkillInfo3(writer);
    }

    @Override
    public void printHobbyInfo1(BufferedWriter writer) {
        user.printHobbyInfo1(writer);
    }

    @Override
    public void printHobbyInfo2(BufferedWriter writer) {
        user.printHobbyInfo2(writer);
    }

    @Override
    public void printHobbyInfo3(BufferedWriter writer) {
        user.printHobbyInfo3(writer);
    }

    @Override
    public void printProjectInfo1(BufferedWriter writer) {
        user.printProjectInfo1(writer);
    }

    @Override
    public void printProjectInfo2(BufferedWriter writer) {
        user.printProjectInfo2(writer);
    }

    @Override
    public void printProjectInfo3(BufferedWriter writer) {
        user.printProjectInfo3(writer);
    }

    @Override
    public void printPersonalInfo1(BufferedWriter writer) {
        user.printPersonalInfo1(writer);
    }

    @Override
    public void printPersonalInfo2(BufferedWriter writer) {
        user.printPersonalInfo2(writer);
    }

    @Override
    public void printPersonalInfo3(BufferedWriter writer) {
        user.printPersonalInfo3(writer);
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public void setChoosenResumeType(String choosenResumeType) {
        this.choosenResumeType = choosenResumeType;
        user.setChoosenResumeType(choosenResumeType);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String getChoosenResumeType() {
        return choosenResumeType;
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



    public void save(){
        user=new User();
        user.setAddress(address);
        user.setName(name);
        user.setEmail(email);
        user.setTelNo(telNo);
        user.setEducationInfo(this.educationInfo);
        user.setSkillsInfo(this.skillsInfo);
        user.setVolunteerInfo(this.volunteerInfo);
        user.setWorkExperienceInfo(this.workExperienceInfo);
        user.setCertificates(this.certificates);
        user.setProject(this.project);
        user.setHobbies(this.hobbies);
        user.setReference(this.reference);

        user.save();
    }
}

