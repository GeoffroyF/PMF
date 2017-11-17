package controller;

import java.awt.*;
import view.UI;
import view.Wrapper;

public class Control {

    private UI view = new UI();

    public Control () {
        this.initUIButtonPanelListeners(this);
    }

    //  Initialises Button Listeners in child ui
    private void initUIButtonPanelListeners (Control c){
        c.view.getExitButton().addActionListener(e -> view.dispose());
        c.view.getHomeButton().addActionListener(e -> {
            CardLayout cl = (CardLayout)(view.getMainWrapper().getContentPanel().getLayout());
            cl.show(view.getMainWrapper().getContentPanel(), Wrapper.getHomepanel());
        });
        c.view.getStatsButton().addActionListener(e -> {
            CardLayout cl = (CardLayout)(view.getMainWrapper().getContentPanel().getLayout());
            cl.show(view.getMainWrapper().getContentPanel(), Wrapper.getStatspanel());
        });
        c.view.getSettingsButton().addActionListener(e -> {
            CardLayout cl = (CardLayout)(view.getMainWrapper().getContentPanel().getLayout());
            cl.show(view.getMainWrapper().getContentPanel(), Wrapper.getSettingspanel());
        });
    }

    //  Initialises content card 0 (Home) listeners in child ui
    private void initCard0Listeners (Control c){

    }

    //  Same for content card 1 (Stats)
    private void initCard1Listeners (Control c){

    }

    //  Same for content card 2 (Settings)
    private void initCard2Listeners (Control c){

    }
}
