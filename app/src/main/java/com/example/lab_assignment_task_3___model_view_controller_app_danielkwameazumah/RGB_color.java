package com.example.lab_assignment_task_3___model_view_controller_app_danielkwameazumah;

public class RGB_color {
    private int redcolor;
    private int greencolor;
    private int bluecolor;

    public RGB_color(int red, int green, int blue){
        setredcolor(red);
        setgreencolor(green);
        setbluecolor(blue);

    }
    public void setredcolor(int redvalue){
        if (redvalue < 0){
            redcolor = 0;
        }
        else if (redvalue > 255) {
            redcolor = 255;
        }
        else{
            redcolor = redvalue;
        }
    }

    public int getRedcolor(){
        return redcolor;
    }

    public void setgreencolor(int greenvalue){
        if (greenvalue < 0){
            greencolor = 0;
        }
        else if (greenvalue > 255) {
            greencolor = 255;
        }
        else{
            greencolor = greenvalue;
        }
    }

    public int getGreencolor(){
        return greencolor;
    }

    public void setbluecolor(int bluevalue){
        if (bluevalue < 0){
            bluecolor = 0;
        }
        else if (bluevalue > 255) {
            bluecolor = 255;
        }
        else{
            bluecolor = bluevalue;
        }
    }

    public int getBluecolor(){
        return bluecolor;
    }
}
