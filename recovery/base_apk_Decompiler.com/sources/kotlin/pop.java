package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import kotlin._addRawSuperTypes;

/* JADX INFO: loaded from: classes2.dex */
final class pop extends _addRawSuperTypes {
    public pop(MinimalClassNameIdResolver minimalClassNameIdResolver, long j, long j2, int i, int i2) {
        super(new _addRawSuperTypes.read(), new read(i, minimalClassNameIdResolver, i2), j, j + 1, 0L, j2, 188L, 940);
    }

    static final class read implements _addRawSuperTypes.AudioAttributesImplApi26Parcelizer {
        private final MinimalClassNameIdResolver AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final AsPropertyTypeDeserializer RemoteActionCompatParcelizer = new AsPropertyTypeDeserializer();
        private final int read;

        public read(int i, MinimalClassNameIdResolver minimalClassNameIdResolver, int i2) {
            this.read = i;
            this.AudioAttributesCompatParcelizer = minimalClassNameIdResolver;
            this.IconCompatParcelizer = i2;
        }

        @Override // o._addRawSuperTypes.AudioAttributesImplApi26Parcelizer
        public final _addRawSuperTypes.RemoteActionCompatParcelizer IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) throws IOException {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            int iMin = (int) Math.min(this.IconCompatParcelizer, closeonfailandthrowasioe.read() - jIconCompatParcelizer);
            this.RemoteActionCompatParcelizer.write(iMin);
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), 0, iMin);
            return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, j, jIconCompatParcelizer);
        }

        private _addRawSuperTypes.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, long j2) {
            int iIconCompatParcelizer;
            int iIconCompatParcelizer2;
            int i = asPropertyTypeDeserializer.read();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (asPropertyTypeDeserializer.IconCompatParcelizer() >= 188 && (iIconCompatParcelizer2 = (iIconCompatParcelizer = unlinkFirst.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write(), i)) + TsExtractor.TS_PACKET_SIZE) <= i) {
                long j6 = unlinkFirst.read(asPropertyTypeDeserializer, iIconCompatParcelizer, this.read);
                if (j6 != C.TIME_UNSET) {
                    long jWrite = this.AudioAttributesCompatParcelizer.write(j6);
                    if (jWrite > j) {
                        if (j5 == C.TIME_UNSET) {
                            return _addRawSuperTypes.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jWrite, j2);
                        }
                        return _addRawSuperTypes.RemoteActionCompatParcelizer.write(j2 + j4);
                    }
                    if (100000 + jWrite > j) {
                        return _addRawSuperTypes.RemoteActionCompatParcelizer.write(((long) iIconCompatParcelizer) + j2);
                    }
                    j4 = iIconCompatParcelizer;
                    j5 = jWrite;
                }
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer2);
                j3 = iIconCompatParcelizer2;
            }
            if (j5 != C.TIME_UNSET) {
                return _addRawSuperTypes.RemoteActionCompatParcelizer.write(j5, j2 + j3);
            }
            return _addRawSuperTypes.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        @Override // o._addRawSuperTypes.AudioAttributesImplApi26Parcelizer
        public final void write() {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer);
        }
    }
}
