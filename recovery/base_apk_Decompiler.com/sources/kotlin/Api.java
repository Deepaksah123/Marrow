package kotlin;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.Arrays;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class Api extends RecyclerView.onMediaButtonEvent {
    private final HlsSampleStreamWrapperExternalSyntheticLambda2 AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Api(HlsSampleStreamWrapperExternalSyntheticLambda2 hlsSampleStreamWrapperExternalSyntheticLambda2) {
        super(hlsSampleStreamWrapperExternalSyntheticLambda2.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(hlsSampleStreamWrapperExternalSyntheticLambda2, "");
        this.AudioAttributesCompatParcelizer = hlsSampleStreamWrapperExternalSyntheticLambda2;
    }

    public final void read(maybeSignIn maybesignin, final SignInButtonButtonSize signInButtonButtonSize) {
        String string;
        String string2;
        toMagicModuleMetaRepoModel.write(maybesignin, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        HlsSampleStreamWrapperExternalSyntheticLambda2 hlsSampleStreamWrapperExternalSyntheticLambda2 = this.AudioAttributesCompatParcelizer;
        Context context = hlsSampleStreamWrapperExternalSyntheticLambda2.IconCompatParcelizer().getContext();
        hlsSampleStreamWrapperExternalSyntheticLambda2.write.setOnClickListener(new View.OnClickListener() { // from class: o.ApiAnyClient
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Api.AudioAttributesCompatParcelizer(signInButtonButtonSize);
            }
        });
        TextView textView = hlsSampleStreamWrapperExternalSyntheticLambda2.RemoteActionCompatParcelizer;
        int audioAttributesImplBaseParcelizer = maybesignin.getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == 1) {
            string = context.getString(R.string.suggestion_continue_solving);
        } else if (audioAttributesImplBaseParcelizer == 2) {
            string = context.getString(R.string.suggestion_solve_next);
        } else {
            string = context.getString(R.string.suggestion_qbank_header_default);
        }
        textView.setText(string);
        int audioAttributesImplBaseParcelizer2 = maybesignin.getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer2 == 1) {
            string2 = context.getString(R.string.label_home_qbank_second_heading_paused);
        } else if (audioAttributesImplBaseParcelizer2 != 2) {
            string2 = audioAttributesImplBaseParcelizer2 != 6 ? "" : context.getString(R.string.label_home_qbank_second_heading_updated);
        } else {
            string2 = context.getString(R.string.label_home_qbank_second_heading_next);
        }
        toMagicModuleMetaRepoModel.write((Object) string2);
        TextView textView2 = hlsSampleStreamWrapperExternalSyntheticLambda2.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        String str = string2;
        textView2.setVisibility(str.length() > 0 ? 0 : 8);
        hlsSampleStreamWrapperExternalSyntheticLambda2.MediaBrowserCompatItemReceiver.setText(str);
        hlsSampleStreamWrapperExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver.setText(maybesignin.getIconCompatParcelizer());
        hlsSampleStreamWrapperExternalSyntheticLambda2.read.setText(maybesignin.getAudioAttributesCompatParcelizer());
        TextView textView3 = hlsSampleStreamWrapperExternalSyntheticLambda2.AudioAttributesImplBaseParcelizer;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(maybesignin.getRead())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        textView3.setText(str2);
        TextView textView4 = hlsSampleStreamWrapperExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%d MCQs", Arrays.copyOf(new Object[]{Integer.valueOf(maybesignin.getAudioAttributesImplApi21Parcelizer())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        textView4.setText(str3);
        toMagicModuleMetaRepoModel.write(context);
        String write = maybesignin.getWrite();
        if (write == null) {
            write = "";
        }
        ImageView imageView = hlsSampleStreamWrapperExternalSyntheticLambda2.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        CmcdHeadersFactoryCmcdSessionBuilder.write(context, write, R.drawable.ic_marrow_logo_blue, R.drawable.ic_marrow_logo_blue, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(SignInButtonButtonSize signInButtonButtonSize) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(getContextFeatureId.onRemoveQueueItem.INSTANCE);
    }
}
