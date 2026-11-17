package com.example.shop.report;

import com.example.shop.pricing.rules.PriceRule;
import com.example.shop.stock.StockFacade;
import com.example.shop.stock.api.StockApi;
import com.example.shop.stock.events.StockChanged;
import com.example.shop.stock.spi.StockSpi;

public class ReportService {
  void foo() {
    new StockApi();
    new StockChanged();
    new StockSpi();
    new PriceRule();
    new StockFacade();
  }
}
