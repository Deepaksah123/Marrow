package kotlin;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes2.dex */
class _coerceNullToken {
    private static final Object AudioAttributesCompatParcelizer = new Object();
    private static final Object read = new Object();

    static _coercedTypeDesc.write IconCompatParcelizer(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new _coercedTypeDesc.write(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), AudioAttributesCompatParcelizer(IconCompatParcelizer(bundle, "remoteInputs")), AudioAttributesCompatParcelizer(IconCompatParcelizer(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    static Bundle IconCompatParcelizer(_coercedTypeDesc.write writeVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat iconCompatIconCompatParcelizer = writeVar.IconCompatParcelizer();
        bundle2.putInt("icon", iconCompatIconCompatParcelizer != null ? iconCompatIconCompatParcelizer.IconCompatParcelizer() : 0);
        bundle2.putCharSequence("title", writeVar.AudioAttributesImplApi26Parcelizer());
        bundle2.putParcelable("actionIntent", writeVar.read());
        if (writeVar.RemoteActionCompatParcelizer() != null) {
            bundle = new Bundle(writeVar.RemoteActionCompatParcelizer());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", writeVar.AudioAttributesCompatParcelizer());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", read(writeVar.write()));
        bundle2.putBoolean("showsUserInterface", writeVar.MediaBrowserCompatCustomActionResultReceiver());
        bundle2.putInt("semanticAction", writeVar.AudioAttributesImplBaseParcelizer());
        return bundle2;
    }

    private static _findNullProvider write(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new _findNullProvider(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    private static Bundle AudioAttributesCompatParcelizer(_findNullProvider _findnullprovider) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", _findnullprovider.AudioAttributesImplBaseParcelizer());
        bundle.putCharSequence("label", _findnullprovider.MediaBrowserCompatItemReceiver());
        bundle.putCharSequenceArray("choices", _findnullprovider.RemoteActionCompatParcelizer());
        bundle.putBoolean("allowFreeFormInput", _findnullprovider.write());
        bundle.putBundle("extras", _findnullprovider.AudioAttributesCompatParcelizer());
        Set<String> setIconCompatParcelizer = _findnullprovider.IconCompatParcelizer();
        if (setIconCompatParcelizer != null && !setIconCompatParcelizer.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setIconCompatParcelizer.size());
            Iterator<String> it = setIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static _findNullProvider[] AudioAttributesCompatParcelizer(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        _findNullProvider[] _findnullproviderArr = new _findNullProvider[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            _findnullproviderArr[i] = write(bundleArr[i]);
        }
        return _findnullproviderArr;
    }

    private static Bundle[] read(_findNullProvider[] _findnullproviderArr) {
        if (_findnullproviderArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[_findnullproviderArr.length];
        for (int i = 0; i < _findnullproviderArr.length; i++) {
            bundleArr[i] = AudioAttributesCompatParcelizer(_findnullproviderArr[i]);
        }
        return bundleArr;
    }

    private static Bundle[] IconCompatParcelizer(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }
}
