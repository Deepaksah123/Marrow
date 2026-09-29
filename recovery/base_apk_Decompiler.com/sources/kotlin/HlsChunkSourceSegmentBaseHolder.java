package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsChunkSourceSegmentBaseHolder implements getApplicationLabel {
    public static int MediaBrowserCompatSearchResultReceiver;
    public static int MediaDescriptionCompat;
    public final ComposeView AudioAttributesCompatParcelizer;
    public final ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final EditText MediaBrowserCompatCustomActionResultReceiver;
    public final ScrollView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    private final ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private LinearLayout MediaMetadataCompat;
    public final TextView RatingCompat;
    public final ProgressBar RemoteActionCompatParcelizer;
    private LinearLayout handleMediaPlayPauseIfPendingOnHandler;
    private TextView onAddQueueItem;
    private TextView onCommand;
    private TextView onCustomAction;
    private TextView onPlayFromMediaId;
    public final ImageView read;
    public final ImageView write;

    private HlsChunkSourceSegmentBaseHolder(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, ComposeView composeView, ProgressBar progressBar, EditText editText, ScrollView scrollView, DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, LinearLayout linearLayout2, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout;
        this.write = imageView;
        this.read = imageView2;
        this.IconCompatParcelizer = textView;
        this.MediaMetadataCompat = linearLayout;
        this.AudioAttributesCompatParcelizer = composeView;
        this.RemoteActionCompatParcelizer = progressBar;
        this.MediaBrowserCompatCustomActionResultReceiver = editText;
        this.MediaBrowserCompatItemReceiver = scrollView;
        this.AudioAttributesImplBaseParcelizer = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener;
        this.handleMediaPlayPauseIfPendingOnHandler = linearLayout2;
        this.AudioAttributesImplApi21Parcelizer = constraintLayout2;
        this.AudioAttributesImplApi26Parcelizer = textView2;
        this.onCustomAction = textView3;
        this.RatingCompat = textView4;
        this.onAddQueueItem = textView5;
        this.onCommand = textView6;
        this.MediaBrowserCompatMediaItem = textView7;
        this.onPlayFromMediaId = textView8;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public static HlsChunkSourceSegmentBaseHolder write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_profile_edit_marrow, viewGroup, false));
    }

    private static HlsChunkSourceSegmentBaseHolder RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnBack;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBack);
        if (imageView != null) {
            i = R.id.btnEditFullName;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEditFullName);
            if (imageView2 != null) {
                i = R.id.btnSaveProfile;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSaveProfile);
                if (textView != null) {
                    i = R.id.clCollegeDetails;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clCollegeDetails);
                    if (linearLayout != null) {
                        i = R.id.compose_dialog_host;
                        ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.compose_dialog_host);
                        if (composeView != null) {
                            i = R.id.editProgressBar;
                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.editProgressBar);
                            if (progressBar != null) {
                                i = R.id.etFullName;
                                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etFullName);
                                if (editText != null) {
                                    i = R.id.layoutContent;
                                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.layoutContent);
                                    if (scrollView != null) {
                                        i = R.id.layout_profile;
                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.layout_profile);
                                        if (viewIconCompatParcelizer != null) {
                                            DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener = DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read(viewIconCompatParcelizer);
                                            i = R.id.llYearDetails;
                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llYearDetails);
                                            if (linearLayout2 != null) {
                                                i = R.id.toolbar;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                if (constraintLayout != null) {
                                                    i = R.id.tvCollege;
                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCollege);
                                                    if (textView2 != null) {
                                                        i = R.id.tvCollegeHeading;
                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCollegeHeading);
                                                        if (textView3 != null) {
                                                            i = R.id.tvFullName;
                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFullName);
                                                            if (textView4 != null) {
                                                                i = R.id.tvFullNameHeading;
                                                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFullNameHeading);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvProfile;
                                                                    TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProfile);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tvYearOfAdmission;
                                                                        TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvYearOfAdmission);
                                                                        if (textView7 != null) {
                                                                            i = R.id.tvYearOfAdmissionHeading;
                                                                            TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvYearOfAdmissionHeading);
                                                                            if (textView8 != null) {
                                                                                return new HlsChunkSourceSegmentBaseHolder((ConstraintLayout) view, imageView, imageView2, textView, linearLayout, composeView, progressBar, editText, scrollView, defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, linearLayout2, constraintLayout, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static int write() {
        int i = MediaDescriptionCompat;
        int i2 = i % 5572700;
        MediaDescriptionCompat = i + 1;
        if (i2 != 0) {
            return MediaBrowserCompatSearchResultReceiver;
        }
        int iNextInt = new Random().nextInt();
        MediaBrowserCompatSearchResultReceiver = iNextInt;
        return iNextInt;
    }
}
