package kotlin;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.Arrays;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInButtonColorScheme extends RecyclerView.onMediaButtonEvent {
    private final getPrimaryTrackGroupIndex read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInButtonColorScheme(getPrimaryTrackGroupIndex getprimarytrackgroupindex) {
        super(getprimarytrackgroupindex.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(getprimarytrackgroupindex, "");
        this.read = getprimarytrackgroupindex;
    }

    public final void AudioAttributesCompatParcelizer(getAllClients getallclients, final SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(getallclients, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        getPrimaryTrackGroupIndex getprimarytrackgroupindex = this.read;
        Context context = getprimarytrackgroupindex.IconCompatParcelizer().getContext();
        getprimarytrackgroupindex.read.setOnClickListener(new View.OnClickListener() { // from class: o.KeepForSdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInButtonColorScheme.write(signInButtonButtonSize);
            }
        });
        TextView textView = getprimarytrackgroupindex.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(context);
        textView.setText(IconCompatParcelizer(context, getallclients));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(SignInButtonButtonSize signInButtonButtonSize) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(getContextFeatureId.onRewind.INSTANCE);
    }

    private static String IconCompatParcelizer(Context context, getAllClients getallclients) {
        if (getallclients.getRead()) {
            String string = context.getString(R.string.revise_hyt_mcq_that_you_get_wrong);
            toMagicModuleMetaRepoModel.write((Object) string);
            return string;
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String string2 = context.getString(R.string.label_magic_module_live_now);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String str = String.format(string2, Arrays.copyOf(new Object[]{getallclients.getIconCompatParcelizer()}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }
}
