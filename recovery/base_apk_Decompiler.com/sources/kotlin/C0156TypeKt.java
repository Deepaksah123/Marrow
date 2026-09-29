package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ShapeKt;
import kotlin.getEncryptedLicenseTimeInfo;

/* JADX INFO: renamed from: o.TypeKt, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001FB{\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b+J\r\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\b,J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b-J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\b\u00101\u001a\u000202H\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b3J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b4J\u001e\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u00106\u001a\u00020\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007H\u0007J\r\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\b8J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070/2\u0006\u00106\u001a\u00020\u0007J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b9J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b:J\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0014J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b?J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b@J\r\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\bAJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\bBJ\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\bCJ\b\u0010D\u001a\u00020\u0007H\u0016J\u0006\u0010E\u001a\u00020\rR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0013\u0010\f\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001dR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010(R\u0013\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010*R\u0013\u0010\u0013\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010)¨\u0006G"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "request", "Lokhttp3/Request;", "protocol", "Lokhttp3/Protocol;", "message", "", "code", "", "handshake", "Lokhttp3/Handshake;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/ResponseBody;", "networkResponse", "cacheResponse", "priorResponse", "sentRequestAtMillis", "", "receivedResponseAtMillis", "exchange", "Lokhttp3/internal/connection/Exchange;", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "()Lokhttp3/ResponseBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Response;", "()I", "()Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/Handshake;", "()Lokhttp3/Headers;", "isRedirect", "", "()Z", "isSuccessful", "lazyCacheControl", "()Ljava/lang/String;", "()Lokhttp3/Protocol;", "()J", "()Lokhttp3/Request;", "-deprecated_body", "-deprecated_cacheControl", "-deprecated_cacheResponse", "challenges", "", "Lokhttp3/Challenge;", "close", "", "-deprecated_code", "-deprecated_handshake", "header", "name", "defaultValue", "-deprecated_headers", "-deprecated_message", "-deprecated_networkResponse", "newBuilder", "Lokhttp3/Response$Builder;", "peekBody", "byteCount", "-deprecated_priorResponse", "-deprecated_protocol", "-deprecated_receivedResponseAtMillis", "-deprecated_request", "-deprecated_sentRequestAtMillis", "toString", "trailers", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0156TypeKt implements Closeable {
    private final ActivityAdapterModule body;
    private final C0156TypeKt cacheResponse;
    private final int code;
    private final LicenseProviderModule exchange;
    private final ThemeKt handshake;
    private final ShapeKt headers;
    private getEncryptedLicenseTimeInfo lazyCacheControl;
    private final String message;
    private final C0156TypeKt networkResponse;
    private final C0156TypeKt priorResponse;
    private final ThemeKtExternalSyntheticLambda1 protocol;
    private final long receivedResponseAtMillis;
    private final ThemeKtExternalSyntheticLambda0 request;
    private final long sentRequestAtMillis;

    public C0156TypeKt(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1, String str, int i, ThemeKt themeKt, ShapeKt shapeKt, ActivityAdapterModule activityAdapterModule, C0156TypeKt c0156TypeKt, C0156TypeKt c0156TypeKt2, C0156TypeKt c0156TypeKt3, long j, long j2, LicenseProviderModule licenseProviderModule) {
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda1, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(shapeKt, "");
        this.request = themeKtExternalSyntheticLambda0;
        this.protocol = themeKtExternalSyntheticLambda1;
        this.message = str;
        this.code = i;
        this.handshake = themeKt;
        this.headers = shapeKt;
        this.body = activityAdapterModule;
        this.networkResponse = c0156TypeKt;
        this.cacheResponse = c0156TypeKt2;
        this.priorResponse = c0156TypeKt3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = licenseProviderModule;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final ThemeKtExternalSyntheticLambda0 getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final ThemeKtExternalSyntheticLambda1 getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final ThemeKt getHandshake() {
        return this.handshake;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final ShapeKt getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final ActivityAdapterModule getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final C0156TypeKt getNetworkResponse() {
        return this.networkResponse;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final C0156TypeKt getCacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final C0156TypeKt getPriorResponse() {
        return this.priorResponse;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final LicenseProviderModule getExchange() {
        return this.exchange;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        int i = this.code;
        return 200 <= i && i < 300;
    }

    private String IconCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        String strIconCompatParcelizer = this.headers.IconCompatParcelizer(str);
        if (strIconCompatParcelizer == null) {
            return null;
        }
        return strIconCompatParcelizer;
    }

    public static /* synthetic */ String IconCompatParcelizer(C0156TypeKt c0156TypeKt, String str) {
        return c0156TypeKt.IconCompatParcelizer(str, (String) null);
    }

    public final IconCompatParcelizer MediaDescriptionCompat() {
        return new IconCompatParcelizer(this);
    }

    public final List<EmptyResponseException> write() {
        String str;
        ShapeKt shapeKt = this.headers;
        int i = this.code;
        if (i == 401) {
            str = RtspHeaders.WWW_AUTHENTICATE;
        } else if (i == 407) {
            str = RtspHeaders.PROXY_AUTHENTICATE;
        } else {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return FragmentProviderModule.AudioAttributesCompatParcelizer(shapeKt, str);
    }

    public final getEncryptedLicenseTimeInfo AudioAttributesCompatParcelizer() {
        getEncryptedLicenseTimeInfo getencryptedlicensetimeinfo = this.lazyCacheControl;
        if (getencryptedlicensetimeinfo != null) {
            return getencryptedlicensetimeinfo;
        }
        getEncryptedLicenseTimeInfo.Companion companion = getEncryptedLicenseTimeInfo.INSTANCE;
        getEncryptedLicenseTimeInfo getencryptedlicensetimeinfoWrite = getEncryptedLicenseTimeInfo.Companion.write(this.headers);
        this.lazyCacheControl = getencryptedlicensetimeinfoWrite;
        return getencryptedlicensetimeinfoWrite;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ActivityAdapterModule activityAdapterModule = this.body;
        if (activityAdapterModule == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        activityAdapterModule.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.protocol);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", url=");
        sb.append(this.request.getUrl());
        sb.append('}');
        return sb.toString();
    }

    public final String read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return IconCompatParcelizer(this, str);
    }

    /* JADX INFO: renamed from: o.TypeKt$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        private ActivityAdapterModule AudioAttributesCompatParcelizer;
        private C0156TypeKt AudioAttributesImplApi21Parcelizer;
        private ShapeKt.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
        private ThemeKtExternalSyntheticLambda1 AudioAttributesImplBaseParcelizer;
        private LicenseProviderModule IconCompatParcelizer;
        private String MediaBrowserCompatCustomActionResultReceiver;
        private C0156TypeKt MediaBrowserCompatItemReceiver;
        private ThemeKtExternalSyntheticLambda0 MediaBrowserCompatSearchResultReceiver;
        private long MediaDescriptionCompat;
        private long MediaMetadataCompat;
        private ThemeKt RemoteActionCompatParcelizer;
        private C0156TypeKt read;
        private int write;

        public final int RemoteActionCompatParcelizer() {
            return this.write;
        }

        public IconCompatParcelizer() {
            this.write = -1;
            this.AudioAttributesImplApi26Parcelizer = new ShapeKt.RemoteActionCompatParcelizer();
        }

        public IconCompatParcelizer(C0156TypeKt c0156TypeKt) {
            toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
            this.write = -1;
            this.MediaBrowserCompatSearchResultReceiver = c0156TypeKt.getRequest();
            this.AudioAttributesImplBaseParcelizer = c0156TypeKt.getProtocol();
            this.write = c0156TypeKt.getCode();
            this.MediaBrowserCompatCustomActionResultReceiver = c0156TypeKt.getMessage();
            this.RemoteActionCompatParcelizer = c0156TypeKt.getHandshake();
            this.AudioAttributesImplApi26Parcelizer = c0156TypeKt.getHeaders().AudioAttributesCompatParcelizer();
            this.AudioAttributesCompatParcelizer = c0156TypeKt.getBody();
            this.AudioAttributesImplApi21Parcelizer = c0156TypeKt.getNetworkResponse();
            this.read = c0156TypeKt.getCacheResponse();
            this.MediaBrowserCompatItemReceiver = c0156TypeKt.getPriorResponse();
            this.MediaMetadataCompat = c0156TypeKt.getSentRequestAtMillis();
            this.MediaDescriptionCompat = c0156TypeKt.getReceivedResponseAtMillis();
            this.IconCompatParcelizer = c0156TypeKt.getExchange();
        }

        public final IconCompatParcelizer read(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) {
            toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
            this.MediaBrowserCompatSearchResultReceiver = themeKtExternalSyntheticLambda0;
            return this;
        }

        public final IconCompatParcelizer read(ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1) {
            toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda1, "");
            this.AudioAttributesImplBaseParcelizer = themeKtExternalSyntheticLambda1;
            return this;
        }

        public final IconCompatParcelizer read(int i) {
            this.write = i;
            return this;
        }

        public final IconCompatParcelizer write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(ThemeKt themeKt) {
            this.RemoteActionCompatParcelizer = themeKt;
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(str, str2);
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(str, str2);
            return this;
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(ShapeKt shapeKt) {
            toMagicModuleMetaRepoModel.write(shapeKt, "");
            this.AudioAttributesImplApi26Parcelizer = shapeKt.AudioAttributesCompatParcelizer();
            return this;
        }

        public final IconCompatParcelizer write(ActivityAdapterModule activityAdapterModule) {
            this.AudioAttributesCompatParcelizer = activityAdapterModule;
            return this;
        }

        public final IconCompatParcelizer read(C0156TypeKt c0156TypeKt) {
            IconCompatParcelizer("networkResponse", c0156TypeKt);
            this.AudioAttributesImplApi21Parcelizer = c0156TypeKt;
            return this;
        }

        public final IconCompatParcelizer write(C0156TypeKt c0156TypeKt) {
            IconCompatParcelizer("cacheResponse", c0156TypeKt);
            this.read = c0156TypeKt;
            return this;
        }

        private static void IconCompatParcelizer(String str, C0156TypeKt c0156TypeKt) {
            if (c0156TypeKt != null) {
                if (c0156TypeKt.getBody() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".body != null");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if (c0156TypeKt.getNetworkResponse() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(".networkResponse != null");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                if (c0156TypeKt.getCacheResponse() != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(".cacheResponse != null");
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                if (c0156TypeKt.getPriorResponse() == null) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString().toString());
            }
        }

        public final IconCompatParcelizer IconCompatParcelizer(C0156TypeKt c0156TypeKt) {
            RemoteActionCompatParcelizer(c0156TypeKt);
            this.MediaBrowserCompatItemReceiver = c0156TypeKt;
            return this;
        }

        private static void RemoteActionCompatParcelizer(C0156TypeKt c0156TypeKt) {
            if (c0156TypeKt != null && c0156TypeKt.getBody() != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            this.MediaMetadataCompat = j;
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(long j) {
            this.MediaDescriptionCompat = j;
            return this;
        }

        public final void write(LicenseProviderModule licenseProviderModule) {
            toMagicModuleMetaRepoModel.write(licenseProviderModule, "");
            this.IconCompatParcelizer = licenseProviderModule;
        }

        public final C0156TypeKt IconCompatParcelizer() {
            int i = this.write;
            if (i < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.write);
                throw new IllegalStateException(sb.toString().toString());
            }
            ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0 = this.MediaBrowserCompatSearchResultReceiver;
            if (themeKtExternalSyntheticLambda0 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1 = this.AudioAttributesImplBaseParcelizer;
            if (themeKtExternalSyntheticLambda1 == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.MediaBrowserCompatCustomActionResultReceiver;
            if (str != null) {
                return new C0156TypeKt(themeKtExternalSyntheticLambda0, themeKtExternalSyntheticLambda1, str, i, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(), this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.read, this.MediaBrowserCompatItemReceiver, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.IconCompatParcelizer);
            }
            throw new IllegalStateException("message == null".toString());
        }
    }
}
