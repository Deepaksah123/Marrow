package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class onTracksEnded implements getApplicationLabel {
    private final LinearLayout AudioAttributesCompatParcelizer;
    private LinearLayout IconCompatParcelizer;
    public final CheckBox RemoteActionCompatParcelizer;
    public final CheckBox read;
    public final CheckBox write;

    private onTracksEnded(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, LinearLayout linearLayout2) {
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = checkBox;
        this.read = checkBox2;
        this.write = checkBox3;
        this.IconCompatParcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static onTracksEnded write(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static onTracksEnded AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.layout_cm_sub_checkboxes, (ViewGroup) null, false));
    }

    private static onTracksEnded IconCompatParcelizer(View view) {
        int i = R.id.cbCorrectGTQues;
        CheckBox checkBox = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbCorrectGTQues);
        if (checkBox != null) {
            i = R.id.cbIncorrectGTQues;
            CheckBox checkBox2 = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbIncorrectGTQues);
            if (checkBox2 != null) {
                i = R.id.cbSkippedGTQues;
                CheckBox checkBox3 = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbSkippedGTQues);
                if (checkBox3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new onTracksEnded(linearLayout, checkBox, checkBox2, checkBox3, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
