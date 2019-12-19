import Info.*;
import Resume.Resume;
import Resume.ResumeFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);


        JLabel title = new JLabel("Resume Builder");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 0, size.width, size.height);
        JLabel getStarted = new JLabel("Welcome :)");
        panel.add(getStarted);
        Dimension size1 = title.getPreferredSize();
        getStarted.setBounds(150, 150, size1.width, size1.height);
        JButton button = new JButton("Start!");
        panel.add(button);
        Dimension size2 = button.getPreferredSize();
        button.setBounds(150, 300, size2.width, size2.height);
        UserInterface user=new ProxyUser();


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PersonalInfo(user).setVisible(true);
                frame.setVisible(false);
            }
        });

        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);







    }
}
