package kotlin;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import kotlin.JsonSerializableSchema;
import kotlin.expectStringFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PolymorphicTypeValidator {
    public static final PolymorphicTypeValidator RemoteActionCompatParcelizer = new PolymorphicTypeValidator() { // from class: o.PolymorphicTypeValidator.5
        @Override // kotlin.PolymorphicTypeValidator
        public final int AudioAttributesCompatParcelizer() {
            return 0;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final int IconCompatParcelizer() {
            return 0;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final int read(Object obj) {
            return -1;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final IconCompatParcelizer write(int i, IconCompatParcelizer iconCompatParcelizer, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final Object write(int i) {
            throw new IndexOutOfBoundsException();
        }
    };

    public abstract int AudioAttributesCompatParcelizer();

    public abstract int IconCompatParcelizer();

    public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z);

    public abstract int read(Object obj);

    public abstract Object write(int i);

    public abstract IconCompatParcelizer write(int i, IconCompatParcelizer iconCompatParcelizer, long j);

    public static final class IconCompatParcelizer {
        public long AudioAttributesCompatParcelizer;
        public JsonSerializableSchema.AudioAttributesImplApi26Parcelizer AudioAttributesImplApi21Parcelizer;
        public int AudioAttributesImplBaseParcelizer;
        public long IconCompatParcelizer;
        public boolean MediaBrowserCompatCustomActionResultReceiver;
        public boolean MediaBrowserCompatItemReceiver;
        public long MediaBrowserCompatMediaItem;
        private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

        @Deprecated
        public Object MediaDescriptionCompat;
        public long MediaMetadataCompat;
        public long RatingCompat;
        public int RemoteActionCompatParcelizer;
        private Object onAddQueueItem;
        public boolean write;
        public static final Object read = new Object();
        private static final JsonSerializableSchema onCustomAction = new JsonSerializableSchema.IconCompatParcelizer().RemoteActionCompatParcelizer("androidx.media3.common.Timeline").read(Uri.EMPTY).IconCompatParcelizer();
        public Object MediaBrowserCompatSearchResultReceiver = read;
        public JsonSerializableSchema AudioAttributesImplApi26Parcelizer = onCustomAction;

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(7);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(8);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(9);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(10);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(11);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(12);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(13);
        }

        public final IconCompatParcelizer write(Object obj, JsonSerializableSchema jsonSerializableSchema, Object obj2, long j, long j2, long j3, boolean z, boolean z2, JsonSerializableSchema.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, long j4, long j5, int i, long j6) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
            this.AudioAttributesImplApi26Parcelizer = jsonSerializableSchema != null ? jsonSerializableSchema : onCustomAction;
            this.MediaDescriptionCompat = (jsonSerializableSchema == null || jsonSerializableSchema.AudioAttributesCompatParcelizer == null) ? null : jsonSerializableSchema.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            this.onAddQueueItem = obj2;
            this.MediaMetadataCompat = j;
            this.RatingCompat = j2;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j3;
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            this.write = z2;
            this.AudioAttributesImplApi21Parcelizer = audioAttributesImplApi26Parcelizer;
            this.AudioAttributesCompatParcelizer = j4;
            this.IconCompatParcelizer = j5;
            this.RemoteActionCompatParcelizer = 0;
            this.AudioAttributesImplBaseParcelizer = i;
            this.MediaBrowserCompatMediaItem = j6;
            this.MediaBrowserCompatItemReceiver = false;
            return this;
        }

        public final long RemoteActionCompatParcelizer() {
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        public final long IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final long write() {
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        }

        public final long read() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final long AudioAttributesCompatParcelizer() {
            return LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }

        public final boolean AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer != null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatSearchResultReceiver, iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi26Parcelizer, iconCompatParcelizer.AudioAttributesImplApi26Parcelizer) && LaissezFaireSubTypeValidator.read(this.onAddQueueItem, iconCompatParcelizer.onAddQueueItem) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi21Parcelizer, iconCompatParcelizer.AudioAttributesImplApi21Parcelizer) && this.MediaMetadataCompat == iconCompatParcelizer.MediaMetadataCompat && this.RatingCompat == iconCompatParcelizer.RatingCompat && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == iconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.MediaBrowserCompatCustomActionResultReceiver == iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver && this.write == iconCompatParcelizer.write && this.MediaBrowserCompatItemReceiver == iconCompatParcelizer.MediaBrowserCompatItemReceiver && this.AudioAttributesCompatParcelizer == iconCompatParcelizer.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.AudioAttributesImplBaseParcelizer == iconCompatParcelizer.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatMediaItem == iconCompatParcelizer.MediaBrowserCompatMediaItem;
        }

        public final int hashCode() {
            int iHashCode = this.MediaBrowserCompatSearchResultReceiver.hashCode();
            int iHashCode2 = this.AudioAttributesImplApi26Parcelizer.hashCode();
            Object obj = this.onAddQueueItem;
            int iHashCode3 = obj == null ? 0 : obj.hashCode();
            JsonSerializableSchema.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi21Parcelizer;
            int iHashCode4 = audioAttributesImplApi26Parcelizer != null ? audioAttributesImplApi26Parcelizer.hashCode() : 0;
            long j = this.MediaMetadataCompat;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.RatingCompat;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            boolean z = this.MediaBrowserCompatCustomActionResultReceiver;
            boolean z2 = this.write;
            boolean z3 = this.MediaBrowserCompatItemReceiver;
            long j4 = this.AudioAttributesCompatParcelizer;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            long j5 = this.IconCompatParcelizer;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            int i6 = this.RemoteActionCompatParcelizer;
            int i7 = this.AudioAttributesImplBaseParcelizer;
            long j6 = this.MediaBrowserCompatMediaItem;
            return ((((((((((((((((((((((((((((iHashCode + 217) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i) * 31) + i2) * 31) + i3) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + ((int) ((j6 >>> 32) ^ j6));
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        public long AudioAttributesCompatParcelizer;
        private expectStringFormat AudioAttributesImplApi21Parcelizer = expectStringFormat.AudioAttributesCompatParcelizer;
        public int AudioAttributesImplBaseParcelizer;
        public boolean IconCompatParcelizer;
        public Object RemoteActionCompatParcelizer;
        public long read;
        public Object write;

        public final AudioAttributesCompatParcelizer read(Object obj, Object obj2, long j, long j2) {
            return read(obj, obj2, 0, j, j2, expectStringFormat.AudioAttributesCompatParcelizer, false);
        }

        public final AudioAttributesCompatParcelizer read(Object obj, Object obj2, int i, long j, long j2, expectStringFormat expectstringformat, boolean z) {
            this.RemoteActionCompatParcelizer = obj;
            this.write = obj2;
            this.AudioAttributesImplBaseParcelizer = i;
            this.read = j;
            this.AudioAttributesCompatParcelizer = j2;
            this.AudioAttributesImplApi21Parcelizer = expectstringformat;
            this.IconCompatParcelizer = z;
            return this;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final long AudioAttributesCompatParcelizer() {
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        public final long IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int write() {
            return this.AudioAttributesImplApi21Parcelizer.read;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer;
        }

        public final long write(int i) {
            return this.AudioAttributesImplApi21Parcelizer.read(i).MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int AudioAttributesCompatParcelizer(int i) {
            return this.AudioAttributesImplApi21Parcelizer.read(i).RemoteActionCompatParcelizer();
        }

        public final int AudioAttributesCompatParcelizer(int i, int i2) {
            return this.AudioAttributesImplApi21Parcelizer.read(i).IconCompatParcelizer(i2);
        }

        public final boolean IconCompatParcelizer(int i) {
            return !this.AudioAttributesImplApi21Parcelizer.read(i).AudioAttributesCompatParcelizer();
        }

        public final int read(long j) {
            return this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(j, this.read);
        }

        public final int write(long j) {
            return this.AudioAttributesImplApi21Parcelizer.write(j, this.read);
        }

        public final int read(int i) {
            return this.AudioAttributesImplApi21Parcelizer.read(i).write;
        }

        public final long RemoteActionCompatParcelizer(int i, int i2) {
            expectStringFormat.write writeVar = this.AudioAttributesImplApi21Parcelizer.read(i);
            return writeVar.write != -1 ? writeVar.RemoteActionCompatParcelizer[i2] : C.TIME_UNSET;
        }

        public final int IconCompatParcelizer(int i, int i2) {
            expectStringFormat.write writeVar = this.AudioAttributesImplApi21Parcelizer.read(i);
            if (writeVar.write != -1) {
                return writeVar.AudioAttributesImplApi26Parcelizer[i2];
            }
            return 0;
        }

        public final boolean MediaBrowserCompatItemReceiver(int i) {
            return i == write() - 1 && this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(i);
        }

        public final long read() {
            return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer;
        }

        public final boolean AudioAttributesImplBaseParcelizer(int i) {
            return this.AudioAttributesImplApi21Parcelizer.read(i).IconCompatParcelizer;
        }

        public final long RemoteActionCompatParcelizer(int i) {
            return this.AudioAttributesImplApi21Parcelizer.read(i).read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.write, audioAttributesCompatParcelizer.write) && this.AudioAttributesImplBaseParcelizer == audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer && this.read == audioAttributesCompatParcelizer.read && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi21Parcelizer, audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer);
        }

        public final int hashCode() {
            Object obj = this.RemoteActionCompatParcelizer;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.write;
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            int i = this.AudioAttributesImplBaseParcelizer;
            long j = this.read;
            long j2 = this.AudioAttributesCompatParcelizer;
            return ((((((((((((iHashCode + 217) * 31) + iHashCode2) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.IconCompatParcelizer ? 1 : 0)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode();
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        }
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer() == 0;
    }

    public int IconCompatParcelizer(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == IconCompatParcelizer(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == IconCompatParcelizer(z) ? RemoteActionCompatParcelizer(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int AudioAttributesCompatParcelizer(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == RemoteActionCompatParcelizer(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == RemoteActionCompatParcelizer(z) ? IconCompatParcelizer(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public int IconCompatParcelizer(boolean z) {
        if (RemoteActionCompatParcelizer()) {
            return -1;
        }
        return AudioAttributesCompatParcelizer() - 1;
    }

    public int RemoteActionCompatParcelizer(boolean z) {
        return RemoteActionCompatParcelizer() ? -1 : 0;
    }

    public final IconCompatParcelizer RemoteActionCompatParcelizer(int i, IconCompatParcelizer iconCompatParcelizer) {
        return write(i, iconCompatParcelizer, 0L);
    }

    public final int write(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, IconCompatParcelizer iconCompatParcelizer, int i2, boolean z) {
        int i3 = AudioAttributesCompatParcelizer(i, audioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer;
        if (RemoteActionCompatParcelizer(i3, iconCompatParcelizer).AudioAttributesImplBaseParcelizer != i) {
            return i + 1;
        }
        int iIconCompatParcelizer = IconCompatParcelizer(i3, i2, z);
        if (iIconCompatParcelizer == -1) {
            return -1;
        }
        return RemoteActionCompatParcelizer(iIconCompatParcelizer, iconCompatParcelizer).RemoteActionCompatParcelizer;
    }

    public final boolean IconCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, IconCompatParcelizer iconCompatParcelizer, int i2, boolean z) {
        return write(i, audioAttributesCompatParcelizer, iconCompatParcelizer, i2, z) == -1;
    }

    public final Pair<Object, Long> AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, long j) {
        return (Pair) buildTypeSerializer.IconCompatParcelizer(write(iconCompatParcelizer, audioAttributesCompatParcelizer, i, j, 0L));
    }

    public final Pair<Object, Long> write(IconCompatParcelizer iconCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, long j, long j2) {
        buildTypeSerializer.RemoteActionCompatParcelizer(i, AudioAttributesCompatParcelizer());
        write(i, iconCompatParcelizer, j2);
        if (j == C.TIME_UNSET) {
            j = iconCompatParcelizer.IconCompatParcelizer();
            if (j == C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = iconCompatParcelizer.RemoteActionCompatParcelizer;
        AudioAttributesCompatParcelizer(i2, audioAttributesCompatParcelizer);
        while (i2 < iconCompatParcelizer.AudioAttributesImplBaseParcelizer && audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer != j) {
            int i3 = i2 + 1;
            if (AudioAttributesCompatParcelizer(i3, audioAttributesCompatParcelizer).AudioAttributesCompatParcelizer > j) {
                break;
            }
            i2 = i3;
        }
        RemoteActionCompatParcelizer(i2, audioAttributesCompatParcelizer, true);
        long jMin = j - audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer.read != C.TIME_UNSET) {
            jMin = Math.min(jMin, audioAttributesCompatParcelizer.read - 1);
        }
        return Pair.create(buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer.write), Long.valueOf(Math.max(0L, jMin)));
    }

    public AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(Object obj, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return RemoteActionCompatParcelizer(read(obj), audioAttributesCompatParcelizer, true);
    }

    public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, false);
    }

    public boolean equals(Object obj) {
        int iIconCompatParcelizer;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolymorphicTypeValidator)) {
            return false;
        }
        PolymorphicTypeValidator polymorphicTypeValidator = (PolymorphicTypeValidator) obj;
        if (polymorphicTypeValidator.AudioAttributesCompatParcelizer() != AudioAttributesCompatParcelizer() || polymorphicTypeValidator.IconCompatParcelizer() != IconCompatParcelizer()) {
            return false;
        }
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer();
        for (int i = 0; i < AudioAttributesCompatParcelizer(); i++) {
            if (!RemoteActionCompatParcelizer(i, iconCompatParcelizer).equals(polymorphicTypeValidator.RemoteActionCompatParcelizer(i, iconCompatParcelizer2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < IconCompatParcelizer(); i2++) {
            if (!RemoteActionCompatParcelizer(i2, audioAttributesCompatParcelizer, true).equals(polymorphicTypeValidator.RemoteActionCompatParcelizer(i2, audioAttributesCompatParcelizer2, true))) {
                return false;
            }
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(true);
        if (iRemoteActionCompatParcelizer != polymorphicTypeValidator.RemoteActionCompatParcelizer(true) || (iIconCompatParcelizer = IconCompatParcelizer(true)) != polymorphicTypeValidator.IconCompatParcelizer(true)) {
            return false;
        }
        while (iRemoteActionCompatParcelizer != iIconCompatParcelizer) {
            int iIconCompatParcelizer2 = IconCompatParcelizer(iRemoteActionCompatParcelizer, 0, true);
            if (iIconCompatParcelizer2 != polymorphicTypeValidator.IconCompatParcelizer(iRemoteActionCompatParcelizer, 0, true)) {
                return false;
            }
            iRemoteActionCompatParcelizer = iIconCompatParcelizer2;
        }
        return true;
    }

    public int hashCode() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer() + 217;
        for (int i = 0; i < AudioAttributesCompatParcelizer(); i++) {
            iAudioAttributesCompatParcelizer = (iAudioAttributesCompatParcelizer * 31) + RemoteActionCompatParcelizer(i, iconCompatParcelizer).hashCode();
        }
        int iIconCompatParcelizer = (iAudioAttributesCompatParcelizer * 31) + IconCompatParcelizer();
        for (int i2 = 0; i2 < IconCompatParcelizer(); i2++) {
            iIconCompatParcelizer = (iIconCompatParcelizer * 31) + RemoteActionCompatParcelizer(i2, audioAttributesCompatParcelizer, true).hashCode();
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(true);
        while (iRemoteActionCompatParcelizer != -1) {
            iIconCompatParcelizer = (iIconCompatParcelizer * 31) + iRemoteActionCompatParcelizer;
            iRemoteActionCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer, 0, true);
        }
        return iIconCompatParcelizer;
    }
}
