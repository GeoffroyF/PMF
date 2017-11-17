import javax.swing.*;
import java.awt.*;

class wrapper extends JPanel{

    final static String HOMEPANEL = "Home";
    final static String STATSPANEL = "Statistics";
    final static String SETTINGSPANEL = "Settings";

    JPanel buttonPanel = new JPanel();
    JPanel contentPanel = new JPanel();

    //  TODO : Fill content cards (in ui)
    JPanel contentCard0 = new JPanel();
    JPanel contentCard1 = new JPanel();
    JPanel contentCard2 = new JPanel();

    //  Constructor
    wrapper(){
        this.defineLayouts(this);
        this.initCardLayout(this);
        this.includeChildren(this);
    }

    //  Defines this and children's layout managers
    private void defineLayouts (wrapper w){
        w.setLayout(new BorderLayout());
        w.buttonPanel.setLayout(new GridLayout(0,1));
        w.contentPanel.setLayout(new CardLayout());
    }

    //  Initialises the contentPanel's CardLayout
    private void initCardLayout (wrapper w){
        w.contentPanel.add(w.contentCard0, wrapper.HOMEPANEL);
        w.contentPanel.add(w.contentCard1, wrapper.STATSPANEL);
        w.contentPanel.add(w.contentCard2, wrapper.SETTINGSPANEL);
    }

    //  Adds children to parent
    private void includeChildren (wrapper w){
        w.add(w.buttonPanel, BorderLayout.WEST);
        w.add(w.contentPanel);
    }
}
