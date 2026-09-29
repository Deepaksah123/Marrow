package kotlin;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getSchema {
    public static final getSchema AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer().read();
    public final CharSequence AudioAttributesImplApi21Parcelizer;
    public final Integer AudioAttributesImplApi26Parcelizer;
    public final CharSequence AudioAttributesImplBaseParcelizer;
    public final CharSequence IconCompatParcelizer;
    public final Uri MediaBrowserCompatCustomActionResultReceiver;
    public final CharSequence MediaBrowserCompatItemReceiver;
    public final Bundle MediaBrowserCompatMediaItem;
    public final Integer MediaBrowserCompatSearchResultReceiver;
    public final Boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CharSequence MediaDescriptionCompat;
    public final Long MediaMetadataCompat;
    public final CharSequence RatingCompat;
    public final CharSequence RemoteActionCompatParcelizer;
    public final CharSequence handleMediaPlayPauseIfPendingOnHandler;
    public final Integer onAddQueueItem;

    @Deprecated
    public final Integer onCommand;
    public final Boolean onCustomAction;
    public final Integer onFastForward;
    public final Integer onMediaButtonEvent;
    public final Integer onPause;
    public final Integer onPlay;
    public final NamedType onPlayFromMediaId;
    public final CharSequence onPlayFromSearch;
    public final Integer onPlayFromUri;
    public final CharSequence onPrepare;
    public final CharSequence onPrepareFromMediaId;
    public final Integer onPrepareFromSearch;
    public final Integer onPrepareFromUri;
    public final Integer onRemoveQueueItem;
    public final NamedType onRemoveQueueItemAt;
    public final Integer onRewind;
    public final CharSequence onSeekTo;

    @Deprecated
    public final Integer onSetRepeatMode;
    public final byte[] read;
    public final CharSequence write;

    private static int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 22;
            case 4:
                return 23;
            case 5:
                return 24;
            case 6:
                return 25;
            default:
                return 20;
        }
    }

    private static int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return 1;
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            default:
                return 0;
            case 21:
                return 2;
            case 22:
                return 3;
            case 23:
                return 4;
            case 24:
                return 5;
            case 25:
                return 6;
        }
    }

    /* synthetic */ getSchema(RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
        this(remoteActionCompatParcelizer);
    }

    public static final class RemoteActionCompatParcelizer {
        private CharSequence AudioAttributesCompatParcelizer;
        private CharSequence AudioAttributesImplApi21Parcelizer;
        private CharSequence AudioAttributesImplApi26Parcelizer;
        private CharSequence AudioAttributesImplBaseParcelizer;
        private Integer IconCompatParcelizer;
        private CharSequence MediaBrowserCompatCustomActionResultReceiver;
        private Uri MediaBrowserCompatItemReceiver;
        private Bundle MediaBrowserCompatMediaItem;
        private Integer MediaBrowserCompatSearchResultReceiver;
        private Boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private CharSequence MediaDescriptionCompat;
        private Long MediaMetadataCompat;
        private Integer RatingCompat;
        private CharSequence RemoteActionCompatParcelizer;
        private Integer handleMediaPlayPauseIfPendingOnHandler;
        private CharSequence onAddQueueItem;
        private Boolean onCommand;
        private NamedType onCustomAction;
        private Integer onFastForward;
        private Integer onMediaButtonEvent;
        private Integer onPause;
        private Integer onPlay;
        private Integer onPlayFromMediaId;
        private CharSequence onPlayFromSearch;
        private Integer onPlayFromUri;
        private CharSequence onPrepare;
        private Integer onPrepareFromMediaId;
        private CharSequence onPrepareFromSearch;
        private CharSequence onRemoveQueueItem;
        private Integer onRemoveQueueItemAt;
        private Integer onRewind;
        private NamedType onSeekTo;
        private byte[] read;
        private CharSequence write;

        /* synthetic */ RemoteActionCompatParcelizer(getSchema getschema, byte b) {
            this(getschema);
        }

        public RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(getSchema getschema) {
            this.onPlayFromSearch = getschema.onPlayFromSearch;
            this.write = getschema.write;
            this.RemoteActionCompatParcelizer = getschema.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = getschema.RemoteActionCompatParcelizer;
            this.MediaDescriptionCompat = getschema.RatingCompat;
            this.onPrepareFromSearch = getschema.onPrepareFromMediaId;
            this.AudioAttributesImplApi26Parcelizer = getschema.MediaDescriptionCompat;
            this.MediaMetadataCompat = getschema.MediaMetadataCompat;
            this.onSeekTo = getschema.onRemoveQueueItemAt;
            this.onCustomAction = getschema.onPlayFromMediaId;
            this.read = getschema.read;
            this.IconCompatParcelizer = getschema.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatItemReceiver = getschema.MediaBrowserCompatCustomActionResultReceiver;
            this.onRemoveQueueItemAt = getschema.onPrepareFromUri;
            this.onRewind = getschema.onRemoveQueueItem;
            this.MediaBrowserCompatSearchResultReceiver = getschema.onCommand;
            this.onCommand = getschema.onCustomAction;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getschema.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.onPlay = getschema.onPause;
            this.onPause = getschema.onFastForward;
            this.onMediaButtonEvent = getschema.onPlay;
            this.onPrepareFromMediaId = getschema.onPrepareFromSearch;
            this.onFastForward = getschema.onPlayFromUri;
            this.onPlayFromMediaId = getschema.onMediaButtonEvent;
            this.onRemoveQueueItem = getschema.onSeekTo;
            this.AudioAttributesImplApi21Parcelizer = getschema.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplBaseParcelizer = getschema.AudioAttributesImplApi21Parcelizer;
            this.RatingCompat = getschema.MediaBrowserCompatSearchResultReceiver;
            this.onPlayFromUri = getschema.onRewind;
            this.onAddQueueItem = getschema.handleMediaPlayPauseIfPendingOnHandler;
            this.MediaBrowserCompatCustomActionResultReceiver = getschema.AudioAttributesImplBaseParcelizer;
            this.onPrepare = getschema.onPrepare;
            this.handleMediaPlayPauseIfPendingOnHandler = getschema.onAddQueueItem;
            this.MediaBrowserCompatMediaItem = getschema.MediaBrowserCompatMediaItem;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(CharSequence charSequence) {
            this.onPlayFromSearch = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(CharSequence charSequence) {
            this.write = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(CharSequence charSequence) {
            this.RemoteActionCompatParcelizer = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer write(CharSequence charSequence) {
            this.AudioAttributesCompatParcelizer = charSequence;
            return this;
        }

        private RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver(CharSequence charSequence) {
            this.MediaDescriptionCompat = charSequence;
            return this;
        }

        private RemoteActionCompatParcelizer MediaDescriptionCompat(CharSequence charSequence) {
            this.onPrepareFromSearch = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(CharSequence charSequence) {
            this.AudioAttributesImplApi26Parcelizer = charSequence;
            return this;
        }

        private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Long l) {
            buildTypeSerializer.IconCompatParcelizer(l == null || l.longValue() >= 0);
            this.MediaMetadataCompat = l;
            return this;
        }

        private RemoteActionCompatParcelizer IconCompatParcelizer(NamedType namedType) {
            this.onSeekTo = namedType;
            return this;
        }

        private RemoteActionCompatParcelizer read(NamedType namedType) {
            this.onCustomAction = namedType;
            return this;
        }

        private RemoteActionCompatParcelizer IconCompatParcelizer(byte[] bArr, Integer num) {
            this.read = bArr == null ? null : (byte[]) bArr.clone();
            this.IconCompatParcelizer = num;
            return this;
        }

        public final RemoteActionCompatParcelizer read(byte[] bArr, int i) {
            if (this.read != null && !LaissezFaireSubTypeValidator.read((Object) Integer.valueOf(i), (Object) 3) && LaissezFaireSubTypeValidator.read((Object) this.IconCompatParcelizer, (Object) 3)) {
                return this;
            }
            this.read = (byte[]) bArr.clone();
            this.IconCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        private RemoteActionCompatParcelizer read(Uri uri) {
            this.MediaBrowserCompatItemReceiver = uri;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(Integer num) {
            this.onRemoveQueueItemAt = num;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(Integer num) {
            this.onRewind = num;
            return this;
        }

        @Deprecated
        private RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(Integer num) {
            this.MediaBrowserCompatSearchResultReceiver = num;
            return this;
        }

        private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Boolean bool) {
            this.onCommand = bool;
            return this;
        }

        private RemoteActionCompatParcelizer write(Boolean bool) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = bool;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Integer num) {
            this.onPlay = num;
            return this;
        }

        public final RemoteActionCompatParcelizer read(Integer num) {
            this.onPause = num;
            return this;
        }

        public final RemoteActionCompatParcelizer write(Integer num) {
            this.onMediaButtonEvent = num;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer(Integer num) {
            this.onPrepareFromMediaId = num;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(Integer num) {
            this.onFastForward = num;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Integer num) {
            this.onPlayFromMediaId = num;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(CharSequence charSequence) {
            this.onRemoveQueueItem = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer read(CharSequence charSequence) {
            this.AudioAttributesImplApi21Parcelizer = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.AudioAttributesImplBaseParcelizer = charSequence;
            return this;
        }

        private RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(Integer num) {
            this.RatingCompat = num;
            return this;
        }

        private RemoteActionCompatParcelizer RatingCompat(Integer num) {
            this.onPlayFromUri = num;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer(CharSequence charSequence) {
            this.onAddQueueItem = charSequence;
            return this;
        }

        private RemoteActionCompatParcelizer MediaBrowserCompatMediaItem(CharSequence charSequence) {
            this.MediaBrowserCompatCustomActionResultReceiver = charSequence;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(CharSequence charSequence) {
            this.onPrepare = charSequence;
            return this;
        }

        private RemoteActionCompatParcelizer MediaMetadataCompat(Integer num) {
            this.handleMediaPlayPauseIfPendingOnHandler = num;
            return this;
        }

        private RemoteActionCompatParcelizer IconCompatParcelizer(Bundle bundle) {
            this.MediaBrowserCompatMediaItem = bundle;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(androidx.media3.common.Metadata metadata) {
            for (int i = 0; i < metadata.write(); i++) {
                metadata.IconCompatParcelizer(i).AudioAttributesCompatParcelizer(this);
            }
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(List<androidx.media3.common.Metadata> list) {
            for (int i = 0; i < list.size(); i++) {
                androidx.media3.common.Metadata metadata = list.get(i);
                for (int i2 = 0; i2 < metadata.write(); i2++) {
                    metadata.IconCompatParcelizer(i2).AudioAttributesCompatParcelizer(this);
                }
            }
            return this;
        }

        public final RemoteActionCompatParcelizer read(getSchema getschema) {
            if (getschema != null) {
                if (getschema.onPlayFromSearch != null) {
                    AudioAttributesImplApi26Parcelizer(getschema.onPlayFromSearch);
                }
                if (getschema.write != null) {
                    AudioAttributesCompatParcelizer(getschema.write);
                }
                if (getschema.IconCompatParcelizer != null) {
                    IconCompatParcelizer(getschema.IconCompatParcelizer);
                }
                if (getschema.RemoteActionCompatParcelizer != null) {
                    write(getschema.RemoteActionCompatParcelizer);
                }
                if (getschema.RatingCompat != null) {
                    MediaBrowserCompatSearchResultReceiver(getschema.RatingCompat);
                }
                if (getschema.onPrepareFromMediaId != null) {
                    MediaDescriptionCompat(getschema.onPrepareFromMediaId);
                }
                if (getschema.MediaDescriptionCompat != null) {
                    MediaBrowserCompatCustomActionResultReceiver(getschema.MediaDescriptionCompat);
                }
                if (getschema.MediaMetadataCompat != null) {
                    RemoteActionCompatParcelizer(getschema.MediaMetadataCompat);
                }
                if (getschema.onRemoveQueueItemAt != null) {
                    IconCompatParcelizer(getschema.onRemoveQueueItemAt);
                }
                if (getschema.onPlayFromMediaId != null) {
                    read(getschema.onPlayFromMediaId);
                }
                if (getschema.MediaBrowserCompatCustomActionResultReceiver != null || getschema.read != null) {
                    read(getschema.MediaBrowserCompatCustomActionResultReceiver);
                    IconCompatParcelizer(getschema.read, getschema.AudioAttributesImplApi26Parcelizer);
                }
                if (getschema.onPrepareFromUri != null) {
                    AudioAttributesImplBaseParcelizer(getschema.onPrepareFromUri);
                }
                if (getschema.onRemoveQueueItem != null) {
                    MediaBrowserCompatItemReceiver(getschema.onRemoveQueueItem);
                }
                if (getschema.onCommand != null) {
                    MediaBrowserCompatCustomActionResultReceiver(getschema.onCommand);
                }
                if (getschema.onCustomAction != null) {
                    RemoteActionCompatParcelizer(getschema.onCustomAction);
                }
                if (getschema.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
                    write(getschema.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                }
                if (getschema.onSetRepeatMode != null) {
                    AudioAttributesCompatParcelizer(getschema.onSetRepeatMode);
                }
                if (getschema.onPause != null) {
                    AudioAttributesCompatParcelizer(getschema.onPause);
                }
                if (getschema.onFastForward != null) {
                    read(getschema.onFastForward);
                }
                if (getschema.onPlay != null) {
                    write(getschema.onPlay);
                }
                if (getschema.onPrepareFromSearch != null) {
                    AudioAttributesImplApi21Parcelizer(getschema.onPrepareFromSearch);
                }
                if (getschema.onPlayFromUri != null) {
                    IconCompatParcelizer(getschema.onPlayFromUri);
                }
                if (getschema.onMediaButtonEvent != null) {
                    RemoteActionCompatParcelizer(getschema.onMediaButtonEvent);
                }
                if (getschema.onSeekTo != null) {
                    AudioAttributesImplBaseParcelizer(getschema.onSeekTo);
                }
                if (getschema.MediaBrowserCompatItemReceiver != null) {
                    read(getschema.MediaBrowserCompatItemReceiver);
                }
                if (getschema.AudioAttributesImplApi21Parcelizer != null) {
                    RemoteActionCompatParcelizer(getschema.AudioAttributesImplApi21Parcelizer);
                }
                if (getschema.MediaBrowserCompatSearchResultReceiver != null) {
                    AudioAttributesImplApi26Parcelizer(getschema.MediaBrowserCompatSearchResultReceiver);
                }
                if (getschema.onRewind != null) {
                    RatingCompat(getschema.onRewind);
                }
                if (getschema.handleMediaPlayPauseIfPendingOnHandler != null) {
                    AudioAttributesImplApi21Parcelizer(getschema.handleMediaPlayPauseIfPendingOnHandler);
                }
                if (getschema.AudioAttributesImplBaseParcelizer != null) {
                    MediaBrowserCompatMediaItem(getschema.AudioAttributesImplBaseParcelizer);
                }
                if (getschema.onPrepare != null) {
                    MediaBrowserCompatItemReceiver(getschema.onPrepare);
                }
                if (getschema.onAddQueueItem != null) {
                    MediaMetadataCompat(getschema.onAddQueueItem);
                }
                if (getschema.MediaBrowserCompatMediaItem != null) {
                    IconCompatParcelizer(getschema.MediaBrowserCompatMediaItem);
                }
            }
            return this;
        }

        public final getSchema read() {
            return new getSchema(this, (byte) 0);
        }
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
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
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(33);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1000);
    }

    private getSchema(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Boolean boolValueOf = remoteActionCompatParcelizer.onCommand;
        Integer numValueOf = remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
        Integer numValueOf2 = remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                numValueOf = Integer.valueOf(numValueOf2 != null ? RemoteActionCompatParcelizer(numValueOf2.intValue()) : 0);
            }
        } else if (numValueOf != null) {
            boolValueOf = Boolean.valueOf(numValueOf.intValue() != -1);
            if (boolValueOf.booleanValue() && numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(AudioAttributesCompatParcelizer(numValueOf.intValue()));
            }
        }
        this.onPlayFromSearch = remoteActionCompatParcelizer.onPlayFromSearch;
        this.write = remoteActionCompatParcelizer.write;
        this.IconCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        this.RatingCompat = remoteActionCompatParcelizer.MediaDescriptionCompat;
        this.onPrepareFromMediaId = remoteActionCompatParcelizer.onPrepareFromSearch;
        this.MediaDescriptionCompat = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        this.MediaMetadataCompat = remoteActionCompatParcelizer.MediaMetadataCompat;
        this.onRemoveQueueItemAt = remoteActionCompatParcelizer.onSeekTo;
        this.onPlayFromMediaId = remoteActionCompatParcelizer.onCustomAction;
        this.read = remoteActionCompatParcelizer.read;
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer.IconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver;
        this.onPrepareFromUri = remoteActionCompatParcelizer.onRemoveQueueItemAt;
        this.onRemoveQueueItem = remoteActionCompatParcelizer.onRewind;
        this.onCommand = numValueOf;
        this.onCustomAction = boolValueOf;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.onSetRepeatMode = remoteActionCompatParcelizer.onPlay;
        this.onPause = remoteActionCompatParcelizer.onPlay;
        this.onFastForward = remoteActionCompatParcelizer.onPause;
        this.onPlay = remoteActionCompatParcelizer.onMediaButtonEvent;
        this.onPrepareFromSearch = remoteActionCompatParcelizer.onPrepareFromMediaId;
        this.onPlayFromUri = remoteActionCompatParcelizer.onFastForward;
        this.onMediaButtonEvent = remoteActionCompatParcelizer.onPlayFromMediaId;
        this.onSeekTo = remoteActionCompatParcelizer.onRemoveQueueItem;
        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = remoteActionCompatParcelizer.RatingCompat;
        this.onRewind = remoteActionCompatParcelizer.onPlayFromUri;
        this.handleMediaPlayPauseIfPendingOnHandler = remoteActionCompatParcelizer.onAddQueueItem;
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        this.onPrepare = remoteActionCompatParcelizer.onPrepare;
        this.onAddQueueItem = numValueOf2;
        this.MediaBrowserCompatMediaItem = remoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
    }

    public final RemoteActionCompatParcelizer IconCompatParcelizer() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getSchema getschema = (getSchema) obj;
            if (LaissezFaireSubTypeValidator.read(this.onPlayFromSearch, getschema.onPlayFromSearch) && LaissezFaireSubTypeValidator.read(this.write, getschema.write) && LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, getschema.IconCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, getschema.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.RatingCompat, getschema.RatingCompat) && LaissezFaireSubTypeValidator.read(this.onPrepareFromMediaId, getschema.onPrepareFromMediaId) && LaissezFaireSubTypeValidator.read(this.MediaDescriptionCompat, getschema.MediaDescriptionCompat) && LaissezFaireSubTypeValidator.read(this.MediaMetadataCompat, getschema.MediaMetadataCompat) && LaissezFaireSubTypeValidator.read(this.onRemoveQueueItemAt, getschema.onRemoveQueueItemAt) && LaissezFaireSubTypeValidator.read(this.onPlayFromMediaId, getschema.onPlayFromMediaId) && Arrays.equals(this.read, getschema.read) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi26Parcelizer, getschema.AudioAttributesImplApi26Parcelizer) && LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatCustomActionResultReceiver, getschema.MediaBrowserCompatCustomActionResultReceiver) && LaissezFaireSubTypeValidator.read(this.onPrepareFromUri, getschema.onPrepareFromUri) && LaissezFaireSubTypeValidator.read(this.onRemoveQueueItem, getschema.onRemoveQueueItem) && LaissezFaireSubTypeValidator.read(this.onCommand, getschema.onCommand) && LaissezFaireSubTypeValidator.read(this.onCustomAction, getschema.onCustomAction) && LaissezFaireSubTypeValidator.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, getschema.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && LaissezFaireSubTypeValidator.read(this.onPause, getschema.onPause) && LaissezFaireSubTypeValidator.read(this.onFastForward, getschema.onFastForward) && LaissezFaireSubTypeValidator.read(this.onPlay, getschema.onPlay) && LaissezFaireSubTypeValidator.read(this.onPrepareFromSearch, getschema.onPrepareFromSearch) && LaissezFaireSubTypeValidator.read(this.onPlayFromUri, getschema.onPlayFromUri) && LaissezFaireSubTypeValidator.read(this.onMediaButtonEvent, getschema.onMediaButtonEvent) && LaissezFaireSubTypeValidator.read(this.onSeekTo, getschema.onSeekTo) && LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatItemReceiver, getschema.MediaBrowserCompatItemReceiver) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi21Parcelizer, getschema.AudioAttributesImplApi21Parcelizer) && LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatSearchResultReceiver, getschema.MediaBrowserCompatSearchResultReceiver) && LaissezFaireSubTypeValidator.read(this.onRewind, getschema.onRewind) && LaissezFaireSubTypeValidator.read(this.handleMediaPlayPauseIfPendingOnHandler, getschema.handleMediaPlayPauseIfPendingOnHandler) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplBaseParcelizer, getschema.AudioAttributesImplBaseParcelizer) && LaissezFaireSubTypeValidator.read(this.onPrepare, getschema.onPrepare) && LaissezFaireSubTypeValidator.read(this.onAddQueueItem, getschema.onAddQueueItem)) {
                if ((this.MediaBrowserCompatMediaItem == null) == (getschema.MediaBrowserCompatMediaItem == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return parseSmta.read(this.onPlayFromSearch, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.RatingCompat, this.onPrepareFromMediaId, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.onRemoveQueueItemAt, this.onPlayFromMediaId, Integer.valueOf(Arrays.hashCode(this.read)), this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.onPrepareFromUri, this.onRemoveQueueItem, this.onCommand, this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPause, this.onFastForward, this.onPlay, this.onPrepareFromSearch, this.onPlayFromUri, this.onMediaButtonEvent, this.onSeekTo, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver, this.onRewind, this.handleMediaPlayPauseIfPendingOnHandler, this.AudioAttributesImplBaseParcelizer, this.onPrepare, this.onAddQueueItem, Boolean.valueOf(this.MediaBrowserCompatMediaItem == null));
    }
}
