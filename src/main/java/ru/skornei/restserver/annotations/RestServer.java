package ru.skornei.restserver.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RestServer {

    /**
     * Server port
     * @return Port
     */
    int port();

    /**
     * Object Converter Class
     * @return Converter class
     */
    Class<?> converter() default void.class;

    /**
     * Authentication class
     * @return Authentication class
     */
    Class<?> authentication() default void.class;

    /**
     * Server controller clazz
     * @return Controller Class list
     */
    Class<?>[] controllers();
}
