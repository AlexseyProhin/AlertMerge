package letscode.github;

import java.awt.*;

public class Gui {

    private final TrayIcon trayIcon;

    public Gui() {
        try {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit()
                    .createImage(getClass().getResource("/logo.png"));
            trayIcon = new TrayIcon(image, "GitHub helper");
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip("Github helper");

            tray.add(trayIcon);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
    public void showNotification(String title, String text) {
        trayIcon.displayMessage(title, text, TrayIcon.MessageType.INFO);

    }
}
