package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012\u001ak\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0017"}, d2 = {"T", "Lo/ScrollingTabContainerView;", "V", "Lo/setShowDividers;", "p0", "p1", "", "p2", "p3", "", "p4", "IconCompatParcelizer", "(Lo/setShowDividers;Ljava/lang/Object;Lo/ScrollingTabContainerView;JJZ)Lo/setShowDividers;", "", "Lo/setHoverListener;", "write", "(Lo/setShowDividers;FFJJZ)Lo/setShowDividers;", "AudioAttributesCompatParcelizer", "(FFJJZ)Lo/setShowDividers;", "Lo/evictionCount;", "p5", "read", "(Lo/evictionCount;Ljava/lang/Object;Ljava/lang/Object;JJZ)Lo/setShowDividers;", "(Lo/evictionCount;Ljava/lang/Object;)Lo/ScrollingTabContainerView;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setAllowCollapse {
    public static /* synthetic */ setShowDividers IconCompatParcelizer$default(setShowDividers setshowdividers, Object obj, ScrollingTabContainerView scrollingTabContainerView, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = setshowdividers.getRemoteActionCompatParcelizer();
        }
        if ((i & 2) != 0) {
            scrollingTabContainerView = SearchView.AudioAttributesCompatParcelizer(setshowdividers.AudioAttributesImplApi21Parcelizer());
        }
        ScrollingTabContainerView scrollingTabContainerView2 = scrollingTabContainerView;
        if ((i & 4) != 0) {
            j = setshowdividers.getRemoteActionCompatParcelizer();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = setshowdividers.getRead();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = setshowdividers.getAudioAttributesImplBaseParcelizer();
        }
        return IconCompatParcelizer(setshowdividers, obj, scrollingTabContainerView2, j3, j4, z);
    }

    public static final <T, V extends ScrollingTabContainerView> setShowDividers<T, V> IconCompatParcelizer(setShowDividers<T, V> setshowdividers, T t, V v, long j, long j2, boolean z) {
        return new setShowDividers<>(setshowdividers.write(), t, v, j, j2, z);
    }

    public static /* synthetic */ setShowDividers write$default(setShowDividers setshowdividers, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) setshowdividers.getRemoteActionCompatParcelizer()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((setHoverListener) setshowdividers.AudioAttributesImplApi21Parcelizer()).getIconCompatParcelizer();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = setshowdividers.getRemoteActionCompatParcelizer();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = setshowdividers.getRead();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = setshowdividers.getAudioAttributesImplBaseParcelizer();
        }
        return write(setshowdividers, f, f3, j3, j4, z);
    }

    public static final setShowDividers<Float, setHoverListener> write(setShowDividers<Float, setHoverListener> setshowdividers, float f, float f2, long j, long j2, boolean z) {
        return new setShowDividers<>(setshowdividers.write(), Float.valueOf(f), SearchView.read(f2), j, j2, z);
    }

    public static /* synthetic */ setShowDividers AudioAttributesCompatParcelizer$default(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        long j3 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        long j4 = (i & 8) == 0 ? j2 : Long.MIN_VALUE;
        if ((i & 16) != 0) {
            z = false;
        }
        return AudioAttributesCompatParcelizer(f, f2, j3, j4, z);
    }

    public static final setShowDividers<Float, setHoverListener> AudioAttributesCompatParcelizer(float f, float f2, long j, long j2, boolean z) {
        return new setShowDividers<>(hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE), Float.valueOf(f), SearchView.read(f2), j, j2, z);
    }

    public static final <T, V extends ScrollingTabContainerView> setShowDividers<T, V> read(evictionCount<T, V> evictioncount, T t, T t2, long j, long j2, boolean z) {
        return new setShowDividers<>(evictioncount, t, evictioncount.RemoteActionCompatParcelizer().invoke(t2), j, j2, z);
    }

    public static final <T, V extends ScrollingTabContainerView> V AudioAttributesCompatParcelizer(evictionCount<T, V> evictioncount, T t) {
        V vInvoke = evictioncount.RemoteActionCompatParcelizer().invoke(t);
        vInvoke.AudioAttributesCompatParcelizer();
        return vInvoke;
    }
}
