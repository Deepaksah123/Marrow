package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.setDpMargin;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\"\u0010\u000e\u001a\u00020\u00158\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017\"\u0004\b\u000e\u0010\u0018"}, d2 = {"Lo/setDpMargin;", "Lo/getContextForLanguage;", "Lo/setOnCloseListener;", "", "p0", "Lo/_handleOddValue;", "p1", "<init>", "(Lo/setOnCloseListener;Lo/_handleOddValue;)V", "Lo/checkSelfPermission;", "AudioAttributesCompatParcelizer", "(Lo/checkSelfPermission;FLo/SampleVideos;)Ljava/lang/Object;", "Lo/bufferMapProperty;", "", "read", "(Lo/bufferMapProperty;)V", "IconCompatParcelizer", "Lo/setOnCloseListener;", "write", "Lo/_handleOddValue;", "RemoteActionCompatParcelizer", "", "I", "()I", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDpMargin implements getContextForLanguage {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _handleOddValue RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setOnCloseListener<Float> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read;

    public setDpMargin(setOnCloseListener<Float> setoncloselistener, _handleOddValue _handleoddvalue) {
        this.write = setoncloselistener;
        this.RemoteActionCompatParcelizer = _handleoddvalue;
    }

    public /* synthetic */ setDpMargin(setOnCloseListener setoncloselistener, _handleOddValue _handleoddvalue, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setoncloselistener, (i & 2) != 0 ? getColor.AudioAttributesCompatParcelizer() : _handleoddvalue);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public final void read(int i) {
        this.read = i;
    }

    @Override // kotlin.CoordinatorLayout
    public final Object AudioAttributesCompatParcelizer(checkSelfPermission checkselfpermission, float f, SampleVideos<? super Float> sampleVideos) {
        this.read = 0;
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new read(f, this, checkselfpermission, null), sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Float>, Object> {
        Object AudioAttributesCompatParcelizer;
        final /* synthetic */ setDpMargin AudioAttributesImplBaseParcelizer;
        final /* synthetic */ checkSelfPermission IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ float read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            float f;
            MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            setShowDividers setshowdividers;
            setOnCloseListener setoncloselistener;
            final checkSelfPermission checkselfpermission;
            final setDpMargin setdpmargin;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (Math.abs(this.read) > 1.0f) {
                    final MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer();
                    remoteActionCompatParcelizer2.read = this.read;
                    final MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = new MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer();
                    setShowDividers setshowdividersAudioAttributesCompatParcelizer$default = setAllowCollapse.AudioAttributesCompatParcelizer$default(BitmapDescriptorFactory.HUE_RED, this.read, 0L, 0L, false, 28, null);
                    try {
                        setoncloselistener = this.AudioAttributesImplBaseParcelizer.write;
                        checkselfpermission = this.IconCompatParcelizer;
                        setdpmargin = this.AudioAttributesImplBaseParcelizer;
                        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                        this.AudioAttributesCompatParcelizer = setshowdividersAudioAttributesCompatParcelizer$default;
                        this.write = 1;
                    } catch (CancellationException unused) {
                        remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                        setshowdividers = setshowdividersAudioAttributesCompatParcelizer$default;
                        remoteActionCompatParcelizer.read = ((Number) setshowdividers.AudioAttributesCompatParcelizer()).floatValue();
                    }
                    if (setTitleMarginStart.IconCompatParcelizer$default(setshowdividersAudioAttributesCompatParcelizer$default, setoncloselistener, false, new getAnswerMap() { // from class: o.ConstraintHelper
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return setDpMargin.read.RemoteActionCompatParcelizer(remoteActionCompatParcelizer3, checkselfpermission, remoteActionCompatParcelizer2, setdpmargin, (setWeightSum) obj2);
                        }
                    }, this, 2, null) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                    f = remoteActionCompatParcelizer.read;
                } else {
                    f = this.read;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                setshowdividers = (setShowDividers) this.AudioAttributesCompatParcelizer;
                remoteActionCompatParcelizer = (MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer) this.RemoteActionCompatParcelizer;
                try {
                    SdkPayloadData.IconCompatParcelizer(obj);
                } catch (CancellationException unused2) {
                    remoteActionCompatParcelizer.read = ((Number) setshowdividers.AudioAttributesCompatParcelizer()).floatValue();
                }
                f = remoteActionCompatParcelizer.read;
            }
            return QBankStatsResponse.write(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, checkSelfPermission checkselfpermission, MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, setDpMargin setdpmargin, setWeightSum setweightsum) {
            float fFloatValue = ((Number) setweightsum.write()).floatValue() - remoteActionCompatParcelizer.read;
            float fIconCompatParcelizer = checkselfpermission.IconCompatParcelizer(fFloatValue);
            remoteActionCompatParcelizer.read = ((Number) setweightsum.write()).floatValue();
            remoteActionCompatParcelizer2.read = ((Number) setweightsum.AudioAttributesImplApi26Parcelizer()).floatValue();
            if (Math.abs(fFloatValue - fIconCompatParcelizer) > 0.5f) {
                setweightsum.AudioAttributesCompatParcelizer();
            }
            setdpmargin.read(setdpmargin.getRead() + 1);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(float f, setDpMargin setdpmargin, checkSelfPermission checkselfpermission, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = f;
            this.AudioAttributesImplBaseParcelizer = setdpmargin;
            this.IconCompatParcelizer = checkselfpermission;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.read, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Float> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getContextForLanguage
    public final void read(bufferMapProperty p0) {
        this.write = ContentFrameLayout.RemoteActionCompatParcelizer(p0);
    }
}
