import java.util.ArrayList;

public class HomeWork {
    public ArrayList<Integer> extract(ArrayList<Integer> mass) {
        final Integer EXTRACTION_POINT = 4;
        if(!mass.contains(EXTRACTION_POINT)) {
            throw new RuntimeException();
        }

        return new ArrayList<>(mass.subList(mass.indexOf(EXTRACTION_POINT) + 1, mass.size()));
    }

    public boolean isContains(ArrayList<Integer> mass) {
        return mass.contains(1) || mass.contains(4);
    }
}