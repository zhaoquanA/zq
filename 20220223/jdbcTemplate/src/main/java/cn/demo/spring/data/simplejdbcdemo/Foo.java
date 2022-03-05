package cn.demo.spring.data.simplejdbcdemo;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Foo {

    private Long id;
    private String bar;

}
