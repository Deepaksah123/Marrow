package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class setCenterTextSize {
    private static final CharacterEscapes<PieChart> read;

    public static final CharacterEscapes<PieChart> read() {
        return read;
    }

    static {
        Object obj;
        CharacterEscapes characterEscapes;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            ClassLoader classLoader = PieChart.class.getClassLoader();
            toMagicModuleMetaRepoModel.write(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", new Class[0]);
            Annotation[] annotations = method.getAnnotations();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotations, "");
            Annotation[] annotationArr = annotations;
            int length = annotationArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (annotationArr[i] instanceof getRenewGrpId) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    if (objInvoke instanceof CharacterEscapes) {
                        characterEscapes = (CharacterEscapes) objInvoke;
                    }
                }
            }
            characterEscapes = null;
            obj = C0177getRfBanners.read(characterEscapes);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        CharacterEscapes<PieChart> characterEscapes2 = (CharacterEscapes) (C0177getRfBanners.RemoteActionCompatParcelizer(obj) ? null : obj);
        if (characterEscapes2 == null) {
            characterEscapes2 = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.setCenterText
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setCenterTextSize.write();
                }
            });
        }
        read = characterEscapes2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PieChart write() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present".toString());
    }
}
