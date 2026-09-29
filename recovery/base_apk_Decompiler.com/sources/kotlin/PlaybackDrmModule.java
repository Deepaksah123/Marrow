package kotlin;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002'\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0010\u0010\u0019J\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0010\u0010\u001bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010 J\u000f\u0010!\u001a\u00020\u001dH\u0000¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010\u0014\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\"H\u0000¢\u0006\u0004\b\u0014\u0010$J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010%J;\u0010'\u001a\u00028\u0000\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00028\u0000H\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010'\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010/J\r\u00100\u001a\u00020\u0006¢\u0006\u0004\b0\u0010%J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u0013J#\u0010\u0014\u001a\u00028\u0000\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u00102\u001a\u00020)H\u0002¢\u0006\u0004\b2\u0010+R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u00108\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b'\u0010:R(\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010B\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\bB\u0010<\"\u0004\b\u0010\u0010\rR\u001a\u0010D\u001a\u00020C8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u00107R\u001a\u0010Q\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bR\u0010%R(\u0010S\u001a\u0004\u0018\u00010#2\b\u0010\u0003\u001a\u0004\u0018\u00010#8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010/R\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u00107R\u0016\u0010Z\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u00107R\u0014\u0010\\\u001a\u00020[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u00107"}, d2 = {"Lo/PlaybackDrmModule;", "Lo/toDownloadInfo;", "Lo/ThemeKtExternalSyntheticLambda3;", "p0", "Lo/ThemeKtExternalSyntheticLambda0;", "p1", "", "p2", "<init>", "(Lo/ThemeKtExternalSyntheticLambda3;Lo/ThemeKtExternalSyntheticLambda0;Z)V", "Lo/VideoAnalyticModule;", "", "AudioAttributesCompatParcelizer", "(Lo/VideoAnalyticModule;)V", "Ljava/io/IOException;", "E", "IconCompatParcelizer", "(Ljava/io/IOException;)Ljava/io/IOException;", "handleMediaPlayPauseIfPendingOnHandler", "()V", "RemoteActionCompatParcelizer", "onCustomAction", "()Lo/PlaybackDrmModule;", "Lo/ThemeAlphaConstantsKt;", "Lo/VideoOfflineDbModel;", "(Lo/ThemeAlphaConstantsKt;)Lo/VideoOfflineDbModel;", "Lo/MarrowVideoDownloadException;", "(Lo/MarrowVideoDownloadException;)V", "(Lo/ThemeKtExternalSyntheticLambda0;Z)V", "Lo/TypeKt;", "write", "()Lo/TypeKt;", "(Z)V", "MediaBrowserCompatSearchResultReceiver", "Lo/BaseDaggerFragment;", "Lo/LicenseProviderModule;", "(Lo/BaseDaggerFragment;)Lo/LicenseProviderModule;", "()Z", "p3", "read", "(Lo/LicenseProviderModule;ZZLjava/io/IOException;)Ljava/io/IOException;", "", "MediaMetadataCompat", "()Ljava/lang/String;", "Ljava/net/Socket;", "RatingCompat", "()Ljava/net/Socket;", "()Lo/ThemeKtExternalSyntheticLambda0;", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "onAddQueueItem", "", "callStackTrace", "Ljava/lang/Object;", "canceled", "Z", "client", "Lo/ThemeKtExternalSyntheticLambda3;", "()Lo/ThemeKtExternalSyntheticLambda3;", "connection", "Lo/VideoAnalyticModule;", "AudioAttributesImplApi26Parcelizer", "()Lo/VideoAnalyticModule;", "Lo/ResourceProviderModule;", "connectionPool", "Lo/ResourceProviderModule;", "connectionToCancel", "Lo/AppThemeKt;", "eventListener", "Lo/AppThemeKt;", "MediaBrowserCompatItemReceiver", "()Lo/AppThemeKt;", "exchange", "Lo/LicenseProviderModule;", "Lo/FileProviderModule;", "exchangeFinder", "Lo/FileProviderModule;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "expectMoreExchanges", "forWebSocket", "AudioAttributesImplApi21Parcelizer", "interceptorScopedExchange", "AudioAttributesImplBaseParcelizer", "()Lo/LicenseProviderModule;", "originalRequest", "Lo/ThemeKtExternalSyntheticLambda0;", "MediaBrowserCompatCustomActionResultReceiver", "requestBodyOpen", "responseBodyOpen", "Lo/PlaybackDrmModule$RemoteActionCompatParcelizer;", "timeout", "Lo/PlaybackDrmModule$RemoteActionCompatParcelizer;", "timeoutEarlyExit"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlaybackDrmModule implements toDownloadInfo {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final ThemeKtExternalSyntheticLambda3 client;
    private VideoAnalyticModule connection;
    private final ResourceProviderModule connectionPool;
    private volatile VideoAnalyticModule connectionToCancel;
    private final AppThemeKt eventListener;
    private volatile LicenseProviderModule exchange;
    private FileProviderModule exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private LicenseProviderModule interceptorScopedExchange;
    private final ThemeKtExternalSyntheticLambda0 originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final RemoteActionCompatParcelizer timeout;
    private boolean timeoutEarlyExit;

    public PlaybackDrmModule(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3, ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, boolean z) {
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda3, "");
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
        this.client = themeKtExternalSyntheticLambda3;
        this.originalRequest = themeKtExternalSyntheticLambda0;
        this.forWebSocket = z;
        this.connectionPool = themeKtExternalSyntheticLambda3.getConnectionPool().getDelegate();
        this.eventListener = themeKtExternalSyntheticLambda3.getEventListenerFactory().AudioAttributesCompatParcelizer(this);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.read(themeKtExternalSyntheticLambda3.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = remoteActionCompatParcelizer;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final ThemeKtExternalSyntheticLambda3 getClient() {
        return this.client;
    }

    public final ThemeKtExternalSyntheticLambda0 MediaBrowserCompatCustomActionResultReceiver() {
        return this.originalRequest;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final AppThemeKt getEventListener() {
        return this.eventListener;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/PlaybackDrmModule$RemoteActionCompatParcelizer;", "Lo/setSubscriptionDataProvider;", "", "RemoteActionCompatParcelizer", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends setSubscriptionDataProvider {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.setSubscriptionDataProvider
        public final void RemoteActionCompatParcelizer() {
            PlaybackDrmModule.this.RemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final VideoAnalyticModule getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final LicenseProviderModule getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final void IconCompatParcelizer(VideoAnalyticModule videoAnalyticModule) {
        this.connectionToCancel = videoAnalyticModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCustomAction, reason: merged with bridge method [inline-methods] */
    public PlaybackDrmModule clone() {
        return new PlaybackDrmModule(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // kotlin.toDownloadInfo
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final ThemeKtExternalSyntheticLambda0 getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // kotlin.toDownloadInfo
    public final void RemoteActionCompatParcelizer() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        LicenseProviderModule licenseProviderModule = this.exchange;
        if (licenseProviderModule != null) {
            licenseProviderModule.RemoteActionCompatParcelizer();
        }
        VideoAnalyticModule videoAnalyticModule = this.connectionToCancel;
        if (videoAnalyticModule != null) {
            videoAnalyticModule.AudioAttributesCompatParcelizer();
        }
        AppThemeKt.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.toDownloadInfo
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    @Override // kotlin.toDownloadInfo
    public final C0156TypeKt write() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.timeout.MediaBrowserCompatItemReceiver();
        handleMediaPlayPauseIfPendingOnHandler();
        try {
            this.client.getDispatcher().read(this);
            return MediaBrowserCompatSearchResultReceiver();
        } finally {
            this.client.getDispatcher().AudioAttributesCompatParcelizer(this);
        }
    }

    @Override // kotlin.toDownloadInfo
    public final void IconCompatParcelizer(MarrowVideoDownloadException p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        handleMediaPlayPauseIfPendingOnHandler();
        this.client.getDispatcher().RemoteActionCompatParcelizer(new read(this, p0));
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
        this.callStackTrace = SettingsItem.IconCompatParcelizer.write().RemoteActionCompatParcelizer("response.body().close()");
        AppThemeKt.read(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.C0156TypeKt MediaBrowserCompatSearchResultReceiver() throws java.io.IOException {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            o.ThemeKtExternalSyntheticLambda3 r1 = r10.client
            java.util.List r1 = r1.onCustomAction()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.IntermediateLoginResponseBody.IconCompatParcelizer(r0, r1)
            o.UpgradePlanActivity r1 = new o.UpgradePlanActivity
            o.ThemeKtExternalSyntheticLambda3 r2 = r10.client
            r1.<init>(r2)
            r0.add(r1)
            o.VideoConfigModule r1 = new o.VideoConfigModule
            o.ThemeKtExternalSyntheticLambda3 r2 = r10.client
            o.AppTheme r2 = r2.getCookieJar()
            r1.<init>(r2)
            r0.add(r1)
            o.PearlDataModule r1 = new o.PearlDataModule
            o.ThemeKtExternalSyntheticLambda3 r2 = r10.client
            o.getPlaybackUrlsEncrypt r2 = r2.getCache()
            r1.<init>(r2)
            r0.add(r1)
            o.TagModule r1 = kotlin.TagModule.INSTANCE
            r0.add(r1)
            boolean r1 = r10.forWebSocket
            if (r1 != 0) goto L50
            o.ThemeKtExternalSyntheticLambda3 r1 = r10.client
            java.util.List r1 = r1.onPause()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.IntermediateLoginResponseBody.IconCompatParcelizer(r0, r1)
        L50:
            o.BaseDaggerActivity r1 = new o.BaseDaggerActivity
            boolean r2 = r10.forWebSocket
            r1.<init>(r2)
            r0.add(r1)
            o.ThemeKtExternalSyntheticLambda0 r6 = r10.originalRequest
            o.ThemeKtExternalSyntheticLambda3 r0 = r10.client
            int r7 = r0.getConnectTimeoutMillis()
            o.ThemeKtExternalSyntheticLambda3 r0 = r10.client
            int r8 = r0.getReadTimeoutMillis()
            o.ThemeKtExternalSyntheticLambda3 r0 = r10.client
            int r9 = r0.getWriteTimeoutMillis()
            o.BaseDaggerFragment r0 = new o.BaseDaggerFragment
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            r2 = 0
            o.ThemeKtExternalSyntheticLambda0 r3 = r10.originalRequest     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            o.TypeKt r0 = r0.RemoteActionCompatParcelizer(r3)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            boolean r3 = r10.getCanceled()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            if (r3 != 0) goto L89
            r10.read(r1)
            return r0
        L89:
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            kotlin.FirebaseDataModule.read(r0)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            throw r0     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
        L96:
            r0 = move-exception
            goto La6
        L98:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.read(r0)     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r0, r3)     // Catch: java.lang.Throwable -> L96
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        La6:
            if (r2 != 0) goto Lab
            r10.read(r1)
        Lab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PlaybackDrmModule.MediaBrowserCompatSearchResultReceiver():o.TypeKt");
    }

    public final void AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.".toString());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        if (p1) {
            this.exchangeFinder = new FileProviderModule(this.connectionPool, IconCompatParcelizer(p0.getUrl()), this, this.eventListener);
        }
    }

    public final LicenseProviderModule RemoteActionCompatParcelizer(BaseDaggerFragment p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.".toString());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        FileProviderModule fileProviderModule = this.exchangeFinder;
        toMagicModuleMetaRepoModel.write(fileProviderModule);
        LicenseProviderModule licenseProviderModule = new LicenseProviderModule(this, this.eventListener, fileProviderModule, fileProviderModule.write(this.client, p0));
        this.interceptorScopedExchange = licenseProviderModule;
        this.exchange = licenseProviderModule;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return licenseProviderModule;
    }

    public final <E extends IOException> E read(LicenseProviderModule p0, boolean p1, boolean p2, E p3) {
        boolean z;
        boolean z2;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.exchange)) {
            synchronized (this) {
                z = false;
                if (p1) {
                    try {
                        if (!this.requestBodyOpen) {
                            if (p2 || !this.responseBodyOpen) {
                                z2 = false;
                            }
                            getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        }
                        if (p1) {
                            this.requestBodyOpen = false;
                        }
                        if (p2) {
                            this.responseBodyOpen = false;
                        }
                        boolean z3 = this.requestBodyOpen;
                        boolean z4 = (z3 || this.responseBodyOpen) ? false : true;
                        if (!z3 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                            z = true;
                        }
                        z2 = z;
                        z = z4;
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (p2) {
                    }
                    z2 = false;
                    getShowPopup getshowpopup22 = getShowPopup.INSTANCE;
                }
            }
            if (z) {
                this.exchange = null;
                VideoAnalyticModule videoAnalyticModule = this.connection;
                if (videoAnalyticModule != null) {
                    videoAnalyticModule.AudioAttributesImplApi21Parcelizer();
                }
            }
            if (z2) {
                return (E) IconCompatParcelizer(p3);
            }
        }
        return p3;
    }

    public final IOException read(IOException p0) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z = true;
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return z ? IconCompatParcelizer(p0) : p0;
    }

    public final Socket RatingCompat() {
        VideoAnalyticModule videoAnalyticModule = this.connection;
        toMagicModuleMetaRepoModel.write(videoAnalyticModule);
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        List<Reference<PlaybackDrmModule>> list = videoAnalyticModule.read();
        Iterator<Reference<PlaybackDrmModule>> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        list.remove(i);
        this.connection = null;
        if (list.isEmpty()) {
            videoAnalyticModule.AudioAttributesCompatParcelizer(System.nanoTime());
            if (this.connectionPool.write(videoAnalyticModule)) {
                return videoAnalyticModule.MediaBrowserCompatSearchResultReceiver();
            }
        }
        return null;
    }

    private final <E extends IOException> E RemoteActionCompatParcelizer(E p0) {
        if (this.timeoutEarlyExit || !this.timeout.AudioAttributesImplApi26Parcelizer()) {
            return p0;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (p0 != null) {
            interruptedIOException.initCause(p0);
        }
        return interruptedIOException;
    }

    public final void MediaDescriptionCompat() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.timeoutEarlyExit = true;
        this.timeout.AudioAttributesImplApi26Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(boolean p0) {
        LicenseProviderModule licenseProviderModule;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        if (p0 && (licenseProviderModule = this.exchange) != null) {
            licenseProviderModule.read();
        }
        this.interceptorScopedExchange = null;
    }

    private final VideoOfflineDbModel IconCompatParcelizer(ThemeAlphaConstantsKt p0) {
        SSLSocketFactory sSLSocketFactoryOnRemoveQueueItem;
        HostnameVerifier hostnameVerifier;
        toLicenseLSModel certificatePinner;
        if (p0.getIsHttps()) {
            sSLSocketFactoryOnRemoveQueueItem = this.client.onRemoveQueueItem();
            hostnameVerifier = this.client.getHostnameVerifier();
            certificatePinner = this.client.getCertificatePinner();
        } else {
            sSLSocketFactoryOnRemoveQueueItem = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new VideoOfflineDbModel(p0.getHost(), p0.getPort(), this.client.getDns(), this.client.getSocketFactory(), sSLSocketFactoryOnRemoveQueueItem, hostnameVerifier, certificatePinner, this.client.getProxyAuthenticator(), this.client.getProxy(), this.client.onPlay(), this.client.AudioAttributesImplApi26Parcelizer(), this.client.getProxySelector());
    }

    public final boolean MediaBrowserCompatMediaItem() {
        FileProviderModule fileProviderModule = this.exchangeFinder;
        toMagicModuleMetaRepoModel.write(fileProviderModule);
        return fileProviderModule.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String onAddQueueItem() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(MediaMetadataCompat());
        return sb.toString();
    }

    public final String MediaMetadataCompat() {
        return this.originalRequest.getUrl().MediaDescriptionCompat();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u00060\u0000R\u00020\n¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0011\u0010\b\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/PlaybackDrmModule$read;", "Ljava/lang/Runnable;", "Lo/MarrowVideoDownloadException;", "p0", "<init>", "(Lo/PlaybackDrmModule;Lo/MarrowVideoDownloadException;)V", "Ljava/util/concurrent/ExecutorService;", "", "RemoteActionCompatParcelizer", "(Ljava/util/concurrent/ExecutorService;)V", "Lo/PlaybackDrmModule;", "(Lo/PlaybackDrmModule$read;)V", "run", "()V", "write", "()Lo/PlaybackDrmModule;", "AudioAttributesCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "()Ljava/util/concurrent/atomic/AtomicInteger;", "", "()Ljava/lang/String;", "responseCallback", "Lo/MarrowVideoDownloadException;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class read implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final MarrowVideoDownloadException responseCallback;
        final /* synthetic */ PlaybackDrmModule this$0;

        public read(PlaybackDrmModule playbackDrmModule, MarrowVideoDownloadException marrowVideoDownloadException) {
            toMagicModuleMetaRepoModel.write(marrowVideoDownloadException, "");
            this.this$0 = playbackDrmModule;
            this.responseCallback = marrowVideoDownloadException;
            this.callsPerHost = new AtomicInteger(0);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final void RemoteActionCompatParcelizer(read p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.callsPerHost = p0.callsPerHost;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.this$0.MediaBrowserCompatCustomActionResultReceiver().getUrl().getHost();
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final PlaybackDrmModule getThis$0() {
            return this.this$0;
        }

        public final void RemoteActionCompatParcelizer(ExecutorService p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.this$0.getClient().getDispatcher();
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            try {
                try {
                    p0.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.this$0.read(interruptedIOException);
                    this.responseCallback.read(this.this$0, interruptedIOException);
                    this.this$0.getClient().getDispatcher().AudioAttributesCompatParcelizer(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().getDispatcher().AudioAttributesCompatParcelizer(this);
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ThemeKtExternalSyntheticLambda3 client;
            StringBuilder sb = new StringBuilder("OkHttp ");
            sb.append(this.this$0.MediaMetadataCompat());
            String string = sb.toString();
            PlaybackDrmModule playbackDrmModule = this.this$0;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                playbackDrmModule.timeout.MediaBrowserCompatItemReceiver();
                boolean z = false;
                try {
                    try {
                    } catch (Throwable th) {
                        playbackDrmModule.getClient().getDispatcher().AudioAttributesCompatParcelizer(this);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.responseCallback.read(playbackDrmModule, playbackDrmModule.MediaBrowserCompatSearchResultReceiver());
                    client = playbackDrmModule.getClient();
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    if (z) {
                        SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                        SettingsItem.IconCompatParcelizer.write();
                        StringBuilder sb2 = new StringBuilder("Callback failure for ");
                        sb2.append(playbackDrmModule.onAddQueueItem());
                        SettingsItem.AudioAttributesCompatParcelizer(sb2.toString(), 4, e);
                    } else {
                        this.responseCallback.read(playbackDrmModule, e);
                    }
                    client = playbackDrmModule.getClient();
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    playbackDrmModule.RemoteActionCompatParcelizer();
                    if (!z) {
                        StringBuilder sb3 = new StringBuilder("canceled due to ");
                        sb3.append(th);
                        IOException iOException = new IOException(sb3.toString());
                        getPlanName.IconCompatParcelizer(iOException, th);
                        this.responseCallback.read(playbackDrmModule, iOException);
                    }
                    throw th;
                }
                client.getDispatcher().AudioAttributesCompatParcelizer(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class IconCompatParcelizer extends WeakReference<PlaybackDrmModule> {
        private final Object IconCompatParcelizer;

        public final Object write() {
            return this.IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(PlaybackDrmModule playbackDrmModule, Object obj) {
            super(playbackDrmModule);
            toMagicModuleMetaRepoModel.write(playbackDrmModule, "");
            this.IconCompatParcelizer = obj;
        }
    }

    public final void AudioAttributesCompatParcelizer(VideoAnalyticModule p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        if (this.connection != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.connection = p0;
        p0.read().add(new IconCompatParcelizer(this, this.callStackTrace));
    }

    private final <E extends IOException> E IconCompatParcelizer(E p0) {
        Socket socketRatingCompat;
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        VideoAnalyticModule videoAnalyticModule = this.connection;
        if (videoAnalyticModule != null) {
            boolean z2 = FirebaseDataModule.AudioAttributesCompatParcelizer;
            synchronized (videoAnalyticModule) {
                socketRatingCompat = RatingCompat();
            }
            if (this.connection == null) {
                if (socketRatingCompat != null) {
                    FirebaseDataModule.read(socketRatingCompat);
                }
                AppThemeKt.write(this, videoAnalyticModule);
            } else if (socketRatingCompat != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        E e = (E) RemoteActionCompatParcelizer(p0);
        if (p0 != null) {
            toMagicModuleMetaRepoModel.write((Object) e);
            AppThemeKt.AudioAttributesCompatParcelizer(this, e);
            return e;
        }
        AppThemeKt.IconCompatParcelizer(this);
        return e;
    }
}
