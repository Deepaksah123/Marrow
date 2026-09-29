package kotlin;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.VideoCacheModule;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u000f\u0010\u001cJ\u0015\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b\u000f\u0010\u001eJ\u0015\u0010\u0019\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001f¢\u0006\u0004\b\u0019\u0010!R\u001a\u0010\"\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010+R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Lo/FileProviderModule;", "", "Lo/ResourceProviderModule;", "p0", "Lo/VideoOfflineDbModel;", "p1", "Lo/PlaybackDrmModule;", "p2", "Lo/AppThemeKt;", "p3", "<init>", "(Lo/ResourceProviderModule;Lo/VideoOfflineDbModel;Lo/PlaybackDrmModule;Lo/AppThemeKt;)V", "Lo/ThemeKtExternalSyntheticLambda3;", "Lo/BaseDaggerFragment;", "Lo/ServiceProviderModule;", "write", "(Lo/ThemeKtExternalSyntheticLambda3;Lo/BaseDaggerFragment;)Lo/ServiceProviderModule;", "", "", "p4", "Lo/VideoAnalyticModule;", "RemoteActionCompatParcelizer", "(IIIIZ)Lo/VideoAnalyticModule;", "p5", "(IIIIZZ)Lo/VideoAnalyticModule;", "AudioAttributesCompatParcelizer", "()Z", "Lo/ActivityPresenterModule;", "()Lo/ActivityPresenterModule;", "Lo/ThemeAlphaConstantsKt;", "(Lo/ThemeAlphaConstantsKt;)Z", "Ljava/io/IOException;", "", "(Ljava/io/IOException;)V", "address", "Lo/VideoOfflineDbModel;", "read", "()Lo/VideoOfflineDbModel;", "call", "Lo/PlaybackDrmModule;", "connectionPool", "Lo/ResourceProviderModule;", "connectionShutdownCount", "I", "eventListener", "Lo/AppThemeKt;", "nextRouteToTry", "Lo/ActivityPresenterModule;", "otherFailureCount", "refusedStreamCount", "Lo/VideoCacheModule$AudioAttributesCompatParcelizer;", "routeSelection", "Lo/VideoCacheModule$AudioAttributesCompatParcelizer;", "Lo/VideoCacheModule;", "routeSelector", "Lo/VideoCacheModule;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileProviderModule {
    private final VideoOfflineDbModel address;
    private final PlaybackDrmModule call;
    private final ResourceProviderModule connectionPool;
    private int connectionShutdownCount;
    private final AppThemeKt eventListener;
    private ActivityPresenterModule nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private VideoCacheModule.AudioAttributesCompatParcelizer routeSelection;
    private VideoCacheModule routeSelector;

    public FileProviderModule(ResourceProviderModule resourceProviderModule, VideoOfflineDbModel videoOfflineDbModel, PlaybackDrmModule playbackDrmModule, AppThemeKt appThemeKt) {
        toMagicModuleMetaRepoModel.write(resourceProviderModule, "");
        toMagicModuleMetaRepoModel.write(videoOfflineDbModel, "");
        toMagicModuleMetaRepoModel.write(playbackDrmModule, "");
        toMagicModuleMetaRepoModel.write(appThemeKt, "");
        this.connectionPool = resourceProviderModule;
        this.address = videoOfflineDbModel;
        this.call = playbackDrmModule;
        this.eventListener = appThemeKt;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final VideoOfflineDbModel getAddress() {
        return this.address;
    }

    public final ServiceProviderModule write(ThemeKtExternalSyntheticLambda3 p0, BaseDaggerFragment p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            return write(p1.AudioAttributesCompatParcelizer(), p1.AudioAttributesImplApi26Parcelizer(), p1.MediaBrowserCompatCustomActionResultReceiver(), p0.getPingIntervalMillis(), p0.getRetryOnConnectionFailure(), !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1.AudioAttributesImplApi21Parcelizer().getMethod(), (Object) "GET")).RemoteActionCompatParcelizer(p0, p1);
        } catch (IOException e) {
            this.AudioAttributesCompatParcelizer(e);
            throw new SourceUrlModule(e);
        } catch (SourceUrlModule e2) {
            this.AudioAttributesCompatParcelizer(e2.RemoteActionCompatParcelizer());
            throw e2;
        }
    }

    private final VideoAnalyticModule write(int p0, int p1, int p2, int p3, boolean p4, boolean p5) throws IOException {
        VideoCacheModule.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        VideoCacheModule videoCacheModule;
        while (true) {
            VideoAnalyticModule videoAnalyticModuleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1, p2, p3, p4);
            if (videoAnalyticModuleRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p5)) {
                return videoAnalyticModuleRemoteActionCompatParcelizer;
            }
            videoAnalyticModuleRemoteActionCompatParcelizer.MediaMetadataCompat();
            if (this.nextRouteToTry == null && (audioAttributesCompatParcelizer = this.routeSelection) != null && !audioAttributesCompatParcelizer.read() && (videoCacheModule = this.routeSelector) != null && !videoCacheModule.write()) {
                throw new IOException("exhausted all routes");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.VideoAnalyticModule RemoteActionCompatParcelizer(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.FileProviderModule.RemoteActionCompatParcelizer(int, int, int, int, boolean):o.VideoAnalyticModule");
    }

    public final void AudioAttributesCompatParcelizer(IOException p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.nextRouteToTry = null;
        if ((p0 instanceof NavKey) && ((NavKey) p0).IconCompatParcelizer == getConnectionMonitor.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (p0 instanceof UpgradePlanActivityPresenter) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        VideoCacheModule videoCacheModule;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        ActivityPresenterModule activityPresenterModuleWrite = write();
        if (activityPresenterModuleWrite != null) {
            this.nextRouteToTry = activityPresenterModuleWrite;
            return true;
        }
        VideoCacheModule.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.routeSelection;
        if ((audioAttributesCompatParcelizer == null || !audioAttributesCompatParcelizer.read()) && (videoCacheModule = this.routeSelector) != null) {
            return videoCacheModule.write();
        }
        return true;
    }

    private final ActivityPresenterModule write() {
        VideoAnalyticModule connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount() != 0) {
                return null;
            }
            if (FirebaseDataModule.IconCompatParcelizer(connection.getRoute().getAddress().getUrl(), this.address.getUrl())) {
                return connection.getRoute();
            }
            return null;
        }
    }

    public final boolean write(ThemeAlphaConstantsKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ThemeAlphaConstantsKt url = this.address.getUrl();
        return p0.getPort() == url.getPort() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getHost(), (Object) url.getHost());
    }
}
