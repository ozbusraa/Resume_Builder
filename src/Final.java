import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.net.URL;

public class Final extends JFrame{
    public Final()  {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(null);

        JLabel title = new JLabel("Your CV is ready!");
        panel.add(title);
        Dimension size = title.getPreferredSize();
        title.setBounds(140, 50, size.width, size.height);

        JLabel desc = new JLabel("     You can access your CV from your files and convert it to PDF ");
        panel.add(desc);
        Dimension a = desc.getPreferredSize();
        desc.setBounds(0, 100, a.width, a.height);

        JButton convert = new JButton("Convert it to PDF");
        panel.add(convert);
        Dimension b = convert.getPreferredSize();
        convert.setBounds(200 , 300, b.width, b.height);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("http://html2pdf.com").toURI());
                    setVisible(false);
                    dispose();
                    System.exit(0);
                } catch (Exception exc) {}
            }
        });
    }
}
