package kotlin;

import kotlin.Metadata;
import kotlin.onDismiss;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fBa\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setupDialog;", "Lo/onDismiss;", "Lo/onDismiss$RemoteActionCompatParcelizer;", "p0", "", "p1", "p2", "Lkotlin/Function1;", "Lo/onGetLayoutInflater;", "Lkotlin/Function0;", "", "p3", "p4", "<init>", "(Lo/onDismiss$RemoteActionCompatParcelizer;IILo/getAnswerMap;Lo/getAnswerMap;)V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setupDialog extends onDismiss {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final setupDialog RemoteActionCompatParcelizer = new setupDialog(onDismiss.RemoteActionCompatParcelizer.read, 0, 0, null, null, 30, null);
    private static final setupDialog AudioAttributesCompatParcelizer = new setupDialog(onDismiss.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, 0, 0, null, null, 30, null);

    private setupDialog(onDismiss.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2, getAnswerMap<? super onGetLayoutInflater, ? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> getanswermap, getAnswerMap<? super onGetLayoutInflater, ? extends MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>> getanswermap2) {
        super(remoteActionCompatParcelizer, i, i2, getanswermap, getanswermap2, null);
    }

    /* synthetic */ setupDialog(onDismiss.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2, getAnswerMap getanswermap, getAnswerMap getanswermap2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(remoteActionCompatParcelizer, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : getanswermap, (i3 & 16) != 0 ? null : getanswermap2);
    }

    /* JADX INFO: renamed from: o.setupDialog$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u00052\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013J_\u0010\u0014\u001a\u00020\u00052\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;", "", "<init>", "()V", "Visible", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "getVisible$annotations", "getVisible", "()Landroidx/compose/foundation/layout/FlowRowOverflow;", "Clip", "getClip$annotations", "getClip", "expandIndicator", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/layout/FlowRowOverflow;", "expandOrCollapseIndicator", "collapseIndicator", "minRowsToShowCollapse", "", "minHeightToShowCollapse", "Landroidx/compose/ui/unit/Dp;", "expandOrCollapseIndicator--jt2gSs", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/FlowRowOverflow;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final setupDialog write() {
            return setupDialog.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
