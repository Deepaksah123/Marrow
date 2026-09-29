package com.google.android.exoplayer2.metadata.dvbsi;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableBitArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.parseMdtaFromMeta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    public static final int APPLICATION_INFORMATION_TABLE_ID = 116;
    private static final int DESCRIPTOR_SIMPLE_APPLICATION_LOCATION = 21;
    private static final int DESCRIPTOR_TRANSPORT_PROTOCOL = 2;
    private static final int TRANSPORT_PROTOCOL_HTTP = 3;

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return parseAit(new ParsableBitArray(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static Metadata parseAit(ParsableBitArray parsableBitArray) {
        parsableBitArray.skipBits(12);
        int bits = parsableBitArray.readBits(12);
        int bytePosition = parsableBitArray.getBytePosition();
        parsableBitArray.skipBits(44);
        parsableBitArray.skipBytes(parsableBitArray.readBits(12));
        parsableBitArray.skipBits(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String bytesAsString = null;
            if (parsableBitArray.getBytePosition() >= (bytePosition + bits) - 4) {
                break;
            }
            parsableBitArray.skipBits(48);
            int bits2 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(4);
            int bytePosition2 = parsableBitArray.getBytePosition() + parsableBitArray.readBits(12);
            String bytesAsString2 = null;
            while (parsableBitArray.getBytePosition() < bytePosition2) {
                int bits3 = parsableBitArray.readBits(8);
                int bits4 = parsableBitArray.readBits(8);
                int bytePosition3 = parsableBitArray.getBytePosition() + bits4;
                if (bits3 == 2) {
                    int bits5 = parsableBitArray.readBits(16);
                    parsableBitArray.skipBits(8);
                    if (bits5 == 3) {
                        while (parsableBitArray.getBytePosition() < bytePosition3) {
                            bytesAsString = parsableBitArray.readBytesAsString(parsableBitArray.readBits(8), parseMdtaFromMeta.RemoteActionCompatParcelizer);
                            int bits6 = parsableBitArray.readBits(8);
                            for (int i = 0; i < bits6; i++) {
                                parsableBitArray.skipBytes(parsableBitArray.readBits(8));
                            }
                        }
                    }
                } else if (bits3 == 21) {
                    bytesAsString2 = parsableBitArray.readBytesAsString(bits4, parseMdtaFromMeta.RemoteActionCompatParcelizer);
                }
                parsableBitArray.setPosition(bytePosition3 << 3);
            }
            parsableBitArray.setPosition(bytePosition2 << 3);
            if (bytesAsString != null && bytesAsString2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(bytesAsString);
                sb.append(bytesAsString2);
                arrayList.add(new AppInfoTable(bits2, sb.toString()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
