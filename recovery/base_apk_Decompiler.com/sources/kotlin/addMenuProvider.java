package kotlin;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class addMenuProvider extends argCount {
    @Override // kotlin.argCount
    public Dialog onCreateDialog(Bundle bundle) {
        return new menuHostHelperlambda0(getContext(), getTheme());
    }

    @Override // kotlin.argCount
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof menuHostHelperlambda0) {
            menuHostHelperlambda0 menuhosthelperlambda0 = (menuHostHelperlambda0) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            menuhosthelperlambda0.IconCompatParcelizer(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
