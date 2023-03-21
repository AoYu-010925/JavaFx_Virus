package com.aoyu;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class test extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {


        Media JNTMAudio1 = new Media("https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/%E5%98%BF%E5%98%BF%E5%98%BF%20-%20%E9%B8%A1%E4%BD%A0%E5%A4%AA%E7%BE%8E%20%28DJ%E7%89%88%29.mp3");

        MediaPlayer AudioPlay = new MediaPlayer(JNTMAudio1);

        AudioPlay.play();
    }
}
