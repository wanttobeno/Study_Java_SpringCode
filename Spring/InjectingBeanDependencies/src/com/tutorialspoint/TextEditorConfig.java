package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 加了这些关键字，就可以省略xml中的配置
@Configuration
public class TextEditorConfig  {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
