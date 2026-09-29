package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createExtractor implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final RadioButton AudioAttributesImplApi26Parcelizer;
    public final RecyclerView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final RadioButton MediaBrowserCompatCustomActionResultReceiver;
    public final RadioGroup RemoteActionCompatParcelizer;
    public final ConstraintLayout read;
    public final Button write;

    private createExtractor(LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, ConstraintLayout constraintLayout, RadioGroup radioGroup, RecyclerView recyclerView, RadioButton radioButton, RadioButton radioButton2) {
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.AudioAttributesCompatParcelizer = button;
        this.write = button2;
        this.IconCompatParcelizer = linearLayout2;
        this.read = constraintLayout;
        this.RemoteActionCompatParcelizer = radioGroup;
        this.AudioAttributesImplBaseParcelizer = recyclerView;
        this.MediaBrowserCompatCustomActionResultReceiver = radioButton;
        this.AudioAttributesImplApi26Parcelizer = radioButton2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static createExtractor read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.fragment_custom_module_subjects_selection, viewGroup, false));
    }

    private static createExtractor IconCompatParcelizer(View view) {
        int i = R.id.btnNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnNext);
        if (button != null) {
            i = R.id.btnPrevious;
            Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnPrevious);
            if (button2 != null) {
                i = R.id.headerContainer;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.headerContainer);
                if (linearLayout != null) {
                    i = R.id.llPrevNext;
                    ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPrevNext);
                    if (constraintLayout != null) {
                        i = R.id.radioSelectSubjects;
                        RadioGroup radioGroup = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.radioSelectSubjects);
                        if (radioGroup != null) {
                            i = R.id.rvSubjects;
                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvSubjects);
                            if (recyclerView != null) {
                                i = R.id.subjectsAll;
                                RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.subjectsAll);
                                if (radioButton != null) {
                                    i = R.id.subjectsChoose;
                                    RadioButton radioButton2 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.subjectsChoose);
                                    if (radioButton2 != null) {
                                        return new createExtractor((LinearLayout) view, button, button2, linearLayout, constraintLayout, radioGroup, recyclerView, radioButton, radioButton2);
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
