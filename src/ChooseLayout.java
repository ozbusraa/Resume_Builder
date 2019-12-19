import Info.User;
import Info.UserInterface;
import Resume.*;
import Resume.ResumeFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ChooseLayout extends JFrame {

    public ChooseLayout(UserInterface user) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Choose Layout");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 50, size.width, size.height);

        JRadioButton first = new JRadioButton("1");
        Dimension size2 = first.getPreferredSize();
        first.setBounds(25, 250, size2.width, size2.height);
        JRadioButton second = new JRadioButton("2");
        Dimension size3 = second.getPreferredSize();
        second.setBounds(150, 250, size3.width, size3.height);
        JRadioButton third = new JRadioButton("3");
        Dimension size4 = third.getPreferredSize();
        third.setBounds(275, 250, size4.width, size4.height);

        ButtonGroup g = new ButtonGroup();
        g.add(first);
        g.add(second);
        g.add(third);

        panel.add(first);
        panel.add(second);
        panel.add(third);

        JButton saveButton = new JButton("Create CV");
        panel.add(saveButton);
        Dimension size5 = saveButton.getPreferredSize();
        saveButton.setBounds(300, 300, size5.width, size5.height);

//        JButton goBackButton = new JButton("Go Back");
//        panel.add(goBackButton);
//        Dimension size6 = goBackButton.getPreferredSize();
//        goBackButton.setBounds(200, 300, size6.width, size6.height);
        setSize(400, 400);
        setLocationRelativeTo(null);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FileWriter fWriter = null;
                try {
                    fWriter = new FileWriter("CV.html");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                BufferedWriter writer = new BufferedWriter(fWriter);


                ResumeFactory rf = new ResumeFactory();
                Resume r = rf.produceResume(user.getChoosenResumeType());

                Layout L = null;


                if (!first.isSelected() && !second.isSelected() && !third.isSelected()) {
                    String message = "Select at least one to go to the next step";
                    JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (first.isSelected()) {
                        Layout  L1 = new Layout1();
                        r.use(L1, user, writer);
                    } else if (second.isSelected()) {
                        Layout L2 = new Layout2();
                        r.use(L2, user, writer);
                    } else if (third.isSelected()) {
                        Layout L3 = new Layout3();
                        r.use(L3, user, writer);
                    }
                    new Final().setVisible(true);
                    dispose();
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                }

                dispose();
            }
        });
    }
}