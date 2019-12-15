package Resume;

import Info.User;
import Info.UserInterface;
import Resume.Resume;

import java.io.BufferedWriter;

public  class ResumeForInternship implements Resume {

    @Override
    public void use(Layout l, UserInterface user, BufferedWriter writer) {
        l.putInfosforInternship(user,writer);
    }
}
