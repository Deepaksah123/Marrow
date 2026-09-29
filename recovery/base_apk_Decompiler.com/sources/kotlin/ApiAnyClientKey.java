package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiAnyClientKey extends RecyclerView.onMediaButtonEvent {
    private final onPlaylistUpdated AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiAnyClientKey(onPlaylistUpdated onplaylistupdated) {
        super(onplaylistupdated.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(onplaylistupdated, "");
        this.AudioAttributesCompatParcelizer = onplaylistupdated;
    }

    public final void IconCompatParcelizer(isConnectionCallbacksRegistered isconnectioncallbacksregistered, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(isconnectioncallbacksregistered, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        onPlaylistUpdated onplaylistupdated = this.AudioAttributesCompatParcelizer;
        onplaylistupdated.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.ApiAbstractClientBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApiAnyClientKey.IconCompatParcelizer(signInButtonButtonSize);
            }
        });
        onplaylistupdated.RemoteActionCompatParcelizer.setText(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getContext().getString(R.string.last_update_date, parseEac3SupplementalProperties.write(isconnectioncallbacksregistered.getIconCompatParcelizer(), "dd MMM yyyy")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(SignInButtonButtonSize signInButtonButtonSize) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(getContextFeatureId.onPlayFromUri.INSTANCE);
    }
}
