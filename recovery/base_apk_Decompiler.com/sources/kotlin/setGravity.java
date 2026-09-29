package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001ac\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\" \u0010\u000f\u001a\u00020\u000e*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"T", "Lo/ScrollingTabContainerView;", "V", "Lo/setOrientation;", "p0", "Lo/evictionCount;", "p1", "p2", "p3", "p4", "Lo/setLayoutResource;", "write", "(Lo/setOrientation;Lo/evictionCount;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lo/setLayoutResource;", "Lo/setMeasureWithLargestChildEnabled;", "", "RemoteActionCompatParcelizer", "(Lo/setMeasureWithLargestChildEnabled;)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setGravity {
    public static final long RemoteActionCompatParcelizer(setMeasureWithLargestChildEnabled<?, ?> setmeasurewithlargestchildenabled) {
        return setmeasurewithlargestchildenabled.IconCompatParcelizer() / 1000000;
    }

    public static final <T, V extends ScrollingTabContainerView> setLayoutResource<T, V> write(setOrientation<T> setorientation, evictionCount<T, V> evictioncount, T t, T t2, T t3) {
        return new setLayoutResource<>(setorientation, evictioncount, t, t2, evictioncount.RemoteActionCompatParcelizer().invoke(t3));
    }
}
