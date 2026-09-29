package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000f\u001a\u00020\u000e\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012\"\u0014\u0010\u000b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015\"\u0014\u0010\b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/ScrollingTabContainerView;", "V", "Lo/ParcelableSnapshotMutableIntState;", "", "p0", "p1", "p2", "p3", "write", "(Lo/ParcelableSnapshotMutableIntState;JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "Lo/ParcelableSnapshotMutableLongState;", "IconCompatParcelizer", "(Lo/ParcelableSnapshotMutableLongState;J)J", "", "Lo/setIconified;", "RemoteActionCompatParcelizer", "(Lo/ScrollingTabContainerView;FF)Lo/setIconified;", "", "[I", "read", "", "[F", "Lo/setTabSelected;", "AudioAttributesCompatParcelizer", "Lo/setTabSelected;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ParcelableSnapshotMutableState {
    private static final int[] RemoteActionCompatParcelizer = new int[0];
    private static final float[] read = new float[0];
    private static final setTabSelected AudioAttributesCompatParcelizer = new setTabSelected(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final <V extends ScrollingTabContainerView> V write(ParcelableSnapshotMutableIntState<V> parcelableSnapshotMutableIntState, long j, V v, V v2, V v3) {
        return (V) parcelableSnapshotMutableIntState.IconCompatParcelizer(j * 1000000, v, v2, v3);
    }

    public static final long IconCompatParcelizer(ParcelableSnapshotMutableLongState<?> parcelableSnapshotMutableLongState, long j) {
        long iconCompatParcelizer = j - ((long) parcelableSnapshotMutableLongState.getIconCompatParcelizer());
        long j2 = parcelableSnapshotMutableLongState.read();
        if (iconCompatParcelizer < 0) {
            iconCompatParcelizer = 0;
        }
        return iconCompatParcelizer > j2 ? j2 : iconCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lo/ParcelableSnapshotMutableState$AudioAttributesCompatParcelizer;", "Lo/setIconified;", "", "p0", "Lo/setSwitchTextAppearance;", "IconCompatParcelizer", "(I)Lo/setSwitchTextAppearance;", "", "read", "[Lo/setSwitchTextAppearance;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements setIconified {
        private final setSwitchTextAppearance[] read;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        AudioAttributesCompatParcelizer(ScrollingTabContainerView scrollingTabContainerView, float f, float f2) {
            int write = scrollingTabContainerView.getIconCompatParcelizer();
            setSwitchTextAppearance[] setswitchtextappearanceArr = new setSwitchTextAppearance[write];
            for (int i = 0; i < write; i++) {
                setswitchtextappearanceArr[i] = new setSwitchTextAppearance(f, f2, scrollingTabContainerView.read(i));
            }
            this.read = setswitchtextappearanceArr;
        }

        @Override // kotlin.setIconified
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final setSwitchTextAppearance RemoteActionCompatParcelizer(int p0) {
            return this.read[p0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends ScrollingTabContainerView> setIconified RemoteActionCompatParcelizer(V v, float f, float f2) {
        if (v != null) {
            return new AudioAttributesCompatParcelizer(v, f, f2);
        }
        return new read(f, f2);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/ParcelableSnapshotMutableState$read;", "Lo/setIconified;", "", "p0", "Lo/setSwitchTextAppearance;", "IconCompatParcelizer", "(I)Lo/setSwitchTextAppearance;", "Lo/setSwitchTextAppearance;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements setIconified {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final setSwitchTextAppearance write;

        read(float f, float f2) {
            this.write = new setSwitchTextAppearance(f, f2, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // kotlin.setIconified
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final setSwitchTextAppearance RemoteActionCompatParcelizer(int p0) {
            return this.write;
        }
    }
}
