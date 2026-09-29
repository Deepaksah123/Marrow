package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import kotlin.JsonSerializableSchema;

/* JADX INFO: loaded from: classes2.dex */
public final class expectStringFormat {
    public static final expectStringFormat AudioAttributesCompatParcelizer = new expectStringFormat(null, new write[0], 0, C.TIME_UNSET, 0);
    private static final write AudioAttributesImplBaseParcelizer = new write().write();
    public final int AudioAttributesImplApi26Parcelizer;
    private final write[] MediaBrowserCompatItemReceiver;
    public final int read;
    public final Object IconCompatParcelizer = null;
    public final long RemoteActionCompatParcelizer = 0;
    public final long write = C.TIME_UNSET;

    public static final class write {
        public final JsonSerializableSchema[] AudioAttributesCompatParcelizer;
        public final int[] AudioAttributesImplApi26Parcelizer;
        public final int AudioAttributesImplBaseParcelizer;
        public final boolean IconCompatParcelizer;
        public final long MediaBrowserCompatCustomActionResultReceiver;

        @Deprecated
        public final Uri[] MediaBrowserCompatItemReceiver;
        public final long[] RemoteActionCompatParcelizer;
        public final long read;
        public final int write;

        public write() {
            this(0L, -1, -1, new int[0], new JsonSerializableSchema[0], new long[0], 0L, false);
        }

        private write(long j, int i, int i2, int[] iArr, JsonSerializableSchema[] jsonSerializableSchemaArr, long[] jArr, long j2, boolean z) {
            int i3 = 0;
            buildTypeSerializer.IconCompatParcelizer(iArr.length == jsonSerializableSchemaArr.length);
            this.MediaBrowserCompatCustomActionResultReceiver = j;
            this.write = i;
            this.AudioAttributesImplBaseParcelizer = i2;
            this.AudioAttributesImplApi26Parcelizer = iArr;
            this.AudioAttributesCompatParcelizer = jsonSerializableSchemaArr;
            this.RemoteActionCompatParcelizer = jArr;
            this.read = j2;
            this.IconCompatParcelizer = z;
            this.MediaBrowserCompatItemReceiver = new Uri[jsonSerializableSchemaArr.length];
            while (true) {
                Uri[] uriArr = this.MediaBrowserCompatItemReceiver;
                if (i3 >= uriArr.length) {
                    return;
                }
                JsonSerializableSchema jsonSerializableSchema = jsonSerializableSchemaArr[i3];
                uriArr[i3] = jsonSerializableSchema == null ? null : ((JsonSerializableSchema.AudioAttributesImplApi21Parcelizer) buildTypeSerializer.IconCompatParcelizer(jsonSerializableSchema.AudioAttributesCompatParcelizer)).MediaBrowserCompatItemReceiver;
                i3++;
            }
        }

        public final int RemoteActionCompatParcelizer() {
            return IconCompatParcelizer(-1);
        }

