package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getSystemGestureInsets;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/writeArrayFieldStart;", "", "", "p0", "Lkotlin/Function0;", "Lo/setCurrentValue;", "p1", "<init>", "(ZLo/getCreatedOnDateMs;)V", "Lo/isRound;", "Lo/TopUserCompanion;", "", "AudioAttributesCompatParcelizer", "(Lo/isRound;Lo/TopUserCompanion;)V", "Lo/findSetterInfo;", "", "Lo/switchToNext;", "(Lo/findSetterInfo;FJ)V", "write", "Z", "RemoteActionCompatParcelizer", "Lo/getCreatedOnDateMs;", "Lo/LinearLayoutCompat;", "Lo/setHoverListener;", "read", "Lo/LinearLayoutCompat;", "", "Ljava/util/List;", "IconCompatParcelizer", "Lo/isRound;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class writeArrayFieldStart {
    private isRound IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<setCurrentValue> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final LinearLayoutCompat<Float, setHoverListener> write = FitWindowsLinearLayout.read$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<isRound> read = new ArrayList();

    public writeArrayFieldStart(boolean z, getCreatedOnDateMs<setCurrentValue> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
    }

    public final void AudioAttributesCompatParcelizer(isRound p0, TopUserCompanion p1) {
        float iconCompatParcelizer;
        if (p0 instanceof isVisible.read) {
            this.read.add(p0);
        } else if (p0 instanceof isVisible.IconCompatParcelizer) {
            this.read.remove(((isVisible.IconCompatParcelizer) p0).getWrite());
        } else if (p0 instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
            this.read.add(p0);
        } else if (p0 instanceof getTappableElementInsets.AudioAttributesCompatParcelizer) {
            this.read.remove(((getTappableElementInsets.AudioAttributesCompatParcelizer) p0).getRemoteActionCompatParcelizer());
        } else if (p0 instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer) {
            this.read.add(p0);
        } else if (p0 instanceof getSystemGestureInsets.IconCompatParcelizer) {
            this.read.remove(((getSystemGestureInsets.IconCompatParcelizer) p0).getIconCompatParcelizer());
        } else if (!(p0 instanceof getSystemGestureInsets.write)) {
            return;
        } else {
            this.read.remove(((getSystemGestureInsets.write) p0).getAudioAttributesCompatParcelizer());
        }
        isRound isround = (isRound) IntermediateLoginResponseBody.MediaMetadataCompat((List) this.read);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, isround)) {
            return;
        }
        if (isround == null) {
            C0201setMcqCount.IconCompatParcelizer(p1, null, null, new RemoteActionCompatParcelizer(setPrettyPrinter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer), null), 3);
        } else {
            setCurrentValue setcurrentvalueInvoke = this.AudioAttributesCompatParcelizer.invoke();
            if (isround instanceof isVisible.read) {
                iconCompatParcelizer = setcurrentvalueInvoke.getRead();
            } else if (isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
                iconCompatParcelizer = setcurrentvalueInvoke.getWrite();
            } else {
                iconCompatParcelizer = isround instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer ? setcurrentvalueInvoke.getIconCompatParcelizer() : BitmapDescriptorFactory.HUE_RED;
            }
            C0201setMcqCount.IconCompatParcelizer(p1, null, null, new IconCompatParcelizer(iconCompatParcelizer, setPrettyPrinter.IconCompatParcelizer(isround), null), 3);
        }
        this.IconCompatParcelizer = isround;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ setOrientation<Float> RemoteActionCompatParcelizer;
        final /* synthetic */ float write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (LinearLayoutCompat.AudioAttributesCompatParcelizer$default(writeArrayFieldStart.this.write, QBankStatsResponse.write(this.write), this.RemoteActionCompatParcelizer, null, null, this, 12, null) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(float f, setOrientation<Float> setorientation, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = f;
            this.RemoteActionCompatParcelizer = setorientation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return writeArrayFieldStart.this.new IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;
        final /* synthetic */ setOrientation<Float> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (LinearLayoutCompat.AudioAttributesCompatParcelizer$default(writeArrayFieldStart.this.write, QBankStatsResponse.write(BitmapDescriptorFactory.HUE_RED), this.write, null, null, this, 12, null) == objIconCompatParcelizer) {
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
        RemoteActionCompatParcelizer(setOrientation<Float> setorientation, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = setorientation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return writeArrayFieldStart.this.new RemoteActionCompatParcelizer(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo, float f, long j) {
        float fFloatValue = this.write.MediaBrowserCompatCustomActionResultReceiver().floatValue();
        if (fFloatValue > BitmapDescriptorFactory.HUE_RED) {
            long jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(j, fFloatValue, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            if (!this.RemoteActionCompatParcelizer) {
                findSetterInfo.AudioAttributesCompatParcelizer$default(findsetterinfo, jAudioAttributesCompatParcelizer$default, f, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
                return;
            }
            float fAudioAttributesCompatParcelizer = calloc.AudioAttributesCompatParcelizer(findsetterinfo.MediaBrowserCompatCustomActionResultReceiver());
            float fRemoteActionCompatParcelizer = calloc.RemoteActionCompatParcelizer(findsetterinfo.MediaBrowserCompatCustomActionResultReceiver());
            int iIconCompatParcelizer = ReadConstrainedTextBuffer.INSTANCE.IconCompatParcelizer();
            findSerializationTyping iconCompatParcelizer = findsetterinfo.getIconCompatParcelizer();
            long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
            try {
                iconCompatParcelizer.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fAudioAttributesCompatParcelizer, fRemoteActionCompatParcelizer, iIconCompatParcelizer);
                findSetterInfo.AudioAttributesCompatParcelizer$default(findsetterinfo, jAudioAttributesCompatParcelizer$default, f, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
            } finally {
                iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
                iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            }
        }
    }
}
