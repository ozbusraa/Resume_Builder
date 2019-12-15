package Resume;

import Info.User;
import Info.UserInterface;

import java.io.BufferedWriter;

public class ResumeForMasterAppl implements Resume{

    @Override
    public void use(Layout l, UserInterface user, BufferedWriter writer) {
        l.putInfosforMaster(user, writer);
    }
}
