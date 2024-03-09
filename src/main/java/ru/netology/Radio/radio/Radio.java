package ru.netology.Radio.radio;


public class Radio {
    private int maxRadioStation;
    private int minRadioStation = 0;
    private int numberRadioStation = minRadioStation;
    private int totalNumberStation;
    private int volume;


    public Radio() {
        this.totalNumberStation = 10;
    }

    public Radio(int newTotalNumberStation) {
        this.totalNumberStation = newTotalNumberStation;
        this.maxRadioStation = newTotalNumberStation -1;
    }



    public int getNumberRadioStation() {
        return numberRadioStation;
    }


    public int getVolume() {
        return volume;
    }


    public void setNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < minRadioStation) {
            return;
        }
        if (newNumberRadioStation > totalNumberStation - 1) {
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
        if (numberRadioStation == 0) {
            numberRadioStation = totalNumberStation - 1;
        } else {
            numberRadioStation = numberRadioStation - 1;
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


