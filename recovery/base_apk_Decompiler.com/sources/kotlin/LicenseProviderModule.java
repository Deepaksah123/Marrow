package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.C0156TypeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0002\u0017\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0014J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0014J\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010 2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010!J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b\u0019\u0010\"J\r\u0010#\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010$J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010%R\u001a\u0010&\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0010\u0010(R\u0014\u0010)\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u00108\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\u0019\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010;R$\u0010=\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;"}, d2 = {"Lo/LicenseProviderModule;", "", "Lo/PlaybackDrmModule;", "p0", "Lo/AppThemeKt;", "p1", "Lo/FileProviderModule;", "p2", "Lo/ServiceProviderModule;", "p3", "<init>", "(Lo/PlaybackDrmModule;Lo/AppThemeKt;Lo/FileProviderModule;Lo/ServiceProviderModule;)V", "Ljava/io/IOException;", "E", "", "", "write", "(ZZLjava/io/IOException;)Ljava/io/IOException;", "", "RemoteActionCompatParcelizer", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "AudioAttributesCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda0;Z)Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "read", "IconCompatParcelizer", "MediaDescriptionCompat", "MediaMetadataCompat", "Lo/TypeKt;", "Lo/ActivityAdapterModule;", "(Lo/TypeKt;)Lo/ActivityAdapterModule;", "Lo/TypeKt$IconCompatParcelizer;", "(Z)Lo/TypeKt$IconCompatParcelizer;", "(Lo/TypeKt;)V", "RatingCompat", "(Ljava/io/IOException;)V", "(Lo/ThemeKtExternalSyntheticLambda0;)V", "call", "Lo/PlaybackDrmModule;", "()Lo/PlaybackDrmModule;", "codec", "Lo/ServiceProviderModule;", "Lo/VideoAnalyticModule;", "connection", "Lo/VideoAnalyticModule;", "AudioAttributesImplBaseParcelizer", "()Lo/VideoAnalyticModule;", "eventListener", "Lo/AppThemeKt;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/AppThemeKt;", "finder", "Lo/FileProviderModule;", "MediaBrowserCompatItemReceiver", "()Lo/FileProviderModule;", "hasFailure", "Z", "AudioAttributesImplApi26Parcelizer", "()Z", "AudioAttributesImplApi21Parcelizer", "isDuplex", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LicenseProviderModule {
    private final PlaybackDrmModule call;
    private final ServiceProviderModule codec;
    private final VideoAnalyticModule connection;
    private final AppThemeKt eventListener;
    private final FileProviderModule finder;
    private boolean hasFailure;
    private boolean isDuplex;

    public LicenseProviderModule(PlaybackDrmModule playbackDrmModule, AppThemeKt appThemeKt, FileProviderModule fileProviderModule, ServiceProviderModule serviceProviderModule) {
        toMagicModuleMetaRepoModel.write(playbackDrmModule, "");
        toMagicModuleMetaRepoModel.write(appThemeKt, "");
        toMagicModuleMetaRepoModel.write(fileProviderModule, "");
        toMagicModuleMetaRepoModel.write(serviceProviderModule, "");
        this.call = playbackDrmModule;
        this.eventListener = appThemeKt;
        this.finder = fileProviderModule;
        this.codec = serviceProviderModule;
        this.connection = serviceProviderModule.getIconCompatParcelizer();
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final PlaybackDrmModule getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final AppThemeKt getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final FileProviderModule getFinder() {
        return this.finder;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final VideoAnalyticModule getConnection() {
        return this.connection;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.finder.getAddress().getUrl().getHost(), (Object) this.connection.getRoute().getAddress().getUrl().getHost());
    }

    public final void AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            AppThemeKt.MediaBrowserCompatItemReceiver(this.call);
            this.codec.read(p0);
            AppThemeKt.RemoteActionCompatParcelizer(this.call, p0);
        } catch (IOException e) {
            AppThemeKt.RemoteActionCompatParcelizer(this.call, e);
            write(e);
            throw e;
        }
    }

    public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0, boolean p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.isDuplex = p1;
        ThemeKtExternalSyntheticLambda2 body = p0.getBody();
        toMagicModuleMetaRepoModel.write(body);
        long jContentLength = body.contentLength();
        AppThemeKt.AudioAttributesImplApi26Parcelizer(this.call);
        return new AudioAttributesCompatParcelizer(this, this.codec.read(p0, jContentLength), jContentLength);
    }

    public final void AudioAttributesCompatParcelizer() throws IOException {
        try {
            this.codec.IconCompatParcelizer();
        } catch (IOException e) {
            AppThemeKt.RemoteActionCompatParcelizer(this.call, e);
            write(e);
            throw e;
        }
    }

    public final void IconCompatParcelizer() throws IOException {
        try {
            this.codec.RemoteActionCompatParcelizer();
        } catch (IOException e) {
            AppThemeKt.RemoteActionCompatParcelizer(this.call, e);
            write(e);
            throw e;
        }
    }

    public final void RatingCompat() {
        AppThemeKt.AudioAttributesImplBaseParcelizer(this.call);
    }

    public final C0156TypeKt.IconCompatParcelizer read(boolean p0) throws IOException {
        try {
            C0156TypeKt.IconCompatParcelizer iconCompatParcelizerWrite = this.codec.write(p0);
            if (iconCompatParcelizerWrite != null) {
                iconCompatParcelizerWrite.write(this);
            }
            return iconCompatParcelizerWrite;
        } catch (IOException e) {
            AppThemeKt.write(this.call, e);
            write(e);
            throw e;
        }
    }

    public final void read(C0156TypeKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AppThemeKt.AudioAttributesCompatParcelizer(this.call, p0);
    }

    public final ActivityAdapterModule IconCompatParcelizer(C0156TypeKt p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            String strIconCompatParcelizer = C0156TypeKt.IconCompatParcelizer(p0, RtspHeaders.CONTENT_TYPE);
            long j = this.codec.read(p0);
            return new onPaymentError(strIconCompatParcelizer, j, CustomAppBarLayout.AudioAttributesCompatParcelizer(new read(this, this.codec.IconCompatParcelizer(p0), j)));
        } catch (IOException e) {
            AppThemeKt.write(this.call, e);
            write(e);
            throw e;
        }
    }

    public final void MediaDescriptionCompat() {
        this.codec.getIconCompatParcelizer().MediaMetadataCompat();
    }

    public final void RemoteActionCompatParcelizer() {
        this.codec.write();
    }

    public final void read() {
        this.codec.write();
        this.call.read(this, true, true, null);
    }

    private final void write(IOException p0) {
        this.hasFailure = true;
        this.finder.AudioAttributesCompatParcelizer(p0);
        this.codec.getIconCompatParcelizer().AudioAttributesCompatParcelizer(this.call, p0);
    }

    public final <E extends IOException> E write(boolean z, boolean z2, E e) {
        if (e != null) {
            write(e);
        }
        if (z2) {
            if (e != null) {
                AppThemeKt.RemoteActionCompatParcelizer(this.call, e);
            } else {
                AppThemeKt.write(this.call);
            }
        }
        if (z) {
            if (e != null) {
                AppThemeKt.write(this.call, e);
            } else {
                AppThemeKt.MediaBrowserCompatCustomActionResultReceiver(this.call);
            }
        }
        return (E) this.call.read(this, z2, z, e);
    }

    public final void MediaMetadataCompat() {
        this.call.read(this, true, false, null);
    }

    final class AudioAttributesCompatParcelizer extends updateTimelineSelection {
        private final long AudioAttributesCompatParcelizer;
        private /* synthetic */ LicenseProviderModule IconCompatParcelizer;
        private long RemoteActionCompatParcelizer;
        private boolean read;
        private boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(LicenseProviderModule licenseProviderModule, setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault, long j) {
            super(setcompounddrawableswithintrinsicboundscompatdefault);
            toMagicModuleMetaRepoModel.write(setcompounddrawableswithintrinsicboundscompatdefault, "");
            this.IconCompatParcelizer = licenseProviderModule;
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.updateTimelineSelection, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final void IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            if (this.read) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.AudioAttributesCompatParcelizer;
            if (j2 != -1 && this.RemoteActionCompatParcelizer + j > j2) {
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.AudioAttributesCompatParcelizer);
                sb.append(" bytes but received ");
                sb.append(this.RemoteActionCompatParcelizer + j);
                throw new ProtocolException(sb.toString());
            }
            try {
                super.IconCompatParcelizer(resetcurrentselectedposition, j);
                this.RemoteActionCompatParcelizer += j;
            } catch (IOException e) {
                throw write(e);
            }
        }

        @Override // kotlin.updateTimelineSelection, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw write(e);
            }
        }

        @Override // kotlin.updateTimelineSelection, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.read) {
                return;
            }
            this.read = true;
            long j = this.AudioAttributesCompatParcelizer;
            if (j != -1 && this.RemoteActionCompatParcelizer != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                write(null);
            } catch (IOException e) {
                throw write(e);
            }
        }

        private final <E extends IOException> E write(E e) {
            if (this.write) {
                return e;
            }
            this.write = true;
            return (E) this.IconCompatParcelizer.write(false, true, e);
        }
    }

    public final class read extends setRelatedModuleAdapter {
        private boolean AudioAttributesCompatParcelizer;
        private final long IconCompatParcelizer;
        private /* synthetic */ LicenseProviderModule MediaBrowserCompatCustomActionResultReceiver;
        private boolean RemoteActionCompatParcelizer;
        private long read;
        private boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(LicenseProviderModule licenseProviderModule, setLockedFromSeek setlockedfromseek, long j) {
            super(setlockedfromseek);
            toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
            this.MediaBrowserCompatCustomActionResultReceiver = licenseProviderModule;
            this.IconCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = true;
            if (j == 0) {
                AudioAttributesCompatParcelizer(null);
            }
        }

        @Override // kotlin.setRelatedModuleAdapter, kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            if (this.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jAudioAttributesCompatParcelizer = read().AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
                if (this.AudioAttributesCompatParcelizer) {
                    this.AudioAttributesCompatParcelizer = false;
                    this.MediaBrowserCompatCustomActionResultReceiver.getEventListener();
                    AppThemeKt.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.getCall());
                }
                if (jAudioAttributesCompatParcelizer == -1) {
                    AudioAttributesCompatParcelizer(null);
                    return -1L;
                }
                long j2 = this.read + jAudioAttributesCompatParcelizer;
                long j3 = this.IconCompatParcelizer;
                if (j3 != -1 && j2 > j3) {
                    StringBuilder sb = new StringBuilder("expected ");
                    sb.append(this.IconCompatParcelizer);
                    sb.append(" bytes but received ");
                    sb.append(j2);
                    throw new ProtocolException(sb.toString());
                }
                this.read = j2;
                if (j2 == j3) {
                    AudioAttributesCompatParcelizer(null);
                }
                return jAudioAttributesCompatParcelizer;
            } catch (IOException e) {
                throw AudioAttributesCompatParcelizer(e);
            }
        }

        @Override // kotlin.setRelatedModuleAdapter, kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            try {
                super.close();
                AudioAttributesCompatParcelizer(null);
            } catch (IOException e) {
                throw AudioAttributesCompatParcelizer(e);
            }
        }

        private <E extends IOException> E AudioAttributesCompatParcelizer(E e) {
            if (this.write) {
                return e;
            }
            this.write = true;
            if (e == null && this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = false;
                this.MediaBrowserCompatCustomActionResultReceiver.getEventListener();
                AppThemeKt.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.getCall());
            }
            return (E) this.MediaBrowserCompatCustomActionResultReceiver.write(true, false, e);
        }
    }
}
