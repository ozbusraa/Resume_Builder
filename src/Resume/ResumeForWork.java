package Resume;

import Info.User;
import Info.UserInterface;

import java.io.BufferedWriter;

public class ResumeForWork implements  Resume{
    @Override
    public void use(Layout l, UserInterface user, BufferedWriter writer) {
        l.putInfosforWork(user,writer);
    }








}
