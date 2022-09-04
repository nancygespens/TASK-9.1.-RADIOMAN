package ru.netology.radio;

public class Radio {


    private int currentVolume;
    private int currentChanel;


    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public int getCurrentChanel() {
        return currentChanel;
    }
    public void setCurrentChanel(int currentChanel) {
        if (currentChanel > 9) {
            return;
        }
        if (currentChanel < 0) {
            return;
        }
        this.currentChanel = currentChanel;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }


    public void next() {
        if (currentChanel < 9) {
            currentChanel++;
        } else {
            currentChanel = 0;
        }
    }
    public void prev() {
        if (currentChanel > 0) {
            currentChanel--;
        } else {
            currentChanel = 9;
        }
    }
}