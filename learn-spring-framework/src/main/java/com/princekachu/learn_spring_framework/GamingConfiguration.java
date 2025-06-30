package com.princekachu.learn_spring_framework;

import com.princekachu.learn_spring_framework.game.GameRunner;
import com.princekachu.learn_spring_framework.game.GamingConsole;
import com.princekachu.learn_spring_framework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {

        return new PacMan();
    }
}
