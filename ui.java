import javax.swing.*;
import java .awt.*;

class ui extends JFrame {

    //  Fields
    //  Statics (background Color)
    private static final Color bgColor = Color.darkGray;

    //  Package-defined
    wrapper mainWrapper = new wrapper();

    //  Inherited from Swing
    //  Buttons and spacer in button panel
    JButton exitButton = new JButton("Exit");
    JButton homeButton = new JButton("Home");
    JButton statsButton = new JButton("Stats");
    JButton settingsButton = new JButton("Settings");
    private JPanel buttonPanelSpacer = new JPanel();
    //  Members of content card 0 (Home)
    JButton tempIncButton = new JButton(">");
    JButton tempDecButton = new JButton("<");
    JLabel tempDisplay = new JLabel();


    //  Constructor
    ui(){
        this.getAndSetDimension(this);
        this.initDefaults(this);
        this.initWrapperButtonPanel(this);
        this.initCards(this);

        //  set layout as content pane
        this.setContentPane(mainWrapper);
        //  set visible
        this.setVisible(true);
    }

    //  Gets screen size and defines window size
    private void getAndSetDimension (ui u){
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        scr.height = (4 * scr.height) / 5;
        scr.width = (4 * scr.width) / 5;
        u.setSize(scr);
    }

    //  Initialises default values
    private void initDefaults(ui u){
        u.setTitle("PMF");
        u.setUndecorated(true);
        u.setLocationRelativeTo(null);
        u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //  Initialises button panel and children
    private void initWrapperButtonPanel (ui u){
        u.mainWrapper.buttonPanel.add(u.homeButton);
        u.mainWrapper.buttonPanel.add(u.statsButton);
        u.mainWrapper.buttonPanel.add(u.settingsButton);
        u.mainWrapper.buttonPanel.add(u.buttonPanelSpacer);
        u.mainWrapper.buttonPanel.add(u.exitButton);

        //  set color
        u.buttonPanelSpacer.setBackground(ui.bgColor);
    }

    private void initCards (ui u){
        u.mainWrapper.contentCard0.setBackground(ui.bgColor);
        u.mainWrapper.contentCard1.setBackground(ui.bgColor);
        u.mainWrapper.contentCard2.setBackground(ui.bgColor);

        u.initHomeCard(u);
        u.initStatsCard(u);
        u.initSettingsCard(u);
    }

    private void initHomeCard (ui u){
        u.mainWrapper.contentCard0.setLayout(new GridBagLayout());
    }

    private void initStatsCard (ui u){
        u.mainWrapper.contentCard1.setLayout(new FlowLayout());
    }

    private void initSettingsCard (ui u){
        u.mainWrapper.contentCard2.setLayout(new GridLayout());
    }

}
