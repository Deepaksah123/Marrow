package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.PaymentAuthorizationResult;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
public final class LabelValue extends RecyclerView.onMediaButtonEvent {
    private final PaymentAuthorizationResult.RemoteActionCompatParcelizer read;
    private final DefaultHlsPlaylistTrackerMediaPlaylistBundle write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelValue(DefaultHlsPlaylistTrackerMediaPlaylistBundle defaultHlsPlaylistTrackerMediaPlaylistBundle, PaymentAuthorizationResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(defaultHlsPlaylistTrackerMediaPlaylistBundle.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(defaultHlsPlaylistTrackerMediaPlaylistBundle, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.write = defaultHlsPlaylistTrackerMediaPlaylistBundle;
        this.read = remoteActionCompatParcelizer;
    }

    public final void write(getBody.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        LinearLayout linearLayout = this.write.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        linearLayout.setVisibility(iconCompatParcelizer.getAudioAttributesCompatParcelizer() ? 0 : 8);
        this.write.read.setText(iconCompatParcelizer.AudioAttributesCompatParcelizer());
        this.write.write.setOnClickListener(new View.OnClickListener() { // from class: o.LabelValueRow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabelValue.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(LabelValue labelValue) {
        labelValue.read.write();
    }
}
