package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;
import kotlin.linkLast;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class contains implements checkNotEmpty {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private nonNullString MediaBrowserCompatSearchResultReceiver;
    private int MediaMetadataCompat;
    private boolean RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onPause;
    private String read;
    private int onAddQueueItem = 0;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi26Parcelizer = new AsPropertyTypeDeserializer(new byte[15], 2);
    private final AsExternalTypeSerializer MediaBrowserCompatItemReceiver = new AsExternalTypeSerializer();
    private final AsPropertyTypeDeserializer write = new AsPropertyTypeDeserializer();
    private linkLast.RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = new linkLast.RemoteActionCompatParcelizer();
    private int RatingCompat = C.RATE_UNSET_INT;
    private int onCustomAction = -1;
    private long MediaDescriptionCompat = -1;
    private boolean MediaBrowserCompatMediaItem = true;
    private boolean AudioAttributesImplApi21Parcelizer = true;
    private double onCommand = -9.223372036854776E18d;
    private double MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -9.223372036854776E18d;

    private static boolean read(int i) {
        return i == 1 || i == 17;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.onAddQueueItem = 0;
        this.handleMediaPlayPauseIfPendingOnHandler = 0;
        this.AudioAttributesImplApi26Parcelizer.write(2);
        this.MediaMetadataCompat = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.RatingCompat = C.RATE_UNSET_INT;
        this.onCustomAction = -1;
        this.onPause = 0;
        this.MediaDescriptionCompat = -1L;
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = true;
        this.MediaBrowserCompatMediaItem = true;
        this.onCommand = -9.223372036854776E18d;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -9.223372036854776E18d;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.read = writeVar.IconCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 1);
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.AudioAttributesCompatParcelizer = i;
        if (!this.MediaBrowserCompatMediaItem && (this.AudioAttributesImplBaseParcelizer != 0 || !this.AudioAttributesImplApi21Parcelizer)) {
            this.IconCompatParcelizer = true;
        }
        if (j != C.TIME_UNSET) {
            if (this.IconCompatParcelizer) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j;
            } else {
                this.onCommand = j;
            }
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i = this.onAddQueueItem;
            if (i != 0) {
                if (i == 1) {
                    AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, this.AudioAttributesImplApi26Parcelizer, false);
                    if (this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer() == 0) {
                        if (IconCompatParcelizer()) {
                            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
                            nonNullString nonnullstring = this.MediaBrowserCompatSearchResultReceiver;
                            AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = this.AudioAttributesImplApi26Parcelizer;
                            nonnullstring.RemoteActionCompatParcelizer(asPropertyTypeDeserializer2, asPropertyTypeDeserializer2.read());
                            this.AudioAttributesImplApi26Parcelizer.write(2);
                            this.write.write(this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
                            this.AudioAttributesImplApi21Parcelizer = true;
                            this.onAddQueueItem = 2;
                        } else if (this.AudioAttributesImplApi26Parcelizer.read() < 15) {
                            AsPropertyTypeDeserializer asPropertyTypeDeserializer3 = this.AudioAttributesImplApi26Parcelizer;
                            asPropertyTypeDeserializer3.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer3.read() + 1);
                            this.AudioAttributesImplApi21Parcelizer = false;
                        }
                    } else {
                        this.AudioAttributesImplApi21Parcelizer = false;
                    }
                } else if (i == 2) {
                    if (read(this.MediaBrowserCompatCustomActionResultReceiver.write)) {
                        AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, this.write, true);
                    }
                    RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
                    if (this.MediaMetadataCompat == this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                        if (this.MediaBrowserCompatCustomActionResultReceiver.write == 1) {
                            read(new AsExternalTypeSerializer(this.write.RemoteActionCompatParcelizer()));
                        } else if (this.MediaBrowserCompatCustomActionResultReceiver.write == 17) {
                            this.onPause = linkLast.AudioAttributesCompatParcelizer(new AsExternalTypeSerializer(this.write.RemoteActionCompatParcelizer()));
                        } else if (this.MediaBrowserCompatCustomActionResultReceiver.write == 2) {
                            AudioAttributesCompatParcelizer();
                        }
                        this.onAddQueueItem = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (IconCompatParcelizer(asPropertyTypeDeserializer)) {
                this.onAddQueueItem = 1;
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, AsPropertyTypeDeserializer asPropertyTypeDeserializer2, boolean z) {
        int iWrite = asPropertyTypeDeserializer.write();
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), asPropertyTypeDeserializer2.IconCompatParcelizer());
        asPropertyTypeDeserializer.write(asPropertyTypeDeserializer2.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer2.write(), iMin);
        asPropertyTypeDeserializer2.AudioAttributesImplBaseParcelizer(iMin);
        if (z) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        }
    }

    private boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int i = this.AudioAttributesCompatParcelizer;
        if ((i & 2) == 0) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(asPropertyTypeDeserializer.read());
            return false;
        }
        if ((i & 4) != 0) {
            return true;
        }
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i2 = this.handleMediaPlayPauseIfPendingOnHandler << 8;
            this.handleMediaPlayPauseIfPendingOnHandler = i2;
            int iOnPlayFromMediaId = i2 | asPropertyTypeDeserializer.onPlayFromMediaId();
            this.handleMediaPlayPauseIfPendingOnHandler = iOnPlayFromMediaId;
            if (linkLast.IconCompatParcelizer(iOnPlayFromMediaId)) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(asPropertyTypeDeserializer.write() - 3);
                this.handleMediaPlayPauseIfPendingOnHandler = 0;
                return true;
            }
        }
        return false;
    }

    private boolean IconCompatParcelizer() throws SchemaAware {
        int i = this.AudioAttributesImplApi26Parcelizer.read();
        this.MediaBrowserCompatItemReceiver.read(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), i);
        boolean z = linkLast.read(this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver);
        if (z) {
            this.MediaMetadataCompat = 0;
            this.AudioAttributesImplBaseParcelizer += this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer + i;
        }
        return z;
    }

    private void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer - this.MediaMetadataCompat);
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMin);
        this.MediaMetadataCompat += iMin;
    }

    private void read(AsExternalTypeSerializer asExternalTypeSerializer) throws SchemaAware {
        linkLast.read readVarWrite = linkLast.write(asExternalTypeSerializer);
        this.RatingCompat = readVarWrite.write;
        this.onCustomAction = readVarWrite.RemoteActionCompatParcelizer;
        if (this.MediaDescriptionCompat != this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            this.MediaDescriptionCompat = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            String string = "mhm1";
            if (readVarWrite.read != -1) {
                StringBuilder sb = new StringBuilder("mhm1");
                sb.append(String.format(".%02X", Integer.valueOf(readVarWrite.read)));
                string = sb.toString();
            }
            this.MediaBrowserCompatSearchResultReceiver.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.read).AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_MPEGH_MHM1).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.RatingCompat).RemoteActionCompatParcelizer(string).RemoteActionCompatParcelizer((readVarWrite.AudioAttributesCompatParcelizer == null || readVarWrite.AudioAttributesCompatParcelizer.length <= 0) ? null : initExtraTracks.AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer, readVarWrite.AudioAttributesCompatParcelizer)).IconCompatParcelizer());
        }
        this.RemoteActionCompatParcelizer = true;
    }

    private void AudioAttributesCompatParcelizer() {
        int i;
        if (this.RemoteActionCompatParcelizer) {
            this.MediaBrowserCompatMediaItem = false;
            i = 1;
        } else {
            i = 0;
        }
        double d = (((double) (this.onCustomAction - this.onPause)) * 1000000.0d) / ((double) this.RatingCompat);
        long jRound = Math.round(this.onCommand);
        if (this.IconCompatParcelizer) {
            this.IconCompatParcelizer = false;
            this.onCommand = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        } else {
            this.onCommand += d;
        }
        this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(jRound, i, this.AudioAttributesImplBaseParcelizer, 0, null);
        this.RemoteActionCompatParcelizer = false;
        this.onPause = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
    }
}
