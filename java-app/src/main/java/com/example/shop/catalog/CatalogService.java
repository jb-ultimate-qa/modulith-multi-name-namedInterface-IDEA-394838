package com.example.shop.catalog;

import com.example.shop.stock.api.StockApi;
import com.example.shop.stock.events.StockChanged;
import com.example.shop.stock.spi.StockSpi;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

  void foo() {
    new StockSpi();
    new StockApi();
    new StockChanged();
  }
}
