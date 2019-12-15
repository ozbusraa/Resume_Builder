package Info;

import java.io.BufferedWriter;
import java.util.Date;

public interface WorkExperienceInfo {
    void setCompanyName(String companyName);
    void setPosition(String position);
    void setStartDate(String startDate);
    void setFinishDate(String finishDate);
    void setDescription(String description);

    void setNextWorkExperience(WorkExperienceInfo nextWorkExperince) ;

    String getCompanyName();
    String getPosition();
    String getStartDate();
    String getFinishDate();
    String getDescription();
    WorkExperienceInfo getNextWorkExperience();

    void print_Header1(BufferedWriter writer);
    void print_Header2(BufferedWriter writer);
    void print_Closer2(BufferedWriter writer);
    void print_Header3(BufferedWriter writer);
    void print_Closer3(BufferedWriter writer);
    void print_1(WorkExperienceInfo workExperienceInfo, BufferedWriter writer);
    void print_2(WorkExperienceInfo workExperienceInfoo, BufferedWriter writer);
    void print_3(WorkExperienceInfo workExperienceInfo, BufferedWriter writer);
    void write(BufferedWriter writer,String text);

}
