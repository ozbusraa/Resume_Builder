package Info;

public class User implements UserInterface {
    String choosenResumeType;
    String name;
    String email;
    String telNo;
    String address;
    EducationInfo educationInfo;
    WorkExperienceInfo workExperienceInfo;
    SkillsInfo skillsInfo;
    VolunteerInfo volunteerInfo;

    public void showEducationInfo(){
        educationInfo.showInfo();
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

    @Override
    public EducationInfo addNewEducationInfo(EducationInfo educationInfo) {
        EducationInfo e=educationInfo;
        return e;
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

    @Override
    public void save() {
        System.out.println("User is created");
    }
}