package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.getEncryptKey;
import kotlin.setMsInterimHtmlStartTime;

/* JADX INFO: loaded from: classes4.dex */
public final class setImageTitle extends setThumbnailHeight implements extract {
    private final Method write;
    private static final byte[] $$a = {91, -41, -108, -7, 19, 10, 3, -20, 6, -5};
    private static final int $$b = 120;
    private static int read = 0;
    private static int IconCompatParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 7 - r6
            int r7 = r7 * 4
            int r0 = r7 + 4
            int r8 = r8 * 39
            int r8 = r8 + 75
            byte[] r1 = kotlin.setImageTitle.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 6
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setImageTitle.a(short, short, byte, java.lang.Object[]):void");
    }

    public setImageTitle(Method method) {
        toMagicModuleMetaRepoModel.write(method, "");
        this.write = method;
    }

    @Override // kotlin.setThumbnailHeight
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public final Method write() {
        return this.write;
    }

    @Override // kotlin.extract
    public final List<setStatus> AudioAttributesImplApi21Parcelizer() {
        Type[] genericParameterTypes = write().getGenericParameterTypes();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
        Annotation[][] parameterAnnotations = write().getParameterAnnotations();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterAnnotations, "");
        return write(genericParameterTypes, parameterAnnotations, write().isVarArgs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.extract
    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
    public getEncryptKey MediaBrowserCompatItemReceiver() {
        getEncryptKey.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getEncryptKey.write;
        Type genericReturnType = write().getGenericReturnType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericReturnType, "");
        return getEncryptKey.RemoteActionCompatParcelizer.IconCompatParcelizer(genericReturnType);
    }

    @Override // kotlin.extract
    public final setTagsList AudioAttributesCompatParcelizer() {
        Object defaultValue = write().getDefaultValue();
        setMsInterimHtmlStartTime setmsinterimhtmlstarttime = null;
        if (defaultValue != null) {
            setMsInterimHtmlStartTime.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = setMsInterimHtmlStartTime.write;
            setmsinterimhtmlstarttime = setMsInterimHtmlStartTime.AudioAttributesCompatParcelizer.read(defaultValue, null);
        }
        return setmsinterimhtmlstarttime;
    }

    @Override // kotlin.setResultAvailable
    public final List<getFileName> onCommand() {
        TypeVariable<Method>[] typeParameters = write().getTypeParameters();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typeParameters, "");
        TypeVariable<Method>[] typeVariableArr = typeParameters;
        ArrayList arrayList = new ArrayList(typeVariableArr.length);
        for (TypeVariable<Method> typeVariable : typeVariableArr) {
            arrayList.add(new getFileName(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.extract
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return AudioAttributesCompatParcelizer() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x06b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] RemoteActionCompatParcelizer(int r36, int r37, int r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setImageTitle.RemoteActionCompatParcelizer(int, int, int):java.lang.Object[]");
    }
}
