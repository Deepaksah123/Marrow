package kotlin;

import java.util.List;
import kotlin.getCurrentTracks;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMediaMetadata<T extends getCurrentTracks> extends getCurrentPeriodIndex<T> {
    protected abstract T RatingCompat();

    @Override // kotlin.getCurrentPeriodIndex
    public final /* synthetic */ void AudioAttributesCompatParcelizer(Object obj, List list) {
        read((getCurrentTracks) obj, (List<Object>) list);
    }

    @Override // kotlin.getCurrentPeriodIndex
    public void read(T t) {
        super.read(t);
    }

    private void read(T t, List<Object> list) {
        super.AudioAttributesCompatParcelizer(t, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getCurrentPeriodIndex
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void write(T t, getCurrentPeriodIndex<?> getcurrentperiodindex) {
        super.write(t, getcurrentperiodindex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getCurrentPeriodIndex
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean AudioAttributesCompatParcelizer(T t) {
        return super.AudioAttributesCompatParcelizer(t);
    }
}
