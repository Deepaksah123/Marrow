package kotlin;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class onActivityResult {
    private boolean AudioAttributesCompatParcelizer;
    private Object write;

    public interface write {
        boolean AudioAttributesCompatParcelizer(onActivityResult onactivityresult, Menu menu);

        boolean IconCompatParcelizer(onActivityResult onactivityresult, MenuItem menuItem);

        void RemoteActionCompatParcelizer(onActivityResult onactivityresult);

        boolean RemoteActionCompatParcelizer(onActivityResult onactivityresult, Menu menu);
    }

    public abstract MenuInflater AudioAttributesCompatParcelizer();

    public abstract void AudioAttributesImplApi21Parcelizer();

    public boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    public abstract CharSequence AudioAttributesImplBaseParcelizer();

    public abstract void IconCompatParcelizer();

    public abstract CharSequence MediaBrowserCompatItemReceiver();

    public abstract Menu RemoteActionCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(int i);

    public abstract void RemoteActionCompatParcelizer(CharSequence charSequence);

    public abstract void read(int i);

    public abstract void read(View view);

    public abstract View write();

    public abstract void write(CharSequence charSequence);

    public final void RemoteActionCompatParcelizer(Object obj) {
        this.write = obj;
    }

    public final Object MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public void write(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final boolean RatingCompat() {
        return this.AudioAttributesCompatParcelizer;
    }
}
