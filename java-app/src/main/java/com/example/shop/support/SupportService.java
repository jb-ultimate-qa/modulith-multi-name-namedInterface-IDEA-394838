package com.example.shop.support;

import com.example.shop.stock.api.StockApi;
import com.example.shop.stock.events.StockChanged;
import com.example.shop.stock.internal.StockLedger;

public class SupportService {
  void foo() {
    new StockApi();
    new StockChanged();
    new StockLedger();
  }
}
