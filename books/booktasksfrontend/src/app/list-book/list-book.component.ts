import { Observable } from "rxjs";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';
import {Book} from "../book";
import {BookService} from "../book.service";

@Component({
  selector: 'app-list-book',
  templateUrl: './list-book.component.html',
  styleUrls: ['./list-book.component.css']
})
export class ListBookComponent implements OnInit {

  books: Observable<Book[]>;
  book: Book = new Book();
  submitted = false;

  constructor(private bookService: BookService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  newBook(): void {
    this.submitted = false;
    this.book = new Book();
  }

  save() {
    this.bookService.createBook(this.book)
        .subscribe(data => {
          console.log(data);
          this.reloadData();
        }, error => console.log(error));
    this.book = new Book();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  reloadData() {
    this.books = this.bookService.getBookList()
  }

}
