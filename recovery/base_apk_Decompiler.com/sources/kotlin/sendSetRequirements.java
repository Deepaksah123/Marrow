package kotlin;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kotlin.getDownloadRequest;

/* JADX INFO: loaded from: classes.dex */
public final class sendSetRequirements {
    public static isBeforeFirst write(setDownloadingStatesToQueued setdownloadingstatestoqueued, Class cls, Object obj) {
        Type typeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls, obj);
        isBeforeFirst isbeforefirstIconCompatParcelizer = setdownloadingstatestoqueued.IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(typeRemoteActionCompatParcelizer));
        if (cls != typeRemoteActionCompatParcelizer && !RemoteActionCompatParcelizer(isbeforefirstIconCompatParcelizer)) {
            isBeforeFirst isbeforefirst = setdownloadingstatestoqueued.read(cls);
            if (RemoteActionCompatParcelizer(isbeforefirst)) {
                return isbeforefirst;
            }
        }
        return isbeforefirstIconCompatParcelizer;
    }

    public static isBeforeFirst write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3 downloadHelperExternalSyntheticLambda3, Object obj) {
        Type typeRemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda3.RemoteActionCompatParcelizer();
        Type typeRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(typeRemoteActionCompatParcelizer, obj);
        isBeforeFirst isbeforefirstIconCompatParcelizer = setdownloadingstatestoqueued.IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(typeRemoteActionCompatParcelizer2));
        if (typeRemoteActionCompatParcelizer != typeRemoteActionCompatParcelizer2 && !RemoteActionCompatParcelizer(isbeforefirstIconCompatParcelizer)) {
            isBeforeFirst isbeforefirstIconCompatParcelizer2 = setdownloadingstatestoqueued.IconCompatParcelizer(downloadHelperExternalSyntheticLambda3);
            if (RemoteActionCompatParcelizer(isbeforefirstIconCompatParcelizer2)) {
                return isbeforefirstIconCompatParcelizer2;
            }
        }
        return isbeforefirstIconCompatParcelizer;
    }

    private static Type RemoteActionCompatParcelizer(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    private static boolean RemoteActionCompatParcelizer(isBeforeFirst isbeforefirst) {
        return ((isbeforefirst instanceof sendResumeDownloads) || (isbeforefirst instanceof getDownloadRequest.read)) ? false : true;
    }
}
