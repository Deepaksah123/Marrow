package kotlin;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class DownloadHelper2 implements Closeable, Flushable {
    private static final String[] IconCompatParcelizer;
    private boolean AudioAttributesCompatParcelizer;
    private final Writer AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private String write;
    private static final Pattern read = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] RemoteActionCompatParcelizer = new String[128];
    private int[] MediaDescriptionCompat = new int[32];
    private int MediaBrowserCompatSearchResultReceiver = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            RemoteActionCompatParcelizer[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = RemoteActionCompatParcelizer;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        IconCompatParcelizer = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public DownloadHelper2(Writer writer) {
        write(6);
        this.MediaBrowserCompatCustomActionResultReceiver = ":";
        this.AudioAttributesImplBaseParcelizer = true;
        this.AudioAttributesImplApi21Parcelizer = (Writer) Objects.requireNonNull(writer, "out == null");
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void read(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public DownloadHelper2 write() throws IOException {
        MediaBrowserCompatSearchResultReceiver();
        return IconCompatParcelizer(1, '[');
    }

    public DownloadHelper2 AudioAttributesCompatParcelizer() throws IOException {
        return read(1, 2, ']');
    }

    public DownloadHelper2 RemoteActionCompatParcelizer() throws IOException {
        MediaBrowserCompatSearchResultReceiver();
        return IconCompatParcelizer(3, '{');
    }

    public DownloadHelper2 IconCompatParcelizer() throws IOException {
        return read(3, 5, '}');
    }

    private DownloadHelper2 IconCompatParcelizer(int i, char c) throws IOException {
        MediaBrowserCompatItemReceiver();
        write(i);
        this.AudioAttributesImplApi21Parcelizer.write(c);
        return this;
    }

    private DownloadHelper2 read(int i, int i2, char c) throws IOException {
        int iMediaDescriptionCompat = MediaDescriptionCompat();
        if (iMediaDescriptionCompat != i2 && iMediaDescriptionCompat != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.write != null) {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.write);
            throw new IllegalStateException(sb.toString());
        }
        this.MediaBrowserCompatSearchResultReceiver--;
        if (iMediaDescriptionCompat == i2) {
            MediaMetadataCompat();
        }
        this.AudioAttributesImplApi21Parcelizer.write(c);
        return this;
    }

    private void write(int i) {
        int i2 = this.MediaBrowserCompatSearchResultReceiver;
        int[] iArr = this.MediaDescriptionCompat;
        if (i2 == iArr.length) {
            this.MediaDescriptionCompat = Arrays.copyOf(iArr, i2 << 1);
        }
        int[] iArr2 = this.MediaDescriptionCompat;
        int i3 = this.MediaBrowserCompatSearchResultReceiver;
        this.MediaBrowserCompatSearchResultReceiver = i3 + 1;
        iArr2[i3] = i;
    }

    private int MediaDescriptionCompat() {
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.MediaDescriptionCompat[i - 1];
    }

    private void RemoteActionCompatParcelizer(int i) {
        this.MediaDescriptionCompat[this.MediaBrowserCompatSearchResultReceiver - 1] = i;
    }

    public DownloadHelper2 read(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.write != null) {
            throw new IllegalStateException();
        }
        if (this.MediaBrowserCompatSearchResultReceiver == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.write = str;
        return this;
    }

    private void MediaBrowserCompatSearchResultReceiver() throws IOException {
        if (this.write != null) {
            read();
            write(this.write);
            this.write = null;
        }
    }

    public DownloadHelper2 AudioAttributesCompatParcelizer(String str) throws IOException {
        if (str == null) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        MediaBrowserCompatSearchResultReceiver();
        MediaBrowserCompatItemReceiver();
        write(str);
        return this;
    }

    public DownloadHelper2 MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        if (this.write != null) {
            if (this.AudioAttributesImplBaseParcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            } else {
                this.write = null;
                return this;
            }
        }
        MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi21Parcelizer.write("null");
        return this;
    }

    public DownloadHelper2 write(boolean z) throws IOException {
        MediaBrowserCompatSearchResultReceiver();
        MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi21Parcelizer.write(z ? "true" : "false");
        return this;
    }

    public DownloadHelper2 AudioAttributesCompatParcelizer(Boolean bool) throws IOException {
        if (bool == null) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        MediaBrowserCompatSearchResultReceiver();
        MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi21Parcelizer.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public DownloadHelper2 IconCompatParcelizer(double d) throws IOException {
        MediaBrowserCompatSearchResultReceiver();
        if (!this.AudioAttributesImplApi26Parcelizer && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(d)));
        }
        MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi21Parcelizer.append((CharSequence) Double.toString(d));
        return this;
    }

    public DownloadHelper2 write(long j) throws IOException {
        MediaBrowserCompatSearchResultReceiver();
        MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi21Parcelizer.write(Long.toString(j));
        return this;
    }

    private static boolean RemoteActionCompatParcelizer(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public DownloadHelper2 AudioAttributesCompatParcelizer(Number number) throws IOException {
        if (number == null) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        MediaBrowserCompatSearchResultReceiver();
        String string = number.toString();
        if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
            if (!this.AudioAttributesImplApi26Parcelizer) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(string)));
            }
        } else {
            Class<?> cls = number.getClass();
            if (!RemoteActionCompatParcelizer((Class<? extends Number>) cls) && !read.matcher(string).matches()) {
                StringBuilder sb = new StringBuilder("String created by ");
                sb.append(cls);
                sb.append(" is not a valid JSON number: ");
                sb.append(string);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplApi21Parcelizer.append((CharSequence) string);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.MediaBrowserCompatSearchResultReceiver == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.AudioAttributesImplApi21Parcelizer.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.AudioAttributesImplApi21Parcelizer.close();
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i > 1 || (i == 1 && this.MediaDescriptionCompat[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.MediaBrowserCompatSearchResultReceiver = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L7
            java.lang.String[] r0 = kotlin.DownloadHelper2.IconCompatParcelizer
            goto L9
        L7:
            java.lang.String[] r0 = kotlin.DownloadHelper2.RemoteActionCompatParcelizer
        L9:
            java.io.Writer r1 = r8.AudioAttributesImplApi21Parcelizer
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.AudioAttributesImplApi21Parcelizer
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.AudioAttributesImplApi21Parcelizer
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.AudioAttributesImplApi21Parcelizer
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r8 = r8.AudioAttributesImplApi21Parcelizer
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DownloadHelper2.write(java.lang.String):void");
    }

    private void MediaMetadataCompat() throws IOException {
        if (this.MediaBrowserCompatItemReceiver != null) {
            this.AudioAttributesImplApi21Parcelizer.write(10);
            int i = this.MediaBrowserCompatSearchResultReceiver;
            for (int i2 = 1; i2 < i; i2++) {
                this.AudioAttributesImplApi21Parcelizer.write(this.MediaBrowserCompatItemReceiver);
            }
        }
    }

    private void read() throws IOException {
        int iMediaDescriptionCompat = MediaDescriptionCompat();
        if (iMediaDescriptionCompat == 5) {
            this.AudioAttributesImplApi21Parcelizer.write(44);
        } else if (iMediaDescriptionCompat != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        MediaMetadataCompat();
        RemoteActionCompatParcelizer(4);
    }

    private void MediaBrowserCompatItemReceiver() throws IOException {
        int iMediaDescriptionCompat = MediaDescriptionCompat();
        if (iMediaDescriptionCompat == 1) {
            RemoteActionCompatParcelizer(2);
            MediaMetadataCompat();
            return;
        }
        if (iMediaDescriptionCompat == 2) {
            this.AudioAttributesImplApi21Parcelizer.append(',');
            MediaMetadataCompat();
        } else {
            if (iMediaDescriptionCompat != 4) {
                if (iMediaDescriptionCompat != 6) {
                    if (iMediaDescriptionCompat == 7) {
                        if (!this.AudioAttributesImplApi26Parcelizer) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                RemoteActionCompatParcelizer(7);
                return;
            }
            this.AudioAttributesImplApi21Parcelizer.append((CharSequence) this.MediaBrowserCompatCustomActionResultReceiver);
            RemoteActionCompatParcelizer(5);
        }
    }
}
