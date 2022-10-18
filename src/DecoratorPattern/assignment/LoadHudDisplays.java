package DecoratorPattern.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {
    private final String fileName;

    public LoadHudDisplays(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ArrayList<String> load() {
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
