package letscode.github;

import java.awt.*;

public class Gui {
    public Gui() {
        try {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit()
                    .createImage(getClass().getResource("/logo.png"));
            TrayIcon trayIcon = new TrayIcon(image, "GitHub helper");
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip("Github helper");

            tray.add(trayIcon);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
