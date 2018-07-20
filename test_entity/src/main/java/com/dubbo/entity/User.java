package com.dubbo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Create by admin on 2018/7/19
 */
@Data
public class User implements Serializable {

   private long id;
   private String name;
   private int age;
}
