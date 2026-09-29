package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsPlaylistParser implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    private Space AudioAttributesImplApi21Parcelizer;
    public final Group IconCompatParcelizer;
    private final ConstraintLayout MediaBrowserCompatCustomActionResultReceiver;
    public final CustomTextView MediaBrowserCompatItemReceiver;
    public final ImageView RemoteActionCompatParcelizer;
    public final View read;
    public final ImageView write;

    private HlsPlaylistParser(ConstraintLayout constraintLayout, ImageView imageView, CustomTextView customTextView, Group group, ImageView imageView2, View view, Space space, CustomTextView customTextView2) {
        this.MediaBrowserCompatCustomActionResultReceiver = constraintLayout;
        this.write = imageView;
        this.AudioAttributesCompatParcelizer = customTextView;
        this.IconCompatParcelizer = group;
        this.RemoteActionCompatParcelizer = imageView2;
        this.read = view;
        this.AudioAttributesImplApi21Parcelizer = space;
        this.MediaBrowserCompatItemReceiver = customTextView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static HlsPlaylistParser AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnOptionalVideoInfo;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnOptionalVideoInfo);
        if (imageView != null) {
            i = R.id.btnShowOptionalVideos;
            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnShowOptionalVideos);
            if (customTextView != null) {
                i = R.id.groupOptionalVideos;
                Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.groupOptionalVideos);
                if (group != null) {
                    i = R.id.ivShowOptionalVideos;
                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivShowOptionalVideos);
                    if (imageView2 != null) {
                        i = R.id.optionalVideoContainer;
                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.optionalVideoContainer);
                        if (viewIconCompatParcelizer != null) {
                            i = R.id.spaceShowOptionalVideoHolder;
                            Space space = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.spaceShowOptionalVideoHolder);
                            if (space != null) {
                                i = R.id.tvVideoWatchCount;
                                CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoWatchCount);
                                if (customTextView2 != null) {
                                    return new HlsPlaylistParser((ConstraintLayout) view, imageView, customTextView, group, imageView2, viewIconCompatParcelizer, space, customTextView2);
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
