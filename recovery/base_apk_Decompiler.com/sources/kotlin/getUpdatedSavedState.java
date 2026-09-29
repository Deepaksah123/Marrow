package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.PaymentAuthorizationResult;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getUpdatedSavedState extends RecyclerView.onMediaButtonEvent {
    private final loadPlaylist AudioAttributesCompatParcelizer;
    private final PaymentAuthorizationResult.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getUpdatedSavedState(loadPlaylist loadplaylist, PaymentAuthorizationResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(loadplaylist.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(loadplaylist, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = loadplaylist;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(getBody.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.CallbackOutput
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getUpdatedSavedState.read(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getUpdatedSavedState getupdatedsavedstate) {
        getupdatedsavedstate.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }
}
