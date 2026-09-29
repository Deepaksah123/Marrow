package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTemplate implements getApplicationLabel {
    public final CheckBox AudioAttributesCompatParcelizer;
    private final ScrollView AudioAttributesImplApi21Parcelizer;
    private TextView AudioAttributesImplApi26Parcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    public final CheckBox IconCompatParcelizer;
    private ShapeableImageView MediaBrowserCompatCustomActionResultReceiver;
    private TextView MediaBrowserCompatItemReceiver;
    public final CheckBox RemoteActionCompatParcelizer;
    private View read;
    public final Button write;

    private parseTemplate(ScrollView scrollView, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, Button button, View view, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3) {
        this.AudioAttributesImplApi21Parcelizer = scrollView;
        this.RemoteActionCompatParcelizer = checkBox;
        this.AudioAttributesCompatParcelizer = checkBox2;
        this.IconCompatParcelizer = checkBox3;
        this.write = button;
        this.read = view;
        this.MediaBrowserCompatCustomActionResultReceiver = shapeableImageView;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.AudioAttributesImplApi26Parcelizer = textView2;
        this.MediaBrowserCompatItemReceiver = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static parseTemplate AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.dialog_legal_revamp, viewGroup, false));
    }

    private static parseTemplate RemoteActionCompatParcelizer(View view) {
        int i = R.id.condition1;
        CheckBox checkBox = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.condition1);
        if (checkBox != null) {
            i = R.id.condition2;
            CheckBox checkBox2 = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.condition2);
            if (checkBox2 != null) {
                i = R.id.condition3;
                CheckBox checkBox3 = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.condition3);
                if (checkBox3 != null) {
                    i = R.id.dialogConfirmationHighlightButton;
                    Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.dialogConfirmationHighlightButton);
                    if (button != null) {
                        i = R.id.divider;
                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                        if (viewIconCompatParcelizer != null) {
                            i = R.id.ivLogo;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLogo);
                            if (shapeableImageView != null) {
                                i = R.id.tvExplanation;
                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvExplanation);
                                if (textView != null) {
                                    i = R.id.tvHeading;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvHeading);
                                    if (textView2 != null) {
                                        i = R.id.tvLegalDisclaimer;
                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLegalDisclaimer);
                                        if (textView3 != null) {
                                            return new parseTemplate((ScrollView) view, checkBox, checkBox2, checkBox3, button, viewIconCompatParcelizer, shapeableImageView, textView, textView2, textView3);
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
