package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureTask {
    public static final getElapsedRealtimeOffsetMs AudioAttributesCompatParcelizer(ExperimentalBandwidthMeter experimentalBandwidthMeter) {
        toMagicModuleMetaRepoModel.write(experimentalBandwidthMeter, "");
        String strAudioAttributesCompatParcelizer = experimentalBandwidthMeter.AudioAttributesCompatParcelizer();
        List<getBandwidthEstimate> listWrite = experimentalBandwidthMeter.write();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
        Iterator<T> it = listWrite.iterator();
        while (it.hasNext()) {
            arrayList.add(IconCompatParcelizer((getBandwidthEstimate) it.next()));
        }
        return new getElapsedRealtimeOffsetMs(strAudioAttributesCompatParcelizer, arrayList);
    }

    public static final isCancelled IconCompatParcelizer(getBandwidthEstimate getbandwidthestimate) {
        toMagicModuleMetaRepoModel.write(getbandwidthestimate, "");
        String audioAttributesCompatParcelizer = getbandwidthestimate.getAudioAttributesCompatParcelizer();
        String read = getbandwidthestimate.getRead();
        List<String> listAudioAttributesCompatParcelizer = getbandwidthestimate.AudioAttributesCompatParcelizer();
        List<Integer> listRemoteActionCompatParcelizer = getbandwidthestimate.RemoteActionCompatParcelizer();
        long iconCompatParcelizer = getbandwidthestimate.getIconCompatParcelizer();
        String mediaBrowserCompatCustomActionResultReceiver = getbandwidthestimate.getMediaBrowserCompatCustomActionResultReceiver();
        BandwidthStatistic audioAttributesImplApi26Parcelizer = getbandwidthestimate.getAudioAttributesImplApi26Parcelizer();
        checkValidServerReply checkvalidserverreply = new checkValidServerReply(audioAttributesImplApi26Parcelizer.getRead(), audioAttributesImplApi26Parcelizer.getIconCompatParcelizer());
        String mediaBrowserCompatItemReceiver = getbandwidthestimate.getMediaBrowserCompatItemReceiver();
        SntpClient sntpClient = new SntpClient(getbandwidthestimate.getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer());
        List<CombinedParallelSampleBandwidthEstimator1> listAudioAttributesImplBaseParcelizer = getbandwidthestimate.AudioAttributesImplBaseParcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplBaseParcelizer, 10));
        for (CombinedParallelSampleBandwidthEstimator1 combinedParallelSampleBandwidthEstimator1 : listAudioAttributesImplBaseParcelizer) {
            arrayList.add(new isDone(combinedParallelSampleBandwidthEstimator1.getIconCompatParcelizer(), combinedParallelSampleBandwidthEstimator1.getRemoteActionCompatParcelizer()));
        }
        return new isCancelled(audioAttributesCompatParcelizer, read, listAudioAttributesCompatParcelizer, listRemoteActionCompatParcelizer, iconCompatParcelizer, mediaBrowserCompatCustomActionResultReceiver, checkvalidserverreply, mediaBrowserCompatItemReceiver, sntpClient, arrayList);
    }
}
