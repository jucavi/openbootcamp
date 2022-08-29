package Solucion4.base;

import Solucion4.clases.SmartPhone;
import Solucion4.clases.SmartWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DigitalCamera   iphoneCamera = new DigitalCamera(12,6, true);
        SmartPhone iphone = new SmartPhone("apple", "iphone 13", "black", 13, iphoneCamera, 128);

        String[] features = {"ECG app", "Emergency SOS", "Blood oxygen app"};
        List<String> iwatchFeatures = new ArrayList<>(Arrays.asList(features));
        SmartDevice iwatch = new SmartWatch("apple","apple watch series 7", "blue", 2,  iwatchFeatures, "iOS");


        System.out.println(iphone);
        System.out.println(iwatch);

        iphone.camera.incrementZoomLevel();
        iphone.camera.incrementZoomLevel();
        iphone.camera.decrementZoomLevel();

        System.out.println(iphone);

    }
}
