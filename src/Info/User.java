package Info;

public class User implements UserInterface {
    String choosenResumeType;
    String name;
    String lastName;
    String email;
    String telNo;
    String address;
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


    public void printEducationInfo1(){
        educationInfo.print_1(educationInfo);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public void createNewEducationInfo(EducationInfo a){
        EducationInfo educationInfo1;
    }

    @Override
    public void save() {
        System.out.println("User is created");
    }
}
