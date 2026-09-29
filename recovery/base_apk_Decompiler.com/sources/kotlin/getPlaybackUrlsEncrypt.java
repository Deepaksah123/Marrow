package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.AppProviderModule;
import kotlin.C0156TypeKt;
import kotlin.McqDataModule;
import kotlin.MediaType;
import kotlin.Metadata;
import kotlin.SettingsItem;
import kotlin.ShapeKt;
import kotlin.ThemeAlphaConstantsKt;
import kotlin.ThemeKt;
import kotlin.ThemeKtExternalSyntheticLambda0;
import kotlin.getMPresenter;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0004,+\u000f\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0018\u00010\fR\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u0019\u0010\u001eJ\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001b\u0010\u001fR\u0014\u0010 \u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\"\u0010'\u001a\u00020\"8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010$\u001a\u0004\b\u0019\u0010(\"\u0004\b\u001b\u0010)R\"\u0010*\u001a\u00020\"8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b\u001b\u0010(\"\u0004\b\u0016\u0010)"}, d2 = {"Lo/getPlaybackUrlsEncrypt;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ljava/io/File;", "p0", "", "p1", "<init>", "(Ljava/io/File;J)V", "Lo/OptionItemPlaybackSpeedOptionItem;", "p2", "(Ljava/io/File;JLo/OptionItemPlaybackSpeedOptionItem;)V", "Lo/McqDataModule$RemoteActionCompatParcelizer;", "Lo/McqDataModule;", "", "RemoteActionCompatParcelizer", "(Lo/McqDataModule$RemoteActionCompatParcelizer;)V", "close", "()V", "flush", "Lo/ThemeKtExternalSyntheticLambda0;", "Lo/TypeKt;", "IconCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda0;)Lo/TypeKt;", "Lo/LessonDataModule;", "AudioAttributesCompatParcelizer", "(Lo/TypeKt;)Lo/LessonDataModule;", "read", "(Lo/ThemeKtExternalSyntheticLambda0;)V", "Lo/PlanDataModule;", "(Lo/PlanDataModule;)V", "(Lo/TypeKt;Lo/TypeKt;)V", "cache", "Lo/McqDataModule;", "", "hitCount", "I", "networkCount", "requestCount", "writeAbortCount", "()I", "(I)V", "writeSuccessCount", "Companion", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getPlaybackUrlsEncrypt implements Closeable, Flushable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final McqDataModule cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    private getPlaybackUrlsEncrypt(File file, long j, OptionItemPlaybackSpeedOptionItem optionItemPlaybackSpeedOptionItem) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(optionItemPlaybackSpeedOptionItem, "");
        this.cache = new McqDataModule(optionItemPlaybackSpeedOptionItem, file, j, SyncModule.INSTANCE);
    }

    public final void IconCompatParcelizer(int i) {
        this.writeSuccessCount = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    public final void read(int i) {
        this.writeAbortCount = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getPlaybackUrlsEncrypt(File file, long j) {
        this(file, j, OptionItemPlaybackSpeedOptionItem.SYSTEM);
        toMagicModuleMetaRepoModel.write(file, "");
    }

    public final C0156TypeKt IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            McqDataModule.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = this.cache.write(Companion.IconCompatParcelizer(p0.getUrl()));
            if (audioAttributesCompatParcelizerWrite == null) {
                return null;
            }
            try {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(audioAttributesCompatParcelizerWrite.IconCompatParcelizer(0));
                C0156TypeKt c0156TypeKtAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerWrite);
                if (remoteActionCompatParcelizer.IconCompatParcelizer(p0, c0156TypeKtAudioAttributesCompatParcelizer)) {
                    return c0156TypeKtAudioAttributesCompatParcelizer;
                }
                ActivityAdapterModule body = c0156TypeKtAudioAttributesCompatParcelizer.getBody();
                if (body != null) {
                    FirebaseDataModule.read(body);
                }
                return null;
            } catch (IOException unused) {
                FirebaseDataModule.read(audioAttributesCompatParcelizerWrite);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final LessonDataModule AudioAttributesCompatParcelizer(C0156TypeKt p0) {
        McqDataModule.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        String method = p0.getRequest().getMethod();
        ServicePresenterModule servicePresenterModule = ServicePresenterModule.INSTANCE;
        if (ServicePresenterModule.write(p0.getRequest().getMethod())) {
            try {
                read(p0.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method, (Object) "GET") || Companion.read(p0)) {
            return null;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(p0);
        try {
            remoteActionCompatParcelizer = this.cache.read(Companion.IconCompatParcelizer(p0.getRequest().getUrl()), McqDataModule.ANY_SEQUENCE_NUMBER);
            if (remoteActionCompatParcelizer == null) {
                return null;
            }
            try {
                remoteActionCompatParcelizer2.IconCompatParcelizer(remoteActionCompatParcelizer);
                return new AudioAttributesCompatParcelizer(this, remoteActionCompatParcelizer);
            } catch (IOException unused2) {
                RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
                return null;
            }
        } catch (IOException unused3) {
            remoteActionCompatParcelizer = null;
        }
    }

    public final void read(ThemeKtExternalSyntheticLambda0 p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.cache.RemoteActionCompatParcelizer(Companion.IconCompatParcelizer(p0.getUrl()));
    }

    public static void read(C0156TypeKt p0, C0156TypeKt p1) {
        McqDataModule.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(p1);
        ActivityAdapterModule body = p0.getBody();
        toMagicModuleMetaRepoModel.read(body, "");
        try {
            RemoteActionCompatParcelizer2 = ((write) body).RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer2 == null) {
                return;
            }
            try {
                remoteActionCompatParcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer2);
                RemoteActionCompatParcelizer2.AudioAttributesCompatParcelizer();
            } catch (IOException unused) {
                RemoteActionCompatParcelizer(RemoteActionCompatParcelizer2);
            }
        } catch (IOException unused2) {
            RemoteActionCompatParcelizer2 = null;
        }
    }

    private static void RemoteActionCompatParcelizer(McqDataModule.RemoteActionCompatParcelizer p0) {
        if (p0 != null) {
            try {
                p0.IconCompatParcelizer();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.cache.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.cache.close();
    }

    public final void AudioAttributesCompatParcelizer(PlanDataModule p0) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.requestCount++;
            if (p0.getRemoteActionCompatParcelizer() != null) {
                this.networkCount++;
            } else if (p0.getRead() != null) {
                this.hitCount++;
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.hitCount++;
        }
    }

    final class AudioAttributesCompatParcelizer implements LessonDataModule {
        private boolean AudioAttributesCompatParcelizer;
        private final setCompoundDrawablesWithIntrinsicBoundsCompatdefault IconCompatParcelizer;
        private /* synthetic */ getPlaybackUrlsEncrypt RemoteActionCompatParcelizer;
        private final McqDataModule.RemoteActionCompatParcelizer read;
        private final setCompoundDrawablesWithIntrinsicBoundsCompatdefault write;

        public AudioAttributesCompatParcelizer(final getPlaybackUrlsEncrypt getplaybackurlsencrypt, McqDataModule.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            this.RemoteActionCompatParcelizer = getplaybackurlsencrypt;
            this.read = remoteActionCompatParcelizer;
            setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefaultRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer(1);
            this.IconCompatParcelizer = setcompounddrawableswithintrinsicboundscompatdefaultRemoteActionCompatParcelizer;
            this.write = new updateTimelineSelection(setcompounddrawableswithintrinsicboundscompatdefaultRemoteActionCompatParcelizer) { // from class: o.getPlaybackUrlsEncrypt.AudioAttributesCompatParcelizer.5
                @Override // kotlin.updateTimelineSelection, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    getPlaybackUrlsEncrypt getplaybackurlsencrypt2 = getplaybackurlsencrypt;
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this;
                    synchronized (getplaybackurlsencrypt2) {
                        if (audioAttributesCompatParcelizer.IconCompatParcelizer()) {
                            return;
                        }
                        audioAttributesCompatParcelizer.write();
                        getplaybackurlsencrypt2.IconCompatParcelizer(getplaybackurlsencrypt2.getWriteSuccessCount() + 1);
                        super.close();
                        this.read.AudioAttributesCompatParcelizer();
                    }
                }
            };
        }

        public final boolean IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void write() {
            this.AudioAttributesCompatParcelizer = true;
        }

        @Override // kotlin.LessonDataModule
        public final void read() {
            getPlaybackUrlsEncrypt getplaybackurlsencrypt = this.RemoteActionCompatParcelizer;
            synchronized (getplaybackurlsencrypt) {
                if (this.AudioAttributesCompatParcelizer) {
                    return;
                }
                this.AudioAttributesCompatParcelizer = true;
                getplaybackurlsencrypt.read(getplaybackurlsencrypt.getWriteAbortCount() + 1);
                FirebaseDataModule.read(this.IconCompatParcelizer);
                try {
                    this.read.IconCompatParcelizer();
                } catch (IOException unused) {
                }
            }
        }

        @Override // kotlin.LessonDataModule
        public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00062\n\u0010\u0003\u001a\u00060\u0012R\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0018J\u0019\u0010\u000b\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0019R\u00020\u0013¢\u0006\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\u0014\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u0014\u0010\u0010\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010#\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010)\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\u0014\u0010+\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010-\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u0014\u0010&\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010."}, d2 = {"Lo/getPlaybackUrlsEncrypt$RemoteActionCompatParcelizer;", "", "Lo/setLockedFromSeek;", "p0", "<init>", "(Lo/setLockedFromSeek;)V", "Lo/TypeKt;", "(Lo/TypeKt;)V", "Lo/ThemeKtExternalSyntheticLambda0;", "p1", "", "IconCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda0;Lo/TypeKt;)Z", "Lo/LessonCompletedDialog;", "", "Ljava/security/cert/Certificate;", "RemoteActionCompatParcelizer", "(Lo/LessonCompletedDialog;)Ljava/util/List;", "Lo/McqDataModule$AudioAttributesCompatParcelizer;", "Lo/McqDataModule;", "AudioAttributesCompatParcelizer", "(Lo/McqDataModule$AudioAttributesCompatParcelizer;)Lo/TypeKt;", "Lo/LessonCompletedDialogonViewCreatedllm1;", "", "(Lo/LessonCompletedDialogonViewCreatedllm1;Ljava/util/List;)V", "Lo/McqDataModule$RemoteActionCompatParcelizer;", "(Lo/McqDataModule$RemoteActionCompatParcelizer;)V", "", "write", "I", "Lo/ThemeKt;", "Lo/ThemeKt;", "read", "()Z", "", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "Lo/ThemeKtExternalSyntheticLambda1;", "AudioAttributesImplBaseParcelizer", "Lo/ThemeKtExternalSyntheticLambda1;", "", "AudioAttributesImplApi26Parcelizer", "J", "MediaBrowserCompatItemReceiver", "Lo/ShapeKt;", "AudioAttributesImplApi21Parcelizer", "Lo/ShapeKt;", "MediaBrowserCompatSearchResultReceiver", "Lo/ThemeAlphaConstantsKt;", "MediaDescriptionCompat", "Lo/ThemeAlphaConstantsKt;", "MediaBrowserCompatMediaItem"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer {
        private static final String RemoteActionCompatParcelizer;
        private static final String read;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private final ShapeKt MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private final long MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final ThemeKtExternalSyntheticLambda1 IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final ThemeKt read;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final String AudioAttributesImplApi26Parcelizer;
        private final ShapeKt MediaBrowserCompatMediaItem;

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private final long AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private final ThemeAlphaConstantsKt AudioAttributesImplBaseParcelizer;
        private final int write;

        private final boolean write() {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer.getScheme(), (Object) "https");
        }

        public RemoteActionCompatParcelizer(setLockedFromSeek setlockedfromseek) throws IOException {
            AppProviderModule appProviderModuleAudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
            setLockedFromSeek setlockedfromseek2 = setlockedfromseek;
            try {
                LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(setlockedfromseek);
                String strOnMediaButtonEvent = lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent();
                ThemeAlphaConstantsKt.Companion companion = ThemeAlphaConstantsKt.INSTANCE;
                ThemeAlphaConstantsKt themeAlphaConstantsKt = ThemeAlphaConstantsKt.Companion.read(strOnMediaButtonEvent);
                if (themeAlphaConstantsKt == null) {
                    StringBuilder sb = new StringBuilder("Cache corruption for ");
                    sb.append(strOnMediaButtonEvent);
                    IOException iOException = new IOException(sb.toString());
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write();
                    SettingsItem.AudioAttributesCompatParcelizer("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.AudioAttributesImplBaseParcelizer = themeAlphaConstantsKt;
                this.AudioAttributesImplApi26Parcelizer = lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent();
                ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
                Companion companion2 = getPlaybackUrlsEncrypt.INSTANCE;
                int iAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer);
                for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                    remoteActionCompatParcelizer.read(lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent());
                }
                this.MediaBrowserCompatMediaItem = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                getMPresenter.Companion companion3 = getMPresenter.INSTANCE;
                getMPresenter getmpresenterAudioAttributesCompatParcelizer = getMPresenter.Companion.AudioAttributesCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent());
                this.IconCompatParcelizer = getmpresenterAudioAttributesCompatParcelizer.read;
                this.write = getmpresenterAudioAttributesCompatParcelizer.IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = getmpresenterAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new ShapeKt.RemoteActionCompatParcelizer();
                Companion companion4 = getPlaybackUrlsEncrypt.INSTANCE;
                int iAudioAttributesCompatParcelizer2 = Companion.AudioAttributesCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer);
                for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer2; i2++) {
                    remoteActionCompatParcelizer2.read(lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent());
                }
                String str = RemoteActionCompatParcelizer;
                String strWrite = remoteActionCompatParcelizer2.write(str);
                String str2 = read;
                String strWrite2 = remoteActionCompatParcelizer2.write(str2);
                remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer(str);
                remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer(str2);
                this.AudioAttributesImplApi21Parcelizer = strWrite != null ? Long.parseLong(strWrite) : 0L;
                this.MediaBrowserCompatCustomActionResultReceiver = strWrite2 != null ? Long.parseLong(strWrite2) : 0L;
                this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer();
                if (write()) {
                    String strOnMediaButtonEvent2 = lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent();
                    if (strOnMediaButtonEvent2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("expected \"\" but was \"");
                        sb2.append(strOnMediaButtonEvent2);
                        sb2.append('\"');
                        throw new IOException(sb2.toString());
                    }
                    getQualityHashCipher getqualityhashcipherWrite = getQualityHashCipher.INSTANCE.write(lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent());
                    List<Certificate> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer);
                    List<Certificate> listRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer);
                    if (!lessonCompletedDialogAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                        AppProviderModule.Companion companion5 = AppProviderModule.INSTANCE;
                        appProviderModuleAudioAttributesCompatParcelizer = AppProviderModule.Companion.AudioAttributesCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer.onMediaButtonEvent());
                    } else {
                        appProviderModuleAudioAttributesCompatParcelizer = AppProviderModule.SSL_3_0;
                    }
                    ThemeKt.Companion companion6 = ThemeKt.INSTANCE;
                    this.read = ThemeKt.Companion.RemoteActionCompatParcelizer(appProviderModuleAudioAttributesCompatParcelizer, getqualityhashcipherWrite, listRemoteActionCompatParcelizer, listRemoteActionCompatParcelizer2);
                } else {
                    this.read = null;
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(setlockedfromseek2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    MagicModuleMetaLSModel.IconCompatParcelizer(setlockedfromseek2, th);
                    throw th2;
                }
            }
        }

        public RemoteActionCompatParcelizer(C0156TypeKt c0156TypeKt) {
            toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
            this.AudioAttributesImplBaseParcelizer = c0156TypeKt.getRequest().getUrl();
            this.MediaBrowserCompatMediaItem = getPlaybackUrlsEncrypt.INSTANCE.AudioAttributesCompatParcelizer(c0156TypeKt);
            this.AudioAttributesImplApi26Parcelizer = c0156TypeKt.getRequest().getMethod();
            this.IconCompatParcelizer = c0156TypeKt.getProtocol();
            this.write = c0156TypeKt.getCode();
            this.RemoteActionCompatParcelizer = c0156TypeKt.getMessage();
            this.MediaBrowserCompatItemReceiver = c0156TypeKt.getHeaders();
            this.read = c0156TypeKt.getHandshake();
            this.AudioAttributesImplApi21Parcelizer = c0156TypeKt.getSentRequestAtMillis();
            this.MediaBrowserCompatCustomActionResultReceiver = c0156TypeKt.getReceivedResponseAtMillis();
        }

        public final void IconCompatParcelizer(McqDataModule.RemoteActionCompatParcelizer p0) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = CustomAppBarLayout.read(p0.RemoteActionCompatParcelizer(0));
            try {
                LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm12 = lessonCompletedDialogonViewCreatedllm1;
                lessonCompletedDialogonViewCreatedllm12.read(this.AudioAttributesImplBaseParcelizer.toString()).read(10);
                lessonCompletedDialogonViewCreatedllm12.read(this.AudioAttributesImplApi26Parcelizer).read(10);
                lessonCompletedDialogonViewCreatedllm12.MediaBrowserCompatMediaItem(this.MediaBrowserCompatMediaItem.IconCompatParcelizer()).read(10);
                int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
                for (int i = 0; i < iIconCompatParcelizer; i++) {
                    lessonCompletedDialogonViewCreatedllm12.read(this.MediaBrowserCompatMediaItem.IconCompatParcelizer(i)).read(": ").read(this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(i)).read(10);
                }
                lessonCompletedDialogonViewCreatedllm12.read(new getMPresenter(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer).toString()).read(10);
                lessonCompletedDialogonViewCreatedllm12.MediaBrowserCompatMediaItem(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer() + 2).read(10);
                int iIconCompatParcelizer2 = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer2; i2++) {
                    lessonCompletedDialogonViewCreatedllm12.read(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(i2)).read(": ").read(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(i2)).read(10);
                }
                lessonCompletedDialogonViewCreatedllm12.read(RemoteActionCompatParcelizer).read(": ").MediaBrowserCompatMediaItem(this.AudioAttributesImplApi21Parcelizer).read(10);
                lessonCompletedDialogonViewCreatedllm12.read(read).read(": ").MediaBrowserCompatMediaItem(this.MediaBrowserCompatCustomActionResultReceiver).read(10);
                if (write()) {
                    lessonCompletedDialogonViewCreatedllm12.read(10);
                    ThemeKt themeKt = this.read;
                    toMagicModuleMetaRepoModel.write(themeKt);
                    lessonCompletedDialogonViewCreatedllm12.read(themeKt.getCipherSuite().getJavaName()).read(10);
                    IconCompatParcelizer(lessonCompletedDialogonViewCreatedllm12, this.read.read());
                    IconCompatParcelizer(lessonCompletedDialogonViewCreatedllm12, this.read.IconCompatParcelizer());
                    lessonCompletedDialogonViewCreatedllm12.read(this.read.getTlsVersion().getJavaName()).read(10);
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(lessonCompletedDialogonViewCreatedllm1, null);
            } finally {
            }
        }

        private static List<Certificate> RemoteActionCompatParcelizer(LessonCompletedDialog p0) throws IOException {
            Companion companion = getPlaybackUrlsEncrypt.INSTANCE;
            int iAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(p0);
            if (iAudioAttributesCompatParcelizer == -1) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iAudioAttributesCompatParcelizer);
                for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                    String strOnMediaButtonEvent = p0.onMediaButtonEvent();
                    resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                    getRelatedModuleAdapter.Companion companion2 = getRelatedModuleAdapter.INSTANCE;
                    getRelatedModuleAdapter getrelatedmoduleadapterIconCompatParcelizer = getRelatedModuleAdapter.Companion.IconCompatParcelizer(strOnMediaButtonEvent);
                    if (getrelatedmoduleadapterIconCompatParcelizer == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    resetcurrentselectedposition.AudioAttributesCompatParcelizer(getrelatedmoduleadapterIconCompatParcelizer);
                    arrayList.add(certificateFactory.generateCertificate(resetcurrentselectedposition.AudioAttributesImplBaseParcelizer()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private static void IconCompatParcelizer(LessonCompletedDialogonViewCreatedllm1 p0, List<? extends Certificate> p1) throws IOException {
            try {
                p0.MediaBrowserCompatMediaItem(p1.size()).read(10);
                Iterator<? extends Certificate> it = p1.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(encoded, "");
                    p0.read(getRelatedModuleAdapter.Companion.IconCompatParcelizer(encoded, 0, isConciseModeOn.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer()).read(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0, C0156TypeKt p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, p0.getUrl()) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) p0.getMethod())) {
                return false;
            }
            Companion companion = getPlaybackUrlsEncrypt.INSTANCE;
            return Companion.IconCompatParcelizer(p1, this.MediaBrowserCompatMediaItem, p0);
        }

        public final C0156TypeKt AudioAttributesCompatParcelizer(McqDataModule.AudioAttributesCompatParcelizer p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String strIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(RtspHeaders.CONTENT_TYPE);
            String strIconCompatParcelizer2 = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(RtspHeaders.CONTENT_LENGTH);
            return new C0156TypeKt.IconCompatParcelizer().read(new ThemeKtExternalSyntheticLambda0.IconCompatParcelizer().write(this.AudioAttributesImplBaseParcelizer).AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, (ThemeKtExternalSyntheticLambda2) null).read(this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer()).read(this.IconCompatParcelizer).read(this.write).write(this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver).write(new write(p0, strIconCompatParcelizer, strIconCompatParcelizer2)).AudioAttributesCompatParcelizer(this.read).AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer).IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver).IconCompatParcelizer();
        }

        static {
            StringBuilder sb = new StringBuilder();
            SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
            SettingsItem.IconCompatParcelizer.write();
            sb.append(SettingsItem.MediaBrowserCompatItemReceiver());
            sb.append("-Sent-Millis");
            RemoteActionCompatParcelizer = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            SettingsItem.IconCompatParcelizer iconCompatParcelizer2 = SettingsItem.AudioAttributesCompatParcelizer;
            SettingsItem.IconCompatParcelizer.write();
            sb2.append(SettingsItem.MediaBrowserCompatItemReceiver());
            sb2.append("-Received-Millis");
            read = sb2.toString();
        }
    }

    static final class write extends ActivityAdapterModule {
        private final LessonCompletedDialog AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String read;
        private final McqDataModule.AudioAttributesCompatParcelizer write;

        public final McqDataModule.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            return this.write;
        }

        public write(McqDataModule.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str, String str2) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            this.write = audioAttributesCompatParcelizer;
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(new setRelatedModuleAdapter(audioAttributesCompatParcelizer.IconCompatParcelizer(1)) { // from class: o.getPlaybackUrlsEncrypt.write.1
                @Override // kotlin.setRelatedModuleAdapter, kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    this.RemoteActionCompatParcelizer().close();
                    super.close();
                }
            });
        }

        @Override // kotlin.ActivityAdapterModule
        public final MediaType write() {
            String str = this.read;
            if (str == null) {
                return null;
            }
            MediaType.write writeVar = MediaType.write;
            return MediaType.write.AudioAttributesCompatParcelizer(str);
        }

        @Override // kotlin.ActivityAdapterModule
        public final long read() {
            String str = this.IconCompatParcelizer;
            if (str != null) {
                return FirebaseDataModule.read(str);
            }
            return -1L;
        }

        @Override // kotlin.ActivityAdapterModule
        public final LessonCompletedDialog AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0007\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0014*\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018*\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0011\u0010\u000b\u001a\u00020\r*\u00020\u0011¢\u0006\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c"}, d2 = {"Lo/getPlaybackUrlsEncrypt$Companion;", "", "<init>", "()V", "Lo/ThemeAlphaConstantsKt;", "p0", "", "IconCompatParcelizer", "(Lo/ThemeAlphaConstantsKt;)Ljava/lang/String;", "Lo/LessonCompletedDialog;", "", "AudioAttributesCompatParcelizer", "(Lo/LessonCompletedDialog;)I", "Lo/ShapeKt;", "p1", "write", "(Lo/ShapeKt;Lo/ShapeKt;)Lo/ShapeKt;", "Lo/TypeKt;", "Lo/ThemeKtExternalSyntheticLambda0;", "p2", "", "(Lo/TypeKt;Lo/ShapeKt;Lo/ThemeKtExternalSyntheticLambda0;)Z", "read", "(Lo/TypeKt;)Z", "", "(Lo/ShapeKt;)Ljava/util/Set;", "(Lo/TypeKt;)Lo/ShapeKt;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static String IconCompatParcelizer(ThemeAlphaConstantsKt p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
            return getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer(p0.toString()).AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer();
        }

        public static int AudioAttributesCompatParcelizer(LessonCompletedDialog p0) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                long jRatingCompat = p0.RatingCompat();
                String strOnMediaButtonEvent = p0.onMediaButtonEvent();
                if (jRatingCompat >= 0 && jRatingCompat <= 2147483647L && strOnMediaButtonEvent.length() <= 0) {
                    return (int) jRatingCompat;
                }
                StringBuilder sb = new StringBuilder("expected an int but was \"");
                sb.append(jRatingCompat);
                sb.append(strOnMediaButtonEvent);
                sb.append('\"');
                throw new IOException(sb.toString());
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static boolean IconCompatParcelizer(C0156TypeKt p0, ShapeKt p1, ThemeKtExternalSyntheticLambda0 p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Set<String> set = read(p0.getHeaders());
            if ((set instanceof Collection) && set.isEmpty()) {
                return true;
            }
            for (String str : set) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1.AudioAttributesCompatParcelizer(str), p2.RemoteActionCompatParcelizer(str))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean read(C0156TypeKt c0156TypeKt) {
            toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
            return read(c0156TypeKt.getHeaders()).contains("*");
        }

        private static Set<String> read(ShapeKt shapeKt) {
            int iIconCompatParcelizer = shapeKt.IconCompatParcelizer();
            TreeSet treeSet = null;
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                if (TestGroupLSModel.read("Vary", shapeKt.IconCompatParcelizer(i), true)) {
                    String strAudioAttributesCompatParcelizer = shapeKt.AudioAttributesCompatParcelizer(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(TestGroupLSModel.AudioAttributesCompatParcelizer(toMagicModuleStatusUcModel.INSTANCE));
                    }
                    Iterator it = TestGroupLSModel.IconCompatParcelizer(strAudioAttributesCompatParcelizer, new char[]{','}, false, 0).iterator();
                    while (it.hasNext()) {
                        treeSet.add(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? getKycMessage.read() : treeSet;
        }

        public final ShapeKt AudioAttributesCompatParcelizer(C0156TypeKt c0156TypeKt) {
            toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
            C0156TypeKt networkResponse = c0156TypeKt.getNetworkResponse();
            toMagicModuleMetaRepoModel.write(networkResponse);
            return write(networkResponse.getRequest().getHeaders(), c0156TypeKt.getHeaders());
        }

        private static ShapeKt write(ShapeKt p0, ShapeKt p1) {
            Set<String> set = read(p1);
            if (set.isEmpty()) {
                return FirebaseDataModule.RemoteActionCompatParcelizer;
            }
            ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
            int iIconCompatParcelizer = p0.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                String strIconCompatParcelizer = p0.IconCompatParcelizer(i);
                if (set.contains(strIconCompatParcelizer)) {
                    remoteActionCompatParcelizer.IconCompatParcelizer(strIconCompatParcelizer, p0.AudioAttributesCompatParcelizer(i));
                }
            }
            return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
