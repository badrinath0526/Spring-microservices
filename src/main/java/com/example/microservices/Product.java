package com.example.microservices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private Double cost;

  @Override
    public String toString(){
      return "Product{" +
              "id="+id+
              ",name='"+name+'\''+
              ",cost='"+cost+
              '}';
  }

}
