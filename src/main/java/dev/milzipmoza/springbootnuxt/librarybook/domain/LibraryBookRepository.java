package dev.milzipmoza.springbootnuxt.librarybook.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryBookRepository extends JpaRepository<LibraryBook, Long> {

    boolean existsByIsbn(String isbn);

    Page<LibraryBook> findAllByTitleContaining(String title, Pageable pageable);
}
