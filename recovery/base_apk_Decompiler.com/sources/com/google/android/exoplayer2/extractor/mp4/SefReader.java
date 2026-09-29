package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.parseXyz;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class SefReader {
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final List<DataReference> dataReferences = new ArrayList();
    private int readerState = 0;
    private int tailLength;
    private static final parseXyz COLON_SPLITTER = parseXyz.read(':');
    private static final parseXyz ASTERISK_SPLITTER = parseXyz.read('*');

    public final void reset() {
        this.dataReferences.clear();
        this.readerState = 0;
    }

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder, List<Metadata.Entry> list) throws IOException {
        int i = this.readerState;
        long j = 0;
        if (i == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            positionHolder.position = j;
            this.readerState = 1;
        } else if (i == 1) {
            checkForSefData(extractorInput, positionHolder);
        } else if (i == 2) {
            readSdrs(extractorInput, positionHolder);
        } else if (i == 3) {
            readSefData(extractorInput, list);
            positionHolder.position = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void checkForSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.tailLength = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != SAMSUNG_TAIL_SIGNATURE) {
            positionHolder.position = 0L;
        } else {
            positionHolder.position = extractorInput.getPosition() - ((long) (this.tailLength - 12));
            this.readerState = 2;
        }
    }

    private void readSdrs(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int i = this.tailLength - 20;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            parsableByteArray.skipBytes(2);
            short littleEndianShort = parsableByteArray.readLittleEndianShort();
            if (littleEndianShort == TYPE_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_BGM || littleEndianShort == TYPE_SUPER_SLOW_MOTION_EDIT_DATA || littleEndianShort == TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                long j = this.tailLength;
                this.dataReferences.add(new DataReference(littleEndianShort, (length - j) - parsableByteArray.readLittleEndianInt(), parsableByteArray.readLittleEndianInt()));
            } else {
                parsableByteArray.skipBytes(8);
            }
        }
        if (this.dataReferences.isEmpty()) {
            positionHolder.position = 0L;
        } else {
            this.readerState = 3;
            positionHolder.position = this.dataReferences.get(0).startOffset;
        }
    }

    private void readSefData(ExtractorInput extractorInput, List<Metadata.Entry> list) throws IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - ((long) this.tailLength));
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i = 0; i < this.dataReferences.size(); i++) {
            DataReference dataReference = this.dataReferences.get(i);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int iNameToDataType = nameToDataType(parsableByteArray.readString(littleEndianInt));
            int i2 = dataReference.size;
            if (iNameToDataType == TYPE_SLOW_MOTION_DATA) {
                list.add(readSlowMotionData(parsableByteArray, i2 - (littleEndianInt + 8)));
            } else if (iNameToDataType != TYPE_SUPER_SLOW_MOTION_DATA && iNameToDataType != TYPE_SUPER_SLOW_MOTION_BGM && iNameToDataType != TYPE_SUPER_SLOW_MOTION_EDIT_DATA && iNameToDataType != TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData readSlowMotionData(ParsableByteArray parsableByteArray, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listIconCompatParcelizer = ASTERISK_SPLITTER.IconCompatParcelizer(parsableByteArray.readString(i));
        for (int i2 = 0; i2 < listIconCompatParcelizer.size(); i2++) {
            List<String> listIconCompatParcelizer2 = COLON_SPLITTER.IconCompatParcelizer(listIconCompatParcelizer.get(i2));
            if (listIconCompatParcelizer2.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listIconCompatParcelizer2.get(0)), Long.parseLong(listIconCompatParcelizer2.get(1)), 1 << (Integer.parseInt(listIconCompatParcelizer2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedContainer(null, e);
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
    private static int nameToDataType(java.lang.String r5) throws com.google.android.exoplayer2.ParserException {
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
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r5, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.SefReader.nameToDataType(java.lang.String):int");
    }

    static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i, long j, int i2) {
            this.dataType = i;
            this.startOffset = j;
            this.size = i2;
        }
    }
}
