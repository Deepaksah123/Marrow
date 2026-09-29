package com.google.android.gms.auth.api.proxy;

import android.os.SystemClock;
import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public class AuthApiStatusCodes extends CommonStatusCodes {
    public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;
    public static final int AUTH_API_CLIENT_ERROR = 3002;
    public static final int AUTH_API_INVALID_CREDENTIALS = 3000;
    public static final int AUTH_API_SERVER_ERROR = 3003;
    public static final int AUTH_APP_CERT_ERROR = 3006;
    public static final int AUTH_TOKEN_ERROR = 3004;
    public static final int AUTH_URL_RESOLUTION = 3005;
    public static int read;
    public static int write;

    private AuthApiStatusCodes() {
    }

    public static String getStatusCodeString(int i) {
        switch (i) {
            case AUTH_API_INVALID_CREDENTIALS /* 3000 */:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case 3004:
                return "AUTH_TOKEN_ERROR";
            case AUTH_URL_RESOLUTION /* 3005 */:
                return "AUTH_URL_RESOLUTION";
            case AUTH_APP_CERT_ERROR /* 3006 */:
                return "AUTH_APP_CERT_ERROR";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }

    public static int RemoteActionCompatParcelizer() {
        int i = read;
        int i2 = i % 7880793;
        read = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        write = iUptimeMillis;
        return iUptimeMillis;
    }
}
