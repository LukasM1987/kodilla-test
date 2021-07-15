package com.kodilla.stream;

import com.kodilla.stream.beautifier.Beautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("lekjgslke", Beautifier::textUperCase);
        poemBeautifier.beautify("dsgfadga", Beautifier::abcTextAbc);
        poemBeautifier.beautify("SDFSAFSAFAF", Beautifier::textToLowerCase);
        poemBeautifier.beautify(" asdfa ", Beautifier::trimText);
        poemBeautifier.beautify("abc abc cba cba", Beautifier::replaceChar);
        poemBeautifier.beautify("abcdefghijklmnopr", Beautifier::waveText);
        poemBeautifier.beautify("abcd", Beautifier::reverseText);
    }
}
