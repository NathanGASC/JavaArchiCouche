import com.fasterxml.jackson.core.JsonProcessingException;

public class App {
    static ITrainService trainService = new TrainService();

    public static void main(String[] args) {
        System.out.println("Every trains:");
        try {
            System.out.println(trainService.getTrains());
        } catch (Error | JsonProcessingException e) {
            System.out.println("An error occured during the trains fetching: " + e);
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------");

        System.out.println("Set the color of the train with id 4 at red:");
        try {
            System.out.println(trainService.paintTrain(4, "red"));
        } catch (Error | JsonProcessingException e) {
            System.out.println("An error occured during the train's color update: " + e);
        }

        System.out.println("--------------------------------------------------");

        System.out.println("Create a train which is too slow for ur service:");
        try {
            var train = new Train(0, 10f, "black", 3, 200, "lent");
            System.out.println(trainService.createTrain(train));
        } catch (Error | JsonProcessingException e) {
            System.out.println("An error occured during the train creation: " + e);
        }

        System.out.println("--------------------------------------------------");

        System.out.println("Create a fast train:");
        try {
            System.out.println(trainService.createTrain(new Train(0, 1000f, "blue", 3, 200, "sonic")));
        } catch (Error | JsonProcessingException e) {
            System.out.println("An error occured during the train creation: " + e);
        }
    }
}
