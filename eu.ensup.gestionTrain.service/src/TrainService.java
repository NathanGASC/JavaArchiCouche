import java.util.ArrayList;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrainService implements ITrainService{
    ITrainDAO trainDAO = new TrainDAO();

    public String getTrains() throws JsonProcessingException, Error{
        ObjectMapper objectMapper = new ObjectMapper();
        var trains = objectMapper.writeValueAsString(this.trainDAO.get());
        return trains;
    }

    public String paintTrain(int id, String color) throws JsonProcessingException, Error{
        var train = this.trainDAO.get(id).get(0);
        train.setCouleur(color);
        
        ObjectMapper objectMapper = new ObjectMapper();
        var trains = objectMapper.writeValueAsString(this.trainDAO.update(id, train));

        return trains;
    }

    public String createTrain(Train train) throws JsonProcessingException, Error{
        this.checkVitesse(train);

        ObjectMapper objectMapper = new ObjectMapper();
        var trains = objectMapper.writeValueAsString(this.trainDAO.post(train));
        return trains;
    }

    private void checkVitesse(Train train){
        if(train.getVitesseMax() < 100){
            throw new Error("Vitesse trop basse");
        }
    }
}
