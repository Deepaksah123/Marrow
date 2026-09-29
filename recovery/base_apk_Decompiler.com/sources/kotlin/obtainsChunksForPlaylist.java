package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class obtainsChunksForPlaylist implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private FrameLayout AudioAttributesImplApi26Parcelizer;
    private ImageView IconCompatParcelizer;
    private ImageView MediaBrowserCompatCustomActionResultReceiver;
    private final FrameLayout MediaBrowserCompatItemReceiver;
    public final Button RemoteActionCompatParcelizer;
    public final Button read;
    public final LinearLayout write;

    private obtainsChunksForPlaylist(FrameLayout frameLayout, Button button, Button button2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, FrameLayout frameLayout2, TextView textView) {
        this.MediaBrowserCompatItemReceiver = frameLayout;
        this.read = button;
        this.RemoteActionCompatParcelizer = button2;
        this.IconCompatParcelizer = imageView;
        this.MediaBrowserCompatCustomActionResultReceiver = imageView2;
        this.write = linearLayout;
        this.AudioAttributesImplApi26Parcelizer = frameLayout2;
        this.AudioAttributesCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static obtainsChunksForPlaylist AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_onboard_landing, viewGroup, false));
    }

    private static obtainsChunksForPlaylist write(View view) {
        int i = R.id.btnLogin;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnLogin);
        if (button != null) {
            i = R.id.btnSignUp;
            Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSignUp);
            if (button2 != null) {
                i = R.id.ivLogo;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLogo);
                if (imageView != null) {
                    i = R.id.ivLogoText;
                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLogoText);
                    if (imageView2 != null) {
                        i = R.id.llMain;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMain);
                        if (linearLayout != null) {
                            FrameLayout frameLayout = (FrameLayout) view;
                            i = R.id.tvTermsAndCondition;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTermsAndCondition);
                            if (textView != null) {
                                return new obtainsChunksForPlaylist(frameLayout, button, button2, imageView, imageView2, linearLayout, frameLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
