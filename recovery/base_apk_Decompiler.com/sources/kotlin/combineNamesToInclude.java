package kotlin;

import com.google.android.exoplayer2.C;
import java.math.RoundingMode;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
final class combineNamesToInclude implements contents {
    private final AsDeductionTypeDeserializer AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final AsDeductionTypeDeserializer RemoteActionCompatParcelizer;
    private final long read;
    private long write;

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public combineNamesToInclude(long j, long j2, long j3) {
        this.write = j;
        this.read = j3;
        AsDeductionTypeDeserializer asDeductionTypeDeserializer = new AsDeductionTypeDeserializer();
        this.AudioAttributesCompatParcelizer = asDeductionTypeDeserializer;
        AsDeductionTypeDeserializer asDeductionTypeDeserializer2 = new AsDeductionTypeDeserializer();
        this.RemoteActionCompatParcelizer = asDeductionTypeDeserializer2;
        asDeductionTypeDeserializer.AudioAttributesCompatParcelizer(0L);
        asDeductionTypeDeserializer2.AudioAttributesCompatParcelizer(j2);
        int i = C.RATE_UNSET_INT;
        if (j != C.TIME_UNSET) {
            long jRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(j2 - j3, 8L, j, RoundingMode.HALF_UP);
            if (jRemoteActionCompatParcelizer > 0 && jRemoteActionCompatParcelizer <= 2147483647L) {
                i = (int) jRemoteActionCompatParcelizer;
            }
            this.IconCompatParcelizer = i;
            return;
        }
        this.IconCompatParcelizer = C.RATE_UNSET_INT;
    }

    @Override // kotlin.contents
    public final long RemoteActionCompatParcelizer(long j) {
        return this.AudioAttributesCompatParcelizer.read(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, j));
    }

    @Override // kotlin.contents
    public final long AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.write;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        int iAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, j);
        isLocalType islocaltype = new isLocalType(this.AudioAttributesCompatParcelizer.read(iAudioAttributesCompatParcelizer), this.RemoteActionCompatParcelizer.read(iAudioAttributesCompatParcelizer));
        if (islocaltype.IconCompatParcelizer == j || iAudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer.read() - 1) {
            return new isCollectionMapOrArray.read(islocaltype);
        }
        int i = iAudioAttributesCompatParcelizer + 1;
        return new isCollectionMapOrArray.read(islocaltype, new isLocalType(this.AudioAttributesCompatParcelizer.read(i), this.RemoteActionCompatParcelizer.read(i)));
    }

    @Override // kotlin.contents
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(long j, long j2) {
        if (read(j)) {
            return;
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j2);
    }

    public final boolean read(long j) {
        AsDeductionTypeDeserializer asDeductionTypeDeserializer = this.AudioAttributesCompatParcelizer;
        return j - asDeductionTypeDeserializer.read(asDeductionTypeDeserializer.read() - 1) < 100000;
    }

    final void AudioAttributesCompatParcelizer(long j) {
        this.write = j;
    }
}
