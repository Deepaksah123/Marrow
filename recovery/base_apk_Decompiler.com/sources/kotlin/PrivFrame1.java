package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e"}, d2 = {"Lo/PrivFrame1;", "Lo/SlowMotionDataSegmentExternalSyntheticLambda0;", "Lo/onInputBufferAvailable;", "Lo/DrmUtilApi18;", "p0", "<init>", "(Lo/onInputBufferAvailable;)V", "Lo/parseFromSection;", "", "write", "(Lo/parseFromSection;)[B", "", "AudioAttributesCompatParcelizer", "(Lo/parseFromSection;)V", "Lo/onInputBufferAvailable;", "read"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PrivFrame1 implements SlowMotionDataSegmentExternalSyntheticLambda0 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final onInputBufferAvailable<DrmUtilApi18> read;

    public PrivFrame1(onInputBufferAvailable<DrmUtilApi18> oninputbufferavailable) {
        toMagicModuleMetaRepoModel.write(oninputbufferavailable, "");
        this.read = oninputbufferavailable;
    }

    @Override // kotlin.SlowMotionDataSegmentExternalSyntheticLambda0
    public final void AudioAttributesCompatParcelizer(parseFromSection p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read.write().write("FIREBASE_APPQUALITY_SESSION", DrmSessionManagerDrmSessionReference.IconCompatParcelizer("json"), new isMediaDrmStateException() { // from class: o.doSegmentsOverlap
            @Override // kotlin.isMediaDrmStateException
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return PrivFrame1.write((parseFromSection) obj);
            }
        }).AudioAttributesCompatParcelizer(isNotProvisionedException.AudioAttributesCompatParcelizer(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] write(parseFromSection p0) {
        PrivateCommand1 privateCommand1 = PrivateCommand1.INSTANCE;
        String strRemoteActionCompatParcelizer = PrivateCommand1.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        byte[] bytes = strRemoteActionCompatParcelizer.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        return bytes;
    }
}
