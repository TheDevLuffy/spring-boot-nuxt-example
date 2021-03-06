package dev.milzipmoza.springbootnuxt.librarybook.ui;

import dev.milzipmoza.springbootnuxt.librarybook.application.LibraryBookCRUDService;
import dev.milzipmoza.springbootnuxt.librarybook.ui.dto.LibraryBookRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin({"http://localhost:3000"})
public class LibraryBookApiController {

    private static final Logger log = LoggerFactory.getLogger(LibraryBookApiController.class);

    private final LibraryBookCRUDService libraryBookCRUDService;

    @Autowired
    public LibraryBookApiController(final LibraryBookCRUDService libraryBookCRUDService) {
        this.libraryBookCRUDService = libraryBookCRUDService;
    }

    // 도서 등록
    @PostMapping("/books")
    public ResponseEntity createLibraryBook(@RequestBody final LibraryBookRequestDto libraryBookRequestDto) {
        log.debug("library book dto : {}", libraryBookRequestDto);
        return ResponseEntity.ok(libraryBookCRUDService.save(libraryBookRequestDto));
    }

    // 전체 도서 수
    @GetMapping("/books/all")
    public ResponseEntity readLibraryBookTotalCount() {
        return ResponseEntity.ok(libraryBookCRUDService.count());
    }

    // 도서 상세 정보
    @GetMapping("/books/{id}")
    public ResponseEntity readLibraryBook(@PathVariable final Long id) {
        return ResponseEntity.ok(libraryBookCRUDService.findById(id));
    }

    // 도서 목록
    @GetMapping("/books")
    public ResponseEntity readLibraryBooks(@RequestParam final int page, @RequestParam final int number) {
        return ResponseEntity.ok(libraryBookCRUDService.findAll(page, number));
    }
}
