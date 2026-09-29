package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0005\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0013"}, d2 = {"Lo/getFinalData;", "", "<init>", "()V", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "IconCompatParcelizer", "()I", "read", "p1", "write", "(II)I", "", "p2", "([BII)[B", "RemoteActionCompatParcelizer", "([B)[B", "(I)[B"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getFinalData {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final getFinalData read = saveMagicModuleModel.write.RemoteActionCompatParcelizer();

    public abstract int AudioAttributesCompatParcelizer(int p0);

    public int IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(32);
    }

    public int read(int p0) {
        return write(0, p0);
    }

    public int write(int p0, int p1) {
        int iIconCompatParcelizer;
        int i;
        int iAudioAttributesCompatParcelizer;
        setEdition.read(p0, p1);
        int i2 = p1 - p0;
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            if (((-i2) & i2) == i2) {
                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setEdition.RemoteActionCompatParcelizer(i2));
            } else {
                do {
                    iIconCompatParcelizer = IconCompatParcelizer() >>> 1;
                    i = iIconCompatParcelizer % i2;
                } while ((iIconCompatParcelizer - i) + (i2 - 1) < 0);
                iAudioAttributesCompatParcelizer = i;
            }
            return p0 + iAudioAttributesCompatParcelizer;
        }
        while (true) {
            int iIconCompatParcelizer2 = IconCompatParcelizer();
            if (p0 <= iIconCompatParcelizer2 && iIconCompatParcelizer2 < p1) {
                return iIconCompatParcelizer2;
            }
        }
    }

    public byte[] IconCompatParcelizer(byte[] p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 < 0 || p1 > p0.length || p2 < 0 || p2 > p0.length) {
            StringBuilder sb = new StringBuilder("fromIndex (");
            sb.append(p1);
            sb.append(") or toIndex (");
            sb.append(p2);
            sb.append(") are out of range: 0..");
            sb.append(p0.length);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p1 > p2) {
            StringBuilder sb2 = new StringBuilder("fromIndex (");
            sb2.append(p1);
            sb2.append(") must be not greater than toIndex (");
            sb2.append(p2);
            sb2.append(").");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int i = (p2 - p1) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            int iIconCompatParcelizer = IconCompatParcelizer();
            p0[p1] = (byte) iIconCompatParcelizer;
            p0[p1 + 1] = (byte) (iIconCompatParcelizer >>> 8);
            p0[p1 + 2] = (byte) (iIconCompatParcelizer >>> 16);
            p0[p1 + 3] = (byte) (iIconCompatParcelizer >>> 24);
            p1 += 4;
        }
        int i3 = p2 - p1;
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i3 << 3);
        for (int i4 = 0; i4 < i3; i4++) {
            p0[p1 + i4] = (byte) (iAudioAttributesCompatParcelizer >>> (i4 << 3));
        }
        return p0;
    }

    public byte[] RemoteActionCompatParcelizer(byte[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IconCompatParcelizer(p0, 0, p0.length);
    }

    public byte[] write(int p0) {
        return RemoteActionCompatParcelizer(new byte[p0]);
    }

    /* JADX INFO: renamed from: o.getFinalData$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0019\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "defaultRandom", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "nextBits", "", "bitCount", "nextInt", "until", "from", "nextLong", "", "nextBoolean", "", "nextDouble", "", "nextFloat", "", "nextBytes", "", "array", "size", "fromIndex", "toIndex", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion extends getFinalData implements Serializable {
        private Companion() {
        }

        /* JADX INFO: renamed from: o.getFinalData$write$AudioAttributesCompatParcelizer */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        static final class AudioAttributesCompatParcelizer implements Serializable {
            public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

            private AudioAttributesCompatParcelizer() {
            }

            private final Object readResolve() {
                return getFinalData.INSTANCE;
            }
        }

        private final Object writeReplace() {
            return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.getFinalData
        public final int AudioAttributesCompatParcelizer(int i) {
            return getFinalData.read.AudioAttributesCompatParcelizer(i);
        }

        @Override // kotlin.getFinalData
        public final int IconCompatParcelizer() {
            return getFinalData.read.IconCompatParcelizer();
        }

        @Override // kotlin.getFinalData
        public final int read(int i) {
            return getFinalData.read.read(i);
        }

        @Override // kotlin.getFinalData
        public final int write(int i, int i2) {
            return getFinalData.read.write(i, i2);
        }

        @Override // kotlin.getFinalData
        public final byte[] RemoteActionCompatParcelizer(byte[] bArr) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return getFinalData.read.RemoteActionCompatParcelizer(bArr);
        }

        @Override // kotlin.getFinalData
        public final byte[] write(int i) {
            return getFinalData.read.write(i);
        }

        @Override // kotlin.getFinalData
        public final byte[] IconCompatParcelizer(byte[] bArr, int i, int i2) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            return getFinalData.read.IconCompatParcelizer(bArr, i, i2);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