        public final int IconCompatParcelizer(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.AudioAttributesImplApi26Parcelizer;
                if (i3 >= iArr.length || this.IconCompatParcelizer || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean IconCompatParcelizer() {
            return this.write == -1 || RemoteActionCompatParcelizer() < this.write;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            if (this.write == -1) {
                return true;
            }
            for (int i = 0; i < this.write; i++) {
                int i2 = this.AudioAttributesImplApi26Parcelizer[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean read() {
            return this.IconCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == Long.MIN_VALUE && this.write == -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write writeVar = (write) obj;
            return this.MediaBrowserCompatCustomActionResultReceiver == writeVar.MediaBrowserCompatCustomActionResultReceiver && this.write == writeVar.write && this.AudioAttributesImplBaseParcelizer == writeVar.AudioAttributesImplBaseParcelizer && Arrays.equals(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer) && Arrays.equals(this.AudioAttributesImplApi26Parcelizer, writeVar.AudioAttributesImplApi26Parcelizer) && Arrays.equals(this.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer) && this.read == writeVar.read && this.IconCompatParcelizer == writeVar.IconCompatParcelizer;
        }

        public final int hashCode() {
            int i = this.write;
            int i2 = this.AudioAttributesImplBaseParcelizer;
            long j = this.MediaBrowserCompatCustomActionResultReceiver;
            int iHashCode = Arrays.hashCode(this.AudioAttributesCompatParcelizer);
            int iHashCode2 = Arrays.hashCode(this.AudioAttributesImplApi26Parcelizer);
            int iHashCode3 = Arrays.hashCode(this.RemoteActionCompatParcelizer);
            long j2 = this.read;
            return (((((((((((((i * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.IconCompatParcelizer ? 1 : 0);
        }

        public final write write() {
            int[] iArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, 0);
            long[] jArrIconCompatParcelizer = IconCompatParcelizer(this.RemoteActionCompatParcelizer, 0);
            return new write(this.MediaBrowserCompatCustomActionResultReceiver, 0, this.AudioAttributesImplBaseParcelizer, iArrAudioAttributesCompatParcelizer, (JsonSerializableSchema[]) Arrays.copyOf(this.AudioAttributesCompatParcelizer, 0), jArrIconCompatParcelizer, this.read, this.IconCompatParcelizer);
        }

        private static int[] AudioAttributesCompatParcelizer(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(0, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        private static long[] IconCompatParcelizer(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(0, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(7);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(8);
        }
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
    }

    private expectStringFormat(Object obj, write[] writeVarArr, long j, long j2, int i) {
        int length = writeVarArr.length;
        this.read = 0;
        this.MediaBrowserCompatItemReceiver = writeVarArr;
        this.AudioAttributesImplApi26Parcelizer = 0;
    }

    public final write read(int i) {
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        if (i < i2) {
            return AudioAttributesImplBaseParcelizer;
        }
        return this.MediaBrowserCompatItemReceiver[i - i2];
    }

    public final int AudioAttributesCompatParcelizer(long j, long j2) {
        int i = this.read - 1;
        int i2 = i - (RemoteActionCompatParcelizer(i) ? 1 : 0);
        while (i2 >= 0 && AudioAttributesCompatParcelizer(j, j2, i2)) {
            i2--;
        }
        if (i2 < 0 || !read(i2).AudioAttributesCompatParcelizer()) {
            return -1;
        }
        return i2;
    }

    public final int write(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != C.TIME_UNSET && j >= j2) {
            return -1;
        }
        int i = this.AudioAttributesImplApi26Parcelizer;
        while (i < this.read && ((read(i).MediaBrowserCompatCustomActionResultReceiver != Long.MIN_VALUE && read(i).MediaBrowserCompatCustomActionResultReceiver <= j) || !read(i).IconCompatParcelizer())) {
            i++;
        }
        if (i < this.read) {
            return i;
        }
        return -1;
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        return i == this.read - 1 && read(i).read();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        expectStringFormat expectstringformat = (expectStringFormat) obj;
        return LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, expectstringformat.IconCompatParcelizer) && this.read == expectstringformat.read && this.RemoteActionCompatParcelizer == expectstringformat.RemoteActionCompatParcelizer && this.write == expectstringformat.write && this.AudioAttributesImplApi26Parcelizer == expectstringformat.AudioAttributesImplApi26Parcelizer && Arrays.equals(this.MediaBrowserCompatItemReceiver, expectstringformat.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        return (((((((((i * 31) + iHashCode) * 31) + ((int) this.RemoteActionCompatParcelizer)) * 31) + ((int) this.write)) * 31) + this.AudioAttributesImplApi26Parcelizer) * 31) + Arrays.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", adResumePositionUs=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.MediaBrowserCompatItemReceiver.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.MediaBrowserCompatItemReceiver[i].MediaBrowserCompatCustomActionResultReceiver);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.MediaBrowserCompatItemReceiver[i].AudioAttributesImplApi26Parcelizer.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.MediaBrowserCompatItemReceiver[i].AudioAttributesImplApi26Parcelizer[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 == 4) {
                    sb.append('!');
                } else {
                    sb.append('?');
                }
                sb.append(", durationUs=");
                sb.append(this.MediaBrowserCompatItemReceiver[i].RemoteActionCompatParcelizer[i2]);
                sb.append(')');
                if (i2 < this.MediaBrowserCompatItemReceiver[i].AudioAttributesImplApi26Parcelizer.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.MediaBrowserCompatItemReceiver.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    private boolean AudioAttributesCompatParcelizer(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        write writeVar = read(i);
        long j3 = writeVar.MediaBrowserCompatCustomActionResultReceiver;
        return j3 == Long.MIN_VALUE ? j2 == C.TIME_UNSET || (writeVar.IconCompatParcelizer && writeVar.write == -1) || j < j2 : j < j3;
    }
}
