package kotlin;

import java.util.HashMap;
import kotlin.JdkDeserializers;
import kotlin._int;

/* JADX INFO: loaded from: classes2.dex */
public final class _deserializeUsingCreator extends JdkDeserializers {
    private boolean MediaSessionCompatResultReceiverWrapper;
    private float MediaSessionCompatQueueItem = -1.0f;
    private int ParcelableVolumeInfo = -1;
    private int PlaybackStateCompat = -1;
    private boolean setSessionImpl = true;
    private _int onSkipToQueueItem = this.onSeekTo;
    private int onSkipToPrevious = 0;
    private int onStop = 0;

    @Override // kotlin.JdkDeserializers
    public final boolean read() {
        return true;
    }

    public _deserializeUsingCreator() {
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.add(this.onSkipToQueueItem);
        int length = this.RatingCompat.length;
        for (int i = 0; i < length; i++) {
            this.RatingCompat[i] = this.onSkipToQueueItem;
        }
    }

    @Override // kotlin.JdkDeserializers
    public final void AudioAttributesCompatParcelizer(JdkDeserializers jdkDeserializers, HashMap<JdkDeserializers, JdkDeserializers> map) {
        super.AudioAttributesCompatParcelizer(jdkDeserializers, map);
        _deserializeUsingCreator _deserializeusingcreator = (_deserializeUsingCreator) jdkDeserializers;
        this.MediaSessionCompatQueueItem = _deserializeusingcreator.MediaSessionCompatQueueItem;
        this.ParcelableVolumeInfo = _deserializeusingcreator.ParcelableVolumeInfo;
        this.PlaybackStateCompat = _deserializeusingcreator.PlaybackStateCompat;
        this.setSessionImpl = _deserializeusingcreator.setSessionImpl;
        onPrepare(_deserializeusingcreator.onSkipToPrevious);
    }

