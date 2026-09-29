package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.CacheListener;
import kotlin.getRetryPredicate;

/* JADX INFO: loaded from: classes4.dex */
public final class getLastUpdatedVersion {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[getLastUpdatedTimeMs.values().length];
            try {
                iArr[getLastUpdatedTimeMs.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getLastUpdatedTimeMs.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getLastUpdatedTimeMs.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getLastUpdatedTimeMs.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public static final List<getFirstInstallDbVersion> RemoteActionCompatParcelizer(List<CacheCacheException> list) {
        Integer numValueOf;
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        List<CacheCacheException> list2 = list;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (CacheCacheException cacheCacheException : list2) {
            String strRemoteActionCompatParcelizer = cacheCacheException.RemoteActionCompatParcelizer();
            String str = cacheCacheException.read();
            String strWrite = cacheCacheException.write();
            int iIconCompatParcelizer = cacheCacheException.IconCompatParcelizer();
            int iAudioAttributesCompatParcelizer = cacheCacheException.AudioAttributesCompatParcelizer();
            int iAudioAttributesImplBaseParcelizer = cacheCacheException.AudioAttributesImplBaseParcelizer();
            List<CacheListener> listMediaBrowserCompatItemReceiver = cacheCacheException.MediaBrowserCompatItemReceiver();
            ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listMediaBrowserCompatItemReceiver, i));
            for (CacheListener cacheListener : listMediaBrowserCompatItemReceiver) {
                String write = cacheListener.getWrite();
                String ratingCompat = cacheListener.getRatingCompat();
                String iconCompatParcelizer = cacheListener.getIconCompatParcelizer();
                String audioAttributesCompatParcelizer = cacheListener.getAudioAttributesCompatParcelizer();
                float fIconCompatParcelizer = cacheListener.IconCompatParcelizer();
                String read = cacheListener.getRead();
                if (cacheListener.getOnPrepare() == null) {
                    numValueOf = null;
                } else {
                    CacheListener.read onPrepare = cacheListener.getOnPrepare();
                    int iAudioAttributesCompatParcelizer2 = onPrepare != null ? onPrepare.AudioAttributesCompatParcelizer() : 0;
                    CacheListener.read onPrepare2 = cacheListener.getOnPrepare();
                    int i2 = onPrepare2 != null ? onPrepare2.read() : 0;
                    ContentDataSourceContentDataSourceException contentDataSourceContentDataSourceException = ContentDataSourceContentDataSourceException.INSTANCE;
                    numValueOf = Integer.valueOf(getOnline.RemoteActionCompatParcelizer(ContentDataSourceContentDataSourceException.IconCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer2), Integer.valueOf(i2))));
                }
                int mediaBrowserCompatCustomActionResultReceiver = cacheListener.getMediaBrowserCompatCustomActionResultReceiver();
                CacheListener.read onPrepare3 = cacheListener.getOnPrepare();
                arrayList3.add(new getLastDbVersion(write, ratingCompat, cacheListener.getRemoteActionCompatParcelizer(), iconCompatParcelizer, audioAttributesCompatParcelizer, fIconCompatParcelizer, 0, read, numValueOf, mediaBrowserCompatCustomActionResultReceiver, onPrepare3 != null ? Integer.valueOf(onPrepare3.RemoteActionCompatParcelizer()) : null, cacheListener.getAudioAttributesImplApi26Parcelizer(), cacheListener.getOnFastForward(), cacheListener.getOnPrepare() != null, 64, null));
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new getFirstInstallDbVersion(strRemoteActionCompatParcelizer, str, strWrite, iIconCompatParcelizer, iAudioAttributesImplBaseParcelizer, iAudioAttributesCompatParcelizer, arrayList3, null, 128, null))));
            i = 10;
        }
        return arrayList;
    }

    public static final List<getFirstInstallDbVersion> IconCompatParcelizer(List<getFirstInstallDbVersion> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<getFirstInstallDbVersion> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        int i = 1;
        for (getFirstInstallDbVersion getfirstinstalldbversion : list2) {
            List<getLastDbVersion> listAudioAttributesImplApi21Parcelizer = getfirstinstalldbversion.AudioAttributesImplApi21Parcelizer();
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplApi21Parcelizer, 10));
            for (getLastDbVersion getlastdbversion : listAudioAttributesImplApi21Parcelizer) {
                arrayList2.add(getLastDbVersion.IconCompatParcelizer(getlastdbversion.write, getlastdbversion.MediaDescriptionCompat, getlastdbversion.MediaBrowserCompatMediaItem, getlastdbversion.RatingCompat, getlastdbversion.MediaMetadataCompat, getlastdbversion.AudioAttributesImplBaseParcelizer, i, getlastdbversion.read, getlastdbversion.RemoteActionCompatParcelizer, getlastdbversion.MediaBrowserCompatSearchResultReceiver, getlastdbversion.IconCompatParcelizer, getlastdbversion.AudioAttributesImplApi21Parcelizer, getlastdbversion.MediaBrowserCompatItemReceiver, getlastdbversion.AudioAttributesCompatParcelizer));
                i++;
            }
            arrayList.add(getFirstInstallDbVersion.write(getfirstinstalldbversion, null, null, null, 0, 0, 0, arrayList2, null, 191));
        }
        return arrayList;
    }

    public static final component3 read(newSingleThreadScheduledExecutor newsinglethreadscheduledexecutor) {
        toMagicModuleMetaRepoModel.write(newsinglethreadscheduledexecutor, "");
        return new component3(newsinglethreadscheduledexecutor.RemoteActionCompatParcelizer(), newsinglethreadscheduledexecutor.IconCompatParcelizer(), newsinglethreadscheduledexecutor.AudioAttributesCompatParcelizer(), newsinglethreadscheduledexecutor.read(), true);
    }

    public static final boolean AudioAttributesCompatParcelizer(component3 component3Var, component3 component3Var2) {
        toMagicModuleMetaRepoModel.write(component3Var, "");
        toMagicModuleMetaRepoModel.write(component3Var2, "");
        return component3Var.getRead() == component3Var2.getRead() && component3Var.getWrite() == component3Var2.getWrite() && component3Var.getAudioAttributesCompatParcelizer() == component3Var2.getAudioAttributesCompatParcelizer() && component3Var.getIconCompatParcelizer() == component3Var2.getIconCompatParcelizer();
    }

    public static final List<getLastUpdatedTimeMs> AudioAttributesCompatParcelizer(List<Integer> list) {
        getLastUpdatedTimeMs getlastupdatedtimems;
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            getLastUpdatedTimeMs[] getlastupdatedtimemsArrValues = getLastUpdatedTimeMs.values();
            int length = getlastupdatedtimemsArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    getlastupdatedtimems = null;
                    break;
                }
                getlastupdatedtimems = getlastupdatedtimemsArrValues[i];
                if (getlastupdatedtimems.getRemoteActionCompatParcelizer() == iIntValue) {
                    break;
                }
                i++;
            }
            if (getlastupdatedtimems != null) {
                arrayList.add(getlastupdatedtimems);
            }
        }
        return arrayList;
    }

    public static final getRetryPredicate.IconCompatParcelizer IconCompatParcelizer(getFirstInstallTimeMs getfirstinstalltimems) {
        toMagicModuleMetaRepoModel.write(getfirstinstalltimems, "");
        int i = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer[getfirstinstalltimems.getAudioAttributesImplBaseParcelizer().ordinal()];
        if (i == 1) {
            return getRetryPredicate.IconCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        if (i == 2) {
            return getRetryPredicate.IconCompatParcelizer.read;
        }
        if (i == 3) {
            return getRetryPredicate.IconCompatParcelizer.IconCompatParcelizer;
        }
        if (i != 4) {
            return null;
        }
        return getRetryPredicate.IconCompatParcelizer.RemoteActionCompatParcelizer;
    }
}
