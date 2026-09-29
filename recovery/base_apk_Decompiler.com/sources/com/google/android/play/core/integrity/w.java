package com.google.android.play.core.integrity;

import android.content.Context;
import kotlin.Mp3ExtractorExternalSyntheticLambda0;
import kotlin.Mp3ExtractorExternalSyntheticLambda1;
import kotlin.Mp3ExtractorFlags;
import kotlin.Seeker;

/* JADX INFO: loaded from: classes5.dex */
final class w implements aw {
    private final Mp3ExtractorFlags a;
    private final Mp3ExtractorFlags b;
    private final Mp3ExtractorFlags c;
    private final Mp3ExtractorFlags d;
    private final Mp3ExtractorFlags e;
    private final Mp3ExtractorFlags f;

    /* synthetic */ w(Context context, v vVar) {
        Mp3ExtractorExternalSyntheticLambda1 mp3ExtractorExternalSyntheticLambda1 = Seeker.read(context);
        this.a = mp3ExtractorExternalSyntheticLambda1;
        Mp3ExtractorFlags mp3ExtractorFlagsRemoteActionCompatParcelizer = Mp3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(bb.a);
        this.b = mp3ExtractorFlagsRemoteActionCompatParcelizer;
        au auVar = new au(mp3ExtractorExternalSyntheticLambda1, n.a);
        this.c = auVar;
        Mp3ExtractorFlags mp3ExtractorFlagsRemoteActionCompatParcelizer2 = Mp3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(new bp(mp3ExtractorExternalSyntheticLambda1, mp3ExtractorFlagsRemoteActionCompatParcelizer, auVar, n.a));
        this.d = mp3ExtractorFlagsRemoteActionCompatParcelizer2;
        Mp3ExtractorFlags mp3ExtractorFlagsRemoteActionCompatParcelizer3 = Mp3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(new bu(mp3ExtractorFlagsRemoteActionCompatParcelizer2));
        this.e = mp3ExtractorFlagsRemoteActionCompatParcelizer3;
        this.f = Mp3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(new ba(mp3ExtractorFlagsRemoteActionCompatParcelizer2, mp3ExtractorFlagsRemoteActionCompatParcelizer3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
