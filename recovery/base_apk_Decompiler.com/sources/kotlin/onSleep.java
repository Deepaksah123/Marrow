package kotlin;

import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class onSleep {
    private static final Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("ef");
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write("nm", "v");
    private mediaSourceListUpdateRequestedInternal AudioAttributesCompatParcelizer;
    private mediaSourceListUpdateRequestedInternal AudioAttributesImplApi21Parcelizer;
    private mediaSourceListUpdateRequestedInternal AudioAttributesImplBaseParcelizer;
    private mediaSourceListUpdateRequestedInternal IconCompatParcelizer;
    private maybeUpdateReadingRenderers RemoteActionCompatParcelizer;

    final ExoPlayerImplInternalExternalSyntheticLambda2 IconCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal4;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            if (format1.AudioAttributesCompatParcelizer(read) == 0) {
                format1.read();
                while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                    RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                }
                format1.write();
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        maybeUpdateReadingRenderers maybeupdatereadingrenderers = this.RemoteActionCompatParcelizer;
        if (maybeupdatereadingrenderers == null || (mediasourcelistupdaterequestedinternal = this.AudioAttributesImplBaseParcelizer) == null || (mediasourcelistupdaterequestedinternal2 = this.IconCompatParcelizer) == null || (mediasourcelistupdaterequestedinternal3 = this.AudioAttributesCompatParcelizer) == null || (mediasourcelistupdaterequestedinternal4 = this.AudioAttributesImplApi21Parcelizer) == null) {
            return null;
        }
        return new ExoPlayerImplInternalExternalSyntheticLambda2(maybeupdatereadingrenderers, mediasourcelistupdaterequestedinternal, mediasourcelistupdaterequestedinternal2, mediasourcelistupdaterequestedinternal3, mediasourcelistupdaterequestedinternal4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer(kotlin.Format1 r8, kotlin.ExoPlayerImplExternalSyntheticLambda19 r9) throws java.io.IOException {
        /*
            r7 = this;
            r8.AudioAttributesCompatParcelizer()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r8.MediaBrowserCompatCustomActionResultReceiver()
            if (r1 == 0) goto L99
            o.Format1$AudioAttributesCompatParcelizer r1 = kotlin.onSleep.write
            int r1 = r8.AudioAttributesCompatParcelizer(r1)
            if (r1 == 0) goto L93
            r2 = 1
            if (r1 == r2) goto L1d
            r8.MediaDescriptionCompat()
            r8.RatingCompat()
            goto L5
        L1d:
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            switch(r1) {
                case 353103893: goto L55;
                case 397447147: goto L4a;
                case 1041377119: goto L40;
                case 1379387491: goto L36;
                case 1383710113: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L5f
        L2c:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5f
            r1 = r3
            goto L60
        L36:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5f
            r1 = r4
            goto L60
        L40:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5f
            r1 = r5
            goto L60
        L4a:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L53
            goto L5f
        L53:
            r1 = r2
            goto L60
        L55:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5f
            r1 = r6
            goto L60
        L5f:
            r1 = -1
        L60:
            if (r1 == 0) goto L8b
            if (r1 == r2) goto L83
            if (r1 == r5) goto L7c
            if (r1 == r4) goto L75
            if (r1 == r3) goto L6e
            r8.RatingCompat()
            goto L5
        L6e:
            o.mediaSourceListUpdateRequestedInternal r1 = kotlin.onContinueLoadingRequested.RemoteActionCompatParcelizer(r8, r9)
            r7.AudioAttributesImplApi21Parcelizer = r1
            goto L5
        L75:
            o.maybeUpdateReadingRenderers r1 = kotlin.onContinueLoadingRequested.AudioAttributesCompatParcelizer(r8, r9)
            r7.RemoteActionCompatParcelizer = r1
            goto L5
        L7c:
            o.mediaSourceListUpdateRequestedInternal r1 = kotlin.onContinueLoadingRequested.read(r8, r9, r6)
            r7.IconCompatParcelizer = r1
            goto L5
        L83:
            o.mediaSourceListUpdateRequestedInternal r1 = kotlin.onContinueLoadingRequested.read(r8, r9, r6)
            r7.AudioAttributesImplBaseParcelizer = r1
            goto L5
        L8b:
            o.mediaSourceListUpdateRequestedInternal r1 = kotlin.onContinueLoadingRequested.RemoteActionCompatParcelizer(r8, r9)
            r7.AudioAttributesCompatParcelizer = r1
            goto L5
        L93:
            java.lang.String r0 = r8.MediaBrowserCompatSearchResultReceiver()
            goto L5
        L99:
            r8.IconCompatParcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSleep.RemoteActionCompatParcelizer(o.Format1, o.ExoPlayerImplExternalSyntheticLambda19):void");
    }
}
