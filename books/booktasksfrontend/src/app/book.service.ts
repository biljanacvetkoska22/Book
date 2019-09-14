import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {


  constructor(private http: HttpClient) { }

  getBookDetail(id: number): Observable<Object> {
    return this.http.get(`http://localhost:8080/books/${id}`);
  }

  createBook(book: Object): Observable<Object> {
    return this.http.post(`http://localhost:8080/books`, book);
  }

  getBookList(): Observable<any> {
    return this.http.get(`http://localhost:8080/books`);
  }
}
