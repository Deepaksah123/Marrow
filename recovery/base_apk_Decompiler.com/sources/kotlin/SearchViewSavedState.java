package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\rJ3\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0010H&¢\u0006\u0004\b\n\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/SearchViewSavedState;", "Lo/setOrientation;", "", "", "p0", "p1", "p2", "p3", "AudioAttributesCompatParcelizer", "(JFFF)F", "read", "RemoteActionCompatParcelizer", "(FFF)F", "(FFF)J", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "Lo/setDrawParams;", "(Lo/evictionCount;)Lo/setDrawParams;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SearchViewSavedState extends setOrientation<Float> {
    float AudioAttributesCompatParcelizer(long p0, float p1, float p2, float p3);

    long AudioAttributesCompatParcelizer(float p0, float p1, float p2);

    float read(long p0, float p1, float p2, float p3);

    default float RemoteActionCompatParcelizer(float p0, float p1, float p2) {
        return read(AudioAttributesCompatParcelizer(p0, p1, p2), p0, p1, p2);
    }

    @Override // kotlin.setOrientation
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    default <V extends ScrollingTabContainerView> setDrawParams<V> IconCompatParcelizer(evictionCount<Float, V> p0) {
        return new setDrawParams<>(this);
    }
}
