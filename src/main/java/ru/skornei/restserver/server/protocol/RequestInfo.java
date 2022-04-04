package ru.skornei.restserver.server.protocol;

import java.util.List;
import java.util.Map;

public class RequestInfo {

    /**
     * Sender IP address
     */
    private String remoteIpAddress;

    /**
     * Headers
     */
    private Map<String, String> headers;

    /**
     * Parameters
     */
    private Map<String, List<String>> parameters;

    /**
     * Body
     */
    private byte[] body;

    public RequestInfo(String remoteIpAddress, Map<String, String> headers, Map<String, List<String>> parameters) {
        this.remoteIpAddress = remoteIpAddress;
        this.headers = headers;
        this.parameters = parameters;
    }

    public String getRemoteIpAddress() {
        return remoteIpAddress;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, List<String>> getParameters() {
        return parameters;
    }

    public boolean isBodyAvailable() {
        return body != null;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}
