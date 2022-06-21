import java.util.ArrayList;

public class TrainDAO {
    static public ArrayList<Train> get() {
        return get(0);
    }

    static public ArrayList<Train> get(int id) {
        ArrayList<Train> object = new ArrayList<Train>();
        object.add(new Train(id,120,"blue",4,90,"electrique"));

        return object;
    }

    static public ArrayList<Train> post(Train train) {
        ArrayList<Train> object = new ArrayList<Train>();

        object.add(train);

        return object;
    }

    static public ArrayList<Train> update(int id, Train train) {
        ArrayList<Train> object = new ArrayList<Train>();

        train.setId(id);
        object.add(train);

        return object;
    }

    static public ArrayList<Train> delete(int trainId) {
        ArrayList<Train> object = new ArrayList<Train>();

        object.add(new Train(trainId,120,"blue",4,90,"electrique"));

        return object;
    }
}
