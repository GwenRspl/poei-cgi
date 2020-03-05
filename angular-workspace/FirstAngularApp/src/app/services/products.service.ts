import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  private _productsUrl = './../../assets/api/products/products.json';

  constructor(private _http: HttpClient) { }

  getProducts() {
    return this._http.get(this._productsUrl);
  }
}
