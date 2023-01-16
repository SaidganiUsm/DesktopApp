import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField field;
    private JButton collapse;
    private JTextArea infoArea;
    private JButton expand;

    public MainForm()
    {
        infoArea.setVisible(false);
        expand.setVisible(false);
        collapse.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int nameLength = name.length();
                String surname = surnameField.getText();
                int surnameLength = surname.length();
                if (nameLength > 2 && surnameLength > 2){
                    nameField.setVisible(false);
                    surnameField.setVisible(false);
                    field.setVisible(false);
                    collapse.setVisible(false);
                    infoArea.setText(name + " " + surname + " " + field.getText());
                    infoArea.setVisible(true);
                    expand.setVisible(true);
                }
            }
        });
        expand.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setVisible(true);
                surnameField.setVisible(true);
                field.setVisible(true);
                collapse.setVisible(true);

                infoArea.setVisible(false);
                expand.setVisible(false);
            }
        });
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    private void createUIComponents()
    {
        // TODO: place custom component creation code here
    }
}
