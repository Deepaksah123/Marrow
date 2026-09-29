package kotlin;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public interface UntypedObjectDeserializerNRScope {
    default void AudioAttributesCompatParcelizer(Menu menu) {
    }

    void RemoteActionCompatParcelizer(Menu menu, MenuInflater menuInflater);

    boolean RemoteActionCompatParcelizer(MenuItem menuItem);

    default void read(Menu menu) {
    }
}
