package kotlin;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.C0156TypeKt;
import kotlin.Metadata;
import kotlin.ShapeKt;
import kotlin.getMPresenter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0015\u0010\u0018J\u0019\u0010\r\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\r\u0010\u001bJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0012\u0010\u001cJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010#R\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0012\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010$\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lo/BlockingViewModel;", "Lo/ServiceProviderModule;", "Lo/ThemeKtExternalSyntheticLambda3;", "p0", "Lo/VideoAnalyticModule;", "p1", "Lo/BaseDaggerFragment;", "p2", "Lo/BlockingViewModel_HiltModulesKeyModule;", "p3", "<init>", "(Lo/ThemeKtExternalSyntheticLambda3;Lo/VideoAnalyticModule;Lo/BaseDaggerFragment;Lo/BlockingViewModel_HiltModulesKeyModule;)V", "", "write", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "read", "(Lo/ThemeKtExternalSyntheticLambda0;J)Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/TypeKt;", "Lo/setLockedFromSeek;", "(Lo/TypeKt;)Lo/setLockedFromSeek;", "", "Lo/TypeKt$IconCompatParcelizer;", "(Z)Lo/TypeKt$IconCompatParcelizer;", "(Lo/TypeKt;)J", "(Lo/ThemeKtExternalSyntheticLambda0;)V", "Z", "AudioAttributesCompatParcelizer", "Lo/BaseDaggerFragment;", "MediaBrowserCompatItemReceiver", "Lo/VideoAnalyticModule;", "()Lo/VideoAnalyticModule;", "AudioAttributesImplBaseParcelizer", "Lo/BlockingViewModel_HiltModulesKeyModule;", "Lo/ThemeKtExternalSyntheticLambda1;", "AudioAttributesImplApi26Parcelizer", "Lo/ThemeKtExternalSyntheticLambda1;", "Lo/setTimelineAdapter;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setTimelineAdapter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BlockingViewModel implements ServiceProviderModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final BaseDaggerFragment IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final ThemeKtExternalSyntheticLambda1 read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final BlockingViewModel_HiltModulesKeyModule AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private volatile setTimelineAdapter AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final VideoAnalyticModule write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private volatile boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> read = FirebaseDataModule.IconCompatParcelizer("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", SyncingActivity.TARGET_METHOD_UTF8, SyncingActivity.TARGET_PATH_UTF8, SyncingActivity.TARGET_SCHEME_UTF8, SyncingActivity.TARGET_AUTHORITY_UTF8);
    private static final List<String> RemoteActionCompatParcelizer = FirebaseDataModule.IconCompatParcelizer("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public BlockingViewModel(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3, VideoAnalyticModule videoAnalyticModule, BaseDaggerFragment baseDaggerFragment, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule) {
        ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1;
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda3, "");
        toMagicModuleMetaRepoModel.write(videoAnalyticModule, "");
        toMagicModuleMetaRepoModel.write(baseDaggerFragment, "");
        toMagicModuleMetaRepoModel.write(blockingViewModel_HiltModulesKeyModule, "");
        this.write = videoAnalyticModule;
        this.IconCompatParcelizer = baseDaggerFragment;
        this.AudioAttributesCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
        if (themeKtExternalSyntheticLambda3.onPlay().contains(ThemeKtExternalSyntheticLambda1.H2_PRIOR_KNOWLEDGE)) {
            themeKtExternalSyntheticLambda1 = ThemeKtExternalSyntheticLambda1.H2_PRIOR_KNOWLEDGE;
        } else {
            themeKtExternalSyntheticLambda1 = ThemeKtExternalSyntheticLambda1.HTTP_2;
        }
        this.read = themeKtExternalSyntheticLambda1;
    }

    @Override // kotlin.ServiceProviderModule
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final VideoAnalyticModule getIconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.ServiceProviderModule
    public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault read(ThemeKtExternalSyntheticLambda0 p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setTimelineAdapter settimelineadapter = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(settimelineadapter);
        return settimelineadapter.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.ServiceProviderModule
    public final void read(ThemeKtExternalSyntheticLambda0 p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.AudioAttributesImplBaseParcelizer != null) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(Companion.read(p0), p0.getBody() != null);
        if (this.RemoteActionCompatParcelizer) {
            setTimelineAdapter settimelineadapter = this.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.write(settimelineadapter);
            settimelineadapter.read(getConnectionMonitor.CANCEL);
            throw new IOException("Canceled");
        }
        setTimelineAdapter settimelineadapter2 = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(settimelineadapter2);
        settimelineadapter2.handleMediaPlayPauseIfPendingOnHandler().read(this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(), TimeUnit.MILLISECONDS);
        setTimelineAdapter settimelineadapter3 = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(settimelineadapter3);
        settimelineadapter3.onMediaButtonEvent().read(this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), TimeUnit.MILLISECONDS);
    }

    @Override // kotlin.ServiceProviderModule
    public final void IconCompatParcelizer() throws IOException {
        this.AudioAttributesCompatParcelizer.write();
    }

    @Override // kotlin.ServiceProviderModule
    public final void RemoteActionCompatParcelizer() throws IOException {
        setTimelineAdapter settimelineadapter = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(settimelineadapter);
        settimelineadapter.AudioAttributesImplApi21Parcelizer().close();
    }

    @Override // kotlin.ServiceProviderModule
    public final C0156TypeKt.IconCompatParcelizer write(boolean p0) throws IOException {
        setTimelineAdapter settimelineadapter = this.AudioAttributesImplBaseParcelizer;
        if (settimelineadapter == null) {
            throw new IOException("stream wasn't created");
        }
        C0156TypeKt.IconCompatParcelizer IconCompatParcelizer = Companion.IconCompatParcelizer(settimelineadapter.onAddQueueItem(), this.read);
        if (p0 && IconCompatParcelizer.RemoteActionCompatParcelizer() == 100) {
            return null;
        }
        return IconCompatParcelizer;
    }

    @Override // kotlin.ServiceProviderModule
    public final long read(C0156TypeKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (FragmentProviderModule.write(p0)) {
            return FirebaseDataModule.write(p0);
        }
        return 0L;
    }

    @Override // kotlin.ServiceProviderModule
    public final setLockedFromSeek IconCompatParcelizer(C0156TypeKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setTimelineAdapter settimelineadapter = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(settimelineadapter);
        return settimelineadapter.getSource();
    }

    @Override // kotlin.ServiceProviderModule
    public final void write() {
        this.RemoteActionCompatParcelizer = true;
        setTimelineAdapter settimelineadapter = this.AudioAttributesImplBaseParcelizer;
        if (settimelineadapter != null) {
            settimelineadapter.read(getConnectionMonitor.CANCEL);
        }
    }

    /* JADX INFO: renamed from: o.BlockingViewModel$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lo/BlockingViewModel$IconCompatParcelizer;", "", "<init>", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "p0", "", "Lo/SyncingActivity;", "read", "(Lo/ThemeKtExternalSyntheticLambda0;)Ljava/util/List;", "Lo/ShapeKt;", "Lo/ThemeKtExternalSyntheticLambda1;", "p1", "Lo/TypeKt$IconCompatParcelizer;", "IconCompatParcelizer", "(Lo/ShapeKt;Lo/ThemeKtExternalSyntheticLambda1;)Lo/TypeKt$IconCompatParcelizer;", "", "Ljava/util/List;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<SyncingActivity> read(ThemeKtExternalSyntheticLambda0 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ShapeKt headers = p0.getHeaders();
            ArrayList arrayList = new ArrayList(headers.IconCompatParcelizer() + 4);
            arrayList.add(new SyncingActivity(SyncingActivity.TARGET_METHOD, p0.getMethod()));
            getRelatedModuleAdapter getrelatedmoduleadapter = SyncingActivity.TARGET_PATH;
            setMPresenter setmpresenter = setMPresenter.INSTANCE;
            arrayList.add(new SyncingActivity(getrelatedmoduleadapter, setMPresenter.RemoteActionCompatParcelizer(p0.getUrl())));
            String strAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer("Host");
            if (strAudioAttributesCompatParcelizer != null) {
                arrayList.add(new SyncingActivity(SyncingActivity.TARGET_AUTHORITY, strAudioAttributesCompatParcelizer));
            }
            arrayList.add(new SyncingActivity(SyncingActivity.TARGET_SCHEME, p0.getUrl().getScheme()));
            int iIconCompatParcelizer = headers.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                String strIconCompatParcelizer = headers.IconCompatParcelizer(i);
                Locale locale = Locale.US;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                String lowerCase = strIconCompatParcelizer.toLowerCase(locale);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                if (!BlockingViewModel.read.contains(lowerCase) || (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lowerCase, (Object) "te") && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) headers.AudioAttributesCompatParcelizer(i), (Object) "trailers"))) {
                    arrayList.add(new SyncingActivity(lowerCase, headers.AudioAttributesCompatParcelizer(i)));
                }
            }
            return arrayList;
        }

        public static C0156TypeKt.IconCompatParcelizer IconCompatParcelizer(ShapeKt p0, ThemeKtExternalSyntheticLambda1 p1) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
            int iIconCompatParcelizer = p0.IconCompatParcelizer();
            getMPresenter getmpresenterAudioAttributesCompatParcelizer = null;
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                String strIconCompatParcelizer = p0.IconCompatParcelizer(i);
                String strAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(i);
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strIconCompatParcelizer, (Object) SyncingActivity.RESPONSE_STATUS_UTF8)) {
                    if (!BlockingViewModel.RemoteActionCompatParcelizer.contains(strIconCompatParcelizer)) {
                        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(strIconCompatParcelizer, strAudioAttributesCompatParcelizer);
                    }
                } else {
                    getMPresenter.Companion companion = getMPresenter.INSTANCE;
                    getmpresenterAudioAttributesCompatParcelizer = getMPresenter.Companion.AudioAttributesCompatParcelizer("HTTP/1.1 ".concat(String.valueOf(strAudioAttributesCompatParcelizer)));
                }
            }
            if (getmpresenterAudioAttributesCompatParcelizer == null) {
                throw new ProtocolException("Expected ':status' header not present");
            }
            return new C0156TypeKt.IconCompatParcelizer().read(p1).read(getmpresenterAudioAttributesCompatParcelizer.IconCompatParcelizer).write(getmpresenterAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
