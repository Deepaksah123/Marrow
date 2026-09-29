package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class addSegment implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final Toolbar AudioAttributesImplBaseParcelizer;
    public final ProgressBar IconCompatParcelizer;
    public final EditText RemoteActionCompatParcelizer;
    public final ScrollView read;
    public final LinearLayout write;

    private addSegment(ConstraintLayout constraintLayout, Button button, EditText editText, LinearLayout linearLayout, ProgressBar progressBar, ScrollView scrollView, Toolbar toolbar) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = button;
        this.RemoteActionCompatParcelizer = editText;
        this.write = linearLayout;
        this.IconCompatParcelizer = progressBar;
        this.read = scrollView;
        this.AudioAttributesImplBaseParcelizer = toolbar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static addSegment RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.layout_signup_fullname, viewGroup, false));
    }

    private static addSegment write(View view) {
        int i = R.id.btnFullNameNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnFullNameNext);
        if (button != null) {
            i = R.id.etFullName;
            EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etFullName);
            if (editText != null) {
                i = R.id.llMainLayout;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
                if (linearLayout != null) {
                    i = R.id.loadingContainer;
                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                    if (progressBar != null) {
                        i = R.id.svMain;
                        ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.svMain);
                        if (scrollView != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                            if (toolbar != null) {
                                return new addSegment((ConstraintLayout) view, button, editText, linearLayout, progressBar, scrollView, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
