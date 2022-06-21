import java.util.ArrayList;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrainService {
    static public String getTrains() throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        var trains = objectMapper.writeValueAsString(TrainDAO.get());
        return trains;
    }

    static public String paintTrain(int id, String color) throws JsonProcessingException{
        var train = TrainDAO.get(id).get(0);
        train.setCouleur(color);
        
        ObjectMapper objectMapper = new ObjectMapper();
        var trains = objectMapper.writeValueAsString(TrainDAO.update(id, train));

        return trains;
    }

    static public String createTrain(Train train) throws JsonProcessingException, Error{
        TrainService.checkVitesse(train);

        ObjectMapper objectMapper = new ObjectMapper();
        var trains = objectMapper.writeValueAsString(TrainDAO.post(train));
        return trains;
    }

    static private void checkVitesse(Train train){
        if(train.getVitesseMax() < 100){
            throw new Error("Vitesse trop basse");
        }
    }
}
