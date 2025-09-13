package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int ballX = 400;
    int xSpeed = 800;
    int ballY = 300;
    int ySpeed = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(255,255,256);
    	ellipse(ballX, ballY, 30, 30); 
    	fill(20, 20, 256); 
    	stroke(30, 256, 30); 
    	ballX += xSpeed;
    	if(ballX > width || ballX < 0){
    	    xSpeed = -xSpeed;
    	}
    	ballY += ySpeed;
    	if(ballY > height || ballY < 0){
    	    ySpeed = -ySpeed;
    	}
    	
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}