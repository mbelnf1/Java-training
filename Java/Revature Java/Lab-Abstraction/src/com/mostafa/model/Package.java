package com.mostafa.model;

public class Package {
    private Content content;
    private Color color;
    private Dimension dimension;

    //constructors

    //getters and setters
    . . .

    //override toString()
    @Override
    public Package assemblePackage() {
        Content content = generateContent();
        Color color = generateColor();
        Dimension dimension = generateDimension();

        return new Package(content, color, dimension);
    }
}