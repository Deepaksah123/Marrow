package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.JdkDeserializers;
import kotlin.NumberDeserializersBigDecimalDeserializer;
import kotlin._int;
import kotlin.setIncludableProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberDeserializersBooleanDeserializer extends NumberDeserializersBigDecimalDeserializer {
    public setIncludableProperties RemoteActionCompatParcelizer;
    _squashDups read;

    public NumberDeserializersBooleanDeserializer(JdkDeserializers jdkDeserializers) {
        super(jdkDeserializers);
        this.RemoteActionCompatParcelizer = new setIncludableProperties(this);
        this.read = null;
        this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.TOP;
        this.write.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.BOTTOM;
        this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.BASELINE;
        this.MediaMetadataCompat = 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalRun ");
        sb.append(this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver());
        return sb.toString();
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        this.write.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
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
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final boolean MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || this.MediaBrowserCompatItemReceiver.onAddQueueItem == 0;
    }

    /* JADX INFO: renamed from: o.NumberDeserializersBooleanDeserializer$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer, kotlin.MapDeserializerMapReferring
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        float f;
        float fHandleMediaPlayPauseIfPendingOnHandler;
        float fHandleMediaPlayPauseIfPendingOnHandler2;
        int i;
        int i2 = AnonymousClass3.AudioAttributesCompatParcelizer[this.MediaBrowserCompatCustomActionResultReceiver.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 == 3) {
            IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.onSeekTo, this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer, 1);
            return;
        }
        if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver && !this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
            int i3 = this.MediaBrowserCompatItemReceiver.onAddQueueItem;
            if (i3 != 2) {
                if (i3 == 3 && this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                    int iOnCommand = this.MediaBrowserCompatItemReceiver.onCommand();
                    if (iOnCommand == -1) {
                        f = this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RatingCompat;
                        fHandleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler();
                    } else if (iOnCommand == 0) {
                        fHandleMediaPlayPauseIfPendingOnHandler2 = this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RatingCompat * this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler();
                        i = (int) (fHandleMediaPlayPauseIfPendingOnHandler2 + 0.5f);
                        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
                    } else if (iOnCommand == 1) {
                        f = this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RatingCompat;
                        fHandleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler();
                    } else {
                        i = 0;
                        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
                    }
                    fHandleMediaPlayPauseIfPendingOnHandler2 = f / fHandleMediaPlayPauseIfPendingOnHandler;
                    i = (int) (fHandleMediaPlayPauseIfPendingOnHandler2 + 0.5f);
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
                }
            } else {
                JdkDeserializers jdkDeserializersOnPrepareFromMediaId = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId();
                if (jdkDeserializersOnPrepareFromMediaId != null && jdkDeserializersOnPrepareFromMediaId.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((int) ((jdkDeserializersOnPrepareFromMediaId.onPrepareFromUri.AudioAttributesCompatParcelizer.RatingCompat * this.MediaBrowserCompatItemReceiver.onPlay) + 0.5f));
                }
            }
        }
        if (this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver && this.write.MediaBrowserCompatItemReceiver) {
            if (this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer && this.write.AudioAttributesImplBaseParcelizer && this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                return;
            }
            if (!this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && !this.MediaBrowserCompatItemReceiver.onSkipToNext()) {
                setIncludableProperties setincludableproperties = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.get(0);
                setIncludableProperties setincludableproperties2 = this.write.AudioAttributesImplApi21Parcelizer.get(0);
                int i4 = setincludableproperties.RatingCompat + this.MediaBrowserCompatMediaItem.read;
                int i5 = setincludableproperties2.RatingCompat + this.write.read;
                this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i4);
                this.write.RemoteActionCompatParcelizer(i5);
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i5 - i4);
                return;
            }
            if (!this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && this.AudioAttributesImplBaseParcelizer == 1 && this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.size() > 0 && this.write.AudioAttributesImplApi21Parcelizer.size() > 0) {
                int i6 = (this.write.AudioAttributesImplApi21Parcelizer.get(0).RatingCompat + this.write.read) - (this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.get(0).RatingCompat + this.MediaBrowserCompatMediaItem.read);
                if (i6 < this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem) {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i6);
                } else {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem);
                }
            }
            if (!this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer || this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.size() <= 0 || this.write.AudioAttributesImplApi21Parcelizer.size() <= 0) {
                return;
            }
            setIncludableProperties setincludableproperties3 = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.get(0);
            setIncludableProperties setincludableproperties4 = this.write.AudioAttributesImplApi21Parcelizer.get(0);
            int i7 = setincludableproperties3.RatingCompat + this.MediaBrowserCompatMediaItem.read;
            int i8 = setincludableproperties4.RatingCompat + this.write.read;
            float fOnRemoveQueueItem = this.MediaBrowserCompatItemReceiver.onRemoveQueueItem();
            if (setincludableproperties3 == setincludableproperties4) {
                i7 = setincludableproperties3.RatingCompat;
                i8 = setincludableproperties4.RatingCompat;
                fOnRemoveQueueItem = 0.5f;
            }
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer((int) (i7 + 0.5f + (((i8 - i7) - this.AudioAttributesCompatParcelizer.RatingCompat) * fOnRemoveQueueItem)));
            this.write.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem.RatingCompat + this.AudioAttributesCompatParcelizer.RatingCompat);
        }
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void read() {
        JdkDeserializers jdkDeserializersOnPrepareFromMediaId;
        JdkDeserializers jdkDeserializersOnPrepareFromMediaId2;
        if (this.MediaBrowserCompatItemReceiver.onSetPlaybackSpeed) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.onAddQueueItem());
        }
        if (!this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
            this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver.onSeekTo();
            if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                this.read = new _readAndUpdate(this);
            }
            if (this.IconCompatParcelizer != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT && (jdkDeserializersOnPrepareFromMediaId2 = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId()) != null && jdkDeserializersOnPrepareFromMediaId2.onSeekTo() == JdkDeserializers.IconCompatParcelizer.FIXED) {
                    int iOnAddQueueItem = jdkDeserializersOnPrepareFromMediaId2.onAddQueueItem();
                    int iWrite = this.MediaBrowserCompatItemReceiver.onSeekTo.write();
                    int iWrite2 = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer.write();
                    read(this.MediaBrowserCompatMediaItem, jdkDeserializersOnPrepareFromMediaId2.onPrepareFromUri.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onSeekTo.write());
                    read(this.write, jdkDeserializersOnPrepareFromMediaId2.onPrepareFromUri.write, -this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer.write());
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((iOnAddQueueItem - iWrite) - iWrite2);
                    return;
                }
                if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.FIXED) {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.onAddQueueItem());
                }
            }
        } else if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT && (jdkDeserializersOnPrepareFromMediaId = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId()) != null && jdkDeserializersOnPrepareFromMediaId.onSeekTo() == JdkDeserializers.IconCompatParcelizer.FIXED) {
            read(this.MediaBrowserCompatMediaItem, jdkDeserializersOnPrepareFromMediaId.onPrepareFromUri.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onSeekTo.write());
            read(this.write, jdkDeserializersOnPrepareFromMediaId.onPrepareFromUri.write, -this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer.write());
            return;
        }
        if (this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatItemReceiver.onSetPlaybackSpeed) {
            if (this.MediaBrowserCompatItemReceiver.RatingCompat[2].read != null && this.MediaBrowserCompatItemReceiver.RatingCompat[3].read != null) {
                if (this.MediaBrowserCompatItemReceiver.onSkipToNext()) {
                    this.MediaBrowserCompatMediaItem.read = this.MediaBrowserCompatItemReceiver.RatingCompat[2].write();
                    this.write.read = -this.MediaBrowserCompatItemReceiver.RatingCompat[3].write();
                } else {
                    setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[2]);
                    if (setincludablepropertiesAudioAttributesCompatParcelizer != null) {
                        read(this.MediaBrowserCompatMediaItem, setincludablepropertiesAudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.RatingCompat[2].write());
                    }
                    setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[3]);
                    if (setincludablepropertiesAudioAttributesCompatParcelizer2 != null) {
                        read(this.write, setincludablepropertiesAudioAttributesCompatParcelizer2, -this.MediaBrowserCompatItemReceiver.RatingCompat[3].write());
                    }
                    this.MediaBrowserCompatMediaItem.write = true;
                    this.write.write = true;
                }
                if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                    read(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.MediaMetadataCompat());
                    return;
                }
                return;
            }
            if (this.MediaBrowserCompatItemReceiver.RatingCompat[2].read != null) {
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[2]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer3 != null) {
                    read(this.MediaBrowserCompatMediaItem, setincludablepropertiesAudioAttributesCompatParcelizer3, this.MediaBrowserCompatItemReceiver.RatingCompat[2].write());
                    read(this.write, this.MediaBrowserCompatMediaItem, this.AudioAttributesCompatParcelizer.RatingCompat);
                    if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                        read(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.MediaMetadataCompat());
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.MediaBrowserCompatItemReceiver.RatingCompat[3].read != null) {
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[3]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer4 != null) {
                    read(this.write, setincludablepropertiesAudioAttributesCompatParcelizer4, -this.MediaBrowserCompatItemReceiver.RatingCompat[3].write());
                    read(this.MediaBrowserCompatMediaItem, this.write, -this.AudioAttributesCompatParcelizer.RatingCompat);
                }
                if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                    read(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.MediaMetadataCompat());
                    return;
                }
                return;
            }
            if (this.MediaBrowserCompatItemReceiver.RatingCompat[4].read != null) {
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer5 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[4]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer5 != null) {
                    read(this.RemoteActionCompatParcelizer, setincludablepropertiesAudioAttributesCompatParcelizer5, 0);
                    read(this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, -this.MediaBrowserCompatItemReceiver.MediaMetadataCompat());
                    read(this.write, this.MediaBrowserCompatMediaItem, this.AudioAttributesCompatParcelizer.RatingCompat);
                    return;
                }
                return;
            }
            if ((this.MediaBrowserCompatItemReceiver instanceof JsonNodeDeserializer) || this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId() == null || this.MediaBrowserCompatItemReceiver.write(_int.read.CENTER).read != null) {
                return;
            }
            read(this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId().onPrepareFromUri.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onSetRepeatMode());
            read(this.write, this.MediaBrowserCompatMediaItem, this.AudioAttributesCompatParcelizer.RatingCompat);
            if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                read(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.MediaMetadataCompat());
                return;
            }
            return;
        }
        if (!this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
            int i = this.MediaBrowserCompatItemReceiver.onAddQueueItem;
            if (i != 2) {
                if (i == 3 && !this.MediaBrowserCompatItemReceiver.onSkipToNext() && this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 3) {
                    _squashDups _squashdups = this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer;
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(_squashdups);
                    _squashdups.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.AudioAttributesCompatParcelizer.write = true;
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.write);
                }
            } else {
                JdkDeserializers jdkDeserializersOnPrepareFromMediaId3 = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId();
                if (jdkDeserializersOnPrepareFromMediaId3 != null) {
                    _squashDups _squashdups2 = jdkDeserializersOnPrepareFromMediaId3.onPrepareFromUri.AudioAttributesCompatParcelizer;
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(_squashdups2);
                    _squashdups2.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.AudioAttributesCompatParcelizer.write = true;
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.write);
                }
            }
        } else {
            this.AudioAttributesCompatParcelizer.write(this);
        }
        if (this.MediaBrowserCompatItemReceiver.RatingCompat[2].read != null && this.MediaBrowserCompatItemReceiver.RatingCompat[3].read != null) {
            if (this.MediaBrowserCompatItemReceiver.onSkipToNext()) {
                this.MediaBrowserCompatMediaItem.read = this.MediaBrowserCompatItemReceiver.RatingCompat[2].write();
                this.write.read = -this.MediaBrowserCompatItemReceiver.RatingCompat[3].write();
            } else {
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer6 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[2]);
                setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer7 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[3]);
                if (setincludablepropertiesAudioAttributesCompatParcelizer6 != null) {
                    setincludablepropertiesAudioAttributesCompatParcelizer6.write(this);
                }
                if (setincludablepropertiesAudioAttributesCompatParcelizer7 != null) {
                    setincludablepropertiesAudioAttributesCompatParcelizer7.write(this);
                }
                this.MediaBrowserCompatCustomActionResultReceiver = NumberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.CENTER;
            }
            if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, 1, this.read);
            }
        } else if (this.MediaBrowserCompatItemReceiver.RatingCompat[2].read != null) {
            setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer8 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[2]);
            if (setincludablepropertiesAudioAttributesCompatParcelizer8 != null) {
                read(this.MediaBrowserCompatMediaItem, setincludablepropertiesAudioAttributesCompatParcelizer8, this.MediaBrowserCompatItemReceiver.RatingCompat[2].write());
                RemoteActionCompatParcelizer(this.write, this.MediaBrowserCompatMediaItem, 1, this.AudioAttributesCompatParcelizer);
                if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                    RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, 1, this.read);
                }
                if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler() > BitmapDescriptorFactory.HUE_RED && this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                    this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer);
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver = this;
                }
            }
        } else if (this.MediaBrowserCompatItemReceiver.RatingCompat[3].read != null) {
            setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer9 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[3]);
            if (setincludablepropertiesAudioAttributesCompatParcelizer9 != null) {
                read(this.write, setincludablepropertiesAudioAttributesCompatParcelizer9, -this.MediaBrowserCompatItemReceiver.RatingCompat[3].write());
                RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, this.write, -1, this.AudioAttributesCompatParcelizer);
                if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                    RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, 1, this.read);
                }
            }
        } else if (this.MediaBrowserCompatItemReceiver.RatingCompat[4].read != null) {
            setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer10 = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.RatingCompat[4]);
            if (setincludablepropertiesAudioAttributesCompatParcelizer10 != null) {
                read(this.RemoteActionCompatParcelizer, setincludablepropertiesAudioAttributesCompatParcelizer10, 0);
                RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, -1, this.read);
                RemoteActionCompatParcelizer(this.write, this.MediaBrowserCompatMediaItem, 1, this.AudioAttributesCompatParcelizer);
            }
        } else if (!(this.MediaBrowserCompatItemReceiver instanceof JsonNodeDeserializer) && this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId() != null) {
            read(this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId().onPrepareFromUri.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver.onSetRepeatMode());
            RemoteActionCompatParcelizer(this.write, this.MediaBrowserCompatMediaItem, 1, this.AudioAttributesCompatParcelizer);
            if (this.MediaBrowserCompatItemReceiver.onSetCaptioningEnabled()) {
                RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, 1, this.read);
            }
            if (this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler() > BitmapDescriptorFactory.HUE_RED && this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.add(this.AudioAttributesCompatParcelizer);
                this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer);
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver = this;
            }
        }
        if (this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.size() == 0) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = true;
        }
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    public final void write() {
        if (this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer) {
            this.MediaBrowserCompatItemReceiver.onMediaButtonEvent(this.MediaBrowserCompatMediaItem.RatingCompat);
        }
    }
}
