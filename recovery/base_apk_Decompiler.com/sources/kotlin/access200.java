package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR,\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0016"}, d2 = {"Lo/access200;", "", "Lo/isTypeOrSuperTypeOf;", "", "hasNext", "()Z", "RemoteActionCompatParcelizer", "()Lo/isTypeOrSuperTypeOf;", "Lo/onFindViewById;", "p0", "write", "(Lo/onFindViewById;)Lo/isTypeOrSuperTypeOf;", "", "I", "Lkotlin/Function2;", "", "read", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer", "", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access200 implements Iterator<isTypeOrSuperTypeOf>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<isTypeOrSuperTypeOf> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<Integer, onFindViewById, List<isTypeOrSuperTypeOf>> AudioAttributesCompatParcelizer;
    private final int write;

    public final List<isTypeOrSuperTypeOf> write() {
        return this.read;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.IconCompatParcelizer < write().size() || this.RemoteActionCompatParcelizer < this.write;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final isTypeOrSuperTypeOf next() {
        return write$default(this, null, 1, null);
    }

    public static /* synthetic */ isTypeOrSuperTypeOf write$default(access200 access200Var, onFindViewById onfindviewbyid, int i, Object obj) {
        if ((i & 1) != 0) {
            onfindviewbyid = new onFindViewById(0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, null);
        }
        return access200Var.write(onfindviewbyid);
    }

    public final isTypeOrSuperTypeOf write(onFindViewById p0) {
        if (this.IconCompatParcelizer < write().size()) {
            isTypeOrSuperTypeOf istypeorsupertypeof = write().get(this.IconCompatParcelizer);
            this.IconCompatParcelizer++;
            return istypeorsupertypeof;
        }
        int i = this.RemoteActionCompatParcelizer;
        if (i < this.write) {
            List<isTypeOrSuperTypeOf> listInvoke = this.AudioAttributesCompatParcelizer.invoke(Integer.valueOf(i), p0);
            this.RemoteActionCompatParcelizer++;
            if (listInvoke.isEmpty()) {
                return next();
            }
            isTypeOrSuperTypeOf istypeorsupertypeof2 = (isTypeOrSuperTypeOf) IntermediateLoginResponseBody.RatingCompat((List) listInvoke);
            this.read.addAll(listInvoke);
            this.IconCompatParcelizer++;
            return istypeorsupertypeof2;
        }
        StringBuilder sb = new StringBuilder("No item returned at index call. Index: ");
        sb.append(this.RemoteActionCompatParcelizer);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
