package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin._addRawSuperTypes;

/* JADX INFO: loaded from: classes2.dex */
final class linkFirst extends _addRawSuperTypes {
    public linkFirst(MinimalClassNameIdResolver minimalClassNameIdResolver, long j, long j2) {
        super(new _addRawSuperTypes.read(), new AudioAttributesCompatParcelizer(minimalClassNameIdResolver, (byte) 0), j, j + 1, 0L, j2, 188L, 1000);
    }

    static final class AudioAttributesCompatParcelizer implements _addRawSuperTypes.AudioAttributesImplApi26Parcelizer {
        private final MinimalClassNameIdResolver AudioAttributesCompatParcelizer;
        private final AsPropertyTypeDeserializer write;

        /* synthetic */ AudioAttributesCompatParcelizer(MinimalClassNameIdResolver minimalClassNameIdResolver, byte b) {
            this(minimalClassNameIdResolver);
        }

        private AudioAttributesCompatParcelizer(MinimalClassNameIdResolver minimalClassNameIdResolver) {
            this.AudioAttributesCompatParcelizer = minimalClassNameIdResolver;
            this.write = new AsPropertyTypeDeserializer();
        }

        @Override // o._addRawSuperTypes.AudioAttributesImplApi26Parcelizer
        public final _addRawSuperTypes.RemoteActionCompatParcelizer IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) throws IOException {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            int iMin = (int) Math.min(20000L, closeonfailandthrowasioe.read() - jIconCompatParcelizer);
            this.write.write(iMin);
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.write.RemoteActionCompatParcelizer(), 0, iMin);
            return IconCompatParcelizer(this.write, j, jIconCompatParcelizer);
        }

        @Override // o._addRawSuperTypes.AudioAttributesImplApi26Parcelizer
        public final void write() {
            this.write.AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer);
        }

        private _addRawSuperTypes.RemoteActionCompatParcelizer IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, long j2) {
            int iWrite = -1;
            int iWrite2 = -1;
            long j3 = -9223372036854775807L;
            while (asPropertyTypeDeserializer.IconCompatParcelizer() >= 4) {
                if (linkFirst.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write()) != 442) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
                } else {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
                    long jIconCompatParcelizer = peek.IconCompatParcelizer(asPropertyTypeDeserializer);
                    if (jIconCompatParcelizer != C.TIME_UNSET) {
                        long jWrite = this.AudioAttributesCompatParcelizer.write(jIconCompatParcelizer);
                        if (jWrite > j) {
                            if (j3 == C.TIME_UNSET) {
                                return _addRawSuperTypes.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jWrite, j2);
                            }
                            return _addRawSuperTypes.RemoteActionCompatParcelizer.write(j2 + ((long) iWrite2));
                        }
                        if (100000 + jWrite > j) {
                            return _addRawSuperTypes.RemoteActionCompatParcelizer.write(j2 + ((long) asPropertyTypeDeserializer.write()));
                        }
                        iWrite2 = asPropertyTypeDeserializer.write();
                        j3 = jWrite;
                    }
                    RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
                    iWrite = asPropertyTypeDeserializer.write();
                }
            }
            if (j3 != C.TIME_UNSET) {
                return _addRawSuperTypes.RemoteActionCompatParcelizer.write(j3, j2 + ((long) iWrite));
            }
            return _addRawSuperTypes.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        private static void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            int iIconCompatParcelizer;
            int i = asPropertyTypeDeserializer.read();
            if (asPropertyTypeDeserializer.IconCompatParcelizer() < 10) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
                return;
            }
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(9);
            int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId() & 7;
            if (asPropertyTypeDeserializer.IconCompatParcelizer() < iOnPlayFromMediaId) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
                return;
            }
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iOnPlayFromMediaId);
            if (asPropertyTypeDeserializer.IconCompatParcelizer() >= 4) {
                if (linkFirst.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write()) == 443) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
                    int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
                    if (asPropertyTypeDeserializer.IconCompatParcelizer() < iOnPrepare) {
                        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
                        return;
                    }
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iOnPrepare);
                }
                while (asPropertyTypeDeserializer.IconCompatParcelizer() >= 4 && (iIconCompatParcelizer = linkFirst.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write())) != 442 && iIconCompatParcelizer != 441 && (iIconCompatParcelizer >>> 8) == 1) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
                    if (asPropertyTypeDeserializer.IconCompatParcelizer() < 2) {
                        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
                        return;
                    }
                    asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(Math.min(asPropertyTypeDeserializer.read(), asPropertyTypeDeserializer.write() + asPropertyTypeDeserializer.onPrepare()));
                }
                return;
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
