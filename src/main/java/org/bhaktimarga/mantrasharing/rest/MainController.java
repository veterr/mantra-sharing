package org.bhaktimarga.mantrasharing.rest;

import lombok.extern.slf4j.Slf4j;
import org.bhaktimarga.mantrasharing.botapi.MantraSharingTelegramBot;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;


@Slf4j
@RestController
public class MainController {
    private final MantraSharingTelegramBot telegramBot;
    //private final UserTicketsSubscriptionService subscriptionService;

    public MainController(MantraSharingTelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
        return telegramBot.onWebhookUpdateReceived(update);
    }

//    @GetMapping(value = "/subscriptions", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<UserTicketsSubscription> index() {
//        List<UserTicketsSubscription> userTicketsSubscriptions = subscriptionService.getAllSubscriptions();
//        return userTicketsSubscriptions;
//    }

}
