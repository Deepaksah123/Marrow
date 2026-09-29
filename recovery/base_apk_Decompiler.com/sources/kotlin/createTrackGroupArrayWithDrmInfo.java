package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createTrackGroupArrayWithDrmInfo implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final TextView IconCompatParcelizer;
    public final ProgressBar RemoteActionCompatParcelizer;
    public final LinearLayout read;
    private ImageView write;

    private createTrackGroupArrayWithDrmInfo(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.write = imageView;
        this.read = linearLayout2;
        this.RemoteActionCompatParcelizer = progressBar;
        this.IconCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static createTrackGroupArrayWithDrmInfo IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.item_type_qbank_progress, viewGroup, false));
    }

    public static createTrackGroupArrayWithDrmInfo read(View view) {
        int i = R.id.btSuggestedCard;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btSuggestedCard);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.pbSuggestedLesson;
            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbSuggestedLesson);
            if (progressBar != null) {
                i = R.id.tvLessonAttemptStatus;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonAttemptStatus);
                if (textView != null) {
                    i = R.id.tvLessonTitle;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonTitle);
                    if (textView2 != null) {
                        return new createTrackGroupArrayWithDrmInfo(linearLayout, imageView, linearLayout, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
