package kotlin;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class findEnum extends _isIntType {
    private MinimalClassNameIdResolver AudioAttributesCompatParcelizer;
    private final AsPropertyTypeDeserializer write = new AsPropertyTypeDeserializer();
    private final AsExternalTypeSerializer read = new AsExternalTypeSerializer();

    @Override // kotlin._isIntType
    public final androidx.media3.common.Metadata AudioAttributesCompatParcelizer(_enumDefault _enumdefault, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        if (this.AudioAttributesCompatParcelizer == null || _enumdefault.MediaBrowserCompatCustomActionResultReceiver != this.AudioAttributesCompatParcelizer.write()) {
            MinimalClassNameIdResolver minimalClassNameIdResolver = new MinimalClassNameIdResolver(_enumdefault.RemoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer = minimalClassNameIdResolver;
            minimalClassNameIdResolver.RemoteActionCompatParcelizer(_enumdefault.RemoteActionCompatParcelizer - _enumdefault.MediaBrowserCompatCustomActionResultReceiver);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.write.IconCompatParcelizer(bArrArray, iLimit);
        this.read.read(bArrArray, iLimit);
        this.read.write(39);
        long jIconCompatParcelizer = (((long) this.read.IconCompatParcelizer(1)) << 32) | ((long) this.read.IconCompatParcelizer(32));
        this.read.write(20);
        int iIconCompatParcelizer = this.read.IconCompatParcelizer(12);
        int iIconCompatParcelizer2 = this.read.IconCompatParcelizer(8);
        this.write.AudioAttributesImplBaseParcelizer(14);
        if (iIconCompatParcelizer2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iIconCompatParcelizer2 == 255) {
            spliceNullCommand = PrivateCommand.read(this.write, iIconCompatParcelizer, jIconCompatParcelizer);
        } else if (iIconCompatParcelizer2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.AudioAttributesCompatParcelizer(this.write);
        } else if (iIconCompatParcelizer2 == 5) {
            spliceNullCommand = SpliceInsertCommand.IconCompatParcelizer(this.write, jIconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        } else {
            spliceNullCommand = iIconCompatParcelizer2 != 6 ? null : TimeSignalCommand.IconCompatParcelizer(this.write, jIconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
        return spliceNullCommand == null ? new androidx.media3.common.Metadata(new Metadata.Entry[0]) : new androidx.media3.common.Metadata(spliceNullCommand);
    }
}
