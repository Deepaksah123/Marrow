package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import kotlin.AtomParsers;
import kotlin.IndexSeeker;
import kotlin.getTrackTypeForHdlr;
import kotlin.linearlyInterpolate;
import kotlin.parseFullAtomFlags;
import kotlin.parseIlst;

/* JADX INFO: loaded from: classes5.dex */
final class aj {
    final IndexSeeker a;
    private final getTrackTypeForHdlr b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    aj(Context context, getTrackTypeForHdlr gettracktypeforhdlr, at atVar, k kVar) {
        this.c = context.getPackageName();
        this.b = gettracktypeforhdlr;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        if (linearlyInterpolate.write(context)) {
            this.a = new IndexSeeker(context, gettracktypeforhdlr, "IntegrityService", ak.a, new parseIlst() { // from class: com.google.android.play.core.integrity.ae
                @Override // kotlin.parseIlst
                public final Object a(IBinder iBinder) {
                    return AtomParsers.IconCompatParcelizer(iBinder);
                }
            });
        } else {
            gettracktypeforhdlr.read("Phonesky is not installed.", new Object[0]);
            this.a = null;
        }
    }

    static /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable(LogSubCategory.ApiCall.NETWORK, parcelable);
        }
        ArrayList arrayList = new ArrayList();
        parseFullAtomFlags.read(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(parseFullAtomFlags.read(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.RemoteActionCompatParcelizer("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.IconCompatParcelizer(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (linearlyInterpolate.RemoteActionCompatParcelizer(this.d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.b.RemoteActionCompatParcelizer("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.IconCompatParcelizer(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
