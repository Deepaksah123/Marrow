package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sniffQuietly implements getApplicationLabel {
    public final RecyclerView AudioAttributesCompatParcelizer;
    public final RadioButton AudioAttributesImplApi21Parcelizer;
    public final MaterialToolbar AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final CardView IconCompatParcelizer;
    public final RadioButton MediaBrowserCompatCustomActionResultReceiver;
    private final ConstraintLayout MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatSearchResultReceiver;
    public final RadioGroup RemoteActionCompatParcelizer;
    public final LinearLayout read;
    public final LinearLayout write;

    private sniffQuietly(ConstraintLayout constraintLayout, CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, RadioGroup radioGroup, RecyclerView recyclerView, MaterialToolbar materialToolbar, RadioButton radioButton, RadioButton radioButton2, TextView textView, TextView textView2) {
        this.MediaBrowserCompatItemReceiver = constraintLayout;
        this.IconCompatParcelizer = cardView;
        this.read = linearLayout;
        this.write = linearLayout2;
        this.RemoteActionCompatParcelizer = radioGroup;
        this.AudioAttributesCompatParcelizer = recyclerView;
        this.AudioAttributesImplApi26Parcelizer = materialToolbar;
        this.AudioAttributesImplApi21Parcelizer = radioButton;
        this.MediaBrowserCompatCustomActionResultReceiver = radioButton2;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.MediaBrowserCompatSearchResultReceiver = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static sniffQuietly write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_custom_module_topics_selection, viewGroup, false));
    }

    private static sniffQuietly read(View view) {
        int i = R.id.done;
        CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.done);
        if (cardView != null) {
            i = R.id.headerContainer;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.headerContainer);
            if (linearLayout != null) {
                i = R.id.llOuterContainer;
                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llOuterContainer);
                if (linearLayout2 != null) {
                    i = R.id.radioSelectTopics;
                    RadioGroup radioGroup = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.radioSelectTopics);
                    if (radioGroup != null) {
                        i = R.id.rvTopics;
                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvTopics);
                        if (recyclerView != null) {
                            i = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i = R.id.topicsAll;
                                RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.topicsAll);
                                if (radioButton != null) {
                                    i = R.id.topicsChoose;
                                    RadioButton radioButton2 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.topicsChoose);
                                    if (radioButton2 != null) {
                                        i = R.id.tvSubjectTitle;
                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectTitle);
                                        if (textView != null) {
                                            i = R.id.txtAppbarTitle;
                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtAppbarTitle);
                                            if (textView2 != null) {
                                                return new sniffQuietly((ConstraintLayout) view, cardView, linearLayout, linearLayout2, radioGroup, recyclerView, materialToolbar, radioButton, radioButton2, textView, textView2);
                                            }
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
