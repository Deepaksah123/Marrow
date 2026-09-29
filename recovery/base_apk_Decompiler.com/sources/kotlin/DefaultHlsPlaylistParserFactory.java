package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsPlaylistParserFactory implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final Toolbar AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final ScrollView MediaBrowserCompatCustomActionResultReceiver;
    public final ImageView MediaBrowserCompatItemReceiver;
    private final ConstraintLayout MediaBrowserCompatMediaItem;
    private TextView MediaMetadataCompat;
    private TextInputLayout RatingCompat;
    public final EditText RemoteActionCompatParcelizer;
    public final Button read;
    public final ImageView write;

    private DefaultHlsPlaylistParserFactory(ConstraintLayout constraintLayout, Button button, EditText editText, TextInputLayout textInputLayout, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ScrollView scrollView, Toolbar toolbar, TextView textView) {
        this.MediaBrowserCompatMediaItem = constraintLayout;
        this.read = button;
        this.RemoteActionCompatParcelizer = editText;
        this.RatingCompat = textInputLayout;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.write = imageView;
        this.IconCompatParcelizer = imageView2;
        this.AudioAttributesImplBaseParcelizer = imageView3;
        this.MediaBrowserCompatItemReceiver = imageView4;
        this.AudioAttributesImplApi26Parcelizer = imageView5;
        this.MediaBrowserCompatCustomActionResultReceiver = scrollView;
        this.AudioAttributesImplApi21Parcelizer = toolbar;
        this.MediaMetadataCompat = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public static DefaultHlsPlaylistParserFactory RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.layout_signup_password, viewGroup, false));
    }

    private static DefaultHlsPlaylistParserFactory IconCompatParcelizer(View view) {
        int i = R.id.btnEmailPasswordLogin;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEmailPasswordLogin);
        if (button != null) {
            i = R.id.etPassword;
            EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etPassword);
            if (editText != null) {
                i = R.id.etPasswordLayout;
                TextInputLayout textInputLayout = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.etPasswordLayout);
                if (textInputLayout != null) {
                    i = R.id.llMainLayout;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
                    if (linearLayout != null) {
                        i = R.id.minimumCharactersTick;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.minimumCharactersTick);
                        if (imageView != null) {
                            i = R.id.oneCapsLetterTick;
                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.oneCapsLetterTick);
                            if (imageView2 != null) {
                                i = R.id.oneNumberTick;
                                ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.oneNumberTick);
                                if (imageView3 != null) {
                                    i = R.id.oneSmallLetterTick;
                                    ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.oneSmallLetterTick);
                                    if (imageView4 != null) {
                                        i = R.id.oneSpecialCharTick;
                                        ImageView imageView5 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.oneSpecialCharTick);
                                        if (imageView5 != null) {
                                            i = R.id.svMain;
                                            ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.svMain);
                                            if (scrollView != null) {
                                                i = R.id.toolbar;
                                                Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                if (toolbar != null) {
                                                    i = R.id.tvPassword;
                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPassword);
                                                    if (textView != null) {
                                                        return new DefaultHlsPlaylistParserFactory((ConstraintLayout) view, button, editText, textInputLayout, linearLayout, imageView, imageView2, imageView3, imageView4, imageView5, scrollView, toolbar, textView);
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
