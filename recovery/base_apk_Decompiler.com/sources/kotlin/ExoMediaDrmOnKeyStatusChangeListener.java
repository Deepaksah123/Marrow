package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class ExoMediaDrmOnKeyStatusChangeListener implements DrmUtilApi18 {
    private final Set<DrmSessionManagerDrmSessionReference> AudioAttributesCompatParcelizer;
    private final FrameworkMediaDrm RemoteActionCompatParcelizer;
    private final ExoMediaDrmProvider write;

    ExoMediaDrmOnKeyStatusChangeListener(Set<DrmSessionManagerDrmSessionReference> set, ExoMediaDrmProvider exoMediaDrmProvider, FrameworkMediaDrm frameworkMediaDrm) {
        this.AudioAttributesCompatParcelizer = set;
        this.write = exoMediaDrmProvider;
        this.RemoteActionCompatParcelizer = frameworkMediaDrm;
    }

    @Override // kotlin.DrmUtilApi18
    public final <T> isDeniedByServerException<T> write(String str, DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReference, isMediaDrmStateException<T, byte[]> ismediadrmstateexception) {
        if (!this.AudioAttributesCompatParcelizer.contains(drmSessionManagerDrmSessionReference)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", drmSessionManagerDrmSessionReference, this.AudioAttributesCompatParcelizer));
        }
        return new onKeyStatusChange(this.write, str, drmSessionManagerDrmSessionReference, ismediadrmstateexception, this.RemoteActionCompatParcelizer);
    }
}
