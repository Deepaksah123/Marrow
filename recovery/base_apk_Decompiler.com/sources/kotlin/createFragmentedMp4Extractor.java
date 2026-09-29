package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createFragmentedMp4Extractor implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final ProgressBar AudioAttributesImplApi21Parcelizer;
    public final ScrollView AudioAttributesImplApi26Parcelizer;
    public final FlexboxLayout AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final RadioButton MediaBrowserCompatCustomActionResultReceiver;
    public final RadioButton MediaBrowserCompatItemReceiver;
    private RadioGroup MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    private final LinearLayout RatingCompat;
    public final Button RemoteActionCompatParcelizer;
    public final CheckBox read;
    public final ConstraintLayout write;

    private createFragmentedMp4Extractor(LinearLayout linearLayout, Button button, Button button2, CheckBox checkBox, LinearLayout linearLayout2, ConstraintLayout constraintLayout, ProgressBar progressBar, RadioGroup radioGroup, FlexboxLayout flexboxLayout, ScrollView scrollView, RadioButton radioButton, RadioButton radioButton2, LinearLayout linearLayout3) {
        this.RatingCompat = linearLayout;
        this.IconCompatParcelizer = button;
        this.RemoteActionCompatParcelizer = button2;
        this.read = checkBox;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.write = constraintLayout;
        this.AudioAttributesImplApi21Parcelizer = progressBar;
        this.MediaDescriptionCompat = radioGroup;
        this.AudioAttributesImplBaseParcelizer = flexboxLayout;
        this.AudioAttributesImplApi26Parcelizer = scrollView;
        this.MediaBrowserCompatCustomActionResultReceiver = radioButton;
        this.MediaBrowserCompatItemReceiver = radioButton2;
        this.MediaMetadataCompat = linearLayout3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public static createFragmentedMp4Extractor IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_custom_module_tags_selection, viewGroup, false));
    }

    private static createFragmentedMp4Extractor write(View view) {
        int i = R.id.btnNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnNext);
        if (button != null) {
            i = R.id.btnPrevious;
            Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnPrevious);
            if (button2 != null) {
                i = R.id.cbUntaggedMcqs;
                CheckBox checkBox = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbUntaggedMcqs);
                if (checkBox != null) {
                    i = R.id.container;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
                    if (linearLayout != null) {
                        i = R.id.llPrevNext;
                        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPrevNext);
                        if (constraintLayout != null) {
                            i = R.id.pbTags;
                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbTags);
                            if (progressBar != null) {
                                i = R.id.radioSelectTags;
                                RadioGroup radioGroup = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.radioSelectTags);
                                if (radioGroup != null) {
                                    i = R.id.rvTags;
                                    FlexboxLayout flexboxLayout = (FlexboxLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rvTags);
                                    if (flexboxLayout != null) {
                                        i = R.id.scroll_container_tags;
                                        ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scroll_container_tags);
                                        if (scrollView != null) {
                                            i = R.id.tagsAll;
                                            RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.tagsAll);
                                            if (radioButton != null) {
                                                i = R.id.tagsChoose;
                                                RadioButton radioButton2 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.tagsChoose);
                                                if (radioButton2 != null) {
                                                    i = R.id.unTagContainer;
                                                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.unTagContainer);
                                                    if (linearLayout2 != null) {
                                                        return new createFragmentedMp4Extractor((LinearLayout) view, button, button2, checkBox, linearLayout, constraintLayout, progressBar, radioGroup, flexboxLayout, scrollView, radioButton, radioButton2, linearLayout2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
