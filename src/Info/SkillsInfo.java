package Info;

import java.io.BufferedWriter;

public interface SkillsInfo {

    void setLanguages(String languages);
    void setProgramKnowledge(String programKnowledge) ;
    void setOther(String other);

    String getLanguages();
    String getProgramKnowledge();
    String getOther();

    void print_Header1(BufferedWriter writer);
    void print_Header2(BufferedWriter writer);
    void print_Header3(BufferedWriter writer);
    void print_Closer(BufferedWriter writer);
    void print_1(SkillsInfo skillsInfo, BufferedWriter writer);
    void print_2(SkillsInfo skillsInfo, BufferedWriter writer);
    void print_3(SkillsInfo skillsInfo, BufferedWriter writer);
    void write(BufferedWriter writer,String text);

}
