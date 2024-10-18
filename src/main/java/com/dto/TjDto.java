package com.dto;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;
import java.util.Map;

@Data
public class TjDto {
    private String name;
    private String amount;
    private List<Object> list;
    private List<Object> dlist;
}
