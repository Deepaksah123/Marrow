package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001d\u0010\u001a\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0011\u0010\f\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/leaseObjectBuffer;", "Lo/writerFor;", "Lo/parseDate;", "", "p0", "p1", "", "p2", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "p3", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "write", "()Lo/parseDate;", "", "RemoteActionCompatParcelizer", "(Lo/parseDate;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "IconCompatParcelizer", "[Ljava/lang/Object;", "read", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class leaseObjectBuffer extends writerFor<parseDate> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final PointerInputEventHandler write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Object[] read;

    public leaseObjectBuffer(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = objArr;
        this.write = pointerInputEventHandler;
    }

    public /* synthetic */ leaseObjectBuffer(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final parseDate IconCompatParcelizer() {
        return new parseDate(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(parseDate p0) {
        p0.IconCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof leaseObjectBuffer)) {
            return false;
        }
        leaseObjectBuffer leaseobjectbuffer = (leaseObjectBuffer) p0;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, leaseobjectbuffer.IconCompatParcelizer) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, leaseobjectbuffer.RemoteActionCompatParcelizer)) {
            return false;
        }
        Object[] objArr = this.read;
        if (objArr != null) {
            Object[] objArr2 = leaseobjectbuffer.read;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (leaseobjectbuffer.read != null) {
            return false;
        }
        return this.write == leaseobjectbuffer.write;
    }

    public final int hashCode() {
        Object obj = this.IconCompatParcelizer;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        Object[] objArr = this.read;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + this.write.hashCode();
    }
}
