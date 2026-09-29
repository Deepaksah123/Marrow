package kotlin;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.ActivityProviderModule;
import kotlin.AppThemeKt;
import kotlin.Metadata;
import kotlin.SettingsItem;
import kotlin.getSubscriptionDataProvider;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008d\u0001\u008c\u0001B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0005R\u0017\u0010\u0012\u001a\u00020\u00118G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168GX\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\r\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8GX\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8GX\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u001b8GX\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001eR\u001a\u0010,\u001a\u00020+8GX\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00102\u001a\b\u0012\u0004\u0012\u000201008GX\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\u0002068GX\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\u00020;8GX\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8GX\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8GX\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8GX\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020J8GX\u0087\u0004¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u001a\u0010R\u001a\u00020Q8GX\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010W\u001a\b\u0012\u0004\u0012\u00020V008GX\u0087\u0004¢\u0006\f\n\u0004\bW\u00103\u001a\u0004\bX\u00105R\u001a\u0010Z\u001a\u00020Y8GX\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010^\u001a\b\u0012\u0004\u0012\u00020V008GX\u0087\u0004¢\u0006\f\n\u0004\b^\u00103\u001a\u0004\b_\u00105R\u001a\u0010`\u001a\u00020\u001b8GX\u0087\u0004¢\u0006\f\n\u0004\b`\u0010\u001d\u001a\u0004\ba\u0010\u001eR \u0010c\u001a\b\u0012\u0004\u0012\u00020b008GX\u0087\u0004¢\u0006\f\n\u0004\bc\u00103\u001a\u0004\bd\u00105R\u001c\u0010f\u001a\u0004\u0018\u00010e8GX\u0087\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020\u00118GX\u0087\u0004¢\u0006\f\n\u0004\bj\u0010\u0013\u001a\u0004\bk\u0010\u0015R\u001a\u0010m\u001a\u00020l8GX\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010q\u001a\u00020\u001b8GX\u0087\u0004¢\u0006\f\n\u0004\bq\u0010\u001d\u001a\u0004\br\u0010\u001eR\u001a\u0010s\u001a\u00020J8GX\u0087\u0004¢\u0006\f\n\u0004\bs\u0010L\u001a\u0004\bt\u0010NR\u001a\u0010v\u001a\u00020u8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001a\u0010{\u001a\u00020z8GX\u0087\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0014\u0010\u0082\u0001\u001a\u00020\u007f8G¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u007f8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0085\u0001\u001a\u00020\u001b8GX\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u001d\u001a\u0005\b\u0086\u0001\u0010\u001eR\"\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda3;", "", "Lo/toDownloadInfo$AudioAttributesCompatParcelizer;", "Lo/ActivityProviderModule$write;", "<init>", "()V", "Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "p0", "(Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;)V", "onPlayFromMediaId", "()Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "Lo/ThemeKtExternalSyntheticLambda0;", "Lo/toDownloadInfo;", "IconCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda0;)Lo/toDownloadInfo;", "", "onRewind", "Lo/getLevel;", "authenticator", "Lo/getLevel;", "RemoteActionCompatParcelizer", "()Lo/getLevel;", "Lo/getPlaybackUrlsEncrypt;", "cache", "Lo/getPlaybackUrlsEncrypt;", "write", "()Lo/getPlaybackUrlsEncrypt;", "", "callTimeoutMillis", "I", "()I", "Lo/getSubscriptionDataProvider;", "certificateChainCleaner", "Lo/getSubscriptionDataProvider;", "AudioAttributesImplBaseParcelizer", "()Lo/getSubscriptionDataProvider;", "Lo/toLicenseLSModel;", "certificatePinner", "Lo/toLicenseLSModel;", "MediaBrowserCompatItemReceiver", "()Lo/toLicenseLSModel;", "connectTimeoutMillis", "AudioAttributesImplApi21Parcelizer", "Lo/ResponseErrorException;", "connectionPool", "Lo/ResponseErrorException;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/ResponseErrorException;", "", "Lo/UserLoggedOutExceptionCompanion;", "connectionSpecs", "Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/List;", "Lo/AppTheme;", "cookieJar", "Lo/AppTheme;", "MediaDescriptionCompat", "()Lo/AppTheme;", "Lo/AppThemeManager;", "dispatcher", "Lo/AppThemeManager;", "MediaMetadataCompat", "()Lo/AppThemeManager;", "Lo/AppThemePreviewProvider;", "dns", "Lo/AppThemePreviewProvider;", "MediaBrowserCompatSearchResultReceiver", "()Lo/AppThemePreviewProvider;", "Lo/AppThemeKt$RemoteActionCompatParcelizer;", "eventListenerFactory", "Lo/AppThemeKt$RemoteActionCompatParcelizer;", "MediaBrowserCompatMediaItem", "()Lo/AppThemeKt$RemoteActionCompatParcelizer;", "", "followRedirects", "Z", "RatingCompat", "()Z", "followSslRedirects", "handleMediaPlayPauseIfPendingOnHandler", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "onCommand", "()Ljavax/net/ssl/HostnameVerifier;", "Lo/MarrowTheme;", "interceptors", "onCustomAction", "", "minWebSocketMessageToCompress", "J", "onAddQueueItem", "()J", "networkInterceptors", "onPause", "pingIntervalMillis", "onMediaButtonEvent", "Lo/ThemeKtExternalSyntheticLambda1;", "protocols", "onPlay", "Ljava/net/Proxy;", "proxy", "Ljava/net/Proxy;", "onFastForward", "()Ljava/net/Proxy;", "proxyAuthenticator", "onPlayFromUri", "Ljava/net/ProxySelector;", "proxySelector", "Ljava/net/ProxySelector;", "onPlayFromSearch", "()Ljava/net/ProxySelector;", "readTimeoutMillis", "onPrepare", "retryOnConnectionFailure", "onPrepareFromMediaId", "Lo/FragmentExtraModule;", "routeDatabase", "Lo/FragmentExtraModule;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/FragmentExtraModule;", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/SocketFactory;", "onPrepareFromSearch", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "onRemoveQueueItem", "()Ljavax/net/ssl/SSLSocketFactory;", "read", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "writeTimeoutMillis", "onPrepareFromUri", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "onRemoveQueueItemAt", "()Ljavax/net/ssl/X509TrustManager;", "Companion", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ThemeKtExternalSyntheticLambda3 implements Cloneable, toDownloadInfo.AudioAttributesCompatParcelizer, ActivityProviderModule.write {
    private final getLevel authenticator;
    private final getPlaybackUrlsEncrypt cache;
    private final int callTimeoutMillis;
    private final getSubscriptionDataProvider certificateChainCleaner;
    private final toLicenseLSModel certificatePinner;
    private final int connectTimeoutMillis;
    private final ResponseErrorException connectionPool;
    private final List<UserLoggedOutExceptionCompanion> connectionSpecs;
    private final AppTheme cookieJar;
    private final AppThemeManager dispatcher;
    private final AppThemePreviewProvider dns;
    private final AppThemeKt.RemoteActionCompatParcelizer eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<MarrowTheme> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<MarrowTheme> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<ThemeKtExternalSyntheticLambda1> protocols;
    private final Proxy proxy;
    private final getLevel proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final FragmentExtraModule routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<ThemeKtExternalSyntheticLambda1> DEFAULT_PROTOCOLS = FirebaseDataModule.IconCompatParcelizer(ThemeKtExternalSyntheticLambda1.HTTP_2, ThemeKtExternalSyntheticLambda1.HTTP_1_1);
    private static final List<UserLoggedOutExceptionCompanion> DEFAULT_CONNECTION_SPECS = FirebaseDataModule.IconCompatParcelizer(UserLoggedOutExceptionCompanion.MODERN_TLS, UserLoggedOutExceptionCompanion.CLEARTEXT);

    public ThemeKtExternalSyntheticLambda3(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws NoSuchAlgorithmException, KeyStoreException {
        RenewActivity onPlayFromMediaId;
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.dispatcher = audioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
        this.connectionPool = audioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer();
        this.interceptors = FirebaseDataModule.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler());
        this.networkInterceptors = FirebaseDataModule.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        this.eventListenerFactory = audioAttributesCompatParcelizer.getRatingCompat();
        this.retryOnConnectionFailure = audioAttributesCompatParcelizer.getOnPlay();
        this.authenticator = audioAttributesCompatParcelizer.getIconCompatParcelizer();
        this.followRedirects = audioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver();
        this.followSslRedirects = audioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem();
        this.cookieJar = audioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
        this.cache = audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        this.dns = audioAttributesCompatParcelizer.getMediaDescriptionCompat();
        this.proxy = audioAttributesCompatParcelizer.getOnMediaButtonEvent();
        if (audioAttributesCompatParcelizer.getOnMediaButtonEvent() != null) {
            onPlayFromMediaId = RenewActivity.INSTANCE;
        } else {
            onPlayFromMediaId = audioAttributesCompatParcelizer.getOnPlayFromMediaId();
            onPlayFromMediaId = onPlayFromMediaId == null ? ProxySelector.getDefault() : onPlayFromMediaId;
            if (onPlayFromMediaId == null) {
                onPlayFromMediaId = RenewActivity.INSTANCE;
            }
        }
        this.proxySelector = onPlayFromMediaId;
        this.proxyAuthenticator = audioAttributesCompatParcelizer.getOnPause();
        this.socketFactory = audioAttributesCompatParcelizer.getOnPrepareFromMediaId();
        List<UserLoggedOutExceptionCompanion> listAudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        this.connectionSpecs = listAudioAttributesImplApi21Parcelizer;
        this.protocols = audioAttributesCompatParcelizer.onMediaButtonEvent();
        this.hostnameVerifier = audioAttributesCompatParcelizer.getMediaMetadataCompat();
        this.callTimeoutMillis = audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        this.connectTimeoutMillis = audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver();
        this.readTimeoutMillis = audioAttributesCompatParcelizer.getOnFastForward();
        this.writeTimeoutMillis = audioAttributesCompatParcelizer.getOnPrepare();
        this.pingIntervalMillis = audioAttributesCompatParcelizer.getOnAddQueueItem();
        this.minWebSocketMessageToCompress = audioAttributesCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        FragmentExtraModule onPlayFromUri = audioAttributesCompatParcelizer.getOnPlayFromUri();
        this.routeDatabase = onPlayFromUri == null ? new FragmentExtraModule() : onPlayFromUri;
        List<UserLoggedOutExceptionCompanion> list = listAudioAttributesImplApi21Parcelizer;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = toLicenseLSModel.DEFAULT;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((UserLoggedOutExceptionCompanion) it.next()).getIsTls()) {
                    if (audioAttributesCompatParcelizer.getOnPlayFromSearch() != null) {
                        this.sslSocketFactoryOrNull = audioAttributesCompatParcelizer.getOnPlayFromSearch();
                        getSubscriptionDataProvider write = audioAttributesCompatParcelizer.getWrite();
                        toMagicModuleMetaRepoModel.write(write);
                        this.certificateChainCleaner = write;
                        X509TrustManager onPrepareFromSearch = audioAttributesCompatParcelizer.getOnPrepareFromSearch();
                        toMagicModuleMetaRepoModel.write(onPrepareFromSearch);
                        this.x509TrustManager = onPrepareFromSearch;
                        toLicenseLSModel read = audioAttributesCompatParcelizer.getRead();
                        toMagicModuleMetaRepoModel.write(write);
                        this.certificatePinner = read.IconCompatParcelizer(write);
                    } else {
                        SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                        X509TrustManager x509TrustManagerBs_ = SettingsItem.IconCompatParcelizer.write().bs_();
                        this.x509TrustManager = x509TrustManagerBs_;
                        SettingsItem.IconCompatParcelizer iconCompatParcelizer2 = SettingsItem.AudioAttributesCompatParcelizer;
                        SettingsItem settingsItemWrite = SettingsItem.IconCompatParcelizer.write();
                        toMagicModuleMetaRepoModel.write(x509TrustManagerBs_);
                        this.sslSocketFactoryOrNull = settingsItemWrite.AudioAttributesCompatParcelizer(x509TrustManagerBs_);
                        getSubscriptionDataProvider.Companion companion = getSubscriptionDataProvider.INSTANCE;
                        toMagicModuleMetaRepoModel.write(x509TrustManagerBs_);
                        getSubscriptionDataProvider getsubscriptiondataproviderRemoteActionCompatParcelizer = getSubscriptionDataProvider.Companion.RemoteActionCompatParcelizer(x509TrustManagerBs_);
                        this.certificateChainCleaner = getsubscriptiondataproviderRemoteActionCompatParcelizer;
                        toLicenseLSModel read2 = audioAttributesCompatParcelizer.getRead();
                        toMagicModuleMetaRepoModel.write(getsubscriptiondataproviderRemoteActionCompatParcelizer);
                        this.certificatePinner = read2.IconCompatParcelizer(getsubscriptiondataproviderRemoteActionCompatParcelizer);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = toLicenseLSModel.DEFAULT;
        }
        onRewind();
    }

    public Object clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final AppThemeManager getDispatcher() {
        return this.dispatcher;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final ResponseErrorException getConnectionPool() {
        return this.connectionPool;
    }

    public final List<MarrowTheme> onCustomAction() {
        return this.interceptors;
    }

    public final List<MarrowTheme> onPause() {
        return this.networkInterceptors;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final AppThemeKt.RemoteActionCompatParcelizer getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getLevel getAuthenticator() {
        return this.authenticator;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final AppTheme getCookieJar() {
        return this.cookieJar;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final getPlaybackUrlsEncrypt getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final AppThemePreviewProvider getDns() {
        return this.dns;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final getLevel getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory onRemoveQueueItem() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    public final List<UserLoggedOutExceptionCompanion> AudioAttributesImplApi26Parcelizer() {
        return this.connectionSpecs;
    }

    public final List<ThemeKtExternalSyntheticLambda1> onPlay() {
        return this.protocols;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final toLicenseLSModel getCertificatePinner() {
        return this.certificatePinner;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final getSubscriptionDataProvider getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final FragmentExtraModule getRouteDatabase() {
        return this.routeDatabase;
    }

    public ThemeKtExternalSyntheticLambda3() {
        this(new AudioAttributesCompatParcelizer());
    }

    private final void onRewind() {
        List<MarrowTheme> list = this.interceptors;
        toMagicModuleMetaRepoModel.read(list, "");
        if (list.contains(null)) {
            StringBuilder sb = new StringBuilder("Null interceptor: ");
            sb.append(this.interceptors);
            throw new IllegalStateException(sb.toString().toString());
        }
        List<MarrowTheme> list2 = this.networkInterceptors;
        toMagicModuleMetaRepoModel.read(list2, "");
        if (list2.contains(null)) {
            StringBuilder sb2 = new StringBuilder("Null network interceptor: ");
            sb2.append(this.networkInterceptors);
            throw new IllegalStateException(sb2.toString().toString());
        }
        List<UserLoggedOutExceptionCompanion> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((UserLoggedOutExceptionCompanion) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.certificatePinner, toLicenseLSModel.DEFAULT)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // o.toDownloadInfo.AudioAttributesCompatParcelizer
    public final toDownloadInfo IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new PlaybackDrmModule(this, p0, false);
    }

    public final AudioAttributesCompatParcelizer onPlayFromMediaId() {
        return new AudioAttributesCompatParcelizer(this);
    }

    @Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0012J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0014J\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0012J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\r\u0010\u0015J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0017¢\u0006\u0004\b\n\u0010\u0018J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\n\u0010\u0012R\u001c\u0010\b\u001a\u00020\u00198\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u0004\u0018\u00010\f8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001c\u0010\r\u001a\u00020 8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\r\u0010\"R\u001e\u0010\u001c\u001a\u0004\u0018\u00010#8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u001a\u001a\u00020'8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010)\u001a\u00020 8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b+\u0010\"R\u001c\u0010+\u001a\u00020,8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b.\u0010/R\"\u0010.\u001a\b\u0012\u0004\u0012\u000201008\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b3\u00104R\u001c\u00103\u001a\u0002058\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u001c\u0010%\u001a\u0002098\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010B\u001a\u00020=8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010>\u001a\u00020C8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\bB\u0010ER\u001c\u0010;\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b@\u0010F\u001a\u0004\b>\u0010GR\u001c\u0010@\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\bH\u0010GR\u001c\u00107\u001a\u00020I8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b7\u0010J\u001a\u0004\bK\u0010LR \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070M8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\bN\u00104R\u001c\u0010R\u001a\u00020\u000f8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bK\u0010O\u001a\u0004\bP\u0010QR \u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070M8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bP\u00102\u001a\u0004\bR\u00104R\u001c\u0010H\u001a\u00020 8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bR\u0010!\u001a\u0004\bS\u0010\"R\"\u0010P\u001a\b\u0012\u0004\u0012\u00020T008\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bU\u00104R\u001e\u0010U\u001a\u0004\u0018\u00010V8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bS\u0010W\u001a\u0004\bX\u0010YR\u001c\u0010S\u001a\u00020\u00198\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bZ\u0010\u001b\u001a\u0004\bZ\u0010\u001dR\u001e\u0010]\u001a\u0004\u0018\u00010[8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bU\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010Z\u001a\u00020 8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b]\u0010!\u001a\u0004\b_\u0010\"R\u001c\u0010X\u001a\u00020\u00138\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bX\u0010F\u001a\u0004\b`\u0010GR\u001e\u0010e\u001a\u0004\u0018\u00010a8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b`\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010`\u001a\u00020f8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bc\u0010g\u001a\u0004\bh\u0010iR\u001e\u0010_\u001a\u0004\u0018\u00010\u00168\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b_\u0010j\u001a\u0004\be\u0010kR\u001c\u0010c\u001a\u00020 8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bh\u0010!\u001a\u0004\bl\u0010\"R\u001e\u0010h\u001a\u0004\u0018\u00010\u00178\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\be\u0010m\u001a\u0004\bn\u0010o"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "", "Lo/ThemeKtExternalSyntheticLambda3;", "p0", "<init>", "(Lo/ThemeKtExternalSyntheticLambda3;)V", "()V", "Lo/MarrowTheme;", "IconCompatParcelizer", "(Lo/MarrowTheme;)Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/ThemeKtExternalSyntheticLambda3;", "Lo/getPlaybackUrlsEncrypt;", "AudioAttributesCompatParcelizer", "(Lo/getPlaybackUrlsEncrypt;)Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "", "Ljava/util/concurrent/TimeUnit;", "p1", "(JLjava/util/concurrent/TimeUnit;)Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "", "()Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "(Z)Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lo/ThemeKtExternalSyntheticLambda3$AudioAttributesCompatParcelizer;", "Lo/getLevel;", "read", "Lo/getLevel;", "write", "()Lo/getLevel;", "Lo/getPlaybackUrlsEncrypt;", "()Lo/getPlaybackUrlsEncrypt;", "", "I", "()I", "Lo/getSubscriptionDataProvider;", "Lo/getSubscriptionDataProvider;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/getSubscriptionDataProvider;", "Lo/toLicenseLSModel;", "Lo/toLicenseLSModel;", "MediaBrowserCompatItemReceiver", "()Lo/toLicenseLSModel;", "AudioAttributesImplBaseParcelizer", "Lo/ResponseErrorException;", "Lo/ResponseErrorException;", "AudioAttributesImplApi26Parcelizer", "()Lo/ResponseErrorException;", "", "Lo/UserLoggedOutExceptionCompanion;", "Ljava/util/List;", "AudioAttributesImplApi21Parcelizer", "()Ljava/util/List;", "Lo/AppTheme;", "Lo/AppTheme;", "MediaMetadataCompat", "()Lo/AppTheme;", "Lo/AppThemeManager;", "Lo/AppThemeManager;", "MediaBrowserCompatSearchResultReceiver", "()Lo/AppThemeManager;", "Lo/AppThemePreviewProvider;", "RatingCompat", "Lo/AppThemePreviewProvider;", "MediaBrowserCompatMediaItem", "()Lo/AppThemePreviewProvider;", "MediaDescriptionCompat", "Lo/AppThemeKt$RemoteActionCompatParcelizer;", "Lo/AppThemeKt$RemoteActionCompatParcelizer;", "()Lo/AppThemeKt$RemoteActionCompatParcelizer;", "Z", "()Z", "onAddQueueItem", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "onCustomAction", "()Ljavax/net/ssl/HostnameVerifier;", "", "handleMediaPlayPauseIfPendingOnHandler", "J", "onCommand", "()J", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPause", "Lo/ThemeKtExternalSyntheticLambda1;", "onMediaButtonEvent", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "onPlay", "()Ljava/net/Proxy;", "onFastForward", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "onPlayFromMediaId", "()Ljava/net/ProxySelector;", "onPlayFromSearch", "onPrepareFromMediaId", "Lo/FragmentExtraModule;", "Lo/FragmentExtraModule;", "onPrepare", "()Lo/FragmentExtraModule;", "onPlayFromUri", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "onPrepareFromSearch", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "onRewind", "Ljavax/net/ssl/X509TrustManager;", "onRemoveQueueItemAt", "()Ljavax/net/ssl/X509TrustManager;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private toLicenseLSModel read;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private AppThemeManager MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private AppTheme AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private int MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private getSubscriptionDataProvider write;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private List<UserLoggedOutExceptionCompanion> AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private ResponseErrorException AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private boolean MediaBrowserCompatSearchResultReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private boolean MediaBrowserCompatMediaItem;

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
        private int onAddQueueItem;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private AppThemeKt.RemoteActionCompatParcelizer RatingCompat;
        private HostnameVerifier MediaMetadataCompat;

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private AppThemePreviewProvider MediaDescriptionCompat;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private int AudioAttributesCompatParcelizer;
        private final List<MarrowTheme> handleMediaPlayPauseIfPendingOnHandler;

        /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
        private List<? extends ThemeKtExternalSyntheticLambda1> onCommand;

        /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
        private final List<MarrowTheme> onCustomAction;

        /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
        private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

        /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
        private getLevel onPause;

        /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
        private ProxySelector onPlayFromMediaId;

        /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
        private Proxy onMediaButtonEvent;
        private boolean onPlay;

        /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
        private int onFastForward;
        private SSLSocketFactory onPlayFromSearch;

        /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
        private X509TrustManager onPrepareFromSearch;

        /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
        private SocketFactory onPrepareFromMediaId;

        /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
        private FragmentExtraModule onPlayFromUri;

        /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
        private int onPrepare;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private getLevel IconCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private getPlaybackUrlsEncrypt RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer() {
            this.MediaBrowserCompatCustomActionResultReceiver = new AppThemeManager();
            this.AudioAttributesImplBaseParcelizer = new ResponseErrorException();
            this.handleMediaPlayPauseIfPendingOnHandler = new ArrayList();
            this.onCustomAction = new ArrayList();
            this.RatingCompat = FirebaseDataModule.write(AppThemeKt.NONE);
            this.onPlay = true;
            this.IconCompatParcelizer = getLevel.NONE;
            this.MediaBrowserCompatSearchResultReceiver = true;
            this.MediaBrowserCompatMediaItem = true;
            this.AudioAttributesImplApi21Parcelizer = AppTheme.NO_COOKIES;
            this.MediaDescriptionCompat = AppThemePreviewProvider.SYSTEM;
            this.onPause = getLevel.NONE;
            SocketFactory socketFactory = SocketFactory.getDefault();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(socketFactory, "");
            this.onPrepareFromMediaId = socketFactory;
            Companion companion = ThemeKtExternalSyntheticLambda3.INSTANCE;
            this.AudioAttributesImplApi26Parcelizer = Companion.RemoteActionCompatParcelizer();
            Companion companion2 = ThemeKtExternalSyntheticLambda3.INSTANCE;
            this.onCommand = Companion.read();
            this.MediaMetadataCompat = BookmarkTimelineModelController.INSTANCE;
            this.read = toLicenseLSModel.DEFAULT;
            this.MediaBrowserCompatItemReceiver = 10000;
            this.onFastForward = 10000;
            this.onPrepare = 10000;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1024L;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
        public final AppThemeManager getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final ResponseErrorException getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final List<MarrowTheme> handleMediaPlayPauseIfPendingOnHandler() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final List<MarrowTheme> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.onCustomAction;
        }

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
        public final AppThemeKt.RemoteActionCompatParcelizer getRatingCompat() {
            return this.RatingCompat;
        }

        /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
        public final boolean getOnPlay() {
            return this.onPlay;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final getLevel getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: RatingCompat, reason: from getter */
        public final boolean getMediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final boolean getMediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatMediaItem;
        }

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
        public final AppTheme getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final getPlaybackUrlsEncrypt getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
        public final AppThemePreviewProvider getMediaDescriptionCompat() {
            return this.MediaDescriptionCompat;
        }

        /* JADX INFO: renamed from: onPlay, reason: from getter */
        public final Proxy getOnMediaButtonEvent() {
            return this.onMediaButtonEvent;
        }

        /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
        public final ProxySelector getOnPlayFromMediaId() {
            return this.onPlayFromMediaId;
        }

        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final getLevel getOnPause() {
            return this.onPause;
        }

        /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
        public final SocketFactory getOnPrepareFromMediaId() {
            return this.onPrepareFromMediaId;
        }

        /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
        public final SSLSocketFactory getOnPlayFromSearch() {
            return this.onPlayFromSearch;
        }

        /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
        public final X509TrustManager getOnPrepareFromSearch() {
            return this.onPrepareFromSearch;
        }

        public final List<UserLoggedOutExceptionCompanion> AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final List<ThemeKtExternalSyntheticLambda1> onMediaButtonEvent() {
            return this.onCommand;
        }

        /* JADX INFO: renamed from: onCustomAction, reason: from getter */
        public final HostnameVerifier getMediaMetadataCompat() {
            return this.MediaMetadataCompat;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final toLicenseLSModel getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final getSubscriptionDataProvider getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final int getMediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
        public final int getOnFastForward() {
            return this.onFastForward;
        }

        /* JADX INFO: renamed from: onRewind, reason: from getter */
        public final int getOnPrepare() {
            return this.onPrepare;
        }

        /* JADX INFO: renamed from: onPause, reason: from getter */
        public final int getOnAddQueueItem() {
            return this.onAddQueueItem;
        }

        /* JADX INFO: renamed from: onCommand, reason: from getter */
        public final long getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        /* JADX INFO: renamed from: onPrepare, reason: from getter */
        public final FragmentExtraModule getOnPlayFromUri() {
            return this.onPlayFromUri;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3) {
            this();
            toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda3, "");
            this.MediaBrowserCompatCustomActionResultReceiver = themeKtExternalSyntheticLambda3.getDispatcher();
            this.AudioAttributesImplBaseParcelizer = themeKtExternalSyntheticLambda3.getConnectionPool();
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) this.handleMediaPlayPauseIfPendingOnHandler, (Iterable) themeKtExternalSyntheticLambda3.onCustomAction());
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) this.onCustomAction, (Iterable) themeKtExternalSyntheticLambda3.onPause());
            this.RatingCompat = themeKtExternalSyntheticLambda3.getEventListenerFactory();
            this.onPlay = themeKtExternalSyntheticLambda3.getRetryOnConnectionFailure();
            this.IconCompatParcelizer = themeKtExternalSyntheticLambda3.getAuthenticator();
            this.MediaBrowserCompatSearchResultReceiver = themeKtExternalSyntheticLambda3.getFollowRedirects();
            this.MediaBrowserCompatMediaItem = themeKtExternalSyntheticLambda3.getFollowSslRedirects();
            this.AudioAttributesImplApi21Parcelizer = themeKtExternalSyntheticLambda3.getCookieJar();
            this.RemoteActionCompatParcelizer = themeKtExternalSyntheticLambda3.getCache();
            this.MediaDescriptionCompat = themeKtExternalSyntheticLambda3.getDns();
            this.onMediaButtonEvent = themeKtExternalSyntheticLambda3.getProxy();
            this.onPlayFromMediaId = themeKtExternalSyntheticLambda3.getProxySelector();
            this.onPause = themeKtExternalSyntheticLambda3.getProxyAuthenticator();
            this.onPrepareFromMediaId = themeKtExternalSyntheticLambda3.getSocketFactory();
            this.onPlayFromSearch = themeKtExternalSyntheticLambda3.sslSocketFactoryOrNull;
            this.onPrepareFromSearch = themeKtExternalSyntheticLambda3.getX509TrustManager();
            this.AudioAttributesImplApi26Parcelizer = themeKtExternalSyntheticLambda3.AudioAttributesImplApi26Parcelizer();
            this.onCommand = themeKtExternalSyntheticLambda3.onPlay();
            this.MediaMetadataCompat = themeKtExternalSyntheticLambda3.getHostnameVerifier();
            this.read = themeKtExternalSyntheticLambda3.getCertificatePinner();
            this.write = themeKtExternalSyntheticLambda3.getCertificateChainCleaner();
            this.AudioAttributesCompatParcelizer = themeKtExternalSyntheticLambda3.getCallTimeoutMillis();
            this.MediaBrowserCompatItemReceiver = themeKtExternalSyntheticLambda3.getConnectTimeoutMillis();
            this.onFastForward = themeKtExternalSyntheticLambda3.getReadTimeoutMillis();
            this.onPrepare = themeKtExternalSyntheticLambda3.getWriteTimeoutMillis();
            this.onAddQueueItem = themeKtExternalSyntheticLambda3.getPingIntervalMillis();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = themeKtExternalSyntheticLambda3.getMinWebSocketMessageToCompress();
            this.onPlayFromUri = themeKtExternalSyntheticLambda3.getRouteDatabase();
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(MarrowTheme p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.handleMediaPlayPauseIfPendingOnHandler.add(p0);
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(boolean p0) {
            this.onPlay = p0;
            return this;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer() {
            this.MediaBrowserCompatMediaItem = false;
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getPlaybackUrlsEncrypt p0) {
            this.RemoteActionCompatParcelizer = p0;
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(SSLSocketFactory p0, X509TrustManager p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.onPlayFromSearch) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, this.onPrepareFromSearch)) {
                this.onPlayFromUri = null;
            }
            this.onPlayFromSearch = p0;
            getSubscriptionDataProvider.Companion companion = getSubscriptionDataProvider.INSTANCE;
            this.write = getSubscriptionDataProvider.Companion.RemoteActionCompatParcelizer(p1);
            this.onPrepareFromSearch = p1;
            return this;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(long p0, TimeUnit p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            this.MediaBrowserCompatItemReceiver = FirebaseDataModule.IconCompatParcelizer("timeout", p0, p1);
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(long p0, TimeUnit p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            this.onFastForward = FirebaseDataModule.IconCompatParcelizer("timeout", p0, p1);
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(long p0, TimeUnit p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            this.onPrepare = FirebaseDataModule.IconCompatParcelizer("timeout", p0, p1);
            return this;
        }

        public final ThemeKtExternalSyntheticLambda3 RemoteActionCompatParcelizer() {
            return new ThemeKtExternalSyntheticLambda3(this);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda3$Companion;", "", "<init>", "()V", "", "Lo/UserLoggedOutExceptionCompanion;", "DEFAULT_CONNECTION_SPECS", "Ljava/util/List;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "Lo/ThemeKtExternalSyntheticLambda1;", "DEFAULT_PROTOCOLS", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<ThemeKtExternalSyntheticLambda1> read() {
            return ThemeKtExternalSyntheticLambda3.DEFAULT_PROTOCOLS;
        }

        public static List<UserLoggedOutExceptionCompanion> RemoteActionCompatParcelizer() {
            return ThemeKtExternalSyntheticLambda3.DEFAULT_CONNECTION_SPECS;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
