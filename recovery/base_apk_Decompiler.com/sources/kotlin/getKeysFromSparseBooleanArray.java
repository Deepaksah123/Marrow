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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/getKeysFromSparseBooleanArray;", "Lo/consumeCcData;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lo/isPackedAudioExtractor;", "IconCompatParcelizer", "Lo/isPackedAudioExtractor;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getKeysFromSparseBooleanArray extends consumeCcData {
    private isPackedAudioExtractor IconCompatParcelizer;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        isPackedAudioExtractor ispackedaudioextractorIconCompatParcelizer = isPackedAudioExtractor.IconCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(ispackedaudioextractorIconCompatParcelizer, "");
        this.IconCompatParcelizer = ispackedaudioextractorIconCompatParcelizer;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.getSelectionOverride
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    getKeysFromSparseBooleanArray.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
                }
            });
        }
        setCancelable(false);
        isPackedAudioExtractor ispackedaudioextractor = this.IconCompatParcelizer;
        isPackedAudioExtractor ispackedaudioextractor2 = null;
        if (ispackedaudioextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            ispackedaudioextractor = null;
        }
        ispackedaudioextractor.read.setOnClickListener(new View.OnClickListener() { // from class: o.getRendererDisabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getKeysFromSparseBooleanArray.write(this.IconCompatParcelizer);
            }
        });
        isPackedAudioExtractor ispackedaudioextractor3 = this.IconCompatParcelizer;
        if (ispackedaudioextractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            ispackedaudioextractor3 = null;
        }
        ispackedaudioextractor3.AudioAttributesCompatParcelizer.setOnRatingBarChangedListener(new RatingBar.OnRatingBarChangeListener() { // from class: o.DefaultTrackSelectorParametersBuilder
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                getKeysFromSparseBooleanArray.read(this.IconCompatParcelizer, f);
            }
        });
        isPackedAudioExtractor ispackedaudioextractor4 = this.IconCompatParcelizer;
        if (ispackedaudioextractor4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            ispackedaudioextractor2 = ispackedaudioextractor4;
        }
        CoordinatorLayout coordinatorLayoutIconCompatParcelizer = ispackedaudioextractor2.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayoutIconCompatParcelizer, "");
        return coordinatorLayoutIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getKeysFromSparseBooleanArray getkeysfromsparsebooleanarray) {
        isPackedAudioExtractor ispackedaudioextractor = getkeysfromsparsebooleanarray.IconCompatParcelizer;
        isPackedAudioExtractor ispackedaudioextractor2 = null;
        if (ispackedaudioextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            ispackedaudioextractor = null;
        }
        ViewParent parent = ispackedaudioextractor.IconCompatParcelizer().getParent();
        toMagicModuleMetaRepoModel.read(parent, "");
        FrameLayout frameLayout = (FrameLayout) parent;
        isPackedAudioExtractor ispackedaudioextractor3 = getkeysfromsparsebooleanarray.IconCompatParcelizer;
        if (ispackedaudioextractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            ispackedaudioextractor2 = ispackedaudioextractor3;
        }
        CoordinatorLayout coordinatorLayout = ispackedaudioextractor2.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayout, "");
        BottomSheetBehavior bottomSheetBehaviorAudioAttributesCompatParcelizer = BottomSheetBehavior.AudioAttributesCompatParcelizer(frameLayout);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bottomSheetBehaviorAudioAttributesCompatParcelizer, "");
        bottomSheetBehaviorAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(frameLayout.getHeight());
        coordinatorLayout.getParent().requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getKeysFromSparseBooleanArray getkeysfromsparsebooleanarray) {
        getkeysfromsparsebooleanarray.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getKeysFromSparseBooleanArray getkeysfromsparsebooleanarray, float f) {
        withAlwaysAsId.read(getkeysfromsparsebooleanarray, "rating", _getIndexResolver.write(new Pair("rating", Integer.valueOf((int) f))));
        getkeysfromsparsebooleanarray.dismiss();
    }
}
