package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackStatsEventTimeAndFormat extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final PlaybackStatsEventTimeAndFormat read = new PlaybackStatsEventTimeAndFormat();

    public PlaybackStatsEventTimeAndFormat() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new parseAudioSpecificConfig[]{CreationTime1.IconCompatParcelizer, removeVersion.write, getMeanSingleSeekTimeMs.RemoteActionCompatParcelizer, getMeanInitialVideoFormatHeight.RemoteActionCompatParcelizer, getPlaybackStateDurationMs.RemoteActionCompatParcelizer, onQueueInputBuffer.read, findNoisePosition.IconCompatParcelizer, hasSupplementalData.read, skipPitchPeriod.RemoteActionCompatParcelizer, ToInt16PcmAudioProcessor.read, Decoder.IconCompatParcelizer, DecoderInputBufferBufferReplacementMode.RemoteActionCompatParcelizer, maybeNotifyDecodeLoop.write, DefaultAudioSinkOffloadMode.AudioAttributesCompatParcelizer, maybeUpdateTimestamp.IconCompatParcelizer, onConfigure.write});
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        Iterator it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(((parseAudioSpecificConfig) it.next()).write());
        }
        return arrayList;
    }
}
