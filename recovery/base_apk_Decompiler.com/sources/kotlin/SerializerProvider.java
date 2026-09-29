package kotlin;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin._parseName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lo/SerializerProvider;", "Lo/typing;", "Lo/TopUserCompanion;", "Landroid/view/View;", "p0", "Lo/setViews;", "p1", "p2", "<init>", "(Landroid/view/View;Lo/setViews;Lo/TopUserCompanion;)V", "Lo/nullsUsing;", "", "read", "(Lo/nullsUsing;Lo/SampleVideos;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "Landroid/view/inputmethod/InputConnection;", "write", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "IconCompatParcelizer", "()Landroid/view/View;", "RemoteActionCompatParcelizer", "Lo/setViews;", "AudioAttributesCompatParcelizer", "Lo/TopUserCompanion;", "Lo/_parseName;", "Lo/prepend;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "()Z", "Lo/CurrentQuery;", "bj_", "()Lo/CurrentQuery;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SerializerProvider implements typing {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final TopUserCompanion RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final AtomicReference<_parseName.RemoteActionCompatParcelizer<prepend>> write = _parseName.write();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setViews read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final View IconCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object read;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return SerializerProvider.this.read(null, this);
        }
    }

    public SerializerProvider(View view, setViews setviews, TopUserCompanion topUserCompanion) {
        this.IconCompatParcelizer = view;
        this.read = setviews;
        this.RemoteActionCompatParcelizer = topUserCompanion;
    }

    @Override // kotlin.JsonTypeIdResolver
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final View getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        prepend prependVar = (prepend) _parseName.write(this.write);
        return prependVar != null && prependVar.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.JsonTypeIdResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.nullsUsing r6, kotlin.SampleVideos<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.SerializerProvider.read
            if (r0 == 0) goto L14
            r0 = r7
            o.SerializerProvider$read r0 = (o.SerializerProvider.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.SerializerProvider$read r0 = new o.SerializerProvider$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4f
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            java.util.concurrent.atomic.AtomicReference<o._parseName$RemoteActionCompatParcelizer<o.prepend>> r7 = r5.write
            o.SerializerProvider$4 r2 = new o.SerializerProvider$4
            r2.<init>(r6, r5)
            o.getAnswerMap r2 = (kotlin.getAnswerMap) r2
            o.SerializerProvider$AudioAttributesCompatParcelizer r6 = new o.SerializerProvider$AudioAttributesCompatParcelizer
            r4 = 0
            r6.<init>(r4)
            o.MagicModuleSubmissionRequestBody r6 = (kotlin.MagicModuleSubmissionRequestBody) r6
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = kotlin._parseName.AudioAttributesCompatParcelizer(r7, r2, r6, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            o.PlanDetailsCreator r5 = new o.PlanDetailsCreator
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SerializerProvider.read(o.nullsUsing, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.SerializerProvider$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/TopUserCompanion;", "p0", "Lo/prepend;", "IconCompatParcelizer", "(Lo/TopUserCompanion;)Lo/prepend;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<TopUserCompanion, prepend> {
        final /* synthetic */ nullsUsing $read;
        final /* synthetic */ SerializerProvider AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.SerializerProvider$4$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ SerializerProvider RemoteActionCompatParcelizer;

            public final void AudioAttributesCompatParcelizer() {
                College.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, null);
            }

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                AudioAttributesCompatParcelizer();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SerializerProvider serializerProvider) {
                super(0);
                this.RemoteActionCompatParcelizer = serializerProvider;
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final prepend invoke(TopUserCompanion topUserCompanion) {
            return new prepend(this.$read, new AnonymousClass5(this.AudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(nullsUsing nullsusing, SerializerProvider serializerProvider) {
            super(1);
            this.$read = nullsusing;
            this.AudioAttributesCompatParcelizer = serializerProvider;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "methodSession", "Landroidx/compose/ui/platform/InputMethodSession;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<prepend, SampleVideos<?>, Object> {
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                prepend prependVar = (prepend) this.RemoteActionCompatParcelizer;
                SerializerProvider serializerProvider = SerializerProvider.this;
                this.RemoteActionCompatParcelizer = prependVar;
                this.IconCompatParcelizer = serializerProvider;
                this.read = 1;
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this;
                setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(audioAttributesCompatParcelizer), 1);
                setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
                serializerProvider.read.write();
                setstatesolvedcount.write((getAnswerMap<? super Throwable, getShowPopup>) new AnonymousClass4(prependVar, serializerProvider));
                Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
                if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                    getAnsweredMcqCount.write(audioAttributesCompatParcelizer);
                }
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        /* JADX INFO: renamed from: o.SerializerProvider$AudioAttributesCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
            final /* synthetic */ prepend $IconCompatParcelizer;
            final /* synthetic */ SerializerProvider RemoteActionCompatParcelizer;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(Throwable th) {
                RemoteActionCompatParcelizer(th);
                return getShowPopup.INSTANCE;
            }

            public final void RemoteActionCompatParcelizer(Throwable th) {
                this.$IconCompatParcelizer.RemoteActionCompatParcelizer();
                this.RemoteActionCompatParcelizer.read.IconCompatParcelizer();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(prepend prependVar, SerializerProvider serializerProvider) {
                super(1);
                this.$IconCompatParcelizer = prependVar;
                this.RemoteActionCompatParcelizer = serializerProvider;
            }
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = SerializerProvider.this.new AudioAttributesCompatParcelizer(sampleVideos);
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(prepend prependVar, SampleVideos<?> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(prependVar, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final InputConnection write(EditorInfo p0) {
        prepend prependVar = (prepend) _parseName.write(this.write);
        if (prependVar != null) {
            return prependVar.read(p0);
        }
        return null;
    }

    @Override // kotlin.TopUserCompanion
    /* JADX INFO: renamed from: bj_ */
    public final CurrentQuery getIconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getIconCompatParcelizer();
    }
}
