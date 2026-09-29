package kotlin;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.function.Consumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010."}, d2 = {"Lo/getEmpty;", "Landroid/view/ScrollCaptureCallback;", "Lo/valueInstantiatorInstance;", "p0", "Lo/appendReferring;", "p1", "Lo/TopUserCompanion;", "p2", "Lo/getEmpty$write;", "p3", "Landroid/view/View;", "p4", "<init>", "(Lo/valueInstantiatorInstance;Lo/appendReferring;Lo/TopUserCompanion;Lo/getEmpty$write;Landroid/view/View;)V", "Landroid/os/CancellationSignal;", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Landroid/view/ScrollCaptureSession;", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "cg_", "(Landroid/view/ScrollCaptureSession;Lo/appendReferring;Lo/SampleVideos;)Ljava/lang/Object;", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "AudioAttributesCompatParcelizer", "Lo/valueInstantiatorInstance;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/appendReferring;", "IconCompatParcelizer", "write", "Lo/getEmpty$write;", "RemoteActionCompatParcelizer", "Landroid/view/View;", "read", "Lo/TopUserCompanion;", "Lo/ContextAttributesImpl;", "AudioAttributesImplBaseParcelizer", "Lo/ContextAttributesImpl;", "AudioAttributesImplApi26Parcelizer", "", "I", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getEmpty implements ScrollCaptureCallback {
    private final valueInstantiatorInstance AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final ContextAttributesImpl AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final appendReferring IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final View write;
    private final TopUserCompanion read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final write RemoteActionCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.read |= Integer.MIN_VALUE;
            return getEmpty.this.cg_(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getEmpty$write;", "", "", "IconCompatParcelizer", "()V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write {
        void IconCompatParcelizer();

        void write();
    }

    public getEmpty(valueInstantiatorInstance valueinstantiatorinstance, appendReferring appendreferring, TopUserCompanion topUserCompanion, write writeVar, View view) {
        this.AudioAttributesCompatParcelizer = valueinstantiatorinstance;
        this.IconCompatParcelizer = appendreferring;
        this.RemoteActionCompatParcelizer = writeVar;
        this.write = view;
        this.read = College.RemoteActionCompatParcelizer(topUserCompanion, withPerCallAttribute.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = new ContextAttributesImpl(appendreferring.IconCompatParcelizer(), new RemoteActionCompatParcelizer(null));
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<Float, SampleVideos<? super Float>, Object> {
        int AudioAttributesCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        /* synthetic */ float read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                float f = this.read;
                MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getReferencedType>, Object> magicModuleSubmissionRequestBodyRemoteActionCompatParcelizer = isExplicitlySet.RemoteActionCompatParcelizer(getEmpty.this.AudioAttributesCompatParcelizer);
                if (magicModuleSubmissionRequestBodyRemoteActionCompatParcelizer != null) {
                    boolean iconCompatParcelizer = ((withAdditionalKeyDeserializers) getEmpty.this.AudioAttributesCompatParcelizer.getWrite().write(_this.INSTANCE.onSkipToPrevious())).getIconCompatParcelizer();
                    if (iconCompatParcelizer) {
                        f = -f;
                    }
                    long j = -1;
                    getReferencedType getreferencedtype = getReferencedType.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
                    this.RemoteActionCompatParcelizer = iconCompatParcelizer;
                    this.AudioAttributesCompatParcelizer = 1;
                    obj = magicModuleSubmissionRequestBodyRemoteActionCompatParcelizer.invoke(getreferencedtype, this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    z = iconCompatParcelizer;
                } else {
                    reportWrongTokenException.write("Required value was null.");
                    throw new PlanDetailsCreator();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            long write = ((getReferencedType) obj).getWrite();
            return QBankStatsResponse.write(z ? -Float.intBitsToFloat((int) write) : Float.intBitsToFloat((int) write));
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = getEmpty.this.new RemoteActionCompatParcelizer(sampleVideos);
            remoteActionCompatParcelizer.read = ((Number) obj).floatValue();
            return remoteActionCompatParcelizer;
        }

        public final Object write(float f, SampleVideos<? super Float> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(Float.valueOf(f), sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(Float f, SampleVideos<? super Float> sampleVideos) {
            return write(f.floatValue(), sampleVideos);
        }
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal p0, Consumer<Rect> p1) {
        p1.accept(VersionUtil.write(this.IconCompatParcelizer));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession p0, CancellationSignal p1, Runnable p2) {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = 0;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        p2.run();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ Consumer<Rect> AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        final /* synthetic */ Rect RemoteActionCompatParcelizer;
        final /* synthetic */ ScrollCaptureSession read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = getEmpty.this.cg_(this.read, VersionUtil.read(this.RemoteActionCompatParcelizer), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.AudioAttributesCompatParcelizer.accept(VersionUtil.write((appendReferring) obj));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = scrollCaptureSession;
            this.RemoteActionCompatParcelizer = rect;
            this.AudioAttributesCompatParcelizer = consumer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getEmpty.this.new IconCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession p0, CancellationSignal p1, Rect p2, Consumer<Rect> p3) {
        nonSharedInstance.write(this.read, p1, new IconCompatParcelizer(p0, p2, p3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cg_(android.view.ScrollCaptureSession r9, kotlin.appendReferring r10, kotlin.SampleVideos<? super kotlin.appendReferring> r11) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getEmpty.cg_(android.view.ScrollCaptureSession, o.appendReferring, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.getEmpty$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "AudioAttributesCompatParcelizer", "(J)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Long, getShowPopup> {
        public static final AnonymousClass2 RemoteActionCompatParcelizer = new AnonymousClass2();

        public final void AudioAttributesCompatParcelizer(long j) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Long l) {
            AudioAttributesCompatParcelizer(l.longValue());
            return getShowPopup.INSTANCE;
        }

        AnonymousClass2() {
            super(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ Runnable IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (getEmpty.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getEmpty.this.RemoteActionCompatParcelizer.write();
            this.IconCompatParcelizer.run();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Runnable runnable, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = runnable;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getEmpty.this.new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable p0) {
        C0201setMcqCount.IconCompatParcelizer(this.read, setRefreshToken.write, null, new AudioAttributesCompatParcelizer(p0, null), 2);
    }
}
