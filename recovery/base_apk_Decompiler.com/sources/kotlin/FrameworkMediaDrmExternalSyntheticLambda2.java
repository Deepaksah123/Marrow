package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class FrameworkMediaDrmExternalSyntheticLambda2 implements FrameworkMediaDrmExternalSyntheticLambda3<FrameworkMediaDrmExternalSyntheticLambda1> {
    private final setDescriptionList<Context> AudioAttributesCompatParcelizer;
    private final setDescriptionList<lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm> RemoteActionCompatParcelizer;

    private FrameworkMediaDrmExternalSyntheticLambda2(setDescriptionList<Context> setdescriptionlist, setDescriptionList<lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm> setdescriptionlist2) {
        this.AudioAttributesCompatParcelizer = setdescriptionlist;
        this.RemoteActionCompatParcelizer = setdescriptionlist2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FrameworkMediaDrmExternalSyntheticLambda1 get() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.get(), this.RemoteActionCompatParcelizer.get());
    }

    public static FrameworkMediaDrmExternalSyntheticLambda2 read(setDescriptionList<Context> setdescriptionlist, setDescriptionList<lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm> setdescriptionlist2) {
        return new FrameworkMediaDrmExternalSyntheticLambda2(setdescriptionlist, setdescriptionlist2);
    }

    private static FrameworkMediaDrmExternalSyntheticLambda1 AudioAttributesCompatParcelizer(Context context, Object obj) {
        return new FrameworkMediaDrmExternalSyntheticLambda1(context, (lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm) obj);
    }
}
