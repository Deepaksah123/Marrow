package kotlin;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class RtspMessageChannelLoaderCallbackImpl {
    RtspMessageChannelLoaderCallbackImpl() {
    }

    public static int read(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        return ((lambdanew6) lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var)).RemoteActionCompatParcelizer().intValue();
    }

    public static long AudioAttributesImplApi26Parcelizer(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        return ((lambdanew6) lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var)).RemoteActionCompatParcelizer().longValue();
    }

    public static Set<Integer> AudioAttributesImplBaseParcelizer(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        lambdanew12 lambdanew12Var = (lambdanew12) lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var);
        HashSet hashSet = new HashSet();
        Iterator<lambdanew10> it = lambdanew12Var.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((lambdanew6) it.next()).RemoteActionCompatParcelizer().intValue()));
        }
        return hashSet;
    }

    public static Boolean write(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        lambdanew7 lambdanew7VarRemoteActionCompatParcelizer = ((lambdasetAnalyticsCollector21) lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var)).RemoteActionCompatParcelizer();
        if (lambdanew7VarRemoteActionCompatParcelizer == lambdanew7.TRUE || lambdanew7VarRemoteActionCompatParcelizer == lambdanew7.FALSE) {
            return Boolean.valueOf(lambdanew7VarRemoteActionCompatParcelizer == lambdanew7.TRUE);
        }
        throw new RuntimeException("Only expecting boolean values for ".concat(String.valueOf(lambdanew10Var)));
    }

    public static List<Boolean> IconCompatParcelizer(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        lambdanew12 lambdanew12Var = (lambdanew12) lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var);
        ArrayList arrayList = new ArrayList();
        Iterator<lambdanew10> it = lambdanew12Var.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            lambdanew7 lambdanew7VarRemoteActionCompatParcelizer = ((lambdasetAnalyticsCollector21) it.next()).RemoteActionCompatParcelizer();
            if (lambdanew7VarRemoteActionCompatParcelizer == lambdanew7.FALSE) {
                arrayList.add(Boolean.FALSE);
            } else if (lambdanew7VarRemoteActionCompatParcelizer == lambdanew7.TRUE) {
                arrayList.add(Boolean.TRUE);
            } else {
                throw new RuntimeException("Map contains more than booleans: ".concat(String.valueOf(lambdanew5Var)));
            }
        }
        return arrayList;
    }

    public static Date RemoteActionCompatParcelizer(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        return new Date(((lambdanew6) lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var)).RemoteActionCompatParcelizer().longValue());
    }

    public static byte[] AudioAttributesCompatParcelizer(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        return ((lambdanew13) lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var)).write();
    }

    public static String AudioAttributesImplApi21Parcelizer(lambdanew5 lambdanew5Var, lambdanew10 lambdanew10Var) {
        return new String(AudioAttributesCompatParcelizer(lambdanew5Var, lambdanew10Var), StandardCharsets.UTF_8);
    }
}
