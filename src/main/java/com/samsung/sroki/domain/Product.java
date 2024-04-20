package com.samsung.sroki.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private int freshnessId;
    private String data;
}
