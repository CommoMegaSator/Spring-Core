package com.versatile.spring.uchiha;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Itachi implements Uchiha {
    @Override
    public String charingan() {
        return "MangeQ";
    }
}
