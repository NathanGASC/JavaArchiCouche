import java.util.ArrayList;

public interface ITrainDAO {
    public ArrayList<Train> get() throws Error;
    public ArrayList<Train> get(int id) throws Error;
    public ArrayList<Train> post(Train train) throws Error;
    public ArrayList<Train> update(int id, Train train) throws Error;
    public ArrayList<Train> delete(int trainId) throws Error;
}
