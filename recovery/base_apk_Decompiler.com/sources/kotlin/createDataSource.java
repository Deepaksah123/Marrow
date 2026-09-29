package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createDataSource implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    public final View AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final ConstraintLayout IconCompatParcelizer;
    public final View MediaBrowserCompatCustomActionResultReceiver;
    public final ConstraintLayout MediaBrowserCompatItemReceiver;
    public final MaterialToolbar MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private final ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final ConstraintLayout MediaDescriptionCompat;
    private FrameLayout MediaMetadataCompat;
    public final LinearLayout RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    private ImageView handleMediaPlayPauseIfPendingOnHandler;
    private ImageView onAddQueueItem;
    private ImageView onCommand;
    private Barrier onCustomAction;
    private TextView onMediaButtonEvent;
    private TextView onPause;
    private TextView onPlay;
    public final View read;
    public final ConstraintLayout write;

    private createDataSource(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, View view, View view2, View view3, View view4, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, ConstraintLayout constraintLayout5, Barrier barrier, ConstraintLayout constraintLayout6, LinearLayout linearLayout3, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout;
        this.IconCompatParcelizer = constraintLayout2;
        this.MediaMetadataCompat = frameLayout;
        this.write = constraintLayout3;
        this.RemoteActionCompatParcelizer = constraintLayout4;
        this.AudioAttributesCompatParcelizer = view;
        this.read = view2;
        this.AudioAttributesImplApi21Parcelizer = view3;
        this.MediaBrowserCompatCustomActionResultReceiver = view4;
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.onCommand = imageView;
        this.onAddQueueItem = imageView2;
        this.handleMediaPlayPauseIfPendingOnHandler = imageView3;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.MediaBrowserCompatItemReceiver = constraintLayout5;
        this.onCustomAction = barrier;
        this.MediaDescriptionCompat = constraintLayout6;
        this.RatingCompat = linearLayout3;
        this.MediaBrowserCompatMediaItem = materialToolbar;
        this.onMediaButtonEvent = textView;
        this.onPlay = textView2;
        this.MediaBrowserCompatSearchResultReceiver = textView3;
        this.onPause = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public static createDataSource write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_custom_module_creation, viewGroup, false));
    }

    private static createDataSource AudioAttributesCompatParcelizer(View view) {
        int i = R.id.clFragIndicators;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clFragIndicators);
        if (constraintLayout != null) {
            i = R.id.cmFrameLayout;
            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.cmFrameLayout);
            if (frameLayout != null) {
                i = R.id.first_magic_module_banner;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.first_magic_module_banner);
                if (constraintLayout2 != null) {
                    i = R.id.first_magic_module_banner_cl;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.first_magic_module_banner_cl);
                    if (constraintLayout3 != null) {
                        i = R.id.frag1;
                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.frag1);
                        if (viewIconCompatParcelizer != null) {
                            i = R.id.frag2;
                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.frag2);
                            if (viewIconCompatParcelizer2 != null) {
                                i = R.id.frag3;
                                View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.frag3);
                                if (viewIconCompatParcelizer3 != null) {
                                    i = R.id.frag4;
                                    View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.frag4);
                                    if (viewIconCompatParcelizer4 != null) {
                                        i = R.id.fragmentIndicators;
                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fragmentIndicators);
                                        if (linearLayout != null) {
                                            i = R.id.icMagicModule;
                                            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.icMagicModule);
                                            if (imageView != null) {
                                                i = R.id.iv_magic_module;
                                                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_magic_module);
                                                if (imageView2 != null) {
                                                    i = R.id.iv_right_arrow;
                                                    ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_right_arrow);
                                                    if (imageView3 != null) {
                                                        i = R.id.llContent;
                                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llContent);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.magic_module_banner;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.magic_module_banner);
                                                            if (constraintLayout4 != null) {
                                                                i = R.id.magicModuleBannerBarrier;
                                                                Barrier barrier = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.magicModuleBannerBarrier);
                                                                if (barrier != null) {
                                                                    i = R.id.magic_module_banner_cl;
                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.magic_module_banner_cl);
                                                                    if (constraintLayout5 != null) {
                                                                        i = R.id.magicModuleSolveNow;
                                                                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.magicModuleSolveNow);
                                                                        if (linearLayout3 != null) {
                                                                            i = R.id.toolbar;
                                                                            MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                            if (materialToolbar != null) {
                                                                                i = R.id.tv_magic_module;
                                                                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_magic_module);
                                                                                if (textView != null) {
                                                                                    i = R.id.tv_magic_module_desc;
                                                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_magic_module_desc);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.tvMagicModuleModule;
                                                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMagicModuleModule);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.txtAppbarTitle;
                                                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtAppbarTitle);
                                                                                            if (textView4 != null) {
                                                                                                return new createDataSource((ConstraintLayout) view, constraintLayout, frameLayout, constraintLayout2, constraintLayout3, viewIconCompatParcelizer, viewIconCompatParcelizer2, viewIconCompatParcelizer3, viewIconCompatParcelizer4, linearLayout, imageView, imageView2, imageView3, linearLayout2, constraintLayout4, barrier, constraintLayout5, linearLayout3, materialToolbar, textView, textView2, textView3, textView4);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
