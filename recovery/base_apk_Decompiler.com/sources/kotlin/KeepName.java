package kotlin;

import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.Arrays;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class KeepName extends RecyclerView.onMediaButtonEvent {
    private final HlsSampleStreamWrapperExternalSyntheticLambda1 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepName(HlsSampleStreamWrapperExternalSyntheticLambda1 hlsSampleStreamWrapperExternalSyntheticLambda1) {
        super(hlsSampleStreamWrapperExternalSyntheticLambda1.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(hlsSampleStreamWrapperExternalSyntheticLambda1, "");
        this.read = hlsSampleStreamWrapperExternalSyntheticLambda1;
    }

    public final void AudioAttributesCompatParcelizer(hasApi hasapi, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(hasapi, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.read.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.KeepForSdkWithFieldsAndMethods
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepName.AudioAttributesCompatParcelizer(signInButtonButtonSize);
            }
        });
        if (hasapi.getIconCompatParcelizer()) {
            write(hasapi.getWrite());
            IconCompatParcelizer(hasapi.getRemoteActionCompatParcelizer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(SignInButtonButtonSize signInButtonButtonSize) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(getContextFeatureId.onPrepare.INSTANCE);
    }

    private final void write(int i) {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String string = this.read.IconCompatParcelizer().getContext().getString(R.string.label_home_pearl_subtext);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        this.read.IconCompatParcelizer.setText(str);
    }

    private final void IconCompatParcelizer(boolean z) {
        ProgressBar progressBar = this.read.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        progressBar.setVisibility(z ? 0 : 8);
    }

    public final void IconCompatParcelizer(Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        if (obj instanceof Integer) {
            write(((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            IconCompatParcelizer(((Boolean) obj).booleanValue());
        }
    }
}
