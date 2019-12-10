package Info;

public class ProxyUser implements UserInterface{

    String choosenResumeType;
    String name;
    String email;
    String telNo;
    String address;

    private User user;

    EducationInfo educationInfo;
    WorkExperienceInfo workExperienceInfo;
    SkillsInfo skillsInfo;
    VolunteerInfo volunteerInfo;


    @Override
    public EducationInfo addNewEducationInfo(EducationInfo educationInfo) {
        EducationInfo e=educationInfo;
        return e;
    }

    @Override
    public void setNewEducationInfo(EducationInfo educationInfo) {
        EducationInfo e=addNewEducationInfo(educationInfo);
    }

    @Override
    public void setChoosenResumeType(String choosenResumeType) {
        this.choosenResumeType = choosenResumeType;
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
        user.setEducationInfo(educationInfo);
        user.setSkillsInfo(skillsInfo);
        user.setVolunteerInfo(volunteerInfo);
        user.setWorkExperienceInfo(workExperienceInfo);

        user.save();
    }
}

