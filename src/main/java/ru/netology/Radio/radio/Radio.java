package ru.netology.Radio.radio;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int numberRadioStation;
    private int totalNumberStation;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(){
        this.totalNumberStation = 10;
    }

    public Radio (int totalNumberStation) {
        this.totalNumberStation = totalNumberStation;
    }


    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setMaxNumberRadioStation() {
        numberRadioStation = 9;
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
