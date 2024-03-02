package ru.netology.Radio.radio;
public class Radio {
    public int numberRadioStation;
    int maxRadioStation = 9;
    int minRadioStation = 0;
    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void setNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < 0) {
            return;
        }
        if (newNumberRadioStation > 9) {
            return;
        }

        numberRadioStation = newNumberRadioStation;
    }

    public void pressNextStation() {
        if (numberRadioStation >= maxRadioStation) {
            setNumberRadioStation(minRadioStation);
        } else {
            setNumberRadioStation(numberRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (numberRadioStation <= minRadioStation) {
            setNumberRadioStation(maxRadioStation);
        } else {
            setNumberRadioStation(numberRadioStation - 1);
        }
    }


    public void setMaxNumberRadioStation() {
        numberRadioStation = 9;
    }

    public int volume;
    int maxVolume = 100;
    int minVolume = 0;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void pressIncreaseVolume() {
        setVolume(volume + 1);
    }

    public void pressDecreaseVolume() {
        setVolume(volume - 1);
    }

}
