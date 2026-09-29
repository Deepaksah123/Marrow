package kotlin;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Format1 implements Closeable {
    private static final String[] MediaBrowserCompatItemReceiver = new String[128];
    boolean AudioAttributesCompatParcelizer;
    int AudioAttributesImplBaseParcelizer;
    boolean read;
    int[] RemoteActionCompatParcelizer = new int[32];
    String[] IconCompatParcelizer = new String[32];
    int[] write = new int[32];

    public enum IconCompatParcelizer {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract int AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException;

    public abstract void AudioAttributesCompatParcelizer() throws IOException;

    public abstract double AudioAttributesImplApi21Parcelizer() throws IOException;

    public abstract String AudioAttributesImplApi26Parcelizer() throws IOException;

    public abstract int AudioAttributesImplBaseParcelizer() throws IOException;

    public abstract void IconCompatParcelizer() throws IOException;

    public abstract boolean MediaBrowserCompatCustomActionResultReceiver() throws IOException;

    public abstract boolean MediaBrowserCompatItemReceiver() throws IOException;

    public abstract IconCompatParcelizer MediaBrowserCompatMediaItem() throws IOException;

    public abstract String MediaBrowserCompatSearchResultReceiver() throws IOException;

    public abstract void MediaDescriptionCompat() throws IOException;

    public abstract void RatingCompat() throws IOException;

    public abstract void read() throws IOException;

    public abstract void write() throws IOException;

    static {
        for (int i = 0; i <= 31; i++) {
            MediaBrowserCompatItemReceiver[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = MediaBrowserCompatItemReceiver;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static Format1 read(LessonCompletedDialog lessonCompletedDialog) {
        return new access2800(lessonCompletedDialog);
    }

    Format1() {
    }

    final void RemoteActionCompatParcelizer(int i) {
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                StringBuilder sb = new StringBuilder("Nesting too deep at ");
                sb.append(RemoteActionCompatParcelizer());
                throw new FormatBuilder(sb.toString());
            }
            this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, iArr.length << 1);
            String[] strArr = this.IconCompatParcelizer;
            this.IconCompatParcelizer = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            int[] iArr2 = this.write;
            this.write = Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.RemoteActionCompatParcelizer;
        int i3 = this.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplBaseParcelizer = i3 + 1;
        iArr3[i3] = i;
    }

    final access2700 AudioAttributesCompatParcelizer(String str) throws access2700 {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(RemoteActionCompatParcelizer());
        throw new access2700(sb.toString());
    }

    public final String RemoteActionCompatParcelizer() {
        return access2900.write(this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write);
    }

    public static final class AudioAttributesCompatParcelizer {
        final Options read;
        final String[] write;

        private AudioAttributesCompatParcelizer(String[] strArr, Options options) {
            this.write = strArr;
            this.read = options;
        }

        public static AudioAttributesCompatParcelizer write(String... strArr) {
            try {
                getRelatedModuleAdapter[] getrelatedmoduleadapterArr = new getRelatedModuleAdapter[strArr.length];
                resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                for (int i = 0; i < strArr.length; i++) {
                    Format1.read(resetcurrentselectedposition, strArr[i]);
                    resetcurrentselectedposition.MediaMetadataCompat();
                    getrelatedmoduleadapterArr[i] = resetcurrentselectedposition.MediaDescriptionCompat();
                }
                return new AudioAttributesCompatParcelizer((String[]) strArr.clone(), Options.IconCompatParcelizer(getrelatedmoduleadapterArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void read(kotlin.LessonCompletedDialogonViewCreatedllm1 r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = kotlin.Format1.MediaBrowserCompatItemReceiver
            r1 = 34
            r7.read(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.AudioAttributesCompatParcelizer(r8, r4, r3)
        L2e:
            r7.read(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.AudioAttributesCompatParcelizer(r8, r4, r2)
        L3b:
            r7.read(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Format1.read(o.LessonCompletedDialogonViewCreatedllm1, java.lang.String):void");
    }
}
