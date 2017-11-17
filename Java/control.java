import java.awt.*;

class control {

    private ui view = new ui();

    control () {
        this.initUIButtonPanelListeners(this);
    }

    //  Initialises Button Listeners in child ui
    private void initUIButtonPanelListeners (control c){
        c.view.exitButton.addActionListener(e -> view.dispose());
        c.view.homeButton.addActionListener(e -> {
            CardLayout cl = (CardLayout)(view.mainWrapper.contentPanel.getLayout());
            cl.show(view.mainWrapper.contentPanel, wrapper.HOMEPANEL);
        });
        c.view.statsButton.addActionListener(e -> {
            CardLayout cl = (CardLayout)(view.mainWrapper.contentPanel.getLayout());
            cl.show(view.mainWrapper.contentPanel, wrapper.STATSPANEL);
        });
        c.view.settingsButton.addActionListener(e -> {
            CardLayout cl = (CardLayout)(view.mainWrapper.contentPanel.getLayout());
            cl.show(view.mainWrapper.contentPanel, wrapper.SETTINGSPANEL);
        });
    }

    //  Initialises content card 0 (Home) listeners in child ui
    private void initCard0Listeners (control c){

    }

    //  Same for content card 1 (Stats)
    private void initCard1Listeners (control c){

    }

    //  Same for content card 2 (Settings)
    private void initCard2Listeners (control c){

    }
}