    public final void onPrepare(int i) {
        if (this.onSkipToPrevious != i) {
            this.onSkipToPrevious = i;
            this.RemoteActionCompatParcelizer.clear();
            if (this.onSkipToPrevious == 1) {
                this.onSkipToQueueItem = this.MediaMetadataCompat;
            } else {
                this.onSkipToQueueItem = this.onSeekTo;
            }
            this.RemoteActionCompatParcelizer.add(this.onSkipToQueueItem);
            int length = this.RatingCompat.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.RatingCompat[i2] = this.onSkipToQueueItem;
            }
        }
    }

    public final _int AudioAttributesCompatParcelizer() {
        return this.onSkipToQueueItem;
    }

    public final int IconCompatParcelizer() {
        return this.onSkipToPrevious;
    }

    /* JADX INFO: renamed from: o._deserializeUsingCreator$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[_int.read.values().length];
            write = iArr;
            try {
                iArr[_int.read.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[_int.read.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[_int.read.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[_int.read.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[_int.read.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[_int.read.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[_int.read.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                write[_int.read.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                write[_int.read.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // kotlin.JdkDeserializers
    public final _int write(_int.read readVar) {
        int i = AnonymousClass5.write[readVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.onSkipToPrevious == 1) {
                return this.onSkipToQueueItem;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.onSkipToPrevious == 0) {
            return this.onSkipToQueueItem;
        }
        return null;
    }

    public final void IconCompatParcelizer(float f) {
        if (f > -1.0f) {
            this.MediaSessionCompatQueueItem = f;
            this.ParcelableVolumeInfo = -1;
            this.PlaybackStateCompat = -1;
        }
    }

    public final void read(int i) {
        if (i >= 0) {
            this.MediaSessionCompatQueueItem = -1.0f;
            this.ParcelableVolumeInfo = i;
            this.PlaybackStateCompat = -1;
        }
    }

    public final void onPause(int i) {
        if (i >= 0) {
            this.MediaSessionCompatQueueItem = -1.0f;
            this.ParcelableVolumeInfo = -1;
            this.PlaybackStateCompat = i;
        }
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    public final int write() {
        return this.ParcelableVolumeInfo;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.PlaybackStateCompat;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.onSkipToQueueItem.IconCompatParcelizer(i);
        this.MediaSessionCompatResultReceiverWrapper = true;
    }

    @Override // kotlin.JdkDeserializers
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // kotlin.JdkDeserializers
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // kotlin.JdkDeserializers
    public final void IconCompatParcelizer(_getToStringLookup _gettostringlookup, boolean z) {
        _long _longVar = (_long) onPrepareFromMediaId();
        if (_longVar != null) {
            _int _intVarWrite = _longVar.write(_int.read.LEFT);
            _int _intVarWrite2 = _longVar.write(_int.read.RIGHT);
            boolean z2 = true;
            boolean z3 = this.onPlayFromSearch != null && this.onPlayFromSearch.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
            if (this.onSkipToPrevious == 0) {
                _intVarWrite = _longVar.write(_int.read.TOP);
                _intVarWrite2 = _longVar.write(_int.read.BOTTOM);
                if (this.onPlayFromSearch == null || this.onPlayFromSearch.MediaBrowserCompatSearchResultReceiver[1] != JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                    z2 = false;
                }
            } else {
                z2 = z3;
            }
            if (this.MediaSessionCompatResultReceiverWrapper && this.onSkipToQueueItem.MediaDescriptionCompat()) {
                constructSet constructsetRemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(this.onSkipToQueueItem);
                _gettostringlookup.read(constructsetRemoteActionCompatParcelizer, this.onSkipToQueueItem.read());
                if (this.ParcelableVolumeInfo != -1) {
                    if (z2) {
                        _gettostringlookup.IconCompatParcelizer(_gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite2), constructsetRemoteActionCompatParcelizer, 0, 5);
                    }
                } else if (this.PlaybackStateCompat != -1 && z2) {
                    constructSet constructsetRemoteActionCompatParcelizer2 = _gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite2);
                    _gettostringlookup.IconCompatParcelizer(constructsetRemoteActionCompatParcelizer, _gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite), 0, 5);
                    _gettostringlookup.IconCompatParcelizer(constructsetRemoteActionCompatParcelizer2, constructsetRemoteActionCompatParcelizer, 0, 5);
                }
                this.MediaSessionCompatResultReceiverWrapper = false;
                return;
            }
            if (this.ParcelableVolumeInfo != -1) {
                constructSet constructsetRemoteActionCompatParcelizer3 = _gettostringlookup.RemoteActionCompatParcelizer(this.onSkipToQueueItem);
                _gettostringlookup.read(constructsetRemoteActionCompatParcelizer3, _gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite), this.ParcelableVolumeInfo, 8);
                if (z2) {
                    _gettostringlookup.IconCompatParcelizer(_gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite2), constructsetRemoteActionCompatParcelizer3, 0, 5);
                    return;
                }
                return;
            }
            if (this.PlaybackStateCompat == -1) {
                if (this.MediaSessionCompatQueueItem != -1.0f) {
                    _gettostringlookup.RemoteActionCompatParcelizer(_getToStringLookup.write(_gettostringlookup, _gettostringlookup.RemoteActionCompatParcelizer(this.onSkipToQueueItem), _gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite2), this.MediaSessionCompatQueueItem));
                    return;
                }
                return;
            }
            constructSet constructsetRemoteActionCompatParcelizer4 = _gettostringlookup.RemoteActionCompatParcelizer(this.onSkipToQueueItem);
            constructSet constructsetRemoteActionCompatParcelizer5 = _gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite2);
            _gettostringlookup.read(constructsetRemoteActionCompatParcelizer4, constructsetRemoteActionCompatParcelizer5, -this.PlaybackStateCompat, 8);
            if (z2) {
                _gettostringlookup.IconCompatParcelizer(constructsetRemoteActionCompatParcelizer4, _gettostringlookup.RemoteActionCompatParcelizer(_intVarWrite), 0, 5);
                _gettostringlookup.IconCompatParcelizer(constructsetRemoteActionCompatParcelizer5, constructsetRemoteActionCompatParcelizer4, 0, 5);
            }
        }
    }

    @Override // kotlin.JdkDeserializers
    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (onPrepareFromMediaId() == null) {
            return;
        }
        int iAudioAttributesCompatParcelizer = _getToStringLookup.AudioAttributesCompatParcelizer(this.onSkipToQueueItem);
        if (this.onSkipToPrevious == 1) {
            onPlayFromMediaId(iAudioAttributesCompatParcelizer);
            onMediaButtonEvent(0);
            MediaMetadataCompat(onPrepareFromMediaId().onAddQueueItem());
            onFastForward(0);
            return;
        }
        onPlayFromMediaId(0);
        onMediaButtonEvent(iAudioAttributesCompatParcelizer);
        onFastForward(onPrepareFromMediaId().onSetShuffleMode());
        MediaMetadataCompat(0);
    }
}
