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
public final class getAvailableFeatures extends RecyclerView.onMediaButtonEvent {
    private final AspectRatioImageView AudioAttributesCompatParcelizer;
    private final TextView AudioAttributesImplApi21Parcelizer;
    private final TextView AudioAttributesImplApi26Parcelizer;
    private final TextView AudioAttributesImplBaseParcelizer;
    private final CardView IconCompatParcelizer;
    private final TextView MediaBrowserCompatCustomActionResultReceiver;
    private final TextView MediaBrowserCompatItemReceiver;
    private final TextView MediaDescriptionCompat;
    private final ImageView RemoteActionCompatParcelizer;
    private final ImageView read;
    private final ConstraintLayout write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAvailableFeatures(View view) {
        super(view);
        toMagicModuleMetaRepoModel.write(view, "");
        this.IconCompatParcelizer = (CardView) view.findViewById(R.id.cvMain);
        this.AudioAttributesCompatParcelizer = (AspectRatioImageView) view.findViewById(R.id.ivCardImage);
        this.MediaBrowserCompatItemReceiver = (TextView) view.findViewById(R.id.tvCardTag);
        this.AudioAttributesImplApi21Parcelizer = (TextView) view.findViewById(R.id.tvCardTitle);
        this.AudioAttributesImplBaseParcelizer = (TextView) view.findViewById(R.id.tvCardSubtitle);
        this.write = (ConstraintLayout) view.findViewById(R.id.clProLock);
        this.read = (ImageView) view.findViewById(R.id.ivLock);
        this.MediaBrowserCompatCustomActionResultReceiver = (TextView) view.findViewById(R.id.tvPro);
        this.RemoteActionCompatParcelizer = (ImageView) view.findViewById(R.id.ivStatus);
        this.MediaDescriptionCompat = (TextView) view.findViewById(R.id.tvSubjectTitle);
        this.AudioAttributesImplApi26Parcelizer = (TextView) view.findViewById(R.id.tvRating);
    }

    public final void IconCompatParcelizer(final hasConnectedApi hasconnectedapi, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(hasconnectedapi, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isConnecting
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getAvailableFeatures.IconCompatParcelizer(signInButtonButtonSize, hasconnectedapi);
            }
        });
        AspectRatioImageView aspectRatioImageView = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(aspectRatioImageView, "");
        CmcdHeadersFactoryCmcdSessionBuilder.read((ImageView) aspectRatioImageView, hasconnectedapi.AudioAttributesImplApi26Parcelizer(), true);
        this.AudioAttributesImplApi21Parcelizer.setText(hasconnectedapi.AudioAttributesCompatParcelizer());
        TextView textView = this.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        int i = 0;
        textView.setVisibility(hasconnectedapi.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().length() > 0 ? 0 : 8);
        this.MediaBrowserCompatItemReceiver.setText(hasconnectedapi.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
        this.MediaBrowserCompatItemReceiver.setTextColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(hasconnectedapi.RemoteActionCompatParcelizer().IconCompatParcelizer(), "#ffffff"));
        this.MediaBrowserCompatItemReceiver.setBackgroundColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(hasconnectedapi.RemoteActionCompatParcelizer().read(), "#62c8df"));
        TextView textView2 = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        textView2.setVisibility(hasconnectedapi.MediaBrowserCompatSearchResultReceiver().length() > 0 ? 0 : 8);
        this.AudioAttributesImplBaseParcelizer.setText(hasconnectedapi.MediaBrowserCompatSearchResultReceiver());
        TextView textView3 = this.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        textView3.setVisibility(hasconnectedapi.MediaDescriptionCompat().length() > 0 ? 0 : 8);
        this.MediaDescriptionCompat.setText(hasconnectedapi.MediaDescriptionCompat());
        TextView textView4 = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(hasconnectedapi.RatingCompat())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView4.setText(str);
        int iMediaBrowserCompatMediaItem = hasconnectedapi.MediaBrowserCompatMediaItem();
        if (iMediaBrowserCompatMediaItem == 1) {
            ImageView imageView = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
            this.RemoteActionCompatParcelizer.setImageDrawable(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_pause_blue));
        } else if (iMediaBrowserCompatMediaItem == 2) {
            ImageView imageView2 = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(imageView2);
            this.RemoteActionCompatParcelizer.setImageDrawable(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_complete));
        } else {
            ImageView imageView3 = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView3);
        }
        ImageView imageView4 = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        imageView4.setVisibility(hasconnectedapi.MediaMetadataCompat() ? 0 : 8);
        TextView textView5 = this.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
        textView5.setVisibility(hasconnectedapi.onCustomAction() ? 0 : 8);
        ConstraintLayout constraintLayout = this.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (!hasconnectedapi.MediaMetadataCompat() && !hasconnectedapi.onCustomAction()) {
            i = 8;
        }
        constraintLayout2.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(SignInButtonButtonSize signInButtonButtonSize, hasConnectedApi hasconnectedapi) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.onMediaButtonEvent(hasconnectedapi.AudioAttributesImplApi21Parcelizer(), hasconnectedapi.AudioAttributesImplBaseParcelizer(), hasconnectedapi.MediaBrowserCompatItemReceiver().getWrite()));
    }
}
