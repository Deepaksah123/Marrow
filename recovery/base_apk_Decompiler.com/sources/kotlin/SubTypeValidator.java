package kotlin;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class SubTypeValidator {
    public final int AudioAttributesCompatParcelizer;
    public final long AudioAttributesImplApi21Parcelizer;
    public final String AudioAttributesImplApi26Parcelizer;
    public final Uri AudioAttributesImplBaseParcelizer;
    public final byte[] IconCompatParcelizer;
    public final long MediaBrowserCompatCustomActionResultReceiver;
    public final Map<String, String> MediaBrowserCompatItemReceiver;
    public final long MediaBrowserCompatSearchResultReceiver;
    public final int RemoteActionCompatParcelizer;
    public final Object read;

    @Deprecated
    public final long write;

    /* synthetic */ SubTypeValidator(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, byte b) {
        this(uri, j, i, bArr, map, j2, j3, str, i2, obj);
    }

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.datasource");
    }

    public static final class write {
        private int AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private long AudioAttributesImplApi26Parcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Uri MediaBrowserCompatCustomActionResultReceiver;
        private String MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private Map<String, String> read;
        private byte[] write;

        /* synthetic */ write(SubTypeValidator subTypeValidator, byte b) {
            this(subTypeValidator);
        }

        public write() {
            this.RemoteActionCompatParcelizer = 1;
            this.read = Collections.emptyMap();
            this.AudioAttributesImplBaseParcelizer = -1L;
        }

        private write(SubTypeValidator subTypeValidator) {
            this.MediaBrowserCompatCustomActionResultReceiver = subTypeValidator.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesImplApi21Parcelizer = subTypeValidator.MediaBrowserCompatSearchResultReceiver;
            this.RemoteActionCompatParcelizer = subTypeValidator.AudioAttributesCompatParcelizer;
            this.write = subTypeValidator.IconCompatParcelizer;
            this.read = subTypeValidator.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplApi26Parcelizer = subTypeValidator.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplBaseParcelizer = subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatItemReceiver = subTypeValidator.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesCompatParcelizer = subTypeValidator.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = subTypeValidator.read;
        }

        public final write read(String str) {
            this.MediaBrowserCompatCustomActionResultReceiver = Uri.parse(str);
            return this;
        }

        public final write IconCompatParcelizer(Uri uri) {
            this.MediaBrowserCompatCustomActionResultReceiver = uri;
            return this;
        }

        public final write RemoteActionCompatParcelizer() {
            this.RemoteActionCompatParcelizer = 2;
            return this;
        }

        public final write read(byte[] bArr) {
            this.write = bArr;
            return this;
        }

        public final write read(Map<String, String> map) {
            this.read = map;
            return this;
        }

        public final write IconCompatParcelizer(long j) {
            this.AudioAttributesImplApi26Parcelizer = j;
            return this;
        }

        public final write write(long j) {
            this.AudioAttributesImplBaseParcelizer = j;
            return this;
        }

        public final write RemoteActionCompatParcelizer(String str) {
            this.MediaBrowserCompatItemReceiver = str;
            return this;
        }

        public final write read(int i) {
            this.AudioAttributesCompatParcelizer = i;
            return this;
        }

        public final SubTypeValidator write() {
            buildTypeSerializer.read(this.MediaBrowserCompatCustomActionResultReceiver, "The uri must be set.");
            return new SubTypeValidator(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.write, this.read, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, (byte) 0);
        }
    }

    public static String AudioAttributesCompatParcelizer(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    private SubTypeValidator(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        buildTypeSerializer.IconCompatParcelizer(j4 >= 0);
        buildTypeSerializer.IconCompatParcelizer(j2 >= 0);
        buildTypeSerializer.IconCompatParcelizer(j3 > 0 || j3 == -1);
        this.AudioAttributesImplBaseParcelizer = (Uri) buildTypeSerializer.IconCompatParcelizer(uri);
        this.MediaBrowserCompatSearchResultReceiver = j;
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.MediaBrowserCompatItemReceiver = Collections.unmodifiableMap(new HashMap(map));
        this.AudioAttributesImplApi21Parcelizer = j2;
        this.write = j4;
        this.MediaBrowserCompatCustomActionResultReceiver = j3;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.RemoteActionCompatParcelizer = i2;
        this.read = obj;
    }

    public final boolean read(int i) {
        return (this.RemoteActionCompatParcelizer & i) == i;
    }

    public final String write() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final write read() {
        return new write(this, (byte) 0);
    }

    public final SubTypeValidator IconCompatParcelizer(long j) {
        long j2 = this.MediaBrowserCompatCustomActionResultReceiver;
        return RemoteActionCompatParcelizer(j, j2 != -1 ? j2 - j : -1L);
    }

    private SubTypeValidator RemoteActionCompatParcelizer(long j, long j2) {
        return (j == 0 && this.MediaBrowserCompatCustomActionResultReceiver == j2) ? this : new SubTypeValidator(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer + j, j2, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.read);
    }

    public final SubTypeValidator AudioAttributesCompatParcelizer(Map<String, String> map) {
        HashMap map2 = new HashMap(this.MediaBrowserCompatItemReceiver);
        map2.putAll(map);
        return new SubTypeValidator(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, map2, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(write());
        sb.append(" ");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", ");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", ");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", ");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("]");
        return sb.toString();
    }
}
