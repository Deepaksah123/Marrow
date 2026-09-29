package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.C0156TypeKt;
import kotlin.Metadata;
import kotlin.getMPresenter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0007\u0015\u0017\u0012\r+\u001d\u001eB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0017\u0010\u001bJ\u0017\u0010\r\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\u0017\u0010!J\u0019\u0010\r\u001a\u0004\u0018\u00010#2\u0006\u0010\u0003\u001a\u00020\"H\u0016¢\u0006\u0004\b\r\u0010$J\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\u0012\u0010%J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020 ¢\u0006\u0004\b\r\u0010&J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020(¢\u0006\u0004\b\u0012\u0010)J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010*R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0017\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b+\u0010.R\u0014\u0010+\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u001e\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0018\u00102\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0018\u0010\u001d\u001a\u00020\"*\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u00107R\u0018\u00109\u001a\u00020\"*\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00108"}, d2 = {"Lo/onPaymentSuccess;", "Lo/ServiceProviderModule;", "Lo/ThemeKtExternalSyntheticLambda3;", "p0", "Lo/VideoAnalyticModule;", "p1", "Lo/LessonCompletedDialog;", "p2", "Lo/LessonCompletedDialogonViewCreatedllm1;", "p3", "<init>", "(Lo/ThemeKtExternalSyntheticLambda3;Lo/VideoAnalyticModule;Lo/LessonCompletedDialog;Lo/LessonCompletedDialogonViewCreatedllm1;)V", "", "write", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "read", "(Lo/ThemeKtExternalSyntheticLambda0;J)Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "Lo/setBookTitle;", "RemoteActionCompatParcelizer", "(Lo/setBookTitle;)V", "IconCompatParcelizer", "()Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "Lo/ThemeAlphaConstantsKt;", "Lo/setLockedFromSeek;", "(Lo/ThemeAlphaConstantsKt;)Lo/setLockedFromSeek;", "(J)Lo/setLockedFromSeek;", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "()Lo/setLockedFromSeek;", "Lo/TypeKt;", "(Lo/TypeKt;)Lo/setLockedFromSeek;", "", "Lo/TypeKt$IconCompatParcelizer;", "(Z)Lo/TypeKt$IconCompatParcelizer;", "(Lo/TypeKt;)J", "(Lo/TypeKt;)V", "Lo/ShapeKt;", "", "(Lo/ShapeKt;Ljava/lang/String;)V", "(Lo/ThemeKtExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "Lo/ThemeKtExternalSyntheticLambda3;", "Lo/VideoAnalyticModule;", "()Lo/VideoAnalyticModule;", "Lo/UpgradePlanActivityContractPresenter;", "Lo/UpgradePlanActivityContractPresenter;", "Lo/LessonCompletedDialogonViewCreatedllm1;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/LessonCompletedDialog;", "", "I", "Lo/ShapeKt;", "(Lo/ThemeKtExternalSyntheticLambda0;)Z", "(Lo/TypeKt;)Z", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class onPaymentSuccess implements ServiceProviderModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ThemeKtExternalSyntheticLambda3 RemoteActionCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private ShapeKt MediaBrowserCompatCustomActionResultReceiver;
    private final VideoAnalyticModule IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final LessonCompletedDialog write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final UpgradePlanActivityContractPresenter AudioAttributesCompatParcelizer;
    private final LessonCompletedDialogonViewCreatedllm1 read;

    public onPaymentSuccess(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3, VideoAnalyticModule videoAnalyticModule, LessonCompletedDialog lessonCompletedDialog, LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) {
        toMagicModuleMetaRepoModel.write(videoAnalyticModule, "");
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
        this.RemoteActionCompatParcelizer = themeKtExternalSyntheticLambda3;
        this.IconCompatParcelizer = videoAnalyticModule;
        this.write = lessonCompletedDialog;
        this.read = lessonCompletedDialogonViewCreatedllm1;
        this.AudioAttributesCompatParcelizer = new UpgradePlanActivityContractPresenter(lessonCompletedDialog);
    }

    @Override // kotlin.ServiceProviderModule
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final VideoAnalyticModule getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private static boolean AudioAttributesCompatParcelizer(C0156TypeKt c0156TypeKt) {
        return TestGroupLSModel.read("chunked", C0156TypeKt.IconCompatParcelizer(c0156TypeKt, "Transfer-Encoding"), true);
    }

    private static boolean RemoteActionCompatParcelizer(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) {
        return TestGroupLSModel.read("chunked", themeKtExternalSyntheticLambda0.AudioAttributesCompatParcelizer("Transfer-Encoding"), true);
    }

    @Override // kotlin.ServiceProviderModule
    public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault read(ThemeKtExternalSyntheticLambda0 p0, long p1) throws ProtocolException {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.getBody() != null && p0.getBody().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (RemoteActionCompatParcelizer(p0)) {
            return read();
        }
        if (p1 != -1) {
            return AudioAttributesImplApi26Parcelizer();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // kotlin.ServiceProviderModule
    public final void write() {
        getIconCompatParcelizer().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.ServiceProviderModule
    public final void read(ThemeKtExternalSyntheticLambda0 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setMPresenter setmpresenter = setMPresenter.INSTANCE;
        Proxy.Type type = getIconCompatParcelizer().getRoute().getProxy().type();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
        read(p0.getHeaders(), setMPresenter.write(p0, type));
    }

    @Override // kotlin.ServiceProviderModule
    public final long read(C0156TypeKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!FragmentProviderModule.write(p0)) {
            return 0L;
        }
        if (AudioAttributesCompatParcelizer(p0)) {
            return -1L;
        }
        return FirebaseDataModule.write(p0);
    }

    @Override // kotlin.ServiceProviderModule
    public final setLockedFromSeek IconCompatParcelizer(C0156TypeKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!FragmentProviderModule.write(p0)) {
            return write(0L);
        }
        if (AudioAttributesCompatParcelizer(p0)) {
            return IconCompatParcelizer(p0.getRequest().getUrl());
        }
        long jWrite = FirebaseDataModule.write(p0);
        if (jWrite != -1) {
            return write(jWrite);
        }
        return AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.ServiceProviderModule
    public final void IconCompatParcelizer() throws IOException {
        this.read.flush();
    }

    @Override // kotlin.ServiceProviderModule
    public final void RemoteActionCompatParcelizer() {
        this.read.flush();
    }

    public final void read(ShapeKt p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (this.AudioAttributesImplApi21Parcelizer != 0) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.read.read(p1).read("\r\n");
        int iIconCompatParcelizer = p0.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            this.read.read(p0.IconCompatParcelizer(i)).read(": ").read(p0.AudioAttributesCompatParcelizer(i)).read("\r\n");
        }
        this.read.read("\r\n");
        this.AudioAttributesImplApi21Parcelizer = 1;
    }

    @Override // kotlin.ServiceProviderModule
    public final C0156TypeKt.IconCompatParcelizer write(boolean p0) {
        int i = this.AudioAttributesImplApi21Parcelizer;
        if (i != 1 && i != 2 && i != 3) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            throw new IllegalStateException(sb.toString().toString());
        }
        try {
            getMPresenter.Companion companion = getMPresenter.INSTANCE;
            getMPresenter getmpresenterAudioAttributesCompatParcelizer = getMPresenter.Companion.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            C0156TypeKt.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = new C0156TypeKt.IconCompatParcelizer().read(getmpresenterAudioAttributesCompatParcelizer.read).read(getmpresenterAudioAttributesCompatParcelizer.IconCompatParcelizer).write(getmpresenterAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.write());
            if (p0 && getmpresenterAudioAttributesCompatParcelizer.IconCompatParcelizer == 100) {
                return null;
            }
            if (getmpresenterAudioAttributesCompatParcelizer.IconCompatParcelizer == 100) {
                this.AudioAttributesImplApi21Parcelizer = 3;
                return iconCompatParcelizerRemoteActionCompatParcelizer;
            }
            int i2 = getmpresenterAudioAttributesCompatParcelizer.IconCompatParcelizer;
            if (102 <= i2 && i2 < 200) {
                this.AudioAttributesImplApi21Parcelizer = 3;
                return iconCompatParcelizerRemoteActionCompatParcelizer;
            }
            this.AudioAttributesImplApi21Parcelizer = 4;
            return iconCompatParcelizerRemoteActionCompatParcelizer;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(String.valueOf(getIconCompatParcelizer().getRoute().getAddress().getUrl().MediaDescriptionCompat())), e);
        }
    }

    private final setCompoundDrawablesWithIntrinsicBoundsCompatdefault read() {
        if (this.AudioAttributesImplApi21Parcelizer != 1) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.AudioAttributesImplApi21Parcelizer = 2;
        return new IconCompatParcelizer();
    }

    private final setCompoundDrawablesWithIntrinsicBoundsCompatdefault AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer != 1) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.AudioAttributesImplApi21Parcelizer = 2;
        return new AudioAttributesImplApi26Parcelizer();
    }

    private final setLockedFromSeek write(long p0) {
        if (this.AudioAttributesImplApi21Parcelizer != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.AudioAttributesImplApi21Parcelizer = 5;
        return new AudioAttributesCompatParcelizer(p0);
    }

    private final setLockedFromSeek IconCompatParcelizer(ThemeAlphaConstantsKt p0) {
        if (this.AudioAttributesImplApi21Parcelizer != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.AudioAttributesImplApi21Parcelizer = 5;
        return new read(this, p0);
    }

    private final setLockedFromSeek AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.AudioAttributesImplApi21Parcelizer = 5;
        getIconCompatParcelizer().MediaMetadataCompat();
        return new AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(setBookTitle p0) {
        CustomTextView customTextViewAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        p0.IconCompatParcelizer(CustomTextView.IconCompatParcelizer);
        customTextViewAudioAttributesCompatParcelizer.br_();
        customTextViewAudioAttributesCompatParcelizer.bn_();
    }

    public final void write(C0156TypeKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        long jWrite = FirebaseDataModule.write(p0);
        if (jWrite == -1) {
            return;
        }
        setLockedFromSeek setlockedfromseekWrite = write(jWrite);
        FirebaseDataModule.read(setlockedfromseekWrite, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        setlockedfromseekWrite.close();
    }

    final class AudioAttributesImplApi26Parcelizer implements setCompoundDrawablesWithIntrinsicBoundsCompatdefault {
        private boolean AudioAttributesCompatParcelizer;
        private final setBookTitle read;

        public AudioAttributesImplApi26Parcelizer() {
            this.read = new setBookTitle(onPaymentSuccess.this.read.RemoteActionCompatParcelizer());
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final CustomTextView RemoteActionCompatParcelizer() {
            return this.read;
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final void IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            if (this.AudioAttributesCompatParcelizer) {
                throw new IllegalStateException("closed".toString());
            }
            FirebaseDataModule.AudioAttributesCompatParcelizer(resetcurrentselectedposition.getSize(), 0L, j);
            onPaymentSuccess.this.read.IconCompatParcelizer(resetcurrentselectedposition, j);
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
        public final void flush() throws IOException {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            onPaymentSuccess.this.read.flush();
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            this.AudioAttributesCompatParcelizer = true;
            onPaymentSuccess.RemoteActionCompatParcelizer(this.read);
            onPaymentSuccess.this.AudioAttributesImplApi21Parcelizer = 3;
        }
    }

    final class IconCompatParcelizer implements setCompoundDrawablesWithIntrinsicBoundsCompatdefault {
        private boolean IconCompatParcelizer;
        private final setBookTitle write;

        public IconCompatParcelizer() {
            this.write = new setBookTitle(onPaymentSuccess.this.read.RemoteActionCompatParcelizer());
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final CustomTextView RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final void IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            if (this.IconCompatParcelizer) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            onPaymentSuccess.this.read.MediaDescriptionCompat(j);
            onPaymentSuccess.this.read.read("\r\n");
            onPaymentSuccess.this.read.IconCompatParcelizer(resetcurrentselectedposition, j);
            onPaymentSuccess.this.read.read("\r\n");
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
        public final void flush() {
            synchronized (this) {
                if (this.IconCompatParcelizer) {
                    return;
                }
                onPaymentSuccess.this.read.flush();
            }
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (this) {
                if (this.IconCompatParcelizer) {
                    return;
                }
                this.IconCompatParcelizer = true;
                onPaymentSuccess.this.read.read("0\r\n\r\n");
                onPaymentSuccess.RemoteActionCompatParcelizer(this.write);
                onPaymentSuccess.this.AudioAttributesImplApi21Parcelizer = 3;
            }
        }
    }

    abstract class RemoteActionCompatParcelizer implements setLockedFromSeek {
        private boolean IconCompatParcelizer;
        private final setBookTitle RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer() {
            this.RemoteActionCompatParcelizer = new setBookTitle(onPaymentSuccess.this.write.RemoteActionCompatParcelizer());
        }

        protected final void IconCompatParcelizer() {
            this.IconCompatParcelizer = true;
        }

        protected final boolean read() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.setLockedFromSeek
        public final CustomTextView RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.setLockedFromSeek
        public long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            try {
                return onPaymentSuccess.this.write.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
            } catch (IOException e) {
                onPaymentSuccess.this.getIconCompatParcelizer().MediaMetadataCompat();
                this.write();
                throw e;
            }
        }

        public final void write() {
            if (onPaymentSuccess.this.AudioAttributesImplApi21Parcelizer == 6) {
                return;
            }
            if (onPaymentSuccess.this.AudioAttributesImplApi21Parcelizer == 5) {
                onPaymentSuccess.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                onPaymentSuccess.this.AudioAttributesImplApi21Parcelizer = 6;
            } else {
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(onPaymentSuccess.this.AudioAttributesImplApi21Parcelizer);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    final class AudioAttributesCompatParcelizer extends RemoteActionCompatParcelizer {
        private long AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(long j) {
            super();
            this.AudioAttributesCompatParcelizer = j;
            if (j == 0) {
                write();
            }
        }

        @Override // o.onPaymentSuccess.RemoteActionCompatParcelizer, kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
            }
            if (read()) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.AudioAttributesCompatParcelizer;
            if (j2 == 0) {
                return -1L;
            }
            long jAudioAttributesCompatParcelizer = super.AudioAttributesCompatParcelizer(resetcurrentselectedposition, Math.min(j2, j));
            if (jAudioAttributesCompatParcelizer == -1) {
                onPaymentSuccess.this.getIconCompatParcelizer().MediaMetadataCompat();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                write();
                throw protocolException;
            }
            long j3 = this.AudioAttributesCompatParcelizer - jAudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = j3;
            if (j3 == 0) {
                write();
            }
            return jAudioAttributesCompatParcelizer;
        }

        @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (read()) {
                return;
            }
            if (this.AudioAttributesCompatParcelizer != 0 && !FirebaseDataModule.read(this, TimeUnit.MILLISECONDS)) {
                onPaymentSuccess.this.getIconCompatParcelizer().MediaMetadataCompat();
                write();
            }
            IconCompatParcelizer();
        }
    }

    final class read extends RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private long IconCompatParcelizer;
        private final ThemeAlphaConstantsKt read;
        private /* synthetic */ onPaymentSuccess write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(onPaymentSuccess onpaymentsuccess, ThemeAlphaConstantsKt themeAlphaConstantsKt) {
            super();
            toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt, "");
            this.write = onpaymentsuccess;
            this.read = themeAlphaConstantsKt;
            this.IconCompatParcelizer = -1L;
            this.AudioAttributesCompatParcelizer = true;
        }

        @Override // o.onPaymentSuccess.RemoteActionCompatParcelizer, kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
            }
            if (read()) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.AudioAttributesCompatParcelizer) {
                return -1L;
            }
            long j2 = this.IconCompatParcelizer;
            if (j2 == 0 || j2 == -1) {
                AudioAttributesCompatParcelizer();
                if (!this.AudioAttributesCompatParcelizer) {
                    return -1L;
                }
            }
            long jAudioAttributesCompatParcelizer = super.AudioAttributesCompatParcelizer(resetcurrentselectedposition, Math.min(j, this.IconCompatParcelizer));
            if (jAudioAttributesCompatParcelizer == -1) {
                this.write.getIconCompatParcelizer().MediaMetadataCompat();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                write();
                throw protocolException;
            }
            this.IconCompatParcelizer -= jAudioAttributesCompatParcelizer;
            return jAudioAttributesCompatParcelizer;
        }

        private final void AudioAttributesCompatParcelizer() throws IOException {
            if (this.IconCompatParcelizer != -1) {
                this.write.write.onMediaButtonEvent();
            }
            try {
                this.IconCompatParcelizer = this.write.write.MediaBrowserCompatMediaItem();
                String string = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) this.write.write.onMediaButtonEvent()).toString();
                if (this.IconCompatParcelizer < 0 || (string.length() > 0 && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string, ";"))) {
                    StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                    sb.append(this.IconCompatParcelizer);
                    sb.append(string);
                    sb.append('\"');
                    throw new ProtocolException(sb.toString());
                }
                if (this.IconCompatParcelizer == 0) {
                    this.AudioAttributesCompatParcelizer = false;
                    onPaymentSuccess onpaymentsuccess = this.write;
                    onpaymentsuccess.MediaBrowserCompatCustomActionResultReceiver = onpaymentsuccess.AudioAttributesCompatParcelizer.write();
                    ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3 = this.write.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda3);
                    AppTheme cookieJar = themeKtExternalSyntheticLambda3.getCookieJar();
                    ThemeAlphaConstantsKt themeAlphaConstantsKt = this.read;
                    ShapeKt shapeKt = this.write.MediaBrowserCompatCustomActionResultReceiver;
                    toMagicModuleMetaRepoModel.write(shapeKt);
                    FragmentProviderModule.RemoteActionCompatParcelizer(cookieJar, themeAlphaConstantsKt, shapeKt);
                    write();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (read()) {
                return;
            }
            if (this.AudioAttributesCompatParcelizer && !FirebaseDataModule.read(this, TimeUnit.MILLISECONDS)) {
                this.write.getIconCompatParcelizer().MediaMetadataCompat();
                write();
            }
            IconCompatParcelizer();
        }
    }

    final class AudioAttributesImplApi21Parcelizer extends RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;

        public AudioAttributesImplApi21Parcelizer() {
            super();
        }

        @Override // o.onPaymentSuccess.RemoteActionCompatParcelizer, kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
            }
            if (read()) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.AudioAttributesCompatParcelizer) {
                return -1L;
            }
            long jAudioAttributesCompatParcelizer = super.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
            if (jAudioAttributesCompatParcelizer != -1) {
                return jAudioAttributesCompatParcelizer;
            }
            this.AudioAttributesCompatParcelizer = true;
            write();
            return -1L;
        }

        @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (read()) {
                return;
            }
            if (!this.AudioAttributesCompatParcelizer) {
                write();
            }
            IconCompatParcelizer();
        }
    }
}
