package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.core.utils.widgets.AspectRatioImageView;
import java.util.Arrays;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class getRequiredFeatures extends RecyclerView.onMediaButtonEvent {
    private final CardView AudioAttributesCompatParcelizer;
    private final TextView AudioAttributesImplApi21Parcelizer;
    private final TextView AudioAttributesImplApi26Parcelizer;
    private final TextView AudioAttributesImplBaseParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    private final TextView MediaBrowserCompatCustomActionResultReceiver;
    private final TextView MediaBrowserCompatItemReceiver;
    private final TextView MediaBrowserCompatMediaItem;
    private final ImageView RemoteActionCompatParcelizer;
    private final AspectRatioImageView read;
    private final ImageView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRequiredFeatures(View view) {
        super(view);
        toMagicModuleMetaRepoModel.write(view, "");
        this.AudioAttributesCompatParcelizer = (CardView) view.findViewById(R.id.cvMain);
        this.read = (AspectRatioImageView) view.findViewById(R.id.ivCardImage);
        this.MediaBrowserCompatItemReceiver = (TextView) view.findViewById(R.id.tvCardTag);
        this.MediaBrowserCompatCustomActionResultReceiver = (TextView) view.findViewById(R.id.tvCardTitle);
        this.AudioAttributesImplBaseParcelizer = (TextView) view.findViewById(R.id.tvCardSubtitle);
        this.IconCompatParcelizer = (ConstraintLayout) view.findViewById(R.id.clProLock);
        this.RemoteActionCompatParcelizer = (ImageView) view.findViewById(R.id.ivLock);
        this.AudioAttributesImplApi21Parcelizer = (TextView) view.findViewById(R.id.tvPro);
        this.write = (ImageView) view.findViewById(R.id.ivStatus);
        this.MediaBrowserCompatMediaItem = (TextView) view.findViewById(R.id.tvSubjectTitle);
        this.AudioAttributesImplApi26Parcelizer = (TextView) view.findViewById(R.id.tvRating);
    }

    public final void RemoteActionCompatParcelizer(final unregisterConnectionFailedListener unregisterconnectionfailedlistener, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(unregisterconnectionfailedlistener, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getScopesForConnectionlessNonSignIn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRequiredFeatures.AudioAttributesCompatParcelizer(signInButtonButtonSize, unregisterconnectionfailedlistener);
            }
        });
        AspectRatioImageView aspectRatioImageView = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(aspectRatioImageView, "");
        CmcdHeadersFactoryCmcdSessionBuilder.read((ImageView) aspectRatioImageView, unregisterconnectionfailedlistener.AudioAttributesImplApi26Parcelizer(), true);
        this.MediaBrowserCompatCustomActionResultReceiver.setText(unregisterconnectionfailedlistener.AudioAttributesCompatParcelizer());
        TextView textView = this.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        int i = 0;
        textView.setVisibility(unregisterconnectionfailedlistener.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().length() > 0 ? 0 : 8);
        this.MediaBrowserCompatItemReceiver.setText(unregisterconnectionfailedlistener.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
        this.MediaBrowserCompatItemReceiver.setTextColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(unregisterconnectionfailedlistener.RemoteActionCompatParcelizer().IconCompatParcelizer(), "#ffffff"));
        this.MediaBrowserCompatItemReceiver.setBackgroundColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(unregisterconnectionfailedlistener.RemoteActionCompatParcelizer().read(), "#62c8df"));
        TextView textView2 = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        textView2.setVisibility(unregisterconnectionfailedlistener.MediaMetadataCompat().length() > 0 ? 0 : 8);
        this.AudioAttributesImplBaseParcelizer.setText(unregisterconnectionfailedlistener.MediaMetadataCompat());
        TextView textView3 = this.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        textView3.setVisibility(unregisterconnectionfailedlistener.MediaBrowserCompatSearchResultReceiver().length() > 0 ? 0 : 8);
        this.MediaBrowserCompatMediaItem.setText(unregisterconnectionfailedlistener.MediaBrowserCompatSearchResultReceiver());
        TextView textView4 = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(unregisterconnectionfailedlistener.MediaBrowserCompatItemReceiver())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView4.setText(str);
        int iAudioAttributesImplApi21Parcelizer = unregisterconnectionfailedlistener.AudioAttributesImplApi21Parcelizer();
        if (iAudioAttributesImplApi21Parcelizer == 1) {
            ImageView imageView = this.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
            this.write.setImageDrawable(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_pause_blue));
        } else if (iAudioAttributesImplApi21Parcelizer == 2) {
            ImageView imageView2 = this.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(imageView2);
            this.write.setImageDrawable(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_complete));
        } else {
            ImageView imageView3 = this.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView3);
        }
        ImageView imageView4 = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        imageView4.setVisibility(unregisterconnectionfailedlistener.RatingCompat() ? 0 : 8);
        TextView textView5 = this.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
        textView5.setVisibility(unregisterconnectionfailedlistener.MediaDescriptionCompat() ? 0 : 8);
        ConstraintLayout constraintLayout = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (!unregisterconnectionfailedlistener.RatingCompat() && !unregisterconnectionfailedlistener.MediaDescriptionCompat()) {
            i = 8;
        }
        constraintLayout2.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(SignInButtonButtonSize signInButtonButtonSize, unregisterConnectionFailedListener unregisterconnectionfailedlistener) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.onPause(unregisterconnectionfailedlistener.AudioAttributesImplBaseParcelizer(), unregisterconnectionfailedlistener.MediaBrowserCompatMediaItem().getWrite(), unregisterconnectionfailedlistener.RatingCompat()));
    }
}
