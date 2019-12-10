package Info;

public class SchoolInfo implements EducationInfo{
    String SchoolName;

    @Override
    public void setSchoolName(String SchoolName) {
        this.SchoolName=SchoolName;
    }

    @Override
    public EducationInfo nextEducationInfo(EducationInfo educationInfo) {
        return educationInfo;
    }


}
