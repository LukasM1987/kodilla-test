package com.kodilla.exception.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileReaderTestSuite {


    @Test
    void whenFileDosentExistsReadFileShouldThrowException()  {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "asbfsajhbf.txt";

        //When and Then
        Assertions.assertAll(
                () -> Assertions.assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> Assertions.assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> Assertions.assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}
