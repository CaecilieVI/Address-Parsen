import javax.swing.*;
import java.io.IOException;

/**
 * Created by caecilieiversen on 01/02/2017.
 */

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model;
            if (args.length > 0) {
                try {
                    model = new Model(args[0]);
                } catch {

                }
            } else {
                model = new Model();
            }
            View view = new View(model);
        });
    }
}
