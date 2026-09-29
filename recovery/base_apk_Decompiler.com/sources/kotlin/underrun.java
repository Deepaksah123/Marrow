package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class underrun extends MagicModuleUseCase implements getAnswerMap {
    public static final underrun write = new underrun();

    public underrun() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        getTypeForPcmEncoding gettypeforpcmencoding = (getTypeForPcmEncoding) obj;
        return VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(maybeUpdateMediaTimeHistory.read.write(), gettypeforpcmencoding.AudioAttributesCompatParcelizer), setAction.write(adjustRequestData.AudioAttributesCompatParcelizer.write(), gettypeforpcmencoding.write), setAction.write(getDirectPlaybackSupportedEncodings.write.write(), gettypeforpcmencoding.RemoteActionCompatParcelizer));
    }
}
