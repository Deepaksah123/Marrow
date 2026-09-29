package kotlin;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0012J%\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0012J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0015J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0012J-\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0015J-\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0015"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda2;", "Lo/SimpleBasePlayerExternalSyntheticLambda14;", "<init>", "()V", "Landroid/widget/RelativeLayout;", "p0", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "p1", "", "AudioAttributesCompatParcelizer", "(Landroid/widget/RelativeLayout;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "read", "", "MediaBrowserCompatItemReceiver", "()Z", "Landroid/widget/FrameLayout$LayoutParams;", "p2", "RemoteActionCompatParcelizer", "(Landroid/widget/RelativeLayout;Landroid/widget/FrameLayout$LayoutParams;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "Landroid/widget/FrameLayout;", "p3", "(Landroid/widget/RelativeLayout;Landroid/widget/FrameLayout$LayoutParams;Landroid/widget/FrameLayout;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBasePlayerExternalSyntheticLambda2 extends SimpleBasePlayerExternalSyntheticLambda14 {
    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14
    protected void read() {
    }

    public static final class write implements Runnable {
        private /* synthetic */ RelativeLayout AudioAttributesCompatParcelizer;
        private /* synthetic */ CloseImageView write;

        write(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            this.write = closeImageView;
            this.AudioAttributesCompatParcelizer = relativeLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int measuredWidth = this.write.getMeasuredWidth() / 2;
            this.write.setX(this.AudioAttributesCompatParcelizer.getRight() - measuredWidth);
            this.write.setY(this.AudioAttributesCompatParcelizer.getTop() - measuredWidth);
        }
    }

    private static void AudioAttributesCompatParcelizer(RelativeLayout p0, CloseImageView p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        p0.post(new write(p1, p0));
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14
    protected final void AudioAttributesCompatParcelizer() {
        Object context = getContext();
        if (context instanceof Rstyle) {
            AudioAttributesCompatParcelizer((lambdaupdateStateAndInformListeners54) context);
        }
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        if (RendererCapabilitiesListener.read((Activity) getActivity())) {
            return false;
        }
        try {
            return getResources().getBoolean(RendererCapabilitiesAdaptiveSupport.AudioAttributesCompatParcelizer.ctIsTablet);
        } catch (Exception unused) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return false;
        }
    }

    public static void RemoteActionCompatParcelizer(RelativeLayout p0, FrameLayout.LayoutParams p1, CloseImageView p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        ((ViewGroup.LayoutParams) p1).height = (int) (p0.getMeasuredWidth() * 1.3f);
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p2);
    }

    public final void AudioAttributesCompatParcelizer(RelativeLayout p0, FrameLayout.LayoutParams p1, CloseImageView p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        p1.setMargins(write(140), write(140), write(140), write(140));
        ((ViewGroup.LayoutParams) p1).width = p0.getMeasuredWidth() - write(210);
        ((ViewGroup.LayoutParams) p1).height = (int) (((ViewGroup.LayoutParams) p1).width * 1.3f);
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p2);
    }

    public static void read(RelativeLayout p0, FrameLayout.LayoutParams p1, CloseImageView p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        ((ViewGroup.LayoutParams) p1).height = (int) (p0.getMeasuredWidth() * 1.78f);
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p2);
    }

    public final void read(RelativeLayout p0, FrameLayout.LayoutParams p1, FrameLayout p2, CloseImageView p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        int measuredWidth = (int) ((p0.getMeasuredWidth() - write(200)) * 1.78f);
        int measuredHeight = p2.getMeasuredHeight() - write(280);
        if (measuredWidth > measuredHeight) {
            ((ViewGroup.LayoutParams) p1).height = measuredHeight;
            ((ViewGroup.LayoutParams) p1).width = (int) (measuredHeight / 1.78f);
        } else {
            ((ViewGroup.LayoutParams) p1).height = measuredWidth;
            ((ViewGroup.LayoutParams) p1).width = p0.getMeasuredWidth() - write(200);
        }
        p1.setMargins(write(140), write(140), write(140), write(140));
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p3);
    }

    public final void write(RelativeLayout p0, FrameLayout.LayoutParams p1, FrameLayout p2, CloseImageView p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        int measuredWidth = (int) (p0.getMeasuredWidth() * 1.78f);
        int measuredHeight = p2.getMeasuredHeight() - write(80);
        if (measuredWidth > measuredHeight) {
            ((ViewGroup.LayoutParams) p1).height = measuredHeight;
            ((ViewGroup.LayoutParams) p1).width = (int) (measuredHeight / 1.78f);
        } else {
            ((ViewGroup.LayoutParams) p1).height = measuredWidth;
        }
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p3);
    }

    public static void write(RelativeLayout p0, FrameLayout.LayoutParams p1, CloseImageView p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        ((ViewGroup.LayoutParams) p1).width = (int) (p0.getMeasuredHeight() * 1.78f);
        p1.gravity = 1;
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p2);
    }

    public final void IconCompatParcelizer(RelativeLayout p0, FrameLayout.LayoutParams p1, FrameLayout p2, CloseImageView p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        int measuredHeight = (int) ((p0.getMeasuredHeight() - write(120)) * 1.78f);
        int measuredWidth = p2.getMeasuredWidth() - write(280);
        if (measuredHeight > measuredWidth) {
            ((ViewGroup.LayoutParams) p1).width = measuredWidth;
            ((ViewGroup.LayoutParams) p1).height = (int) (measuredWidth / 1.78f);
        } else {
            ((ViewGroup.LayoutParams) p1).width = measuredHeight;
            ((ViewGroup.LayoutParams) p1).height = p0.getMeasuredHeight() - write(120);
        }
        p1.setMargins(write(140), write(100), write(140), write(100));
        p1.gravity = 17;
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p3);
    }

    public final void RemoteActionCompatParcelizer(RelativeLayout p0, FrameLayout.LayoutParams p1, FrameLayout p2, CloseImageView p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        int measuredHeight = (int) (p0.getMeasuredHeight() * 1.78f);
        int measuredWidth = p2.getMeasuredWidth() - write(80);
        if (measuredHeight > measuredWidth) {
            ((ViewGroup.LayoutParams) p1).width = measuredWidth;
            ((ViewGroup.LayoutParams) p1).height = (int) (measuredWidth / 1.78f);
        } else {
            ((ViewGroup.LayoutParams) p1).width = measuredHeight;
        }
        p1.gravity = 17;
        p0.setLayoutParams(p1);
        AudioAttributesCompatParcelizer(p0, p3);
    }
}
