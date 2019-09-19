package com.dendickys.myunittestingexpert;

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public double volume (double length, double width, double height) {
        return length * width * height;
    }

    public void calculatorVolume (double length, double width, double height) {
        double volume = volume(length, width, height);
        MainModel model = new MainModel(volume);
        view.showVolume(model);
    }
}
