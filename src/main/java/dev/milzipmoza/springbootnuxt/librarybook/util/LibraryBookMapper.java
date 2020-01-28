package dev.milzipmoza.springbootnuxt.librarybook.util;

import dev.milzipmoza.springbootnuxt.librarybook.domain.LibraryBook;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookDto;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookResponseDto;

public class LibraryBookMapper {

    public static LibraryBook toEntity(final LibraryBookDto libraryBookDto) {
        return LibraryBook.builder()
                .image(libraryBookDto.getImage())
                .title(libraryBookDto.getTitle())
                .author(libraryBookDto.getAuthor())
                .publisher(libraryBookDto.getPublisher())
                .isbn(libraryBookDto.getIsbn())
                .isbn(libraryBookDto.getDescription())
                .build();
    }

    public static LibraryBookResponseDto toResponseDto(final LibraryBook libraryBook) {
        return LibraryBookResponseDto.builder()
                .id(libraryBook.getId())
                .image(libraryBook.getImage())
                .title(libraryBook.getTitle())
                .author(libraryBook.getAuthor())
                .publisher(libraryBook.getPublisher())
                .isbn(libraryBook.getIsbn())
                .description(libraryBook.getDescription())
                .build();
    }
}
