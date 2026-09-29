package com.google.android.play.core.integrity;

import android.content.Context;
import kotlin.Mp3ExtractorExternalSyntheticLambda0;
import kotlin.Mp3ExtractorExternalSyntheticLambda1;
import kotlin.Mp3ExtractorFlags;
import kotlin.Seeker;

/* JADX INFO: loaded from: classes5.dex */
final class s {
    private final Mp3ExtractorFlags a;
    private final Mp3ExtractorFlags b;
    private final Mp3ExtractorFlags c;
    private final Mp3ExtractorFlags d;
    private final Mp3ExtractorFlags e;

    /* synthetic */ s(Context context, r rVar) {
        Mp3ExtractorExternalSyntheticLambda1 mp3ExtractorExternalSyntheticLambda1 = Seeker.read(context);
        this.a = mp3ExtractorExternalSyntheticLambda1;
        Mp3ExtractorFlags mp3ExtractorFlagsRemoteActionCompatParcelizer = Mp3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(ac.a);
        this.b = mp3ExtractorFlagsRemoteActionCompatParcelizer;
        au auVar = new au(mp3ExtractorExternalSyntheticLambda1, l.a);
        this.c = auVar;
        Mp3ExtractorFlags mp3ExtractorFlagsRemoteActionCompatParcelizer2 = Mp3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(new al(mp3ExtractorExternalSyntheticLambda1, mp3ExtractorFlagsRemoteActionCompatParcelizer, auVar, l.a));
        this.d = mp3ExtractorFlagsRemoteActionCompatParcelizer2;
        this.e = Mp3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(new ab(mp3ExtractorFlagsRemoteActionCompatParcelizer2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
