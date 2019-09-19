package com.dendickys.myunittestingexpert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.doubleThat;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {
    @Mock
    private MainPresenter presenter;
    private MainView view;

    @Before
    public void setUp() {
        view = mock(MainView.class);
        presenter = new MainPresenter(view);
    }

    @Test
    public void testVolumenWithIntegerInput() {
        double volume = presenter.volume(2, 8, 1);
        assertEquals(16, volume, 0.0001);
    }

    /*@Test
    public void volume() {
    }

    @Test
    public void calculatorVolume() {
    }*/
}