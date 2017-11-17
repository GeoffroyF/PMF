package view;

import javax.swing.*;
import java.awt.*;

public class Wrapper extends JPanel{

    private final static String HOMEPANEL = "Home";
    private final static String STATSPANEL = "Statistics";
    private final static String SETTINGSPANEL = "Settings";

    JPanel buttonPanel = new JPanel();
    private JPanel contentPanel = new JPanel();

    //  TODO : Fill content cards (in ui)
    JPanel contentCard0 = new JPanel();
    JPanel contentCard1 = new JPanel();
    JPanel contentCard2 = new JPanel();

    //  Constructor
    Wrapper(){
        this.defineLayouts(this);
        this.initCardLayout(this);
        this.includeChildren(this);
    }

    //  Defines this and children's layout managers
    private void defineLayouts (Wrapper w){
        w.setLayout(new BorderLayout());
        w.buttonPanel.setLayout(new GridLayout(0,1));
        w.getContentPanel().setLayout(new CardLayout());
    }

    //  Initialises the contentPanel's CardLayout
    private void initCardLayout (Wrapper w){
        w.getContentPanel().add(w.contentCard0, Wrapper.getHomepanel());
        w.getContentPanel().add(w.contentCard1, Wrapper.getStatspanel());
        w.getContentPanel().add(w.contentCard2, Wrapper.getSettingspanel());
    }

    //  Adds children to parent
    private void includeChildren (Wrapper w){
        w.add(w.buttonPanel, BorderLayout.WEST);
        w.add(w.getContentPanel());
    }

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public void setContentPanel(JPanel contentPanel) {
		this.contentPanel = contentPanel;
	}

	public static String getHomepanel() {
		return HOMEPANEL;
	}

	public static String getStatspanel() {
		return STATSPANEL;
	}

	public static String getSettingspanel() {
		return SETTINGSPANEL;
	}
}