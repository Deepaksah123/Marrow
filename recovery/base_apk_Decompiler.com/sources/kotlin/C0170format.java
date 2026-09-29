package kotlin;

import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: renamed from: o.format, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0170format {
    public final int AudioAttributesCompatParcelizer;
    public final String AudioAttributesImplApi21Parcelizer;
    public final Object AudioAttributesImplApi26Parcelizer;
    public final keyFormat AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final DrmInitData MediaBrowserCompatMediaItem;
    public final int MediaBrowserCompatSearchResultReceiver;
    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final float RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String handleMediaPlayPauseIfPendingOnHandler;
    public final List<byte[]> onAddQueueItem;
    public final List<JsonValueFormatVisitor> onCommand;
    public final String onCustomAction;
    public final int onFastForward;
    public final int onMediaButtonEvent;
    public final int onPause;
    public final androidx.media3.common.Metadata onPlay;
    public final int onPlayFromMediaId;
    public final int onPlayFromSearch;
    public final String onPlayFromUri;
    public final int onPrepare;
    public final byte[] onPrepareFromMediaId;
    public final float onPrepareFromSearch;
    public final int onPrepareFromUri;
    public final int onRemoveQueueItem;
    public final int onRemoveQueueItemAt;
    public final int onRewind;
    public final long onSeekTo;
    public final int onSetCaptioningEnabled;
    private int onSetRating;
    public final int onSetShuffleMode;
    public final int read;
    public final int write;

    /* synthetic */ C0170format(RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
        this(remoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.format$RemoteActionCompatParcelizer */
    public static final class RemoteActionCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private DrmInitData AudioAttributesImplApi26Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private String IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private float MediaBrowserCompatSearchResultReceiver;
        private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private String MediaMetadataCompat;
        private int RatingCompat;
        private int RemoteActionCompatParcelizer;
        private String handleMediaPlayPauseIfPendingOnHandler;
        private List<JsonValueFormatVisitor> onAddQueueItem;
        private int onCommand;
        private List<byte[]> onCustomAction;
        private int onFastForward;
        private float onMediaButtonEvent;
        private int onPause;
        private androidx.media3.common.Metadata onPlay;
        private int onPlayFromMediaId;
        private int onPlayFromSearch;
        private String onPlayFromUri;
        private int onPrepare;
        private byte[] onPrepareFromMediaId;
        private int onPrepareFromSearch;
        private int onPrepareFromUri;
        private int onRemoveQueueItem;
        private int onRemoveQueueItemAt;
        private int onRewind;
        private long onSeekTo;
        private int onSetPlaybackSpeed;
        private keyFormat read;
        private int write;

        /* synthetic */ RemoteActionCompatParcelizer(C0170format c0170format, byte b) {
            this(c0170format);
        }

        public RemoteActionCompatParcelizer() {
            this.onAddQueueItem = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            this.AudioAttributesCompatParcelizer = -1;
            this.onPause = -1;
            this.onCommand = -1;
            this.onPlayFromMediaId = -1;
            this.onSeekTo = Long.MAX_VALUE;
            this.onSetPlaybackSpeed = -1;
            this.MediaDescriptionCompat = -1;
            this.MediaBrowserCompatSearchResultReceiver = -1.0f;
            this.onMediaButtonEvent = 1.0f;
            this.onRemoveQueueItem = -1;
            this.RemoteActionCompatParcelizer = -1;
            this.onPrepare = -1;
            this.onFastForward = -1;
            this.write = -1;
            this.AudioAttributesImplApi21Parcelizer = 1;
            this.onRewind = -1;
            this.onPrepareFromUri = -1;
            this.MediaBrowserCompatItemReceiver = 0;
        }

        private RemoteActionCompatParcelizer(C0170format c0170format) {
            this.MediaMetadataCompat = c0170format.handleMediaPlayPauseIfPendingOnHandler;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = c0170format.onCustomAction;
            this.onAddQueueItem = c0170format.onCommand;
            this.handleMediaPlayPauseIfPendingOnHandler = c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.onRemoveQueueItemAt = c0170format.onRewind;
            this.onPrepareFromSearch = c0170format.onPrepare;
            this.AudioAttributesCompatParcelizer = c0170format.IconCompatParcelizer;
            this.onPause = c0170format.onFastForward;
            this.IconCompatParcelizer = c0170format.RemoteActionCompatParcelizer;
            this.onPlay = c0170format.onPlay;
            this.MediaBrowserCompatCustomActionResultReceiver = c0170format.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesImplBaseParcelizer = c0170format.AudioAttributesImplApi21Parcelizer;
            this.onPlayFromUri = c0170format.onPlayFromUri;
            this.onCommand = c0170format.onPause;
            this.onPlayFromMediaId = c0170format.onPlayFromMediaId;
            this.onCustomAction = c0170format.onAddQueueItem;
            this.AudioAttributesImplApi26Parcelizer = c0170format.MediaBrowserCompatMediaItem;
            this.onSeekTo = c0170format.onSeekTo;
            this.onSetPlaybackSpeed = c0170format.onSetCaptioningEnabled;
            this.MediaDescriptionCompat = c0170format.MediaMetadataCompat;
            this.MediaBrowserCompatSearchResultReceiver = c0170format.RatingCompat;
            this.onPlayFromSearch = c0170format.onPlayFromSearch;
            this.onMediaButtonEvent = c0170format.onPrepareFromSearch;
            this.onPrepareFromMediaId = c0170format.onPrepareFromMediaId;
            this.onRemoveQueueItem = c0170format.onRemoveQueueItem;
            this.read = c0170format.AudioAttributesImplBaseParcelizer;
            this.RemoteActionCompatParcelizer = c0170format.AudioAttributesCompatParcelizer;
            this.onPrepare = c0170format.onPrepareFromUri;
            this.onFastForward = c0170format.onMediaButtonEvent;
            this.RatingCompat = c0170format.MediaDescriptionCompat;
            this.MediaBrowserCompatMediaItem = c0170format.MediaBrowserCompatSearchResultReceiver;
            this.write = c0170format.write;
            this.AudioAttributesImplApi21Parcelizer = c0170format.MediaBrowserCompatItemReceiver;
            this.onRewind = c0170format.onRemoveQueueItemAt;
            this.onPrepareFromUri = c0170format.onSetShuffleMode;
            this.MediaBrowserCompatItemReceiver = c0170format.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            this.MediaMetadataCompat = str;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(int i) {
            this.MediaMetadataCompat = Integer.toString(i);
            return this;
        }

        public final RemoteActionCompatParcelizer write(String str) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(List<JsonValueFormatVisitor> list) {
            this.onAddQueueItem = initExtraTracks.write(list);
            return this;
        }

        public final RemoteActionCompatParcelizer read(String str) {
            this.handleMediaPlayPauseIfPendingOnHandler = str;
            return this;
        }

        public final RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler(int i) {
            this.onRemoveQueueItemAt = i;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver(int i) {
            this.onPrepareFromSearch = i;
            return this;
        }

        public final RemoteActionCompatParcelizer write(int i) {
            this.AudioAttributesCompatParcelizer = i;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaDescriptionCompat(int i) {
            this.onPause = i;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        public final RemoteActionCompatParcelizer read(androidx.media3.common.Metadata metadata) {
            this.onPlay = metadata;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(String str) {
            this.AudioAttributesImplBaseParcelizer = DefaultBaseTypeLimitingValidator.MediaMetadataCompat(str);
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(String str) {
            this.onPlayFromUri = DefaultBaseTypeLimitingValidator.MediaMetadataCompat(str);
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(int i) {
            this.onCommand = i;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaMetadataCompat(int i) {
            this.onPlayFromMediaId = i;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(List<byte[]> list) {
            this.onCustomAction = list;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(DrmInitData drmInitData) {
            this.AudioAttributesImplApi26Parcelizer = drmInitData;
            return this;
        }

        public final RemoteActionCompatParcelizer write(long j) {
            this.onSeekTo = j;
            return this;
        }

        public final RemoteActionCompatParcelizer onFastForward(int i) {
            this.onSetPlaybackSpeed = i;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(int i) {
            this.MediaDescriptionCompat = i;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(float f) {
            this.MediaBrowserCompatSearchResultReceiver = f;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatMediaItem(int i) {
            this.onPlayFromSearch = i;
            return this;
        }

        public final RemoteActionCompatParcelizer write(float f) {
            this.onMediaButtonEvent = f;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(byte[] bArr) {
            this.onPrepareFromMediaId = bArr;
            return this;
        }

        public final RemoteActionCompatParcelizer onCustomAction(int i) {
            this.onRemoveQueueItem = i;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(keyFormat keyformat) {
            this.read = keyformat;
            return this;
        }

        public final RemoteActionCompatParcelizer read(int i) {
            this.RemoteActionCompatParcelizer = i;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) {
            this.onPrepare = i;
            return this;
        }

        public final RemoteActionCompatParcelizer RatingCompat(int i) {
            this.onFastForward = i;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(int i) {
            this.RatingCompat = i;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer(int i) {
            this.MediaBrowserCompatMediaItem = i;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            this.write = i;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(int i) {
            this.AudioAttributesImplApi21Parcelizer = i;
            return this;
        }

        public final RemoteActionCompatParcelizer onAddQueueItem(int i) {
            this.onRewind = i;
            return this;
        }

        public final RemoteActionCompatParcelizer onCommand(int i) {
            this.onPrepareFromUri = i;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            this.MediaBrowserCompatItemReceiver = i;
            return this;
        }

        public final C0170format IconCompatParcelizer() {
            return new C0170format(this, (byte) 0);
        }
    }

    static {
        new RemoteActionCompatParcelizer().IconCompatParcelizer();
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(7);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(8);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(9);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(10);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(11);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(12);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(13);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(14);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(15);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(16);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(17);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(18);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(19);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(20);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(21);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(22);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(23);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(24);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(25);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(26);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(27);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(28);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(29);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(30);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(31);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(32);
    }

    private static boolean AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer.onAddQueueItem.isEmpty() && remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            return true;
        }
        for (int i = 0; i < remoteActionCompatParcelizer.onAddQueueItem.size(); i++) {
            if (((JsonValueFormatVisitor) remoteActionCompatParcelizer.onAddQueueItem.get(i)).write.equals(remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                return true;
            }
        }
        return false;
    }

    private C0170format(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.handleMediaPlayPauseIfPendingOnHandler = remoteActionCompatParcelizer.MediaMetadataCompat;
        String str = LaissezFaireSubTypeValidator.read(remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str;
        if (!remoteActionCompatParcelizer.onAddQueueItem.isEmpty() || remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            if (!remoteActionCompatParcelizer.onAddQueueItem.isEmpty() && remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                this.onCommand = remoteActionCompatParcelizer.onAddQueueItem;
                this.onCustomAction = write(remoteActionCompatParcelizer.onAddQueueItem, str);
            } else {
                buildTypeSerializer.write(AudioAttributesCompatParcelizer(remoteActionCompatParcelizer));
                this.onCommand = remoteActionCompatParcelizer.onAddQueueItem;
                this.onCustomAction = remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            }
        } else {
            this.onCommand = initExtraTracks.read(new JsonValueFormatVisitor(str, remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
            this.onCustomAction = remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
        this.onRewind = remoteActionCompatParcelizer.onRemoveQueueItemAt;
        this.onPrepare = remoteActionCompatParcelizer.onPrepareFromSearch;
        int i = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = i;
        int i2 = remoteActionCompatParcelizer.onPause;
        this.onFastForward = i2;
        this.read = i2 != -1 ? i2 : i;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer;
        this.onPlay = remoteActionCompatParcelizer.onPlay;
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
        this.onPlayFromUri = remoteActionCompatParcelizer.onPlayFromUri;
        this.onPause = remoteActionCompatParcelizer.onCommand;
        this.onPlayFromMediaId = remoteActionCompatParcelizer.onPlayFromMediaId;
        this.onAddQueueItem = remoteActionCompatParcelizer.onCustomAction == null ? Collections.emptyList() : remoteActionCompatParcelizer.onCustomAction;
        DrmInitData drmInitData = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatMediaItem = drmInitData;
        this.onSeekTo = remoteActionCompatParcelizer.onSeekTo;
        this.onSetCaptioningEnabled = remoteActionCompatParcelizer.onSetPlaybackSpeed;
        this.MediaMetadataCompat = remoteActionCompatParcelizer.MediaDescriptionCompat;
        this.RatingCompat = remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
        this.onPlayFromSearch = remoteActionCompatParcelizer.onPlayFromSearch == -1 ? 0 : remoteActionCompatParcelizer.onPlayFromSearch;
        this.onPrepareFromSearch = remoteActionCompatParcelizer.onMediaButtonEvent == -1.0f ? 1.0f : remoteActionCompatParcelizer.onMediaButtonEvent;
        this.onPrepareFromMediaId = remoteActionCompatParcelizer.onPrepareFromMediaId;
        this.onRemoveQueueItem = remoteActionCompatParcelizer.onRemoveQueueItem;
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.read;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        this.onPrepareFromUri = remoteActionCompatParcelizer.onPrepare;
        this.onMediaButtonEvent = remoteActionCompatParcelizer.onFastForward;
        this.MediaDescriptionCompat = remoteActionCompatParcelizer.RatingCompat == -1 ? 0 : remoteActionCompatParcelizer.RatingCompat;
        this.MediaBrowserCompatSearchResultReceiver = remoteActionCompatParcelizer.MediaBrowserCompatMediaItem != -1 ? remoteActionCompatParcelizer.MediaBrowserCompatMediaItem : 0;
        this.write = remoteActionCompatParcelizer.write;
        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        this.onRemoveQueueItemAt = remoteActionCompatParcelizer.onRewind;
        this.onSetShuffleMode = remoteActionCompatParcelizer.onPrepareFromUri;
        if (remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver != 0 || drmInitData == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver;
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
        }
    }

    public final RemoteActionCompatParcelizer write() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final C0170format read(C0170format c0170format) {
        String str;
        androidx.media3.common.Metadata metadataRemoteActionCompatParcelizer;
        if (this == c0170format) {
            return this;
        }
        int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(this.onPlayFromUri);
        String str2 = c0170format.handleMediaPlayPauseIfPendingOnHandler;
        int i = c0170format.onRemoveQueueItemAt;
        int i2 = c0170format.onSetShuffleMode;
        String str3 = c0170format.onCustomAction;
        if (str3 == null) {
            str3 = this.onCustomAction;
        }
        List<JsonValueFormatVisitor> list = !c0170format.onCommand.isEmpty() ? c0170format.onCommand : this.onCommand;
        String str4 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if ((iIconCompatParcelizer == 3 || iIconCompatParcelizer == 1) && (str = c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) != null) {
            str4 = str;
        }
        int i3 = this.IconCompatParcelizer;
        if (i3 == -1) {
            i3 = c0170format.IconCompatParcelizer;
        }
        int i4 = this.onFastForward;
        if (i4 == -1) {
            i4 = c0170format.onFastForward;
        }
        String str5 = this.RemoteActionCompatParcelizer;
        if (str5 == null) {
            String strIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(c0170format.RemoteActionCompatParcelizer, iIconCompatParcelizer);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver(strIconCompatParcelizer).length == 1) {
                str5 = strIconCompatParcelizer;
            }
        }
        androidx.media3.common.Metadata metadata = this.onPlay;
        if (metadata == null) {
            metadataRemoteActionCompatParcelizer = c0170format.onPlay;
        } else {
            metadataRemoteActionCompatParcelizer = metadata.RemoteActionCompatParcelizer(c0170format.onPlay);
        }
        float f = this.RatingCompat;
        if (f == -1.0f && iIconCompatParcelizer == 2) {
            f = c0170format.RatingCompat;
        }
        return write().AudioAttributesCompatParcelizer(str2).write(str3).IconCompatParcelizer(list).read(str4).handleMediaPlayPauseIfPendingOnHandler(this.onRewind | c0170format.onRewind).MediaBrowserCompatSearchResultReceiver(this.onPrepare | c0170format.onPrepare).write(i3).MediaDescriptionCompat(i4).RemoteActionCompatParcelizer(str5).read(metadataRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(DrmInitData.AudioAttributesCompatParcelizer(c0170format.MediaBrowserCompatMediaItem, this.MediaBrowserCompatMediaItem)).RemoteActionCompatParcelizer(f).onAddQueueItem(i).onCommand(i2).IconCompatParcelizer();
    }

    public final C0170format read(int i) {
        return write().RemoteActionCompatParcelizer(i).IconCompatParcelizer();
    }

    public final int AudioAttributesCompatParcelizer() {
        int i;
        int i2 = this.onSetCaptioningEnabled;
        if (i2 == -1 || (i = this.MediaMetadataCompat) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
        sb.append(", ");
        sb.append(this.onCustomAction);
        sb.append(", ");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", ");
        sb.append(this.onPlayFromUri);
        sb.append(", ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", ");
        sb.append(this.read);
        sb.append(", ");
        sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        sb.append(", [");
        sb.append(this.onSetCaptioningEnabled);
        sb.append(", ");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ");
        sb.append(this.RatingCompat);
        sb.append(", ");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append("], [");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", ");
        sb.append(this.onPrepareFromUri);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.onSetRating == 0) {
            String str = this.handleMediaPlayPauseIfPendingOnHandler;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.onCustomAction;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            int iHashCode3 = this.onCommand.hashCode();
            String str3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            int i = this.onRewind;
            int i2 = this.onPrepare;
            int i3 = this.IconCompatParcelizer;
            int i4 = this.onFastForward;
            String str4 = this.RemoteActionCompatParcelizer;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            androidx.media3.common.Metadata metadata = this.onPlay;
            int iHashCode6 = metadata == null ? 0 : metadata.hashCode();
            Object obj = this.AudioAttributesImplApi26Parcelizer;
            int iHashCode7 = obj == null ? 0 : obj.hashCode();
            String str5 = this.AudioAttributesImplApi21Parcelizer;
            int iHashCode8 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.onPlayFromUri;
            int iHashCode9 = str6 != null ? str6.hashCode() : 0;
            int i5 = this.onPause;
            int i6 = (int) this.onSeekTo;
            int i7 = this.onSetCaptioningEnabled;
            int i8 = this.MediaMetadataCompat;
            int iFloatToIntBits = Float.floatToIntBits(this.RatingCompat);
            int i9 = this.onPlayFromSearch;
            int iFloatToIntBits2 = Float.floatToIntBits(this.onPrepareFromSearch);
            int i10 = this.onRemoveQueueItem;
            int i11 = this.AudioAttributesCompatParcelizer;
            int i12 = this.onPrepareFromUri;
            int i13 = this.onMediaButtonEvent;
            int i14 = this.MediaDescriptionCompat;
            int i15 = this.MediaBrowserCompatSearchResultReceiver;
            int i16 = this.write;
            this.onSetRating = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + iFloatToIntBits) * 31) + i9) * 31) + iFloatToIntBits2) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + this.onRemoveQueueItemAt) * 31) + this.onSetShuffleMode) * 31) + this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return this.onSetRating;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0170format c0170format = (C0170format) obj;
            int i2 = this.onSetRating;
            if ((i2 == 0 || (i = c0170format.onSetRating) == 0 || i2 == i) && this.onRewind == c0170format.onRewind && this.onPrepare == c0170format.onPrepare && this.IconCompatParcelizer == c0170format.IconCompatParcelizer && this.onFastForward == c0170format.onFastForward && this.onPause == c0170format.onPause && this.onSeekTo == c0170format.onSeekTo && this.onSetCaptioningEnabled == c0170format.onSetCaptioningEnabled && this.MediaMetadataCompat == c0170format.MediaMetadataCompat && this.onPlayFromSearch == c0170format.onPlayFromSearch && this.onRemoveQueueItem == c0170format.onRemoveQueueItem && this.AudioAttributesCompatParcelizer == c0170format.AudioAttributesCompatParcelizer && this.onPrepareFromUri == c0170format.onPrepareFromUri && this.onMediaButtonEvent == c0170format.onMediaButtonEvent && this.MediaDescriptionCompat == c0170format.MediaDescriptionCompat && this.MediaBrowserCompatSearchResultReceiver == c0170format.MediaBrowserCompatSearchResultReceiver && this.write == c0170format.write && this.onRemoveQueueItemAt == c0170format.onRemoveQueueItemAt && this.onSetShuffleMode == c0170format.onSetShuffleMode && this.MediaBrowserCompatCustomActionResultReceiver == c0170format.MediaBrowserCompatCustomActionResultReceiver && Float.compare(this.RatingCompat, c0170format.RatingCompat) == 0 && Float.compare(this.onPrepareFromSearch, c0170format.onPrepareFromSearch) == 0 && Objects.equals(this.handleMediaPlayPauseIfPendingOnHandler, c0170format.handleMediaPlayPauseIfPendingOnHandler) && Objects.equals(this.onCustomAction, c0170format.onCustomAction) && this.onCommand.equals(c0170format.onCommand) && Objects.equals(this.RemoteActionCompatParcelizer, c0170format.RemoteActionCompatParcelizer) && Objects.equals(this.AudioAttributesImplApi21Parcelizer, c0170format.AudioAttributesImplApi21Parcelizer) && Objects.equals(this.onPlayFromUri, c0170format.onPlayFromUri) && Objects.equals(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && Arrays.equals(this.onPrepareFromMediaId, c0170format.onPrepareFromMediaId) && Objects.equals(this.onPlay, c0170format.onPlay) && Objects.equals(this.AudioAttributesImplBaseParcelizer, c0170format.AudioAttributesImplBaseParcelizer) && Objects.equals(this.MediaBrowserCompatMediaItem, c0170format.MediaBrowserCompatMediaItem) && AudioAttributesCompatParcelizer(c0170format) && Objects.equals(this.AudioAttributesImplApi26Parcelizer, c0170format.AudioAttributesImplApi26Parcelizer)) {
                return true;
            }
        }
        return false;
    }

    public final boolean AudioAttributesCompatParcelizer(C0170format c0170format) {
        if (this.onAddQueueItem.size() != c0170format.onAddQueueItem.size()) {
            return false;
        }
        for (int i = 0; i < this.onAddQueueItem.size(); i++) {
            if (!Arrays.equals(this.onAddQueueItem.get(i), c0170format.onAddQueueItem.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static String IconCompatParcelizer(C0170format c0170format) {
        if (c0170format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c0170format.handleMediaPlayPauseIfPendingOnHandler);
        sb.append(", mimeType=");
        sb.append(c0170format.onPlayFromUri);
        if (c0170format.AudioAttributesImplApi21Parcelizer != null) {
            sb.append(", container=");
            sb.append(c0170format.AudioAttributesImplApi21Parcelizer);
        }
        if (c0170format.read != -1) {
            sb.append(", bitrate=");
            sb.append(c0170format.read);
        }
        if (c0170format.RemoteActionCompatParcelizer != null) {
            sb.append(", codecs=");
            sb.append(c0170format.RemoteActionCompatParcelizer);
        }
        if (c0170format.MediaBrowserCompatMediaItem != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < c0170format.MediaBrowserCompatMediaItem.IconCompatParcelizer; i++) {
                UUID uuid = c0170format.MediaBrowserCompatMediaItem.write(i).AudioAttributesCompatParcelizer;
                if (uuid.equals(JsonMapFormatVisitor.write)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(JsonMapFormatVisitor.AudioAttributesCompatParcelizer)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(JsonMapFormatVisitor.RemoteActionCompatParcelizer)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(JsonMapFormatVisitor.IconCompatParcelizer)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(JsonMapFormatVisitor.read)) {
                    linkedHashSet.add("universal");
                } else {
                    StringBuilder sb2 = new StringBuilder("unknown (");
                    sb2.append(uuid);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sb.append(", drm=[");
            parseSchiFromParent.IconCompatParcelizer().RemoteActionCompatParcelizer(sb, linkedHashSet);
            sb.append(']');
        }
        if (c0170format.onSetCaptioningEnabled != -1 && c0170format.MediaMetadataCompat != -1) {
            sb.append(", res=");
            sb.append(c0170format.onSetCaptioningEnabled);
            sb.append("x");
            sb.append(c0170format.MediaMetadataCompat);
        }
        keyFormat keyformat = c0170format.AudioAttributesImplBaseParcelizer;
        if (keyformat != null && keyformat.RemoteActionCompatParcelizer()) {
            sb.append(", color=");
            sb.append(c0170format.AudioAttributesImplBaseParcelizer.IconCompatParcelizer());
        }
        if (c0170format.RatingCompat != -1.0f) {
            sb.append(", fps=");
            sb.append(c0170format.RatingCompat);
        }
        if (c0170format.AudioAttributesCompatParcelizer != -1) {
            sb.append(", channels=");
            sb.append(c0170format.AudioAttributesCompatParcelizer);
        }
        if (c0170format.onPrepareFromUri != -1) {
            sb.append(", sample_rate=");
            sb.append(c0170format.onPrepareFromUri);
        }
        if (c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
            sb.append(", language=");
            sb.append(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        if (!c0170format.onCommand.isEmpty()) {
            sb.append(", labels=[");
            parseSchiFromParent.IconCompatParcelizer().RemoteActionCompatParcelizer(sb, c0170format.onCommand);
            sb.append("]");
        }
        if (c0170format.onRewind != 0) {
            sb.append(", selectionFlags=[");
            parseSchiFromParent.IconCompatParcelizer().RemoteActionCompatParcelizer(sb, LaissezFaireSubTypeValidator.AudioAttributesImplBaseParcelizer(c0170format.onRewind));
            sb.append("]");
        }
        if (c0170format.onPrepare != 0) {
            sb.append(", roleFlags=[");
            parseSchiFromParent.IconCompatParcelizer().RemoteActionCompatParcelizer(sb, LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver(c0170format.onPrepare));
            sb.append("]");
        }
        if (c0170format.AudioAttributesImplApi26Parcelizer != null) {
            sb.append(", customData=");
            sb.append(c0170format.AudioAttributesImplApi26Parcelizer);
        }
        return sb.toString();
    }

    private static String write(List<JsonValueFormatVisitor> list, String str) {
        for (JsonValueFormatVisitor jsonValueFormatVisitor : list) {
            if (TextUtils.equals(jsonValueFormatVisitor.RemoteActionCompatParcelizer, str)) {
                return jsonValueFormatVisitor.write;
            }
        }
        return list.get(0).write;
    }
}
