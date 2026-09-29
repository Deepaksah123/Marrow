package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
final class setTopRankers<T> extends setStateResult<T> implements Iterator<T>, SampleVideos<getShowPopup>, getCurrentAnsweredMcqProgress {
    private SampleVideos<? super getShowPopup> AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private T read;
    private Iterator<? extends T> write;

    public final void RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer = sampleVideos;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw RemoteActionCompatParcelizer();
                }
                Iterator<? extends T> it = this.write;
                toMagicModuleMetaRepoModel.write(it);
                if (it.hasNext()) {
                    this.RemoteActionCompatParcelizer = 2;
                    return true;
                }
                this.write = null;
            }
            this.RemoteActionCompatParcelizer = 5;
            SampleVideos<? super getShowPopup> sampleVideos = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(sampleVideos);
            this.AudioAttributesCompatParcelizer = null;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            sampleVideos.resumeWith(C0177getRfBanners.read(getshowpopup));
        }
    }

    @Override // java.util.Iterator
    public final T next() throws Throwable {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0 || i == 1) {
            return read();
        }
        if (i == 2) {
            this.RemoteActionCompatParcelizer = 1;
            Iterator<? extends T> it = this.write;
            toMagicModuleMetaRepoModel.write(it);
            return it.next();
        }
        if (i == 3) {
            this.RemoteActionCompatParcelizer = 0;
            T t = this.read;
            this.read = null;
            return t;
        }
        throw RemoteActionCompatParcelizer();
    }

    private final T read() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    private final Throwable RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder sb = new StringBuilder("Unexpected state of the iterator: ");
        sb.append(this.RemoteActionCompatParcelizer);
        return new IllegalStateException(sb.toString());
    }

    @Override // kotlin.setStateResult
    public final Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        this.read = t;
        this.RemoteActionCompatParcelizer = 3;
        this.AudioAttributesCompatParcelizer = sampleVideos;
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        if (objIconCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.setStateResult
    public final Object write(Iterator<? extends T> it, SampleVideos<? super getShowPopup> sampleVideos) {
        if (!it.hasNext()) {
            return getShowPopup.INSTANCE;
        }
        this.write = it;
        this.RemoteActionCompatParcelizer = 2;
        this.AudioAttributesCompatParcelizer = sampleVideos;
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        if (objIconCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.SampleVideos
    public final void resumeWith(Object obj) {
        SdkPayloadData.IconCompatParcelizer(obj);
        this.RemoteActionCompatParcelizer = 4;
    }

    @Override // kotlin.SampleVideos
    /* JADX INFO: renamed from: getContext */
    public final CurrentQuery getWrite() {
        return VideoSessionResponseBody.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
