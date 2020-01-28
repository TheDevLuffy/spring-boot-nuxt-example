package dev.milzipmoza.springbootnuxt.librarybook.application;

import dev.milzipmoza.springbootnuxt.librarybook.domain.LibraryBook;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookCreateResponseDto;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookDto;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookResponseDto;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookTotalCountResponseDto;
import dev.milzipmoza.springbootnuxt.librarybook.util.LibraryBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryBookCRUDService {

    private LibraryBookService libraryBookService;

    @Autowired
    public LibraryBookCRUDService(final LibraryBookService libraryBookService) {
        this.libraryBookService = libraryBookService;
    }

    public LibraryBookCreateResponseDto save(final LibraryBookDto libraryBookDto) {
        LibraryBook savedLibraryBook = libraryBookService.save(libraryBookDto);
        return new LibraryBookCreateResponseDto(savedLibraryBook.getId(), savedLibraryBook.getTitle() + " register succeed");
    }

    public LibraryBookTotalCountResponseDto count() {
        return new LibraryBookTotalCountResponseDto(libraryBookService.count());
    }

    public LibraryBookResponseDto findById(final Long id) {
        return LibraryBookMapper.toResponseDto(libraryBookService.findById(id));
    }

    public List<LibraryBookResponseDto> findAll(final int page, final int number) {
        return libraryBookService.findAll(page, number)
                .stream()
                .map(LibraryBookMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    public List<LibraryBookResponseDto> findAllByTitleContaining(final String title, final int page, final int number) {
        return libraryBookService.findAllByTitleContaining(title, page, number)
                .stream()
                .map(LibraryBookMapper::toResponseDto)
                .collect(Collectors.toList());
    }
}
