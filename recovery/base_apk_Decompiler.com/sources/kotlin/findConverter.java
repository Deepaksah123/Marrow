package kotlin;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ac\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001a\u001a\u00020\f*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Lo/hasValueTypeDeserializer;", "p0", "Lo/SettableBeanProperty;", "p1", "Lo/deserializeFromNumber;", "p2", "Landroid/graphics/Matrix;", "p3", "Lo/WritableTypeIdInclusion;", "p4", "p5", "", "p6", "p7", "p8", "p9", "Landroid/view/inputmethod/CursorAnchorInfo;", "RemoteActionCompatParcelizer", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/deserializeFromNumber;Landroid/graphics/Matrix;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "AudioAttributesCompatParcelizer", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/WritableTypeIdInclusion;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "read", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/WritableTypeIdInclusion;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "write", "(Lo/WritableTypeIdInclusion;FF)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findConverter {
    @getRenewGrpId
    public static final CursorAnchorInfo RemoteActionCompatParcelizer(CursorAnchorInfo.Builder builder, hasValueTypeDeserializer hasvaluetypedeserializer, SettableBeanProperty settableBeanProperty, deserializeFromNumber deserializefromnumber, Matrix matrix, WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        builder.setSelectionRange(iMediaBrowserCompatCustomActionResultReceiver, findProperty.AudioAttributesImplApi26Parcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer()));
        if (z) {
            AudioAttributesCompatParcelizer(builder, iMediaBrowserCompatCustomActionResultReceiver, settableBeanProperty, deserializefromnumber, writableTypeIdInclusion);
        }
        if (z2) {
            findProperty iconCompatParcelizer = hasvaluetypedeserializer.getIconCompatParcelizer();
            int iMediaBrowserCompatCustomActionResultReceiver2 = iconCompatParcelizer != null ? findProperty.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer.getIconCompatParcelizer()) : -1;
            findProperty iconCompatParcelizer2 = hasvaluetypedeserializer.getIconCompatParcelizer();
            int iAudioAttributesImplApi26Parcelizer = iconCompatParcelizer2 != null ? findProperty.AudioAttributesImplApi26Parcelizer(iconCompatParcelizer2.getIconCompatParcelizer()) : -1;
            if (iMediaBrowserCompatCustomActionResultReceiver2 >= 0 && iMediaBrowserCompatCustomActionResultReceiver2 < iAudioAttributesImplApi26Parcelizer) {
                builder.setComposingText(iMediaBrowserCompatCustomActionResultReceiver2, hasvaluetypedeserializer.AudioAttributesCompatParcelizer().subSequence(iMediaBrowserCompatCustomActionResultReceiver2, iAudioAttributesImplApi26Parcelizer));
                read(builder, iMediaBrowserCompatCustomActionResultReceiver2, iAudioAttributesImplApi26Parcelizer, settableBeanProperty, deserializefromnumber, writableTypeIdInclusion);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && z3) {
            findValueDeserializer.AudioAttributesCompatParcelizer(builder, writableTypeIdInclusion2);
        }
        if (Build.VERSION.SDK_INT >= 34 && z4) {
            _handleUnknownValueDeserializer.AudioAttributesCompatParcelizer(builder, deserializefromnumber, writableTypeIdInclusion);
        }
        return builder.build();
    }

    private static final CursorAnchorInfo.Builder AudioAttributesCompatParcelizer(CursorAnchorInfo.Builder builder, int i, SettableBeanProperty settableBeanProperty, deserializeFromNumber deserializefromnumber, WritableTypeIdInclusion writableTypeIdInclusion) {
        if (i < 0) {
            return builder;
        }
        int iRemoteActionCompatParcelizer = settableBeanProperty.RemoteActionCompatParcelizer(i);
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = deserializefromnumber.IconCompatParcelizer(iRemoteActionCompatParcelizer);
        float f = getQues.read(writableTypeIdInclusionIconCompatParcelizer.getAudioAttributesCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, (int) (deserializefromnumber.getRead() >> 32));
        boolean zWrite = write(writableTypeIdInclusion, f, writableTypeIdInclusionIconCompatParcelizer.getRemoteActionCompatParcelizer());
        boolean zWrite2 = write(writableTypeIdInclusion, f, writableTypeIdInclusionIconCompatParcelizer.getIconCompatParcelizer());
        boolean z = deserializefromnumber.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer) == _properties.IconCompatParcelizer;
        int i2 = (zWrite || zWrite2) ? 1 : 0;
        if (!zWrite || !zWrite2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(f, writableTypeIdInclusionIconCompatParcelizer.getRemoteActionCompatParcelizer(), writableTypeIdInclusionIconCompatParcelizer.getIconCompatParcelizer(), writableTypeIdInclusionIconCompatParcelizer.getIconCompatParcelizer(), z ? i2 | 4 : i2);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.inputmethod.CursorAnchorInfo$Builder] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder read(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, kotlin.SettableBeanProperty r20, kotlin.deserializeFromNumber r21, kotlin.WritableTypeIdInclusion r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.RemoteActionCompatParcelizer(r2)
            int r5 = r1.RemoteActionCompatParcelizer(r0)
            int r6 = r5 - r4
            int r6 = r6 << 2
            float[] r6 = new float[r6]
            o._checkImplicitlyNamedConstructors r7 = r21.getWrite()
            long r8 = kotlin.getValueInstantiator.write(r4, r5)
            r5 = 0
            r7.AudioAttributesCompatParcelizer(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8b
            int r5 = r1.RemoteActionCompatParcelizer(r2)
            int r7 = r5 - r4
            int r7 = r7 << 2
            r8 = r6[r7]
            int r9 = r7 + 1
            r9 = r6[r9]
            int r10 = r7 + 2
            r10 = r6[r10]
            int r7 = r7 + 3
            r7 = r6[r7]
            o.WritableTypeIdInclusion r11 = new o.WritableTypeIdInclusion
            r11.<init>(r8, r9, r10, r7)
            boolean r7 = r3.IconCompatParcelizer(r11)
            float r8 = r11.getAudioAttributesCompatParcelizer()
            float r9 = r11.getRemoteActionCompatParcelizer()
            boolean r8 = write(r3, r8, r9)
            if (r8 == 0) goto L5f
            float r8 = r11.getWrite()
            float r9 = r11.getIconCompatParcelizer()
            boolean r8 = write(r3, r8, r9)
            if (r8 != 0) goto L61
        L5f:
            r7 = r7 | 2
        L61:
            r8 = r21
            o._properties r5 = r8.RemoteActionCompatParcelizer(r5)
            o._properties r9 = kotlin._properties.IconCompatParcelizer
            if (r5 != r9) goto L70
            r5 = r7 | 4
            r16 = r5
            goto L72
        L70:
            r16 = r7
        L72:
            float r12 = r11.getAudioAttributesCompatParcelizer()
            float r13 = r11.getRemoteActionCompatParcelizer()
            float r14 = r11.getWrite()
            float r15 = r11.getIconCompatParcelizer()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findConverter.read(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, o.SettableBeanProperty, o.deserializeFromNumber, o.WritableTypeIdInclusion):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    private static final boolean write(WritableTypeIdInclusion writableTypeIdInclusion, float f, float f2) {
        float audioAttributesCompatParcelizer = writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        if (f > writableTypeIdInclusion.getWrite() || audioAttributesCompatParcelizer > f) {
            return false;
        }
        return f2 <= writableTypeIdInclusion.getIconCompatParcelizer() && writableTypeIdInclusion.getRemoteActionCompatParcelizer() <= f2;
    }
}
