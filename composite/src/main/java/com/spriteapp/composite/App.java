package com.spriteapp.composite;

/**
 * 组合模式
 * Created by kuangxiaoguo on 2018/3/8.
 */

public class App {

    public static void test() {

        AbstractFile imageFolder = new Folder("图像文件夹");
        AbstractFile textFolder = new Folder("文本文件夹");
        AbstractFile videoFolder = new Folder("视频文件夹");

        AbstractFile imageFile = new ImageFile("小龙女.jpg");
        AbstractFile imageFile2 = new ImageFile("张无忌.png");
        AbstractFile textFile = new TextFile("九阴真经.txt");
        AbstractFile textFile2 = new TextFile("葵花宝典.doc");
        AbstractFile videoFile = new VideoFile("笑傲江湖.mp4");

        imageFolder.add(imageFile);
        imageFolder.add(imageFile2);
        textFolder.add(textFile);
        textFolder.add(textFile2);
        videoFolder.add(videoFile);

        imageFolder.killVirus();
        textFolder.killVirus();
        videoFolder.killVirus();
    }
}
