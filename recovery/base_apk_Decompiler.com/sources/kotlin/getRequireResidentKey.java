package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;
import com.marrow.TrainingApplication;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0002\"&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0012\u0010\u0015J!\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0012\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0003R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\"\u001a\u00020#8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010("}, d2 = {"Lo/getRequireResidentKey;", "Lo/consumeCcData;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lo/readNon255TerminatedValue;", "", "IconCompatParcelizer", "(Lo/readNon255TerminatedValue;)V", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "Landroid/content/DialogInterface;", "onDismiss", "(Landroid/content/DialogInterface;)V", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onActivityCreated", "(Landroid/os/Bundle;)V", "write", "Lo/getIsMuxedAudioAndVideo;", "Lo/getIsMuxedAudioAndVideo;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "()Lo/getIsMuxedAudioAndVideo;", "Lo/getCreatedOnDateMs;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getRequireResidentKey extends consumeCcData {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getIsMuxedAudioAndVideo AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> read;

    private final getIsMuxedAudioAndVideo RemoteActionCompatParcelizer() {
        getIsMuxedAudioAndVideo getismuxedaudioandvideo = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getismuxedaudioandvideo);
        return getismuxedaudioandvideo;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = getIsMuxedAudioAndVideo.AudioAttributesCompatParcelizer(p0, p1);
        FrameLayout frameLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
        return frameLayoutIconCompatParcelizer;
    }

    @Override // kotlin.consumeCcData, kotlin.addMenuProvider, kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dialogOnCreateDialog, "");
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.getAttachmentAsString
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                getRequireResidentKey.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getRequireResidentKey getrequireresidentkey, DialogInterface dialogInterface) {
        toMagicModuleMetaRepoModel.read(dialogInterface, "");
        getrequireresidentkey.IconCompatParcelizer((readNon255TerminatedValue) dialogInterface);
    }

    private final void IconCompatParcelizer(readNon255TerminatedValue p0) {
        FrameLayout frameLayout = (FrameLayout) p0.findViewById(R.id.design_bottom_sheet);
        if (frameLayout == null) {
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            Context context = getContext();
            if (context != null) {
                layoutParams.width = remoteActionCompatParcelizer.RemoteActionCompatParcelizer(context.getResources().getConfiguration().orientation);
            }
        } else {
            layoutParams = null;
        }
        frameLayout.setLayoutParams(layoutParams);
        RemoteActionCompatParcelizer().IconCompatParcelizer().setBackgroundResource(R.drawable.bg_practical_corner_intro_dialog);
        BottomSheetBehavior bottomSheetBehaviorAudioAttributesCompatParcelizer = BottomSheetBehavior.AudioAttributesCompatParcelizer(frameLayout);
        bottomSheetBehaviorAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(true);
        bottomSheetBehaviorAudioAttributesCompatParcelizer.write(true);
        bottomSheetBehaviorAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(Resources.getSystem().getDisplayMetrics().heightPixels);
        bottomSheetBehaviorAudioAttributesCompatParcelizer.IconCompatParcelizer(3);
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = p0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getResidentKeyRequirement
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRequireResidentKey.IconCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        Context context = getContext();
        if (context != null) {
            MaterialButton materialButton = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButton, "");
            bytesRead.IconCompatParcelizer(context, materialButton);
        }
        RemoteActionCompatParcelizer().write.setNestedScrollingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getRequireResidentKey getrequireresidentkey) {
        getrequireresidentkey.dismiss();
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.windowAnimations = R.style.BottomSheetAnimation;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.AudioAttributesCompatParcelizer = null;
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onDismiss(p0);
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.read;
        if (getcreatedondatems != null) {
            getcreatedondatems.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        IconCompatParcelizer(p0);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle p0) {
        super.onActivityCreated(p0);
        write();
    }

    private final void IconCompatParcelizer(Configuration p0) {
        FrameLayout frameLayout;
        Dialog dialog = getDialog();
        ViewGroup.LayoutParams layoutParams = null;
        readNon255TerminatedValue readnon255terminatedvalue = dialog instanceof readNon255TerminatedValue ? (readNon255TerminatedValue) dialog : null;
        if (readnon255terminatedvalue == null || (frameLayout = (FrameLayout) readnon255terminatedvalue.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = remoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0.orientation);
            layoutParams = layoutParams2;
        }
        frameLayout.setLayoutParams(layoutParams);
    }

    private final void write() {
        View view = getView();
        CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        Object parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setBackgroundColor(0);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer ? (CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams : null;
            if (remoteActionCompatParcelizer2 != null) {
                int i = new RemoteActionCompatParcelizer().read(getResources().getConfiguration().orientation);
                ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer2).leftMargin = i;
                ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer2).rightMargin = i;
                remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            }
            if (remoteActionCompatParcelizer != null) {
                view2.setLayoutParams(remoteActionCompatParcelizer);
            }
        }
    }

    /* JADX INFO: renamed from: o.getRequireResidentKey$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getRequireResidentKey$write;", "", "<init>", "()V", "Lo/getRequireResidentKey;", "write", "()Lo/getRequireResidentKey;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getRequireResidentKey write() {
            return new getRequireResidentKey();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r"}, d2 = {"Lo/getRequireResidentKey$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "read", "(I)I", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "I", "write", "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int write = Resources.getSystem().getDisplayMetrics().widthPixels;
        private final boolean read = TrainingApplication.read().RatingCompat();

        public final int read(int p0) {
            double d;
            double d2;
            if (!this.read) {
                return 0;
            }
            if (p0 == 1) {
                d = this.write;
                d2 = 0.1d;
            } else {
                if (p0 != 2) {
                    return 0;
                }
                d = this.write;
                d2 = 0.2d;
            }
            return (int) (d * d2);
        }

        public final int RemoteActionCompatParcelizer(int p0) {
            return this.write - (read(p0) << 1);
        }
    }
}
