import java.util.ArrayList;
import java.util.List;

public abstract class VacationPackage {
    protected List<Activites> activities = new ArrayList<>();

    public VacationPackage(){
        createPackage();
    }
    protected abstract void createPackage();

    @Override
    public String toString() {
        return "VacationPackage{" +
                "activities=" + activities +
                '}';
    }
}
