package com.example.shop.order;

import org.springframework.stereotype.Service;

@Service
public class OrderNotifier {

  public String text(String sku) {
    return "Order of " + sku;
  }
}
