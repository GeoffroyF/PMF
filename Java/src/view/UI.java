package view;

import javax.swing.*;
import java .awt.*;

public class UI extends JFrame {

    //  Fields
    //  Statics (background Color)
    private static final Color bgColor = Color.darkGray;

    //  Package-defined
    private Wrapper mainWrapper = new Wrapper();

    //  Inherited from Swing
    //  Buttons and spacer in button panel
    private JButton exitButton = new JButton("Exit");
    private JButton homeButton = new JButton("Home");
    private JButton statsButton = new JButton("Stats");
    private JButton settingsButton = new JButton("Settings");
    private JPanel buttonPanelSpacer = new JPanel();
    //  Members of content card 0 (Home)
    JButton tempIncButton = new JButton(">");
    JButton tempDecButton = new JButton("<");
    JLabel tempDisplay = new JLabel();


    //  Constructor
    public UI(){
        this.getAndSetDimension(this);
        this.initDefaults(this);
        this.initWrapperButtonPanel(this);
        this.initCards(this);

        //  set layout as content pane
        this.setContentPane(getMainWrapper());
        //  set visible
        this.setVisible(true);
    }

    //  Gets screen size and defines window size
    private void getAndSetDimension (UI u){
        Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
        scr.height = (4 * scr.height) / 5;
        scr.width = (4 * scr.width) / 5;
        u.setSize(scr);
    }

    //  Initialises default values
    private void initDefaults(UI u){
        u.setTitle("PMF");
        // u.setUndecorated(true);
        u.setLocationRelativeTo(null);
        u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //  Initialises button panel and children
    private void initWrapperButtonPanel (UI u){
        u.getMainWrapper().buttonPanel.add(u.getHomeButton());
        u.getMainWrapper().buttonPanel.add(u.getStatsButton());
        u.getMainWrapper().buttonPanel.add(u.getSettingsButton());
        u.getMainWrapper().buttonPanel.add(u.buttonPanelSpacer);
        u.getMainWrapper().buttonPanel.add(u.getExitButton());

        //  set color
        u.buttonPanelSpacer.setBackground(UI.bgColor);
    }

    private void initCards (UI u){
        u.getMainWrapper().contentCard0.setBackground(UI.bgColor);
        u.getMainWrapper().contentCard1.setBackground(UI.bgColor);
        u.getMainWrapper().contentCard2.setBackground(UI.bgColor);

        u.initHomeCard(u);
        u.initStatsCard(u);
        u.initSettingsCard(u);
    }

    private void initHomeCard (UI u){
        u.getMainWrapper().contentCard0.setLayout(new GridBagLayout());
    }

    private void initStatsCard (UI u){
        u.getMainWrapper().contentCard1.setLayout(new FlowLayout());
    }

    private void initSettingsCard (UI u){
        u.getMainWrapper().contentCard2.setLayout(new GridLayout());
    }

	public JButton getExitButton() {
		return exitButton;
	}

	public void setExitButton(JButton exitButton) {
		this.exitButton = exitButton;
	}

	public JButton getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(JButton homeButton) {
		this.homeButton = homeButton;
	}

	public Wrapper getMainWrapper() {
		return mainWrapper;
	}

	public void setMainWrapper(Wrapper mainWrapper) {
		this.mainWrapper = mainWrapper;
	}

	public JButton getStatsButton() {
		return statsButton;
	}

	public void setStatsButton(JButton statsButton) {
		this.statsButton = statsButton;
	}

	public JButton getSettingsButton() {
		return settingsButton;
	}

	public void setSettingsButton(JButton settingsButton) {
		this.settingsButton = settingsButton;
	}

}