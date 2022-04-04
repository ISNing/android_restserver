package ru.skornei.restserver.server.converter;

public interface BaseConverter {

    /**
     * Convert object to byte array
     * @param value Object
     * @return Byte array
     */
    byte[] writeValueAsBytes(Object value);

    /**
     * Get object from byte array
     * @param src Byte array
     * @param valueType Object type class
     * @param <T> Target object type
     * @return Object
     */
    <T> T writeValue(byte[] src, Class<T> valueType);
}
