package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Glide;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001.BU\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u00142\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\b\u0002\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\u001f\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010 \u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u001c2.\u0010\u0006\u001a*\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001dH\u0086@¢\u0006\u0004\b \u0010!JX\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u001c24\u0010\b\u001a0\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"H\u0086@¢\u0006\u0004\b\u001a\u0010#J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010$J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010$J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010%R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0007¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b\u0015\u0010+R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b\u001a\u0010-R\u0014\u0010 \u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\u0002028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R+\u00103\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b \u00109\"\u0004\b\u0017\u0010:R\u001b\u00107\u001a\u00028\u00008GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b6\u00109R\u001b\u00100\u001a\u00028\u00008AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b\u0017\u00109R+\u0010,\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00058G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b,\u0010\u0013\"\u0004\b.\u0010?R\u0011\u0010=\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b7\u0010@R\u0015\u0010&\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\bA\u0010<R+\u0010A\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00058G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010>\u001a\u0004\b0\u0010\u0013\"\u0004\b\u0015\u0010?R/\u0010;\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00008C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00108\u001a\u0004\bA\u00109\"\u0004\b.\u0010:R7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u00108\u001a\u0004\b.\u0010B\"\u0004\b\u0015\u0010CR\u0014\u0010E\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010D"}, d2 = {"Lo/Glide;", "T", "", "p0", "Lkotlin/Function1;", "", "p1", "Lkotlin/Function0;", "p2", "Lo/setOrientation;", "p3", "", "p4", "<init>", "(Ljava/lang/Object;Lo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/setOrientation;Lo/getAnswerMap;)V", "Lo/copyFrom;", "p5", "(Ljava/lang/Object;Lo/copyFrom;Lo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/setOrientation;Lo/getAnswerMap;)V", "MediaMetadataCompat", "()F", "", "write", "(Lo/copyFrom;Ljava/lang/Object;)V", "RemoteActionCompatParcelizer", "(FLo/SampleVideos;)Ljava/lang/Object;", "(FLjava/lang/Object;F)Ljava/lang/Object;", "IconCompatParcelizer", "(FLjava/lang/Object;)Ljava/lang/Object;", "Lo/Flow;", "Lkotlin/Function3;", "Lo/InstallReferrerClient;", "Lo/SampleVideos;", "AudioAttributesCompatParcelizer", "(Lo/Flow;Lo/getModuleData;Lo/SampleVideos;)Ljava/lang/Object;", "Lkotlin/Function4;", "(Ljava/lang/Object;Lo/Flow;Lo/getMagicModuleStat;Lo/SampleVideos;)Ljava/lang/Object;", "(F)F", "(Ljava/lang/Object;)Z", "MediaDescriptionCompat", "Lo/getAnswerMap;", "onCommand", "Lo/getCreatedOnDateMs;", "Lo/setOrientation;", "()Lo/setOrientation;", "AudioAttributesImplApi26Parcelizer", "()Lo/getAnswerMap;", "read", "Lo/JsonAlias;", "AudioAttributesImplApi21Parcelizer", "Lo/JsonAlias;", "Lo/setEmptyVisibility;", "AudioAttributesImplBaseParcelizer", "Lo/setEmptyVisibility;", "()Lo/setEmptyVisibility;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "Lo/InputAccessor;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "RatingCompat", "Lo/parseDouble;", "MediaBrowserCompatSearchResultReceiver", "Lo/nextTokenToRead;", "(F)V", "()Z", "MediaBrowserCompatMediaItem", "()Lo/copyFrom;", "(Lo/copyFrom;)V", "Lo/InstallReferrerClient;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Glide<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final InstallReferrerClient MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final JsonAlias AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<T, Boolean> read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setEmptyVisibility MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final InputAccessor RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final parseDouble MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final nextTokenToRead AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getAnswerMap<Float, Float> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final nextTokenToRead MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final parseDouble MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final parseDouble AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Float> RemoteActionCompatParcelizer;
    private final setOrientation<Float> write;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ Glide<T> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Glide<T> glide, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.write = glide;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.AudioAttributesCompatParcelizer(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ Glide<T> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(Glide<T> glide, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.write = glide;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.IconCompatParcelizer(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Glide(T t, getAnswerMap<? super Float, Float> getanswermap, getCreatedOnDateMs<Float> getcreatedondatems, setOrientation<Float> setorientation, getAnswerMap<? super T, Boolean> getanswermap2) {
        this.IconCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = getcreatedondatems;
        this.write = setorientation;
        this.read = getanswermap2;
        this.AudioAttributesCompatParcelizer = new JsonAlias();
        this.MediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(this);
        this.AudioAttributesImplBaseParcelizer = available.RemoteActionCompatParcelizer$default(t, null, 2, null);
        this.MediaBrowserCompatItemReceiver = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.ReferrerDetails
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Glide.AudioAttributesImplBaseParcelizer(this.read);
            }
        });
        this.AudioAttributesImplApi21Parcelizer = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.GeneratedAppGlideModuleImpl
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Glide.write(this.AudioAttributesCompatParcelizer);
            }
        });
        this.AudioAttributesImplApi26Parcelizer = getInputCodeUtf8.AudioAttributesCompatParcelizer(Float.NaN);
        this.MediaDescriptionCompat = _qbuf.IconCompatParcelizer(_qbuf.RemoteActionCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.OkHttpGlideModule
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Float.valueOf(Glide.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer));
            }
        });
        this.MediaBrowserCompatMediaItem = getInputCodeUtf8.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        this.RatingCompat = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.MediaMetadataCompat = available.RemoteActionCompatParcelizer$default(LottieAnimationViewSavedState.AudioAttributesCompatParcelizer(), null, 2, null);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new AudioAttributesImplApi21Parcelizer(this);
    }

    public final setOrientation<Float> write() {
        return this.write;
    }

    public final getAnswerMap<T, Boolean> IconCompatParcelizer() {
        return this.read;
    }

    public /* synthetic */ Glide(Object obj, copyFrom copyfrom, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, setOrientation setorientation, getAnswerMap getanswermap2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(obj, copyfrom, getanswermap, getcreatedondatems, setorientation, (i & 32) != 0 ? new getAnswerMap() { // from class: o.GeneratedAppGlideModule
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(Glide.AudioAttributesCompatParcelizer(obj2));
            }
        } : getanswermap2);
    }

    public Glide(T t, copyFrom<T> copyfrom, getAnswerMap<? super Float, Float> getanswermap, getCreatedOnDateMs<Float> getcreatedondatems, setOrientation<Float> setorientation, getAnswerMap<? super T, Boolean> getanswermap2) {
        this(t, getanswermap, getcreatedondatems, setorientation, getanswermap2);
        write((copyFrom) copyfrom);
        IconCompatParcelizer(t);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/Glide$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setEmptyVisibility;", "Lo/Flow;", "p0", "Lkotlin/Function2;", "Lo/Placeholder;", "Lo/SampleVideos;", "", "", "p1", "RemoteActionCompatParcelizer", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/Glide$MediaBrowserCompatCustomActionResultReceiver$IconCompatParcelizer;", "read", "Lo/Glide$MediaBrowserCompatCustomActionResultReceiver$IconCompatParcelizer;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver implements setEmptyVisibility {
        final /* synthetic */ Glide<T> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final IconCompatParcelizer AudioAttributesCompatParcelizer;

        MediaBrowserCompatCustomActionResultReceiver(Glide<T> glide) {
            this.RemoteActionCompatParcelizer = glide;
            this.AudioAttributesCompatParcelizer = new IconCompatParcelizer(glide);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/Glide$MediaBrowserCompatCustomActionResultReceiver$IconCompatParcelizer;", "Lo/Placeholder;", "", "p0", "", "write", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer implements Placeholder {
            final /* synthetic */ Glide<T> RemoteActionCompatParcelizer;

            IconCompatParcelizer(Glide<T> glide) {
                this.RemoteActionCompatParcelizer = glide;
            }

            @Override // kotlin.Placeholder
            public final void write(float p0) {
                InstallReferrerClient.IconCompatParcelizer$default(((Glide) this.RemoteActionCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.RemoteActionCompatParcelizer.IconCompatParcelizer(p0), BitmapDescriptorFactory.HUE_RED, 2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material/AnchoredDragScope;", "it", "Landroidx/compose/material/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getModuleData<InstallReferrerClient, copyFrom<T>, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ MagicModuleSubmissionRequestBody<Placeholder, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
            int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.write;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    IconCompatParcelizer iconCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver.this.AudioAttributesCompatParcelizer;
                    MagicModuleSubmissionRequestBody<Placeholder, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
                    this.write = 1;
                    if (magicModuleSubmissionRequestBody.invoke(iconCompatParcelizer, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super Placeholder, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                super(3, sampleVideos);
                this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            }

            @Override // kotlin.getModuleData
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Object AudioAttributesCompatParcelizer(InstallReferrerClient installReferrerClient, copyFrom<T> copyfrom, SampleVideos<? super getShowPopup> sampleVideos) {
                return MediaBrowserCompatCustomActionResultReceiver.this.new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, sampleVideos).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.setEmptyVisibility
        public final Object RemoteActionCompatParcelizer(Flow flow, MagicModuleSubmissionRequestBody<? super Placeholder, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(flow, new AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, null), sampleVideos);
            return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final setEmptyVisibility getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private final void RemoteActionCompatParcelizer(T t) {
        this.AudioAttributesImplBaseParcelizer.write(t);
    }

    public final T AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer();
    }

    public final T MediaBrowserCompatCustomActionResultReceiver() {
        return (T) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object AudioAttributesImplBaseParcelizer(Glide glide) {
        Object objMediaBrowserCompatMediaItem = glide.MediaBrowserCompatMediaItem();
        if (objMediaBrowserCompatMediaItem != null) {
            return objMediaBrowserCompatMediaItem;
        }
        float fAudioAttributesImplApi26Parcelizer = glide.AudioAttributesImplApi26Parcelizer();
        if (!Float.isNaN(fAudioAttributesImplApi26Parcelizer)) {
            return glide.RemoteActionCompatParcelizer(fAudioAttributesImplApi26Parcelizer, glide.AudioAttributesCompatParcelizer(), BitmapDescriptorFactory.HUE_RED);
        }
        return glide.AudioAttributesCompatParcelizer();
    }

    public final T RemoteActionCompatParcelizer() {
        return (T) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object write(Glide glide) {
        Object objMediaBrowserCompatMediaItem = glide.MediaBrowserCompatMediaItem();
        if (objMediaBrowserCompatMediaItem != null) {
            return objMediaBrowserCompatMediaItem;
        }
        float fAudioAttributesImplApi26Parcelizer = glide.AudioAttributesImplApi26Parcelizer();
        if (!Float.isNaN(fAudioAttributesImplApi26Parcelizer)) {
            return glide.IconCompatParcelizer(fAudioAttributesImplApi26Parcelizer, glide.AudioAttributesCompatParcelizer());
        }
        return glide.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(float f) {
        this.AudioAttributesImplApi26Parcelizer.write(f);
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
    }

    public final float MediaMetadataCompat() {
        if (Float.isNaN(AudioAttributesImplApi26Parcelizer())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return AudioAttributesImplApi26Parcelizer();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return MediaBrowserCompatMediaItem() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float MediaBrowserCompatItemReceiver(Glide glide) {
        float fIconCompatParcelizer = glide.read().IconCompatParcelizer(glide.AudioAttributesCompatParcelizer());
        float fIconCompatParcelizer2 = glide.read().IconCompatParcelizer(glide.RemoteActionCompatParcelizer()) - fIconCompatParcelizer;
        float fAbs = Math.abs(fIconCompatParcelizer2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fMediaMetadataCompat = (glide.MediaMetadataCompat() - fIconCompatParcelizer) / fIconCompatParcelizer2;
        if (fMediaMetadataCompat < 1.0E-6f) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (fMediaMetadataCompat > 0.999999f) {
            return 1.0f;
        }
        return fMediaMetadataCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(float f) {
        this.MediaBrowserCompatMediaItem.write(f);
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
    }

    private final T MediaBrowserCompatMediaItem() {
        return this.RatingCompat.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(T t) {
        this.RatingCompat.write(t);
    }

    private final void write(copyFrom<T> copyfrom) {
        this.MediaMetadataCompat.write(copyfrom);
    }

    public final copyFrom<T> read() {
        return (copyFrom) this.MediaMetadataCompat.getRemoteActionCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void write$default(Glide glide, copyFrom copyfrom, Object obj, int i, Object obj2) {
        if ((i & 2) != 0 && (Float.isNaN(glide.AudioAttributesImplApi26Parcelizer()) || (obj = copyfrom.IconCompatParcelizer(glide.AudioAttributesImplApi26Parcelizer())) == null)) {
            obj = glide.MediaBrowserCompatCustomActionResultReceiver();
        }
        glide.write((copyFrom<Object>) copyfrom, obj);
    }

    public final void write(copyFrom<T> p0, T p1) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(read(), p0)) {
            return;
        }
        write((copyFrom) p0);
        if (IconCompatParcelizer(p1)) {
            return;
        }
        read(p1);
    }

    public final Object RemoteActionCompatParcelizer(float f, SampleVideos<? super getShowPopup> sampleVideos) {
        T tAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        T tRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(MediaMetadataCompat(), tAudioAttributesCompatParcelizer, f);
        if (this.read.invoke(tRemoteActionCompatParcelizer).booleanValue()) {
            Object objWrite = LottieAnimationViewSavedState.write(this, tRemoteActionCompatParcelizer, f, sampleVideos);
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
        }
        Object objWrite2 = LottieAnimationViewSavedState.write(this, tAudioAttributesCompatParcelizer, f, sampleVideos);
        return objWrite2 == getYear.IconCompatParcelizer() ? objWrite2 : getShowPopup.INSTANCE;
    }

    private final T RemoteActionCompatParcelizer(float p0, T p1, float p2) {
        copyFrom<T> copyfrom = read();
        float fIconCompatParcelizer = copyfrom.IconCompatParcelizer(p1);
        float fFloatValue = this.RemoteActionCompatParcelizer.invoke().floatValue();
        if (fIconCompatParcelizer != p0 && !Float.isNaN(fIconCompatParcelizer)) {
            if (fIconCompatParcelizer < p0) {
                if (p2 >= fFloatValue) {
                    T tIconCompatParcelizer = copyfrom.IconCompatParcelizer(p0, true);
                    toMagicModuleMetaRepoModel.write(tIconCompatParcelizer);
                    return tIconCompatParcelizer;
                }
                T tIconCompatParcelizer2 = copyfrom.IconCompatParcelizer(p0, true);
                toMagicModuleMetaRepoModel.write(tIconCompatParcelizer2);
                if (p0 >= Math.abs(fIconCompatParcelizer + Math.abs(this.IconCompatParcelizer.invoke(Float.valueOf(Math.abs(copyfrom.IconCompatParcelizer(tIconCompatParcelizer2) - fIconCompatParcelizer))).floatValue()))) {
                    return tIconCompatParcelizer2;
                }
            } else {
                if (p2 <= (-fFloatValue)) {
                    T tIconCompatParcelizer3 = copyfrom.IconCompatParcelizer(p0, false);
                    toMagicModuleMetaRepoModel.write(tIconCompatParcelizer3);
                    return tIconCompatParcelizer3;
                }
                T tIconCompatParcelizer4 = copyfrom.IconCompatParcelizer(p0, false);
                toMagicModuleMetaRepoModel.write(tIconCompatParcelizer4);
                float fAbs = Math.abs(fIconCompatParcelizer - Math.abs(this.IconCompatParcelizer.invoke(Float.valueOf(Math.abs(fIconCompatParcelizer - copyfrom.IconCompatParcelizer(tIconCompatParcelizer4)))).floatValue()));
                if (p0 >= BitmapDescriptorFactory.HUE_RED ? p0 <= fAbs : Math.abs(p0) >= fAbs) {
                    return tIconCompatParcelizer4;
                }
            }
        }
        return p1;
    }

    private final T IconCompatParcelizer(float p0, T p1) {
        copyFrom<T> copyfrom = read();
        float fIconCompatParcelizer = copyfrom.IconCompatParcelizer(p1);
        if (fIconCompatParcelizer != p0 && !Float.isNaN(fIconCompatParcelizer)) {
            if (fIconCompatParcelizer < p0) {
                T tIconCompatParcelizer = copyfrom.IconCompatParcelizer(p0, true);
                if (tIconCompatParcelizer != null) {
                    return tIconCompatParcelizer;
                }
            } else {
                T tIconCompatParcelizer2 = copyfrom.IconCompatParcelizer(p0, false);
                if (tIconCompatParcelizer2 != null) {
                    return tIconCompatParcelizer2;
                }
            }
        }
        return p1;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/Glide$AudioAttributesImplApi21Parcelizer;", "Lo/InstallReferrerClient;", "", "p0", "p1", "", "IconCompatParcelizer", "(FF)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer implements InstallReferrerClient {
        final /* synthetic */ Glide<T> RemoteActionCompatParcelizer;

        AudioAttributesImplApi21Parcelizer(Glide<T> glide) {
            this.RemoteActionCompatParcelizer = glide;
        }

        @Override // kotlin.InstallReferrerClient
        public final void IconCompatParcelizer(float p0, float p1) {
            this.RemoteActionCompatParcelizer.read(p0);
            this.RemoteActionCompatParcelizer.write(p1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.Flow r7, kotlin.getModuleData<? super kotlin.InstallReferrerClient, ? super kotlin.copyFrom<T>, ? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o.Glide.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.Glide$AudioAttributesCompatParcelizer r0 = (o.Glide.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            o.Glide$AudioAttributesCompatParcelizer r0 = new o.Glide$AudioAttributesCompatParcelizer
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L81
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.JsonAlias r9 = r6.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L81
            o.Glide$write r2 = new o.Glide$write     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L81
            o.getAnswerMap r2 = (kotlin.getAnswerMap) r2     // Catch: java.lang.Throwable -> L81
            r0.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Throwable -> L81
            java.lang.Object r7 = r9.AudioAttributesCompatParcelizer(r7, r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r7 != r1) goto L4a
            return r1
        L4a:
            o.copyFrom r7 = r6.read()
            float r8 = r6.AudioAttributesImplApi26Parcelizer()
            java.lang.Object r7 = r7.IconCompatParcelizer(r8)
            if (r7 == 0) goto L7e
            float r8 = r6.AudioAttributesImplApi26Parcelizer()
            o.copyFrom r9 = r6.read()
            float r9 = r9.IconCompatParcelizer(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L7e
            o.getAnswerMap<T, java.lang.Boolean> r8 = r6.read
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7e
            r6.RemoteActionCompatParcelizer(r7)
        L7e:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L81:
            r7 = move-exception
            o.copyFrom r8 = r6.read()
            float r9 = r6.AudioAttributesImplApi26Parcelizer()
            java.lang.Object r8 = r8.IconCompatParcelizer(r9)
            if (r8 == 0) goto Lb6
            float r9 = r6.AudioAttributesImplApi26Parcelizer()
            o.copyFrom r0 = r6.read()
            float r0 = r0.IconCompatParcelizer(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lb6
            o.getAnswerMap<T, java.lang.Boolean> r9 = r6.read
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb6
            r6.RemoteActionCompatParcelizer(r8)
        Lb6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Glide.AudioAttributesCompatParcelizer(o.Flow, o.getModuleData, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ Glide<T> AudioAttributesCompatParcelizer;
        int read;
        final /* synthetic */ getModuleData<InstallReferrerClient, copyFrom<T>, SampleVideos<? super getShowPopup>, Object> write;

        /* JADX INFO: renamed from: o.Glide$write$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "latestAnchors", "Landroidx/compose/material/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<copyFrom<T>, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ getModuleData<InstallReferrerClient, copyFrom<T>, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;
            /* synthetic */ Object IconCompatParcelizer;
            int RemoteActionCompatParcelizer;
            final /* synthetic */ Glide<T> read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    copyFrom<T> copyfrom = (copyFrom) this.IconCompatParcelizer;
                    getModuleData<InstallReferrerClient, copyFrom<T>, SampleVideos<? super getShowPopup>, Object> getmoduledata = this.AudioAttributesCompatParcelizer;
                    InstallReferrerClient installReferrerClient = ((Glide) this.read).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    this.RemoteActionCompatParcelizer = 1;
                    if (getmoduledata.AudioAttributesCompatParcelizer(installReferrerClient, copyfrom, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(getModuleData<? super InstallReferrerClient, ? super copyFrom<T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, Glide<T> glide, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = getmoduledata;
                this.read = glide;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
                anonymousClass5.IconCompatParcelizer = obj;
                return anonymousClass5;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(copyFrom<T> copyfrom, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(copyfrom, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final Glide<T> glide = this.AudioAttributesCompatParcelizer;
                this.read = 1;
                if (LottieAnimationViewSavedState.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.isWebp
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Glide.write.read(glide);
                    }
                }, new AnonymousClass5(this.write, this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final copyFrom read(Glide glide) {
            return glide.read();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(Glide<T> glide, getModuleData<? super InstallReferrerClient, ? super copyFrom<T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = glide;
            this.write = getmoduledata;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new write(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(T r7, kotlin.Flow r8, kotlin.getMagicModuleStat<? super kotlin.InstallReferrerClient, ? super kotlin.copyFrom<T>, ? super T, ? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r9, kotlin.SampleVideos<? super kotlin.getShowPopup> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof o.Glide.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r10
            o.Glide$IconCompatParcelizer r0 = (o.Glide.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.RemoteActionCompatParcelizer
            int r10 = r10 + r2
            r0.RemoteActionCompatParcelizer = r10
            goto L19
        L14:
            o.Glide$IconCompatParcelizer r0 = new o.Glide$IconCompatParcelizer
            r0.<init>(r6, r10)
        L19:
            java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L89
            goto L54
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.copyFrom r10 = r6.read()
            boolean r10 = r10.RemoteActionCompatParcelizer(r7)
            if (r10 == 0) goto Lc2
            o.JsonAlias r10 = r6.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L89
            o.Glide$RemoteActionCompatParcelizer r2 = new o.Glide$RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L89
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L89
            o.getAnswerMap r2 = (kotlin.getAnswerMap) r2     // Catch: java.lang.Throwable -> L89
            r0.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r10.AudioAttributesCompatParcelizer(r8, r2, r0)     // Catch: java.lang.Throwable -> L89
            if (r7 != r1) goto L54
            return r1
        L54:
            r6.read(r5)
            o.copyFrom r7 = r6.read()
            float r8 = r6.AudioAttributesImplApi26Parcelizer()
            java.lang.Object r7 = r7.IconCompatParcelizer(r8)
            if (r7 == 0) goto Lc5
            float r8 = r6.AudioAttributesImplApi26Parcelizer()
            o.copyFrom r9 = r6.read()
            float r9 = r9.IconCompatParcelizer(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto Lc5
            o.getAnswerMap<T, java.lang.Boolean> r8 = r6.read
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc5
            goto Lc2
        L89:
            r7 = move-exception
            r6.read(r5)
            o.copyFrom r8 = r6.read()
            float r9 = r6.AudioAttributesImplApi26Parcelizer()
            java.lang.Object r8 = r8.IconCompatParcelizer(r9)
            if (r8 == 0) goto Lc1
            float r9 = r6.AudioAttributesImplApi26Parcelizer()
            o.copyFrom r10 = r6.read()
            float r10 = r10.IconCompatParcelizer(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lc1
            o.getAnswerMap<T, java.lang.Boolean> r9 = r6.read
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lc1
            r6.RemoteActionCompatParcelizer(r8)
        Lc1:
            throw r7
        Lc2:
            r6.RemoteActionCompatParcelizer(r7)
        Lc5:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Glide.IconCompatParcelizer(java.lang.Object, o.Flow, o.getMagicModuleStat, o.SampleVideos):java.lang.Object");
    }

    public static /* synthetic */ Object IconCompatParcelizer$default(Glide glide, Object obj, Flow flow, getMagicModuleStat getmagicmodulestat, SampleVideos sampleVideos, int i, Object obj2) {
        if ((i & 2) != 0) {
            flow = Flow.read;
        }
        return glide.IconCompatParcelizer(obj, flow, getmagicmodulestat, sampleVideos);
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ getMagicModuleStat<InstallReferrerClient, copyFrom<T>, T, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;
        final /* synthetic */ Glide<T> IconCompatParcelizer;
        final /* synthetic */ T RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer.read(this.RemoteActionCompatParcelizer);
                final Glide<T> glide = this.IconCompatParcelizer;
                this.read = 1;
                if (LottieAnimationViewSavedState.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.rewind
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Glide.RemoteActionCompatParcelizer.write(glide);
                    }
                }, new AnonymousClass1(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.Glide$RemoteActionCompatParcelizer$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "<destruct>", "Lkotlin/Pair;", "Landroidx/compose/material/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<Pair<? extends copyFrom<T>, ? extends T>, SampleVideos<? super getShowPopup>, Object> {
            /* synthetic */ Object AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;
            final /* synthetic */ Glide<T> RemoteActionCompatParcelizer;
            final /* synthetic */ getMagicModuleStat<InstallReferrerClient, copyFrom<T>, T, SampleVideos<? super getShowPopup>, Object> read;

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o.Glide$RemoteActionCompatParcelizer$1 for r5v4 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.getMonthName
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r5.IconCompatParcelizer
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L39
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L17:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    java.lang.Object r6 = r5.AudioAttributesCompatParcelizer
                    o.getSubscriptionExpiresOn r6 = (kotlin.Pair) r6
                    java.lang.Object r1 = r6.RemoteActionCompatParcelizer()
                    o.copyFrom r1 = (kotlin.copyFrom) r1
                    java.lang.Object r6 = r6.read()
                    o.getMagicModuleStat<o.InstallReferrerClient, o.copyFrom<T>, T, o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r3 = r5.read
                    o.Glide<T> r4 = r5.RemoteActionCompatParcelizer
                    o.InstallReferrerClient r4 = kotlin.Glide.RemoteActionCompatParcelizer(r4)
                    r5.IconCompatParcelizer = r2
                    java.lang.Object r5 = r3.write(r4, r1, r6, r5)
                    if (r5 != r0) goto L39
                    return r0
                L39:
                    o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Glide.RemoteActionCompatParcelizer.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(getMagicModuleStat<? super InstallReferrerClient, ? super copyFrom<T>, ? super T, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmagicmodulestat, Glide<T> glide, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.read = getmagicmodulestat;
                this.RemoteActionCompatParcelizer = glide;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.read, this.RemoteActionCompatParcelizer, sampleVideos);
                anonymousClass1.AudioAttributesCompatParcelizer = obj;
                return anonymousClass1;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pair<? extends copyFrom<T>, ? extends T> pair, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(pair, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair write(Glide glide) {
            return setAction.write(glide.read(), glide.MediaBrowserCompatCustomActionResultReceiver());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(Glide<T> glide, T t, getMagicModuleStat<? super InstallReferrerClient, ? super copyFrom<T>, ? super T, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmagicmodulestat, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = glide;
            this.RemoteActionCompatParcelizer = t;
            this.AudioAttributesCompatParcelizer = getmagicmodulestat;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final float IconCompatParcelizer(float p0) {
        return getQues.read((Float.isNaN(AudioAttributesImplApi26Parcelizer()) ? BitmapDescriptorFactory.HUE_RED : AudioAttributesImplApi26Parcelizer()) + p0, read().write(), read().read());
    }

    public final float RemoteActionCompatParcelizer(float p0) {
        float fIconCompatParcelizer = IconCompatParcelizer(p0);
        float fAudioAttributesImplApi26Parcelizer = Float.isNaN(AudioAttributesImplApi26Parcelizer()) ? BitmapDescriptorFactory.HUE_RED : AudioAttributesImplApi26Parcelizer();
        read(fIconCompatParcelizer);
        return fIconCompatParcelizer - fAudioAttributesImplApi26Parcelizer;
    }

    private final boolean IconCompatParcelizer(final T p0) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.ParcelFileDescriptorRewinderInternalRewinder
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Glide.RemoteActionCompatParcelizer(this.write, p0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup RemoteActionCompatParcelizer(Glide glide, Object obj) {
        InstallReferrerClient installReferrerClient = glide.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        float fIconCompatParcelizer = glide.read().IconCompatParcelizer(obj);
        if (!Float.isNaN(fIconCompatParcelizer)) {
            InstallReferrerClient.IconCompatParcelizer$default(installReferrerClient, fIconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 2, null);
            glide.read((Object) null);
        }
        glide.RemoteActionCompatParcelizer(obj);
        return getShowPopup.INSTANCE;
    }
}
