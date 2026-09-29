package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class isSnapshotValid implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi26Parcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    private ProgressBar IconCompatParcelizer;
    private final ConstraintLayout MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final Toolbar read;
    public final RecyclerView write;

    private isSnapshotValid(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, Toolbar toolbar, TextView textView2, TextView textView3) {
        this.MediaBrowserCompatItemReceiver = constraintLayout;
        this.RemoteActionCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = progressBar;
        this.write = recyclerView;
        this.read = toolbar;
        this.AudioAttributesImplBaseParcelizer = textView2;
        this.AudioAttributesImplApi26Parcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static isSnapshotValid read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.multiple_account_associated, viewGroup, false));
    }

    private static isSnapshotValid write(View view) {
        int i = R.id.btnLogout;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnLogout);
        if (textView != null) {
            i = R.id.llLayout;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llLayout);
            if (linearLayout != null) {
                i = R.id.loadingContainer;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                if (progressBar != null) {
                    i = R.id.rvAccountsList;
                    RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvAccountsList);
                    if (recyclerView != null) {
                        i = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                        if (toolbar != null) {
                            i = R.id.tvNotYourAccount;
                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNotYourAccount);
                            if (textView2 != null) {
                                i = R.id.tvOtpHeader;
                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvOtpHeader);
                                if (textView3 != null) {
                                    return new isSnapshotValid((ConstraintLayout) view, textView, linearLayout, progressBar, recyclerView, toolbar, textView2, textView3);
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
