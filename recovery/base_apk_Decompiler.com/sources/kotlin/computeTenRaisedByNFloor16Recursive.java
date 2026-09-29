package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0018B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001c"}, d2 = {"Lo/computeTenRaisedByNFloor16Recursive;", "E", "Lo/getGroupTitle;", "Lo/illegalSurrogateDesc;", "", "p0", "p1", "Lo/FastDoubleMath;", "Lo/hexFloatLiteralToFloat;", "p2", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lo/FastDoubleMath;)V", "", "contains", "(Ljava/lang/Object;)Z", "read", "(Ljava/lang/Object;)Lo/illegalSurrogateDesc;", "RemoteActionCompatParcelizer", "", "iterator", "()Ljava/util/Iterator;", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/FastDoubleMath;", "", "()I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class computeTenRaisedByNFloor16Recursive<E> extends getGroupTitle<E> implements illegalSurrogateDesc<E> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static final computeTenRaisedByNFloor16Recursive read;
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final FastDoubleMath<E, hexFloatLiteralToFloat> read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    public computeTenRaisedByNFloor16Recursive(Object obj, Object obj2, FastDoubleMath<E, hexFloatLiteralToFloat> fastDoubleMath) {
        this.AudioAttributesCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = fastDoubleMath;
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getIconCompatParcelizer() {
        return this.read.size();
    }

    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public final boolean contains(Object p0) {
        return this.read.containsKey(p0);
    }

    @Override // kotlin.illegalSurrogateDesc
    public final illegalSurrogateDesc<E> read(E p0) {
        if (this.read.containsKey(p0)) {
            return this;
        }
        if (isEmpty()) {
            return new computeTenRaisedByNFloor16Recursive(p0, p0, this.read.AudioAttributesCompatParcelizer(p0, new hexFloatLiteralToFloat()));
        }
        Object obj = this.IconCompatParcelizer;
        hexFloatLiteralToFloat hexfloatliteraltofloat = this.read.get(obj);
        toMagicModuleMetaRepoModel.write(hexfloatliteraltofloat);
        return new computeTenRaisedByNFloor16Recursive(this.AudioAttributesCompatParcelizer, p0, this.read.AudioAttributesCompatParcelizer((E) obj, hexfloatliteraltofloat.write(p0)).AudioAttributesCompatParcelizer(p0, new hexFloatLiteralToFloat(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.illegalSurrogateDesc
    public final illegalSurrogateDesc<E> RemoteActionCompatParcelizer(E p0) {
        hexFloatLiteralToFloat hexfloatliteraltofloat = this.read.get(p0);
        if (hexfloatliteraltofloat == null) {
            return this;
        }
        FastDoubleMath fastDoubleMathWrite = this.read.write(p0);
        if (hexfloatliteraltofloat.read()) {
            V v = fastDoubleMathWrite.get(hexfloatliteraltofloat.getAudioAttributesCompatParcelizer());
            toMagicModuleMetaRepoModel.write(v);
            fastDoubleMathWrite = fastDoubleMathWrite.AudioAttributesCompatParcelizer(hexfloatliteraltofloat.getAudioAttributesCompatParcelizer(), ((hexFloatLiteralToFloat) v).write(hexfloatliteraltofloat.getIconCompatParcelizer()));
        }
        if (hexfloatliteraltofloat.write()) {
            V v2 = fastDoubleMathWrite.get(hexfloatliteraltofloat.getIconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(v2);
            fastDoubleMathWrite = fastDoubleMathWrite.AudioAttributesCompatParcelizer(hexfloatliteraltofloat.getIconCompatParcelizer(), ((hexFloatLiteralToFloat) v2).RemoteActionCompatParcelizer(hexfloatliteraltofloat.getAudioAttributesCompatParcelizer()));
        }
        return new computeTenRaisedByNFloor16Recursive(!hexfloatliteraltofloat.read() ? hexfloatliteraltofloat.getIconCompatParcelizer() : this.AudioAttributesCompatParcelizer, !hexfloatliteraltofloat.write() ? hexfloatliteraltofloat.getAudioAttributesCompatParcelizer() : this.IconCompatParcelizer, fastDoubleMathWrite);
    }

    @Override // kotlin.getGroupTitle, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new FastIntegerMath(this.AudioAttributesCompatParcelizer, this.read);
    }

    /* JADX INFO: renamed from: o.computeTenRaisedByNFloor16Recursive$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/computeTenRaisedByNFloor16Recursive$IconCompatParcelizer;", "", "<init>", "()V", "E", "Lo/illegalSurrogateDesc;", "write", "()Lo/illegalSurrogateDesc;", "Lo/computeTenRaisedByNFloor16Recursive;", "", "read", "Lo/computeTenRaisedByNFloor16Recursive;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <E> illegalSurrogateDesc<E> write() {
            return computeTenRaisedByNFloor16Recursive.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        computePowerOfTen computepoweroften = computePowerOfTen.INSTANCE;
        read = new computeTenRaisedByNFloor16Recursive(computepoweroften, computepoweroften, FastDoubleMath.INSTANCE.IconCompatParcelizer());
    }
}
