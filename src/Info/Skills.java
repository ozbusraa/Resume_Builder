package Info;

public class Skills implements SkillsInfo {
    String languages="";
    String programKnowledge="";
    String other="";

    public void setOther(String other) {
        this.other = other;
    }
    public void setLanguages(String languages) {
        this.languages = languages;
    }
    public void setProgramKnowledge(String programKnowledge) {
        this.programKnowledge = programKnowledge;
    }

    public String getLanguages() {
        return languages;
    }
    public String getProgramKnowledge() {
        return programKnowledge;
    }
    public String getOther() {
        return other;
    }
}
