package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class releaseLicense implements FrameworkMediaDrmExternalSyntheticLambda3<getMediaSessionPlaybackState> {
    private final setDescriptionList<BinarySearchSeeker> IconCompatParcelizer;
    private final setDescriptionList<renewLicense> RemoteActionCompatParcelizer;
    private final setDescriptionList<Context> read;
    private final setDescriptionList<invalidateMediaSessionQueue> write;

    private releaseLicense(setDescriptionList<Context> setdescriptionlist, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist2, setDescriptionList<renewLicense> setdescriptionlist3, setDescriptionList<BinarySearchSeeker> setdescriptionlist4) {
        this.read = setdescriptionlist;
        this.write = setdescriptionlist2;
        this.RemoteActionCompatParcelizer = setdescriptionlist3;
        this.IconCompatParcelizer = setdescriptionlist4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getMediaSessionPlaybackState get() {
        Context context = this.read.get();
        invalidateMediaSessionQueue invalidatemediasessionqueue = this.write.get();
        renewLicense renewlicense = this.RemoteActionCompatParcelizer.get();
        this.IconCompatParcelizer.get();
        return write(context, invalidatemediasessionqueue, renewlicense);
    }

    public static releaseLicense write(setDescriptionList<Context> setdescriptionlist, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist2, setDescriptionList<renewLicense> setdescriptionlist3, setDescriptionList<BinarySearchSeeker> setdescriptionlist4) {
        return new releaseLicense(setdescriptionlist, setdescriptionlist2, setdescriptionlist3, setdescriptionlist4);
    }

    private static getMediaSessionPlaybackState write(Context context, invalidateMediaSessionQueue invalidatemediasessionqueue, renewLicense renewlicense) {
        return (getMediaSessionPlaybackState) executePost.IconCompatParcelizer(lambdaacquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread1comgoogleandroidexoplayer2drmOfflineLicenseHelper.read(context, invalidatemediasessionqueue, renewlicense), "Cannot return null from a non-@Nullable @Provides method");
    }
}
