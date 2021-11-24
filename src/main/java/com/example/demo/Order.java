package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import org.springframework.cloud.gcp.data.spanner.core.mapping.*;

@Table(name="orders")
@Data
public class Order {
  @PrimaryKey
  @Column(name="order_id")
  private String id;

  private String description;

  @Column(name="creation_timestamp")
  private LocalDateTime timestamp;

  @Interleaved
  private List<OrderItem> items;
}