package kotlin;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import kotlin.SimpleBasePlayerExternalSyntheticLambda14;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda36;", "Lo/SimpleBasePlayerExternalSyntheticLambda2;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda36 extends SimpleBasePlayerExternalSyntheticLambda2 {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_cover_image, p1, false);
        toMagicModuleMetaRepoModel.write(viewInflate);
        PlayerPlaybackSuppressionReason.read(viewInflate, (MagicModuleSubmissionRequestBody<? super _verifyEndArrayForSingle, ? super ViewGroup.MarginLayoutParams, getShowPopup>) new MagicModuleSubmissionRequestBody() { // from class: o.SimpleBasePlayerExternalSyntheticLambda39
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SimpleBasePlayerExternalSyntheticLambda36.IconCompatParcelizer((_verifyEndArrayForSingle) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.inapp_cover_image_frame_layout);
        frameLayout.setBackgroundColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnPlay()));
        ImageView imageView = (ImageView) ((RelativeLayout) frameLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.cover_image_relative_layout)).findViewById(RendererCapabilitiesAdaptiveSupport.write.cover_image);
        CTInAppNotificationMedia cTInAppNotificationMediaRemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getIconCompatParcelizer());
        if (cTInAppNotificationMediaRemoteActionCompatParcelizer != null) {
            if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) cTInAppNotificationMediaRemoteActionCompatParcelizer.getWrite())) {
                imageView.setContentDescription(cTInAppNotificationMediaRemoteActionCompatParcelizer.getWrite());
            }
            Bitmap bitmap = AudioAttributesImplBaseParcelizer().read(cTInAppNotificationMediaRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer());
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setTag(0);
                imageView.setOnClickListener(new SimpleBasePlayerExternalSyntheticLambda14.AudioAttributesCompatParcelizer());
            }
        }
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: o.SimpleBasePlayerExternalSyntheticLambda38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleBasePlayerExternalSyntheticLambda36.write(this.AudioAttributesCompatParcelizer);
            }
        });
        if (!AudioAttributesImplApi26Parcelizer().getOnRewind()) {
            closeImageView.setVisibility(8);
            return viewInflate;
        }
        closeImageView.setVisibility(0);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, ViewGroup.MarginLayoutParams marginLayoutParams) {
        toMagicModuleMetaRepoModel.write(_verifyendarrayforsingle, "");
        toMagicModuleMetaRepoModel.write(marginLayoutParams, "");
        marginLayoutParams.leftMargin = _verifyendarrayforsingle.read;
        marginLayoutParams.rightMargin = _verifyendarrayforsingle.IconCompatParcelizer;
        marginLayoutParams.topMargin = _verifyendarrayforsingle.write;
        marginLayoutParams.bottomMargin = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(SimpleBasePlayerExternalSyntheticLambda36 simpleBasePlayerExternalSyntheticLambda36) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda36, "");
        simpleBasePlayerExternalSyntheticLambda36.RemoteActionCompatParcelizer((Bundle) null);
        maybeGetTypeVariable activity = simpleBasePlayerExternalSyntheticLambda36.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
