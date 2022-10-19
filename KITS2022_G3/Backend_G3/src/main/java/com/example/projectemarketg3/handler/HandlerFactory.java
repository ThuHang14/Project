package com.example.projectemarketg3.handler;

import com.example.projectemarketg3.base.BaseRequest;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
public class HandlerFactory {
    private final static Map<Class<? extends BaseRequest>, Handler> HANDLERS = new HashMap<>();
    private final ApplicationContext context;

    public static Handler getHandler(BaseRequest request) {
        return HANDLERS.get(request.getClass());
    }

    @PostConstruct
    public void initHandler() {
//        lấy ra các Bean đac định nghĩa -> put vào map HANDLERS
        Map<String, Handler> handlerMap = context.getBeansOfType(Handler.class);

        handlerMap.forEach((k, v) -> {
            Class<? extends BaseRequest> requestClassType = getRequestClassType(v.getClass());
            HANDLERS.put(requestClassType, v);
            System.out.println(requestClassType + "----------" + v);
        });


    }

    private Class<? extends BaseRequest> getRequestClassType(Class handler) {
        String genericName = handler.getGenericInterfaces()[0].getTypeName();
        genericName = genericName.substring(genericName.indexOf("<") + 1, genericName.indexOf(","));

//        System.out.println(genericName);
        try {
            return (Class<? extends BaseRequest>) Class.forName(genericName);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

//    public List<?> resultResponse (Handler handler,BaseRequest requestData){
//        return handler.handle(handler,requestData);
//    }
}
