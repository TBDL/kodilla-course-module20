package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("apples", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("apples", text -> toUpperCase(text));
        poemBeautifier.beautify("apples", text -> new StringBuilder(text).reverse().toString());
        poemBeautifier.beautify("apples", text -> "\u001B[31m" + text);

    }
}