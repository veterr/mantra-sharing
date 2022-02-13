package org.bhaktimarga.mantrasharing.botapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author Dmitry Bakhtiarov
 */
@Service
@Slf4j
public class TelegramFacade {
//    private UserDataCache userDataCache;
//    private BotStateContext botStateContext;
//    private CallbackQueryFacade callbackQueryFacade;

//    public TelegramFacade(UserDataCache userDataCache, BotStateContext botStateContext,
//                          CallbackQueryFacade callbackQueryFacade) {
//        this.userDataCache = userDataCache;
//        this.botStateContext = botStateContext;
//        this.callbackQueryFacade = callbackQueryFacade;
//    }

    public SendMessage handleUpdate(Update update) {
        SendMessage mes = new SendMessage();
        mes.setChatId(update.getMessage().getChatId() + "");
        mes.setText("https://www.youtube.com/watch?v=kgyLKGTkaaA");


        return mes;
    }

//    private SendMessage handleInputMessage(Message message) {
//        String inputMsg = message.getText();
//        int userId = message.getFrom().getId();
//        BotState botState;
//        SendMessage replyMessage;
//
//        switch (inputMsg) {
//            case "Найти поезда":
//                botState = BotState.TRAINS_SEARCH;
//                break;
//            case "Мои подписки":
//                botState = BotState.SHOW_SUBSCRIPTIONS_MENU;
//                break;
//            case "Справочник станций":
//                botState = BotState.STATIONS_SEARCH;
//                break;
//            case "Помощь":
//                botState = BotState.SHOW_HELP_MENU;
//                break;
//            default:
//                botState = userDataCache.getUsersCurrentBotState(userId);
//                break;
//        }
//
//        userDataCache.setUsersCurrentBotState(userId, botState);
//
//        replyMessage = botStateContext.processInputMessage(botState, message);
//
//        return replyMessage;
//    }


}
