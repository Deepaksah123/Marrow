package kotlin;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TtmlStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J!\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/getMultiRowAlign;", "Lo/TtmlStyle;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "onStart", "write", "Landroid/view/View;", "p1", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer_"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getMultiRowAlign extends TtmlStyle {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer_, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        Dialog dialog = new Dialog(requireContext(), getTheme());
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        write();
    }

    private final void write() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Bundle bundleRequireArguments = requireArguments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleRequireArguments, "");
        Integer num = null;
        if (bundleRequireArguments.containsKey("dialog_fixed_width")) {
            Object obj = bundleRequireArguments.get("dialog_fixed_width");
            num = (Integer) (obj instanceof Integer ? obj : null);
        }
        int iIntValue = (int) ((num != null ? num.intValue() : 366) * displayMetrics.density);
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setLayout(iIntValue, -2);
    }

    @Override // kotlin.TtmlStyle, androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer().IconCompatParcelizer().setBackground(_isNaN.getDrawable(requireContext(), com.marrow.R.drawable.drawable_rounded_on_surface_8dp));
    }

    /* JADX INFO: renamed from: o.getMultiRowAlign$RemoteActionCompatParcelizer_, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0087\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/optionpicker/OptionPickerDialog$Companion;", "", "<init>", "()V", "ARG_RIGHT_CORNER_X", "", "ARG_RIGHT_CORNER_Y", "ARG_DIALOG_MAX_HEIGHT_DP", "ARG_DIALOG_FIXED_WIDTH_DP", "DEFAULT_MAX_HEIGHT_DP", "", "DEFAULT_FIXED_WIDTH_DP", "ARG_SHOULD_ANCHOR_BOTTOM_RIGHT", "newInstance", "Lcom/marrow/ui/activities/learn/video/overlay/optionpicker/OptionPickerDialog;", "title", "options", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "Lkotlin/collections/ArrayList;", "preselected", "resultKey", "shouldDismissOnOptionSelection", "", "anchorRightX", "anchorRightY", "shouldShowBackButton", "shouldAnchorBottomRight", "maxHeightDp", "fixedWidthDp", "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/marrow/ui/activities/learn/video/overlay/optionpicker/OptionPickerDialog;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ getMultiRowAlign write(String str, ArrayList arrayList, OptionItem optionItem, String str2, boolean z, Integer num, Integer num2, boolean z2, boolean z3, Integer num3, Integer num4, int i) {
            return read(str, arrayList, optionItem, str2, z, num, num2, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : num4);
        }

        @getMagicModuleMeta
        private static getMultiRowAlign read(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, boolean z, Integer num, Integer num2, boolean z2, boolean z3, Integer num3, Integer num4) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            getMultiRowAlign getmultirowalign = new getMultiRowAlign();
            TtmlStyle.Companion remoteActionCompatParcelizer = TtmlStyle.INSTANCE;
            Bundle bundleWrite = TtmlStyle.Companion.write(str, arrayList, optionItem, str2, z, z2);
            if (num != null) {
                bundleWrite.putInt("right_x", num.intValue());
            }
            if (num2 != null) {
                bundleWrite.putInt("right_y", num2.intValue());
            }
            bundleWrite.putBoolean("should_anchor_bottom_right", z3);
            if (num3 != null) {
                bundleWrite.putInt("max_height", num3.intValue());
            }
            if (num4 != null) {
                bundleWrite.putInt("dialog_fixed_width", num4.intValue());
            }
            getmultirowalign.setArguments(bundleWrite);
            return getmultirowalign;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final getMultiRowAlign write(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, boolean z, Integer num, Integer num2, boolean z2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            return write(str, arrayList, optionItem, str2, true, num, num2, true, false, null, null, 1792);
        }

        @getMagicModuleMeta
        public final getMultiRowAlign RemoteActionCompatParcelizer(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, boolean z, Integer num, Integer num2, boolean z2, boolean z3, Integer num3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            return write(str, arrayList, optionItem, str2, z, num, num2, z2, z3, num3, null, 1024);
        }
    }

    @getMagicModuleMeta
    public static final getMultiRowAlign AudioAttributesCompatParcelizer(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, Integer num, Integer num2) {
        return INSTANCE.write(str, arrayList, optionItem, str2, true, num, num2, true);
    }

    @getMagicModuleMeta
    public static final getMultiRowAlign read(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, boolean z, Integer num, Integer num2, boolean z2, boolean z3, Integer num3) {
        return INSTANCE.RemoteActionCompatParcelizer(str, arrayList, optionItem, str2, z, num, num2, z2, z3, num3);
    }
}
