package kotlin;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.getError;
import kotlin.setPlayClearSamplesWithoutKeys;

/* JADX INFO: loaded from: classes.dex */
public abstract class requiresSecureDecoder<T extends setPlayClearSamplesWithoutKeys<? extends Entry>> {
    protected float AudioAttributesCompatParcelizer;
    protected float AudioAttributesImplApi21Parcelizer;
    protected float AudioAttributesImplBaseParcelizer;
    protected List<T> IconCompatParcelizer;
    protected float MediaBrowserCompatCustomActionResultReceiver;
    protected float MediaBrowserCompatItemReceiver;
    protected float RemoteActionCompatParcelizer;
    protected float read;
    protected float write;

    public requiresSecureDecoder() {
        this.MediaBrowserCompatItemReceiver = -3.4028235E38f;
        this.AudioAttributesImplBaseParcelizer = Float.MAX_VALUE;
        this.MediaBrowserCompatCustomActionResultReceiver = -3.4028235E38f;
        this.AudioAttributesImplApi21Parcelizer = Float.MAX_VALUE;
        this.AudioAttributesCompatParcelizer = -3.4028235E38f;
        this.RemoteActionCompatParcelizer = Float.MAX_VALUE;
        this.read = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        this.IconCompatParcelizer = new ArrayList();
    }

    public requiresSecureDecoder(T... tArr) {
        this.MediaBrowserCompatItemReceiver = -3.4028235E38f;
        this.AudioAttributesImplBaseParcelizer = Float.MAX_VALUE;
        this.MediaBrowserCompatCustomActionResultReceiver = -3.4028235E38f;
        this.AudioAttributesImplApi21Parcelizer = Float.MAX_VALUE;
        this.AudioAttributesCompatParcelizer = -3.4028235E38f;
        this.RemoteActionCompatParcelizer = Float.MAX_VALUE;
        this.read = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        this.IconCompatParcelizer = IconCompatParcelizer(tArr);
        MediaBrowserCompatSearchResultReceiver();
    }

    private static List<T> IconCompatParcelizer(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public requiresSecureDecoder(List<T> list) {
        this.MediaBrowserCompatItemReceiver = -3.4028235E38f;
        this.AudioAttributesImplBaseParcelizer = Float.MAX_VALUE;
        this.MediaBrowserCompatCustomActionResultReceiver = -3.4028235E38f;
        this.AudioAttributesImplApi21Parcelizer = Float.MAX_VALUE;
        this.AudioAttributesCompatParcelizer = -3.4028235E38f;
        this.RemoteActionCompatParcelizer = Float.MAX_VALUE;
        this.read = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        this.IconCompatParcelizer = list;
        MediaBrowserCompatSearchResultReceiver();
    }

    public void MediaBrowserCompatSearchResultReceiver() {
        RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(float f, float f2) {
        Iterator<T> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(f, f2);
        }
        RemoteActionCompatParcelizer();
    }

    protected void RemoteActionCompatParcelizer() {
        List<T> list = this.IconCompatParcelizer;
        if (list != null) {
            this.MediaBrowserCompatItemReceiver = -3.4028235E38f;
            this.AudioAttributesImplBaseParcelizer = Float.MAX_VALUE;
            this.MediaBrowserCompatCustomActionResultReceiver = -3.4028235E38f;
            this.AudioAttributesImplApi21Parcelizer = Float.MAX_VALUE;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                read(it.next());
            }
            this.AudioAttributesCompatParcelizer = -3.4028235E38f;
            this.RemoteActionCompatParcelizer = Float.MAX_VALUE;
            this.read = -3.4028235E38f;
            this.write = Float.MAX_VALUE;
            setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeysAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            if (setplayclearsampleswithoutkeysAudioAttributesCompatParcelizer != null) {
                this.AudioAttributesCompatParcelizer = setplayclearsampleswithoutkeysAudioAttributesCompatParcelizer.onPlayFromMediaId();
                this.RemoteActionCompatParcelizer = setplayclearsampleswithoutkeysAudioAttributesCompatParcelizer.onPlayFromSearch();
                for (T t : this.IconCompatParcelizer) {
                    if (t.IconCompatParcelizer() == getError.write.LEFT) {
                        if (t.onPlayFromSearch() < this.RemoteActionCompatParcelizer) {
                            this.RemoteActionCompatParcelizer = t.onPlayFromSearch();
                        }
                        if (t.onPlayFromMediaId() > this.AudioAttributesCompatParcelizer) {
                            this.AudioAttributesCompatParcelizer = t.onPlayFromMediaId();
                        }
                    }
                }
            }
            setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeysRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (setplayclearsampleswithoutkeysRemoteActionCompatParcelizer != null) {
                this.read = setplayclearsampleswithoutkeysRemoteActionCompatParcelizer.onPlayFromMediaId();
                this.write = setplayclearsampleswithoutkeysRemoteActionCompatParcelizer.onPlayFromSearch();
                for (T t2 : this.IconCompatParcelizer) {
                    if (t2.IconCompatParcelizer() == getError.write.RIGHT) {
                        if (t2.onPlayFromSearch() < this.write) {
                            this.write = t2.onPlayFromSearch();
                        }
                        if (t2.onPlayFromMediaId() > this.read) {
                            this.read = t2.onPlayFromMediaId();
                        }
                    }
                }
            }
        }
    }

