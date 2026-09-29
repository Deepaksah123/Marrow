package kotlin;

import java.util.HashMap;
import kotlin.JdkDeserializers;
import kotlin._int;

/* JADX INFO: loaded from: classes2.dex */
public final class _deSerializeBCP47Locale extends JsonNodeDeserializerArrayDeserializer {
    private int onSkipToPrevious = 0;
    private boolean onSkipToQueueItem = true;
    private int MediaSessionCompatResultReceiverWrapper = 0;
    private boolean PlaybackStateCompat = false;

    @Override // kotlin.JdkDeserializers
    public final boolean read() {
        return true;
    }

    public final int IconCompatParcelizer() {
        return this.onSkipToPrevious;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.onSkipToPrevious = i;
    }

    public final void write(boolean z) {
        this.onSkipToQueueItem = z;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.onSkipToQueueItem;
    }

    @Override // kotlin.JdkDeserializers
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.PlaybackStateCompat;
    }

    @Override // kotlin.JdkDeserializers
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.PlaybackStateCompat;
    }

    @Override // kotlin.JsonNodeDeserializerArrayDeserializer, kotlin.JdkDeserializers
    public final void AudioAttributesCompatParcelizer(JdkDeserializers jdkDeserializers, HashMap<JdkDeserializers, JdkDeserializers> map) {
        super.AudioAttributesCompatParcelizer(jdkDeserializers, map);
        _deSerializeBCP47Locale _deserializebcp47locale = (_deSerializeBCP47Locale) jdkDeserializers;
        this.onSkipToPrevious = _deserializebcp47locale.onSkipToPrevious;
        this.onSkipToQueueItem = _deserializebcp47locale.onSkipToQueueItem;
        this.MediaSessionCompatResultReceiverWrapper = _deserializebcp47locale.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // kotlin.JdkDeserializers
    public final String toString() {
        StringBuilder sb = new StringBuilder("[Barrier] ");
        sb.append(MediaBrowserCompatSearchResultReceiver());
        sb.append(" {");
        String string = sb.toString();
        for (int i = 0; i < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i++) {
            JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i];
            if (i > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(", ");
                string = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(jdkDeserializers.MediaBrowserCompatSearchResultReceiver());
            string = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append("}");
        return sb4.toString();
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        for (int i = 0; i < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i++) {
            JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i];
            if (this.onSkipToQueueItem || jdkDeserializers.read()) {
                int i2 = this.onSkipToPrevious;
                if (i2 == 0 || i2 == 1) {
                    jdkDeserializers.AudioAttributesCompatParcelizer(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    jdkDeserializers.AudioAttributesCompatParcelizer(1, true);
                }
            }
        }
    }

    @Override // kotlin.JdkDeserializers
    public final void IconCompatParcelizer(_getToStringLookup _gettostringlookup, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        this.RatingCompat[0] = this.MediaMetadataCompat;
        this.RatingCompat[2] = this.onSeekTo;
        this.RatingCompat[1] = this.onPrepareFromMediaId;
        this.RatingCompat[3] = this.AudioAttributesImplApi26Parcelizer;
        for (int i4 = 0; i4 < this.RatingCompat.length; i4++) {
            this.RatingCompat[i4].RemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(this.RatingCompat[i4]);
        }
        int i5 = this.onSkipToPrevious;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        _int _intVar = this.RatingCompat[this.onSkipToPrevious];
        if (!this.PlaybackStateCompat) {
            write();
        }
        if (this.PlaybackStateCompat) {
            this.PlaybackStateCompat = false;
            int i6 = this.onSkipToPrevious;
            if (i6 == 0 || i6 == 1) {
                _gettostringlookup.read(this.MediaMetadataCompat.RemoteActionCompatParcelizer, this.onSetRepeatMode);
                _gettostringlookup.read(this.onPrepareFromMediaId.RemoteActionCompatParcelizer, this.onSetRepeatMode);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    _gettostringlookup.read(this.onSeekTo.RemoteActionCompatParcelizer, this.onSetCaptioningEnabled);
                    _gettostringlookup.read(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer, this.onSetCaptioningEnabled);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i7++) {
            JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i7];
            if ((this.onSkipToQueueItem || jdkDeserializers.read()) && ((((i2 = this.onSkipToPrevious) == 0 || i2 == 1) && jdkDeserializers.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.MediaMetadataCompat.read != null && jdkDeserializers.onPrepareFromMediaId.read != null) || (((i3 = this.onSkipToPrevious) == 2 || i3 == 3) && jdkDeserializers.onSeekTo() == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && jdkDeserializers.onSeekTo.read != null && jdkDeserializers.AudioAttributesImplApi26Parcelizer.read != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.MediaMetadataCompat.AudioAttributesImplBaseParcelizer() || this.onPrepareFromMediaId.AudioAttributesImplBaseParcelizer();
        boolean z4 = this.onSeekTo.AudioAttributesImplBaseParcelizer() || this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer();
        int i8 = (z2 || !(((i = this.onSkipToPrevious) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i9++) {
            JdkDeserializers jdkDeserializers2 = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i9];
            if (this.onSkipToQueueItem || jdkDeserializers2.read()) {
                constructSet constructsetRemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(jdkDeserializers2.RatingCompat[this.onSkipToPrevious]);
                jdkDeserializers2.RatingCompat[this.onSkipToPrevious].RemoteActionCompatParcelizer = constructsetRemoteActionCompatParcelizer;
                int i10 = (jdkDeserializers2.RatingCompat[this.onSkipToPrevious].read == null || jdkDeserializers2.RatingCompat[this.onSkipToPrevious].read.IconCompatParcelizer != this) ? 0 : jdkDeserializers2.RatingCompat[this.onSkipToPrevious].AudioAttributesCompatParcelizer;
                int i11 = this.onSkipToPrevious;
                if (i11 == 0 || i11 == 2) {
                    _gettostringlookup.RemoteActionCompatParcelizer(_intVar.RemoteActionCompatParcelizer, constructsetRemoteActionCompatParcelizer, this.MediaSessionCompatResultReceiverWrapper - i10);
                } else {
                    _gettostringlookup.read(_intVar.RemoteActionCompatParcelizer, constructsetRemoteActionCompatParcelizer, this.MediaSessionCompatResultReceiverWrapper + i10);
                }
                _gettostringlookup.read(_intVar.RemoteActionCompatParcelizer, constructsetRemoteActionCompatParcelizer, this.MediaSessionCompatResultReceiverWrapper + i10, i8);
            }
        }
        int i12 = this.onSkipToPrevious;
        if (i12 == 0) {
            _gettostringlookup.read(this.onPrepareFromMediaId.RemoteActionCompatParcelizer, this.MediaMetadataCompat.RemoteActionCompatParcelizer, 0, 8);
            _gettostringlookup.read(this.MediaMetadataCompat.RemoteActionCompatParcelizer, this.onPlayFromSearch.onPrepareFromMediaId.RemoteActionCompatParcelizer, 0, 4);
            _gettostringlookup.read(this.MediaMetadataCompat.RemoteActionCompatParcelizer, this.onPlayFromSearch.MediaMetadataCompat.RemoteActionCompatParcelizer, 0, 0);
            return;
        }
        if (i12 == 1) {
            _gettostringlookup.read(this.MediaMetadataCompat.RemoteActionCompatParcelizer, this.onPrepareFromMediaId.RemoteActionCompatParcelizer, 0, 8);
            _gettostringlookup.read(this.MediaMetadataCompat.RemoteActionCompatParcelizer, this.onPlayFromSearch.MediaMetadataCompat.RemoteActionCompatParcelizer, 0, 4);
            _gettostringlookup.read(this.MediaMetadataCompat.RemoteActionCompatParcelizer, this.onPlayFromSearch.onPrepareFromMediaId.RemoteActionCompatParcelizer, 0, 0);
        } else if (i12 == 2) {
            _gettostringlookup.read(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer, this.onSeekTo.RemoteActionCompatParcelizer, 0, 8);
            _gettostringlookup.read(this.onSeekTo.RemoteActionCompatParcelizer, this.onPlayFromSearch.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer, 0, 4);
            _gettostringlookup.read(this.onSeekTo.RemoteActionCompatParcelizer, this.onPlayFromSearch.onSeekTo.RemoteActionCompatParcelizer, 0, 0);
        } else if (i12 == 3) {
            _gettostringlookup.read(this.onSeekTo.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer, 0, 8);
            _gettostringlookup.read(this.onSeekTo.RemoteActionCompatParcelizer, this.onPlayFromSearch.onSeekTo.RemoteActionCompatParcelizer, 0, 4);
            _gettostringlookup.read(this.onSeekTo.RemoteActionCompatParcelizer, this.onPlayFromSearch.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer, 0, 0);
        }
    }

    public final void read(int i) {
        this.MediaSessionCompatResultReceiverWrapper = i;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        int i = this.onSkipToPrevious;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean write() {
        int i;
        int i2;
        boolean z = true;
        for (int i3 = 0; i3 < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i3++) {
            JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i3];
            if ((this.onSkipToQueueItem || jdkDeserializers.read()) && ((((i = this.onSkipToPrevious) == 0 || i == 1) && !jdkDeserializers.AudioAttributesImplApi21Parcelizer()) || (((i2 = this.onSkipToPrevious) == 2 || i2 == 3) && !jdkDeserializers.MediaBrowserCompatCustomActionResultReceiver()))) {
                z = false;
            }
        }
        if (!z || ((JsonNodeDeserializerArrayDeserializer) this).onStop <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i4 = 0; i4 < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i4++) {
            JdkDeserializers jdkDeserializers2 = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i4];
            if (this.onSkipToQueueItem || jdkDeserializers2.read()) {
                if (!z2) {
                    int i5 = this.onSkipToPrevious;
                    if (i5 == 0) {
                        iMax = jdkDeserializers2.write(_int.read.LEFT).read();
                    } else if (i5 == 1) {
                        iMax = jdkDeserializers2.write(_int.read.RIGHT).read();
                    } else if (i5 == 2) {
                        iMax = jdkDeserializers2.write(_int.read.TOP).read();
                    } else if (i5 == 3) {
                        iMax = jdkDeserializers2.write(_int.read.BOTTOM).read();
                    }
                    z2 = true;
                }
                int i6 = this.onSkipToPrevious;
                if (i6 == 0) {
                    iMax = Math.min(iMax, jdkDeserializers2.write(_int.read.LEFT).read());
                } else if (i6 == 1) {
                    iMax = Math.max(iMax, jdkDeserializers2.write(_int.read.RIGHT).read());
                } else if (i6 == 2) {
                    iMax = Math.min(iMax, jdkDeserializers2.write(_int.read.TOP).read());
                } else if (i6 == 3) {
                    iMax = Math.max(iMax, jdkDeserializers2.write(_int.read.BOTTOM).read());
                }
            }
        }
        int i7 = iMax + this.MediaSessionCompatResultReceiverWrapper;
        int i8 = this.onSkipToPrevious;
        if (i8 == 0 || i8 == 1) {
            write(i7, i7);
        } else {
            IconCompatParcelizer(i7, i7);
        }
        this.PlaybackStateCompat = true;
        return true;
    }
}
