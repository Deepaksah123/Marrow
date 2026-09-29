package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.getInstanceParameter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u0000 \u001f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001fB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB5\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001c\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\""}, d2 = {"Lo/KotlinSerializersKt;", "", "T", "", "p0", "", "p1", "<init>", "(ILjava/util/List;)V", "", "p2", "p3", "([ILjava/util/List;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p4", "Lo/getInstanceParameter$IconCompatParcelizer;", "read", "(IIIII)Lo/getInstanceParameter$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "I", "write", "AudioAttributesImplBaseParcelizer", "[I", "()[I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class KotlinSerializersKt<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<T> read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<Integer> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KotlinSerializersKt<Object> read = new KotlinSerializersKt<>(0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());

    /* JADX WARN: Multi-variable type inference failed */
    private KotlinSerializersKt(int[] iArr, List<? extends T> list, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = iArr;
        this.read = list;
        this.write = i;
        this.AudioAttributesCompatParcelizer = null;
        int length = iArr.length;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int[] getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<T> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KotlinSerializersKt(int i, List<? extends T> list) {
        this(new int[]{i}, list, i);
        toMagicModuleMetaRepoModel.write(list, "");
    }

    public final getInstanceParameter.IconCompatParcelizer read(int p0, int p1, int p2, int p3, int p4) {
        int i = this.write;
        List<Integer> list = this.AudioAttributesCompatParcelizer;
        if (list != null && IntermediateLoginResponseBody.read((Collection<?>) list).write(p0)) {
            p0 = this.AudioAttributesCompatParcelizer.get(p0).intValue();
        }
        return new getInstanceParameter.IconCompatParcelizer(i, p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        KotlinSerializersKt kotlinSerializersKt = (KotlinSerializersKt) p0;
        return Arrays.equals(this.RemoteActionCompatParcelizer, kotlinSerializersKt.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, kotlinSerializersKt.read) && this.write == kotlinSerializersKt.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, kotlinSerializersKt.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode2 = this.read.hashCode();
        int i = this.write;
        List<Integer> list = this.AudioAttributesCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: o.KotlinSerializersKt$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/KotlinSerializersKt$write;", "", "<init>", "()V", "Lo/KotlinSerializersKt;", "read", "Lo/KotlinSerializersKt;", "IconCompatParcelizer", "()Lo/KotlinSerializersKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static KotlinSerializersKt<Object> IconCompatParcelizer() {
            return KotlinSerializersKt.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KotlinSerializersKt(RemoteActionCompatParcelizer=");
        sb.append(Arrays.toString(this.RemoteActionCompatParcelizer));
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
