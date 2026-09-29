package kotlin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/zzC;", "Lo/consumeCcData;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lo/RangedUri;", "read", "Lo/RangedUri;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzC extends consumeCcData {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private RangedUri write;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        RangedUri rangedUriAudioAttributesCompatParcelizer = RangedUri.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rangedUriAudioAttributesCompatParcelizer, "");
        this.write = rangedUriAudioAttributesCompatParcelizer;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.zzD
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    zzC.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
                }
            });
        }
        setCancelable(false);
        RangedUri rangedUri = this.write;
        RangedUri rangedUri2 = null;
        if (rangedUri == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            rangedUri = null;
        }
        rangedUri.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzC.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        RangedUri rangedUri3 = this.write;
        if (rangedUri3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            rangedUri3 = null;
        }
        rangedUri3.RemoteActionCompatParcelizer.setOnRatingBarChangedListener(new RatingBar.OnRatingBarChangeListener() { // from class: o.zzB
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                zzC.RemoteActionCompatParcelizer(this.write, f);
            }
        });
        RangedUri rangedUri4 = this.write;
        if (rangedUri4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            rangedUri2 = rangedUri4;
        }
        CoordinatorLayout coordinatorLayoutIconCompatParcelizer = rangedUri2.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayoutIconCompatParcelizer, "");
        return coordinatorLayoutIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(zzC zzc) {
        RangedUri rangedUri = zzc.write;
        RangedUri rangedUri2 = null;
        if (rangedUri == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            rangedUri = null;
        }
        ViewParent parent = rangedUri.IconCompatParcelizer().getParent();
        toMagicModuleMetaRepoModel.read(parent, "");
        FrameLayout frameLayout = (FrameLayout) parent;
        RangedUri rangedUri3 = zzc.write;
        if (rangedUri3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            rangedUri2 = rangedUri3;
        }
        CoordinatorLayout coordinatorLayout = rangedUri2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayout, "");
        BottomSheetBehavior bottomSheetBehaviorAudioAttributesCompatParcelizer = BottomSheetBehavior.AudioAttributesCompatParcelizer(frameLayout);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bottomSheetBehaviorAudioAttributesCompatParcelizer, "");
        bottomSheetBehaviorAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(frameLayout.getHeight());
        coordinatorLayout.getParent().requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(zzC zzc) {
        withAlwaysAsId.read(zzc, "rating", _getIndexResolver.write(new Pair("rating", -1)));
        zzc.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(zzC zzc, float f) {
        withAlwaysAsId.read(zzc, "rating", _getIndexResolver.write(new Pair("rating", Integer.valueOf((int) f))));
        zzc.dismiss();
    }

    /* JADX INFO: renamed from: o.zzC$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/zzC$write;", "", "<init>", "()V", "Lo/zzC;", "write", "()Lo/zzC;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zzC write() {
            return new zzC();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
