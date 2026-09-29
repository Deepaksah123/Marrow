package kotlin;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public class consumeCcData extends addMenuProvider {
    private boolean IconCompatParcelizer;

    @Override // kotlin.addMenuProvider, kotlin.argCount
    public Dialog onCreateDialog(Bundle bundle) {
        return new readNon255TerminatedValue(getContext(), getTheme());
    }

    @Override // kotlin.argCount
    public void dismiss() {
        if (IconCompatParcelizer(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // kotlin.argCount
    public void dismissAllowingStateLoss() {
        if (IconCompatParcelizer(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    private boolean IconCompatParcelizer(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof readNon255TerminatedValue)) {
            return false;
        }
        readNon255TerminatedValue readnon255terminatedvalue = (readNon255TerminatedValue) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorRemoteActionCompatParcelizer = readnon255terminatedvalue.RemoteActionCompatParcelizer();
        if (!bottomSheetBehaviorRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() || !readnon255terminatedvalue.IconCompatParcelizer()) {
            return false;
        }
        IconCompatParcelizer(bottomSheetBehaviorRemoteActionCompatParcelizer, z);
        return true;
    }

    private void IconCompatParcelizer(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.IconCompatParcelizer = z;
        if (bottomSheetBehavior.AudioAttributesImplBaseParcelizer() == 5) {
            AudioAttributesCompatParcelizer();
            return;
        }
        if (getDialog() instanceof readNon255TerminatedValue) {
            ((readNon255TerminatedValue) getDialog()).write();
        }
        bottomSheetBehavior.read(new RemoteActionCompatParcelizer(this, (byte) 0));
        bottomSheetBehavior.IconCompatParcelizer(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    class RemoteActionCompatParcelizer extends BottomSheetBehavior.write {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
        public final void onSlide(View view, float f) {
        }

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(consumeCcData consumeccdata, byte b) {
            this();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
        public final void onStateChanged(View view, int i) {
            if (i == 5) {
                consumeCcData.this.AudioAttributesCompatParcelizer();
            }
        }
    }
}
