package kotlin;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda37;", "Lo/SimpleBasePlayerExternalSyntheticLambda25;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda37 extends SimpleBasePlayerExternalSyntheticLambda25 {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ArrayList arrayList = new ArrayList();
        View viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_footer, p1, false);
        RemoteActionCompatParcelizer(viewInflate);
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_frame_layout)).findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnPlay()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_linear_layout_1);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_linear_layout_2);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_linear_layout_3);
        Button button = (Button) linearLayout3.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_button_1);
        toMagicModuleMetaRepoModel.write(button);
        arrayList.add(button);
        Button button2 = (Button) linearLayout3.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_button_2);
        toMagicModuleMetaRepoModel.write(button2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) linearLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_icon);
        if (!AudioAttributesImplApi26Parcelizer().onAddQueueItem().isEmpty()) {
            CTInAppNotificationMedia cTInAppNotificationMedia = AudioAttributesImplApi26Parcelizer().onAddQueueItem().get(0);
            if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) cTInAppNotificationMedia.getWrite())) {
                imageView.setContentDescription(cTInAppNotificationMedia.getWrite());
            }
            Bitmap bitmap = AudioAttributesImplBaseParcelizer().read(cTInAppNotificationMedia.getRemoteActionCompatParcelizer());
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) linearLayout2.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_title);
        textView.setText(AudioAttributesImplApi26Parcelizer().getMediaMetadataCompat());
        textView.setTextColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnSkipToQueueItem()));
        TextView textView2 = (TextView) linearLayout2.findViewById(RendererCapabilitiesAdaptiveSupport.write.footer_message);
        textView2.setText(AudioAttributesImplApi26Parcelizer().getRatingCompat());
        textView2.setTextColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnSetRating()));
        List<CTInAppNotificationButton> listIconCompatParcelizer = AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
        if (!listIconCompatParcelizer.isEmpty()) {
            int size = listIconCompatParcelizer.size();
            for (int i = 0; i < size && i < 2; i++) {
                write((Button) arrayList.get(i), listIconCompatParcelizer.get(i), i);
            }
        }
        if (AudioAttributesImplApi26Parcelizer().getOnMediaButtonEvent() == 1) {
            IconCompatParcelizer(button, button2);
        }
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: o.SimpleBasePlayerExternalSyntheticLambda35
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SimpleBasePlayerExternalSyntheticLambda37.RemoteActionCompatParcelizer(this.write, motionEvent);
            }
        });
        toMagicModuleMetaRepoModel.write(viewInflate);
        PlayerPlaybackSuppressionReason.read(viewInflate, (MagicModuleSubmissionRequestBody<? super _verifyEndArrayForSingle, ? super ViewGroup.MarginLayoutParams, getShowPopup>) new MagicModuleSubmissionRequestBody() { // from class: o.SimpleBasePlayerExternalSyntheticLambda4
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SimpleBasePlayerExternalSyntheticLambda37.read((_verifyEndArrayForSingle) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda37 simpleBasePlayerExternalSyntheticLambda37, MotionEvent motionEvent) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda37, "");
        simpleBasePlayerExternalSyntheticLambda37.AudioAttributesImplApi21Parcelizer().onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_verifyEndArrayForSingle _verifyendarrayforsingle, ViewGroup.MarginLayoutParams marginLayoutParams) {
        toMagicModuleMetaRepoModel.write(_verifyendarrayforsingle, "");
        toMagicModuleMetaRepoModel.write(marginLayoutParams, "");
        marginLayoutParams.leftMargin = _verifyendarrayforsingle.read;
        marginLayoutParams.rightMargin = _verifyendarrayforsingle.IconCompatParcelizer;
        marginLayoutParams.bottomMargin = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
        return getShowPopup.INSTANCE;
    }
}
