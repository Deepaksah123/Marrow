package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/SlowMotionData;", "", "Lo/WritableTypeIdInclusion;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/WritableTypeIdInclusion;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/MotionPhotoMetadata;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SlowMotionData {
    Object AudioAttributesCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, SampleVideos<? super getShowPopup> sampleVideos);

    static /* synthetic */ Object AudioAttributesCompatParcelizer$default(SlowMotionData slowMotionData, WritableTypeIdInclusion writableTypeIdInclusion, SampleVideos sampleVideos, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i & 1) != 0) {
            writableTypeIdInclusion = null;
        }
        return slowMotionData.AudioAttributesCompatParcelizer(writableTypeIdInclusion, sampleVideos);
    }
}
