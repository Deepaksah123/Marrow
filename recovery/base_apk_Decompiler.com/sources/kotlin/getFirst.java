package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import kotlin.ByteBufferBackedOutputStream;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class getFirst implements checkNotEmpty {
    private String AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private final AsExternalTypeSerializer MediaBrowserCompatMediaItem;
    private final AsPropertyTypeDeserializer MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private nonNullString RatingCompat;
    private int RemoteActionCompatParcelizer;
    private long handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private long onPause;
    private boolean onPlayFromMediaId;
    private int read;
    private C0170format write;

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
    }

    public getFirst(String str, int i) {
        this.AudioAttributesImplApi26Parcelizer = str;
        this.MediaDescriptionCompat = i;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(1024);
        this.MediaBrowserCompatSearchResultReceiver = asPropertyTypeDeserializer;
        this.MediaBrowserCompatMediaItem = new AsExternalTypeSerializer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer());
        this.onPause = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        this.onPause = C.TIME_UNSET;
        this.onPlayFromMediaId = false;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.RatingCompat = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 1);
        this.MediaBrowserCompatItemReceiver = writeVar.IconCompatParcelizer();
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.onPause = j;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.RatingCompat);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (i != 0) {
                if (i == 1) {
                    int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                    if ((iOnPlayFromMediaId & 224) == 224) {
                        this.onCommand = iOnPlayFromMediaId;
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 2;
                    } else if (iOnPlayFromMediaId != 86) {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
                    }
                } else if (i == 2) {
                    int iOnPlayFromMediaId2 = ((this.onCommand & (-225)) << 8) | asPropertyTypeDeserializer.onPlayFromMediaId();
                    this.onCustomAction = iOnPlayFromMediaId2;
                    if (iOnPlayFromMediaId2 > this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer().length) {
                        write(this.onCustomAction);
                    }
                    this.RemoteActionCompatParcelizer = 0;
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 3;
                } else if (i == 3) {
                    int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.onCustomAction - this.RemoteActionCompatParcelizer);
                    asPropertyTypeDeserializer.write(this.MediaBrowserCompatMediaItem.write, this.RemoteActionCompatParcelizer, iMin);
                    int i2 = this.RemoteActionCompatParcelizer + iMin;
                    this.RemoteActionCompatParcelizer = i2;
                    if (i2 == this.onCustomAction) {
                        this.MediaBrowserCompatMediaItem.read(0);
                        RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (asPropertyTypeDeserializer.onPlayFromMediaId() == 86) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
            }
        }
    }

    private void RemoteActionCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) throws SchemaAware {
        if (!asExternalTypeSerializer.read()) {
            this.onPlayFromMediaId = true;
            MediaBrowserCompatItemReceiver(asExternalTypeSerializer);
        } else if (!this.onPlayFromMediaId) {
            return;
        }
        if (this.IconCompatParcelizer == 0) {
            if (this.MediaBrowserCompatCustomActionResultReceiver != 0) {
                throw SchemaAware.RemoteActionCompatParcelizer(null, null);
            }
            write(asExternalTypeSerializer, write(asExternalTypeSerializer));
            if (this.MediaMetadataCompat) {
                asExternalTypeSerializer.write((int) this.AudioAttributesImplBaseParcelizer);
                return;
            }
            return;
        }
        throw SchemaAware.RemoteActionCompatParcelizer(null, null);
    }

    private void MediaBrowserCompatItemReceiver(AsExternalTypeSerializer asExternalTypeSerializer) throws SchemaAware {
        boolean z;
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(1);
        int iIconCompatParcelizer2 = iIconCompatParcelizer == 1 ? asExternalTypeSerializer.IconCompatParcelizer(1) : 0;
        this.IconCompatParcelizer = iIconCompatParcelizer2;
        if (iIconCompatParcelizer2 == 0) {
            if (iIconCompatParcelizer == 1) {
                AudioAttributesCompatParcelizer(asExternalTypeSerializer);
            }
            if (!asExternalTypeSerializer.read()) {
                throw SchemaAware.RemoteActionCompatParcelizer(null, null);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = asExternalTypeSerializer.IconCompatParcelizer(6);
            int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(4);
            int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(3);
            if (iIconCompatParcelizer3 != 0 || iIconCompatParcelizer4 != 0) {
                throw SchemaAware.RemoteActionCompatParcelizer(null, null);
            }
            if (iIconCompatParcelizer == 0) {
                int iAudioAttributesCompatParcelizer = asExternalTypeSerializer.AudioAttributesCompatParcelizer();
                int iIconCompatParcelizer5 = IconCompatParcelizer(asExternalTypeSerializer);
                asExternalTypeSerializer.read(iAudioAttributesCompatParcelizer);
                byte[] bArr = new byte[(iIconCompatParcelizer5 + 7) / 8];
                asExternalTypeSerializer.read(bArr, 0, iIconCompatParcelizer5);
                C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver).AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_AAC).RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer).read(this.read).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.onAddQueueItem).RemoteActionCompatParcelizer(Collections.singletonList(bArr)).read(this.AudioAttributesImplApi26Parcelizer).MediaBrowserCompatSearchResultReceiver(this.MediaDescriptionCompat).IconCompatParcelizer();
                if (!c0170formatIconCompatParcelizer.equals(this.write)) {
                    this.write = c0170formatIconCompatParcelizer;
                    this.handleMediaPlayPauseIfPendingOnHandler = 1024000000 / ((long) c0170formatIconCompatParcelizer.onPrepareFromUri);
                    this.RatingCompat.write(c0170formatIconCompatParcelizer);
                }
            } else {
                asExternalTypeSerializer.write(((int) AudioAttributesCompatParcelizer(asExternalTypeSerializer)) - IconCompatParcelizer(asExternalTypeSerializer));
            }
            read(asExternalTypeSerializer);
            boolean z2 = asExternalTypeSerializer.read();
            this.MediaMetadataCompat = z2;
            this.AudioAttributesImplBaseParcelizer = 0L;
            if (z2) {
                if (iIconCompatParcelizer == 1) {
                    this.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer);
                } else {
                    do {
                        z = asExternalTypeSerializer.read();
                        this.AudioAttributesImplBaseParcelizer = (this.AudioAttributesImplBaseParcelizer << 8) + ((long) asExternalTypeSerializer.IconCompatParcelizer(8));
                    } while (z);
                }
            }
            if (asExternalTypeSerializer.read()) {
                asExternalTypeSerializer.write(8);
                return;
            }
            return;
        }
        throw SchemaAware.RemoteActionCompatParcelizer(null, null);
    }

    private void read(AsExternalTypeSerializer asExternalTypeSerializer) {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(3);
        this.AudioAttributesImplApi21Parcelizer = iIconCompatParcelizer;
        if (iIconCompatParcelizer == 0) {
            asExternalTypeSerializer.write(8);
            return;
        }
        if (iIconCompatParcelizer == 1) {
            asExternalTypeSerializer.write(9);
            return;
        }
        if (iIconCompatParcelizer == 3 || iIconCompatParcelizer == 4 || iIconCompatParcelizer == 5) {
            asExternalTypeSerializer.write(6);
        } else {
            if (iIconCompatParcelizer == 6 || iIconCompatParcelizer == 7) {
                asExternalTypeSerializer.write(1);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private int IconCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) throws SchemaAware {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer();
        ByteBufferBackedOutputStream.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = ByteBufferBackedOutputStream.write(asExternalTypeSerializer, true);
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizerWrite.write;
        this.onAddQueueItem = remoteActionCompatParcelizerWrite.IconCompatParcelizer;
        this.read = remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer;
        return iIconCompatParcelizer - asExternalTypeSerializer.IconCompatParcelizer();
    }

    private int write(AsExternalTypeSerializer asExternalTypeSerializer) throws SchemaAware {
        int iIconCompatParcelizer;
        if (this.AudioAttributesImplApi21Parcelizer != 0) {
            throw SchemaAware.RemoteActionCompatParcelizer(null, null);
        }
        int i = 0;
        do {
            iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8);
            i += iIconCompatParcelizer;
        } while (iIconCompatParcelizer == 255);
        return i;
    }

    private void write(AsExternalTypeSerializer asExternalTypeSerializer, int i) {
        int iAudioAttributesCompatParcelizer = asExternalTypeSerializer.AudioAttributesCompatParcelizer();
        if ((iAudioAttributesCompatParcelizer & 7) == 0) {
            this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesCompatParcelizer >> 3);
        } else {
            asExternalTypeSerializer.read(this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(), 0, i << 3);
            this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(0);
        }
        this.RatingCompat.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, i);
        buildTypeSerializer.write(this.onPause != C.TIME_UNSET);
        this.RatingCompat.IconCompatParcelizer(this.onPause, 1, i, 0, null);
        this.onPause += this.handleMediaPlayPauseIfPendingOnHandler;
    }

    private void write(int i) {
        this.MediaBrowserCompatSearchResultReceiver.write(i);
        this.MediaBrowserCompatMediaItem.read(this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer());
    }

    private static long AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        return asExternalTypeSerializer.IconCompatParcelizer((asExternalTypeSerializer.IconCompatParcelizer(2) + 1) << 3);
    }
}
