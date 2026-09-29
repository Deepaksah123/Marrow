package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setIsPrepared implements getApplicationLabel {
    public final CheckBox AudioAttributesCompatParcelizer;
    public final CheckBox IconCompatParcelizer;
    private final LinearLayout RemoteActionCompatParcelizer;
    public final CheckBox read;
    private LinearLayout write;

    private setIsPrepared(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, LinearLayout linearLayout2) {
        this.RemoteActionCompatParcelizer = linearLayout;
        this.read = checkBox;
        this.AudioAttributesCompatParcelizer = checkBox2;
        this.IconCompatParcelizer = checkBox3;
        this.write = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static setIsPrepared AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static setIsPrepared write(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.layout_cm_sub_bookmarks, (ViewGroup) null, false));
    }

    private static setIsPrepared write(View view) {
        int i = R.id.cbBookmarkedQues;
        CheckBox checkBox = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbBookmarkedQues);
        if (checkBox != null) {
            i = R.id.cbQuestionedQues;
            CheckBox checkBox2 = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbQuestionedQues);
            if (checkBox2 != null) {
                i = R.id.cbStaredQues;
                CheckBox checkBox3 = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbStaredQues);
                if (checkBox3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new setIsPrepared(linearLayout, checkBox, checkBox2, checkBox3, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
