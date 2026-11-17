package com.example.shop.web;

import com.example.shop.pricing.PriceList;
import com.example.shop.pricing.rules.PriceRule;
import com.example.shop.stock.StockFacade;
import com.example.shop.stock.api.StockApi;

public class PageService {
  void foo() {
    new StockFacade();
    new PriceList();
    new StockApi();
    new PriceRule();
  }
}
