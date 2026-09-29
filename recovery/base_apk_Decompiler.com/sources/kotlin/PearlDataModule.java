package kotlin;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.C0156TypeKt;
import kotlin.MarrowTheme;
import kotlin.Metadata;
import kotlin.PlanDataModule;
import kotlin.ShapeKt;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e"}, d2 = {"Lo/PearlDataModule;", "Lo/MarrowTheme;", "Lo/getPlaybackUrlsEncrypt;", "p0", "<init>", "(Lo/getPlaybackUrlsEncrypt;)V", "Lo/LessonDataModule;", "Lo/TypeKt;", "p1", "RemoteActionCompatParcelizer", "(Lo/LessonDataModule;Lo/TypeKt;)Lo/TypeKt;", "Lo/MarrowTheme$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/MarrowTheme$AudioAttributesCompatParcelizer;)Lo/TypeKt;", "Lo/getPlaybackUrlsEncrypt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PearlDataModule implements MarrowTheme {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final getPlaybackUrlsEncrypt RemoteActionCompatParcelizer;

    public PearlDataModule(getPlaybackUrlsEncrypt getplaybackurlsencrypt) {
        this.RemoteActionCompatParcelizer = getplaybackurlsencrypt;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer p0) throws IOException {
        ActivityAdapterModule body;
        ActivityAdapterModule body2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toDownloadInfo todownloadinfo = p0.read();
        getPlaybackUrlsEncrypt getplaybackurlsencrypt = this.RemoteActionCompatParcelizer;
        C0156TypeKt c0156TypeKtIconCompatParcelizer = getplaybackurlsencrypt != null ? getplaybackurlsencrypt.IconCompatParcelizer(p0.IconCompatParcelizer()) : null;
        PlanDataModule planDataModuleAudioAttributesCompatParcelizer = new PlanDataModule.AudioAttributesCompatParcelizer(System.currentTimeMillis(), p0.IconCompatParcelizer(), c0156TypeKtIconCompatParcelizer).AudioAttributesCompatParcelizer();
        ThemeKtExternalSyntheticLambda0 remoteActionCompatParcelizer = planDataModuleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        C0156TypeKt read = planDataModuleAudioAttributesCompatParcelizer.getRead();
        getPlaybackUrlsEncrypt getplaybackurlsencrypt2 = this.RemoteActionCompatParcelizer;
        if (getplaybackurlsencrypt2 != null) {
            getplaybackurlsencrypt2.AudioAttributesCompatParcelizer(planDataModuleAudioAttributesCompatParcelizer);
        }
        PlaybackDrmModule playbackDrmModule = todownloadinfo instanceof PlaybackDrmModule ? (PlaybackDrmModule) todownloadinfo : null;
        if (playbackDrmModule == null || playbackDrmModule.getEventListener() == null) {
            AppThemeKt appThemeKt = AppThemeKt.NONE;
        }
        if (c0156TypeKtIconCompatParcelizer != null && read == null && (body2 = c0156TypeKtIconCompatParcelizer.getBody()) != null) {
            FirebaseDataModule.read(body2);
        }
        if (remoteActionCompatParcelizer == null && read == null) {
            C0156TypeKt c0156TypeKtIconCompatParcelizer2 = new C0156TypeKt.IconCompatParcelizer().read(p0.IconCompatParcelizer()).read(ThemeKtExternalSyntheticLambda1.HTTP_1_1).read(TarConstants.SPARSELEN_GNU_SPARSE).write("Unsatisfiable Request (only-if-cached)").write(FirebaseDataModule.read).AudioAttributesCompatParcelizer(-1L).IconCompatParcelizer(System.currentTimeMillis()).IconCompatParcelizer();
            AppThemeKt.read(todownloadinfo, c0156TypeKtIconCompatParcelizer2);
            return c0156TypeKtIconCompatParcelizer2;
        }
        if (remoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.write(read);
            C0156TypeKt c0156TypeKtIconCompatParcelizer3 = read.MediaDescriptionCompat().write(Companion.AudioAttributesCompatParcelizer(read)).IconCompatParcelizer();
            AppThemeKt.IconCompatParcelizer(todownloadinfo, c0156TypeKtIconCompatParcelizer3);
            return c0156TypeKtIconCompatParcelizer3;
        }
        if (read != null) {
            AppThemeKt.RemoteActionCompatParcelizer(todownloadinfo, read);
        } else if (this.RemoteActionCompatParcelizer != null) {
            AppThemeKt.AudioAttributesCompatParcelizer(todownloadinfo);
        }
        try {
            C0156TypeKt c0156TypeKtRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
            if (c0156TypeKtRemoteActionCompatParcelizer == null && c0156TypeKtIconCompatParcelizer != null && body != null) {
            }
            if (read != null) {
                if (c0156TypeKtRemoteActionCompatParcelizer != null && c0156TypeKtRemoteActionCompatParcelizer.getCode() == 304) {
                    C0156TypeKt c0156TypeKtIconCompatParcelizer4 = read.MediaDescriptionCompat().RemoteActionCompatParcelizer(Companion.RemoteActionCompatParcelizer(INSTANCE, read.getHeaders(), c0156TypeKtRemoteActionCompatParcelizer.getHeaders())).AudioAttributesCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer.getSentRequestAtMillis()).IconCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer.getReceivedResponseAtMillis()).write(Companion.AudioAttributesCompatParcelizer(read)).read(Companion.AudioAttributesCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer)).IconCompatParcelizer();
                    ActivityAdapterModule body3 = c0156TypeKtRemoteActionCompatParcelizer.getBody();
                    toMagicModuleMetaRepoModel.write(body3);
                    body3.close();
                    getPlaybackUrlsEncrypt getplaybackurlsencrypt3 = this.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.write(getplaybackurlsencrypt3);
                    getplaybackurlsencrypt3.RemoteActionCompatParcelizer();
                    getPlaybackUrlsEncrypt.read(read, c0156TypeKtIconCompatParcelizer4);
                    AppThemeKt.IconCompatParcelizer(todownloadinfo, c0156TypeKtIconCompatParcelizer4);
                    return c0156TypeKtIconCompatParcelizer4;
                }
                ActivityAdapterModule body4 = read.getBody();
                if (body4 != null) {
                    FirebaseDataModule.read(body4);
                }
            }
            toMagicModuleMetaRepoModel.write(c0156TypeKtRemoteActionCompatParcelizer);
            C0156TypeKt c0156TypeKtIconCompatParcelizer5 = c0156TypeKtRemoteActionCompatParcelizer.MediaDescriptionCompat().write(Companion.AudioAttributesCompatParcelizer(read)).read(Companion.AudioAttributesCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer)).IconCompatParcelizer();
            if (this.RemoteActionCompatParcelizer != null) {
                if (FragmentProviderModule.write(c0156TypeKtIconCompatParcelizer5)) {
                    PlanDataModule.Companion companion = PlanDataModule.INSTANCE;
                    if (PlanDataModule.Companion.IconCompatParcelizer(c0156TypeKtIconCompatParcelizer5, remoteActionCompatParcelizer)) {
                        C0156TypeKt c0156TypeKtRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(c0156TypeKtIconCompatParcelizer5), c0156TypeKtIconCompatParcelizer5);
                        if (read != null) {
                            AppThemeKt.AudioAttributesCompatParcelizer(todownloadinfo);
                        }
                        return c0156TypeKtRemoteActionCompatParcelizer2;
                    }
                }
                ServicePresenterModule servicePresenterModule = ServicePresenterModule.INSTANCE;
                if (ServicePresenterModule.write(remoteActionCompatParcelizer.getMethod())) {
                    try {
                        this.RemoteActionCompatParcelizer.read(remoteActionCompatParcelizer);
                    } catch (IOException unused) {
                    }
                }
            }
            return c0156TypeKtIconCompatParcelizer5;
        } finally {
            if (c0156TypeKtIconCompatParcelizer != null && (body = c0156TypeKtIconCompatParcelizer.getBody()) != null) {
                FirebaseDataModule.read(body);
            }
        }
    }

    private static C0156TypeKt RemoteActionCompatParcelizer(LessonDataModule p0, C0156TypeKt p1) throws IOException {
        if (p0 == null) {
            return p1;
        }
        setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefaultRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        ActivityAdapterModule body = p1.getBody();
        toMagicModuleMetaRepoModel.write(body);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(body.AudioAttributesCompatParcelizer(), p0, CustomAppBarLayout.read(setcompounddrawableswithintrinsicboundscompatdefaultRemoteActionCompatParcelizer));
        return p1.MediaDescriptionCompat().write(new onPaymentError(C0156TypeKt.IconCompatParcelizer(p1, RtspHeaders.CONTENT_TYPE), p1.getBody().read(), CustomAppBarLayout.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer))).IconCompatParcelizer();
    }

    public static final class RemoteActionCompatParcelizer implements setLockedFromSeek {
        private /* synthetic */ LessonDataModule AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private /* synthetic */ LessonCompletedDialog RemoteActionCompatParcelizer;
        private /* synthetic */ LessonCompletedDialogonViewCreatedllm1 write;

        RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, LessonDataModule lessonDataModule, LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) {
            this.RemoteActionCompatParcelizer = lessonCompletedDialog;
            this.AudioAttributesCompatParcelizer = lessonDataModule;
            this.write = lessonCompletedDialogonViewCreatedllm1;
        }

        @Override // kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            try {
                long jAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
                if (jAudioAttributesCompatParcelizer == -1) {
                    if (!this.IconCompatParcelizer) {
                        this.IconCompatParcelizer = true;
                        this.write.close();
                    }
                    return -1L;
                }
                resetcurrentselectedposition.write(this.write.AudioAttributesImplApi26Parcelizer(), resetcurrentselectedposition.getSize() - jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer);
                this.write.MediaBrowserCompatItemReceiver();
                return jAudioAttributesCompatParcelizer;
            } catch (IOException e) {
                if (!this.IconCompatParcelizer) {
                    this.IconCompatParcelizer = true;
                    this.AudioAttributesCompatParcelizer.read();
                }
                throw e;
            }
        }

        @Override // kotlin.setLockedFromSeek
        public final CustomTextView RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (!this.IconCompatParcelizer && !FirebaseDataModule.read(this, TimeUnit.MILLISECONDS)) {
                this.IconCompatParcelizer = true;
                this.AudioAttributesCompatParcelizer.read();
            }
            this.RemoteActionCompatParcelizer.close();
        }
    }

    /* JADX INFO: renamed from: o.PearlDataModule$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/PearlDataModule$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/ShapeKt;", "p0", "p1", "read", "(Lo/ShapeKt;Lo/ShapeKt;)Lo/ShapeKt;", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Z", "Lo/TypeKt;", "AudioAttributesCompatParcelizer", "(Lo/TypeKt;)Lo/TypeKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ ShapeKt RemoteActionCompatParcelizer(Companion companion, ShapeKt shapeKt, ShapeKt shapeKt2) {
            return read(shapeKt, shapeKt2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0156TypeKt AudioAttributesCompatParcelizer(C0156TypeKt p0) {
            return (p0 != null ? p0.getBody() : null) != null ? p0.MediaDescriptionCompat().write((ActivityAdapterModule) null).IconCompatParcelizer() : p0;
        }

        private static ShapeKt read(ShapeKt p0, ShapeKt p1) {
            ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
            int iIconCompatParcelizer = p0.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                String strIconCompatParcelizer = p0.IconCompatParcelizer(i);
                String strAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(i);
                if ((!TestGroupLSModel.read("Warning", strIconCompatParcelizer, true) || !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesCompatParcelizer, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) && (RemoteActionCompatParcelizer(strIconCompatParcelizer) || !read(strIconCompatParcelizer) || p1.IconCompatParcelizer(strIconCompatParcelizer) == null)) {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(strIconCompatParcelizer, strAudioAttributesCompatParcelizer);
                }
            }
            int iIconCompatParcelizer2 = p1.IconCompatParcelizer();
            for (int i2 = 0; i2 < iIconCompatParcelizer2; i2++) {
                String strIconCompatParcelizer2 = p1.IconCompatParcelizer(i2);
                if (!RemoteActionCompatParcelizer(strIconCompatParcelizer2) && read(strIconCompatParcelizer2)) {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(strIconCompatParcelizer2, p1.AudioAttributesCompatParcelizer(i2));
                }
            }
            return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        private static boolean read(String p0) {
            return (TestGroupLSModel.read(RtspHeaders.CONNECTION, p0, true) || TestGroupLSModel.read("Keep-Alive", p0, true) || TestGroupLSModel.read(RtspHeaders.PROXY_AUTHENTICATE, p0, true) || TestGroupLSModel.read("Proxy-Authorization", p0, true) || TestGroupLSModel.read("TE", p0, true) || TestGroupLSModel.read("Trailers", p0, true) || TestGroupLSModel.read("Transfer-Encoding", p0, true) || TestGroupLSModel.read("Upgrade", p0, true)) ? false : true;
        }

        private static boolean RemoteActionCompatParcelizer(String p0) {
            return TestGroupLSModel.read(RtspHeaders.CONTENT_LENGTH, p0, true) || TestGroupLSModel.read(RtspHeaders.CONTENT_ENCODING, p0, true) || TestGroupLSModel.read(RtspHeaders.CONTENT_TYPE, p0, true);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
