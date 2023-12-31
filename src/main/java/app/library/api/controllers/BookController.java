package app.library.api.controllers;

import app.library.business.abstracts.BookService;
import app.library.business.response.BookResponse;
import app.library.entities.concretes.Book;
import app.library.utilities.results.DataResult;
import app.library.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@CrossOrigin(origins = "*")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public DataResult<List<BookResponse>> getAllBooks(){
        return this.bookService.findAllBooks();
    }
    @PostMapping("/add")
    public Result addBook(@RequestBody Book book){
        return this.bookService.add(book);
    }
    @GetMapping("/{id}")
    public DataResult<BookResponse> getBookById(@PathVariable("id") Long id){
        return this.bookService.findBookById(id);
    }
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable("id") Long id){
        return this.bookService.delete(id);
    }
    @PutMapping("/update")
    public Result updateBook(@RequestBody Book book){
        return this.bookService.update(book);
    }
    @GetMapping("/user/{id}")
    public DataResult<List<Book>> getBooksByUserId(@PathVariable("id") Long id){
        return this.bookService.findBooksByUserId(id);
    }
}
