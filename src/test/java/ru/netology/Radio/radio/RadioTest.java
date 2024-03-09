package ru.netology.Radio.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStation() {
        Radio rad = new Radio(20);
        rad.setNumberRadioStation(15);
        int expected = 15;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldSetNumberStation() {
        Radio rad = new Radio(10);
        rad.setNumberRadioStation(10);
        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeNumberStation() {
        Radio rad = new Radio(10);
        rad.setNumberRadioStation(-1);
        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void pressNextMaxStation() {
        Radio rad = new Radio(10);
        rad.setNumberRadioStation(9);
        rad.pressNextStation();
        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressPrevMinStation() {
        Radio rad = new Radio(10);
        rad.setNumberRadioStation(0);
        rad.pressPrevStation();
        int expected = 9;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressNextStation() {
        Radio rad = new Radio(10);
        rad.setNumberRadioStation(4);
        rad.pressNextStation();
        int expected = 5;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressPrevStation() {
        Radio rad = new Radio(10);
        rad.setNumberRadioStation(6);
        rad.pressPrevStation();
        int expected = 5;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setVolume(77);
        int expected = 77;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressIncreaseMaxVolume() {
        Radio rad = new Radio();
        rad.setVolume(100);
        rad.pressIncreaseVolume();
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressMaxVolume() {
        Radio rad = new Radio();
        rad.setVolume(99);
        rad.pressIncreaseVolume();
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressIncreaseVolume() {
        Radio rad = new Radio();
        rad.setVolume(77);
        rad.pressIncreaseVolume();
        int expected = 78;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressDecreaseMinVolume() {
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.pressDecreaseVolume();
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressDecreaseVolume() {
        Radio rad = new Radio();
        rad.setVolume(44);
        rad.pressDecreaseVolume();
        int expected = 43;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}