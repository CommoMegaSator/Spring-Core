package com.versatile.spring;

import com.versatile.spring.uchiha.Uchiha;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class UchihaUse {

    @Autowired
    @Qualifier("saske")
    Uchiha uchiha;

    public UchihaUse(Uchiha uchiha){
        this.uchiha = uchiha;
    }

    public void showSharingan(){
        System.out.println(this.uchiha.charingan());
    }
}
