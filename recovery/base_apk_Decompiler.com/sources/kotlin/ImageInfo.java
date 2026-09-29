package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageInfo extends setThumbnailHeight implements getStartTimeStamp {
    private final Object read;

    public ImageInfo(Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        this.read = obj;
    }

    @Override // kotlin.getStartTimeStamp
    public final setQuestionCount AudioAttributesCompatParcelizer() throws IllegalAccessException, InvocationTargetException {
        Class<?> clsRemoteActionCompatParcelizer = setHtmlContent.write.RemoteActionCompatParcelizer(this.read);
        if (clsRemoteActionCompatParcelizer != null) {
            return new getThumbnailHeight(clsRemoteActionCompatParcelizer);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.setThumbnailHeight
    public final Member write() throws IllegalAccessException, InvocationTargetException {
        Method methodAudioAttributesCompatParcelizer = setHtmlContent.write.AudioAttributesCompatParcelizer(this.read);
        if (methodAudioAttributesCompatParcelizer != null) {
            return methodAudioAttributesCompatParcelizer;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }
}
