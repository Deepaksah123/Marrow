package kotlin;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import kotlin.getContextFeatureId;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiApiOptionsHasOptions extends RecyclerView.onMediaButtonEvent {
    private final HlsSampleStreamWrapperExternalSyntheticLambda2 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiApiOptionsHasOptions(HlsSampleStreamWrapperExternalSyntheticLambda2 hlsSampleStreamWrapperExternalSyntheticLambda2) {
        super(hlsSampleStreamWrapperExternalSyntheticLambda2.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(hlsSampleStreamWrapperExternalSyntheticLambda2, "");
        this.RemoteActionCompatParcelizer = hlsSampleStreamWrapperExternalSyntheticLambda2;
    }

    public final void write(zap zapVar, final SignInButtonButtonSize signInButtonButtonSize) {
        String string;
        String string2;
        toMagicModuleMetaRepoModel.write(zapVar, "");
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        HlsSampleStreamWrapperExternalSyntheticLambda2 hlsSampleStreamWrapperExternalSyntheticLambda2 = this.RemoteActionCompatParcelizer;
        Context context = hlsSampleStreamWrapperExternalSyntheticLambda2.IconCompatParcelizer().getContext();
        hlsSampleStreamWrapperExternalSyntheticLambda2.write.setOnClickListener(new View.OnClickListener() { // from class: o.ApiApiOptionsHasGoogleSignInAccountOptions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApiApiOptionsHasOptions.write(signInButtonButtonSize);
            }
        });
        TextView textView = hlsSampleStreamWrapperExternalSyntheticLambda2.RemoteActionCompatParcelizer;
        int audioAttributesImplApi26Parcelizer = zapVar.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer == 1) {
            string = context.getString(R.string.suggestion_continue_watching);
        } else if (audioAttributesImplApi26Parcelizer == 2) {
            string = context.getString(R.string.suggestion_watch_next);
        } else if (zapVar.getAudioAttributesImplApi21Parcelizer()) {
            string = context.getString(R.string.suggestion_watch_download);
        } else {
            string = context.getString(R.string.suggestion_video_header_default);
        }
        textView.setText(string);
        int audioAttributesImplApi26Parcelizer2 = zapVar.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer2 != 1) {
            string2 = audioAttributesImplApi26Parcelizer2 != 2 ? "" : context.getString(R.string.label_home_video_second_handing_next);
        } else {
            string2 = context.getString(R.string.label_home_video_second_handing_paused);
        }
        toMagicModuleMetaRepoModel.write((Object) string2);
        TextView textView2 = hlsSampleStreamWrapperExternalSyntheticLambda2.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        String str = string2;
        textView2.setVisibility(str.length() <= 0 ? 8 : 0);
        hlsSampleStreamWrapperExternalSyntheticLambda2.MediaBrowserCompatItemReceiver.setText(str);
        hlsSampleStreamWrapperExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver.setText(zapVar.getWrite());
        hlsSampleStreamWrapperExternalSyntheticLambda2.read.setText(zapVar.getAudioAttributesCompatParcelizer());
        hlsSampleStreamWrapperExternalSyntheticLambda2.AudioAttributesImplBaseParcelizer.setText(zapVar.getIconCompatParcelizer());
        hlsSampleStreamWrapperExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer.setText(zapVar.getMediaBrowserCompatMediaItem());
        hlsSampleStreamWrapperExternalSyntheticLambda2.AudioAttributesCompatParcelizer.setProgress(zapVar.getMediaDescriptionCompat());
        if (zapVar.getMediaDescriptionCompat() > 0) {
            ProgressBar progressBar = hlsSampleStreamWrapperExternalSyntheticLambda2.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
        } else {
            ProgressBar progressBar2 = hlsSampleStreamWrapperExternalSyntheticLambda2.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
        }
        toMagicModuleMetaRepoModel.write(context);
        String remoteActionCompatParcelizer = zapVar.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = "";
        }
        ImageView imageView = hlsSampleStreamWrapperExternalSyntheticLambda2.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        CmcdHeadersFactoryCmcdSessionBuilder.write(context, remoteActionCompatParcelizer, R.drawable.ic_marrow_logo_blue, R.drawable.ic_marrow_logo_blue, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(SignInButtonButtonSize signInButtonButtonSize) {
        signInButtonButtonSize.RemoteActionCompatParcelizer(getContextFeatureId.onSetRepeatMode.INSTANCE);
    }
}
