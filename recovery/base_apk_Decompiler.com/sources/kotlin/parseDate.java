package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0014B=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J?\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0014\u0010\u0017J'\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J:\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001dH\u0096@¢\u0006\u0004\b \u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\"\u0010 \u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R4\u0010(\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0016\u0010+\u001a\u00020\n8W@VX\u0096\f¢\u0006\u0006\u001a\u0004\b$\u0010*R\u0014\u0010$\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010-R\u0014\u0010%\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010-R\u0014\u00100\u001a\u00020.8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010/R\u0014\u0010\"\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00101R\u0018\u0010\u000f\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u00105R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000308R\u00020\u0000078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u00109R\u0018\u00103\u001a\u00060\u0005j\u0002`:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010#R\"\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000308R\u00020\u0000078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00105R\u0016\u0010>\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010=R\u0014\u0010@\u001a\u00020?8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101"}, d2 = {"Lo/parseDate;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/handleWeirdStringValue;", "Lo/handleBadMerge;", "Lo/bufferMapProperty;", "", "p0", "p1", "", "p2", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "p3", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "", "MediaDescriptionCompat", "()V", "e_", "g_", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "(Lo/DeserializationContext;Lo/_shapeForToken;)V", "Lo/getKey;", "write", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "MediaBrowserCompatMediaItem", "R", "Lkotlin/Function2;", "Lo/getConstructorDetector;", "Lo/SampleVideos;", "read", "(Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "[Ljava/lang/Object;", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "AudioAttributesImplBaseParcelizer", "", "()F", "Lo/CoercionConfig;", "()Lo/CoercionConfig;", "AudioAttributesImplApi26Parcelizer", "()J", "Lo/setPassingYear;", "MediaMetadataCompat", "Lo/setPassingYear;", "Lo/DeserializationContext;", "RatingCompat", "Lo/UTF32Reader;", "Lo/parseDate$IconCompatParcelizer;", "Lo/UTF32Reader;", "Lo/SynchronizedObject;", "MediaBrowserCompatSearchResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "J", "onCustomAction", "Lo/calloc;", "onAddQueueItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class parseDate extends _handleOddName.IconCompatParcelizer implements handleWeirdStringValue, handleBadMerge {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private DeserializationContext RatingCompat = hasSomeOfFeatures.RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private Object write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private DeserializationContext handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<IconCompatParcelizer<?>> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super handleBadMerge, ? super SampleVideos<? super getShowPopup>, ? extends Object> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private Object[] read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private setPassingYear MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final Object MediaMetadataCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private PointerInputEventHandler IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private long onCustomAction;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final UTF32Reader<IconCompatParcelizer<?>> MediaBrowserCompatSearchResultReceiver;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[_shapeForToken.values().length];
            try {
                iArr[_shapeForToken.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_shapeForToken.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_shapeForToken.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public parseDate(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = objArr;
        this.IconCompatParcelizer = pointerInputEventHandler;
        UTF32Reader<IconCompatParcelizer<?>> uTF32Reader = new UTF32Reader<>(new IconCompatParcelizer[16], 0);
        this.MediaBrowserCompatMediaItem = uTF32Reader;
        this.MediaMetadataCompat = uTF32Reader;
        this.MediaBrowserCompatSearchResultReceiver = new UTF32Reader<>(new IconCompatParcelizer[16], 0);
        this.onCustomAction = getKey.INSTANCE.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final PointerInputEventHandler getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getRead() {
        return collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnSkipToQueueItem().getRead();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnSkipToQueueItem().getIconCompatParcelizer();
    }

    @Override // kotlin.handleBadMerge
    public final CoercionConfig read() {
        return collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).getOnSkipToNext();
    }

    @Override // kotlin.handleBadMerge
    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getOnCustomAction() {
        return this.onCustomAction;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        long jD_ = d_(read().write());
        long onCustomAction = getOnCustomAction();
        long j = -1;
        return calloc.write((((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jD_ >> 32)) - ((int) (onCustomAction >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) jD_) - ((int) onCustomAction)) / 2.0f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        RemoteActionCompatParcelizer();
        super.MediaDescriptionCompat();
    }

    @Override // kotlin.Module, kotlin.forRootType
    public final void e_() {
        RemoteActionCompatParcelizer();
    }

    @Override // kotlin.forRootType
    public final void g_() {
        RemoteActionCompatParcelizer();
    }

    @Override // kotlin.handleWeirdStringValue
    public final void RemoteActionCompatParcelizer() {
        setPassingYear setpassingyear = this.MediaDescriptionCompat;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer(new handleInstantiationProblem());
            this.MediaDescriptionCompat = null;
        }
    }

    public final void IconCompatParcelizer(Object p0, Object p1, Object[] p2, PointerInputEventHandler p3) {
        boolean z = !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, p0);
        this.write = p0;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p1)) {
            z = true;
        }
        this.RemoteActionCompatParcelizer = p1;
        Object[] objArr = this.read;
        if (objArr != null && p2 == null) {
            z = true;
        }
        if (objArr == null && p2 != null) {
            z = true;
        }
        boolean z2 = (objArr == null || p2 == null || Arrays.equals(p2, objArr)) ? z : true;
        this.read = p2;
        if (getIconCompatParcelizer().getClass() != p3.getClass() || z2) {
            RemoteActionCompatParcelizer();
        }
        this.IconCompatParcelizer = p3;
    }

    @Override // kotlin.forRootType
    public final void write(DeserializationContext p0, _shapeForToken p1, long p2) {
        this.onCustomAction = p2;
        if (p1 == _shapeForToken.IconCompatParcelizer) {
            this.RatingCompat = p0;
        }
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, getCollegeName.AudioAttributesCompatParcelizer, new read(null), 1);
        }
        IconCompatParcelizer(p0, p1);
        List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                p0 = null;
                break;
            } else if (!bufferAsCopyOfValue.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.handleMediaPlayPauseIfPendingOnHandler = p0;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L4d
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                o.parseDate r5 = kotlin.parseDate.this
                o.MagicModuleSubmissionRequestBody r5 = kotlin.parseDate.write(r5)
                if (r5 == 0) goto L3a
                o.parseDate r5 = kotlin.parseDate.this
                o.MagicModuleSubmissionRequestBody r5 = kotlin.parseDate.write(r5)
                kotlin.toMagicModuleMetaRepoModel.write(r5)
                o.parseDate r1 = kotlin.parseDate.this
                r4.read = r3
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L4d
                goto L4c
            L3a:
                o.parseDate r5 = kotlin.parseDate.this
                androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.getIconCompatParcelizer()
                o.parseDate r1 = kotlin.parseDate.this
                o.handleBadMerge r1 = (kotlin.handleBadMerge) r1
                r4.read = r2
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L4d
            L4c:
                return r0
            L4d:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.parseDate.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return parseDate.this.new read(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.forRootType
    public final void MediaBrowserCompatMediaItem() {
        DeserializationContext deserializationContext = this.handleMediaPlayPauseIfPendingOnHandler;
        if (deserializationContext == null) {
            return;
        }
        List<getArrayBuilders> listAudioAttributesCompatParcelizer = deserializationContext.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (listAudioAttributesCompatParcelizer.get(i).getRemoteActionCompatParcelizer()) {
                List<getArrayBuilders> listAudioAttributesCompatParcelizer2 = deserializationContext.AudioAttributesCompatParcelizer();
                ArrayList arrayList = new ArrayList(listAudioAttributesCompatParcelizer2.size());
                int size2 = listAudioAttributesCompatParcelizer2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    getArrayBuilders getarraybuilders = listAudioAttributesCompatParcelizer2.get(i2);
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new getArrayBuilders(getarraybuilders.getIconCompatParcelizer(), getarraybuilders.getWrite(), getarraybuilders.getRead(), false, getarraybuilders.getAudioAttributesCompatParcelizer(), getarraybuilders.getWrite(), getarraybuilders.getRead(), getarraybuilders.getRemoteActionCompatParcelizer(), getarraybuilders.getRemoteActionCompatParcelizer(), getarraybuilders.getMediaBrowserCompatItemReceiver(), 0L, 1024, (MagicModuleRepositoryImplExternalSyntheticLambda0) null));
                }
                DeserializationContext deserializationContext2 = new DeserializationContext(arrayList);
                this.RatingCompat = deserializationContext2;
                IconCompatParcelizer(deserializationContext2, _shapeForToken.IconCompatParcelizer);
                IconCompatParcelizer(deserializationContext2, _shapeForToken.AudioAttributesCompatParcelizer);
                IconCompatParcelizer(deserializationContext2, _shapeForToken.read);
                this.handleMediaPlayPauseIfPendingOnHandler = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: o.parseDate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "read", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ IconCompatParcelizer<R> $AudioAttributesCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            read(th);
            return getShowPopup.INSTANCE;
        }

        public final void read(Throwable th) {
            this.$AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(IconCompatParcelizer<R> iconCompatParcelizer) {
            super(1);
            this.$AudioAttributesCompatParcelizer = iconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u0014JD\u0010\f\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u0005\u001a\u00020\u00162\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0096@¢\u0006\u0004\b\f\u0010\u0019JB\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u0005\u001a\u00020\u00162\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u0019J\u0014\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010 \u001a\u00020\u001c*\u00020\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010\"\u001a\u00020\u001b*\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u001a\u001a\u00020\u001b*\u00020$H\u0096\u0001¢\u0006\u0004\b\u001a\u0010%J\u0014\u0010&\u001a\u00020\u001b*\u00020\u001fH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0014\u0010\"\u001a\u00020)*\u00020(H\u0096\u0001¢\u0006\u0004\b\"\u0010*J\u0014\u0010+\u001a\u00020$*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b+\u0010%J\u0014\u0010,\u001a\u00020$*\u00020\u001fH\u0096\u0001¢\u0006\u0004\b,\u0010'J\u0014\u0010-\u001a\u00020(*\u00020)H\u0096\u0001¢\u0006\u0004\b-\u0010*J\u0014\u0010\u000f\u001a\u00020\u001f*\u00020$H\u0096\u0001¢\u0006\u0004\b\u000f\u0010.J\u0014\u0010\f\u001a\u00020\u001f*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\f\u0010.R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010+\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00104R\u0014\u0010\f\u001a\u0002058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u00106R\u0014\u0010:\u001a\u0002078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u00106R\u001a\u00108\u001a\u00020<8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020$8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010@R\u0014\u00101\u001a\u00020$8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010@"}, d2 = {"Lo/parseDate$IconCompatParcelizer;", "R", "Lo/getConstructorDetector;", "Lo/bufferMapProperty;", "Lo/SampleVideos;", "p0", "<init>", "(Lo/parseDate;Lo/SampleVideos;)V", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "p1", "", "read", "(Lo/DeserializationContext;Lo/_shapeForToken;)V", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Throwable;)V", "Lo/getRfBanners;", "resumeWith", "(Ljava/lang/Object;)V", "(Lo/_shapeForToken;Lo/SampleVideos;)Ljava/lang/Object;", "T", "", "Lkotlin/Function2;", "", "(JLo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "write", "Lo/assignParameter;", "", "IconCompatParcelizer", "(F)I", "Lo/ReadableObjectIdReferring;", "a_", "(J)I", "b_", "(I)F", "", "(F)F", "e_", "(J)F", "Lo/calloc;", "Lo/handleIdValue;", "(J)J", "AudioAttributesCompatParcelizer", "c_", "d_", "(F)J", "Lo/SampleVideos;", "Lo/setStateRank;", "MediaBrowserCompatItemReceiver", "Lo/setStateRank;", "Lo/_shapeForToken;", "()Lo/DeserializationContext;", "Lo/getKey;", "()J", "Lo/CoercionConfig;", "AudioAttributesImplApi26Parcelizer", "()Lo/CoercionConfig;", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/CurrentQuery;", "Lo/CurrentQuery;", "getContext", "()Lo/CurrentQuery;", "()F", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class IconCompatParcelizer<R> implements getConstructorDetector, SampleVideos<R> {

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private setStateRank<? super DeserializationContext> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final SampleVideos<R> IconCompatParcelizer;
        private final /* synthetic */ parseDate write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private _shapeForToken write = _shapeForToken.AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final CurrentQuery AudioAttributesImplApi26Parcelizer = VideoSessionResponseBody.RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.parseDate$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0129IconCompatParcelizer<T> extends getTotalMcq {
            final /* synthetic */ IconCompatParcelizer<R> AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;
            Object RemoteActionCompatParcelizer;
            /* synthetic */ Object read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0129IconCompatParcelizer(IconCompatParcelizer<R> iconCompatParcelizer, SampleVideos<? super C0129IconCompatParcelizer> sampleVideos) {
                super(sampleVideos);
                this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.read = obj;
                this.IconCompatParcelizer |= Integer.MIN_VALUE;
                return this.AudioAttributesCompatParcelizer.write(0L, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class write<T> extends getTotalMcq {
            final /* synthetic */ IconCompatParcelizer<R> AudioAttributesCompatParcelizer;
            /* synthetic */ Object IconCompatParcelizer;
            int read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(IconCompatParcelizer<R> iconCompatParcelizer, SampleVideos<? super write> sampleVideos) {
                super(sampleVideos);
                this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.IconCompatParcelizer = obj;
                this.read |= Integer.MIN_VALUE;
                return this.AudioAttributesCompatParcelizer.read(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IconCompatParcelizer(SampleVideos<? super R> sampleVideos) {
            this.write = parseDate.this;
            this.IconCompatParcelizer = sampleVideos;
        }

        @Override // kotlin.getConstructorDetector
        public final DeserializationContext write() {
            return parseDate.this.RatingCompat;
        }

        @Override // kotlin.getConstructorDetector
        public final long RemoteActionCompatParcelizer() {
            return parseDate.this.onCustomAction;
        }

        @Override // kotlin.getConstructorDetector
        public final CoercionConfig AudioAttributesImplApi26Parcelizer() {
            return parseDate.this.read();
        }

        @Override // kotlin.getConstructorDetector
        public final long read() {
            return parseDate.this.AudioAttributesImplApi26Parcelizer();
        }

        public final void read(DeserializationContext p0, _shapeForToken p1) {
            setStateRank<? super DeserializationContext> setstaterank;
            if (p1 != this.write || (setstaterank = this.RemoteActionCompatParcelizer) == null) {
                return;
            }
            this.RemoteActionCompatParcelizer = null;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterank.resumeWith(C0177getRfBanners.read(p0));
        }

        public final void RemoteActionCompatParcelizer(Throwable p0) {
            setStateRank<? super DeserializationContext> setstaterank = this.RemoteActionCompatParcelizer;
            if (setstaterank != null) {
                setstaterank.write(p0);
            }
            this.RemoteActionCompatParcelizer = null;
        }

        @Override // kotlin.SampleVideos
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final CurrentQuery getWrite() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // kotlin.SampleVideos
        public final void resumeWith(Object p0) {
            Object obj = parseDate.this.MediaMetadataCompat;
            parseDate parsedate = parseDate.this;
            synchronized (obj) {
                parsedate.MediaBrowserCompatMediaItem.IconCompatParcelizer(this);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            this.IconCompatParcelizer.resumeWith(p0);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin.getConstructorDetector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object read(long r5, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.getConstructorDetector, ? super kotlin.SampleVideos<? super T>, ? extends java.lang.Object> r7, kotlin.SampleVideos<? super T> r8) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r8 instanceof o.parseDate.IconCompatParcelizer.write
                if (r0 == 0) goto L14
                r0 = r8
                o.parseDate$IconCompatParcelizer$write r0 = (o.parseDate.IconCompatParcelizer.write) r0
                int r1 = r0.read
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.read
                int r8 = r8 + r2
                r0.read = r8
                goto L19
            L14:
                o.parseDate$IconCompatParcelizer$write r0 = new o.parseDate$IconCompatParcelizer$write
                r0.<init>(r4, r8)
            L19:
                java.lang.Object r8 = r0.IconCompatParcelizer
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.read
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: kotlin.constructSpecializedType -> L3f
                return r8
            L2a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L32:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                r0.read = r3     // Catch: kotlin.constructSpecializedType -> L3f
                java.lang.Object r4 = r4.write(r5, r7, r0)     // Catch: kotlin.constructSpecializedType -> L3f
                if (r4 != r1) goto L3e
                return r1
            L3e:
                return r4
            L3f:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.parseDate.IconCompatParcelizer.read(long, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin.getConstructorDetector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object write(long r8, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.getConstructorDetector, ? super kotlin.SampleVideos<? super T>, ? extends java.lang.Object> r10, kotlin.SampleVideos<? super T> r11) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r11 instanceof o.parseDate.IconCompatParcelizer.C0129IconCompatParcelizer
                if (r0 == 0) goto L14
                r0 = r11
                o.parseDate$IconCompatParcelizer$IconCompatParcelizer r0 = (o.parseDate.IconCompatParcelizer.C0129IconCompatParcelizer) r0
                int r1 = r0.IconCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r11 = r0.IconCompatParcelizer
                int r11 = r11 + r2
                r0.IconCompatParcelizer = r11
                goto L19
            L14:
                o.parseDate$IconCompatParcelizer$IconCompatParcelizer r0 = new o.parseDate$IconCompatParcelizer$IconCompatParcelizer
                r0.<init>(r7, r11)
            L19:
                java.lang.Object r11 = r0.read
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.IconCompatParcelizer
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r7 = r0.RemoteActionCompatParcelizer
                o.setPassingYear r7 = (kotlin.setPassingYear) r7
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)     // Catch: java.lang.Throwable -> L2e
                goto L7a
            L2e:
                r8 = move-exception
                goto L86
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L38:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                r4 = 0
                int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r11 > 0) goto L5b
                o.setStateRank<? super o.DeserializationContext> r11 = r7.RemoteActionCompatParcelizer
                if (r11 == 0) goto L5b
                o.SampleVideos r11 = (kotlin.SampleVideos) r11
                o.getRfBanners$IconCompatParcelizer r2 = kotlin.C0177getRfBanners.IconCompatParcelizer
                o.constructSpecializedType r2 = new o.constructSpecializedType
                r2.<init>(r8)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Object r2 = kotlin.SdkPayloadData.write(r2)
                java.lang.Object r2 = kotlin.C0177getRfBanners.read(r2)
                r11.resumeWith(r2)
            L5b:
                o.parseDate r11 = kotlin.parseDate.this
                o.TopUserCompanion r11 = r11.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
                o.parseDate$IconCompatParcelizer$RemoteActionCompatParcelizer r2 = new o.parseDate$IconCompatParcelizer$RemoteActionCompatParcelizer
                r4 = 0
                r2.<init>(r8, r7, r4)
                o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
                r8 = 3
                o.setPassingYear r8 = kotlin.setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(r11, r4, r4, r2, r8)
                r0.RemoteActionCompatParcelizer = r8     // Catch: java.lang.Throwable -> L82
                r0.IconCompatParcelizer = r3     // Catch: java.lang.Throwable -> L82
                java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L82
                if (r11 != r1) goto L79
                return r1
            L79:
                r7 = r8
            L7a:
                o.getDeserializationFeatures r8 = kotlin.getDeserializationFeatures.INSTANCE
                java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8
                r7.RemoteActionCompatParcelizer(r8)
                return r11
            L82:
                r7 = move-exception
                r6 = r8
                r8 = r7
                r7 = r6
            L86:
                o.getDeserializationFeatures r9 = kotlin.getDeserializationFeatures.INSTANCE
                java.util.concurrent.CancellationException r9 = (java.util.concurrent.CancellationException) r9
                r7.RemoteActionCompatParcelizer(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.parseDate.IconCompatParcelizer.write(long, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            int IconCompatParcelizer;
            final /* synthetic */ long RemoteActionCompatParcelizer;
            final /* synthetic */ IconCompatParcelizer<R> read;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
            
                if (kotlin.setCountry.IconCompatParcelizer(8, r8) == r0) goto L20;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r8.IconCompatParcelizer
                    r2 = 2
                    r3 = 8
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r2) goto L14
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    goto L3d
                L14:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L1c:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    goto L31
                L20:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                    long r6 = r8.RemoteActionCompatParcelizer
                    r9 = r8
                    o.SampleVideos r9 = (kotlin.SampleVideos) r9
                    r8.IconCompatParcelizer = r5
                    long r6 = r6 - r3
                    java.lang.Object r9 = kotlin.setCountry.IconCompatParcelizer(r6, r9)
                    if (r9 == r0) goto L60
                L31:
                    r9 = r8
                    o.SampleVideos r9 = (kotlin.SampleVideos) r9
                    r8.IconCompatParcelizer = r2
                    java.lang.Object r9 = kotlin.setCountry.IconCompatParcelizer(r3, r9)
                    if (r9 != r0) goto L3d
                    goto L60
                L3d:
                    o.parseDate$IconCompatParcelizer<R> r9 = r8.read
                    o.setStateRank r9 = o.parseDate.IconCompatParcelizer.IconCompatParcelizer(r9)
                    if (r9 == 0) goto L5d
                    o.SampleVideos r9 = (kotlin.SampleVideos) r9
                    o.getRfBanners$IconCompatParcelizer r0 = kotlin.C0177getRfBanners.IconCompatParcelizer
                    o.constructSpecializedType r0 = new o.constructSpecializedType
                    long r1 = r8.RemoteActionCompatParcelizer
                    r0.<init>(r1)
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    java.lang.Object r8 = kotlin.SdkPayloadData.write(r0)
                    java.lang.Object r8 = kotlin.C0177getRfBanners.read(r8)
                    r9.resumeWith(r8)
                L5d:
                    o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
                    return r8
                L60:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.parseDate.IconCompatParcelizer.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(long j, IconCompatParcelizer<R> iconCompatParcelizer, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = j;
                this.read = iconCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getConstructorDetector
        public final Object read(_shapeForToken _shapefortoken, SampleVideos<? super DeserializationContext> sampleVideos) {
            setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
            setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
            this.write = _shapefortoken;
            this.RemoteActionCompatParcelizer = setstatesolvedcount;
            Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
            if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objAudioAttributesCompatParcelizer;
        }

        @Override // kotlin.bufferMapProperty
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final float getRead() {
            return this.write.getRead();
        }

        @Override // kotlin.getParameter
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final float getIconCompatParcelizer() {
            return this.write.getIconCompatParcelizer();
        }

        @Override // kotlin.bufferMapProperty
        public final int a_(long j) {
            return this.write.a_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final int IconCompatParcelizer(float f) {
            return this.write.IconCompatParcelizer(f);
        }

        @Override // kotlin.getParameter
        public final float e_(long j) {
            return this.write.e_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final float write(float f) {
            return this.write.write(f);
        }

        @Override // kotlin.bufferMapProperty
        public final float b_(int i) {
            return this.write.b_(i);
        }

        @Override // kotlin.bufferMapProperty
        public final long b_(long j) {
            return this.write.b_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final float c_(long j) {
            return this.write.c_(j);
        }

        @Override // kotlin.bufferMapProperty
        public final float AudioAttributesCompatParcelizer(float f) {
            return this.write.AudioAttributesCompatParcelizer(f);
        }

        @Override // kotlin.bufferMapProperty
        public final long d_(long j) {
            return this.write.d_(j);
        }

        @Override // kotlin.getParameter
        public final long read(float f) {
            return this.write.read(f);
        }

        @Override // kotlin.bufferMapProperty
        public final long RemoteActionCompatParcelizer(float f) {
            return this.write.RemoteActionCompatParcelizer(f);
        }
    }

    private final void IconCompatParcelizer(DeserializationContext p0, _shapeForToken p1) {
        synchronized (this.MediaMetadataCompat) {
            UTF32Reader<IconCompatParcelizer<?>> uTF32Reader = this.MediaBrowserCompatSearchResultReceiver;
            uTF32Reader.read(uTF32Reader.getAudioAttributesCompatParcelizer(), this.MediaBrowserCompatMediaItem);
        }
        try {
            int i = WhenMappings.IconCompatParcelizer[p1.ordinal()];
            if (i == 1 || i == 2) {
                UTF32Reader<IconCompatParcelizer<?>> uTF32Reader2 = this.MediaBrowserCompatSearchResultReceiver;
                IconCompatParcelizer<?>[] iconCompatParcelizerArr = uTF32Reader2.IconCompatParcelizer;
                int audioAttributesCompatParcelizer = uTF32Reader2.getAudioAttributesCompatParcelizer();
                for (int i2 = 0; i2 < audioAttributesCompatParcelizer; i2++) {
                    iconCompatParcelizerArr[i2].read(p0, p1);
                }
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                UTF32Reader<IconCompatParcelizer<?>> uTF32Reader3 = this.MediaBrowserCompatSearchResultReceiver;
                int audioAttributesCompatParcelizer2 = uTF32Reader3.getAudioAttributesCompatParcelizer() - 1;
                IconCompatParcelizer<?>[] iconCompatParcelizerArr2 = uTF32Reader3.IconCompatParcelizer;
                if (audioAttributesCompatParcelizer2 < iconCompatParcelizerArr2.length) {
                    while (audioAttributesCompatParcelizer2 >= 0) {
                        iconCompatParcelizerArr2[audioAttributesCompatParcelizer2].read(p0, p1);
                        audioAttributesCompatParcelizer2--;
                    }
                }
            }
        } finally {
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.handleBadMerge
    public final <R> Object read(MagicModuleSubmissionRequestBody<? super getConstructorDetector, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos) {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(setstatesolvedcount2);
        synchronized (this.MediaMetadataCompat) {
            this.MediaBrowserCompatMediaItem.read(iconCompatParcelizer);
            SampleVideos<getShowPopup> sampleVideosWrite = VideoHeartbeatResponseBody.write(magicModuleSubmissionRequestBody, iconCompatParcelizer, iconCompatParcelizer);
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            sampleVideosWrite.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new AnonymousClass2(iconCompatParcelizer));
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer;
    }
}
