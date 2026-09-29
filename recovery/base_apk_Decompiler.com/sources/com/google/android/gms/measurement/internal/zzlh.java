package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.setTitleOptional;

/* JADX INFO: loaded from: classes5.dex */
public final class zzlh implements zzgy {
    private static volatile zzlh zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzir zzD;
    private String zzE;
    long zza;
    private final zzfu zzc;
    private final zzez zzd;
    private zzak zze;
    private zzfb zzf;
    private zzks zzg;
    private zzaa zzh;
    private final zzlj zzi;
    private zzip zzj;
    private zzkb zzk;
    private final zzkw zzl;
    private zzfl zzm;
    private final zzgd zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzlo zzF = new zzlc(this);

    zzlh(zzli zzliVar, zzgd zzgdVar) {
        Preconditions.checkNotNull(zzliVar);
        this.zzn = zzgd.zzp(zzliVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzkw(this);
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzX();
        this.zzi = zzljVar;
        zzez zzezVar = new zzez(this);
        zzezVar.zzX();
        this.zzd = zzezVar;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.zzX();
        this.zzc = zzfuVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaB().zzp(new zzkx(this, zzliVar));
    }

    static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < listZzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze.zzj("_err");
        zzfwVarZze.zzi(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze.zzaD();
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze2.zzj("_ev");
        zzfwVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze2.zzaD();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i = 0; i < listZzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) throws Throwable {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzhVarZzj = zzakVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzy())) {
            zzaA().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad != null && !boolZzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping. appId", zzet.zzn(str));
            return null;
        }
        String strZzA = zzhVarZzj.zzA();
        String strZzy = zzhVarZzj.zzy();
        long jZzb = zzhVarZzj.zzb();
        String strZzx = zzhVarZzj.zzx();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzan = zzhVarZzj.zzan();
        String strZzz = zzhVarZzj.zzz();
        zzhVarZzj.zza();
        return new zzq(str, strZzA, strZzy, jZzb, strZzx, jZzm, jZzj, (String) null, zZzan, false, strZzz, 0L, 0L, 0, zzhVarZzj.zzam(), false, zzhVarZzj.zzt(), zzhVarZzj.zzs(), zzhVarZzj.zzk(), zzhVarZzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzhVarZzj.zzap(), zzhVarZzj.zzr());
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionName;
                String strZzy = zzhVar.zzy();
                if (strZzy != null && strZzy.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaB().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzaA().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzaA().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) throws Throwable {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        String str = true != z ? "_lte" : "_se";
        zzlm zzlmVarZzp = zzakVar.zzp(zzgcVar.zzaq(), str);
        zzlm zzlmVar = (zzlmVarZzp == null || zzlmVarZzp.zze == null) ? new zzlm(zzgcVar.zzaq(), TtmlNode.TEXT_EMPHASIS_AUTO, str, zzax().currentTimeMillis(), Long.valueOf(j)) : new zzlm(zzgcVar.zzaq(), TtmlNode.TEXT_EMPHASIS_AUTO, str, zzax().currentTimeMillis(), Long.valueOf(((Long) zzlmVarZzp.zze).longValue() + j));
        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzglVarZzd.zzf(str);
        zzglVarZzd.zzg(zzax().currentTimeMillis());
        zzglVarZzd.zze(((Long) zzlmVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaD();
        int iZza = zzlj.zza(zzgcVar, str);
        if (iZza >= 0) {
            zzgcVar.zzan(iZza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzakVar2.zzL(zzlmVar);
            zzaA().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzlmVar.zze);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzag() {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzag():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043e A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0486 A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x052c A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07c9 A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x080f A[PHI: r12 r17
      0x080f: PHI (r12v16 java.lang.String) = (r12v15 java.lang.String), (r12v27 java.lang.String) binds: [B:249:0x07c7, B:443:0x080f] A[DONT_GENERATE, DONT_INLINE]
      0x080f: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v8 java.lang.String) binds: [B:249:0x07c7, B:443:0x080f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x082a A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x084d A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08ad A[PHI: r3
      0x08ad: PHI (r3v19 com.google.android.gms.measurement.internal.zzaq) = (r3v18 com.google.android.gms.measurement.internal.zzaq), (r3v30 com.google.android.gms.measurement.internal.zzaq) binds: [B:265:0x0857, B:267:0x086c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b47 A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0349 A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0361 A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037a A[Catch: all -> 0x0cd9, TryCatch #3 {all -> 0x0cd9, blocks: (B:3:0x0010, B:5:0x0028, B:8:0x0030, B:9:0x0042, B:12:0x0058, B:15:0x007f, B:17:0x00b5, B:20:0x00c7, B:22:0x00d1, B:154:0x04f5, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:52:0x01bb, B:55:0x01c5, B:57:0x01d3, B:61:0x0218, B:58:0x01ef, B:60:0x01ff, B:65:0x0225, B:67:0x0251, B:68:0x027b, B:70:0x02b1, B:72:0x02b7, B:75:0x02c3, B:77:0x02f9, B:78:0x0314, B:80:0x031a, B:82:0x0328, B:86:0x033b, B:83:0x0330, B:89:0x0342, B:92:0x0349, B:93:0x0361, B:95:0x037a, B:96:0x0386, B:99:0x0390, B:105:0x03b3, B:102:0x03a2, B:127:0x0432, B:129:0x043e, B:132:0x0451, B:134:0x0462, B:136:0x046e, B:153:0x04e1, B:139:0x0486, B:141:0x0496, B:144:0x04ab, B:146:0x04bc, B:148:0x04c8, B:109:0x03bb, B:111:0x03c7, B:113:0x03d3, B:125:0x0418, B:117:0x03f0, B:120:0x0402, B:122:0x0408, B:124:0x0412, B:157:0x050b, B:159:0x0519, B:161:0x0524, B:172:0x0556, B:162:0x052c, B:164:0x0537, B:166:0x053d, B:169:0x0549, B:171:0x0551, B:173:0x0559, B:174:0x0565, B:177:0x056d, B:179:0x057f, B:180:0x058b, B:182:0x0593, B:186:0x05b8, B:188:0x05dd, B:190:0x05ee, B:192:0x05f4, B:194:0x0600, B:195:0x0631, B:197:0x0637, B:199:0x0645, B:200:0x0649, B:201:0x064c, B:202:0x064f, B:203:0x065d, B:205:0x0663, B:207:0x0673, B:208:0x067a, B:210:0x0686, B:211:0x068d, B:212:0x0690, B:214:0x06ce, B:215:0x06e1, B:217:0x06e7, B:220:0x0701, B:222:0x071c, B:224:0x0735, B:226:0x073a, B:228:0x073e, B:230:0x0742, B:232:0x074c, B:233:0x0756, B:235:0x075a, B:237:0x0760, B:238:0x076e, B:239:0x0777, B:308:0x09d2, B:240:0x077e, B:242:0x0795, B:248:0x07b1, B:250:0x07c9, B:251:0x07d1, B:253:0x07d7, B:255:0x07ed, B:261:0x0813, B:263:0x082a, B:264:0x084d, B:266:0x0859, B:268:0x086e, B:270:0x08af, B:274:0x08c7, B:276:0x08ce, B:278:0x08dd, B:280:0x08e1, B:282:0x08e5, B:284:0x08e9, B:285:0x08f5, B:287:0x0901, B:289:0x0907, B:291:0x0923, B:292:0x0928, B:307:0x09cf, B:293:0x0942, B:295:0x094a, B:299:0x0971, B:301:0x099d, B:302:0x09a7, B:303:0x09b7, B:305:0x09bf, B:296:0x0957, B:246:0x079c, B:309:0x09df, B:311:0x09ec, B:312:0x09f2, B:313:0x09fa, B:315:0x0a00, B:318:0x0a1a, B:320:0x0a2b, B:340:0x0a9f, B:342:0x0aa5, B:344:0x0abd, B:347:0x0ac4, B:352:0x0af3, B:354:0x0b35, B:357:0x0b6a, B:358:0x0b6e, B:359:0x0b79, B:361:0x0bbc, B:362:0x0bc9, B:364:0x0bd8, B:368:0x0bf2, B:370:0x0c0b, B:356:0x0b47, B:348:0x0acc, B:350:0x0ad8, B:351:0x0adc, B:371:0x0c23, B:372:0x0c3b, B:375:0x0c43, B:376:0x0c48, B:377:0x0c58, B:379:0x0c72, B:380:0x0c8d, B:381:0x0c96, B:386:0x0cb5, B:385:0x0ca2, B:321:0x0a43, B:323:0x0a49, B:325:0x0a53, B:327:0x0a5a, B:333:0x0a6a, B:335:0x0a71, B:337:0x0a90, B:339:0x0a97, B:338:0x0a94, B:334:0x0a6e, B:326:0x0a57, B:183:0x0598, B:185:0x059e, B:389:0x0cc7), top: B:401:0x0010, inners: #0, #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzah(java.lang.String r45, long r46) {
        /*
            Method dump skipped, instruction units count: 3300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzah(java.lang.String, long):boolean");
    }

    private final boolean zzai() {
        zzaB().zzg();
        zzB();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        if (zzakVar.zzF()) {
            return true;
        }
        zzak zzakVar2 = this.zze;
        zzal(zzakVar2);
        return !TextUtils.isEmpty(zzakVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzC = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_sc");
        String strZzh = zzfxVarZzC == null ? null : zzfxVarZzC.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzC2 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_pc");
        String strZzh2 = zzfxVarZzC2 != null ? zzfxVarZzC2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzC3 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_et");
        if (zzfxVarZzC3 == null || !zzfxVarZzC3.zzw() || zzfxVarZzC3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfxVarZzC3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzC4 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_et");
        if (zzfxVarZzC4 != null && zzfxVarZzC4.zzd() > 0) {
            jZzd += zzfxVarZzC4.zzd();
        }
        zzal(this.zzi);
        zzlj.zzA(zzfsVar2, "_et", Long.valueOf(jZzd));
        zzal(this.zzi);
        zzlj.zzA(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzku zzal(zzku zzkuVar) {
        if (zzkuVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkuVar.zzY()) {
            return zzkuVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzkuVar.getClass()))));
    }

    public static zzlh zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzlh.class) {
                if (zzb == null) {
                    zzb = new zzlh((zzli) Preconditions.checkNotNull(new zzli(context)), null);
                }
            }
        }
        return zzb;
    }

    static /* synthetic */ void zzy(zzlh zzlhVar, zzli zzliVar) {
        zzlhVar.zzaB().zzg();
        zzlhVar.zzm = new zzfl(zzlhVar);
        zzak zzakVar = new zzak(zzlhVar);
        zzakVar.zzX();
        zzlhVar.zze = zzakVar;
        zzlhVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzlhVar.zzc));
        zzkb zzkbVar = new zzkb(zzlhVar);
        zzkbVar.zzX();
        zzlhVar.zzk = zzkbVar;
        zzaa zzaaVar = new zzaa(zzlhVar);
        zzaaVar.zzX();
        zzlhVar.zzh = zzaaVar;
        zzip zzipVar = new zzip(zzlhVar);
        zzipVar.zzX();
        zzlhVar.zzj = zzipVar;
        zzks zzksVar = new zzks(zzlhVar);
        zzksVar.zzX();
        zzlhVar.zzg = zzksVar;
        zzlhVar.zzf = new zzfb(zzlhVar);
        if (zzlhVar.zzr != zzlhVar.zzs) {
            zzlhVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlhVar.zzr), Integer.valueOf(zzlhVar.zzs));
        }
        zzlhVar.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzA() {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzA():void");
    }

    final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int iZza;
        int iIndexOf;
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        Set setZzk = zzfuVar.zzk(str);
        if (setZzk != null) {
            zzgcVar.zzi(setZzk);
        }
        zzfu zzfuVar2 = this.zzc;
        zzal(zzfuVar2);
        if (zzfuVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfu zzfuVar3 = this.zzc;
        zzal(zzfuVar3);
        if (zzfuVar3.zzy(str)) {
            if (zzg().zzs(str, zzeg.zzar)) {
                String strZzas = zzgcVar.zzas();
                if (!TextUtils.isEmpty(strZzas) && (iIndexOf = strZzas.indexOf(".")) != -1) {
                    zzgcVar.zzY(strZzas.substring(0, iIndexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfu zzfuVar4 = this.zzc;
        zzal(zzfuVar4);
        if (zzfuVar4.zzz(str) && (iZza = zzlj.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(iZza);
        }
        zzfu zzfuVar5 = this.zzc;
        zzal(zzfuVar5);
        if (zzfuVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfu zzfuVar6 = this.zzc;
        zzal(zzfuVar6);
        if (zzfuVar6.zzu(str)) {
            zzgcVar.zzn();
            zzlg zzlgVar = (zzlg) this.zzC.get(str);
            if (zzlgVar == null || zzlgVar.zzb + zzg().zzi(str, zzeg.zzT) < zzax().elapsedRealtime()) {
                zzlgVar = new zzlg(this);
                this.zzC.put(str, zzlgVar);
            }
            zzgcVar.zzR(zzlgVar.zza);
        }
        zzfu zzfuVar7 = this.zzc;
        zzal(zzfuVar7);
        if (zzfuVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    final void zzD(zzh zzhVar) {
        zzaB().zzg();
        if (TextUtils.isEmpty(zzhVar.zzA()) && TextUtils.isEmpty(zzhVar.zzt())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzv()), 204, null, null, null);
            return;
        }
        zzkw zzkwVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String strZzA = zzhVar.zzA();
        if (TextUtils.isEmpty(strZzA)) {
            strZzA = zzhVar.zzt();
        }
        setTitleOptional settitleoptional = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzeg.zze.zza(null)).encodedAuthority((String) zzeg.zzf.zza(null)).path("config/app/".concat(String.valueOf(strZzA))).appendQueryParameter("platform", LogSubCategory.LifeCycle.ANDROID);
        zzkwVar.zzt.zzf().zzh();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(79000L)).appendQueryParameter("runtime_version", SessionDescription.SUPPORTED_SDP_VERSION);
        String string = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzv());
            URL url = new URL(string);
            zzaA().zzj().zzb("Fetching remote configuration", str);
            zzfu zzfuVar = this.zzc;
            zzal(zzfuVar);
            com.google.android.gms.internal.measurement.zzff zzffVarZze = zzfuVar.zze(str);
            zzfu zzfuVar2 = this.zzc;
            zzal(zzfuVar2);
            String strZzh = zzfuVar2.zzh(str);
            if (zzffVarZze != null) {
                if (!TextUtils.isEmpty(strZzh)) {
                    setTitleOptional settitleoptional2 = new setTitleOptional();
                    settitleoptional2.put("If-Modified-Since", strZzh);
                    settitleoptional = settitleoptional2;
                }
                zzfu zzfuVar3 = this.zzc;
                zzal(zzfuVar3);
                String strZzf = zzfuVar3.zzf(str);
                if (!TextUtils.isEmpty(strZzf)) {
                    if (settitleoptional == null) {
                        settitleoptional = new setTitleOptional();
                    }
                    settitleoptional.put("If-None-Match", strZzf);
                }
            }
            this.zzt = true;
            zzez zzezVar = this.zzd;
            zzal(zzezVar);
            zzkz zzkzVar = new zzkz(this);
            zzezVar.zzg();
            zzezVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkzVar);
            zzezVar.zzt.zzaB().zzo(new zzey(zzezVar, str, url, null, settitleoptional, zzkzVar));
        } catch (MalformedURLException unused) {
            zzaA().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzet.zzn(zzhVar.zzv()), string);
        }
    }

    final void zzE(zzau zzauVar, zzq zzqVar) throws Throwable {
        zzau zzauVar2;
        List<zzac> listZzt;
        List<zzac> listZzt2;
        List<zzac> listZzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaB().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzauVar.zzd;
        zzeu zzeuVarZzb = zzeu.zzb(zzauVar);
        zzaB().zzg();
        zzlp.zzK((this.zzD == null || (str = this.zzE) == null || !str.equals(str2)) ? null : this.zzD, zzeuVarZzb.zzd, false);
        zzau zzauVarZza = zzeuVarZzb.zza();
        zzal(this.zzi);
        if (zzlj.zzB(zzauVarZza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzauVar2 = zzauVarZza;
            } else if (!list.contains(zzauVarZza.zza)) {
                zzaA().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzauVarZza.zza, zzauVarZza.zzc);
                return;
            } else {
                Bundle bundleZzc = zzauVarZza.zzb.zzc();
                bundleZzc.putLong("ga_safelisted", 1L);
                zzauVar2 = new zzau(zzauVarZza.zza, new zzas(bundleZzc), zzauVarZza.zzc, zzauVarZza.zzd);
            }
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                Preconditions.checkNotEmpty(str2);
                zzakVar2.zzg();
                zzakVar2.zzW();
                if (j < 0) {
                    zzakVar2.zzt.zzaA().zzk().zzc("Invalid time querying timed out conditional properties", zzet.zzn(str2), Long.valueOf(j));
                    listZzt = Collections.emptyList();
                } else {
                    listZzt = zzakVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : listZzt) {
                    if (zzacVar != null) {
                        zzaA().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzau zzauVar3 = zzacVar.zzg;
                        if (zzauVar3 != null) {
                            zzY(new zzau(zzauVar3, j), zzqVar);
                        }
                        zzak zzakVar3 = this.zze;
                        zzal(zzakVar3);
                        zzakVar3.zza(str2, zzacVar.zzc.zzb);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                Preconditions.checkNotEmpty(str2);
                zzakVar4.zzg();
                zzakVar4.zzW();
                if (j < 0) {
                    zzakVar4.zzt.zzaA().zzk().zzc("Invalid time querying expired conditional properties", zzet.zzn(str2), Long.valueOf(j));
                    listZzt2 = Collections.emptyList();
                } else {
                    listZzt2 = zzakVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzac zzacVar2 : listZzt2) {
                    if (zzacVar2 != null) {
                        zzaA().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzak zzakVar5 = this.zze;
                        zzal(zzakVar5);
                        zzakVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzau zzauVar4 = zzacVar2.zzk;
                        if (zzauVar4 != null) {
                            arrayList.add(zzauVar4);
                        }
                        zzak zzakVar6 = this.zze;
                        zzal(zzakVar6);
                        zzakVar6.zza(str2, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzau((zzau) it.next(), j), zzqVar);
                }
                zzak zzakVar7 = this.zze;
                zzal(zzakVar7);
                String str3 = zzauVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzakVar7.zzg();
                zzakVar7.zzW();
                if (j < 0) {
                    zzakVar7.zzt.zzaA().zzk().zzd("Invalid time querying triggered conditional properties", zzet.zzn(str2), zzakVar7.zzt.zzj().zzd(str3), Long.valueOf(j));
                    listZzt3 = Collections.emptyList();
                } else {
                    listZzt3 = zzakVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzac zzacVar3 : listZzt3) {
                    if (zzacVar3 != null) {
                        zzlk zzlkVar = zzacVar3.zzc;
                        zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzlkVar.zzb, j, Preconditions.checkNotNull(zzlkVar.zza()));
                        zzak zzakVar8 = this.zze;
                        zzal(zzakVar8);
                        if (zzakVar8.zzL(zzlmVar)) {
                            zzaA().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                        } else {
                            zzaA().zzd().zzd("Too many active user properties, ignoring", zzet.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                        }
                        zzau zzauVar5 = zzacVar3.zzi;
                        if (zzauVar5 != null) {
                            arrayList2.add(zzauVar5);
                        }
                        zzacVar3.zzc = new zzlk(zzlmVar);
                        zzacVar3.zze = true;
                        zzak zzakVar9 = this.zze;
                        zzal(zzakVar9);
                        zzakVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzauVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzau((zzau) it2.next(), j), zzqVar);
                }
                zzak zzakVar10 = this.zze;
                zzal(zzakVar10);
                zzakVar10.zzC();
            } finally {
                zzak zzakVar11 = this.zze;
                zzal(zzakVar11);
                zzakVar11.zzx();
            }
        }
    }

    final void zzF(zzau zzauVar, String str) throws Throwable {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzhVarZzj = zzakVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzy())) {
            zzaA().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad == null) {
            if (!"_ui".equals(zzauVar.zza)) {
                zzaA().zzk().zzb("Could not find package. appId", zzet.zzn(str));
            }
        } else if (!boolZzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping event. appId", zzet.zzn(str));
            return;
        }
        String strZzA = zzhVarZzj.zzA();
        String strZzy = zzhVarZzj.zzy();
        long jZzb = zzhVarZzj.zzb();
        String strZzx = zzhVarZzj.zzx();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzan = zzhVarZzj.zzan();
        String strZzz = zzhVarZzj.zzz();
        zzhVarZzj.zza();
        zzG(zzauVar, new zzq(str, strZzA, strZzy, jZzb, strZzx, jZzm, jZzj, (String) null, zZzan, false, strZzz, 0L, 0L, 0, zzhVarZzj.zzam(), false, zzhVarZzj.zzt(), zzhVarZzj.zzs(), zzhVarZzj.zzk(), zzhVarZzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzhVarZzj.zzap(), zzhVarZzj.zzr()));
    }

    final void zzG(zzau zzauVar, zzq zzqVar) throws Throwable {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzeu zzeuVarZzb = zzeu.zzb(zzauVar);
        zzlp zzlpVarZzv = zzv();
        Bundle bundle = zzeuVarZzb.zzd;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzlpVarZzv.zzL(bundle, zzakVar.zzi(zzqVar.zza));
        zzv().zzN(zzeuVarZzb, zzg().zzd(zzqVar.zza));
        zzau zzauVarZza = zzeuVarZzb.zza();
        if ("_cmp".equals(zzauVarZza.zza) && "referrer API v2".equals(zzauVarZza.zzb.zzg("_cis"))) {
            String strZzg = zzauVarZza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(strZzg)) {
                zzW(new zzlk("_lgclid", zzauVarZza.zzd, strZzg, TtmlNode.TEXT_EMPHASIS_AUTO), zzqVar);
            }
        }
        zzE(zzauVarZza, zzqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzI(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzI(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    final void zzJ(boolean z) {
        zzag();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014a A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:4:0x000d, B:5:0x000f, B:46:0x0122, B:51:0x0159, B:50:0x014a, B:12:0x0025, B:34:0x00c3, B:36:0x00d8, B:38:0x00de, B:40:0x00e9, B:39:0x00e2, B:42:0x00ed, B:43:0x00f5, B:45:0x00f7), top: B:58:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzK(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzK(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0283 A[Catch: all -> 0x05a0, TryCatch #0 {all -> 0x05a0, blocks: (B:106:0x0278, B:108:0x027e, B:110:0x0283, B:113:0x02a2, B:116:0x02b5, B:118:0x02dc, B:121:0x02e4, B:123:0x02f3, B:151:0x03de, B:153:0x0412, B:154:0x0415, B:156:0x043e, B:196:0x050b, B:197:0x050e, B:205:0x058f, B:158:0x0453, B:163:0x0478, B:165:0x0480, B:167:0x0488, B:171:0x049b, B:175:0x04ac, B:179:0x04b6, B:182:0x04c9, B:187:0x04ee, B:189:0x04f4, B:191:0x04fc, B:193:0x0502, B:185:0x04da, B:172:0x04a3, B:161:0x0464, B:124:0x0304, B:126:0x0331, B:127:0x0342, B:129:0x0349, B:131:0x034f, B:133:0x0359, B:135:0x0363, B:137:0x0369, B:139:0x036f, B:140:0x0374, B:144:0x0394, B:147:0x039b, B:148:0x03af, B:149:0x03bf, B:150:0x03cf, B:198:0x0525, B:200:0x0556, B:201:0x0559, B:202:0x0570, B:204:0x0574, B:111:0x0292), top: B:215:0x0278, inners: #4, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0292 A[Catch: all -> 0x05a0, TryCatch #0 {all -> 0x05a0, blocks: (B:106:0x0278, B:108:0x027e, B:110:0x0283, B:113:0x02a2, B:116:0x02b5, B:118:0x02dc, B:121:0x02e4, B:123:0x02f3, B:151:0x03de, B:153:0x0412, B:154:0x0415, B:156:0x043e, B:196:0x050b, B:197:0x050e, B:205:0x058f, B:158:0x0453, B:163:0x0478, B:165:0x0480, B:167:0x0488, B:171:0x049b, B:175:0x04ac, B:179:0x04b6, B:182:0x04c9, B:187:0x04ee, B:189:0x04f4, B:191:0x04fc, B:193:0x0502, B:185:0x04da, B:172:0x04a3, B:161:0x0464, B:124:0x0304, B:126:0x0331, B:127:0x0342, B:129:0x0349, B:131:0x034f, B:133:0x0359, B:135:0x0363, B:137:0x0369, B:139:0x036f, B:140:0x0374, B:144:0x0394, B:147:0x039b, B:148:0x03af, B:149:0x03bf, B:150:0x03cf, B:198:0x0525, B:200:0x0556, B:201:0x0559, B:202:0x0570, B:204:0x0574, B:111:0x0292), top: B:215:0x0278, inners: #4, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a2 A[Catch: all -> 0x05a0, TRY_LEAVE, TryCatch #0 {all -> 0x05a0, blocks: (B:106:0x0278, B:108:0x027e, B:110:0x0283, B:113:0x02a2, B:116:0x02b5, B:118:0x02dc, B:121:0x02e4, B:123:0x02f3, B:151:0x03de, B:153:0x0412, B:154:0x0415, B:156:0x043e, B:196:0x050b, B:197:0x050e, B:205:0x058f, B:158:0x0453, B:163:0x0478, B:165:0x0480, B:167:0x0488, B:171:0x049b, B:175:0x04ac, B:179:0x04b6, B:182:0x04c9, B:187:0x04ee, B:189:0x04f4, B:191:0x04fc, B:193:0x0502, B:185:0x04da, B:172:0x04a3, B:161:0x0464, B:124:0x0304, B:126:0x0331, B:127:0x0342, B:129:0x0349, B:131:0x034f, B:133:0x0359, B:135:0x0363, B:137:0x0369, B:139:0x036f, B:140:0x0374, B:144:0x0394, B:147:0x039b, B:148:0x03af, B:149:0x03bf, B:150:0x03cf, B:198:0x0525, B:200:0x0556, B:201:0x0559, B:202:0x0570, B:204:0x0574, B:111:0x0292), top: B:215:0x0278, inners: #4, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0570 A[Catch: all -> 0x05a0, TryCatch #0 {all -> 0x05a0, blocks: (B:106:0x0278, B:108:0x027e, B:110:0x0283, B:113:0x02a2, B:116:0x02b5, B:118:0x02dc, B:121:0x02e4, B:123:0x02f3, B:151:0x03de, B:153:0x0412, B:154:0x0415, B:156:0x043e, B:196:0x050b, B:197:0x050e, B:205:0x058f, B:158:0x0453, B:163:0x0478, B:165:0x0480, B:167:0x0488, B:171:0x049b, B:175:0x04ac, B:179:0x04b6, B:182:0x04c9, B:187:0x04ee, B:189:0x04f4, B:191:0x04fc, B:193:0x0502, B:185:0x04da, B:172:0x04a3, B:161:0x0464, B:124:0x0304, B:126:0x0331, B:127:0x0342, B:129:0x0349, B:131:0x034f, B:133:0x0359, B:135:0x0363, B:137:0x0369, B:139:0x036f, B:140:0x0374, B:144:0x0394, B:147:0x039b, B:148:0x03af, B:149:0x03bf, B:150:0x03cf, B:198:0x0525, B:200:0x0556, B:201:0x0559, B:202:0x0570, B:204:0x0574, B:111:0x0292), top: B:215:0x0278, inners: #4, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0225 A[Catch: all -> 0x0212, TryCatch #9 {all -> 0x0212, blocks: (B:45:0x0113, B:47:0x0129, B:48:0x0150, B:50:0x0166, B:52:0x016e, B:54:0x0176, B:56:0x017e, B:58:0x0186, B:60:0x0194, B:62:0x01bb, B:64:0x01c4, B:89:0x0225, B:91:0x0230, B:95:0x023d, B:98:0x024b, B:102:0x0256, B:104:0x0259, B:83:0x01fd), top: B:233:0x0113 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzL(com.google.android.gms.measurement.internal.zzq r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzL(com.google.android.gms.measurement.internal.zzq):void");
    }

    final void zzN(zzac zzacVar) throws Throwable {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzO(zzacVar, zzqVarZzac);
        }
    }

    final void zzO(zzac zzacVar, zzq zzqVar) throws Throwable {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzac zzacVarZzk = zzakVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzacVarZzk != null) {
                    zzaA().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    zzakVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzacVarZzk.zze) {
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        zzakVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzau zzauVar = zzacVar.zzk;
                    if (zzauVar != null) {
                        zzas zzasVar = zzauVar.zzb;
                        zzY((zzau) Preconditions.checkNotNull(zzv().zzz(str, ((zzau) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzasVar != null ? zzasVar.zzc() : null, zzacVarZzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzaA().zzk().zzc("Conditional user property doesn't exist", zzet.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzC();
            } finally {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
            }
        }
    }

    final void zzP(String str, zzq zzqVar) throws Throwable {
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(str) && zzqVar.zzr != null) {
                zzaA().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzlk("_npa", zzax().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), TtmlNode.TEXT_EMPHASIS_AUTO), zzqVar);
                return;
            }
            zzaA().zzc().zzb("Removing user property", this.zzn.zzj().zzf(str));
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(str)) {
                    zzak zzakVar2 = this.zze;
                    zzal(zzakVar2);
                    zzakVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzak zzakVar3 = this.zze;
                zzal(zzakVar3);
                zzakVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), str);
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                zzakVar4.zzC();
                zzaA().zzc().zzb("User property removed", this.zzn.zzj().zzf(str));
            } finally {
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzx();
            }
        }
    }

    final void zzQ(zzq zzqVar) throws Throwable {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzakVar.zzg();
        zzakVar.zzW();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzakVar.zzh();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr);
            int iDelete2 = sQLiteDatabaseZzh.delete("events", "app_id=?", strArr);
            int iDelete3 = sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr);
            int iDelete4 = sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr);
            int iDelete5 = sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr);
            int iDelete6 = sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr);
            int iDelete7 = sQLiteDatabaseZzh.delete("queue", "app_id=?", strArr);
            int iDelete8 = iDelete + iDelete2 + iDelete3 + iDelete4 + iDelete5 + iDelete6 + iDelete7 + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
            if (iDelete8 > 0) {
                zzakVar.zzt.zzaA().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete8));
            }
        } catch (SQLiteException e) {
            zzakVar.zzt.zzaA().zzd().zzc("Error resetting analytics data. appId, error", zzet.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzir zzirVar) {
        zzaB().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzirVar != null) {
            this.zzE = str;
            this.zzD = zzirVar;
        }
    }

