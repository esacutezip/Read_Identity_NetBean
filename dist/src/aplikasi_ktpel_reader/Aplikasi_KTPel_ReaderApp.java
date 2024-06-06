/*
 * Aplikasi_KTPel_ReaderApp.java
 */

package aplikasi_ktpel_reader;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Aplikasi_KTPel_ReaderApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new Aplikasi_KTPel_ReaderView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Aplikasi_KTPel_ReaderApp
     */
    public static Aplikasi_KTPel_ReaderApp getApplication() {
        return Application.getInstance(Aplikasi_KTPel_ReaderApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(Aplikasi_KTPel_ReaderApp.class, args);
    }
}
