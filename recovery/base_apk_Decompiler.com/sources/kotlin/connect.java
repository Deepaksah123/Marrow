package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.core.utils.widgets.AspectRatioImageView;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class connect extends RecyclerView.onMediaButtonEvent {
    private final TextView AudioAttributesCompatParcelizer;
    private final CardView IconCompatParcelizer;
    private final AspectRatioImageView RemoteActionCompatParcelizer;
    private final TextView read;
    private final TextView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public connect(View view) {
        super(view);
        toMagicModuleMetaRepoModel.write(view, "");
        this.IconCompatParcelizer = (CardView) view.findViewById(R.id.cvMain);
        this.RemoteActionCompatParcelizer = (AspectRatioImageView) view.findViewById(R.id.ivCardImage);
        this.read = (TextView) view.findViewById(R.id.tvCardTag);
        this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(R.id.tvCardTitle);
        this.write = (TextView) view.findViewById(R.id.tvCardSubtitle);
    }

    public final void read(final dumpAll dumpall, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(dumpall, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.ApiApiOptionsOptional
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                connect.AudioAttributesCompatParcelizer(dumpall, signInButtonButtonSize);
            }
        });
        AspectRatioImageView aspectRatioImageView = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(aspectRatioImageView, "");
        CmcdHeadersFactoryCmcdSessionBuilder.read((ImageView) aspectRatioImageView, dumpall.AudioAttributesImplApi26Parcelizer(), true);
        TextView textView = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        textView.setVisibility(dumpall.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().length() > 0 ? 0 : 8);
        this.read.setText(dumpall.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
        this.read.setTextColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(dumpall.RemoteActionCompatParcelizer().IconCompatParcelizer(), "#ffffff"));
        this.read.setBackgroundColor(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(dumpall.RemoteActionCompatParcelizer().read(), "#62c8df"));
        this.AudioAttributesCompatParcelizer.setText(dumpall.AudioAttributesImplApi21Parcelizer());
        TextView textView2 = this.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        textView2.setVisibility(dumpall.RatingCompat().length() <= 0 ? 8 : 0);
        this.write.setText(dumpall.RatingCompat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(dumpAll dumpall, SignInButtonButtonSize signInButtonButtonSize) {
        if (dumpall.MediaBrowserCompatItemReceiver() == getTrackTypeOfCodec.RemoteActionCompatParcelizer) {
            signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.onAddQueueItem(dumpall.AudioAttributesImplBaseParcelizer(), dumpall.MediaBrowserCompatItemReceiver().getWrite()));
        } else if (dumpall.MediaBrowserCompatItemReceiver() == getTrackTypeOfCodec.IconCompatParcelizer) {
            signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.onCustomAction(dumpall.AudioAttributesImplBaseParcelizer(), dumpall.MediaBrowserCompatItemReceiver().getWrite()));
        }
    }
}
