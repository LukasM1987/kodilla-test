package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator decor) {
        System.out.println(decor.decorate(text));
    }
}
