package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10);
    Radio radioTwo = new Radio();

    @Test
    public void radioIsAtTheMaximumStationAndTheUserPressesTheNextButton() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void radioIsAtTheMinimumStationAndTheUserPressesTheNextButton() {
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void radioIsAtTheMinimumStationAndTheUserPressesThePreviousButton() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberIsOneAndTheUserPressesThePrevious() {
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void radioIsAtTheMaximumStationAndTheUserPressesThePreviousButton() {
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationGreaterThanTheMaximum() {
        radioTwo.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radioTwo.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationLessThanTheMinimum() {
        radioTwo.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radioTwo.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationEqualToTheMinimum() {
        radioTwo.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radioTwo.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationEqualToTheMaximum() {
        radioTwo.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radioTwo.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void soundIsAtItsMaximumValueAndTheUserPressesIncrease() {
        radio.setSoundVolume(100);
        radio.increaseSoundVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void soundIsAtItsMinimumValueAndTheUserPressesIncrease() {
        radio.setSoundVolume(0);
        radio.increaseSoundVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void soundLevelIsLessThanTheMaximumAndTheUserPressedIncreaseButton() {
        radio.setSoundVolume(99);
        radio.increaseSoundVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void SoundLevelIsAtTheMinimumValueAndTheUserPressesToDecrease() {
        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void SoundLevelGreaterThanTheMinimumAndTheUserPressedTheDecreaseButton() {
        radio.setSoundVolume(1);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void SoundLevelIsAtTheMaximumValueAndTheUserPressesToDecrease() {
        radio.setSoundVolume(100);
        radio.decreaseSoundVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void userSetsTheVolumeHigherThanTheMaximum() {
        radio.setSoundVolume(101);
        int expected = 100;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void userSetsTheVolumeToLessThanTheMinimum() {
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void userSetsTheVolumeToLessThanTheMaximum() {
        radio.setSoundVolume(99);
        int expected = 99;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }
}

