package kotlin;

import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes5.dex */
public final class getCodecInfo implements getSubmittedOn<updateCodecOperatingRate> {
    private final setDescriptionList<onProcessedOutputBuffer> AudioAttributesCompatParcelizer;
    private final setDescriptionList<onInputBufferAvailable<DrmUtilApi18>> AudioAttributesImplApi26Parcelizer;
    private final setDescriptionList<FirebaseApp> IconCompatParcelizer;
    private final setDescriptionList<getDecoderInfosInternal> MediaBrowserCompatCustomActionResultReceiver;
    private final setDescriptionList<hasSamples> RemoteActionCompatParcelizer;
    private final setDescriptionList<onInputBufferAvailable<ChapterTocFrame1>> read;
    private final setDescriptionList<maybeInitCodecOrBypass> write;

    private getCodecInfo(setDescriptionList<FirebaseApp> setdescriptionlist, setDescriptionList<onInputBufferAvailable<ChapterTocFrame1>> setdescriptionlist2, setDescriptionList<hasSamples> setdescriptionlist3, setDescriptionList<onInputBufferAvailable<DrmUtilApi18>> setdescriptionlist4, setDescriptionList<onProcessedOutputBuffer> setdescriptionlist5, setDescriptionList<maybeInitCodecOrBypass> setdescriptionlist6, setDescriptionList<getDecoderInfosInternal> setdescriptionlist7) {
        this.IconCompatParcelizer = setdescriptionlist;
        this.read = setdescriptionlist2;
        this.RemoteActionCompatParcelizer = setdescriptionlist3;
        this.AudioAttributesImplApi26Parcelizer = setdescriptionlist4;
        this.AudioAttributesCompatParcelizer = setdescriptionlist5;
        this.write = setdescriptionlist6;
        this.MediaBrowserCompatCustomActionResultReceiver = setdescriptionlist7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public updateCodecOperatingRate get() {
        return write(this.IconCompatParcelizer.get(), this.read.get(), this.RemoteActionCompatParcelizer.get(), this.AudioAttributesImplApi26Parcelizer.get(), this.AudioAttributesCompatParcelizer.get(), this.write.get(), this.MediaBrowserCompatCustomActionResultReceiver.get());
    }

    public static getCodecInfo IconCompatParcelizer(setDescriptionList<FirebaseApp> setdescriptionlist, setDescriptionList<onInputBufferAvailable<ChapterTocFrame1>> setdescriptionlist2, setDescriptionList<hasSamples> setdescriptionlist3, setDescriptionList<onInputBufferAvailable<DrmUtilApi18>> setdescriptionlist4, setDescriptionList<onProcessedOutputBuffer> setdescriptionlist5, setDescriptionList<maybeInitCodecOrBypass> setdescriptionlist6, setDescriptionList<getDecoderInfosInternal> setdescriptionlist7) {
        return new getCodecInfo(setdescriptionlist, setdescriptionlist2, setdescriptionlist3, setdescriptionlist4, setdescriptionlist5, setdescriptionlist6, setdescriptionlist7);
    }

    private static updateCodecOperatingRate write(FirebaseApp firebaseApp, onInputBufferAvailable<ChapterTocFrame1> oninputbufferavailable, hasSamples hassamples, onInputBufferAvailable<DrmUtilApi18> oninputbufferavailable2, onProcessedOutputBuffer onprocessedoutputbuffer, maybeInitCodecOrBypass maybeinitcodecorbypass, getDecoderInfosInternal getdecoderinfosinternal) {
        return new updateCodecOperatingRate(firebaseApp, oninputbufferavailable, hassamples, oninputbufferavailable2, onprocessedoutputbuffer, maybeinitcodecorbypass, getdecoderinfosinternal);
    }
}
