package kotlin;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class _reset {
    private static final parseXyz read = parseXyz.read(':');
    private static final parseXyz write = parseXyz.read('*');
    private int IconCompatParcelizer;
    private final List<write> AudioAttributesCompatParcelizer = new ArrayList();
    private int RemoteActionCompatParcelizer = 0;

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer = 0;
    }

    public final int AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl, List<Metadata.Entry> list) throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        long j = 0;
        if (i == 0) {
            long j2 = closeonfailandthrowasioe.read();
            if (j2 != -1 && j2 >= 8) {
                j = j2 - 8;
            }
            isjacksonstdimpl.AudioAttributesCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = 1;
        } else if (i == 1) {
            write(closeonfailandthrowasioe, isjacksonstdimpl);
        } else if (i == 2) {
            read(closeonfailandthrowasioe, isjacksonstdimpl);
        } else if (i == 3) {
            read(closeonfailandthrowasioe, list);
            isjacksonstdimpl.AudioAttributesCompatParcelizer = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(8);
        closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 8);
        this.IconCompatParcelizer = asPropertyTypeDeserializer.MediaMetadataCompat() + 8;
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() != 1397048916) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = 0L;
        } else {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer() - ((long) (this.IconCompatParcelizer - 12));
            this.RemoteActionCompatParcelizer = 2;
        }
    }

    private void read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        long j = closeonfailandthrowasioe.read();
        int i = this.IconCompatParcelizer - 20;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(i);
        closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
            short sMediaBrowserCompatSearchResultReceiver = asPropertyTypeDeserializer.MediaBrowserCompatSearchResultReceiver();
            if (sMediaBrowserCompatSearchResultReceiver == 2192 || sMediaBrowserCompatSearchResultReceiver == 2816 || sMediaBrowserCompatSearchResultReceiver == 2817 || sMediaBrowserCompatSearchResultReceiver == 2819 || sMediaBrowserCompatSearchResultReceiver == 2820) {
                long j2 = this.IconCompatParcelizer;
                this.AudioAttributesCompatParcelizer.add(new write(sMediaBrowserCompatSearchResultReceiver, (j - j2) - asPropertyTypeDeserializer.MediaMetadataCompat(), asPropertyTypeDeserializer.MediaMetadataCompat()));
            } else {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
            }
        }
        if (this.AudioAttributesCompatParcelizer.isEmpty()) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = 0L;
        } else {
            this.RemoteActionCompatParcelizer = 3;
            isjacksonstdimpl.AudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.get(0).RemoteActionCompatParcelizer;
        }
    }

    private void read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, List<Metadata.Entry> list) throws IOException {
        long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
        int iIconCompatParcelizer = (int) ((closeonfailandthrowasioe.read() - closeonfailandthrowasioe.IconCompatParcelizer()) - ((long) this.IconCompatParcelizer));
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(iIconCompatParcelizer);
        closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, iIconCompatParcelizer);
        for (int i = 0; i < this.AudioAttributesCompatParcelizer.size(); i++) {
            write writeVar = this.AudioAttributesCompatParcelizer.get(i);
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver((int) (writeVar.RemoteActionCompatParcelizer - jIconCompatParcelizer));
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
            int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer.read(iMediaMetadataCompat));
            int i2 = writeVar.AudioAttributesCompatParcelizer;
            if (iRemoteActionCompatParcelizer == 2192) {
                list.add(RemoteActionCompatParcelizer(asPropertyTypeDeserializer, i2 - (iMediaMetadataCompat + 8)));
            } else if (iRemoteActionCompatParcelizer != 2816 && iRemoteActionCompatParcelizer != 2817 && iRemoteActionCompatParcelizer != 2819 && iRemoteActionCompatParcelizer != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) throws SchemaAware {
        ArrayList arrayList = new ArrayList();
        List<String> listIconCompatParcelizer = write.IconCompatParcelizer(asPropertyTypeDeserializer.read(i));
        for (int i2 = 0; i2 < listIconCompatParcelizer.size(); i2++) {
            List<String> listIconCompatParcelizer2 = read.IconCompatParcelizer(listIconCompatParcelizer.get(i2));
            if (listIconCompatParcelizer2.size() != 3) {
                throw SchemaAware.RemoteActionCompatParcelizer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listIconCompatParcelizer2.get(0)), Long.parseLong(listIconCompatParcelizer2.get(1)), 1 << (Integer.parseInt(listIconCompatParcelizer2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw SchemaAware.RemoteActionCompatParcelizer(null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int RemoteActionCompatParcelizer(java.lang.String r5) throws kotlin.SchemaAware {
        /*
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1711564334: goto L37;
                case -1332107749: goto L2d;
                case -1251387154: goto L23;
                case -830665521: goto L19;
                case 1760745220: goto Lf;
                default: goto Le;
            }
        Le:
            goto L41
        Lf:
            java.lang.String r0 = "Super_SlowMotion_BGM"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L41
            r5 = r1
            goto L42
        L19:
            java.lang.String r0 = "Super_SlowMotion_Deflickering_On"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L41
            r5 = r2
            goto L42
        L23:
            java.lang.String r0 = "Super_SlowMotion_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L41
            r5 = r3
            goto L42
        L2d:
            java.lang.String r0 = "Super_SlowMotion_Edit_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L41
            r5 = r4
            goto L42
        L37:
            java.lang.String r0 = "SlowMotion_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L41
            r5 = 0
            goto L42
        L41:
            r5 = -1
        L42:
            if (r5 == 0) goto L60
            if (r5 == r4) goto L5d
            if (r5 == r3) goto L5a
            if (r5 == r2) goto L57
            if (r5 != r1) goto L4f
            r5 = 2817(0xb01, float:3.947E-42)
            return r5
        L4f:
            java.lang.String r5 = "Invalid SEF name"
            r0 = 0
            o.SchemaAware r5 = kotlin.SchemaAware.RemoteActionCompatParcelizer(r5, r0)
            throw r5
        L57:
            r5 = 2820(0xb04, float:3.952E-42)
            return r5
        L5a:
            r5 = 2816(0xb00, float:3.946E-42)
            return r5
        L5d:
            r5 = 2819(0xb03, float:3.95E-42)
            return r5
        L60:
            r5 = 2192(0x890, float:3.072E-42)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._reset.RemoteActionCompatParcelizer(java.lang.String):int");
    }

    static final class write {
        public final int AudioAttributesCompatParcelizer;
        public final long RemoteActionCompatParcelizer;
        public final int write;

        public write(int i, long j, int i2) {
            this.write = i;
            this.RemoteActionCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = i2;
        }
    }
}
