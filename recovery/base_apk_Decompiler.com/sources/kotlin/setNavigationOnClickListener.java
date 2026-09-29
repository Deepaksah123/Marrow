package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\r\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c"}, d2 = {"Lo/setNavigationOnClickListener;", "T", "Lo/SwitchCompat;", "", "p0", "p1", "p2", "<init>", "(FFLjava/lang/Object;)V", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lo/dispatchGetDisplayList;", "read", "(Lo/evictionCount;)Lo/dispatchGetDisplayList;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "write", "()F", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setNavigationOnClickListener<T> implements SwitchCompat<T> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final T read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float write;

    public setNavigationOnClickListener(float f, float f2, T t) {
        this.write = f;
        this.RemoteActionCompatParcelizer = f2;
        this.read = t;
    }

    public /* synthetic */ setNavigationOnClickListener(float f, float f2, Object obj, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final T IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.setOrientation
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final <V extends ScrollingTabContainerView> dispatchGetDisplayList<V> IconCompatParcelizer(evictionCount<T, V> p0) {
        return new dispatchGetDisplayList<>(this.write, this.RemoteActionCompatParcelizer, setVerticalGravity.read(p0, this.read));
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof setNavigationOnClickListener)) {
            return false;
        }
        setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) p0;
        return setnavigationonclicklistener.write == this.write && setnavigationonclicklistener.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setnavigationonclicklistener.read, this.read);
    }

    public final int hashCode() {
        T t = this.read;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.hashCode(this.write)) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer);
    }

    public setNavigationOnClickListener() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
    }
}
