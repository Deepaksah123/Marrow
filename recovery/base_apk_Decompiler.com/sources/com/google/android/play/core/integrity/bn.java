package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.ArrayList;
import kotlin.IndexSeeker;
import kotlin.getTrackTypeForHdlr;
import kotlin.parseFullAtomFlags;
import kotlin.parseFullAtomVersion;
import kotlin.parseIlst;

/* JADX INFO: loaded from: classes5.dex */
final class bn {
    final IndexSeeker a;
    private final getTrackTypeForHdlr b;
    private final String c;
    private final TaskCompletionSource d;
    private final at e;
    private final k f;

    bn(Context context, getTrackTypeForHdlr gettracktypeforhdlr, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = gettracktypeforhdlr;
        this.e = atVar;
        this.f = kVar;
        IndexSeeker indexSeeker = new IndexSeeker(context, gettracktypeforhdlr, "ExpressIntegrityService", bo.a, new parseIlst() { // from class: com.google.android.play.core.integrity.bd
            @Override // kotlin.parseIlst
            public final Object a(IBinder iBinder) {
                return parseFullAtomVersion.IconCompatParcelizer(iBinder);
            }
        });
        this.a = indexSeeker;
        indexSeeker.write().post(new be(this, taskCompletionSource, context));
    }

    static /* synthetic */ Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        parseFullAtomFlags.read(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(parseFullAtomFlags.read(arrayList)));
        return bundle;
    }

    static /* synthetic */ Bundle b(bn bnVar, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        parseFullAtomFlags.read(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(parseFullAtomFlags.read(arrayList)));
        return bundle;
    }

    static /* synthetic */ boolean k(bn bnVar, int i) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() < 83420000;
    }

    static /* synthetic */ boolean l(bn bnVar) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() == 0;
    }

    final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.b.RemoteActionCompatParcelizer("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.IconCompatParcelizer(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        this.b.RemoteActionCompatParcelizer("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.IconCompatParcelizer(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i) {
        this.b.RemoteActionCompatParcelizer("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.IconCompatParcelizer(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
