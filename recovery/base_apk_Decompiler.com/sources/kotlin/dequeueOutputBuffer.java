package kotlin;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dequeueOutputBuffer implements getInputChannelCount {
    private String AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private XmpData1 AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    private String IconCompatParcelizer;
    private Map MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private List MediaBrowserCompatMediaItem;
    private String MediaDescriptionCompat;
    private Map MediaMetadataCompat = VideoTimelineResponseBody.read(setAction.write(getNextOutputFileName.IconCompatParcelizer.write(), resetSinkStateForFlush.IconCompatParcelizer.write()));
    private boolean RatingCompat;
    private String RemoteActionCompatParcelizer;
    private String read;
    private String write;

    public dequeueOutputBuffer(String str, String str2, String str3, String str4, String str5, String str6, XmpData1 xmpData1, Map map, String str7, String str8, boolean z, List list, String str9) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.MediaBrowserCompatItemReceiver = str6;
        this.AudioAttributesImplApi26Parcelizer = xmpData1;
        this.MediaBrowserCompatCustomActionResultReceiver = map;
        this.AudioAttributesImplBaseParcelizer = str7;
        this.AudioAttributesImplApi21Parcelizer = str8;
        this.RatingCompat = z;
        this.MediaBrowserCompatMediaItem = list;
        this.MediaDescriptionCompat = str9;
    }

    @Override // kotlin.getInputChannelCount
    public final /* synthetic */ getAudioTrackMinBufferSize AudioAttributesCompatParcelizer() {
        return getOutputFormat.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getInputChannelCount
    public final String RemoteActionCompatParcelizer() {
        Uri uri = Uri.parse(this.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(uri);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        toMagicModuleMetaRepoModel.write(builderBuildUpon);
        String strWrite = buildInitializationData.AudioAttributesCompatParcelizer.write();
        newEncryptedObject newencryptedobject = AacUtil.AudioAttributesCompatParcelizer;
        String str = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append(DefaultAudioSink.read.write());
        sb.append('/');
        sb.append(str);
        builderBuildUpon.appendQueryParameter(strWrite, sb.toString());
        builderBuildUpon.appendQueryParameter(setOutputStreamOffsetUs.IconCompatParcelizer.write(), this.read);
        for (Pair pair : this.MediaBrowserCompatMediaItem) {
            String strWrite2 = ExoDatabaseProvider.RemoteActionCompatParcelizer.write();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) pair.write());
            sb2.append('/');
            sb2.append((String) pair.IconCompatParcelizer());
            builderBuildUpon.appendQueryParameter(strWrite2, sb2.toString());
        }
        return builderBuildUpon.build().toString();
    }

    @Override // kotlin.getInputChannelCount
    public final Map read() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.getInputChannelCount
    public final Map RemoteActionCompatParcelizer(PlaybackStatsEventTimeAndPlaybackState playbackStatsEventTimeAndPlaybackState) {
        HashMap map = new HashMap();
        getTotalJoinTimeMs gettotaljointimems = getTotalJoinTimeMs.read;
        Pair pairWrite = setAction.write(gettotaljointimems.write(), VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(DecoderInputBufferInsufficientCapacityException.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatItemReceiver), setAction.write(DecoderInputBufferInsufficientCapacityException.MediaBrowserCompatSearchResultReceiver, DefaultAudioSink.read.write())));
        feedInputBuffer feedinputbuffer = feedInputBuffer.write;
        Map mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, setAction.write(feedinputbuffer.write(), 0));
        map.put(DecoderInputBufferInsufficientCapacityException.write, this.read);
        String str = DecoderInputBufferInsufficientCapacityException.IconCompatParcelizer;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
        map.put(DecoderInputBufferInsufficientCapacityException.AudioAttributesImplBaseParcelizer, mapRemoteActionCompatParcelizer);
        String str3 = this.RemoteActionCompatParcelizer;
        if (str3 == null || str3.length() == 0) {
            map.put(DecoderInputBufferInsufficientCapacityException.RemoteActionCompatParcelizer, VideoTimelineResponseBody.read(setAction.write(feedinputbuffer.write(), -1)));
        } else {
            map.put(DecoderInputBufferInsufficientCapacityException.RemoteActionCompatParcelizer, VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(feedinputbuffer.write(), 0), setAction.write(gettotaljointimems.write(), this.RemoteActionCompatParcelizer)));
        }
        if (this.write.length() == 0) {
            map.put(DecoderInputBufferInsufficientCapacityException.AudioAttributesImplApi26Parcelizer, VideoTimelineResponseBody.read(setAction.write(feedinputbuffer.write(), -1)));
        } else {
            map.put(DecoderInputBufferInsufficientCapacityException.AudioAttributesImplApi26Parcelizer, VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(feedinputbuffer.write(), 0), setAction.write(gettotaljointimems.write(), this.write)));
        }
        if (this.AudioAttributesCompatParcelizer.length() == 0) {
            map.put(DecoderInputBufferInsufficientCapacityException.AudioAttributesCompatParcelizer, VideoTimelineResponseBody.read(setAction.write(feedinputbuffer.write(), -1)));
        } else {
            map.put(DecoderInputBufferInsufficientCapacityException.AudioAttributesCompatParcelizer, VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(feedinputbuffer.write(), 0), setAction.write(gettotaljointimems.write(), this.AudioAttributesCompatParcelizer)));
        }
        if (this.RatingCompat) {
            map.put(DecoderInputBufferInsufficientCapacityException.MediaBrowserCompatCustomActionResultReceiver, 1);
        }
        if (this.MediaDescriptionCompat.length() > 0) {
            map.put(DecoderInputBufferInsufficientCapacityException.MediaBrowserCompatItemReceiver, this.MediaDescriptionCompat);
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
            map.put(DecoderInputBufferInsufficientCapacityException.read, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        for (AudioRendererEventListenerEventDispatcher audioRendererEventListenerEventDispatcher : (Iterable) this.AudioAttributesImplApi26Parcelizer.invoke(playbackStatsEventTimeAndPlaybackState)) {
            map.put(audioRendererEventListenerEventDispatcher.RemoteActionCompatParcelizer, new JSONObject(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.read(setAction.write(feedInputBuffer.write.write(), Integer.valueOf(audioRendererEventListenerEventDispatcher.read.IconCompatParcelizer)), setAction.write(getTotalJoinTimeMs.read.write(), audioRendererEventListenerEventDispatcher.IconCompatParcelizer)))));
        }
        return map;
    }
}
