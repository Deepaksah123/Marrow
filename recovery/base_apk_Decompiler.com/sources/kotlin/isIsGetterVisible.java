package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class isIsGetterVisible {
    private static final CharacterEscapes<hasGetter> AudioAttributesCompatParcelizer;

    public static final CharacterEscapes<hasGetter> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    static {
        Object obj;
        CharacterEscapes characterEscapes;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            ClassLoader classLoader = hasGetter.class.getClassLoader();
            toMagicModuleMetaRepoModel.write(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new Class[0]);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (annotations[i] instanceof getRenewGrpId) {
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
        CharacterEscapes<hasGetter> characterEscapes2 = (CharacterEscapes) (C0177getRfBanners.RemoteActionCompatParcelizer(obj) ? null : obj);
        if (characterEscapes2 == null) {
            characterEscapes2 = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.isGetterVisible
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return isIsGetterVisible.AudioAttributesCompatParcelizer();
                }
            });
        }
        AudioAttributesCompatParcelizer = characterEscapes2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasGetter AudioAttributesCompatParcelizer() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present".toString());
    }
}
