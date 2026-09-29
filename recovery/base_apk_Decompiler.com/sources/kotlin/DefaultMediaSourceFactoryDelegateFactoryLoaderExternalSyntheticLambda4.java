package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 implements Serializable {
    NETWORK_ERROR(7, "No internet connection"),
    INVALID_DATA(8, "Invalid data is not accepted by endpoints"),
    CHALLENGE_ERROR(9, "Challenge encountered error on setup"),
    INTERNAL_ERROR(10, "hCaptcha client encountered an internal error"),
    SESSION_TIMEOUT(15, "Session Timeout"),
    TOKEN_TIMEOUT(16, "Token Timeout"),
    CHALLENGE_CLOSED(30, "Challenge Closed"),
    RATE_LIMITED(31, "Rate Limited"),
    INVALID_CUSTOM_THEME(32, "Invalid custom theme"),
    INSECURE_HTTP_REQUEST_ERROR(33, "Insecure resource requested"),
    ERROR(29, "Unknown error");

    private final int MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;

    DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4(int i, String str) {
        this.MediaBrowserCompatMediaItem = i;
        this.MediaBrowserCompatSearchResultReceiver = str;
    }

    public static DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 read(int i) {
        for (DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 : values()) {
            if (defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.MediaBrowserCompatMediaItem == i) {
                return defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4;
            }
        }
        throw new RuntimeException("Unsupported error id: ".concat(String.valueOf(i)));
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }
}
