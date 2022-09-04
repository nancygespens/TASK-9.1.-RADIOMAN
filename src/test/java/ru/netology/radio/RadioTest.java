package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {


    @Test
    public void shouldSetIncreaseVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(5);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetOverMaxVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(11);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetOverMinVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(-1);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldSetNextChanel() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentChanel(4);

        radio.next();

        int actual = radio.getCurrentChanel();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevChanel() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentChanel(4);

        radio.prev();

        int actual = radio.getCurrentChanel();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chanelOverMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chanelOverMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationOverRangeMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(11);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chanelOverRangeMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentChanel() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentChanel(7);

        radio.getCurrentChanel();

        int actual = radio.getCurrentChanel();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

}
