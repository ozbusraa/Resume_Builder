package Resume;

import Info.User;
import Info.UserInterface;

import java.io.BufferedWriter;


public abstract class Layout {


     public final void putInfosforWork(UserInterface user, BufferedWriter writer){
        printLayoutHeader(writer);
        putPersonalInfo(user,writer);
        putWorkInfo(user,writer);
        putSkillInfo(user,writer);
        putProjectInfo(user,writer);
        putEducationInfo(user,writer);
        putCertificatesInfo(user,writer);
        putVolunteerInfo(user,writer);
        putHobbiesInfo(user,writer);
        putReferencesInfo(user,writer);
    }

    public final void putInfosforMaster(UserInterface user, BufferedWriter writer){
        printLayoutHeader(writer);
        putPersonalInfo(user,writer);
        putEducationInfo(user,writer);
        putProjectInfo(user,writer);
        putSkillInfo(user,writer);
        putWorkInfo(user,writer);
        putCertificatesInfo(user,writer);
        putVolunteerInfo(user,writer);
        putHobbiesInfo(user,writer);
        putReferencesInfo(user,writer);
    }

    public final void putInfosforInternship(UserInterface user, BufferedWriter writer){
        printLayoutHeader(writer);
        putPersonalInfo(user,writer);
        putEducationInfo(user,writer);
        putWorkInfo(user,writer);
        putProjectInfo(user,writer);
        putSkillInfo(user,writer);
        putCertificatesInfo(user,writer);
        putVolunteerInfo(user,writer);
        putHobbiesInfo(user,writer);
        putReferencesInfo(user,writer);
     }

    protected abstract void putCertificatesInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putVolunteerInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putHobbiesInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putReferencesInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putPersonalInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putProjectInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putSkillInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putWorkInfo(UserInterface user, BufferedWriter writer);
    protected abstract void putEducationInfo(UserInterface user, BufferedWriter writer);
    protected abstract void printLayoutHeader(BufferedWriter writer);
}
