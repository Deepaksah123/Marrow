package kotlin;

import kotlin.JdkDeserializers;
import kotlin._int;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NumberDeserializersBigDecimalDeserializer implements MapDeserializerMapReferring {
    NumberDeserializersBigIntegerDeserializer AudioAttributesImplApi21Parcelizer;
    public int AudioAttributesImplBaseParcelizer;
    protected JdkDeserializers.IconCompatParcelizer IconCompatParcelizer;
    JdkDeserializers MediaBrowserCompatItemReceiver;
    _squashDups AudioAttributesCompatParcelizer = new _squashDups(this);
    public int MediaMetadataCompat = 0;
    boolean AudioAttributesImplApi26Parcelizer = false;
    public setIncludableProperties MediaBrowserCompatMediaItem = new setIncludableProperties(this);
    public setIncludableProperties write = new setIncludableProperties(this);
    protected AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer.NONE;

    enum AudioAttributesCompatParcelizer {
        NONE,
        START,
        END,
        CENTER
    }

    abstract void AudioAttributesCompatParcelizer();

    @Override // kotlin.MapDeserializerMapReferring
    public void MediaBrowserCompatCustomActionResultReceiver() {
    }

    abstract boolean MediaBrowserCompatItemReceiver();

    abstract void RemoteActionCompatParcelizer();

    abstract void read();

    abstract void write();

    public NumberDeserializersBigDecimalDeserializer(JdkDeserializers jdkDeserializers) {
        this.MediaBrowserCompatItemReceiver = jdkDeserializers;
    }

    protected static setIncludableProperties AudioAttributesCompatParcelizer(_int _intVar) {
        if (_intVar.read == null) {
            return null;
        }
        JdkDeserializers jdkDeserializers = _intVar.read.IconCompatParcelizer;
        int i = AnonymousClass4.IconCompatParcelizer[_intVar.read.write.ordinal()];
        if (i == 1) {
            return jdkDeserializers.MediaDescriptionCompat.MediaBrowserCompatMediaItem;
        }
        if (i == 2) {
            return jdkDeserializers.MediaDescriptionCompat.write;
        }
        if (i == 3) {
            return jdkDeserializers.onPrepareFromUri.MediaBrowserCompatMediaItem;
        }
        if (i == 4) {
            return jdkDeserializers.onPrepareFromUri.RemoteActionCompatParcelizer;
        }
        if (i != 5) {
            return null;
        }
        return jdkDeserializers.onPrepareFromUri.write;
    }

    /* JADX INFO: renamed from: o.NumberDeserializersBigDecimalDeserializer$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[_int.read.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[_int.read.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[_int.read.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[_int.read.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[_int.read.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[_int.read.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    protected final void IconCompatParcelizer(_int _intVar, _int _intVar2, int i) {
        float fOnRemoveQueueItem;
        setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_intVar);
        setIncludableProperties setincludablepropertiesAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(_intVar2);
        if (setincludablepropertiesAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && setincludablepropertiesAudioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer) {
            int iWrite = setincludablepropertiesAudioAttributesCompatParcelizer.RatingCompat + _intVar.write();
            int iWrite2 = setincludablepropertiesAudioAttributesCompatParcelizer2.RatingCompat - _intVar2.write();
            int i2 = iWrite2 - iWrite;
            if (!this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                write(i, i2);
            }
            if (this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                if (this.AudioAttributesCompatParcelizer.RatingCompat == i2) {
                    this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(iWrite);
                    this.write.RemoteActionCompatParcelizer(iWrite2);
                    return;
                }
                if (i == 0) {
                    fOnRemoveQueueItem = this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                } else {
                    fOnRemoveQueueItem = this.MediaBrowserCompatItemReceiver.onRemoveQueueItem();
                }
                if (setincludablepropertiesAudioAttributesCompatParcelizer == setincludablepropertiesAudioAttributesCompatParcelizer2) {
                    iWrite = setincludablepropertiesAudioAttributesCompatParcelizer.RatingCompat;
                    iWrite2 = setincludablepropertiesAudioAttributesCompatParcelizer2.RatingCompat;
                    fOnRemoveQueueItem = 0.5f;
                }
                this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer((int) (iWrite + 0.5f + (((iWrite2 - iWrite) - this.AudioAttributesCompatParcelizer.RatingCompat) * fOnRemoveQueueItem)));
                this.write.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem.RatingCompat + this.AudioAttributesCompatParcelizer.RatingCompat);
            }
        }
    }

    private void write(int i, int i2) {
        NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer;
        float f;
        int i3;
        int i4 = this.AudioAttributesImplBaseParcelizer;
        if (i4 == 0) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(read(i2, i));
            return;
        }
        if (i4 == 1) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(Math.min(read(this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem, i), i2));
            return;
        }
        if (i4 == 2) {
            JdkDeserializers jdkDeserializersOnPrepareFromMediaId = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId();
            if (jdkDeserializersOnPrepareFromMediaId != null) {
                if (i == 0) {
                    numberDeserializersBigDecimalDeserializer = jdkDeserializersOnPrepareFromMediaId.MediaDescriptionCompat;
                } else {
                    numberDeserializersBigDecimalDeserializer = jdkDeserializersOnPrepareFromMediaId.onPrepareFromUri;
                }
                if (numberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                    if (i == 0) {
                        f = this.MediaBrowserCompatItemReceiver.onFastForward;
                    } else {
                        f = this.MediaBrowserCompatItemReceiver.onPlay;
                    }
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(read((int) ((numberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.RatingCompat * f) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 3) {
            if (this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesImplBaseParcelizer == 3 && this.MediaBrowserCompatItemReceiver.onPrepareFromUri.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && this.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesImplBaseParcelizer == 3) {
                return;
            }
            if ((i == 0 ? this.MediaBrowserCompatItemReceiver.onPrepareFromUri : this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat).AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                float fHandleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler();
                if (i == 1) {
                    i3 = (int) ((r6.AudioAttributesCompatParcelizer.RatingCompat / fHandleMediaPlayPauseIfPendingOnHandler) + 0.5f);
                } else {
                    i3 = (int) ((fHandleMediaPlayPauseIfPendingOnHandler * r6.AudioAttributesCompatParcelizer.RatingCompat) + 0.5f);
                }
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i3);
            }
        }
    }

    protected final int read(int i, int i2) {
        if (i2 == 0) {
            int i3 = this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler;
            int iMax = Math.max(this.MediaBrowserCompatItemReceiver.onPlayFromMediaId, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = this.MediaBrowserCompatItemReceiver.onCustomAction;
            int iMax2 = Math.max(this.MediaBrowserCompatItemReceiver.onPause, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected static setIncludableProperties RemoteActionCompatParcelizer(_int _intVar, int i) {
        if (_intVar.read == null) {
            return null;
        }
        JdkDeserializers jdkDeserializers = _intVar.read.IconCompatParcelizer;
        NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = i == 0 ? jdkDeserializers.MediaDescriptionCompat : jdkDeserializers.onPrepareFromUri;
        int i2 = AnonymousClass4.IconCompatParcelizer[_intVar.read.write.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return numberDeserializersBigDecimalDeserializer.write;
        }
        return numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem;
    }

    protected static void read(setIncludableProperties setincludableproperties, setIncludableProperties setincludableproperties2, int i) {
        setincludableproperties.AudioAttributesImplApi21Parcelizer.add(setincludableproperties2);
        setincludableproperties.read = i;
        setincludableproperties2.AudioAttributesCompatParcelizer.add(setincludableproperties);
    }

    protected final void RemoteActionCompatParcelizer(setIncludableProperties setincludableproperties, setIncludableProperties setincludableproperties2, int i, _squashDups _squashdups) {
        setincludableproperties.AudioAttributesImplApi21Parcelizer.add(setincludableproperties2);
        setincludableproperties.AudioAttributesImplApi21Parcelizer.add(this.AudioAttributesCompatParcelizer);
        setincludableproperties.RemoteActionCompatParcelizer = i;
        setincludableproperties.IconCompatParcelizer = _squashdups;
        setincludableproperties2.AudioAttributesCompatParcelizer.add(setincludableproperties);
        _squashdups.AudioAttributesCompatParcelizer.add(setincludableproperties);
    }

    public long IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
            return this.AudioAttributesCompatParcelizer.RatingCompat;
        }
        return 0L;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }
}
