package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getCacheKey implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final MaterialCardView AudioAttributesImplApi21Parcelizer;
    public final MaterialCardView AudioAttributesImplApi26Parcelizer;
    public final MaterialCardView AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatMediaItem;
    private TextView MediaDescriptionCompat;
    private final CardView RatingCompat;
    public final EditText RemoteActionCompatParcelizer;
    public final EditText read;
    public final Button write;

    private getCacheKey(CardView cardView, Button button, EditText editText, Button button2, EditText editText2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3) {
        this.RatingCompat = cardView;
        this.write = button;
        this.RemoteActionCompatParcelizer = editText;
        this.IconCompatParcelizer = button2;
        this.read = editText2;
        this.MediaBrowserCompatMediaItem = textView;
        this.MediaDescriptionCompat = textView2;
        this.AudioAttributesCompatParcelizer = textView3;
        this.MediaBrowserCompatItemReceiver = textView4;
        this.MediaBrowserCompatCustomActionResultReceiver = textView5;
        this.AudioAttributesImplApi26Parcelizer = materialCardView;
        this.AudioAttributesImplApi21Parcelizer = materialCardView2;
        this.AudioAttributesImplBaseParcelizer = materialCardView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public static getCacheKey IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.dialog_callback_fragment, viewGroup, false));
    }

    private static getCacheKey read(View view) {
        int i = R.id.callback_button;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.callback_button);
        if (button != null) {
            i = R.id.callback_phone_number;
            EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.callback_phone_number);
            if (editText != null) {
                i = R.id.cancel_button;
                Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.cancel_button);
                if (button2 != null) {
                    i = R.id.country_code;
                    EditText editText2 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.country_code);
                    if (editText2 != null) {
                        i = R.id.dialogSubTitleView;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialogSubTitleView);
                        if (textView != null) {
                            i = R.id.dialogTitleView;
                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialogTitleView);
                            if (textView2 != null) {
                                i = R.id.slot1Text;
                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.slot1Text);
                                if (textView3 != null) {
                                    i = R.id.slot2Text;
                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.slot2Text);
                                    if (textView4 != null) {
                                        i = R.id.slot3Text;
                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.slot3Text);
                                        if (textView5 != null) {
                                            i = R.id.timeSlot1;
                                            MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.timeSlot1);
                                            if (materialCardView != null) {
                                                i = R.id.timeSlot2;
                                                MaterialCardView materialCardView2 = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.timeSlot2);
                                                if (materialCardView2 != null) {
                                                    i = R.id.timeSlot3;
                                                    MaterialCardView materialCardView3 = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.timeSlot3);
                                                    if (materialCardView3 != null) {
                                                        return new getCacheKey((CardView) view, button, editText, button2, editText2, textView, textView2, textView3, textView4, textView5, materialCardView, materialCardView2, materialCardView3);
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
