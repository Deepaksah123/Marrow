package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C0212toJsonArray;
import kotlin.fromSection;
import kotlin.getEncryptKey;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setThumbnailHeight extends hasImageCitation implements getImageTitle, setImageCitationLink, getResultTimeStamp {
    @Override // kotlin.HomeQbankModel
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public abstract Member write();

    @Override // kotlin.HomeQbankModel
    public final /* bridge */ /* synthetic */ Collection read() {
        return read();
    }

    @Override // kotlin.HomeQbankModel
    public final /* synthetic */ RecentUpdatesReferences write(getNotesCount getnotescount) {
        return IconCompatParcelizer(getnotescount);
    }

    @Override // kotlin.getImageTitle, kotlin.HomeQbankModel
    public final List<getAspectRatio> read() {
        Annotation[] declaredAnnotations;
        AnnotatedElement annotatedElementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return (annotatedElementRemoteActionCompatParcelizer == null || (declaredAnnotations = annotatedElementRemoteActionCompatParcelizer.getDeclaredAnnotations()) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : getImageCitationLicense.IconCompatParcelizer(declaredAnnotations);
    }

    @Override // kotlin.getUserStartedTimestamp
    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return Modifier.isAbstract(MediaMetadataCompat());
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

    @Override // kotlin.getUserStartedTimestamp
    public final boolean onPlayFromUri() {
        return Modifier.isStatic(MediaMetadataCompat());
    }

    @Override // kotlin.getImageTitle
    public final AnnotatedElement RemoteActionCompatParcelizer() {
        Member memberWrite = write();
        toMagicModuleMetaRepoModel.read(memberWrite, "");
        return (AnnotatedElement) memberWrite;
    }

    @Override // kotlin.setImageCitationLink
    public final int MediaMetadataCompat() {
        return write().getModifiers();
    }

    @Override // kotlin.getUserStartedTimestamp
    public final boolean onPlayFromMediaId() {
        return Modifier.isFinal(MediaMetadataCompat());
    }

    @Override // kotlin.getUserStartedTimestamp
    public final DataSet MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int iMediaMetadataCompat = MediaMetadataCompat();
        if (Modifier.isPublic(iMediaMetadataCompat)) {
            return C0212toJsonArray.MediaBrowserCompatItemReceiver.write;
        }
        if (Modifier.isPrivate(iMediaMetadataCompat)) {
            return C0212toJsonArray.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }
        if (Modifier.isProtected(iMediaMetadataCompat)) {
            return Modifier.isStatic(iMediaMetadataCompat) ? fromSection.write.write : fromSection.RemoteActionCompatParcelizer.IconCompatParcelizer;
        }
        return fromSection.IconCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setExpiryTimeStamp
    public final getRelatedLessonId RatingCompat() {
        String name = write().getName();
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = name != null ? getRelatedLessonId.RemoteActionCompatParcelizer(name) : null;
        return getrelatedlessonidRemoteActionCompatParcelizer == null ? getVideoMetaEncrypt.AudioAttributesImplApi21Parcelizer : getrelatedlessonidRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getResultTimeStamp
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getImageCitation AudioAttributesImplBaseParcelizer() {
        Class<?> declaringClass = write().getDeclaringClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
        return new getImageCitation(declaringClass);
    }

    protected final List<setStatus> write(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        String str;
        toMagicModuleMetaRepoModel.write(typeArr, "");
        toMagicModuleMetaRepoModel.write(annotationArr, "");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> listAudioAttributesCompatParcelizer = ContentImage.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(write());
        int size = listAudioAttributesCompatParcelizer != null ? listAudioAttributesCompatParcelizer.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            getEncryptKey.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getEncryptKey.write;
            getEncryptKey getencryptkeyIconCompatParcelizer = getEncryptKey.RemoteActionCompatParcelizer.IconCompatParcelizer(typeArr[i]);
            if (listAudioAttributesCompatParcelizer != null) {
                str = (String) IntermediateLoginResponseBody.read((List) listAudioAttributesCompatParcelizer, i + size);
                if (str == null) {
                    StringBuilder sb = new StringBuilder("No parameter with index ");
                    sb.append(i);
                    sb.append('+');
                    sb.append(size);
                    sb.append(" (name=");
                    sb.append(RatingCompat());
                    sb.append(" type=");
                    sb.append(getencryptkeyIconCompatParcelizer);
                    sb.append(") in ");
                    sb.append(this);
                    throw new IllegalStateException(sb.toString().toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new getBodyContents(getencryptkeyIconCompatParcelizer, annotationArr[i], str, z && i == getOrderDetails.MediaDescriptionCompat(typeArr)));
            i++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof setThumbnailHeight) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write(), ((setThumbnailHeight) obj).write());
    }

    public int hashCode() {
        return write().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(write());
        return sb.toString();
    }
}
