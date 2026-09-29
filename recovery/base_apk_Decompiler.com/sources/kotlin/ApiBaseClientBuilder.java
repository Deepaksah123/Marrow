package kotlin;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.core.utils.widgets.AspectRatioImageView;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiBaseClientBuilder extends RecyclerView.onMediaButtonEvent {
    private final TextView AudioAttributesCompatParcelizer;
    private final TextView IconCompatParcelizer;
    private final TextView RemoteActionCompatParcelizer;
    private final AspectRatioImageView read;
    private final CardView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiBaseClientBuilder(View view) {
        super(view);
        toMagicModuleMetaRepoModel.write(view, "");
        this.write = (CardView) view.findViewById(R.id.cvMain);
        this.read = (AspectRatioImageView) view.findViewById(R.id.ivCardImage);
        this.IconCompatParcelizer = (TextView) view.findViewById(R.id.tvCardTag);
        this.RemoteActionCompatParcelizer = (TextView) view.findViewById(R.id.tvCardTitle);
        this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(R.id.tvCardSubtitle);
    }

    public final void write(final GoogleApiActivity googleApiActivity, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(googleApiActivity, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.write.setOnClickListener(new View.OnClickListener() { // from class: o.ApiClient
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApiBaseClientBuilder.AudioAttributesCompatParcelizer(googleApiActivity, signInButtonButtonSize);
            }
        });
        AspectRatioImageView aspectRatioImageView = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(aspectRatioImageView, "");
        CmcdHeadersFactoryCmcdSessionBuilder.read((ImageView) aspectRatioImageView, googleApiActivity.AudioAttributesImplApi26Parcelizer(), true);
        if (googleApiActivity.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().length() > 0) {
            this.IconCompatParcelizer.setText(googleApiActivity.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
        } else {
            long jIconCompatParcelizer = DataSchemeDataSource.IconCompatParcelizer(googleApiActivity.MediaBrowserCompatSearchResultReceiver());
            if (System.currentTimeMillis() > jIconCompatParcelizer) {
                this.IconCompatParcelizer.setText(this.itemView.getContext().getResources().getString(R.string.label_live_video_tag));
            } else {
                new write(jIconCompatParcelizer - System.currentTimeMillis(), this).start();
            }
        }
        this.IconCompatParcelizer.setTextColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(googleApiActivity.RemoteActionCompatParcelizer().IconCompatParcelizer(), "#ffffff"));
        this.IconCompatParcelizer.setBackgroundColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(googleApiActivity.RemoteActionCompatParcelizer().read(), "#e98679"));
        this.RemoteActionCompatParcelizer.setText(googleApiActivity.AudioAttributesImplApi21Parcelizer());
        this.AudioAttributesCompatParcelizer.setText(googleApiActivity.MediaMetadataCompat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(GoogleApiActivity googleApiActivity, SignInButtonButtonSize signInButtonButtonSize) {
        long jIconCompatParcelizer = DataSchemeDataSource.IconCompatParcelizer(googleApiActivity.MediaBrowserCompatSearchResultReceiver());
        if (System.currentTimeMillis() > jIconCompatParcelizer) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) googleApiActivity.RatingCompat(), (Object) "ext_video")) {
                signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.onPlay(googleApiActivity.AudioAttributesImplBaseParcelizer(), googleApiActivity.MediaBrowserCompatItemReceiver().getWrite()));
                return;
            } else {
                signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.onCustomAction(googleApiActivity.AudioAttributesImplBaseParcelizer(), googleApiActivity.MediaBrowserCompatItemReceiver().getWrite()));
                return;
            }
        }
        signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.handleMediaPlayPauseIfPendingOnHandler(googleApiActivity.AudioAttributesImplBaseParcelizer(), jIconCompatParcelizer, googleApiActivity.MediaBrowserCompatItemReceiver().getWrite()));
    }

    public static final class write extends CountDownTimer {
        private /* synthetic */ ApiBaseClientBuilder write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(long j, ApiBaseClientBuilder apiBaseClientBuilder) {
            super(j, 1000L);
            this.write = apiBaseClientBuilder;
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            this.write.IconCompatParcelizer.setText(this.write.itemView.getContext().getResources().getString(R.string.label_live_in_text, loadBitmap.write(j)));
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.write.IconCompatParcelizer.setText(this.write.itemView.getContext().getResources().getString(R.string.label_live_video_tag));
        }
    }
}
