package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u000f\u001a\u00020\t*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/JsonProperty;", "", "Lo/setTranslationY;", "p0", "Lo/TopUserCompanion;", "p1", "<init>", "(Lo/setTranslationY;Lo/TopUserCompanion;)V", "Lo/bufferMapProperty;", "", "", "Lo/_reportBase64UnexpectedPadding;", "p2", "p3", "", "IconCompatParcelizer", "(Lo/bufferMapProperty;ILjava/util/List;I)V", "(Lo/_reportBase64UnexpectedPadding;Lo/bufferMapProperty;ILjava/util/List;)I", "RemoteActionCompatParcelizer", "Lo/setTranslationY;", "write", "Lo/TopUserCompanion;", "read", "AudioAttributesCompatParcelizer", "Ljava/lang/Integer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class JsonProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Integer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setTranslationY write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final TopUserCompanion read;

    public JsonProperty(setTranslationY settranslationy, TopUserCompanion topUserCompanion) {
        this.write = settranslationy;
        this.read = topUserCompanion;
    }

    public final void IconCompatParcelizer(bufferMapProperty p0, int p1, List<_reportBase64UnexpectedPadding> p2, int p3) {
        int iIconCompatParcelizer;
        Integer num = this.RemoteActionCompatParcelizer;
        if (num == null || num.intValue() != p3) {
            this.RemoteActionCompatParcelizer = Integer.valueOf(p3);
            _reportBase64UnexpectedPadding _reportbase64unexpectedpadding = (_reportBase64UnexpectedPadding) IntermediateLoginResponseBody.read((List) p2, p3);
            if (_reportbase64unexpectedpadding == null || this.write.MediaBrowserCompatItemReceiver() == (iIconCompatParcelizer = IconCompatParcelizer(_reportbase64unexpectedpadding, p0, p1, p2))) {
                return;
            }
            C0201setMcqCount.IconCompatParcelizer(this.read, null, null, new AudioAttributesCompatParcelizer(iIconCompatParcelizer, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (JsonProperty.this.write.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, acceptsPaddingOnRead.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        AudioAttributesCompatParcelizer(int i, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return JsonProperty.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final int IconCompatParcelizer(_reportBase64UnexpectedPadding _reportbase64unexpectedpadding, bufferMapProperty buffermapproperty, int i, List<_reportBase64UnexpectedPadding> list) {
        int iIconCompatParcelizer = buffermapproperty.IconCompatParcelizer(((_reportBase64UnexpectedPadding) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).IconCompatParcelizer()) + i;
        int iIconCompatParcelizer2 = iIconCompatParcelizer - this.write.IconCompatParcelizer();
        return getQues.write(buffermapproperty.IconCompatParcelizer(_reportbase64unexpectedpadding.getIconCompatParcelizer()) - ((iIconCompatParcelizer2 / 2) - (buffermapproperty.IconCompatParcelizer(_reportbase64unexpectedpadding.getWrite()) / 2)), 0, getQues.write(iIconCompatParcelizer - iIconCompatParcelizer2, 0));
    }
}
