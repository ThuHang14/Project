package com.example.projectemarketg3.handler.base;

import com.example.projectemarketg3.dto.request.base.RequestData;
import com.example.projectemarketg3.dto.request.base.command.RequestDataCommand;
import com.example.projectemarketg3.dto.request.base.query.RequestDataQuery;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

@Component
@AllArgsConstructor
public class HandlerFactory {
    private final ApplicationContext context;

    private final static Map<Class<? extends RequestDataQuery>, HandlerQuery> HANDLERS_QUERY = new HashMap<>();
    private final static Map<Class<? extends RequestDataCommand>, HandlerCommand> HANDLERS_COMMAND = new HashMap<>();

    public static Object getHandler(RequestData request) {
        if (request instanceof RequestDataQuery) {
            return HANDLERS_QUERY.get(request.getClass());
        }
        if (request instanceof RequestDataCommand) {
            return HANDLERS_QUERY.get(request.getClass());
        }
        return null;
    }

    @PostConstruct
    public void initHandlers() {
        Map<String, HandlerQuery> handlerMapQuery = context.getBeansOfType(HandlerQuery.class);
        putHandlerQuery(handlerMapQuery);

        Map<String, HandlerCommand> handlerMapCommand = context.getBeansOfType(HandlerCommand.class);
        putHandlerCommand(handlerMapCommand);

    }

    private Class<? extends RequestData> getRequestClassType(Class handler) {
        String genericName1 = handler.getGenericInterfaces()[0].getTypeName();
        genericName1 = genericName1.substring(genericName1.indexOf("<") + 1, genericName1.indexOf(","));

        try {
            return (Class<? extends RequestData>) Class.forName(genericName1);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    private void putHandlerCommand(Map<String, HandlerCommand> handlerMapCommand) {
        handlerMapCommand.forEach((k, v) -> {
            Class<? extends RequestData> requestClassType = getRequestClassType(v.getClass());
            HANDLERS_COMMAND.put((Class<? extends RequestDataCommand>) requestClassType, v);
            System.out.println(requestClassType + "     COMMAND     " + v);
        });
    }

    private void putHandlerQuery(Map<String, HandlerQuery> handlerMapQuery) {
        handlerMapQuery.forEach((k, v) -> {
            Class<? extends RequestData> requestClassType = getRequestClassType(v.getClass());
            HANDLERS_QUERY.put((Class<? extends RequestDataQuery>) requestClassType, v);
            System.out.println(requestClassType + "     QUERY   " + v);
        });
    }
}
