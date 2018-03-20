/**
 * Created by caecilieiversen on 01/02/2017.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

public class Model extends Observable implements Iterable<Address> {
    private List<Address> addresses = new ArrayList<>();

    public Model(String filename) throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader(new File(filename)))) {
            input.lines().forEach(line -> addresses.add(Address.parse(line)));
        }
    }
}
