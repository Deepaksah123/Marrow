package com.google.android.recaptcha.internal;

import kotlin.C0201setMcqCount;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getUserStartedTimestampMs;
import kotlin.getUserSubmittedTimestampMs;
import kotlin.getYear;

/* JADX INFO: loaded from: classes3.dex */
public final class zzet extends getMagicModuleStats implements MagicModuleSubmissionRequestBody {
    public static long[] AudioAttributesCompatParcelizer;
    public static long[] RemoteActionCompatParcelizer;
    public static long[] write;
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzez zzc;
    public static long[] MediaBrowserCompatCustomActionResultReceiver = {5139025691248165611L, 5139025690210094281L, -5139025690258288255L, 5139025690788522409L, 5139025690342361387L, 5139025690209853121L, 5139025690555735151L, 5139025689459204686L, 5139025689796044519L, 5139025690209468857L, -5139025690343678975L, 5139025690415182024L, 5139025689977026645L, 5139025690210104297L, 5139025690507888908L, -5139025690631459791L};
    public static long[] MediaBrowserCompatItemReceiver = {5139025691248165611L, 5139025690210091653L, 5139025691045551827L, 5139025690986173031L, 5139025690342361387L, 5139025690209827337L, 5139025691407307090L, 5139025689401923243L, 5139025689796044519L, 5139025690209487237L, -5139025691309286829L, 5139025689448623159L, 5139025689977026645L, 5139025690210104837L, 5139025690381078239L, -5139025691086034130L};
    public static long[] IconCompatParcelizer = {5139025691248165611L, 5139025690210106005L, -5139025690030943879L, -5139025690324876241L, 5139025690342361387L, 5139025690210303769L, 5139025689990879968L, 5139025690049141418L, 5139025689796044519L, 5139025690209786693L, -5139025689403630681L, 5139025691230274617L, 5139025689977026645L, 5139025690210101673L, 5139025691417792393L, -5139025689432403515L};
    public static long[] read = {5139025691248165611L, 5139025690210091441L, 5139025690636213714L, -5139025690549432351L, 5139025690342361387L, 5139025690209908521L, -5139025690578233080L, 5139025690007072980L, 5139025689796044519L, 5139025690212919657L, 5139025690389994449L, 5139025690567367437L, 5139025689977026645L, 5139025690210104137L, -5139025689586216153L, -5139025689632109064L};

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((TopUserCompanion) obj, (SampleVideos) obj2)).invokeSuspend(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
        int i = this.zza;
        SdkPayloadData.IconCompatParcelizer(obj);
        if (i != 0) {
            return obj;
        }
        zzez zzezVar = this.zzc;
        String str = this.zzb;
        getUserStartedTimestampMs getuserstartedtimestampmsAudioAttributesCompatParcelizer = getUserSubmittedTimestampMs.AudioAttributesCompatParcelizer(null);
        zzezVar.zzl.put(str, getuserstartedtimestampmsAudioAttributesCompatParcelizer);
        String str2 = this.zzb;
        zzou zzouVarZzf = zzov.zzf();
        zzouVarZzf.zzd(str2);
        byte[] bArrZzd = ((zzov) zzouVarZzf.zzj()).zzd();
        C0201setMcqCount.IconCompatParcelizer(this.zzc.zzq.zzb(), null, null, new zzes(this.zzc, zzfy.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
        this.zza = 1;
        Object objAudioAttributesCompatParcelizer = getuserstartedtimestampmsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((SampleVideos) this);
        return objAudioAttributesCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objAudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzet(String str, zzez zzezVar, SampleVideos sampleVideos) {
        super(2, sampleVideos);
        this.zzb = str;
        this.zzc = zzezVar;
    }

    @Override // kotlin.getMonthName
    public final SampleVideos create(Object obj, SampleVideos sampleVideos) {
        return new zzet(this.zzb, this.zzc, sampleVideos);
    }
}
