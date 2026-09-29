package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setStateResult<T> {
    public abstract Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos);

    public abstract Object write(Iterator<? extends T> it, SampleVideos<? super getShowPopup> sampleVideos);

    public final Object read(getTopRankers<? extends T> gettoprankers, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = write(gettoprankers.write(), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }
}
