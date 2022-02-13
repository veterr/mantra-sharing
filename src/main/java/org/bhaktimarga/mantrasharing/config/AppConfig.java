package org.bhaktimarga.mantrasharing.config;

import org.bhaktimarga.mantrasharing.botapi.MantraSharingTelegramBot;
import org.bhaktimarga.mantrasharing.botapi.TelegramFacade;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AppConfig {
    private MantraSharingBotConfig botConfig;

    public AppConfig(MantraSharingBotConfig rzdTelegramBotConfig) {
        this.botConfig = rzdTelegramBotConfig;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();

        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public MantraSharingTelegramBot mantraSharingTelegramBot(TelegramFacade telegramFacade) {

        MantraSharingTelegramBot telegramBot = new MantraSharingTelegramBot(telegramFacade);
        telegramBot.setBotUsername(botConfig.getUserName());
        telegramBot.setBotToken(botConfig.getBotToken());
        telegramBot.setBotPath(botConfig.getWebHookPath());

        return telegramBot;
    }
}
