import java.util.ArrayList;

public class TrainDAO implements ITrainDAO {
    public ArrayList<Train> get() throws Error {
        return get(0);
    }

    public ArrayList<Train> get(int id) throws Error {
        ArrayList<Train> object = new ArrayList<Train>();
        object.add(new Train(id,120,"blue",4,90,"electrique"));

        return object;
    }

    public ArrayList<Train> post(Train train) throws Error {
        ArrayList<Train> object = new ArrayList<Train>();

        object.add(train);

        return object;
    }

    public ArrayList<Train> update(int id, Train train) throws Error {
        ArrayList<Train> object = new ArrayList<Train>();

        train.setId(id);
        object.add(train);

        return object;
    }

    public ArrayList<Train> delete(int trainId) throws Error {
        ArrayList<Train> object = new ArrayList<Train>();

        object.add(new Train(trainId,120,"blue",4,90,"electrique"));

        return object;
    }
}
