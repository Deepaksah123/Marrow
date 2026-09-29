package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.ParsableByteArray;
import kotlin.getCurrentSampleFlags;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class ListChunk implements AviChunk {
    public final initExtraTracks<AviChunk> children;
    private final int type;

    public static ListChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
        AviChunk aviChunkCreateBox;
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        int iLimit = parsableByteArray.limit();
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            if (littleEndianInt == 1414744396) {
                aviChunkCreateBox = parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray);
            } else {
                aviChunkCreateBox = createBox(littleEndianInt, trackType, parsableByteArray);
            }
            if (aviChunkCreateBox != null) {
                if (aviChunkCreateBox.getType() == 1752331379) {
                    trackType = ((AviStreamHeaderChunk) aviChunkCreateBox).getTrackType();
                }
                iconCompatParcelizer.read(aviChunkCreateBox);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new ListChunk(i, iconCompatParcelizer.IconCompatParcelizer());
    }

    private ListChunk(int i, initExtraTracks<AviChunk> initextratracks) {
        this.type = i;
        this.children = initextratracks;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public final int getType() {
        return this.type;
    }

    public final <T extends AviChunk> T getChild(Class<T> cls) {
        getCurrentSampleFlags<AviChunk> it = this.children.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    private static AviChunk createBox(int i, int i2, ParsableByteArray parsableByteArray) {
        switch (i) {
            case AviExtractor.FOURCC_strf /* 1718776947 */:
                return StreamFormatChunk.parseFrom(i2, parsableByteArray);
            case AviExtractor.FOURCC_avih /* 1751742049 */:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strh /* 1752331379 */:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strn /* 1852994675 */:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }
}
