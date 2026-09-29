package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class loadMedia implements getApplicationLabel {
    public final AppCompatEditText AudioAttributesCompatParcelizer;
    private final FrameLayout AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    private LinearLayout MediaBrowserCompatItemReceiver;
    public final ProgressBar RemoteActionCompatParcelizer;
    public final TextView read;
    public final RecyclerView write;

    private loadMedia(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, AppCompatEditText appCompatEditText, LinearLayout linearLayout2, ProgressBar progressBar, RecyclerView recyclerView, TextView textView2) {
        this.AudioAttributesImplApi26Parcelizer = frameLayout;
        this.IconCompatParcelizer = linearLayout;
        this.read = textView;
        this.AudioAttributesCompatParcelizer = appCompatEditText;
        this.MediaBrowserCompatItemReceiver = linearLayout2;
        this.RemoteActionCompatParcelizer = progressBar;
        this.write = recyclerView;
        this.AudioAttributesImplBaseParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static loadMedia IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.fragment_select_college, viewGroup, false));
    }

    private static loadMedia IconCompatParcelizer(View view) {
        int i = R.id.collegeEditContainer;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.collegeEditContainer);
        if (linearLayout != null) {
            i = R.id.description;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.description);
            if (textView != null) {
                i = R.id.etCollegeSearch;
                AppCompatEditText appCompatEditText = (AppCompatEditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etCollegeSearch);
                if (appCompatEditText != null) {
                    i = R.id.llMainLayout;
                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
                    if (linearLayout2 != null) {
                        i = R.id.loadingContainer;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                        if (progressBar != null) {
                            i = R.id.rvColleges;
                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvColleges);
                            if (recyclerView != null) {
                                i = R.id.title;
                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                                if (textView2 != null) {
                                    return new loadMedia((FrameLayout) view, linearLayout, textView, appCompatEditText, linearLayout2, progressBar, recyclerView, textView2);
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
