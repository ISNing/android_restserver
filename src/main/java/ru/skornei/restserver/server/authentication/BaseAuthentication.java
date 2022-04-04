package ru.skornei.restserver.server.authentication;

import ru.skornei.restserver.server.protocol.RequestInfo;

public interface BaseAuthentication {

    /**
     * Authentication
     * @param requestInfo Query options
     * @return Authenticated or not
     */
    boolean authentication(RequestInfo requestInfo);
}
