package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.search.SearchBar;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackOutputCryptoData {
    private Animator AudioAttributesCompatParcelizer;
    private Animator MediaBrowserCompatCustomActionResultReceiver;
    private final Set<Object> IconCompatParcelizer = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> RemoteActionCompatParcelizer = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> write = new LinkedHashSet();
    private boolean read = true;
    private Animator MediaBrowserCompatItemReceiver = null;

    /* JADX WARN: Multi-variable type inference failed */
    public final void AudioAttributesCompatParcelizer(SearchBar searchBar) {
        View viewOnPrepareFromSearch = searchBar.onPrepareFromSearch();
        if (viewOnPrepareFromSearch instanceof BinarySearchSeekerDefaultSeekTimestampConverter) {
        }
        if (viewOnPrepareFromSearch != 0) {
            viewOnPrepareFromSearch.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
