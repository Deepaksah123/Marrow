package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.getContentBufferedPosition;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getCurrentPeriodIndex<T> {
    private static long write = -1;
    private boolean AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    getContentBufferedPosition IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private AudioAttributesCompatParcelizer RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private getContentBufferedPosition read;

    public interface AudioAttributesCompatParcelizer {
    }

    public static boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    public boolean AudioAttributesCompatParcelizer(T t) {
        return false;
    }

    public int IconCompatParcelizer() {
        return 1;
    }

    protected abstract int RemoteActionCompatParcelizer();

    public void read(T t) {
    }

    private getCurrentPeriodIndex(long j) {
        this.MediaBrowserCompatItemReceiver = true;
        read(j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getCurrentPeriodIndex() {
        long j = write;
        write = j - 1;
        this(j);
        this.AudioAttributesImplBaseParcelizer = true;
    }

    final boolean write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    protected final int read() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    protected final View AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(MediaBrowserCompatSearchResultReceiver(), viewGroup, false);
    }

    public void AudioAttributesCompatParcelizer(T t, List<Object> list) {
        read(t);
    }

    public void write(T t, getCurrentPeriodIndex<?> getcurrentperiodindex) {
        read(t);
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public getCurrentPeriodIndex<T> read(long j) {
        if (this.read != null && j != this.AudioAttributesImplApi26Parcelizer) {
            throw new getPlaylistMetadata("Cannot change a model's id after it has been added to the adapter.");
        }
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = j;
        return this;
    }

    public getCurrentPeriodIndex<T> IconCompatParcelizer(CharSequence charSequence) {
        read(getRepeatMode.AudioAttributesCompatParcelizer(charSequence));
        return this;
    }

    private int MediaBrowserCompatSearchResultReceiver() {
        return RemoteActionCompatParcelizer();
    }

    public void write(getContentBufferedPosition getcontentbufferedposition) {
        getcontentbufferedposition.addInternal(this);
    }

    protected final void read(getContentBufferedPosition getcontentbufferedposition) {
        if (getcontentbufferedposition == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        }
        if (getcontentbufferedposition.isModelAddedMultipleTimes(this)) {
            StringBuilder sb = new StringBuilder("This model was already added to the controller at position ");
            sb.append(getcontentbufferedposition.getFirstIndexOfModelInBuildingList(this));
            throw new getPlaylistMetadata(sb.toString());
        }
        if (this.read == null) {
            this.read = getcontentbufferedposition;
            this.MediaBrowserCompatCustomActionResultReceiver = hashCode();
            getcontentbufferedposition.addAfterInterceptorCallback(new getContentBufferedPosition.write() { // from class: o.getCurrentPeriodIndex.2
                @Override // o.getContentBufferedPosition.write
                public final void read() {
                    getCurrentPeriodIndex.this.AudioAttributesCompatParcelizer = true;
                }

                @Override // o.getContentBufferedPosition.write
                public final void RemoteActionCompatParcelizer() {
                    getCurrentPeriodIndex getcurrentperiodindex = getCurrentPeriodIndex.this;
                    getcurrentperiodindex.MediaBrowserCompatCustomActionResultReceiver = getcurrentperiodindex.hashCode();
                    getCurrentPeriodIndex.this.AudioAttributesCompatParcelizer = false;
                }
            });
        }
    }

    final boolean MediaBrowserCompatItemReceiver() {
        return this.read != null;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        if (MediaBrowserCompatItemReceiver() && !this.AudioAttributesCompatParcelizer) {
            throw new getPlaybackSuppressionReason(this, read(this.read, (getCurrentPeriodIndex<?>) this));
        }
        getContentBufferedPosition getcontentbufferedposition = this.IconCompatParcelizer;
        if (getcontentbufferedposition != null) {
            getcontentbufferedposition.setStagedModel(this);
        }
    }

    private static int read(getContentBufferedPosition getcontentbufferedposition, getCurrentPeriodIndex<?> getcurrentperiodindex) {
        if (getcontentbufferedposition.isBuildingModels()) {
            return getcontentbufferedposition.getFirstIndexOfModelInBuildingList(getcurrentperiodindex);
        }
        return getcontentbufferedposition.getAdapter().write(getcurrentperiodindex);
    }

    protected final void write(String str, int i) {
        if (MediaBrowserCompatItemReceiver() && !this.AudioAttributesCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver != hashCode()) {
            throw new getPlaybackSuppressionReason(this, str, i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentPeriodIndex)) {
            return false;
        }
        getCurrentPeriodIndex getcurrentperiodindex = (getCurrentPeriodIndex) obj;
        return this.AudioAttributesImplApi26Parcelizer == getcurrentperiodindex.AudioAttributesImplApi26Parcelizer && read() == getcurrentperiodindex.read() && this.MediaBrowserCompatItemReceiver == getcurrentperiodindex.MediaBrowserCompatItemReceiver;
    }

    public int hashCode() {
        long j = this.AudioAttributesImplApi26Parcelizer;
        return (((((int) (j ^ (j >>> 32))) * 31) + read()) * 31) + (this.MediaBrowserCompatItemReceiver ? 1 : 0);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return IconCompatParcelizer();
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{id=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", viewType=");
        sb.append(read());
        sb.append(", shown=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", addedToAdapter=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
