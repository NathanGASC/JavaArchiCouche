import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface ITrainService {
    ITrainDAO trainDAO = new TrainDAO();
    public String getTrains() throws JsonProcessingException, Error;
    public String paintTrain(int id, String color) throws JsonProcessingException, Error;
    public String createTrain(Train train) throws JsonProcessingException, Error;
}
