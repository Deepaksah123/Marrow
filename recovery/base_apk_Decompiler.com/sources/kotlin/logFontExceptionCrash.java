package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.CourseConfigSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class logFontExceptionCrash {
    public static final <T> getErrorMessageId<T> AudioAttributesImplApi26Parcelizer(isHdPlaybackError<T> ishdplaybackerror) {
        T next;
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Iterator<T> it = ((CourseConfigSerializer) ishdplaybackerror).write().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            getErrorMessageId geterrormessageid = (getErrorMessageId) next;
            toMagicModuleMetaRepoModel.read(geterrormessageid, "");
            CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsRemoteActionCompatParcelizer = ((component17) geterrormessageid).RatingCompat();
            toMagicModuleMetaRepoModel.read(courseConfigV2NavDrawerItemRateUsRemoteActionCompatParcelizer, "");
            if (((CourseConfigV2GtAnalyticsCard) courseConfigV2NavDrawerItemRateUsRemoteActionCompatParcelizer).onPlay()) {
                break;
            }
        }
        return (getErrorMessageId) next;
    }

    public static final isHdPlaybackError<?> read(isHdPlaybackError<?> ishdplaybackerror) {
        Object next;
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Iterator<T> it = ishdplaybackerror.aO_().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            isHdPlaybackError ishdplaybackerror2 = (isHdPlaybackError) next;
            toMagicModuleMetaRepoModel.read(ishdplaybackerror2, "");
            if (((CourseConfigSerializer) ishdplaybackerror2).MediaMetadataCompat().onAddQueueItem()) {
                break;
            }
        }
        return (isHdPlaybackError) next;
    }

    public static final Collection<getErrorMessageId<?>> write(isHdPlaybackError<?> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Collection<isKycAuditIncomplete<?>> collectionIconCompatParcelizer = ishdplaybackerror.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionIconCompatParcelizer) {
            if (obj instanceof getErrorMessageId) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Collection<getErrorMessageId<?>> RemoteActionCompatParcelizer(isHdPlaybackError<?> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Collection<CourseConfigSerializerWhenMappings<?>> collectionAudioAttributesImplBaseParcelizer = ((CourseConfigSerializer.write) ((CourseConfigSerializer) ishdplaybackerror).read().invoke()).AudioAttributesImplBaseParcelizer();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionAudioAttributesImplBaseParcelizer) {
            if (obj instanceof getErrorMessageId) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<isVideoNetworkError<T, ?>> AudioAttributesCompatParcelizer(isHdPlaybackError<T> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Collection<CourseConfigSerializerWhenMappings<?>> collection = ((CourseConfigSerializer) ishdplaybackerror).read().invoke().read();
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            CourseConfigSerializerWhenMappings courseConfigSerializerWhenMappings = (CourseConfigSerializerWhenMappings) t;
            if (RemoteActionCompatParcelizer((CourseConfigSerializerWhenMappings<?>) courseConfigSerializerWhenMappings) && (courseConfigSerializerWhenMappings instanceof isVideoNetworkError)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<isVideoNetworkError<T, ?>> IconCompatParcelizer(isHdPlaybackError<T> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Collection<CourseConfigSerializerWhenMappings<?>> collectionMediaBrowserCompatCustomActionResultReceiver = ((CourseConfigSerializer) ishdplaybackerror).read().invoke().MediaBrowserCompatCustomActionResultReceiver();
        ArrayList arrayList = new ArrayList();
        for (T t : collectionMediaBrowserCompatCustomActionResultReceiver) {
            CourseConfigSerializerWhenMappings courseConfigSerializerWhenMappings = (CourseConfigSerializerWhenMappings) t;
            if (RemoteActionCompatParcelizer((CourseConfigSerializerWhenMappings<?>) courseConfigSerializerWhenMappings) && (courseConfigSerializerWhenMappings instanceof isVideoNetworkError)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static final boolean read(CourseConfigSerializerWhenMappings<?> courseConfigSerializerWhenMappings) {
        return courseConfigSerializerWhenMappings.RatingCompat().MediaBrowserCompatCustomActionResultReceiver() != null;
    }

    private static final boolean RemoteActionCompatParcelizer(CourseConfigSerializerWhenMappings<?> courseConfigSerializerWhenMappings) {
        return !read(courseConfigSerializerWhenMappings);
    }
}
