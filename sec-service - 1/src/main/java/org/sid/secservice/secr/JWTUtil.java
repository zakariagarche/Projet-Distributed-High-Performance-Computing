package org.sid.secservice.secr;

public class JWTUtil {
    public static final String SECRET="mySecret1234";
    public static final String AUTH_HEADER = "Authorization";
    public static final String PREFIX = "Bearer ";
    public static final long EXPIRE_ACCESS_TOKEN = 15*60*10000;
    public static final long EXPIRE_REFRESH_TOKEN = 15*60*10000;
}
