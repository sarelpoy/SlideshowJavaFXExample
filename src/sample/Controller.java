package sample;


import javafx.animation.KeyValue;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class Controller {

    public ImageView image;

    int counter =0;
    public void initialize(){
        Image image1=new Image("https://www.w3schools.com/howto/img_nature_wide.jpg");
        Image image2=new Image("https://www.w3schools.com/howto/img_snow_wide.jpg");
        Image image3=new Image("https://www.w3schools.com/howto/img_mountains_wide.jpg");

        image.setImage(image1);
        image.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                counter++;
                if(counter%3==0){
                    image.setImage(image1);
                }else  if(counter%3==1){
                    image.setImage(image2);
                }else  if(counter%3==2){
                    image.setImage(image3);
                }
            }
        });
        //use for auto replace
        PauseTransition wait = new PauseTransition(Duration.seconds(3));
        wait.setOnFinished((e) -> {
            counter++;
            if(counter%3==0){
                image.setImage(image1);
            }else  if(counter%3==1){
                image.setImage(image2);
            }else  if(counter%3==2){
                image.setImage(image3);
            }
            wait.playFromStart();
        });
        wait.play();


    }
}
