package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class UserRecoverableException extends RecyclerView.onMediaButtonEvent {
    private final HlsSampleStreamWrapperExternalSyntheticLambda0 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRecoverableException(HlsSampleStreamWrapperExternalSyntheticLambda0 hlsSampleStreamWrapperExternalSyntheticLambda0) {
        super(hlsSampleStreamWrapperExternalSyntheticLambda0.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(hlsSampleStreamWrapperExternalSyntheticLambda0, "");
        this.read = hlsSampleStreamWrapperExternalSyntheticLambda0;
    }

    public final void IconCompatParcelizer(clearDefaultAccountAndReconnect cleardefaultaccountandreconnect, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(cleardefaultaccountandreconnect, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.read.write.setOnClickListener(new View.OnClickListener() { // from class: o.KeepForSdkWithMembers
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserRecoverableException.RemoteActionCompatParcelizer(signInButtonButtonSize);
            }
        });
        this.read.AudioAttributesCompatParcelizer.setText(cleardefaultaccountandreconnect.getWrite());
        this.read.read.setText(cleardefaultaccountandreconnect.getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(SignInButtonButtonSize signInButtonButtonSize) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(getContextFeatureId.onPrepareFromSearch.INSTANCE);
    }
}
