package kotlin;

import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import kotlin.C0170format;
import kotlin.isCollectionMapOrArray;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class _constructFor implements findConstructor {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private findRawSuperTypes IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private _constructUsingMethod MediaBrowserCompatItemReceiver;
    private MotionPhotoMetadata RemoteActionCompatParcelizer;
    private closeOnFailAndThrowAsIOE read;
    private NativeImageUtil write;
    private final AsPropertyTypeDeserializer AudioAttributesImplBaseParcelizer = new AsPropertyTypeDeserializer(6);
    private long AudioAttributesImplApi21Parcelizer = -1;

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (RemoteActionCompatParcelizer(closeonfailandthrowasioe) != 65496) {
            return false;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(closeonfailandthrowasioe);
        this.AudioAttributesCompatParcelizer = iRemoteActionCompatParcelizer;
        if (iRemoteActionCompatParcelizer == 65504) {
            write(closeonfailandthrowasioe);
            this.AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(closeonfailandthrowasioe);
        }
        if (this.AudioAttributesCompatParcelizer != 65505) {
            return false;
        }
        closeonfailandthrowasioe.write(2);
        this.AudioAttributesImplBaseParcelizer.write(6);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), 0, 6);
        return this.AudioAttributesImplBaseParcelizer.onMediaButtonEvent() == 1165519206 && this.AudioAttributesImplBaseParcelizer.onPrepare() == 0;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.IconCompatParcelizer = findrawsupertypes;
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i == 0) {
            AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 1) {
            AudioAttributesImplApi21Parcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 2) {
            IconCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 4) {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            long j = this.AudioAttributesImplApi21Parcelizer;
            if (jIconCompatParcelizer != j) {
                isjacksonstdimpl.AudioAttributesCompatParcelizer = j;
                return 1;
            }
            MediaBrowserCompatItemReceiver(closeonfailandthrowasioe);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.MediaBrowserCompatItemReceiver == null || closeonfailandthrowasioe != this.read) {
            this.read = closeonfailandthrowasioe;
            this.MediaBrowserCompatItemReceiver = new _constructUsingMethod(closeonfailandthrowasioe, this.AudioAttributesImplApi21Parcelizer);
        }
        int iRemoteActionCompatParcelizer = ((NativeImageUtil) buildTypeSerializer.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, isjacksonstdimpl);
        if (iRemoteActionCompatParcelizer == 1) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer += this.AudioAttributesImplApi21Parcelizer;
        }
        return iRemoteActionCompatParcelizer;
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        if (j == 0) {
            this.AudioAttributesImplApi26Parcelizer = 0;
            this.write = null;
        } else if (this.AudioAttributesImplApi26Parcelizer == 5) {
            ((NativeImageUtil) buildTypeSerializer.IconCompatParcelizer(this.write)).write(j, j2);
        }
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
        NativeImageUtil nativeImageUtil = this.write;
        if (nativeImageUtil != null) {
            nativeImageUtil.RemoteActionCompatParcelizer();
        }
    }

    private int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.AudioAttributesImplBaseParcelizer.write(2);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), 0, 2);
        return this.AudioAttributesImplBaseParcelizer.onPrepare();
    }

    private void write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.AudioAttributesImplBaseParcelizer.write(2);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), 0, 2);
        closeonfailandthrowasioe.write(this.AudioAttributesImplBaseParcelizer.onPrepare() - 2);
    }

    private void AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.AudioAttributesImplBaseParcelizer.write(2);
        closeonfailandthrowasioe.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), 0, 2);
        int iOnPrepare = this.AudioAttributesImplBaseParcelizer.onPrepare();
        this.AudioAttributesCompatParcelizer = iOnPrepare;
        if (iOnPrepare == 65498) {
            if (this.AudioAttributesImplApi21Parcelizer != -1) {
                this.AudioAttributesImplApi26Parcelizer = 4;
                return;
            } else {
                IconCompatParcelizer();
                return;
            }
        }
        if ((iOnPrepare < 65488 || iOnPrepare > 65497) && iOnPrepare != 65281) {
            this.AudioAttributesImplApi26Parcelizer = 1;
        }
    }

    private void AudioAttributesImplApi21Parcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.AudioAttributesImplBaseParcelizer.write(2);
        closeonfailandthrowasioe.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), 0, 2);
        this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplBaseParcelizer.onPrepare() - 2;
        this.AudioAttributesImplApi26Parcelizer = 2;
    }

    private void IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        String strOnAddQueueItem;
        if (this.AudioAttributesCompatParcelizer == 65505) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(this.MediaBrowserCompatCustomActionResultReceiver);
            closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, this.MediaBrowserCompatCustomActionResultReceiver);
            if (this.RemoteActionCompatParcelizer == null && "http://ns.adobe.com/xap/1.0/".equals(asPropertyTypeDeserializer.onAddQueueItem()) && (strOnAddQueueItem = asPropertyTypeDeserializer.onAddQueueItem()) != null) {
                MotionPhotoMetadata motionPhotoMetadata = read(strOnAddQueueItem, closeonfailandthrowasioe.read());
                this.RemoteActionCompatParcelizer = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.AudioAttributesImplApi21Parcelizer = motionPhotoMetadata.RemoteActionCompatParcelizer;
                }
            }
        } else {
            closeonfailandthrowasioe.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }
        this.AudioAttributesImplApi26Parcelizer = 0;
    }

    private void MediaBrowserCompatItemReceiver(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (!closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), 0, 1, true)) {
            IconCompatParcelizer();
            return;
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        if (this.write == null) {
            this.write = new NativeImageUtil(withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer, 8);
        }
        _constructUsingMethod _constructusingmethod = new _constructUsingMethod(closeonfailandthrowasioe, this.AudioAttributesImplApi21Parcelizer);
        this.MediaBrowserCompatItemReceiver = _constructusingmethod;
        if (this.write.read(_constructusingmethod)) {
            this.write.read(new constructFor(this.AudioAttributesImplApi21Parcelizer, (findRawSuperTypes) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)));
            read();
        } else {
            IconCompatParcelizer();
        }
    }

    private void read() {
        AudioAttributesCompatParcelizer((MotionPhotoMetadata) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        this.AudioAttributesImplApi26Parcelizer = 5;
    }

    private void IconCompatParcelizer() {
        ((findRawSuperTypes) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).RemoteActionCompatParcelizer();
        this.IconCompatParcelizer.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
        this.AudioAttributesImplApi26Parcelizer = 6;
    }

    private void AudioAttributesCompatParcelizer(MotionPhotoMetadata motionPhotoMetadata) {
        ((findRawSuperTypes) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).IconCompatParcelizer(1024, 4).write(new C0170format.RemoteActionCompatParcelizer().IconCompatParcelizer(MimeTypes.IMAGE_JPEG).read(new androidx.media3.common.Metadata(motionPhotoMetadata)).IconCompatParcelizer());
    }

    private static MotionPhotoMetadata read(String str, long j) throws IOException {
        _constructUsingIndex _constructusingindexRemoteActionCompatParcelizer;
        if (j == -1 || (_constructusingindexRemoteActionCompatParcelizer = constructUsingEnumNamingStrategy.RemoteActionCompatParcelizer(str)) == null) {
            return null;
        }
        return _constructusingindexRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j);
    }
}
