package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getFileName extends hasImageCitation implements getImageTitle, setStartTimeStamp {
    private final TypeVariable<?> AudioAttributesCompatParcelizer;

    @Override // kotlin.HomeQbankModel
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // kotlin.HomeQbankModel
    public final /* bridge */ /* synthetic */ Collection read() {
        return read();
    }

    @Override // kotlin.HomeQbankModel
    public final /* synthetic */ RecentUpdatesReferences write(getNotesCount getnotescount) {
        return IconCompatParcelizer(getnotescount);
    }

    public getFileName(TypeVariable<?> typeVariable) {
        toMagicModuleMetaRepoModel.write(typeVariable, "");
        this.AudioAttributesCompatParcelizer = typeVariable;
    }

    @Override // kotlin.getImageTitle, kotlin.HomeQbankModel
    public final List<getAspectRatio> read() {
        Annotation[] declaredAnnotations;
        AnnotatedElement annotatedElementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return (annotatedElementRemoteActionCompatParcelizer == null || (declaredAnnotations = annotatedElementRemoteActionCompatParcelizer.getDeclaredAnnotations()) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : getImageCitationLicense.IconCompatParcelizer(declaredAnnotations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setStartTimeStamp
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public List<getThumbnailHeight> write() {
        Type[] bounds = this.AudioAttributesCompatParcelizer.getBounds();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bounds, "");
        Type[] typeArr = bounds;
        ArrayList arrayList = new ArrayList(typeArr.length);
        for (Type type : typeArr) {
            arrayList.add(new getThumbnailHeight(type));
        }
        ArrayList arrayList2 = arrayList;
        getThumbnailHeight getthumbnailheight = (getThumbnailHeight) IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((List) arrayList2);
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getthumbnailheight != null ? getthumbnailheight.RemoteActionCompatParcelizer() : null, Object.class) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList2;
    }

    @Override // kotlin.getImageTitle
    public final getAspectRatio IconCompatParcelizer(getNotesCount getnotescount) {
        Annotation[] declaredAnnotations;
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        AnnotatedElement annotatedElementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (annotatedElementRemoteActionCompatParcelizer == null || (declaredAnnotations = annotatedElementRemoteActionCompatParcelizer.getDeclaredAnnotations()) == null) {
            return null;
        }
        return getImageCitationLicense.RemoteActionCompatParcelizer(declaredAnnotations, getnotescount);
    }

    @Override // kotlin.getImageTitle
    public final AnnotatedElement RemoteActionCompatParcelizer() {
        TypeVariable<?> typeVariable = this.AudioAttributesCompatParcelizer;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // kotlin.setExpiryTimeStamp
    public final getRelatedLessonId RatingCompat() {
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.getName());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        return getrelatedlessonidRemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getFileName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((getFileName) obj).AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }
}
