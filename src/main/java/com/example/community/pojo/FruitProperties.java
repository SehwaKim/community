package com.example.community.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("fruit")
public class FruitProperties {
    // 유연한 바인딩 확인을 위한 예제 코드
    private String colorName;
}
