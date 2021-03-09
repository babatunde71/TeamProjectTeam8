import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SettingsForm {


    private JButton backupDatabaseButton;
    private JPanel panel;
    private JButton restoreDatabaseButton;
    private JLabel configureDatabaseBackupLabel;
    private JLabel configureReportGenerationLabel;
    private JComboBox timeDatabaseUpComboBox;
    private JComboBox timeCustomerReportGenerationComboBox;
    private JComboBox timeEmployeeComboBox;
    private JComboBox timeSummaryPerformanceComboBox;
    private JLabel configureSummaryPerformanceReportLabel;
    private JLabel configureEmployeePerformanceReportLabel;
    private JButton saveButton;
    private JTextField textField1;
    private JButton addButton;
    private JComboBox CustomerReportConfigurationComboBox;
    private JLabel customerIDLabel;
    private JLabel outputCustomerReportConfigurationLabel;

    private JFileChooser fc;
    static private final String newline = "\n";

    public SettingsForm(){
        //Create and set up the window.
        JFrame frame = new JFrame("Settings Form" +
                "");
        fc = new JFileChooser();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        System.out.println("Hello");
        timeDatabaseUpComboBox.addItem("1 Week");
        timeDatabaseUpComboBox.addItem("2 Week");
        timeDatabaseUpComboBox.addItem("1 Month");
        timeDatabaseUpComboBox.addItem("3 Month");
        timeDatabaseUpComboBox.addItem("6 Month");
        timeDatabaseUpComboBox.addItem("12 Month");

        timeCustomerReportGenerationComboBox.addItem("1 Week");
        timeCustomerReportGenerationComboBox.addItem("2 Week");
        timeCustomerReportGenerationComboBox.addItem("1 Month");
        timeCustomerReportGenerationComboBox.addItem("3 Month");
        timeCustomerReportGenerationComboBox.addItem("6 Month");
        timeCustomerReportGenerationComboBox.addItem("12 Month");


        timeEmployeeComboBox.addItem("1 Week");
        timeEmployeeComboBox.addItem("2 Week");
        timeEmployeeComboBox.addItem("1 Month");
        timeEmployeeComboBox.addItem("3 Month");
        timeEmployeeComboBox.addItem("6 Month");
        timeEmployeeComboBox.addItem("12 Month");

        timeSummaryPerformanceComboBox.addItem("1 Week");
        timeSummaryPerformanceComboBox.addItem("2 Week");
        timeSummaryPerformanceComboBox.addItem("1 Month");
        timeSummaryPerformanceComboBox.addItem("3 Month");
        timeSummaryPerformanceComboBox.addItem("6 Month");
        timeSummaryPerformanceComboBox.addItem("12 Month");




        backupDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int returnVal = fc.showSaveDialog(frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    //This is where a real application would save the file.
                    System.out.println("Saving: " + file.getName() + "." + newline);

                }
            }
        });
        restoreDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int returnVal = fc.showOpenDialog(frame);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    //This is where a real application would open the file.
                    System.out.println("Opening: " + file.getName() + "." + newline);
                }
            }
        });
    }


    public static void main(String[] args) {
        SettingsForm settingsForm = new SettingsForm();
    }


}
