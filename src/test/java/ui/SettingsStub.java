package ui;

import settings.Settings;

class SettingsStub extends Settings {
    private boolean isDisplayingHelpMessages = true;

    public SettingsStub () {
    }

    public boolean getDisplayingHelpMessages() {
        return isDisplayingHelpMessages;
    }

    public void setDisplayingHelpMessages(boolean isDisplayingHelpMessages, boolean isInit) {
        this.isDisplayingHelpMessages = isDisplayingHelpMessages;
    }
}
