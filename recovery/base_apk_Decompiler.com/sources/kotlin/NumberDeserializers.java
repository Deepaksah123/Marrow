package kotlin;

import kotlin.JdkDeserializers;
import kotlin.NumberDeserializersBigDecimalDeserializer;
import kotlin._int;
import kotlin.setIncludableProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberDeserializers extends NumberDeserializersBigDecimalDeserializer {
    private static int[] read = new int[2];

    public NumberDeserializers(JdkDeserializers jdkDeserializers) {
        super(jdkDeserializers);
        this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.LEFT;
        this.write.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.RIGHT;
        this.MediaMetadataCompat = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalRun ");
        sb.append(this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver());
        return sb.toString();
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        this.write.AudioAttributesCompatParcelizer();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = false;
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = false;
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer = false;
        this.write.AudioAttributesCompatParcelizer();
        this.write.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final boolean MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0;
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void read() {
        JdkDeserializers jdkDeserializersOnPrepareFromMediaId;
        JdkDeserializers jdkDeserializersOnPrepareFromMediaId2;
        if (this.MediaBrowserCompatItemReceiver.onSetPlaybackSpeed) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.onSetShuffleMode());
        }
        if (!this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
            this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver.onPlayFromMediaId();
            if (this.IconCompatParcelizer != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT && (jdkDeserializersOnPrepareFromMediaId2 = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId()) != null && (jdkDeserializersOnPrepareFromMediaId2.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.FIXED || jdkDeserializersOnPrepareFromMediaId2.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT)) {
                    int iOnSetShuffleMode = jdkDeserializersOnPrepareFromMediaId2.onSetShuffleMode();
                    int iWrite = this.MediaBrowserCompatItemReceiver.MediaMetadataCompat.write();
                    int iWrite2 = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId.write();
                    read(this.MediaBrowserCompatMediaItem, jdkDeserializersOnPrepareFromMediaId2.MediaDescriptionCompat.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.MediaMetadataCompat.write());
                    read(this.write, jdkDeserializersOnPrepareFromMediaId2.MediaDescriptionCompat.write, -this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId.write());
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((iOnSetShuffleMode - iWrite) - iWrite2);
                    return;
                }
                if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.FIXED) {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.onSetShuffleMode());
                }
            }
        } else if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT && (jdkDeserializersOnPrepareFromMediaId = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId()) != null && (jdkDeserializersOnPrepareFromMediaId.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.FIXED || jdkDeserializersOnPrepareFromMediaId.onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT)) {
            read(this.MediaBrowserCompatMediaItem, jdkDeserializersOnPrepareFromMediaId.MediaDescriptionCompat.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.MediaMetadataCompat.write());
            read(this.write, jdkDeserializersOnPrepareFromMediaId.MediaDescriptionCompat.write, -this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId.write());
            return;
        }
        if (this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatItemReceiver.onSetPlaybackSpeed) {
            if (this.MediaBrowserCompatItemReceiver.RatingCompat[0].read != null && this.MediaBrowserCompatItemReceiver.RatingCompat[1].read != null) {
                if (this.MediaBrowserCompatItemReceiver.setSessionImpl()) {
                    this.MediaBrowserCompatMediaItem.read = this.MediaBrowserCompatItemReceiver.RatingCompat[0].write();
                    this.write.read = -this.MediaBrowserCompatItemReceiver.RatingCompat[1].write();
                    return;
                }
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[0]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer != null) {
                    read(this.MediaBrowserCompatMediaItem, setincludablepropertiesAudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.RatingCompat[0].write());
                }
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[1]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer2 != null) {
                    read(this.write, setincludablepropertiesAudioAttributesCompatParcelizer2, -this.MediaBrowserCompatItemReceiver.RatingCompat[1].write());
                }
                this.MediaBrowserCompatMediaItem.write = true;
                this.write.write = true;
                return;
            }
            if (this.MediaBrowserCompatItemReceiver.RatingCompat[0].read != null) {
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[0]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer3 != null) {
                    read(this.MediaBrowserCompatMediaItem, setincludablepropertiesAudioAttributesCompatParcelizer3, this.MediaBrowserCompatItemReceiver.RatingCompat[0].write());
                    read(this.write, this.MediaBrowserCompatMediaItem, this.AudioAttributesCompatParcelizer.RatingCompat);
                    return;
                }
                return;
            }
            if (this.MediaBrowserCompatItemReceiver.RatingCompat[1].read != null) {
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[1]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer4 != null) {
                    read(this.write, setincludablepropertiesAudioAttributesCompatParcelizer4, -this.MediaBrowserCompatItemReceiver.RatingCompat[1].write());
                    read(this.MediaBrowserCompatMediaItem, this.write, -this.AudioAttributesCompatParcelizer.RatingCompat);
                    return;
                }
                return;
            }
            if ((this.MediaBrowserCompatItemReceiver instanceof JsonNodeDeserializer) || this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId() == null || this.MediaBrowserCompatItemReceiver.write(_int.read.CENTER).read != null) {
                return;
            }
            read(this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId().MediaDescriptionCompat.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onSetRating());
            read(this.write, this.MediaBrowserCompatMediaItem, this.AudioAttributesCompatParcelizer.RatingCompat);
            return;
        }
        if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
            int i = this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (i == 2) {
                JdkDeserializers jdkDeserializersOnPrepareFromMediaId3 = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId();
                if (jdkDeserializersOnPrepareFromMediaId3 != null) {
                    _squashDups _squashdups = jdkDeserializersOnPrepareFromMediaId3.onPrepareFromUri.AudioAttributesCompatParcelizer;
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(_squashdups);
                    _squashdups.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.AudioAttributesCompatParcelizer.write = true;
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.write);
                }
            } else if (i == 3) {
                if (this.MediaBrowserCompatItemReceiver.onAddQueueItem == 3) {
                    this.MediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver = this;
                    this.write.MediaBrowserCompatSearchResultReceiver = this;
                    this.MediaBrowserCompatItemReceiver.onPrepareFromUri.MediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver = this;
                    this.MediaBrowserCompatItemReceiver.onPrepareFromUri.write.MediaBrowserCompatSearchResultReceiver = this;
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver = this;
                    if (this.MediaBrowserCompatItemReceiver.onSkipToNext()) {
                        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer);
                        this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                        this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver = this;
                        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.MediaBrowserCompatMediaItem);
                        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.write);
                        this.MediaBrowserCompatItemReceiver.onPrepareFromUri.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                        this.MediaBrowserCompatItemReceiver.onPrepareFromUri.write.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    } else if (this.MediaBrowserCompatItemReceiver.setSessionImpl()) {
                        this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(this.AudioAttributesCompatParcelizer);
                        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer);
                    } else {
                        this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(this.AudioAttributesCompatParcelizer);
                    }
                } else {
                    _squashDups _squashdups2 = this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer;
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(_squashdups2);
                    _squashdups2.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.MediaBrowserCompatItemReceiver.onPrepareFromUri.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.MediaBrowserCompatItemReceiver.onPrepareFromUri.write.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.AudioAttributesCompatParcelizer.write = true;
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.write);
                    this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.write.AudioAttributesImplApi21Parcelizer.add(this.AudioAttributesCompatParcelizer);
                }
            }
        }
        if (this.MediaBrowserCompatItemReceiver.RatingCompat[0].read != null && this.MediaBrowserCompatItemReceiver.RatingCompat[1].read != null) {
            if (this.MediaBrowserCompatItemReceiver.setSessionImpl()) {
                this.MediaBrowserCompatMediaItem.read = this.MediaBrowserCompatItemReceiver.RatingCompat[0].write();
                this.write.read = -this.MediaBrowserCompatItemReceiver.RatingCompat[1].write();
                return;
            }
            setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer5 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[0]);
            setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer6 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[1]);
            if (setincludablepropertiesAudioAttributesCompatParcelizer5 != null) {
                setincludablepropertiesAudioAttributesCompatParcelizer5.write(this);
            }
            if (setincludablepropertiesAudioAttributesCompatParcelizer6 != null) {
                setincludablepropertiesAudioAttributesCompatParcelizer6.write(this);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.CENTER;
            return;
        }
        if (this.MediaBrowserCompatItemReceiver.RatingCompat[0].read != null) {
            setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer7 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[0]);
            if (setincludablepropertiesAudioAttributesCompatParcelizer7 != null) {
                read(this.MediaBrowserCompatMediaItem, setincludablepropertiesAudioAttributesCompatParcelizer7, this.MediaBrowserCompatItemReceiver.RatingCompat[0].write());
                RemoteActionCompatParcelizer(this.write, this.MediaBrowserCompatMediaItem, 1, this.AudioAttributesCompatParcelizer);
                return;
            }
            return;
        }
        if (this.MediaBrowserCompatItemReceiver.RatingCompat[1].read != null) {
            setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer8 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[1]);
            if (setincludablepropertiesAudioAttributesCompatParcelizer8 != null) {
                read(this.write, setincludablepropertiesAudioAttributesCompatParcelizer8, -this.MediaBrowserCompatItemReceiver.RatingCompat[1].write());
                RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, this.write, -1, this.AudioAttributesCompatParcelizer);
                return;
            }
            return;
        }
        if ((this.MediaBrowserCompatItemReceiver instanceof JsonNodeDeserializer) || this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId() == null) {
            return;
        }
        read(this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId().MediaDescriptionCompat.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onSetRating());
        RemoteActionCompatParcelizer(this.write, this.MediaBrowserCompatMediaItem, 1, this.AudioAttributesCompatParcelizer);
    }

    private static void RemoteActionCompatParcelizer(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX INFO: renamed from: o.NumberDeserializers$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.values().length];
            read = iArr;
            try {
                iArr[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02f7  */
    @Override // kotlin.NumberDeserializersBigDecimalDeserializer, kotlin.MapDeserializerMapReferring
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberDeserializers.MediaBrowserCompatCustomActionResultReceiver():void");
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    public final void write() {
        if (this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer) {
            this.MediaBrowserCompatItemReceiver.onPlayFromMediaId(this.MediaBrowserCompatMediaItem.RatingCompat);
        }
    }
}