    protected final void zzS() {
        zzaB().zzg();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzakVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzag();
    }

    final void zzT(zzac zzacVar) throws Throwable {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzU(zzacVar, zzqVarZzac);
        }
    }

    final void zzU(zzac zzacVar, zzq zzqVar) throws Throwable {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzac zzacVarZzk = zzakVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzacVarZzk != null && !zzacVarZzk.zzb.equals(zzacVar2.zzb)) {
                    zzaA().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzacVarZzk.zzb);
                }
                if (zzacVarZzk != null && zzacVarZzk.zze) {
                    zzacVar2.zzb = zzacVarZzk.zzb;
                    zzacVar2.zzd = zzacVarZzk.zzd;
                    zzacVar2.zzh = zzacVarZzk.zzh;
                    zzacVar2.zzf = zzacVarZzk.zzf;
                    zzacVar2.zzi = zzacVarZzk.zzi;
                    zzacVar2.zze = true;
                    zzlk zzlkVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlk(zzlkVar.zzb, zzacVarZzk.zzc.zzc, zzlkVar.zza(), zzacVarZzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlk zzlkVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlk(zzlkVar2.zzb, zzacVar2.zzd, zzlkVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzlk zzlkVar3 = zzacVar2.zzc;
                    zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzlkVar3.zzb, zzlkVar3.zzc, Preconditions.checkNotNull(zzlkVar3.zza()));
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    if (zzakVar3.zzL(zzlmVar)) {
                        zzaA().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    } else {
                        zzaA().zzd().zzd("(2)Too many active user properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    }
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzau(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                if (zzakVar4.zzK(zzacVar2)) {
                    zzaA().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzaA().zzd().zzd("Too many conditional properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzC();
            } finally {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
            }
        }
    }

    final void zzV(String str, zzhb zzhbVar) {
        zzaB().zzg();
        zzB();
        this.zzB.put(str, zzhbVar);
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzhbVar);
        zzakVar.zzg();
        zzakVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzhbVar.zzi());
        try {
            if (zzakVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzakVar.zzt.zzaA().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzet.zzn(str));
            }
        } catch (SQLiteException e) {
            zzakVar.zzt.zzaA().zzd().zzc("Error storing consent setting. appId, error", zzet.zzn(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzW(com.google.android.gms.measurement.internal.zzlk r18, com.google.android.gms.measurement.internal.zzq r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzW(com.google.android.gms.measurement.internal.zzlk, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0285 A[Catch: all -> 0x0548, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0548, blocks: (B:3:0x0010, B:9:0x0035, B:13:0x004c, B:18:0x005b, B:22:0x0077, B:26:0x0096, B:33:0x00be, B:37:0x00e1, B:39:0x00f2, B:66:0x013c, B:70:0x0164, B:74:0x016c, B:141:0x02ae, B:143:0x02b4, B:145:0x02c0, B:146:0x02c4, B:148:0x02ca, B:150:0x02de, B:154:0x02e7, B:156:0x02ed, B:162:0x0312, B:159:0x0302, B:161:0x030c, B:163:0x0315, B:165:0x0330, B:169:0x033f, B:171:0x0363, B:173:0x039d, B:175:0x03a2, B:177:0x03aa, B:178:0x03ad, B:180:0x03b2, B:181:0x03b5, B:183:0x03c1, B:184:0x03d7, B:185:0x03df, B:187:0x03f0, B:189:0x0401, B:190:0x0416, B:192:0x0423, B:194:0x0438, B:196:0x0441, B:199:0x044d, B:193:0x0431, B:201:0x049c, B:132:0x0285, B:140:0x02ab, B:205:0x04b7, B:206:0x04ba, B:207:0x04bb, B:226:0x0521, B:228:0x0525, B:230:0x052b, B:232:0x0536, B:216:0x0505, B:239:0x0544, B:240:0x0547), top: B:250:0x0010, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b4 A[Catch: all -> 0x0548, TryCatch #3 {all -> 0x0548, blocks: (B:3:0x0010, B:9:0x0035, B:13:0x004c, B:18:0x005b, B:22:0x0077, B:26:0x0096, B:33:0x00be, B:37:0x00e1, B:39:0x00f2, B:66:0x013c, B:70:0x0164, B:74:0x016c, B:141:0x02ae, B:143:0x02b4, B:145:0x02c0, B:146:0x02c4, B:148:0x02ca, B:150:0x02de, B:154:0x02e7, B:156:0x02ed, B:162:0x0312, B:159:0x0302, B:161:0x030c, B:163:0x0315, B:165:0x0330, B:169:0x033f, B:171:0x0363, B:173:0x039d, B:175:0x03a2, B:177:0x03aa, B:178:0x03ad, B:180:0x03b2, B:181:0x03b5, B:183:0x03c1, B:184:0x03d7, B:185:0x03df, B:187:0x03f0, B:189:0x0401, B:190:0x0416, B:192:0x0423, B:194:0x0438, B:196:0x0441, B:199:0x044d, B:193:0x0431, B:201:0x049c, B:132:0x0285, B:140:0x02ab, B:205:0x04b7, B:206:0x04ba, B:207:0x04bb, B:226:0x0521, B:228:0x0525, B:230:0x052b, B:232:0x0536, B:216:0x0505, B:239:0x0544, B:240:0x0547), top: B:250:0x0010, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x052b A[Catch: all -> 0x0548, TryCatch #3 {all -> 0x0548, blocks: (B:3:0x0010, B:9:0x0035, B:13:0x004c, B:18:0x005b, B:22:0x0077, B:26:0x0096, B:33:0x00be, B:37:0x00e1, B:39:0x00f2, B:66:0x013c, B:70:0x0164, B:74:0x016c, B:141:0x02ae, B:143:0x02b4, B:145:0x02c0, B:146:0x02c4, B:148:0x02ca, B:150:0x02de, B:154:0x02e7, B:156:0x02ed, B:162:0x0312, B:159:0x0302, B:161:0x030c, B:163:0x0315, B:165:0x0330, B:169:0x033f, B:171:0x0363, B:173:0x039d, B:175:0x03a2, B:177:0x03aa, B:178:0x03ad, B:180:0x03b2, B:181:0x03b5, B:183:0x03c1, B:184:0x03d7, B:185:0x03df, B:187:0x03f0, B:189:0x0401, B:190:0x0416, B:192:0x0423, B:194:0x0438, B:196:0x0441, B:199:0x044d, B:193:0x0431, B:201:0x049c, B:132:0x0285, B:140:0x02ab, B:205:0x04b7, B:206:0x04ba, B:207:0x04bb, B:226:0x0521, B:228:0x0525, B:230:0x052b, B:232:0x0536, B:216:0x0505, B:239:0x0544, B:240:0x0547), top: B:250:0x0010, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138 A[Catch: all -> 0x0032, TryCatch #10 {all -> 0x0032, blocks: (B:5:0x0021, B:11:0x003b, B:16:0x0054, B:20:0x0066, B:24:0x0082, B:30:0x00b5, B:36:0x00ca, B:42:0x00f8, B:59:0x012e, B:60:0x0131, B:64:0x0138, B:65:0x013b, B:81:0x01a8), top: B:257:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2 A[Catch: SQLiteException -> 0x0243, all -> 0x04b3, TRY_LEAVE, TryCatch #12 {all -> 0x04b3, blocks: (B:77:0x019c, B:79:0x01a2, B:85:0x01b3, B:86:0x01b9, B:87:0x01bd, B:88:0x01c8, B:90:0x01dd, B:92:0x01e3, B:93:0x01ed, B:95:0x01f3, B:99:0x01f9, B:101:0x0204, B:103:0x020a, B:104:0x0211, B:126:0x0272, B:106:0x0226, B:109:0x023b, B:119:0x024a, B:120:0x0259, B:125:0x025f, B:138:0x0292), top: B:259:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b3 A[Catch: SQLiteException -> 0x0243, all -> 0x04b3, TRY_ENTER, TryCatch #12 {all -> 0x04b3, blocks: (B:77:0x019c, B:79:0x01a2, B:85:0x01b3, B:86:0x01b9, B:87:0x01bd, B:88:0x01c8, B:90:0x01dd, B:92:0x01e3, B:93:0x01ed, B:95:0x01f3, B:99:0x01f9, B:101:0x0204, B:103:0x020a, B:104:0x0211, B:126:0x0272, B:106:0x0226, B:109:0x023b, B:119:0x024a, B:120:0x0259, B:125:0x025f, B:138:0x0292), top: B:259:0x019c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzX() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzX():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037a A[Catch: all -> 0x0b4f, TryCatch #10 {all -> 0x0b4f, blocks: (B:38:0x01a0, B:41:0x01af, B:43:0x01b9, B:48:0x01c5, B:100:0x0364, B:109:0x039a, B:111:0x03da, B:113:0x03e0, B:114:0x03f7, B:118:0x040a, B:120:0x0421, B:122:0x0427, B:123:0x043e, B:128:0x0468, B:132:0x0489, B:133:0x04a0, B:136:0x04b1, B:139:0x04ce, B:140:0x04e2, B:142:0x04ec, B:144:0x04fb, B:146:0x0501, B:147:0x050a, B:148:0x0518, B:150:0x052d, B:152:0x0542, B:164:0x056f, B:165:0x0584, B:167:0x05ae, B:170:0x05c6, B:173:0x0609, B:175:0x0635, B:177:0x0674, B:178:0x0679, B:180:0x0681, B:181:0x0686, B:183:0x068e, B:184:0x0693, B:186:0x069e, B:188:0x06aa, B:190:0x06b8, B:191:0x06bd, B:193:0x06c6, B:194:0x06ca, B:196:0x06d7, B:197:0x06dc, B:199:0x0705, B:201:0x070d, B:202:0x0712, B:204:0x071a, B:205:0x071d, B:207:0x0741, B:210:0x074c, B:213:0x0754, B:214:0x076d, B:216:0x0773, B:218:0x0787, B:220:0x0793, B:222:0x07a0, B:226:0x07ba, B:227:0x07ca, B:231:0x07d3, B:232:0x07d6, B:234:0x07f4, B:236:0x07f8, B:238:0x080a, B:240:0x080e, B:242:0x0819, B:243:0x0824, B:245:0x086a, B:246:0x086f, B:248:0x0877, B:250:0x0880, B:251:0x0883, B:253:0x0890, B:255:0x08b2, B:256:0x08bf, B:257:0x08f5, B:259:0x08fd, B:261:0x0907, B:262:0x0914, B:264:0x091e, B:265:0x092b, B:266:0x0938, B:268:0x093e, B:270:0x0977, B:272:0x0987, B:274:0x0991, B:276:0x09a4, B:278:0x09aa, B:279:0x09f0, B:280:0x09fa, B:281:0x0a06, B:283:0x0a0c, B:292:0x0a5a, B:293:0x0aa8, B:295:0x0ab8, B:309:0x0b1c, B:298:0x0ad0, B:300:0x0ad4, B:286:0x0a17, B:288:0x0a43, B:304:0x0aed, B:305:0x0b04, B:308:0x0b07, B:208:0x0746, B:174:0x0627, B:161:0x0554, B:103:0x037a, B:104:0x0381, B:106:0x0387, B:108:0x0393, B:52:0x01d2, B:55:0x01de, B:57:0x01f5, B:62:0x020e, B:69:0x024c, B:71:0x0252, B:73:0x0260, B:75:0x0275, B:78:0x027c, B:96:0x0323, B:98:0x032e, B:79:0x02ab, B:80:0x02c6, B:82:0x02cd, B:84:0x02d6, B:95:0x0307, B:94:0x02f4, B:65:0x021c, B:68:0x0242), top: B:336:0x01a0, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03da A[Catch: all -> 0x0b4f, TryCatch #10 {all -> 0x0b4f, blocks: (B:38:0x01a0, B:41:0x01af, B:43:0x01b9, B:48:0x01c5, B:100:0x0364, B:109:0x039a, B:111:0x03da, B:113:0x03e0, B:114:0x03f7, B:118:0x040a, B:120:0x0421, B:122:0x0427, B:123:0x043e, B:128:0x0468, B:132:0x0489, B:133:0x04a0, B:136:0x04b1, B:139:0x04ce, B:140:0x04e2, B:142:0x04ec, B:144:0x04fb, B:146:0x0501, B:147:0x050a, B:148:0x0518, B:150:0x052d, B:152:0x0542, B:164:0x056f, B:165:0x0584, B:167:0x05ae, B:170:0x05c6, B:173:0x0609, B:175:0x0635, B:177:0x0674, B:178:0x0679, B:180:0x0681, B:181:0x0686, B:183:0x068e, B:184:0x0693, B:186:0x069e, B:188:0x06aa, B:190:0x06b8, B:191:0x06bd, B:193:0x06c6, B:194:0x06ca, B:196:0x06d7, B:197:0x06dc, B:199:0x0705, B:201:0x070d, B:202:0x0712, B:204:0x071a, B:205:0x071d, B:207:0x0741, B:210:0x074c, B:213:0x0754, B:214:0x076d, B:216:0x0773, B:218:0x0787, B:220:0x0793, B:222:0x07a0, B:226:0x07ba, B:227:0x07ca, B:231:0x07d3, B:232:0x07d6, B:234:0x07f4, B:236:0x07f8, B:238:0x080a, B:240:0x080e, B:242:0x0819, B:243:0x0824, B:245:0x086a, B:246:0x086f, B:248:0x0877, B:250:0x0880, B:251:0x0883, B:253:0x0890, B:255:0x08b2, B:256:0x08bf, B:257:0x08f5, B:259:0x08fd, B:261:0x0907, B:262:0x0914, B:264:0x091e, B:265:0x092b, B:266:0x0938, B:268:0x093e, B:270:0x0977, B:272:0x0987, B:274:0x0991, B:276:0x09a4, B:278:0x09aa, B:279:0x09f0, B:280:0x09fa, B:281:0x0a06, B:283:0x0a0c, B:292:0x0a5a, B:293:0x0aa8, B:295:0x0ab8, B:309:0x0b1c, B:298:0x0ad0, B:300:0x0ad4, B:286:0x0a17, B:288:0x0a43, B:304:0x0aed, B:305:0x0b04, B:308:0x0b07, B:208:0x0746, B:174:0x0627, B:161:0x0554, B:103:0x037a, B:104:0x0381, B:106:0x0387, B:108:0x0393, B:52:0x01d2, B:55:0x01de, B:57:0x01f5, B:62:0x020e, B:69:0x024c, B:71:0x0252, B:73:0x0260, B:75:0x0275, B:78:0x027c, B:96:0x0323, B:98:0x032e, B:79:0x02ab, B:80:0x02c6, B:82:0x02cd, B:84:0x02d6, B:95:0x0307, B:94:0x02f4, B:65:0x021c, B:68:0x0242), top: B:336:0x01a0, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01de A[Catch: all -> 0x0b4f, TRY_ENTER, TryCatch #10 {all -> 0x0b4f, blocks: (B:38:0x01a0, B:41:0x01af, B:43:0x01b9, B:48:0x01c5, B:100:0x0364, B:109:0x039a, B:111:0x03da, B:113:0x03e0, B:114:0x03f7, B:118:0x040a, B:120:0x0421, B:122:0x0427, B:123:0x043e, B:128:0x0468, B:132:0x0489, B:133:0x04a0, B:136:0x04b1, B:139:0x04ce, B:140:0x04e2, B:142:0x04ec, B:144:0x04fb, B:146:0x0501, B:147:0x050a, B:148:0x0518, B:150:0x052d, B:152:0x0542, B:164:0x056f, B:165:0x0584, B:167:0x05ae, B:170:0x05c6, B:173:0x0609, B:175:0x0635, B:177:0x0674, B:178:0x0679, B:180:0x0681, B:181:0x0686, B:183:0x068e, B:184:0x0693, B:186:0x069e, B:188:0x06aa, B:190:0x06b8, B:191:0x06bd, B:193:0x06c6, B:194:0x06ca, B:196:0x06d7, B:197:0x06dc, B:199:0x0705, B:201:0x070d, B:202:0x0712, B:204:0x071a, B:205:0x071d, B:207:0x0741, B:210:0x074c, B:213:0x0754, B:214:0x076d, B:216:0x0773, B:218:0x0787, B:220:0x0793, B:222:0x07a0, B:226:0x07ba, B:227:0x07ca, B:231:0x07d3, B:232:0x07d6, B:234:0x07f4, B:236:0x07f8, B:238:0x080a, B:240:0x080e, B:242:0x0819, B:243:0x0824, B:245:0x086a, B:246:0x086f, B:248:0x0877, B:250:0x0880, B:251:0x0883, B:253:0x0890, B:255:0x08b2, B:256:0x08bf, B:257:0x08f5, B:259:0x08fd, B:261:0x0907, B:262:0x0914, B:264:0x091e, B:265:0x092b, B:266:0x0938, B:268:0x093e, B:270:0x0977, B:272:0x0987, B:274:0x0991, B:276:0x09a4, B:278:0x09aa, B:279:0x09f0, B:280:0x09fa, B:281:0x0a06, B:283:0x0a0c, B:292:0x0a5a, B:293:0x0aa8, B:295:0x0ab8, B:309:0x0b1c, B:298:0x0ad0, B:300:0x0ad4, B:286:0x0a17, B:288:0x0a43, B:304:0x0aed, B:305:0x0b04, B:308:0x0b07, B:208:0x0746, B:174:0x0627, B:161:0x0554, B:103:0x037a, B:104:0x0381, B:106:0x0387, B:108:0x0393, B:52:0x01d2, B:55:0x01de, B:57:0x01f5, B:62:0x020e, B:69:0x024c, B:71:0x0252, B:73:0x0260, B:75:0x0275, B:78:0x027c, B:96:0x0323, B:98:0x032e, B:79:0x02ab, B:80:0x02c6, B:82:0x02cd, B:84:0x02d6, B:95:0x0307, B:94:0x02f4, B:65:0x021c, B:68:0x0242), top: B:336:0x01a0, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0242 A[Catch: all -> 0x0b4f, TRY_ENTER, TryCatch #10 {all -> 0x0b4f, blocks: (B:38:0x01a0, B:41:0x01af, B:43:0x01b9, B:48:0x01c5, B:100:0x0364, B:109:0x039a, B:111:0x03da, B:113:0x03e0, B:114:0x03f7, B:118:0x040a, B:120:0x0421, B:122:0x0427, B:123:0x043e, B:128:0x0468, B:132:0x0489, B:133:0x04a0, B:136:0x04b1, B:139:0x04ce, B:140:0x04e2, B:142:0x04ec, B:144:0x04fb, B:146:0x0501, B:147:0x050a, B:148:0x0518, B:150:0x052d, B:152:0x0542, B:164:0x056f, B:165:0x0584, B:167:0x05ae, B:170:0x05c6, B:173:0x0609, B:175:0x0635, B:177:0x0674, B:178:0x0679, B:180:0x0681, B:181:0x0686, B:183:0x068e, B:184:0x0693, B:186:0x069e, B:188:0x06aa, B:190:0x06b8, B:191:0x06bd, B:193:0x06c6, B:194:0x06ca, B:196:0x06d7, B:197:0x06dc, B:199:0x0705, B:201:0x070d, B:202:0x0712, B:204:0x071a, B:205:0x071d, B:207:0x0741, B:210:0x074c, B:213:0x0754, B:214:0x076d, B:216:0x0773, B:218:0x0787, B:220:0x0793, B:222:0x07a0, B:226:0x07ba, B:227:0x07ca, B:231:0x07d3, B:232:0x07d6, B:234:0x07f4, B:236:0x07f8, B:238:0x080a, B:240:0x080e, B:242:0x0819, B:243:0x0824, B:245:0x086a, B:246:0x086f, B:248:0x0877, B:250:0x0880, B:251:0x0883, B:253:0x0890, B:255:0x08b2, B:256:0x08bf, B:257:0x08f5, B:259:0x08fd, B:261:0x0907, B:262:0x0914, B:264:0x091e, B:265:0x092b, B:266:0x0938, B:268:0x093e, B:270:0x0977, B:272:0x0987, B:274:0x0991, B:276:0x09a4, B:278:0x09aa, B:279:0x09f0, B:280:0x09fa, B:281:0x0a06, B:283:0x0a0c, B:292:0x0a5a, B:293:0x0aa8, B:295:0x0ab8, B:309:0x0b1c, B:298:0x0ad0, B:300:0x0ad4, B:286:0x0a17, B:288:0x0a43, B:304:0x0aed, B:305:0x0b04, B:308:0x0b07, B:208:0x0746, B:174:0x0627, B:161:0x0554, B:103:0x037a, B:104:0x0381, B:106:0x0387, B:108:0x0393, B:52:0x01d2, B:55:0x01de, B:57:0x01f5, B:62:0x020e, B:69:0x024c, B:71:0x0252, B:73:0x0260, B:75:0x0275, B:78:0x027c, B:96:0x0323, B:98:0x032e, B:79:0x02ab, B:80:0x02c6, B:82:0x02cd, B:84:0x02d6, B:95:0x0307, B:94:0x02f4, B:65:0x021c, B:68:0x0242), top: B:336:0x01a0, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0252 A[Catch: all -> 0x0b4f, TryCatch #10 {all -> 0x0b4f, blocks: (B:38:0x01a0, B:41:0x01af, B:43:0x01b9, B:48:0x01c5, B:100:0x0364, B:109:0x039a, B:111:0x03da, B:113:0x03e0, B:114:0x03f7, B:118:0x040a, B:120:0x0421, B:122:0x0427, B:123:0x043e, B:128:0x0468, B:132:0x0489, B:133:0x04a0, B:136:0x04b1, B:139:0x04ce, B:140:0x04e2, B:142:0x04ec, B:144:0x04fb, B:146:0x0501, B:147:0x050a, B:148:0x0518, B:150:0x052d, B:152:0x0542, B:164:0x056f, B:165:0x0584, B:167:0x05ae, B:170:0x05c6, B:173:0x0609, B:175:0x0635, B:177:0x0674, B:178:0x0679, B:180:0x0681, B:181:0x0686, B:183:0x068e, B:184:0x0693, B:186:0x069e, B:188:0x06aa, B:190:0x06b8, B:191:0x06bd, B:193:0x06c6, B:194:0x06ca, B:196:0x06d7, B:197:0x06dc, B:199:0x0705, B:201:0x070d, B:202:0x0712, B:204:0x071a, B:205:0x071d, B:207:0x0741, B:210:0x074c, B:213:0x0754, B:214:0x076d, B:216:0x0773, B:218:0x0787, B:220:0x0793, B:222:0x07a0, B:226:0x07ba, B:227:0x07ca, B:231:0x07d3, B:232:0x07d6, B:234:0x07f4, B:236:0x07f8, B:238:0x080a, B:240:0x080e, B:242:0x0819, B:243:0x0824, B:245:0x086a, B:246:0x086f, B:248:0x0877, B:250:0x0880, B:251:0x0883, B:253:0x0890, B:255:0x08b2, B:256:0x08bf, B:257:0x08f5, B:259:0x08fd, B:261:0x0907, B:262:0x0914, B:264:0x091e, B:265:0x092b, B:266:0x0938, B:268:0x093e, B:270:0x0977, B:272:0x0987, B:274:0x0991, B:276:0x09a4, B:278:0x09aa, B:279:0x09f0, B:280:0x09fa, B:281:0x0a06, B:283:0x0a0c, B:292:0x0a5a, B:293:0x0aa8, B:295:0x0ab8, B:309:0x0b1c, B:298:0x0ad0, B:300:0x0ad4, B:286:0x0a17, B:288:0x0a43, B:304:0x0aed, B:305:0x0b04, B:308:0x0b07, B:208:0x0746, B:174:0x0627, B:161:0x0554, B:103:0x037a, B:104:0x0381, B:106:0x0387, B:108:0x0393, B:52:0x01d2, B:55:0x01de, B:57:0x01f5, B:62:0x020e, B:69:0x024c, B:71:0x0252, B:73:0x0260, B:75:0x0275, B:78:0x027c, B:96:0x0323, B:98:0x032e, B:79:0x02ab, B:80:0x02c6, B:82:0x02cd, B:84:0x02d6, B:95:0x0307, B:94:0x02f4, B:65:0x021c, B:68:0x0242), top: B:336:0x01a0, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032e A[Catch: all -> 0x0b4f, TryCatch #10 {all -> 0x0b4f, blocks: (B:38:0x01a0, B:41:0x01af, B:43:0x01b9, B:48:0x01c5, B:100:0x0364, B:109:0x039a, B:111:0x03da, B:113:0x03e0, B:114:0x03f7, B:118:0x040a, B:120:0x0421, B:122:0x0427, B:123:0x043e, B:128:0x0468, B:132:0x0489, B:133:0x04a0, B:136:0x04b1, B:139:0x04ce, B:140:0x04e2, B:142:0x04ec, B:144:0x04fb, B:146:0x0501, B:147:0x050a, B:148:0x0518, B:150:0x052d, B:152:0x0542, B:164:0x056f, B:165:0x0584, B:167:0x05ae, B:170:0x05c6, B:173:0x0609, B:175:0x0635, B:177:0x0674, B:178:0x0679, B:180:0x0681, B:181:0x0686, B:183:0x068e, B:184:0x0693, B:186:0x069e, B:188:0x06aa, B:190:0x06b8, B:191:0x06bd, B:193:0x06c6, B:194:0x06ca, B:196:0x06d7, B:197:0x06dc, B:199:0x0705, B:201:0x070d, B:202:0x0712, B:204:0x071a, B:205:0x071d, B:207:0x0741, B:210:0x074c, B:213:0x0754, B:214:0x076d, B:216:0x0773, B:218:0x0787, B:220:0x0793, B:222:0x07a0, B:226:0x07ba, B:227:0x07ca, B:231:0x07d3, B:232:0x07d6, B:234:0x07f4, B:236:0x07f8, B:238:0x080a, B:240:0x080e, B:242:0x0819, B:243:0x0824, B:245:0x086a, B:246:0x086f, B:248:0x0877, B:250:0x0880, B:251:0x0883, B:253:0x0890, B:255:0x08b2, B:256:0x08bf, B:257:0x08f5, B:259:0x08fd, B:261:0x0907, B:262:0x0914, B:264:0x091e, B:265:0x092b, B:266:0x0938, B:268:0x093e, B:270:0x0977, B:272:0x0987, B:274:0x0991, B:276:0x09a4, B:278:0x09aa, B:279:0x09f0, B:280:0x09fa, B:281:0x0a06, B:283:0x0a0c, B:292:0x0a5a, B:293:0x0aa8, B:295:0x0ab8, B:309:0x0b1c, B:298:0x0ad0, B:300:0x0ad4, B:286:0x0a17, B:288:0x0a43, B:304:0x0aed, B:305:0x0b04, B:308:0x0b07, B:208:0x0746, B:174:0x0627, B:161:0x0554, B:103:0x037a, B:104:0x0381, B:106:0x0387, B:108:0x0393, B:52:0x01d2, B:55:0x01de, B:57:0x01f5, B:62:0x020e, B:69:0x024c, B:71:0x0252, B:73:0x0260, B:75:0x0275, B:78:0x027c, B:96:0x0323, B:98:0x032e, B:79:0x02ab, B:80:0x02c6, B:82:0x02cd, B:84:0x02d6, B:95:0x0307, B:94:0x02f4, B:65:0x021c, B:68:0x0242), top: B:336:0x01a0, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzY(com.google.android.gms.measurement.internal.zzau r35, com.google.android.gms.measurement.internal.zzq r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzY(com.google.android.gms.measurement.internal.zzau, com.google.android.gms.measurement.internal.zzq):void");
    }

    final boolean zzZ() {
        zzaB().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzaA().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzaw().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzw = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzaA().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaA().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaA().zzd().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaA().zzd().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaA().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    final long zza() {
        long jCurrentTimeMillis = zzax().currentTimeMillis();
        zzkb zzkbVar = this.zzk;
        zzkbVar.zzW();
        zzkbVar.zzg();
        long jZza = zzkbVar.zze.zza();
        if (jZza == 0) {
            jZza = ((long) zzkbVar.zzt.zzv().zzG().nextInt(86400000)) + 1;
            zzkbVar.zze.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaB();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        return this.zzn.zzaw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzax();
    }

    final zzh zzd(zzq zzqVar) throws Throwable {
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzlg(this, zzqVar.zzw));
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzhVarZzj = zzakVar.zzj(zzqVar.zza);
        zzhb zzhbVarZzd = zzq(zzqVar.zza).zzd(zzhb.zzc(zzqVar.zzv, 100));
        String strZzf = zzhbVarZzd.zzj(zzha.AD_STORAGE) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzhVarZzj == null) {
            zzh zzhVar = new zzh(this.zzn, zzqVar.zza);
            if (zzhbVarZzd.zzj(zzha.ANALYTICS_STORAGE)) {
                zzhVar.zzJ(zzw(zzhbVarZzd));
            }
            if (zzhbVarZzd.zzj(zzha.AD_STORAGE)) {
                zzhVar.zzag(strZzf);
            }
            zzhVarZzj = zzhVar;
        } else if (zzhbVarZzd.zzj(zzha.AD_STORAGE) && strZzf != null && !strZzf.equals(zzhVarZzj.zzC())) {
            zzhVarZzj.zzag(strZzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzhbVarZzd).first)) {
                zzhVarZzj.zzJ(zzw(zzhbVarZzd));
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                if (zzakVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    if (zzakVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzlm zzlmVar = new zzlm(zzqVar.zza, TtmlNode.TEXT_EMPHASIS_AUTO, "_lair", zzax().currentTimeMillis(), 1L);
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        zzakVar4.zzL(zzlmVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzhVarZzj.zzw()) && zzhbVarZzd.zzj(zzha.ANALYTICS_STORAGE)) {
            zzhVarZzj.zzJ(zzw(zzhbVarZzd));
        }
        zzhVarZzj.zzY(zzqVar.zzb);
        zzhVarZzj.zzH(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzhVarZzj.zzX(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzhVarZzj.zzZ(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzhVarZzj.zzL(zzqVar.zzc);
        }
        zzhVarZzj.zzM(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzhVarZzj.zzK(str);
        }
        zzhVarZzj.zzU(zzqVar.zzf);
        zzhVarZzj.zzae(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzhVarZzj.zzaa(zzqVar.zzg);
        }
        zzhVarZzj.zzI(zzqVar.zzo);
        zzhVarZzj.zzaf(zzqVar.zzr);
        zzhVarZzj.zzV(zzqVar.zzs);
        zzqu.zzc();
        if (zzg().zzs(null, zzeg.zzam) || zzg().zzs(zzqVar.zza, zzeg.zzao)) {
            zzhVarZzj.zzai(zzqVar.zzx);
        }
        zzop.zzc();
        if (zzg().zzs(null, zzeg.zzal)) {
            zzhVarZzj.zzah(zzqVar.zzt);
        } else {
            zzop.zzc();
            if (zzg().zzs(null, zzeg.zzak)) {
                zzhVarZzj.zzah(null);
            }
        }
        zzrd.zzc();
        if (zzg().zzs(null, zzeg.zzaq)) {
            zzhVarZzj.zzak(zzqVar.zzy);
        }
        zzpz.zzc();
        if (zzg().zzs(null, zzeg.zzaE)) {
            zzhVarZzj.zzal(zzqVar.zzz);
        }
        if (zzhVarZzj.zzao()) {
            zzak zzakVar5 = this.zze;
            zzal(zzakVar5);
            zzakVar5.zzD(zzhVarZzj);
        }
        return zzhVarZzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzak zzh() {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        return zzakVar;
    }

    public final zzeo zzi() {
        return this.zzn.zzj();
    }

    public final zzez zzj() {
        zzez zzezVar = this.zzd;
        zzal(zzezVar);
        return zzezVar;
    }

    public final zzfb zzl() {
        zzfb zzfbVar = this.zzf;
        if (zzfbVar != null) {
            return zzfbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfu zzm() {
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        return zzfuVar;
    }

    final zzhb zzq(String str) {
        String string;
        zzhb zzhbVar = zzhb.zza;
        zzaB().zzg();
        zzB();
        zzhb zzhbVar2 = (zzhb) this.zzB.get(str);
        if (zzhbVar2 != null) {
            return zzhbVar2;
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        Preconditions.checkNotNull(str);
        zzakVar.zzg();
        zzakVar.zzW();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzakVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                } else {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    string = "G1";
                }
                zzhb zzhbVarZzc = zzhb.zzc(string, 100);
                zzV(str, zzhbVarZzc);
                return zzhbVarZzc;
            } catch (SQLiteException e) {
                zzakVar.zzt.zzaA().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public final zzip zzr() {
        zzip zzipVar = this.zzj;
        zzal(zzipVar);
        return zzipVar;
    }

    public final zzlj zzu() {
        zzlj zzljVar = this.zzi;
        zzal(zzljVar);
        return zzljVar;
    }

    public final zzlp zzv() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    final String zzw(zzhb zzhbVar) {
        if (!zzhbVar.zzj(zzha.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String zzx(zzq zzqVar) {
        try {
            return (String) zzaB().zzh(new zzla(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaA().zzd().zzc("Failed to get app instance id. appId", zzet.zzn(zzqVar.zza), e);
            return null;
        }
    }

    final void zzz(Runnable runnable) {
        zzaB().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    final void zzH() {
        this.zzs++;
    }

    final void zzM() {
        this.zzr++;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        throw null;
    }

    final zzgd zzp() {
        return this.zzn;
    }

    public final zzkb zzs() {
        return this.zzk;
    }
}
