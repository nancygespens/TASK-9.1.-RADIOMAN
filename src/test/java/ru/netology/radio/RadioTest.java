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
        radio.setCurrentVolume(11);

        radio.maxVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(-1);

        radio.minVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }





    @Test
    public void ChanelPlusOne() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio(11);
        radio.setCurrentChanel(3);

        radio.next();

        int expected = 4;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ChanelMinusOne() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio(11);
        radio.setCurrentChanel(3);

        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ChanelOverMax() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio(11);
        radio.setCurrentChanel(10);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ChanelOverMin() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio(11);
        radio.setCurrentChanel(0);

        radio.prev();

        int expected = 10;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ChanelOverRangeMax() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio(11);
        radio.setCurrentChanel(12);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ChanelOverRangeMin() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio(11);
        radio.setCurrentChanel(-1);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void DefaultChanelStation() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentChanel(7);

        int expected = 7;
        int actual = radio.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
}

