package org.bhaktimarga.mantrasharing.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;

/**
 * @author Dmitry Bakhtiarov
 */

@Component
@ConfigurationProperties(prefix = "telegrambot")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MantraSharingBotConfig {
    String webHookPath;
    String userName;
    String botToken;
}

