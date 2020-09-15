package stub;

import java.util.ArrayList;
import java.util.List;

public class GradeSystemStub extends GradeSystem{
    @Override
    public List<Double> gradesFor(long studentId) {
        ArrayList<Double> result = new ArrayList<>();
        result.add(90.0);
        result.add(90.0);
        result.add(90.0);
        return result;
    }
}
