package kotlin;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DecoderReuseEvaluation extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ getInputChannelCount RemoteActionCompatParcelizer;
    private /* synthetic */ releaseOutputBufferInternal read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecoderReuseEvaluation(getInputChannelCount getinputchannelcount, releaseOutputBufferInternal releaseoutputbufferinternal) {
        super(1);
        this.RemoteActionCompatParcelizer = getinputchannelcount;
        this.read = releaseoutputbufferinternal;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((PlaybackStatsEventTimeAndPlaybackState) obj));
        isInvalidJoinTransition isinvalidjointransition = this.read.RemoteActionCompatParcelizer;
        jSONObject.toString(2);
        byte[] bytes = jSONObject.toString().getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        parseAc3AnnexFFormat parseac3annexfformat = this.read.write;
        return parseac3annexfformat != null ? parseac3annexfformat.read(bytes) : bytes;
    }
}