    public final int read() {
        List<T> list = this.IconCompatParcelizer;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final float IconCompatParcelizer(getError.write writeVar) {
        if (writeVar == getError.write.LEFT) {
            float f = this.RemoteActionCompatParcelizer;
            return f == Float.MAX_VALUE ? this.write : f;
        }
        float f2 = this.write;
        return f2 == Float.MAX_VALUE ? this.RemoteActionCompatParcelizer : f2;
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final float read(getError.write writeVar) {
        if (writeVar == getError.write.LEFT) {
            float f = this.AudioAttributesCompatParcelizer;
            return f == -3.4028235E38f ? this.read : f;
        }
        float f2 = this.read;
        return f2 == -3.4028235E38f ? this.AudioAttributesCompatParcelizer : f2;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final List<T> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public Entry IconCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        if (createandacquiresessionwithretry.RemoteActionCompatParcelizer() >= this.IconCompatParcelizer.size()) {
            return null;
        }
        return this.IconCompatParcelizer.get(createandacquiresessionwithretry.RemoteActionCompatParcelizer()).read(createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver(), createandacquiresessionwithretry.MediaBrowserCompatItemReceiver());
    }

    public T RemoteActionCompatParcelizer(int i) {
        List<T> list = this.IconCompatParcelizer;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.IconCompatParcelizer.get(i);
    }

    private void read(T t) {
        if (this.MediaBrowserCompatItemReceiver < t.onPlayFromMediaId()) {
            this.MediaBrowserCompatItemReceiver = t.onPlayFromMediaId();
        }
        if (this.AudioAttributesImplBaseParcelizer > t.onPlayFromSearch()) {
            this.AudioAttributesImplBaseParcelizer = t.onPlayFromSearch();
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver < t.onFastForward()) {
            this.MediaBrowserCompatCustomActionResultReceiver = t.onFastForward();
        }
        if (this.AudioAttributesImplApi21Parcelizer > t.onPlay()) {
            this.AudioAttributesImplApi21Parcelizer = t.onPlay();
        }
        if (t.IconCompatParcelizer() == getError.write.LEFT) {
            if (this.AudioAttributesCompatParcelizer < t.onPlayFromMediaId()) {
                this.AudioAttributesCompatParcelizer = t.onPlayFromMediaId();
            }
            if (this.RemoteActionCompatParcelizer > t.onPlayFromSearch()) {
                this.RemoteActionCompatParcelizer = t.onPlayFromSearch();
                return;
            }
            return;
        }
        if (this.read < t.onPlayFromMediaId()) {
            this.read = t.onPlayFromMediaId();
        }
        if (this.write > t.onPlayFromSearch()) {
            this.write = t.onPlayFromSearch();
        }
    }

    private static T AudioAttributesCompatParcelizer(List<T> list) {
        for (T t : list) {
            if (t.IconCompatParcelizer() == getError.write.LEFT) {
                return t;
            }
        }
        return null;
    }

    private static T RemoteActionCompatParcelizer(List<T> list) {
        for (T t : list) {
            if (t.IconCompatParcelizer() == getError.write.RIGHT) {
                return t;
            }
        }
        return null;
    }

    public final void write(int i) {
        Iterator<T> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().read(i);
        }
    }

    public final void RatingCompat() {
        Iterator<T> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(8.0f);
        }
    }

    public final void MediaMetadataCompat() {
        Iterator<T> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(false);
        }
    }

    public final int write() {
        Iterator<T> it = this.IconCompatParcelizer.iterator();
        int iOnMediaButtonEvent = 0;
        while (it.hasNext()) {
            iOnMediaButtonEvent += it.next().onMediaButtonEvent();
        }
        return iOnMediaButtonEvent;
    }

    public final T AudioAttributesImplBaseParcelizer() {
        List<T> list = this.IconCompatParcelizer;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t = this.IconCompatParcelizer.get(0);
        for (T t2 : this.IconCompatParcelizer) {
            if (t2.onMediaButtonEvent() > t.onMediaButtonEvent()) {
                t = t2;
            }
        }
        return t;
    }
}
