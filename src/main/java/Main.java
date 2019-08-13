import com.mainconfig.MainConfig;
import com.dao.Nrepository;
import com.models.Task;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent fxml = FXMLLoader.load(getClass().getResource("main.fxml"));

        Scene scene = new Scene(fxml);

/*        scene.setFill(Color.TRANSPARENT);*/

        primaryStage.setScene(scene);

        primaryStage.setTitle("sssss");

/*        primaryStage.initStyle(StageStyle.TRANSPARENT);*/

        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);

      /*  Task task1 = new Task();
        task1.setName("Shopping");
        task1.setDescription("Buy: water, cheese, bread");
        task1.setPriority("Normal");
        task1.setStatus("Resolved");
        task1.setDate(new Date());

        Task task2 = new Task();
        task2.setName("Meeting");
        task2.setDescription("Project meeting");
        task2.setPriority("High");
        task2.setStatus("Open");
        task2.setDate(new Date());

        Task task3 = new Task();
        task3.setName("Lunch");
        task3.setDescription("Pisku drochit");
        task3.setPriority("Normal");
        task3.setStatus("Open");
        task3.setDate(new Date());

        //save com.models.Task data in task_manager database
        nrepository.save(task1);
        nrepository.save(task2);
        nrepository.save(task3);

        //find data in task_manager database using JPA
*//*        List<com.models.Task> esheTasks = nrepository.findByName("Meeting");*//*
        List<Task> allTasks = (List<Task>)nrepository.findAll();
        List<Task> tasksByStatus = nrepository.findByStatus("Open");
        List<Task> tasksByPriority = nrepository.findByPriority("High");


       System.out.println("-----------------------------------------------------------------------------------------");
        for (Task t : allTasks) {
            System.out.println(t);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        for (Task t : tasksByStatus) {
            System.out.println(t);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        for (Task t : tasksByPriority) {
            System.out.println(t);
        }

*/
    }


}
