package com.example.demo;

import org.springframework.cloud.gcp.data.spanner.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface OrderRepository extends SpannerRepository<Order, String> {
}