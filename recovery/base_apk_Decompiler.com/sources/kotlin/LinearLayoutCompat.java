package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.LinearLayoutCompat;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJb\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0005\u001a\u00028\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0002\u0010\b\u001a\u00028\u00002\"\b\u0002\u0010\n\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012JZ\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0007\u001a\u00028\u00002 \u0010\b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u001bJ\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u0019\u0010\u001dR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0011\u0010 R\u0016\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u0014\u0010$R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(R\u0011\u0010'\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010*\u001a\u00028\u00018G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010,\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b.\u0010+R+\u0010.\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020/8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b\u001e\u00101\"\u0004\b)\u00102R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b,\u00100\u001a\u0004\b)\u0010+\"\u0004\b\u0019\u00103R\u0014\u0010\u0017\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u00105R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u00109\u001a\u00028\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00108R\u0014\u0010:\u001a\u00028\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R\u0016\u0010;\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u00108R\u0016\u0010<\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u00108"}, d2 = {"Lo/LinearLayoutCompat;", "T", "Lo/ScrollingTabContainerView;", "V", "", "p0", "Lo/evictionCount;", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/Object;Lo/evictionCount;Ljava/lang/Object;Ljava/lang/String;)V", "Lo/setOrientation;", "Lkotlin/Function1;", "", "Lo/LinearLayoutCompatLayoutParams;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;Lo/setOrientation;Ljava/lang/Object;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/setMeasureWithLargestChildEnabled;", "RemoteActionCompatParcelizer", "(Lo/setMeasureWithLargestChildEnabled;Ljava/lang/Object;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "AudioAttributesImplApi26Parcelizer", "()V", "read", "(Ljava/lang/Object;Lo/SampleVideos;)Ljava/lang/Object;", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/parseDouble;", "()Lo/parseDouble;", "MediaBrowserCompatItemReceiver", "Lo/evictionCount;", "()Lo/evictionCount;", "MediaDescriptionCompat", "Ljava/lang/Object;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lo/setShowDividers;", "Lo/setShowDividers;", "IconCompatParcelizer", "()Lo/setShowDividers;", "write", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "()Lo/ScrollingTabContainerView;", "AudioAttributesImplBaseParcelizer", "", "Lo/InputAccessor;", "()Z", "(Z)V", "(Ljava/lang/Object;)V", "Lo/Toolbar;", "Lo/Toolbar;", "Lo/setNavigationOnClickListener;", "Lo/setNavigationOnClickListener;", "Lo/ScrollingTabContainerView;", "MediaMetadataCompat", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinearLayoutCompat<T, V extends ScrollingTabContainerView> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setNavigationOnClickListener<T> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final V MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final V MediaMetadataCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private V MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Toolbar AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final evictionCount<T, V> read;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private V RatingCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final T AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setShowDividers<T, V> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesImplBaseParcelizer;

    public LinearLayoutCompat(T t, evictionCount<T, V> evictioncount, T t2, String str) {
        setAppSearchData setappsearchdata;
        setAppSearchData setappsearchdata2;
        this.read = evictioncount;
        this.AudioAttributesCompatParcelizer = t2;
        this.RemoteActionCompatParcelizer = str;
        this.write = new setShowDividers<>(evictioncount, t, null, 0L, 0L, false, 60, null);
        this.AudioAttributesImplBaseParcelizer = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(t, null, 2, null);
        this.AudioAttributesImplApi26Parcelizer = new Toolbar();
        this.MediaDescriptionCompat = new setNavigationOnClickListener<>(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, t2, 3, null);
        ScrollingTabContainerView scrollingTabContainerViewAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (scrollingTabContainerViewAudioAttributesImplApi21Parcelizer instanceof setHoverListener) {
            setappsearchdata = FitWindowsLinearLayout.read;
        } else {
            setappsearchdata = scrollingTabContainerViewAudioAttributesImplApi21Parcelizer instanceof MenuPopupWindowMenuDropDownListView ? FitWindowsLinearLayout.IconCompatParcelizer : scrollingTabContainerViewAudioAttributesImplApi21Parcelizer instanceof ListPopupWindow ? FitWindowsLinearLayout.write : FitWindowsLinearLayout.RemoteActionCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.read(setappsearchdata, "");
        this.MediaMetadataCompat = setappsearchdata;
        ScrollingTabContainerView scrollingTabContainerViewAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer();
        if (scrollingTabContainerViewAudioAttributesImplApi21Parcelizer2 instanceof setHoverListener) {
            setappsearchdata2 = FitWindowsLinearLayout.AudioAttributesCompatParcelizer;
        } else {
            setappsearchdata2 = scrollingTabContainerViewAudioAttributesImplApi21Parcelizer2 instanceof MenuPopupWindowMenuDropDownListView ? FitWindowsLinearLayout.MediaBrowserCompatCustomActionResultReceiver : scrollingTabContainerViewAudioAttributesImplApi21Parcelizer2 instanceof ListPopupWindow ? FitWindowsLinearLayout.AudioAttributesImplBaseParcelizer : FitWindowsLinearLayout.MediaBrowserCompatItemReceiver;
        }
        toMagicModuleMetaRepoModel.read(setappsearchdata2, "");
        this.MediaBrowserCompatSearchResultReceiver = setappsearchdata2;
        this.MediaBrowserCompatMediaItem = setappsearchdata;
        this.RatingCompat = setappsearchdata2;
    }

    public final evictionCount<T, V> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public /* synthetic */ LinearLayoutCompat(Object obj, evictionCount evictioncount, Object obj2, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(obj, evictioncount, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setShowDividers<T, V> IconCompatParcelizer() {
        return this.write;
    }

    public final T MediaBrowserCompatCustomActionResultReceiver() {
        return this.write.getRemoteActionCompatParcelizer();
    }

    public final V AudioAttributesImplApi21Parcelizer() {
        return (V) this.write.AudioAttributesImplApi21Parcelizer();
    }

    public final T AudioAttributesImplBaseParcelizer() {
        return (T) this.read.read().invoke(AudioAttributesImplApi21Parcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(boolean z) {
        this.AudioAttributesImplBaseParcelizer.write(Boolean.valueOf(z));
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return ((Boolean) this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(T t) {
        this.MediaBrowserCompatItemReceiver.write(t);
    }

    public final T write() {
        return this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object AudioAttributesCompatParcelizer$default(LinearLayoutCompat linearLayoutCompat, Object obj, setOrientation setorientation, Object obj2, getAnswerMap getanswermap, SampleVideos sampleVideos, int i, Object obj3) {
        if ((i & 2) != 0) {
            setorientation = linearLayoutCompat.MediaDescriptionCompat;
        }
        setOrientation setorientation2 = setorientation;
        if ((i & 4) != 0) {
            obj2 = linearLayoutCompat.AudioAttributesImplBaseParcelizer();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            getanswermap = null;
        }
        return linearLayoutCompat.AudioAttributesCompatParcelizer(obj, setorientation2, obj4, getanswermap, sampleVideos);
    }

    public final Object AudioAttributesCompatParcelizer(T t, setOrientation<T> setorientation, T t2, getAnswerMap<? super LinearLayoutCompat<T, V>, getShowPopup> getanswermap, SampleVideos<? super LinearLayoutCompatLayoutParams<T, V>> sampleVideos) {
        return RemoteActionCompatParcelizer(setGravity.write(setorientation, this.read, MediaBrowserCompatCustomActionResultReceiver(), t, t2), t2, getanswermap, sampleVideos);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super LinearLayoutCompatLayoutParams<T, V>>, Object> {
        final /* synthetic */ setMeasureWithLargestChildEnabled<T, V> AudioAttributesCompatParcelizer;
        final /* synthetic */ LinearLayoutCompat<T, V> AudioAttributesImplApi21Parcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        final /* synthetic */ T RemoteActionCompatParcelizer;
        final /* synthetic */ getAnswerMap<LinearLayoutCompat<T, V>, getShowPopup> read;
        final /* synthetic */ long write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            final setShowDividers setshowdividersIconCompatParcelizer$default;
            MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer().invoke(this.RemoteActionCompatParcelizer));
                    this.AudioAttributesImplApi21Parcelizer.read(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
                    this.AudioAttributesImplApi21Parcelizer.write(true);
                    setshowdividersIconCompatParcelizer$default = setAllowCollapse.IconCompatParcelizer$default(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
                    setMeasureWithLargestChildEnabled<T, V> setmeasurewithlargestchildenabled = this.AudioAttributesCompatParcelizer;
                    long j = this.write;
                    final LinearLayoutCompat<T, V> linearLayoutCompat = this.AudioAttributesImplApi21Parcelizer;
                    final getAnswerMap<LinearLayoutCompat<T, V>, getShowPopup> getanswermap = this.read;
                    this.IconCompatParcelizer = setshowdividersIconCompatParcelizer$default;
                    this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer2;
                    this.MediaBrowserCompatCustomActionResultReceiver = 1;
                    if (setTitleMarginStart.AudioAttributesCompatParcelizer(setshowdividersIconCompatParcelizer$default, setmeasurewithlargestchildenabled, j, new getAnswerMap() { // from class: o.setOnFitSystemWindowsListener
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return LinearLayoutCompat.write.IconCompatParcelizer(linearLayoutCompat, setshowdividersIconCompatParcelizer$default, getanswermap, audioAttributesCompatParcelizer2, (setWeightSum) obj2);
                        }
                    }, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    audioAttributesCompatParcelizer = (MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer) this.MediaBrowserCompatItemReceiver;
                    setshowdividersIconCompatParcelizer$default = (setShowDividers) this.IconCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                setDividerPadding setdividerpadding = audioAttributesCompatParcelizer.IconCompatParcelizer ? setDividerPadding.read : setDividerPadding.write;
                this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer();
                return new LinearLayoutCompatLayoutParams(setshowdividersIconCompatParcelizer$default, setdividerpadding);
            } catch (CancellationException e) {
                this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer();
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final getShowPopup IconCompatParcelizer(LinearLayoutCompat linearLayoutCompat, setShowDividers setshowdividers, getAnswerMap getanswermap, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, setWeightSum setweightsum) {
            setTitleMarginStart.RemoteActionCompatParcelizer(setweightsum, linearLayoutCompat.IconCompatParcelizer());
            Object objRemoteActionCompatParcelizer = linearLayoutCompat.RemoteActionCompatParcelizer(setweightsum.write());
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer, setweightsum.write())) {
                linearLayoutCompat.IconCompatParcelizer().RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                setshowdividers.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                if (getanswermap != null) {
                    getanswermap.invoke(linearLayoutCompat);
                }
                setweightsum.AudioAttributesCompatParcelizer();
                audioAttributesCompatParcelizer.IconCompatParcelizer = true;
            } else if (getanswermap != null) {
                getanswermap.invoke(linearLayoutCompat);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(LinearLayoutCompat<T, V> linearLayoutCompat, T t, setMeasureWithLargestChildEnabled<T, V> setmeasurewithlargestchildenabled, long j, getAnswerMap<? super LinearLayoutCompat<T, V>, getShowPopup> getanswermap, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesImplApi21Parcelizer = linearLayoutCompat;
            this.RemoteActionCompatParcelizer = t;
            this.AudioAttributesCompatParcelizer = setmeasurewithlargestchildenabled;
            this.write = j;
            this.read = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new write(this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.read, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super LinearLayoutCompatLayoutParams<T, V>> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final Object RemoteActionCompatParcelizer(setMeasureWithLargestChildEnabled<T, V> setmeasurewithlargestchildenabled, T t, getAnswerMap<? super LinearLayoutCompat<T, V>, getShowPopup> getanswermap, SampleVideos<? super LinearLayoutCompatLayoutParams<T, V>> sampleVideos) {
        return Toolbar.write$default(this.AudioAttributesImplApi26Parcelizer, null, new write(this, t, setmeasurewithlargestchildenabled, this.write.getRemoteActionCompatParcelizer(), getanswermap, null), sampleVideos, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T RemoteActionCompatParcelizer(T p0) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, this.MediaBrowserCompatSearchResultReceiver)) {
            V vInvoke = this.read.RemoteActionCompatParcelizer().invoke(p0);
            int iconCompatParcelizer = vInvoke.getIconCompatParcelizer();
            boolean z = false;
            for (int i = 0; i < iconCompatParcelizer; i++) {
                if (vInvoke.read(i) < this.MediaBrowserCompatMediaItem.read(i) || vInvoke.read(i) > this.RatingCompat.read(i)) {
                    vInvoke.IconCompatParcelizer(i, getQues.read(vInvoke.read(i), this.MediaBrowserCompatMediaItem.read(i), this.RatingCompat.read(i)));
                    z = true;
                }
            }
            if (z) {
                return this.read.read().invoke(vInvoke);
            }
        }
        return p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        setShowDividers<T, V> setshowdividers = this.write;
        setshowdividers.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
        setshowdividers.write(Long.MIN_VALUE);
        write(false);
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ LinearLayoutCompat<T, V> AudioAttributesCompatParcelizer;
        final /* synthetic */ T RemoteActionCompatParcelizer;
        int write;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.write == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                Object objRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                this.AudioAttributesCompatParcelizer.read(objRemoteActionCompatParcelizer);
                return getShowPopup.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(LinearLayoutCompat<T, V> linearLayoutCompat, T t, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = linearLayoutCompat;
            this.RemoteActionCompatParcelizer = t;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object read(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite$default = Toolbar.write$default(this.AudioAttributesImplApi26Parcelizer, null, new RemoteActionCompatParcelizer(this, t, null), sampleVideos, 1, null);
        return objWrite$default == getYear.IconCompatParcelizer() ? objWrite$default : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;
        final /* synthetic */ LinearLayoutCompat<T, V> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.IconCompatParcelizer != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write.AudioAttributesImplApi26Parcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(LinearLayoutCompat<T, V> linearLayoutCompat, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = linearLayoutCompat;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite$default = Toolbar.write$default(this.AudioAttributesImplApi26Parcelizer, null, new IconCompatParcelizer(this, null), sampleVideos, 1, null);
        return objWrite$default == getYear.IconCompatParcelizer() ? objWrite$default : getShowPopup.INSTANCE;
    }

    public final parseDouble<T> read() {
        return this.write;
    }
}
