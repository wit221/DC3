package com.example.dc3;

import processing.core.PApplet;
import processing.core.PConstants;

public class Sketch extends PApplet {
    @Override
    public void settings() {
        //Call size/fullscreen from here
        fullScreen(PConstants.P3D);
    }

    @Override
    public void setup() {
        background(0,0,0);
        strokeWeight(displayWidth/15);
    }

    @Override
    public void draw() {
        //Finally draw from here
    }
    
    public void mouseDragged(){
    	stroke(MainActivity.randInt(0, 255),MainActivity.randInt(0, 255),MainActivity.randInt(0, 255));
    	line(mouseX, mouseY, pmouseX,pmouseY);
    }
    public void mousePressed(){
    }
}

