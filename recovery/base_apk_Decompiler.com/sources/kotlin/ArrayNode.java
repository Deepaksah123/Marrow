package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import java.util.Iterator;
import kotlin._withArrayAddTailProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayNode implements _withArrayAddTailProperty {
    private final long AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final long MediaBrowserCompatItemReceiver;
    private long RatingCompat;
    private final HashMap<modifyArraySerializer, RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;
    private final long read;
    private final _resolveSuperInterfaces write;

    public ArrayNode() {
        this(new _resolveSuperInterfaces());
    }

    private ArrayNode(_resolveSuperInterfaces _resolvesuperinterfaces) {
        AudioAttributesCompatParcelizer(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 0, "bufferForPlaybackMs", SessionDescription.SUPPORTED_SDP_VERSION);
        AudioAttributesCompatParcelizer(5000, 0, "bufferForPlaybackAfterRebufferMs", SessionDescription.SUPPORTED_SDP_VERSION);
        AudioAttributesCompatParcelizer(50000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, "minBufferMs", "bufferForPlaybackMs");
        AudioAttributesCompatParcelizer(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        AudioAttributesCompatParcelizer(50000, 50000, "maxBufferMs", "minBufferMs");
        AudioAttributesCompatParcelizer(0, 0, "backBufferDurationMs", SessionDescription.SUPPORTED_SDP_VERSION);
        this.write = _resolvesuperinterfaces;
        this.AudioAttributesImplApi26Parcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(50000L);
        this.MediaBrowserCompatItemReceiver = LaissezFaireSubTypeValidator.IconCompatParcelizer(50000L);
        this.AudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(2500L);
        this.read = LaissezFaireSubTypeValidator.IconCompatParcelizer(5000L);
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.AudioAttributesImplBaseParcelizer = false;
        this.IconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(0L);
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.RemoteActionCompatParcelizer = new HashMap<>();
        this.RatingCompat = -1L;
    }

    @Override // kotlin._withArrayAddTailProperty
    public final void write(modifyArraySerializer modifyarrayserializer) {
        long id = Thread.currentThread().getId();
        long j = this.RatingCompat;
        byte b = 0;
        buildTypeSerializer.read(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.RatingCompat = id;
        if (!this.RemoteActionCompatParcelizer.containsKey(modifyarrayserializer)) {
            this.RemoteActionCompatParcelizer.put(modifyarrayserializer, new RemoteActionCompatParcelizer(b));
        }
        read(modifyarrayserializer);
    }

    @Override // kotlin._withArrayAddTailProperty
    public final void RemoteActionCompatParcelizer(modifyArraySerializer modifyarrayserializer, buildIndexedListSerializer[] buildindexedlistserializerArr, _writeAsBinary _writeasbinary, _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(modifyarrayserializer));
        int iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        if (iAudioAttributesCompatParcelizer == -1) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(buildindexedlistserializerArr, _verifyandresolveplaceholdersArr);
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = iAudioAttributesCompatParcelizer;
        MediaDescriptionCompat();
    }

    @Override // kotlin._withArrayAddTailProperty
    public final void RemoteActionCompatParcelizer(modifyArraySerializer modifyarrayserializer) {
        AudioAttributesCompatParcelizer(modifyarrayserializer);
    }

    @Override // kotlin._withArrayAddTailProperty
    public final void IconCompatParcelizer(modifyArraySerializer modifyarrayserializer) {
        AudioAttributesCompatParcelizer(modifyarrayserializer);
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            this.RatingCompat = -1L;
        }
    }

    @Override // kotlin._withArrayAddTailProperty
    public final _findWellKnownSimple AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin._withArrayAddTailProperty
    public final long IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin._withArrayAddTailProperty
    public final boolean write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin._withArrayAddTailProperty
    public final boolean AudioAttributesCompatParcelizer(_withArrayAddTailProperty.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver));
        boolean z = true;
        boolean z2 = this.write.RemoteActionCompatParcelizer() >= MediaMetadataCompat();
        long jMin = this.AudioAttributesImplApi26Parcelizer;
        if (audioAttributesCompatParcelizer.write > 1.0f) {
            jMin = Math.min(LaissezFaireSubTypeValidator.read(jMin, audioAttributesCompatParcelizer.write), this.MediaBrowserCompatItemReceiver);
        }
        if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer < Math.max(jMin, 500000L)) {
            if (!this.AudioAttributesImplBaseParcelizer && z2) {
                z = false;
            }
            remoteActionCompatParcelizer.read = z;
            if (!remoteActionCompatParcelizer.read && audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer < 500000) {
                prune.RemoteActionCompatParcelizer("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer >= this.MediaBrowserCompatItemReceiver || z2) {
            remoteActionCompatParcelizer.read = false;
        }
        return remoteActionCompatParcelizer.read;
    }

    @Override // kotlin._withArrayAddTailProperty
    public final boolean read(_withArrayAddTailProperty.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.write);
        long jMin = audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer ? this.read : this.AudioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer != C.TIME_UNSET) {
            jMin = Math.min(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer / 2, jMin);
        }
        if (jMin <= 0 || jIconCompatParcelizer >= jMin) {
            return true;
        }
        return !this.AudioAttributesImplBaseParcelizer && this.write.RemoteActionCompatParcelizer() >= MediaMetadataCompat();
    }

    private static int AudioAttributesCompatParcelizer(buildIndexedListSerializer[] buildindexedlistserializerArr, _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        int iWrite = 0;
        for (int i = 0; i < buildindexedlistserializerArr.length; i++) {
            if (_verifyandresolveplaceholdersArr[i] != null) {
                iWrite += write(buildindexedlistserializerArr[i].MediaBrowserCompatMediaItem());
            }
        }
        return Math.max(13107200, iWrite);
    }

    private int MediaMetadataCompat() {
        Iterator<RemoteActionCompatParcelizer> it = this.RemoteActionCompatParcelizer.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().RemoteActionCompatParcelizer;
        }
        return i;
    }

    private void read(modifyArraySerializer modifyarrayserializer) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(modifyarrayserializer));
        int i = this.AudioAttributesImplApi21Parcelizer;
        if (i == -1) {
            i = 13107200;
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = i;
        remoteActionCompatParcelizer.read = false;
    }

    private void AudioAttributesCompatParcelizer(modifyArraySerializer modifyarrayserializer) {
        if (this.RemoteActionCompatParcelizer.remove(modifyarrayserializer) != null) {
            MediaDescriptionCompat();
        }
    }

    private void MediaDescriptionCompat() {
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            this.write.AudioAttributesCompatParcelizer();
        } else {
            this.write.RemoteActionCompatParcelizer(MediaMetadataCompat());
        }
    }

    private static int write(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private static void AudioAttributesCompatParcelizer(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        buildTypeSerializer.write(z, sb.toString());
    }

    static class RemoteActionCompatParcelizer {
        public int RemoteActionCompatParcelizer;
        public boolean read;

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }
}
