package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import kotlin.ByteBufferBackedOutputStream;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class setNext implements checkNotEmpty {
    private static final byte[] IconCompatParcelizer = {73, 68, TarConstants.LF_CHR};
    private nonNullString AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final AsPropertyTypeDeserializer MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private nonNullString RatingCompat;
    private final AsExternalTypeSerializer RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final int onAddQueueItem;
    private nonNullString onCommand;
    private long onCustomAction;
    private long onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private int read;
    private int write;

    public static boolean RemoteActionCompatParcelizer(int i) {
        return (i & 65526) == 65520;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
    }

    public setNext() {
        this(true, null, 0);
    }

    public setNext(boolean z, String str, int i) {
        this.RemoteActionCompatParcelizer = new AsExternalTypeSerializer(new byte[7]);
        this.MediaDescriptionCompat = new AsPropertyTypeDeserializer(Arrays.copyOf(IconCompatParcelizer, 10));
        MediaBrowserCompatCustomActionResultReceiver();
        this.AudioAttributesImplBaseParcelizer = -1;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.onCustomAction = C.TIME_UNSET;
        this.onFastForward = C.TIME_UNSET;
        this.MediaBrowserCompatItemReceiver = z;
        this.handleMediaPlayPauseIfPendingOnHandler = str;
        this.onAddQueueItem = i;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.onFastForward = C.TIME_UNSET;
        MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.AudioAttributesImplApi21Parcelizer = writeVar.IconCompatParcelizer();
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 1);
        this.onCommand = nonnullstringIconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = nonnullstringIconCompatParcelizer;
        if (this.MediaBrowserCompatItemReceiver) {
            writeVar.read();
            nonNullString nonnullstringIconCompatParcelizer2 = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 5);
            this.RatingCompat = nonnullstringIconCompatParcelizer2;
            nonnullstringIconCompatParcelizer2.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer()).AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_ID3).IconCompatParcelizer());
            return;
        }
        this.RatingCompat = new exceptionMessage();
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.onFastForward = j;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        IconCompatParcelizer();
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i = this.onPause;
            if (i == 0) {
                AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
            } else if (i == 1) {
                IconCompatParcelizer(asPropertyTypeDeserializer);
            } else if (i != 2) {
                if (i == 3) {
                    if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer, this.RemoteActionCompatParcelizer.write, this.MediaBrowserCompatMediaItem ? 7 : 5)) {
                        read();
                    }
                } else if (i == 4) {
                    RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
                } else {
                    throw new IllegalStateException();
                }
            } else if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(), 10)) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.onCustomAction;
    }

    private void MediaBrowserCompatItemReceiver() {
        this.MediaMetadataCompat = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, byte[] bArr, int i) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), i - this.read);
        asPropertyTypeDeserializer.write(bArr, this.read, iMin);
        int i2 = this.read + iMin;
        this.read = i2;
        return i2 == i;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.onPause = 0;
        this.read = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 256;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.onPause = 2;
        this.read = IconCompatParcelizer.length;
        this.onMediaButtonEvent = 0;
        this.MediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver(0);
    }

    private void write(nonNullString nonnullstring, long j, int i, int i2) {
        this.onPause = 4;
        this.read = i;
        this.AudioAttributesCompatParcelizer = nonnullstring;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.onMediaButtonEvent = i2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        this.onPause = 3;
        this.read = 0;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.onPause = 1;
        this.read = 0;
    }

    private void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        while (iWrite < i) {
            int i2 = iWrite + 1;
            byte b = bArrRemoteActionCompatParcelizer[iWrite];
            int i3 = b & 255;
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 512 && IconCompatParcelizer((byte) i3) && (this.MediaMetadataCompat || read(asPropertyTypeDeserializer, iWrite - 1))) {
                this.write = (b & 8) >> 3;
                this.MediaBrowserCompatMediaItem = (b & 1) == 0;
                if (!this.MediaMetadataCompat) {
                    AudioAttributesImplApi21Parcelizer();
                } else {
                    AudioAttributesImplBaseParcelizer();
                }
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i2);
                return;
            }
            int i4 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int i5 = i3 | i4;
            if (i5 == 329) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 768;
            } else if (i5 == 511) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 512;
            } else if (i5 == 836) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1024;
            } else if (i5 == 1075) {
                AudioAttributesImplApi26Parcelizer();
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i2);
                return;
            } else if (i4 != 256) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 256;
            }
            iWrite = i2;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
    }

    private void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() == 0) {
            return;
        }
        this.RemoteActionCompatParcelizer.write[0] = asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[asPropertyTypeDeserializer.write()];
        this.RemoteActionCompatParcelizer.read(2);
        int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(4);
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i != -1 && iIconCompatParcelizer != i) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (!this.MediaMetadataCompat) {
            this.MediaMetadataCompat = true;
            this.AudioAttributesImplBaseParcelizer = this.write;
            this.MediaBrowserCompatCustomActionResultReceiver = iIconCompatParcelizer;
        }
        AudioAttributesImplBaseParcelizer();
    }

    private boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i + 1);
        if (!read(asPropertyTypeDeserializer, this.RemoteActionCompatParcelizer.write, 1)) {
            return false;
        }
        this.RemoteActionCompatParcelizer.read(4);
        int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(1);
        int i2 = this.AudioAttributesImplBaseParcelizer;
        if (i2 != -1 && iIconCompatParcelizer != i2) {
            return false;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != -1) {
            if (!read(asPropertyTypeDeserializer, this.RemoteActionCompatParcelizer.write, 1)) {
                return true;
            }
            this.RemoteActionCompatParcelizer.read(2);
            if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(4) != this.MediaBrowserCompatCustomActionResultReceiver) {
                return false;
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i + 2);
        }
        if (!read(asPropertyTypeDeserializer, this.RemoteActionCompatParcelizer.write, 4)) {
            return true;
        }
        this.RemoteActionCompatParcelizer.read(14);
        int iIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(13);
        if (iIconCompatParcelizer2 < 7) {
            return false;
        }
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        int i3 = asPropertyTypeDeserializer.read();
        int i4 = i + iIconCompatParcelizer2;
        if (i4 >= i3) {
            return true;
        }
        byte b = bArrRemoteActionCompatParcelizer[i4];
        if (b == -1) {
            int i5 = i4 + 1;
            if (i5 == i3) {
                return true;
            }
            return IconCompatParcelizer(bArrRemoteActionCompatParcelizer[i5]) && ((bArrRemoteActionCompatParcelizer[i5] & 8) >> 3) == iIconCompatParcelizer;
        }
        if (b != 73) {
            return false;
        }
        int i6 = i4 + 1;
        if (i6 == i3) {
            return true;
        }
        if (bArrRemoteActionCompatParcelizer[i6] != 68) {
            return false;
        }
        int i7 = i4 + 2;
        return i7 == i3 || bArrRemoteActionCompatParcelizer[i7] == 51;
    }

    private static boolean IconCompatParcelizer(byte b) {
        return RemoteActionCompatParcelizer((b & 255) | 65280);
    }

    private static boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, byte[] bArr, int i) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < i) {
            return false;
        }
        asPropertyTypeDeserializer.write(bArr, 0, i);
        return true;
    }

    private void RemoteActionCompatParcelizer() {
        this.RatingCompat.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, 10);
        this.MediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver(6);
        write(this.RatingCompat, 0L, 10, this.MediaDescriptionCompat.onPlay() + 10);
    }

    private void read() throws SchemaAware {
        this.RemoteActionCompatParcelizer.read(0);
        if (!this.MediaBrowserCompatSearchResultReceiver) {
            int i = 2;
            int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(2) + 1;
            if (iIconCompatParcelizer != 2) {
                StringBuilder sb = new StringBuilder("Detected audio object type: ");
                sb.append(iIconCompatParcelizer);
                sb.append(", but assuming AAC LC.");
                prune.RemoteActionCompatParcelizer("AdtsReader", sb.toString());
            } else {
                i = iIconCompatParcelizer;
            }
            this.RemoteActionCompatParcelizer.write(5);
            byte[] bArr = ByteBufferBackedOutputStream.read(i, this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer.IconCompatParcelizer(3));
            ByteBufferBackedOutputStream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = ByteBufferBackedOutputStream.read(bArr);
            C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer).AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_AAC).RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write).read(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(remoteActionCompatParcelizer.IconCompatParcelizer).RemoteActionCompatParcelizer(Collections.singletonList(bArr)).read(this.handleMediaPlayPauseIfPendingOnHandler).MediaBrowserCompatSearchResultReceiver(this.onAddQueueItem).IconCompatParcelizer();
            this.onCustomAction = 1024000000 / ((long) c0170formatIconCompatParcelizer.onPrepareFromUri);
            this.onCommand.write(c0170formatIconCompatParcelizer);
            this.MediaBrowserCompatSearchResultReceiver = true;
        } else {
            this.RemoteActionCompatParcelizer.write(10);
        }
        this.RemoteActionCompatParcelizer.write(4);
        int iIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(13);
        int i2 = iIconCompatParcelizer2 - 7;
        if (this.MediaBrowserCompatMediaItem) {
            i2 = iIconCompatParcelizer2 - 9;
        }
        write(this.onCommand, this.onCustomAction, 0, i2);
    }

    private void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.onMediaButtonEvent - this.read);
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMin);
        int i = this.read + iMin;
        this.read = i;
        if (i == this.onMediaButtonEvent) {
            buildTypeSerializer.write(this.onFastForward != C.TIME_UNSET);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.onFastForward, 1, this.onMediaButtonEvent, 0, null);
            this.onFastForward += this.AudioAttributesImplApi26Parcelizer;
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private void IconCompatParcelizer() {
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.RatingCompat);
    }
}
