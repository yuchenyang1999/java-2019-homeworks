package com.swt.model.controlled;

import com.swt.model.advance.Calabash;
import com.swt.model.basic.Color;
import com.swt.model.basic.Rank;
import javafx.scene.image.Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalabashTeam {
    private List<Calabash> calabashes;

    public CalabashTeam() throws IOException {
        this.calabashes = new ArrayList<>();
        for(int i = 0; i < 7; ++i){
            FileInputStream fis = new FileInputStream(new File("SRCFile/" + (i + 1) + ".jpg"));
            Image image = new Image(fis);
            Calabash calabash = new Calabash(Color.values()[i], Rank.values()[i], image);
            calabashes.add(calabash);
            fis.close();
        }
    }

//    public void drawCalabashTeam(GraphicsContext graphicsContext){
////        //清除原先的点
////        for(Point point: NMap.occupiedList){
////            NMap.NMap[point.getPx()][point.getPy()] = 0;
////        }
////        NMap.occupiedList.clear();
//        for(Calabash calabash: calabashes){
//            calabash.draw(graphicsContext);
//        }
//    }

    public List<Calabash> getCalabashes(){
        return calabashes;
    }

}
