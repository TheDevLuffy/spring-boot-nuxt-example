package dev.milzipmoza.springbootnuxt.librarybook.application;

import dev.milzipmoza.springbootnuxt.librarybook.domain.LibraryBook;
import dev.milzipmoza.springbootnuxt.librarybook.domain.LibraryBookRepository;
import dev.milzipmoza.springbootnuxt.librarybook.exception.DuplicatedLibraryBookException;
import dev.milzipmoza.springbootnuxt.librarybook.exception.NotFoundLibraryBookException;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookDto;
import dev.milzipmoza.springbootnuxt.librarybook.util.LibraryBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryBookService {

    private final LibraryBookRepository libraryBookRepository;

    @Autowired
    public LibraryBookService(final LibraryBookRepository libraryBookRepository) {
        this.libraryBookRepository = libraryBookRepository;
    }

    public LibraryBook save(final LibraryBookDto libraryBookDto) {
        checkExistLibraryBook(libraryBookDto);
        LibraryBook libraryBook = LibraryBookMapper.toEntity(libraryBookDto);
        return libraryBookRepository.save(libraryBook);
    }

    private void checkExistLibraryBook(final LibraryBookDto libraryBookDto) {
        if (libraryBookRepository.existsByIsbn(libraryBookDto.getIsbn())) {
            throw new DuplicatedLibraryBookException(libraryBookDto.getTitle());
        }
    }

    public Long count() {
        return libraryBookRepository.count();
    }

    public LibraryBook findById(final Long bookId) {
        return libraryBookRepository.findById(bookId)
                .orElseThrow(NotFoundLibraryBookException::new);
    }

    public List<LibraryBook> findAll(final int page, final int number) {
        return libraryBookRepository.findAll(PageRequest.of(page - 1, number))
                .stream()
                .collect(Collectors.toList());
    }

    public List<LibraryBook> findAllByTitleContaining(final String title, final int page, final int number) {
        Pageable pageable = PageRequest.of(page - 1, number);
        return libraryBookRepository.findAllByTitleContaining(title, pageable)
                .stream()
                .collect(Collectors.toList());
    }

    public boolean existsById(final long id) {
        return libraryBookRepository.existsById(id);
    }
}
