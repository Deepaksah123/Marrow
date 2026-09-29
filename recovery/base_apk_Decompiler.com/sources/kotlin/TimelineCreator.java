package kotlin;

import java.util.Arrays;
import kotlin.C0177getRfBanners;
import kotlin.getDecoderName;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TimelineCreator<S extends getDecoderName<?>> {
    private int AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private S[] RemoteActionCompatParcelizer;
    private getFirstFrameRenderedTimestampMs read;

    protected abstract S[] read();

    protected abstract S write();

    protected final S[] AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final int MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<Integer> RemoteActionCompatParcelizer() {
        getFirstFrameRenderedTimestampMs getfirstframerenderedtimestampms;
        synchronized (this) {
            getfirstframerenderedtimestampms = this.read;
            if (getfirstframerenderedtimestampms == null) {
                getfirstframerenderedtimestampms = new getFirstFrameRenderedTimestampMs(this.AudioAttributesCompatParcelizer);
                this.read = getfirstframerenderedtimestampms;
            }
        }
        return getfirstframerenderedtimestampms;
    }

    public final S AudioAttributesImplApi21Parcelizer() {
        S s;
        getFirstFrameRenderedTimestampMs getfirstframerenderedtimestampms;
        synchronized (this) {
            S[] sArr = this.RemoteActionCompatParcelizer;
            if (sArr == null) {
                sArr = (S[]) read();
                this.RemoteActionCompatParcelizer = sArr;
            } else if (this.AudioAttributesCompatParcelizer >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length << 1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                this.RemoteActionCompatParcelizer = (S[]) ((getDecoderName[]) objArrCopyOf);
                sArr = (S[]) ((getDecoderName[]) objArrCopyOf);
            }
            int i = this.IconCompatParcelizer;
            do {
                s = sArr[i];
                if (s == null) {
                    s = (S) write();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                toMagicModuleMetaRepoModel.read(s, "");
            } while (!s.RemoteActionCompatParcelizer(this));
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer++;
            getfirstframerenderedtimestampms = this.read;
        }
        if (getfirstframerenderedtimestampms != null) {
            getfirstframerenderedtimestampms.IconCompatParcelizer(1);
        }
        return s;
    }

    public final void write(S s) {
        getFirstFrameRenderedTimestampMs getfirstframerenderedtimestampms;
        int i;
        SampleVideos<getShowPopup>[] sampleVideosArr;
        synchronized (this) {
            int i2 = this.AudioAttributesCompatParcelizer - 1;
            this.AudioAttributesCompatParcelizer = i2;
            getfirstframerenderedtimestampms = this.read;
            if (i2 == 0) {
                this.IconCompatParcelizer = 0;
            }
            toMagicModuleMetaRepoModel.read(s, "");
            sampleVideosArr = s.read(this);
        }
        for (SampleVideos<getShowPopup> sampleVideos : sampleVideosArr) {
            if (sampleVideos != null) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                sampleVideos.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            }
        }
        if (getfirstframerenderedtimestampms != null) {
            getfirstframerenderedtimestampms.IconCompatParcelizer(-1);
        }
    }
}
