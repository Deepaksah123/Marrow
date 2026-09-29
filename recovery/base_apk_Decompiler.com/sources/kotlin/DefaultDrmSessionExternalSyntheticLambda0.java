package kotlin;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class DefaultDrmSessionExternalSyntheticLambda0<T extends Entry> extends provision<T> {
    private float AudioAttributesCompatParcelizer;
    private float IconCompatParcelizer;
    private List<T> RemoteActionCompatParcelizer;
    private float read;
    private float write;

    /* JADX INFO: loaded from: classes2.dex */
    public enum IconCompatParcelizer {
        UP,
        DOWN,
        CLOSEST
    }

    public DefaultDrmSessionExternalSyntheticLambda0(List<T> list, String str) {
        super(str);
        this.AudioAttributesCompatParcelizer = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        this.IconCompatParcelizer = -3.4028235E38f;
        this.read = Float.MAX_VALUE;
        this.RemoteActionCompatParcelizer = list;
        if (list == null) {
            this.RemoteActionCompatParcelizer = new ArrayList();
        }
        onPrepare();
    }

    private void onPrepare() {
        List<T> list = this.RemoteActionCompatParcelizer;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.AudioAttributesCompatParcelizer = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        this.IconCompatParcelizer = -3.4028235E38f;
        this.read = Float.MAX_VALUE;
        Iterator<T> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            RemoteActionCompatParcelizer(it.next());
        }
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final void AudioAttributesCompatParcelizer(float f, float f2) {
        List<T> list = this.RemoteActionCompatParcelizer;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.AudioAttributesCompatParcelizer = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f2, Float.NaN, IconCompatParcelizer.UP);
        for (int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(f, Float.NaN, IconCompatParcelizer.DOWN); iRemoteActionCompatParcelizer2 <= iRemoteActionCompatParcelizer; iRemoteActionCompatParcelizer2++) {
            IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(iRemoteActionCompatParcelizer2));
        }
    }

    protected void RemoteActionCompatParcelizer(T t) {
        if (t == null) {
            return;
        }
        read(t);
        IconCompatParcelizer(t);
    }

    private void read(T t) {
        if (t.MediaBrowserCompatCustomActionResultReceiver() < this.read) {
            this.read = t.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (t.MediaBrowserCompatCustomActionResultReceiver() > this.IconCompatParcelizer) {
            this.IconCompatParcelizer = t.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    protected final void IconCompatParcelizer(T t) {
        if (t.read() < this.write) {
            this.write = t.read();
        }
        if (t.read() > this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = t.read();
        }
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final int onMediaButtonEvent() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(onPrepareFromSearch());
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.RemoteActionCompatParcelizer.get(i).toString());
            sb.append(" ");
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    private String onPrepareFromSearch() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        sb.append(RatingCompat() == null ? "" : RatingCompat());
        sb.append(", entries: ");
        sb.append(this.RemoteActionCompatParcelizer.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final float onPlayFromSearch() {
        return this.write;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final float onPlayFromMediaId() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final float onPlay() {
        return this.read;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final float onFastForward() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final int AudioAttributesCompatParcelizer(Entry entry) {
        return this.RemoteActionCompatParcelizer.indexOf(entry);
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final T read(float f, float f2, IconCompatParcelizer iconCompatParcelizer) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f, f2, iconCompatParcelizer);
        if (iRemoteActionCompatParcelizer >= 0) {
            return this.RemoteActionCompatParcelizer.get(iRemoteActionCompatParcelizer);
        }
        return null;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final T read(float f, float f2) {
        return (T) read(f, f2, IconCompatParcelizer.CLOSEST);
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final T IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.get(i);
    }

    private int RemoteActionCompatParcelizer(float f, float f2, IconCompatParcelizer iconCompatParcelizer) {
        T t;
        List<T> list = this.RemoteActionCompatParcelizer;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.RemoteActionCompatParcelizer.size() - 1;
        int i = 0;
        while (i < size) {
            int i2 = (i + size) / 2;
            float fMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.get(i2).MediaBrowserCompatCustomActionResultReceiver() - f;
            int i3 = i2 + 1;
            float fMediaBrowserCompatCustomActionResultReceiver2 = this.RemoteActionCompatParcelizer.get(i3).MediaBrowserCompatCustomActionResultReceiver();
            float fAbs = Math.abs(fMediaBrowserCompatCustomActionResultReceiver);
            float fAbs2 = Math.abs(fMediaBrowserCompatCustomActionResultReceiver2 - f);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = fMediaBrowserCompatCustomActionResultReceiver;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i2;
            }
            i = i3;
        }
        if (size != -1) {
            float fMediaBrowserCompatCustomActionResultReceiver3 = this.RemoteActionCompatParcelizer.get(size).MediaBrowserCompatCustomActionResultReceiver();
            if (iconCompatParcelizer == IconCompatParcelizer.UP) {
                if (fMediaBrowserCompatCustomActionResultReceiver3 < f && size < this.RemoteActionCompatParcelizer.size() - 1) {
                    size++;
                }
            } else if (iconCompatParcelizer == IconCompatParcelizer.DOWN && fMediaBrowserCompatCustomActionResultReceiver3 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && this.RemoteActionCompatParcelizer.get(size - 1).MediaBrowserCompatCustomActionResultReceiver() == fMediaBrowserCompatCustomActionResultReceiver3) {
                    size--;
                }
                float f3 = this.RemoteActionCompatParcelizer.get(size).read();
                loop2: while (true) {
                    int i4 = size;
                    do {
                        i4++;
                        if (i4 >= this.RemoteActionCompatParcelizer.size()) {
                            break loop2;
                        }
                        t = this.RemoteActionCompatParcelizer.get(i4);
                        if (t.MediaBrowserCompatCustomActionResultReceiver() != fMediaBrowserCompatCustomActionResultReceiver3) {
                            break loop2;
                        }
                    } while (Math.abs(t.read() - f2) >= Math.abs(f3 - f2));
                    f3 = f2;
                    size = i4;
                }
            }
        }
        return size;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final List<T> read(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.RemoteActionCompatParcelizer.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            T t = this.RemoteActionCompatParcelizer.get(i2);
            if (f == t.MediaBrowserCompatCustomActionResultReceiver()) {
                while (i2 > 0 && this.RemoteActionCompatParcelizer.get(i2 - 1).MediaBrowserCompatCustomActionResultReceiver() == f) {
                    i2--;
                }
                int size2 = this.RemoteActionCompatParcelizer.size();
                while (i2 < size2) {
                    T t2 = this.RemoteActionCompatParcelizer.get(i2);
                    if (t2.MediaBrowserCompatCustomActionResultReceiver() != f) {
                        break;
                    }
                    arrayList.add(t2);
                    i2++;
                }
            } else if (f > t.MediaBrowserCompatCustomActionResultReceiver()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }
}
