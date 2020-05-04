package com.vuespring.springboottest.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.DecimalFormat;
@Entity
@Data
public class Book {
    @Id
    private Integer id;

    private String title;
    private String detail;

}
