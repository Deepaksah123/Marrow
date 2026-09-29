package kotlin;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.SettingsItem;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentProviderModule {
    private static final getRelatedModuleAdapter IconCompatParcelizer;
    private static final getRelatedModuleAdapter read;

    static {
        getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
        IconCompatParcelizer = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("\"\\");
        getRelatedModuleAdapter.Companion companion2 = getRelatedModuleAdapter.INSTANCE;
        read = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("\t ,=");
    }

    public static final List<EmptyResponseException> AudioAttributesCompatParcelizer(ShapeKt shapeKt, String str) {
        toMagicModuleMetaRepoModel.write(shapeKt, "");
        toMagicModuleMetaRepoModel.write(str, "");
        ArrayList arrayList = new ArrayList();
        int iIconCompatParcelizer = shapeKt.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            if (TestGroupLSModel.read(str, shapeKt.IconCompatParcelizer(i), true)) {
                try {
                    read(new resetCurrentSelectedPosition().read(shapeKt.AudioAttributesCompatParcelizer(i)), arrayList);
                } catch (EOFException e) {
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write();
                    SettingsItem.AudioAttributesCompatParcelizer("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void read(kotlin.resetCurrentSelectedPosition r6, java.util.List<kotlin.EmptyResponseException> r7) throws java.io.EOFException {
        /*
        L0:
            r0 = 0
            r1 = r0
        L2:
            if (r1 != 0) goto Ld
            AudioAttributesCompatParcelizer(r6)
            java.lang.String r1 = RemoteActionCompatParcelizer(r6)
            if (r1 == 0) goto Lb4
        Ld:
            boolean r2 = AudioAttributesCompatParcelizer(r6)
            java.lang.String r3 = RemoteActionCompatParcelizer(r6)
            if (r3 != 0) goto L2a
            boolean r6 = r6.MediaBrowserCompatCustomActionResultReceiver()
            if (r6 == 0) goto Lb4
            o.EmptyResponseException r6 = new o.EmptyResponseException
            java.util.Map r0 = kotlin.VideoTimelineResponseBody.read()
            r6.<init>(r1, r0)
            r7.add(r6)
            return
        L2a:
            int r4 = kotlin.FirebaseDataModule.AudioAttributesCompatParcelizer(r6)
            boolean r5 = AudioAttributesCompatParcelizer(r6)
            if (r2 != 0) goto L65
            if (r5 != 0) goto L3c
            boolean r2 = r6.MediaBrowserCompatCustomActionResultReceiver()
            if (r2 == 0) goto L65
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "="
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r3 = kotlin.TestGroupLSModel.read(r3, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r2)
            java.lang.String r2 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r2)
            o.EmptyResponseException r2 = new o.EmptyResponseException
            r2.<init>(r1, r0)
            r7.add(r2)
            goto L0
        L65:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            int r5 = kotlin.FirebaseDataModule.AudioAttributesCompatParcelizer(r6)
            int r4 = r4 + r5
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = RemoteActionCompatParcelizer(r6)
            boolean r4 = AudioAttributesCompatParcelizer(r6)
            if (r4 != 0) goto Lb5
            int r4 = kotlin.FirebaseDataModule.AudioAttributesCompatParcelizer(r6)
        L81:
            if (r4 == 0) goto Lb5
            r5 = 1
            if (r4 > r5) goto Lb4
            boolean r5 = AudioAttributesCompatParcelizer(r6)
            if (r5 != 0) goto Lb4
            boolean r5 = write(r6)
            if (r5 == 0) goto L97
            java.lang.String r5 = read(r6)
            goto L9b
        L97:
            java.lang.String r5 = RemoteActionCompatParcelizer(r6)
        L9b:
            if (r5 == 0) goto Lb4
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto Lb4
            boolean r3 = AudioAttributesCompatParcelizer(r6)
            if (r3 != 0) goto Lb2
            boolean r3 = r6.MediaBrowserCompatCustomActionResultReceiver()
            if (r3 != 0) goto Lb2
            goto Lb4
        Lb2:
            r3 = r0
            goto L71
        Lb4:
            return
        Lb5:
            o.EmptyResponseException r4 = new o.EmptyResponseException
            r4.<init>(r1, r2)
            r7.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.FragmentProviderModule.read(o.resetCurrentSelectedPosition, java.util.List):void");
    }

    private static final boolean AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition) throws EOFException {
        boolean z = false;
        while (!resetcurrentselectedposition.MediaBrowserCompatCustomActionResultReceiver()) {
            byte bIconCompatParcelizer = resetcurrentselectedposition.IconCompatParcelizer(0L);
            if (bIconCompatParcelizer != 44) {
                if (bIconCompatParcelizer != 32 && bIconCompatParcelizer != 9) {
                    break;
                }
                resetcurrentselectedposition.MediaMetadataCompat();
            } else {
                resetcurrentselectedposition.MediaMetadataCompat();
                z = true;
            }
        }
        return z;
    }

    private static final boolean write(resetCurrentSelectedPosition resetcurrentselectedposition) {
        return !resetcurrentselectedposition.MediaBrowserCompatCustomActionResultReceiver() && resetcurrentselectedposition.IconCompatParcelizer(0L) == 34;
    }

    private static final String read(resetCurrentSelectedPosition resetcurrentselectedposition) throws EOFException {
        if (resetcurrentselectedposition.MediaMetadataCompat() != 34) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        resetCurrentSelectedPosition resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
        while (true) {
            long jRemoteActionCompatParcelizer = resetcurrentselectedposition.RemoteActionCompatParcelizer(IconCompatParcelizer);
            if (jRemoteActionCompatParcelizer == -1) {
                return null;
            }
            if (resetcurrentselectedposition.IconCompatParcelizer(jRemoteActionCompatParcelizer) == 34) {
                resetcurrentselectedposition2.IconCompatParcelizer(resetcurrentselectedposition, jRemoteActionCompatParcelizer);
                resetcurrentselectedposition.MediaMetadataCompat();
                return resetcurrentselectedposition2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            if (resetcurrentselectedposition.getSize() == jRemoteActionCompatParcelizer + 1) {
                return null;
            }
            resetcurrentselectedposition2.IconCompatParcelizer(resetcurrentselectedposition, jRemoteActionCompatParcelizer);
            resetcurrentselectedposition.MediaMetadataCompat();
            resetcurrentselectedposition2.IconCompatParcelizer(resetcurrentselectedposition, 1L);
        }
    }

    private static final String RemoteActionCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition) {
        long jRemoteActionCompatParcelizer = resetcurrentselectedposition.RemoteActionCompatParcelizer(read);
        if (jRemoteActionCompatParcelizer == -1) {
            jRemoteActionCompatParcelizer = resetcurrentselectedposition.getSize();
        }
        if (jRemoteActionCompatParcelizer != 0) {
            return resetcurrentselectedposition.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer);
        }
        return null;
    }

    public static final void RemoteActionCompatParcelizer(AppTheme appTheme, ThemeAlphaConstantsKt themeAlphaConstantsKt, ShapeKt shapeKt) {
        toMagicModuleMetaRepoModel.write(appTheme, "");
        toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt, "");
        toMagicModuleMetaRepoModel.write(shapeKt, "");
        if (appTheme != AppTheme.NO_COOKIES) {
            List<MarrowVideoDownloadExceptionCompanion> listWrite = MarrowVideoDownloadExceptionCompanion.INSTANCE.write(themeAlphaConstantsKt, shapeKt);
            if (listWrite.isEmpty()) {
                return;
            }
            appTheme.IconCompatParcelizer(themeAlphaConstantsKt, listWrite);
        }
    }

    public static final boolean write(C0156TypeKt c0156TypeKt) {
        toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) c0156TypeKt.getRequest().getMethod(), (Object) "HEAD")) {
            return false;
        }
        int code = c0156TypeKt.getCode();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && FirebaseDataModule.write(c0156TypeKt) == -1 && !TestGroupLSModel.read("chunked", C0156TypeKt.IconCompatParcelizer(c0156TypeKt, "Transfer-Encoding"), true)) ? false : true;
    }

    @getRenewGrpId
    public static final boolean RemoteActionCompatParcelizer(C0156TypeKt c0156TypeKt) {
        toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
        return write(c0156TypeKt);
    }
}
