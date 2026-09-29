package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import kotlin.PaymentAuthorizationResult;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentDataRequestUpdate extends RecyclerView.onMediaButtonEvent {
    private final getMediaPlaylistUriForReload IconCompatParcelizer;
    private final PaymentAuthorizationResult.RemoteActionCompatParcelizer read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDataRequestUpdate(getMediaPlaylistUriForReload getmediaplaylisturiforreload, PaymentAuthorizationResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(getmediaplaylisturiforreload.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(getmediaplaylisturiforreload, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.IconCompatParcelizer = getmediaplaylisturiforreload;
        this.read = remoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(final getBody.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        getMediaPlaylistUriForReload getmediaplaylisturiforreload = this.IconCompatParcelizer;
        String read = mediaBrowserCompatCustomActionResultReceiver.getRead();
        if (read.length() == 0) {
            read = this.IconCompatParcelizer.IconCompatParcelizer().getContext().getString(R.string.year, String.valueOf(mediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer()));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(read, "");
        }
        getmediaplaylisturiforreload.read.setText(read);
        getmediaplaylisturiforreload.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.getLabel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentDataRequestUpdate.write(this.read, mediaBrowserCompatCustomActionResultReceiver);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(PaymentDataRequestUpdate paymentDataRequestUpdate, getBody.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        paymentDataRequestUpdate.read.read(mediaBrowserCompatCustomActionResultReceiver);
    }
}
