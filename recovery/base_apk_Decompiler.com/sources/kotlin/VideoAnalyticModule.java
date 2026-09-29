package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.BlockingViewModel_HiltModulesKeyModule;
import kotlin.C0156TypeKt;
import kotlin.Metadata;
import kotlin.SettingsItem;
import kotlin.ThemeKt;
import kotlin.ThemeKtExternalSyntheticLambda0;
import kotlin.ThemeKtExternalSyntheticLambda1;
import kotlin.toLicenseLSModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 s2\u00020\u00012\u00020\u0002:\u0001sB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\n\u0010\u0019J'\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000f\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u000f\u0010 J7\u0010!\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J1\u0010\u001c\u001a\u0004\u0018\u00010#2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010$J\u000f\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0000¢\u0006\u0004\b+\u0010\u000bJ'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020,2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010-H\u0000¢\u0006\u0004\b\u001c\u0010.J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b!\u0010/J\u001f\u0010!\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u000200H\u0000¢\u0006\u0004\b!\u00102J\u000f\u00103\u001a\u00020\tH\u0000¢\u0006\u0004\b3\u0010\u000bJ\u000f\u00104\u001a\u00020\tH\u0000¢\u0006\u0004\b4\u0010\u000bJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0004\u001a\u0002052\u0006\u0010\u0006\u001a\u000206H\u0016¢\u0006\u0004\b!\u00107J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0004\u001a\u000208H\u0016¢\u0006\u0004\b!\u00109J\u000f\u0010!\u001a\u00020:H\u0016¢\u0006\u0004\b!\u0010;J\u000f\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010\n\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050-H\u0002¢\u0006\u0004\b\n\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010BJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ!\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020G2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\n\u0010HR\u0016\u0010I\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR#\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0L0K8\u0007¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b\u001c\u0010OR\u0014\u0010P\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\b\u000f\u0010Y\"\u0004\b\n\u0010ZR\u0014\u0010\u001c\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010_\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010^\u001a\u0004\b'\u0010\\\"\u0004\b`\u0010\u000bR\u0018\u0010a\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010JR\u0014\u0010f\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010h\u001a\u00020\u00118\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bh\u0010J\u001a\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010dR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010J"}, d2 = {"Lo/VideoAnalyticModule;", "Lo/BlockingViewModel_HiltModulesKeyModule$IconCompatParcelizer;", "Lo/UserLoggedOutException;", "Lo/ResourceProviderModule;", "p0", "Lo/ActivityPresenterModule;", "p1", "<init>", "(Lo/ResourceProviderModule;Lo/ActivityPresenterModule;)V", "", "AudioAttributesCompatParcelizer", "()V", "Lo/ThemeAlphaConstantsKt;", "Lo/ThemeKt;", "", "write", "(Lo/ThemeAlphaConstantsKt;Lo/ThemeKt;)Z", "", "p2", "p3", "p4", "Lo/toDownloadInfo;", "p5", "Lo/AppThemeKt;", "p6", "(IIIIZLo/toDownloadInfo;Lo/AppThemeKt;)V", "Lo/ThemeKtExternalSyntheticLambda3;", "Ljava/io/IOException;", "read", "(Lo/ThemeKtExternalSyntheticLambda3;Lo/ActivityPresenterModule;Ljava/io/IOException;)V", "(IILo/toDownloadInfo;)V", "Lo/UserModule;", "(Lo/UserModule;)V", "RemoteActionCompatParcelizer", "(IIILo/toDownloadInfo;Lo/AppThemeKt;)V", "Lo/ThemeKtExternalSyntheticLambda0;", "(IILo/ThemeKtExternalSyntheticLambda0;Lo/ThemeAlphaConstantsKt;)Lo/ThemeKtExternalSyntheticLambda0;", "MediaDescriptionCompat", "()Lo/ThemeKtExternalSyntheticLambda0;", "IconCompatParcelizer", "(Lo/UserModule;ILo/toDownloadInfo;)V", "AudioAttributesImplBaseParcelizer", "()Lo/ThemeKt;", "AudioAttributesImplApi21Parcelizer", "Lo/VideoOfflineDbModel;", "", "(Lo/VideoOfflineDbModel;Ljava/util/List;)Z", "(Z)Z", "Lo/BaseDaggerFragment;", "Lo/ServiceProviderModule;", "(Lo/ThemeKtExternalSyntheticLambda3;Lo/BaseDaggerFragment;)Lo/ServiceProviderModule;", "MediaBrowserCompatCustomActionResultReceiver", "MediaMetadataCompat", "Lo/BlockingViewModel_HiltModulesKeyModule;", "Lo/getTimelineAdapter;", "(Lo/BlockingViewModel_HiltModulesKeyModule;Lo/getTimelineAdapter;)V", "Lo/setTimelineAdapter;", "(Lo/setTimelineAdapter;)V", "Lo/ThemeKtExternalSyntheticLambda1;", "()Lo/ThemeKtExternalSyntheticLambda1;", "MediaBrowserCompatMediaItem", "()Lo/ActivityPresenterModule;", "(Ljava/util/List;)Z", "Ljava/net/Socket;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/net/Socket;", "(I)V", "(Lo/ThemeAlphaConstantsKt;)Z", "", "toString", "()Ljava/lang/String;", "Lo/PlaybackDrmModule;", "(Lo/PlaybackDrmModule;Ljava/io/IOException;)V", "allocationLimit", "I", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "()Ljava/util/List;", "connectionPool", "Lo/ResourceProviderModule;", "handshake", "Lo/ThemeKt;", "http2Connection", "Lo/BlockingViewModel_HiltModulesKeyModule;", "", "idleAtNs", "J", "()J", "(J)V", "MediaBrowserCompatItemReceiver", "()Z", "noCoalescedConnections", "Z", "noNewExchanges", "RatingCompat", "protocol", "Lo/ThemeKtExternalSyntheticLambda1;", "rawSocket", "Ljava/net/Socket;", "refusedStreamCount", "route", "Lo/ActivityPresenterModule;", "routeFailureCount", "AudioAttributesImplApi26Parcelizer", "()I", "Lo/LessonCompletedDialogonViewCreatedllm1;", "sink", "Lo/LessonCompletedDialogonViewCreatedllm1;", "socket", "Lo/LessonCompletedDialog;", "source", "Lo/LessonCompletedDialog;", "successCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoAnalyticModule extends BlockingViewModel_HiltModulesKeyModule.IconCompatParcelizer implements UserLoggedOutException {
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<PlaybackDrmModule>> calls;
    private final ResourceProviderModule connectionPool;
    private ThemeKt handshake;
    private BlockingViewModel_HiltModulesKeyModule http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private ThemeKtExternalSyntheticLambda1 protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final ActivityPresenterModule route;
    private int routeFailureCount;
    private LessonCompletedDialogonViewCreatedllm1 sink;
    private Socket socket;
    private LessonCompletedDialog source;
    private int successCount;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    public VideoAnalyticModule(ResourceProviderModule resourceProviderModule, ActivityPresenterModule activityPresenterModule) {
        toMagicModuleMetaRepoModel.write(resourceProviderModule, "");
        toMagicModuleMetaRepoModel.write(activityPresenterModule, "");
        this.connectionPool = resourceProviderModule;
        this.route = activityPresenterModule;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final void RatingCompat() {
        this.noNewExchanges = true;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    public final List<Reference<PlaybackDrmModule>> read() {
        return this.calls;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.idleAtNs = j;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.http2Connection != null;
    }

    public final void MediaMetadataCompat() {
        synchronized (this) {
            this.noNewExchanges = true;
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this) {
            this.noCoalescedConnections = true;
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        synchronized (this) {
            this.successCount++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(int r14, int r15, int r16, int r17, boolean r18, kotlin.toDownloadInfo r19, kotlin.AppThemeKt r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoAnalyticModule.AudioAttributesCompatParcelizer(int, int, int, int, boolean, o.toDownloadInfo, o.AppThemeKt):void");
    }

    private final void RemoteActionCompatParcelizer(int p0, int p1, int p2, toDownloadInfo p3, AppThemeKt p4) throws IOException {
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0MediaDescriptionCompat = MediaDescriptionCompat();
        ThemeAlphaConstantsKt url = themeKtExternalSyntheticLambda0MediaDescriptionCompat.getUrl();
        for (int i = 0; i < 21; i++) {
            write(p0, p1, p3);
            themeKtExternalSyntheticLambda0MediaDescriptionCompat = read(p1, p2, themeKtExternalSyntheticLambda0MediaDescriptionCompat, url);
            if (themeKtExternalSyntheticLambda0MediaDescriptionCompat == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                FirebaseDataModule.read(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            AppThemeKt.write(p3, this.route.getSocketAddress(), this.route.getProxy());
        }
    }

    private final void write(int i, int i2, toDownloadInfo todownloadinfo) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.getProxy();
        VideoOfflineDbModel address = this.route.getAddress();
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : read.write[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = address.getSocketFactory().createSocket();
            toMagicModuleMetaRepoModel.write(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        AppThemeKt.read(todownloadinfo, this.route.getSocketAddress(), proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
            SettingsItem.IconCompatParcelizer.write().read(socketCreateSocket, this.route.getSocketAddress(), i);
            try {
                this.source = CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.IconCompatParcelizer(socketCreateSocket));
                this.sink = CustomAppBarLayout.read(CustomAppBarLayout.read(socketCreateSocket));
            } catch (NullPointerException e) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) e.getMessage(), (Object) NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.route.getSocketAddress());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void IconCompatParcelizer(UserModule userModule, int i, toDownloadInfo todownloadinfo) throws Throwable {
        if (this.route.getAddress().getSslSocketFactory() == null) {
            if (this.route.getAddress().AudioAttributesCompatParcelizer().contains(ThemeKtExternalSyntheticLambda1.H2_PRIOR_KNOWLEDGE)) {
                this.socket = this.rawSocket;
                this.protocol = ThemeKtExternalSyntheticLambda1.H2_PRIOR_KNOWLEDGE;
                read(i);
                return;
            } else {
                this.socket = this.rawSocket;
                this.protocol = ThemeKtExternalSyntheticLambda1.HTTP_1_1;
                return;
            }
        }
        AppThemeKt.MediaDescriptionCompat(todownloadinfo);
        write(userModule);
        AppThemeKt.MediaBrowserCompatMediaItem(todownloadinfo);
        if (this.protocol == ThemeKtExternalSyntheticLambda1.HTTP_2) {
            read(i);
        }
    }

    private final void read(int p0) throws IOException {
        Socket socket = this.socket;
        toMagicModuleMetaRepoModel.write(socket);
        LessonCompletedDialog lessonCompletedDialog = this.source;
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog);
        LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.sink;
        toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
        socket.setSoTimeout(0);
        BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModuleIconCompatParcelizer = new BlockingViewModel_HiltModulesKeyModule.RemoteActionCompatParcelizer(SyncModule.INSTANCE).IconCompatParcelizer(socket, this.route.getAddress().getUrl().getHost(), lessonCompletedDialog, lessonCompletedDialogonViewCreatedllm1).IconCompatParcelizer(this).AudioAttributesCompatParcelizer(p0).IconCompatParcelizer();
        this.http2Connection = blockingViewModel_HiltModulesKeyModuleIconCompatParcelizer;
        BlockingViewModel_HiltModulesKeyModule.Companion companion = BlockingViewModel_HiltModulesKeyModule.INSTANCE;
        this.allocationLimit = BlockingViewModel_HiltModulesKeyModule.Companion.AudioAttributesCompatParcelizer().IconCompatParcelizer();
        blockingViewModel_HiltModulesKeyModuleIconCompatParcelizer.AudioAttributesCompatParcelizer(true, SyncModule.INSTANCE);
    }

    private final void write(UserModule p0) throws Throwable {
        ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1;
        VideoOfflineDbModel address = this.route.getAddress();
        SSLSocketFactory sslSocketFactory = address.getSslSocketFactory();
        SSLSocket sSLSocket = null;
        String strAudioAttributesCompatParcelizer = null;
        try {
            toMagicModuleMetaRepoModel.write(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.getUrl().getHost(), address.getUrl().getPort(), true);
            toMagicModuleMetaRepoModel.read(socketCreateSocket, "");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                UserLoggedOutExceptionCompanion userLoggedOutExceptionCompanionIconCompatParcelizer = p0.IconCompatParcelizer(sSLSocket2);
                if (userLoggedOutExceptionCompanionIconCompatParcelizer.getSupportsTlsExtensions()) {
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write().RemoteActionCompatParcelizer(sSLSocket2, address.getUrl().getHost(), address.AudioAttributesCompatParcelizer());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                ThemeKt.Companion companion = ThemeKt.INSTANCE;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(session, "");
                ThemeKt themeKtAudioAttributesCompatParcelizer = ThemeKt.Companion.AudioAttributesCompatParcelizer(session);
                HostnameVerifier hostnameVerifier = address.getHostnameVerifier();
                toMagicModuleMetaRepoModel.write(hostnameVerifier);
                if (hostnameVerifier.verify(address.getUrl().getHost(), session)) {
                    toLicenseLSModel certificatePinner = address.getCertificatePinner();
                    toMagicModuleMetaRepoModel.write(certificatePinner);
                    this.handshake = new ThemeKt(themeKtAudioAttributesCompatParcelizer.getTlsVersion(), themeKtAudioAttributesCompatParcelizer.getCipherSuite(), themeKtAudioAttributesCompatParcelizer.IconCompatParcelizer(), new AnonymousClass3(certificatePinner, themeKtAudioAttributesCompatParcelizer, address));
                    certificatePinner.RemoteActionCompatParcelizer(address.getUrl().getHost(), new AnonymousClass5());
                    if (userLoggedOutExceptionCompanionIconCompatParcelizer.getSupportsTlsExtensions()) {
                        SettingsItem.IconCompatParcelizer iconCompatParcelizer2 = SettingsItem.AudioAttributesCompatParcelizer;
                        strAudioAttributesCompatParcelizer = SettingsItem.IconCompatParcelizer.write().AudioAttributesCompatParcelizer(sSLSocket2);
                    }
                    this.socket = sSLSocket2;
                    this.source = CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.IconCompatParcelizer(sSLSocket2));
                    this.sink = CustomAppBarLayout.read(CustomAppBarLayout.read(sSLSocket2));
                    if (strAudioAttributesCompatParcelizer != null) {
                        ThemeKtExternalSyntheticLambda1.Companion companion2 = ThemeKtExternalSyntheticLambda1.INSTANCE;
                        themeKtExternalSyntheticLambda1 = ThemeKtExternalSyntheticLambda1.Companion.read(strAudioAttributesCompatParcelizer);
                    } else {
                        themeKtExternalSyntheticLambda1 = ThemeKtExternalSyntheticLambda1.HTTP_1_1;
                    }
                    this.protocol = themeKtExternalSyntheticLambda1;
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer3 = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write().write(sSLSocket2);
                    return;
                }
                List<Certificate> list = themeKtAudioAttributesCompatParcelizer.read();
                if (list.isEmpty()) {
                    StringBuilder sb = new StringBuilder("Hostname ");
                    sb.append(address.getUrl().getHost());
                    sb.append(" not verified (no certificates)");
                    throw new SSLPeerUnverifiedException(sb.toString());
                }
                Certificate certificate = list.get(0);
                toMagicModuleMetaRepoModel.read(certificate, "");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(address.getUrl().getHost());
                sb2.append(" not verified:\n              |    certificate: ");
                toLicenseLSModel.Companion companion3 = toLicenseLSModel.INSTANCE;
                sb2.append(toLicenseLSModel.Companion.read((Certificate) x509Certificate));
                sb2.append("\n              |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                BookmarkTimelineModelController bookmarkTimelineModelController = BookmarkTimelineModelController.INSTANCE;
                sb2.append(BookmarkTimelineModelController.write(x509Certificate));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(TestGroupLSModel.RemoteActionCompatParcelizer(sb2.toString(), "|"));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer4 = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write().write(sSLSocket);
                }
                if (sSLSocket != null) {
                    FirebaseDataModule.read((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: o.VideoAnalyticModule$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends Certificate>> {
        private /* synthetic */ VideoOfflineDbModel $AudioAttributesCompatParcelizer;
        private /* synthetic */ toLicenseLSModel $RemoteActionCompatParcelizer;
        private /* synthetic */ ThemeKt $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            getSubscriptionDataProvider getsubscriptiondataproviderRemoteActionCompatParcelizer = this.$RemoteActionCompatParcelizer.getCertificateChainCleaner();
            toMagicModuleMetaRepoModel.write(getsubscriptiondataproviderRemoteActionCompatParcelizer);
            return getsubscriptiondataproviderRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.$write.read(), this.$AudioAttributesCompatParcelizer.getUrl().getHost());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(toLicenseLSModel tolicenselsmodel, ThemeKt themeKt, VideoOfflineDbModel videoOfflineDbModel) {
            super(0);
            this.$RemoteActionCompatParcelizer = tolicenselsmodel;
            this.$write = themeKt;
            this.$AudioAttributesCompatParcelizer = videoOfflineDbModel;
        }
    }

    /* JADX INFO: renamed from: o.VideoAnalyticModule$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "write", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends X509Certificate>> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            ThemeKt themeKt = VideoAnalyticModule.this.handshake;
            toMagicModuleMetaRepoModel.write(themeKt);
            List<Certificate> list = themeKt.read();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (Certificate certificate : list) {
                toMagicModuleMetaRepoModel.read(certificate, "");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }

        AnonymousClass5() {
            super(0);
        }
    }

    private final ThemeKtExternalSyntheticLambda0 read(int p0, int p1, ThemeKtExternalSyntheticLambda0 p2, ThemeAlphaConstantsKt p3) throws IOException {
        StringBuilder sb = new StringBuilder("CONNECT ");
        sb.append(FirebaseDataModule.write(p3, true));
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        while (true) {
            LessonCompletedDialog lessonCompletedDialog = this.source;
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog);
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.sink;
            toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
            onPaymentSuccess onpaymentsuccess = new onPaymentSuccess(null, this, lessonCompletedDialog, lessonCompletedDialogonViewCreatedllm1);
            lessonCompletedDialog.RemoteActionCompatParcelizer().read(p0, TimeUnit.MILLISECONDS);
            lessonCompletedDialogonViewCreatedllm1.RemoteActionCompatParcelizer().read(p1, TimeUnit.MILLISECONDS);
            onpaymentsuccess.read(p2.getHeaders(), string);
            onpaymentsuccess.RemoteActionCompatParcelizer();
            C0156TypeKt.IconCompatParcelizer iconCompatParcelizerWrite = onpaymentsuccess.write(false);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizerWrite);
            C0156TypeKt c0156TypeKtIconCompatParcelizer = iconCompatParcelizerWrite.read(p2).IconCompatParcelizer();
            onpaymentsuccess.write(c0156TypeKtIconCompatParcelizer);
            int code = c0156TypeKtIconCompatParcelizer.getCode();
            if (code == 200) {
                if (lessonCompletedDialog.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatCustomActionResultReceiver() && lessonCompletedDialogonViewCreatedllm1.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatCustomActionResultReceiver()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (code == 407) {
                ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer = this.route.getAddress().getProxyAuthenticator().RemoteActionCompatParcelizer(this.route, c0156TypeKtIconCompatParcelizer);
                if (themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (TestGroupLSModel.read("close", C0156TypeKt.IconCompatParcelizer(c0156TypeKtIconCompatParcelizer, RtspHeaders.CONNECTION), true)) {
                    return themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer;
                }
                p2 = themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer;
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected response code for CONNECT: ");
                sb2.append(c0156TypeKtIconCompatParcelizer.getCode());
                throw new IOException(sb2.toString());
            }
        }
    }

    private final ThemeKtExternalSyntheticLambda0 MediaDescriptionCompat() throws IOException {
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer = new ThemeKtExternalSyntheticLambda0.IconCompatParcelizer().write(this.route.getAddress().getUrl()).AudioAttributesCompatParcelizer("CONNECT", (ThemeKtExternalSyntheticLambda2) null).AudioAttributesCompatParcelizer("Host", FirebaseDataModule.write(this.route.getAddress().getUrl(), true)).AudioAttributesCompatParcelizer("Proxy-Connection", "Keep-Alive").AudioAttributesCompatParcelizer(RtspHeaders.USER_AGENT, "okhttp/4.12.0").RemoteActionCompatParcelizer();
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer2 = this.route.getAddress().getProxyAuthenticator().RemoteActionCompatParcelizer(this.route, new C0156TypeKt.IconCompatParcelizer().read(themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer).read(ThemeKtExternalSyntheticLambda1.HTTP_1_1).read(407).write("Preemptive Authenticate").write(FirebaseDataModule.read).AudioAttributesCompatParcelizer(-1L).IconCompatParcelizer(-1L).IconCompatParcelizer(RtspHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").IconCompatParcelizer());
        return themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer2 == null ? themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer : themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer2;
    }

    private final boolean AudioAttributesCompatParcelizer(List<ActivityPresenterModule> p0) {
        List<ActivityPresenterModule> list = p0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ActivityPresenterModule activityPresenterModule : list) {
            if (activityPresenterModule.getProxy().type() == Proxy.Type.DIRECT && this.route.getProxy().type() == Proxy.Type.DIRECT && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.route.getSocketAddress(), activityPresenterModule.getSocketAddress())) {
                return true;
            }
        }
        return false;
    }

    private static boolean write(ThemeAlphaConstantsKt p0, ThemeKt p1) {
        List<Certificate> list = p1.read();
        if (!list.isEmpty()) {
            BookmarkTimelineModelController bookmarkTimelineModelController = BookmarkTimelineModelController.INSTANCE;
            String host = p0.getHost();
            Certificate certificate = list.get(0);
            toMagicModuleMetaRepoModel.read(certificate, "");
            if (bookmarkTimelineModelController.write(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    public final ServiceProviderModule RemoteActionCompatParcelizer(ThemeKtExternalSyntheticLambda3 p0, BaseDaggerFragment p1) throws SocketException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Socket socket = this.socket;
        toMagicModuleMetaRepoModel.write(socket);
        LessonCompletedDialog lessonCompletedDialog = this.source;
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog);
        LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.sink;
        toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
        BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule = this.http2Connection;
        if (blockingViewModel_HiltModulesKeyModule != null) {
            return new BlockingViewModel(p0, this, p1, blockingViewModel_HiltModulesKeyModule);
        }
        socket.setSoTimeout(p1.AudioAttributesImplBaseParcelizer());
        lessonCompletedDialog.RemoteActionCompatParcelizer().read(p1.AudioAttributesImplApi26Parcelizer(), TimeUnit.MILLISECONDS);
        lessonCompletedDialogonViewCreatedllm1.RemoteActionCompatParcelizer().read(p1.MediaBrowserCompatCustomActionResultReceiver(), TimeUnit.MILLISECONDS);
        return new onPaymentSuccess(p0, this, lessonCompletedDialog, lessonCompletedDialogonViewCreatedllm1);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final ActivityPresenterModule getRoute() {
        return this.route;
    }

    public final void AudioAttributesCompatParcelizer() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            FirebaseDataModule.read(socket);
        }
    }

    public final Socket MediaBrowserCompatSearchResultReceiver() {
        Socket socket = this.socket;
        toMagicModuleMetaRepoModel.write(socket);
        return socket;
    }

    @Override // o.BlockingViewModel_HiltModulesKeyModule.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(setTimelineAdapter p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.AudioAttributesCompatParcelizer(getConnectionMonitor.REFUSED_STREAM, (IOException) null);
    }

    @Override // o.BlockingViewModel_HiltModulesKeyModule.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(BlockingViewModel_HiltModulesKeyModule p0, getTimelineAdapter p1) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            this.allocationLimit = p1.IconCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final ThemeKt getHandshake() {
        return this.handshake;
    }

    private static void read(ThemeKtExternalSyntheticLambda3 p0, ActivityPresenterModule p1, IOException p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (p1.getProxy().type() != Proxy.Type.DIRECT) {
            VideoOfflineDbModel address = p1.getAddress();
            address.getProxySelector().connectFailed(address.getUrl().onAddQueueItem(), p1.getProxy().address(), p2);
        }
        p0.getRouteDatabase().RemoteActionCompatParcelizer(p1);
    }

    public final void AudioAttributesCompatParcelizer(PlaybackDrmModule p0, IOException p1) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p1 instanceof NavKey) {
                if (((NavKey) p1).IconCompatParcelizer == getConnectionMonitor.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((NavKey) p1).IconCompatParcelizer != getConnectionMonitor.CANCEL || !p0.getCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!MediaBrowserCompatItemReceiver() || (p1 instanceof UpgradePlanActivityPresenter)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (p1 != null) {
                        read(p0.getClient(), this.route, p1);
                    }
                    this.routeFailureCount++;
                }
            }
        }
    }

    @Override // kotlin.UserLoggedOutException
    public final ThemeKtExternalSyntheticLambda1 RemoteActionCompatParcelizer() {
        ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1 = this.protocol;
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda1);
        return themeKtExternalSyntheticLambda1;
    }

    public final String toString() {
        Object cipherSuite;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.getAddress().getUrl().getHost());
        sb.append(':');
        sb.append(this.route.getAddress().getUrl().getPort());
        sb.append(", proxy=");
        sb.append(this.route.getProxy());
        sb.append(" hostAddress=");
        sb.append(this.route.getSocketAddress());
        sb.append(" cipherSuite=");
        ThemeKt themeKt = this.handshake;
        if (themeKt == null || (cipherSuite = themeKt.getCipherSuite()) == null) {
            cipherSuite = "none";
        }
        sb.append(cipherSuite);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final boolean read(VideoOfflineDbModel p0, List<ActivityPresenterModule> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.getAddress().AudioAttributesCompatParcelizer(p0)) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getUrl().getHost(), (Object) getRoute().getAddress().getUrl().getHost())) {
            return true;
        }
        if (this.http2Connection == null || p1 == null || !AudioAttributesCompatParcelizer(p1) || p0.getHostnameVerifier() != BookmarkTimelineModelController.INSTANCE || !write(p0.getUrl())) {
            return false;
        }
        try {
            toLicenseLSModel certificatePinner = p0.getCertificatePinner();
            toMagicModuleMetaRepoModel.write(certificatePinner);
            String host = p0.getUrl().getHost();
            ThemeKt handshake = getHandshake();
            toMagicModuleMetaRepoModel.write(handshake);
            certificatePinner.read(host, handshake.read());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    private final boolean write(ThemeAlphaConstantsKt p0) {
        ThemeKt themeKt;
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        ThemeAlphaConstantsKt url = this.route.getAddress().getUrl();
        if (p0.getPort() != url.getPort()) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getHost(), (Object) url.getHost())) {
            return true;
        }
        if (!this.noCoalescedConnections && (themeKt = this.handshake) != null) {
            toMagicModuleMetaRepoModel.write(themeKt);
            if (write(p0, themeKt)) {
                return true;
            }
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(boolean p0) {
        long j;
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        toMagicModuleMetaRepoModel.write(socket);
        Socket socket2 = this.socket;
        toMagicModuleMetaRepoModel.write(socket2);
        LessonCompletedDialog lessonCompletedDialog = this.source;
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule = this.http2Connection;
        if (blockingViewModel_HiltModulesKeyModule != null) {
            return blockingViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer(jNanoTime);
        }
        synchronized (this) {
            j = this.idleAtNs;
        }
        if (jNanoTime - j < IDLE_CONNECTION_HEALTHY_NS || !p0) {
            return true;
        }
        return FirebaseDataModule.AudioAttributesCompatParcelizer(socket2, lessonCompletedDialog);
    }
}
