package Resume;

import Info.User;
import Info.UserInterface;

import java.io.BufferedWriter;

public interface Resume {
    void use(Layout l, UserInterface user, BufferedWriter writer);

}
