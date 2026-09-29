package kotlin;

import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin._handleApos;
import kotlin.using;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011"}, d2 = {"Lo/_assertNotNull;", "p0", "Lo/_checkRangeBoundsForCharArray;", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;)Lo/_checkRangeBoundsForCharArray;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lo/convertNumberToLong;", "Lkotlin/Function0;", "", "p1", "Lo/createChildArrayContext;", "read", "(Landroidx/compose/ui/platform/AbstractComposeView;Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)Lo/createChildArrayContext;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p2", "(Landroidx/compose/ui/platform/AndroidComposeView;Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)Lo/createChildArrayContext;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "write"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getIsIgnoredType {
    private static final ViewGroup.LayoutParams RemoteActionCompatParcelizer = new ViewGroup.LayoutParams(-2, -2);

    public static final _checkRangeBoundsForCharArray<_assertNotNull> RemoteActionCompatParcelizer(_assertNotNull _assertnotnull) {
        return new hasNamespace(_assertnotnull);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.createChildArrayContext read(androidx.compose.ui.platform.AbstractComposeView r3, kotlin.convertNumberToLong r4, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r5) {
        /*
            o.setAttribute r0 = kotlin.setAttribute.INSTANCE
            r0.AudioAttributesCompatParcelizer()
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L17
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L1a
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L1b
        L17:
            r3.removeAllViews()
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L33
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r3.getContext()
            o.CurrentQuery r2 = r4.getOnPlayFromSearch()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()
            android.view.ViewGroup$LayoutParams r2 = kotlin.getIsIgnoredType.RemoteActionCompatParcelizer
            r3.addView(r1, r2)
        L33:
            o.createChildArrayContext r3 = RemoteActionCompatParcelizer(r0, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getIsIgnoredType.read(androidx.compose.ui.platform.AbstractComposeView, o.convertNumberToLong, o.MagicModuleSubmissionRequestBody):o.createChildArrayContext");
    }

    private static final createChildArrayContext RemoteActionCompatParcelizer(AndroidComposeView androidComposeView, convertNumberToLong convertnumbertolong, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
        if (C0214type.AudioAttributesCompatParcelizer() && androidComposeView.getTag(_handleApos.AudioAttributesCompatParcelizer.inspection_slot_table_set) == null) {
            androidComposeView.setTag(_handleApos.AudioAttributesCompatParcelizer.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw().getTag(_handleApos.AudioAttributesCompatParcelizer.wrapped_composition_tag);
        getIncludeAsProperty getincludeasproperty = tag instanceof getIncludeAsProperty ? (getIncludeAsProperty) tag : null;
        if (getincludeasproperty == null) {
            getincludeasproperty = new getIncludeAsProperty(androidComposeView, getTokenCharacterOffset.AudioAttributesCompatParcelizer(new hasNamespace(androidComposeView.getAddMenuProvider()), convertnumbertolong));
            androidComposeView.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw().setTag(_handleApos.AudioAttributesCompatParcelizer.wrapped_composition_tag, getincludeasproperty);
        }
        getincludeasproperty.IconCompatParcelizer(magicModuleSubmissionRequestBody);
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(androidComposeView.getCoroutineContext(), convertnumbertolong.getOnPlayFromSearch())) {
            androidComposeView.setCoroutineContext(convertnumbertolong.getOnPlayFromSearch());
        }
        androidComposeView.setFrameEndScheduler$ui(new AudioAttributesCompatParcelizer(convertnumbertolong));
        return getincludeasproperty;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer implements using.write, MagicModuleRepositoryImplExternalSyntheticLambda3 {
        final /* synthetic */ convertNumberToLong RemoteActionCompatParcelizer;

        @Override // o.using.write
        public final _contentReference RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            return this.RemoteActionCompatParcelizer.write(getcreatedondatems);
        }

        AudioAttributesCompatParcelizer(convertNumberToLong convertnumbertolong) {
            this.RemoteActionCompatParcelizer = convertnumbertolong;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof using.write) && (obj instanceof MagicModuleRepositoryImplExternalSyntheticLambda3)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(read(), ((MagicModuleRepositoryImplExternalSyntheticLambda3) obj).read());
            }
            return false;
        }

        @Override // kotlin.MagicModuleRepositoryImplExternalSyntheticLambda3
        public final setRenewGrpId<?> read() {
            return new MagicModuleRepositoryImpl_Factory(1, this.RemoteActionCompatParcelizer, convertNumberToLong.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
        }

        public final int hashCode() {
            return read().hashCode();
        }
    }
}
