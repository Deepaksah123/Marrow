package kotlin;

import android.util.Pair;
import kotlin.PolymorphicTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class findCollectionLikeSerializer extends PolymorphicTypeValidator {
    private final int IconCompatParcelizer;
    private final ToStringSerializerBase read;
    private final boolean write = false;

    protected abstract int AudioAttributesCompatParcelizer(int i);

    protected abstract int AudioAttributesCompatParcelizer(Object obj);

    protected abstract PolymorphicTypeValidator AudioAttributesImplApi26Parcelizer(int i);

    protected abstract int IconCompatParcelizer(int i);

    protected abstract int MediaBrowserCompatCustomActionResultReceiver(int i);

    protected abstract int RemoteActionCompatParcelizer(int i);

    protected abstract Object read(int i);

    public static Object RemoteActionCompatParcelizer(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object IconCompatParcelizer(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object read(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public findCollectionLikeSerializer(ToStringSerializerBase toStringSerializerBase) {
        this.read = toStringSerializerBase;
        this.IconCompatParcelizer = toStringSerializerBase.write();
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int IconCompatParcelizer(int i, int i2, boolean z) {
        if (this.write) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
        int iIconCompatParcelizer2 = AudioAttributesImplApi26Parcelizer(iIconCompatParcelizer).IconCompatParcelizer(i - iMediaBrowserCompatCustomActionResultReceiver, i2 != 2 ? i2 : 0, z);
        if (iIconCompatParcelizer2 != -1) {
            return iMediaBrowserCompatCustomActionResultReceiver + iIconCompatParcelizer2;
        }
        int iIconCompatParcelizer3 = IconCompatParcelizer(iIconCompatParcelizer, z);
        while (iIconCompatParcelizer3 != -1 && AudioAttributesImplApi26Parcelizer(iIconCompatParcelizer3).RemoteActionCompatParcelizer()) {
            iIconCompatParcelizer3 = IconCompatParcelizer(iIconCompatParcelizer3, z);
        }
        if (iIconCompatParcelizer3 != -1) {
            return MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer3) + AudioAttributesImplApi26Parcelizer(iIconCompatParcelizer3).RemoteActionCompatParcelizer(z);
        }
        if (i2 == 2) {
            return RemoteActionCompatParcelizer(z);
        }
        return -1;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int AudioAttributesCompatParcelizer(int i, int i2, boolean z) {
        if (this.write) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
        int iAudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer(iIconCompatParcelizer).AudioAttributesCompatParcelizer(i - iMediaBrowserCompatCustomActionResultReceiver, i2 != 2 ? i2 : 0, z);
        if (iAudioAttributesCompatParcelizer != -1) {
            return iMediaBrowserCompatCustomActionResultReceiver + iAudioAttributesCompatParcelizer;
        }
        int i3 = read(iIconCompatParcelizer, z);
        while (i3 != -1 && AudioAttributesImplApi26Parcelizer(i3).RemoteActionCompatParcelizer()) {
            i3 = read(i3, z);
        }
        if (i3 != -1) {
            return MediaBrowserCompatCustomActionResultReceiver(i3) + AudioAttributesImplApi26Parcelizer(i3).IconCompatParcelizer(z);
        }
        if (i2 == 2) {
            return IconCompatParcelizer(z);
        }
        return -1;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int IconCompatParcelizer(boolean z) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return -1;
        }
        if (this.write) {
            z = false;
        }
        int iAudioAttributesCompatParcelizer = z ? this.read.AudioAttributesCompatParcelizer() : i - 1;
        while (AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer).RemoteActionCompatParcelizer()) {
            iAudioAttributesCompatParcelizer = read(iAudioAttributesCompatParcelizer, z);
            if (iAudioAttributesCompatParcelizer == -1) {
                return -1;
            }
        }
        return MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesCompatParcelizer) + AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer).IconCompatParcelizer(z);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int RemoteActionCompatParcelizer(boolean z) {
        if (this.IconCompatParcelizer == 0) {
            return -1;
        }
        if (this.write) {
            z = false;
        }
        int iRemoteActionCompatParcelizer = z ? this.read.RemoteActionCompatParcelizer() : 0;
        while (AudioAttributesImplApi26Parcelizer(iRemoteActionCompatParcelizer).RemoteActionCompatParcelizer()) {
            iRemoteActionCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer, z);
            if (iRemoteActionCompatParcelizer == -1) {
                return -1;
            }
        }
        return MediaBrowserCompatCustomActionResultReceiver(iRemoteActionCompatParcelizer) + AudioAttributesImplApi26Parcelizer(iRemoteActionCompatParcelizer).RemoteActionCompatParcelizer(z);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iIconCompatParcelizer);
        AudioAttributesImplApi26Parcelizer(iIconCompatParcelizer).write(i - iMediaBrowserCompatCustomActionResultReceiver, iconCompatParcelizer, j);
        Object obj = read(iIconCompatParcelizer);
        if (!PolymorphicTypeValidator.IconCompatParcelizer.read.equals(iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver)) {
            obj = read(obj, iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver);
        }
        iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver = obj;
        iconCompatParcelizer.RemoteActionCompatParcelizer += iRemoteActionCompatParcelizer;
        iconCompatParcelizer.AudioAttributesImplBaseParcelizer += iRemoteActionCompatParcelizer;
        return iconCompatParcelizer;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(Object obj, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        Object objIconCompatParcelizer = IconCompatParcelizer(obj);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesCompatParcelizer);
        AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(objIconCompatParcelizer, audioAttributesCompatParcelizer);
        audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer += iMediaBrowserCompatCustomActionResultReceiver;
        audioAttributesCompatParcelizer.write = obj;
        return audioAttributesCompatParcelizer;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesCompatParcelizer);
        AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(i - RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer), audioAttributesCompatParcelizer, z);
        audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer += iMediaBrowserCompatCustomActionResultReceiver;
        if (z) {
            audioAttributesCompatParcelizer.write = read(read(iAudioAttributesCompatParcelizer), buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer.write));
        }
        return audioAttributesCompatParcelizer;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int read(Object obj) {
        int i;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        Object objIconCompatParcelizer = IconCompatParcelizer(obj);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer);
        if (iAudioAttributesCompatParcelizer == -1 || (i = AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer).read(objIconCompatParcelizer)) == -1) {
            return -1;
        }
        return RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer) + i;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final Object write(int i) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        return read(read(iAudioAttributesCompatParcelizer), AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer).write(i - RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer)));
    }

    private int IconCompatParcelizer(int i, boolean z) {
        if (z) {
            return this.read.IconCompatParcelizer(i);
        }
        if (i < this.IconCompatParcelizer - 1) {
            return i + 1;
        }
        return -1;
    }

    private int read(int i, boolean z) {
        if (z) {
            return this.read.RemoteActionCompatParcelizer(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }
}
