package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getNextMediaSequenceAndPartIndex implements getApplicationLabel {
    public final maybeSelectNewPrimaryUrl AudioAttributesCompatParcelizer;
    public final RecyclerView AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final copyWith AudioAttributesImplBaseParcelizer;
    public final AppBarLayout IconCompatParcelizer;
    public final TabLayout MediaBrowserCompatCustomActionResultReceiver;
    private CollapsingToolbarLayout MediaBrowserCompatItemReceiver;
    public final maybeThrowPlaylistRefreshError RemoteActionCompatParcelizer;
    public final CoordinatorLayout read;
    public final ComposeView write;

    private getNextMediaSequenceAndPartIndex(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ComposeView composeView, maybeSelectNewPrimaryUrl maybeselectnewprimaryurl, maybeThrowPlaylistRefreshError maybethrowplaylistrefresherror, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, TabLayout tabLayout, copyWith copywith) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.IconCompatParcelizer = appBarLayout;
        this.MediaBrowserCompatItemReceiver = collapsingToolbarLayout;
        this.write = composeView;
        this.AudioAttributesCompatParcelizer = maybeselectnewprimaryurl;
        this.RemoteActionCompatParcelizer = maybethrowplaylistrefresherror;
        this.read = coordinatorLayout;
        this.AudioAttributesImplApi21Parcelizer = recyclerView;
        this.MediaBrowserCompatCustomActionResultReceiver = tabLayout;
        this.AudioAttributesImplBaseParcelizer = copywith;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static getNextMediaSequenceAndPartIndex AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.fragment_home_test, viewGroup, false));
    }

    private static getNextMediaSequenceAndPartIndex IconCompatParcelizer(View view) {
        int i = R.id.appbarGTa;
        AppBarLayout appBarLayout = (AppBarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.appbarGTa);
        if (appBarLayout != null) {
            i = R.id.collapsing_toolbar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.collapsing_toolbar);
            if (collapsingToolbarLayout != null) {
                i = R.id.composeGta;
                ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.composeGta);
                if (composeView != null) {
                    i = R.id.emptyLayout;
                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.emptyLayout);
                    if (viewIconCompatParcelizer != null) {
                        maybeSelectNewPrimaryUrl maybeselectnewprimaryurlWrite = maybeSelectNewPrimaryUrl.write(viewIconCompatParcelizer);
                        i = R.id.loadingContainer;
                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                        if (viewIconCompatParcelizer2 != null) {
                            maybeThrowPlaylistRefreshError maybethrowplaylistrefresherrorIconCompatParcelizer = maybeThrowPlaylistRefreshError.IconCompatParcelizer(viewIconCompatParcelizer2);
                            i = R.id.parent;
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.parent);
                            if (coordinatorLayout != null) {
                                i = R.id.rvMainList;
                                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvMainList);
                                if (recyclerView != null) {
                                    i = R.id.tabs;
                                    TabLayout tabLayout = (TabLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tabs);
                                    if (tabLayout != null) {
                                        i = R.id.toolbar;
                                        View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                        if (viewIconCompatParcelizer3 != null) {
                                            return new getNextMediaSequenceAndPartIndex((ConstraintLayout) view, appBarLayout, collapsingToolbarLayout, composeView, maybeselectnewprimaryurlWrite, maybethrowplaylistrefresherrorIconCompatParcelizer, coordinatorLayout, recyclerView, tabLayout, copyWith.AudioAttributesCompatParcelizer(viewIconCompatParcelizer3));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
