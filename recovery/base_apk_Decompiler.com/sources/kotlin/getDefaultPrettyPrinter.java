package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\f\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\u001a\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010.R\u001a\u0010\u0017\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b\u0013\u00101"}, d2 = {"Lo/getDefaultPrettyPrinter;", "Lo/getPlatform;", "Landroid/view/Choreographer;", "p0", "Landroid/os/Handler;", "p1", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "AudioAttributesCompatParcelizer", "()Ljava/lang/Runnable;", "", "MediaBrowserCompatItemReceiver", "()V", "", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "IconCompatParcelizer", "(Landroid/view/Choreographer$FrameCallback;)V", "write", "Lo/CurrentQuery;", "RemoteActionCompatParcelizer", "(Lo/CurrentQuery;Ljava/lang/Runnable;)V", "AudioAttributesImplApi21Parcelizer", "Landroid/view/Choreographer;", "()Landroid/view/Choreographer;", "MediaBrowserCompatCustomActionResultReceiver", "Landroid/os/Handler;", "", "MediaBrowserCompatMediaItem", "Ljava/lang/Object;", "read", "Lo/setCardContent;", "onCustomAction", "Lo/setCardContent;", "", "RatingCompat", "Ljava/util/List;", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplBaseParcelizer", "", "MediaDescriptionCompat", "Z", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "Lo/getDefaultPrettyPrinter$read;", "Lo/getDefaultPrettyPrinter$read;", "Lo/appendDesc;", "Lo/appendDesc;", "()Lo/appendDesc;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDefaultPrettyPrinter extends getPlatform {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Choreographer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final read MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Handler RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final appendDesc AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Object read;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private List<Choreographer.FrameCallback> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private List<Choreographer.FrameCallback> write;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final setCardContent<Runnable> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int AudioAttributesCompatParcelizer = 8;
    private static final RenewEligible<CurrentQuery> IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(AnonymousClass1.write);
    private static final ThreadLocal<CurrentQuery> AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer();

    private getDefaultPrettyPrinter(Choreographer choreographer, Handler handler) {
        this.AudioAttributesCompatParcelizer = choreographer;
        this.RemoteActionCompatParcelizer = handler;
        this.read = new Object();
        this.IconCompatParcelizer = new setCardContent<>();
        this.write = new ArrayList();
        this.AudioAttributesImplBaseParcelizer = new ArrayList();
        this.MediaBrowserCompatCustomActionResultReceiver = new read();
        this.AudioAttributesImplApi21Parcelizer = new _createUntypedSerializer(choreographer, this);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Choreographer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/getDefaultPrettyPrinter$read;", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "()V", "", "p0", "doFrame", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements Choreographer.FrameCallback, Runnable {
        read() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            getDefaultPrettyPrinter.this.MediaBrowserCompatItemReceiver();
            Object obj = getDefaultPrettyPrinter.this.read;
            getDefaultPrettyPrinter getdefaultprettyprinter = getDefaultPrettyPrinter.this;
            synchronized (obj) {
                if (getdefaultprettyprinter.write.isEmpty()) {
                    getdefaultprettyprinter.getAudioAttributesCompatParcelizer().removeFrameCallback(this);
                    getdefaultprettyprinter.AudioAttributesImplApi26Parcelizer = false;
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long p0) {
            getDefaultPrettyPrinter.this.RemoteActionCompatParcelizer.removeCallbacks(this);
            getDefaultPrettyPrinter.this.MediaBrowserCompatItemReceiver();
            getDefaultPrettyPrinter.this.AudioAttributesCompatParcelizer(p0);
        }
    }

    private final Runnable AudioAttributesCompatParcelizer() {
        Runnable runnableAudioAttributesImplBaseParcelizer;
        synchronized (this.read) {
            runnableAudioAttributesImplBaseParcelizer = this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }
        return runnableAudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        boolean z;
        while (true) {
            Runnable runnableAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (runnableAudioAttributesCompatParcelizer != null) {
                runnableAudioAttributesCompatParcelizer.run();
            } else {
                synchronized (this.read) {
                    if (this.IconCompatParcelizer.isEmpty()) {
                        z = false;
                        this.MediaBrowserCompatItemReceiver = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(long p0) {
        synchronized (this.read) {
            if (this.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer = false;
                List<Choreographer.FrameCallback> list = this.write;
                this.write = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(p0);
                }
                list.clear();
            }
        }
    }

    public final void IconCompatParcelizer(Choreographer.FrameCallback p0) {
        synchronized (this.read) {
            this.write.add(p0);
            if (!this.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer = true;
                this.AudioAttributesCompatParcelizer.postFrameCallback(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void write(Choreographer.FrameCallback p0) {
        synchronized (this.read) {
            this.write.remove(p0);
        }
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final appendDesc getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.getPlatform
    public final void RemoteActionCompatParcelizer(CurrentQuery p0, Runnable p1) {
        synchronized (this.read) {
            this.IconCompatParcelizer.addLast(p1);
            if (!this.MediaBrowserCompatItemReceiver) {
                this.MediaBrowserCompatItemReceiver = true;
                this.RemoteActionCompatParcelizer.post(this.MediaBrowserCompatCustomActionResultReceiver);
                if (!this.AudioAttributesImplApi26Parcelizer) {
                    this.AudioAttributesImplApi26Parcelizer = true;
                    this.AudioAttributesCompatParcelizer.postFrameCallback(this.MediaBrowserCompatCustomActionResultReceiver);
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.getDefaultPrettyPrinter$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007"}, d2 = {"Lo/getDefaultPrettyPrinter$write;", "", "<init>", "()V", "Lo/CurrentQuery;", "IconCompatParcelizer", "Lo/RenewEligible;", "()Lo/CurrentQuery;", "RemoteActionCompatParcelizer", "Ljava/lang/ThreadLocal;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/ThreadLocal;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final CurrentQuery IconCompatParcelizer() {
            return (CurrentQuery) getDefaultPrettyPrinter.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }

        public final CurrentQuery write() {
            if (_createAndCacheUntypedSerializer.write()) {
                return IconCompatParcelizer();
            }
            CurrentQuery currentQuery = (CurrentQuery) getDefaultPrettyPrinter.AudioAttributesImplApi26Parcelizer.get();
            if (currentQuery != null) {
                return currentQuery;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.getDefaultPrettyPrinter$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/CurrentQuery;", "IconCompatParcelizer", "()Lo/CurrentQuery;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<CurrentQuery> {
        public static final AnonymousClass1 write = new AnonymousClass1();

        /* JADX INFO: renamed from: o.getDefaultPrettyPrinter$1$IconCompatParcelizer */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Choreographer>, Object> {
            int RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.RemoteActionCompatParcelizer != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return Choreographer.getInstance();
            }

            IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new IconCompatParcelizer(sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Choreographer> sampleVideos) {
                return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final CurrentQuery invoke() {
            getDefaultPrettyPrinter getdefaultprettyprinter = new getDefaultPrettyPrinter(_createAndCacheUntypedSerializer.write() ? Choreographer.getInstance() : (Choreographer) setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(setMbbsVerificationYear.RemoteActionCompatParcelizer(), new IconCompatParcelizer(null)), StdKeyDeserializerStringFactoryKeyDeserializer.write(Looper.getMainLooper()), null);
            return getdefaultprettyprinter.plus(getdefaultprettyprinter.getAudioAttributesImplApi21Parcelizer());
        }

        AnonymousClass1() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getDefaultPrettyPrinter$IconCompatParcelizer;", "Ljava/lang/ThreadLocal;", "Lo/CurrentQuery;", "read", "()Lo/CurrentQuery;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends ThreadLocal<CurrentQuery> {
        IconCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final CurrentQuery initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                getDefaultPrettyPrinter getdefaultprettyprinter = new getDefaultPrettyPrinter(choreographer, StdKeyDeserializerStringFactoryKeyDeserializer.write(looperMyLooper), null);
                return getdefaultprettyprinter.plus(getdefaultprettyprinter.getAudioAttributesImplApi21Parcelizer());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    public /* synthetic */ getDefaultPrettyPrinter(Choreographer choreographer, Handler handler, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(choreographer, handler);
    }
}
