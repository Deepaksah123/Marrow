package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdasetOnExpirationUpdateListener3comgoogleandroidexoplayer2drmFrameworkMediaDrm implements FrameworkMediaDrmExternalSyntheticLambda3<lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm> {
    private final setDescriptionList<BinarySearchSeeker> AudioAttributesCompatParcelizer;
    private final setDescriptionList<BinarySearchSeeker> RemoteActionCompatParcelizer;
    private final setDescriptionList<Context> write;

    private lambdasetOnExpirationUpdateListener3comgoogleandroidexoplayer2drmFrameworkMediaDrm(setDescriptionList<Context> setdescriptionlist, setDescriptionList<BinarySearchSeeker> setdescriptionlist2, setDescriptionList<BinarySearchSeeker> setdescriptionlist3) {
        this.write = setdescriptionlist;
        this.AudioAttributesCompatParcelizer = setdescriptionlist2;
        this.RemoteActionCompatParcelizer = setdescriptionlist3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm get() {
        return read(this.write.get(), this.AudioAttributesCompatParcelizer.get(), this.RemoteActionCompatParcelizer.get());
    }

    public static lambdasetOnExpirationUpdateListener3comgoogleandroidexoplayer2drmFrameworkMediaDrm write(setDescriptionList<Context> setdescriptionlist, setDescriptionList<BinarySearchSeeker> setdescriptionlist2, setDescriptionList<BinarySearchSeeker> setdescriptionlist3) {
        return new lambdasetOnExpirationUpdateListener3comgoogleandroidexoplayer2drmFrameworkMediaDrm(setdescriptionlist, setdescriptionlist2, setdescriptionlist3);
    }

    private static lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm read(Context context, BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2) {
        return new lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm(context, binarySearchSeeker, binarySearchSeeker2);
    }
}
