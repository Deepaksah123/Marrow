package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.marrow.R;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TtmlStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/getFontSizeUnit;", "Lo/TtmlStyle;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "Landroid/view/View;", "p1", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getTheme", "()I", "write", "Landroid/content/DialogInterface;", "onDismiss", "(Landroid/content/DialogInterface;)V", "RemoteActionCompatParcelizer_"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getFontSizeUnit extends TtmlStyle {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer_, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.TtmlStyle, kotlin.argCount
    public final int getTheme() {
        return R.style.AppThemeV2_Dark_Dialog;
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        Context contextRequireContext;
        Dialog dialog = getDialog();
        if (dialog == null || (contextRequireContext = dialog.getContext()) == null) {
            contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        }
        readMoviChunks readmovichunks = new readMoviChunks(contextRequireContext, getTheme());
        readmovichunks.setCanceledOnTouchOutside(true);
        return readmovichunks;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle p0) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterOnGetLayoutInflater, "");
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new initializeViewTreeOwners(requireContext(), R.style.AppThemeV2_Dark_Dialog));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterCloneInContext, "");
        return layoutInflaterCloneInContext;
    }

    @Override // kotlin.TtmlStyle, androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
    }

    private final void write() {
        LinearLayout linearLayout = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
        ViewGroup.LayoutParams layoutParams = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        linearLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = RemoteActionCompatParcelizer().read;
        ViewGroup.LayoutParams layoutParams2 = RemoteActionCompatParcelizer().read.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        recyclerView.setLayoutParams(layoutParams2);
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onDismiss(p0);
    }

    /* JADX INFO: renamed from: o.getFontSizeUnit$RemoteActionCompatParcelizer_, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/optionpicker/OptionPickerSideSheet$Companion;", "", "<init>", "()V", "newInstance", "Lcom/marrow/ui/activities/learn/video/overlay/optionpicker/OptionPickerSideSheet;", "title", "", "options", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "Lkotlin/collections/ArrayList;", "preselected", "resultKey", "shouldDismissOnOptionSelection", "", "shouldShowBackButton", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$a = {11, 40, -34, 98, 19, 10, 3, -20, 6, -5};
        private static final int $$b = PsExtractor.AUDIO_STREAM;
        private static int read = 0;
        private static int RemoteActionCompatParcelizer = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 39
                int r6 = r6 + 75
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r7 = r7 * 3
                int r7 = 7 - r7
                byte[] r0 = kotlin.getFontSizeUnit.Companion.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2d
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2d:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r3 + 1
                int r7 = r7 + 6
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.getFontSizeUnit.Companion.a(short, byte, int, java.lang.Object[]):void");
        }

        private Companion() {
        }

        @getMagicModuleMeta
        public static getFontSizeUnit read(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, boolean z, boolean z2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            getFontSizeUnit getfontsizeunit = new getFontSizeUnit();
            TtmlStyle.Companion companion = TtmlStyle.INSTANCE;
            getfontsizeunit.setArguments(TtmlStyle.Companion.write(str, arrayList, optionItem, str2, z, z2));
            return getfontsizeunit;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0759  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] RemoteActionCompatParcelizer(int r37, int r38, int r39) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2516
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.getFontSizeUnit.Companion.RemoteActionCompatParcelizer(int, int, int):java.lang.Object[]");
        }
    }

    @getMagicModuleMeta
    public static final getFontSizeUnit IconCompatParcelizer(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, boolean z, boolean z2) {
        return Companion.read(str, arrayList, optionItem, str2, z, z2);
    }
}
