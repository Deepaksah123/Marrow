package kotlin;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class canDispatchSetRating implements FrameworkMediaDrmExternalSyntheticLambda3<OfflineLicenseHelperExternalSyntheticLambda1> {
    private final setDescriptionList<isCryptoSchemeSupported> AudioAttributesCompatParcelizer;
    private final setDescriptionList<getSeekMap> AudioAttributesImplApi26Parcelizer;
    private final setDescriptionList<getMediaSessionPlaybackState> AudioAttributesImplBaseParcelizer;
    private final setDescriptionList<BinarySearchSeeker> IconCompatParcelizer;
    private final setDescriptionList<Executor> MediaBrowserCompatCustomActionResultReceiver;
    private final setDescriptionList<BinarySearchSeeker> MediaBrowserCompatItemReceiver;
    private final setDescriptionList<invalidateMediaSessionMetadata> RemoteActionCompatParcelizer;
    private final setDescriptionList<Context> read;
    private final setDescriptionList<invalidateMediaSessionQueue> write;

    private canDispatchSetRating(setDescriptionList<Context> setdescriptionlist, setDescriptionList<isCryptoSchemeSupported> setdescriptionlist2, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist3, setDescriptionList<getMediaSessionPlaybackState> setdescriptionlist4, setDescriptionList<Executor> setdescriptionlist5, setDescriptionList<getSeekMap> setdescriptionlist6, setDescriptionList<BinarySearchSeeker> setdescriptionlist7, setDescriptionList<BinarySearchSeeker> setdescriptionlist8, setDescriptionList<invalidateMediaSessionMetadata> setdescriptionlist9) {
        this.read = setdescriptionlist;
        this.AudioAttributesCompatParcelizer = setdescriptionlist2;
        this.write = setdescriptionlist3;
        this.AudioAttributesImplBaseParcelizer = setdescriptionlist4;
        this.MediaBrowserCompatCustomActionResultReceiver = setdescriptionlist5;
        this.AudioAttributesImplApi26Parcelizer = setdescriptionlist6;
        this.IconCompatParcelizer = setdescriptionlist7;
        this.MediaBrowserCompatItemReceiver = setdescriptionlist8;
        this.RemoteActionCompatParcelizer = setdescriptionlist9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public OfflineLicenseHelperExternalSyntheticLambda1 get() {
        return write(this.read.get(), this.AudioAttributesCompatParcelizer.get(), this.write.get(), this.AudioAttributesImplBaseParcelizer.get(), this.MediaBrowserCompatCustomActionResultReceiver.get(), this.AudioAttributesImplApi26Parcelizer.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompatItemReceiver.get(), this.RemoteActionCompatParcelizer.get());
    }

    public static canDispatchSetRating read(setDescriptionList<Context> setdescriptionlist, setDescriptionList<isCryptoSchemeSupported> setdescriptionlist2, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist3, setDescriptionList<getMediaSessionPlaybackState> setdescriptionlist4, setDescriptionList<Executor> setdescriptionlist5, setDescriptionList<getSeekMap> setdescriptionlist6, setDescriptionList<BinarySearchSeeker> setdescriptionlist7, setDescriptionList<BinarySearchSeeker> setdescriptionlist8, setDescriptionList<invalidateMediaSessionMetadata> setdescriptionlist9) {
        return new canDispatchSetRating(setdescriptionlist, setdescriptionlist2, setdescriptionlist3, setdescriptionlist4, setdescriptionlist5, setdescriptionlist6, setdescriptionlist7, setdescriptionlist8, setdescriptionlist9);
    }

    private static OfflineLicenseHelperExternalSyntheticLambda1 write(Context context, isCryptoSchemeSupported iscryptoschemesupported, invalidateMediaSessionQueue invalidatemediasessionqueue, getMediaSessionPlaybackState getmediasessionplaybackstate, Executor executor, getSeekMap getseekmap, BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, invalidateMediaSessionMetadata invalidatemediasessionmetadata) {
        return new OfflineLicenseHelperExternalSyntheticLambda1(context, iscryptoschemesupported, invalidatemediasessionqueue, getmediasessionplaybackstate, executor, getseekmap, binarySearchSeeker, binarySearchSeeker2, invalidatemediasessionmetadata);
    }
}
