package kotlin;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getComponentEnabledSetting {
    private final DataSetObservable IconCompatParcelizer = new DataSetObservable();
    private DataSetObserver RemoteActionCompatParcelizer;

    public static float IconCompatParcelizer() {
        return 1.0f;
    }

    public abstract int AudioAttributesCompatParcelizer();

    public void IconCompatParcelizer(ViewGroup viewGroup) {
    }

    public Parcelable RemoteActionCompatParcelizer() {
        return null;
    }

    public void RemoteActionCompatParcelizer(Object obj) {
    }

    public abstract boolean RemoteActionCompatParcelizer(View view, Object obj);

    public CharSequence read(int i) {
        return null;
    }

    public void write() {
    }

    public Object read(ViewGroup viewGroup, int i) {
        return AudioAttributesImplApi26Parcelizer();
    }

    public void IconCompatParcelizer(ViewGroup viewGroup, Object obj) {
        MediaBrowserCompatItemReceiver();
    }

    @Deprecated
    private static Object AudioAttributesImplApi26Parcelizer() {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    private static void MediaBrowserCompatItemReceiver() {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public final void read() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.RemoteActionCompatParcelizer;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.IconCompatParcelizer.notifyChanged();
    }

    public final void RemoteActionCompatParcelizer(DataSetObserver dataSetObserver) {
        this.IconCompatParcelizer.registerObserver(dataSetObserver);
    }

    public final void read(DataSetObserver dataSetObserver) {
        this.IconCompatParcelizer.unregisterObserver(dataSetObserver);
    }

    public final void AudioAttributesCompatParcelizer(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = dataSetObserver;
        }
    }
}
