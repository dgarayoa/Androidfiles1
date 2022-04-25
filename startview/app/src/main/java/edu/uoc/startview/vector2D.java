package edu.uoc.startview;
import android.graphics.Color;

public class vector2D {
        int posX;
        int posY;
        int ID;
        int color;
        vector2D(int posX, int posY, int ID, int color){
            this.posX = posX;
            this.posY = posY;
            this.ID = ID;
            this.color = color;
        }
        vector2D(){
            this.posX = 0;
            this.posY = 0;
        }
    }


