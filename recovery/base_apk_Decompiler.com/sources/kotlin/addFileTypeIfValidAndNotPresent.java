package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class addFileTypeIfValidAndNotPresent implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final RecyclerView IconCompatParcelizer;
    public final Toolbar MediaBrowserCompatCustomActionResultReceiver;
    public final CardView RemoteActionCompatParcelizer;
    public final ProgressBar read;
    public final TextView write;

    private addFileTypeIfValidAndNotPresent(ConstraintLayout constraintLayout, TextView textView, CardView cardView, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, Toolbar toolbar) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.write = textView;
        this.RemoteActionCompatParcelizer = cardView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.read = progressBar;
        this.IconCompatParcelizer = recyclerView;
        this.MediaBrowserCompatCustomActionResultReceiver = toolbar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static addFileTypeIfValidAndNotPresent RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_course_switch, viewGroup, false));
    }

    private static addFileTypeIfValidAndNotPresent AudioAttributesCompatParcelizer(View view) {
        int i = R.id.currentEdition;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.currentEdition);
        if (textView != null) {
            i = R.id.done;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.done);
            if (cardView != null) {
                i = R.id.llMainLayout;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
                if (linearLayout != null) {
                    i = R.id.loadingContainer;
                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                    if (progressBar != null) {
                        i = R.id.rv_courses;
                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rv_courses);
                        if (recyclerView != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                            if (toolbar != null) {
                                return new addFileTypeIfValidAndNotPresent((ConstraintLayout) view, textView, cardView, linearLayout, progressBar, recyclerView, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
