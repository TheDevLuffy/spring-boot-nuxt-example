package dev.milzipmoza.springbootnuxt.librarybook.exception;

public class DuplicatedLibraryBookException extends RuntimeException {
    
    public DuplicatedLibraryBookException(final String title) {
        super(title + " register failed");
    }
}
