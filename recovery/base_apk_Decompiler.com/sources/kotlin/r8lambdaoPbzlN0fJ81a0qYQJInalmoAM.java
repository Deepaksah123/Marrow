package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaoPbzlN0fJ81a0qYQJInalmoAM implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    private ImageView AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final getInitialStartTimeUs IconCompatParcelizer;
    private LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final ImageView RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextView write;

    private r8lambdaoPbzlN0fJ81a0qYQJInalmoAM(ConstraintLayout constraintLayout, View view, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, getInitialStartTimeUs getinitialstarttimeus) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = view;
        this.RemoteActionCompatParcelizer = imageView;
        this.AudioAttributesImplApi21Parcelizer = imageView2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout;
        this.write = textView;
        this.read = textView2;
        this.IconCompatParcelizer = getinitialstarttimeus;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static r8lambdaoPbzlN0fJ81a0qYQJInalmoAM RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_topic_row, viewGroup, false));
    }

    public static r8lambdaoPbzlN0fJ81a0qYQJInalmoAM write(View view) {
        int i = R.id.activeTimelineIndicator;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.activeTimelineIndicator);
        if (viewIconCompatParcelizer != null) {
            i = R.id.btnBookmark;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBookmark);
            if (imageView != null) {
                i = R.id.ivTimeline;
                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivTimeline);
                if (imageView2 != null) {
                    i = R.id.rowContainer;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rowContainer);
                    if (linearLayout != null) {
                        i = R.id.timeline_seek_info;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.timeline_seek_info);
                        if (textView != null) {
                            i = R.id.timeline_title;
                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.timeline_title);
                            if (textView2 != null) {
                                i = R.id.updateTag;
                                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.updateTag);
                                if (viewIconCompatParcelizer2 != null) {
                                    return new r8lambdaoPbzlN0fJ81a0qYQJInalmoAM((ConstraintLayout) view, viewIconCompatParcelizer, imageView, imageView2, linearLayout, textView, textView2, getInitialStartTimeUs.read(viewIconCompatParcelizer2));
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
