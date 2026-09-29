package kotlin;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.marrow.ui.activities.learn.video.overlay.SettingsItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.getFontSize;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J!\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setBold;", "Lo/getFontSize;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "onStart", "Landroid/view/View;", "p1", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setBold extends getFontSize {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        Context contextRequireContext;
        Dialog dialog = getDialog();
        if (dialog == null || (contextRequireContext = dialog.getContext()) == null) {
            contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        }
        Dialog dialog2 = new Dialog(contextRequireContext, getTheme());
        dialog2.setCanceledOnTouchOutside(true);
        return dialog2;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setGravity(8388659);
        int i = (int) (f * 366.0f);
        int i2 = requireArguments().getInt("top_right_x");
        int i3 = requireArguments().getInt("top_right_y");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = i2 - i;
        attributes.y = i3;
        window.setAttributes(attributes);
        window.setLayout(i, -2);
    }

    @Override // kotlin.getFontSize, androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        Context contextRequireContext;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        LinearLayout linearLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        Dialog dialog = getDialog();
        if (dialog == null || (contextRequireContext = dialog.getContext()) == null) {
            contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        }
        linearLayoutIconCompatParcelizer.setBackground(_isNaN.getDrawable(contextRequireContext, com.marrow.R.drawable.drawable_rounded_on_surface_8dp));
    }

    /* JADX INFO: renamed from: o.setBold$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsDialog$Companion;", "", "<init>", "()V", "ARG_TOP_RIGHT_X", "", "ARG_TOP_RIGHT_Y", "SETTINGS_DIALOG_FIXED_WIDTH_DP", "", "newInstance", "Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsDialog;", "title", "rows", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Lkotlin/collections/ArrayList;", "resultKey", "anchorTopRightX", "anchorTopRightY", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static setBold IconCompatParcelizer(String str, ArrayList<SettingsItem> arrayList, String str2, int i, int i2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            setBold setbold = new setBold();
            getFontSize.IconCompatParcelizer iconCompatParcelizer = getFontSize.read;
            Bundle bundleIconCompatParcelizer = getFontSize.IconCompatParcelizer.IconCompatParcelizer(str, arrayList, str2);
            bundleIconCompatParcelizer.putInt("top_right_x", i);
            bundleIconCompatParcelizer.putInt("top_right_y", i2);
            setbold.setArguments(bundleIconCompatParcelizer);
            return setbold;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final setBold IconCompatParcelizer(String str, ArrayList<SettingsItem> arrayList, String str2, int i, int i2) {
        return Companion.IconCompatParcelizer(str, arrayList, str2, i, i2);
    }
}
