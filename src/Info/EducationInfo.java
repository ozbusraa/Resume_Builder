package Info;

public interface EducationInfo {

    void setSchoolName(String highSchoolName);
    void setDepartment(String department);
    void setStartDate(String startDate);
    void setFinishDate(String finishDate);
    void setGpa(String gpa);

    void setNextEducationInfo(EducationInfo educationInfo);
}

