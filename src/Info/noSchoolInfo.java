package Info;

public class noSchoolInfo implements EducationInfo{
    String SchoolName;

    @Override
    public void setSchoolName(String highSchoolName) {
        this.SchoolName="";
    }

    @Override
    public EducationInfo nextEducationInfo(EducationInfo educationInfo) {
        return null;
    }

}
