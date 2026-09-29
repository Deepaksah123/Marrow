package kotlin;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.amp.CTPushAmpWorker;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractConcatenatedTimeline;
import kotlin._coercedTypeDesc;
import kotlin.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class getContentResumeOffsetUs implements TimelinePeriod {
    private final Context AudioAttributesImplApi21Parcelizer;
    private final getRemovedAdGroupCount AudioAttributesImplApi26Parcelizer;
    private final PlaybackParameters IconCompatParcelizer;
    private final lambdaonAudioCodecError11 MediaBrowserCompatSearchResultReceiver;
    private final lambdaprepare7 read;
    private final CleverTapInstanceConfig write;
    private final ArrayList<getAdsId> RemoteActionCompatParcelizer = new ArrayList<>();
    private final ArrayList<Timeline1> AudioAttributesCompatParcelizer = new ArrayList<>();
    private final ArrayList<getAdsId> MediaBrowserCompatItemReceiver = new ArrayList<>();
    private getAdCountInAdGroup AudioAttributesImplBaseParcelizer = new TimelineExternalSyntheticLambda0();
    private final Object RatingCompat = new Object();
    private final Object MediaBrowserCompatCustomActionResultReceiver = new Object();

    public static getContentResumeOffsetUs read(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdaprepare7 lambdaprepare7Var, lambdaonAudioCodecError11 lambdaonaudiocodecerror11, PlaybackParameters playbackParameters, getUids getuids, getRemovedAdGroupCount getremovedadgroupcount) {
        getContentResumeOffsetUs getcontentresumeoffsetus = new getContentResumeOffsetUs(context, cleverTapInstanceConfig, lambdaprepare7Var, lambdaonaudiocodecerror11, playbackParameters, getremovedadgroupcount);
        getcontentresumeoffsetus.AudioAttributesImplBaseParcelizer();
        getuids.AudioAttributesCompatParcelizer(getcontentresumeoffsetus);
        return getcontentresumeoffsetus;
    }

    private getContentResumeOffsetUs(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdaprepare7 lambdaprepare7Var, lambdaonAudioCodecError11 lambdaonaudiocodecerror11, PlaybackParameters playbackParameters, getRemovedAdGroupCount getremovedadgroupcount) {
        this.AudioAttributesImplApi21Parcelizer = context;
        this.write = cleverTapInstanceConfig;
        this.read = lambdaprepare7Var;
        this.MediaBrowserCompatSearchResultReceiver = lambdaonaudiocodecerror11;
        this.IconCompatParcelizer = playbackParameters;
        this.AudioAttributesImplApi26Parcelizer = getremovedadgroupcount;
        RatingCompat();
    }

    public final void write(Context context, Bundle bundle, int i) {
        if (bundle == null || bundle.get("wzrk_pn") == null) {
            return;
        }
        if (this.write.MediaMetadataCompat()) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Instance is set for Analytics only, cannot create notification");
            return;
        }
        try {
            if (bundle.getString("wzrk_pn_s", "").equalsIgnoreCase("true")) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(bundle);
                return;
            }
            String string = bundle.getString("extras_from");
            if (string == null || !string.equals("PTReceiver")) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
                String strWrite = this.write.write();
                StringBuilder sb = new StringBuilder("Handling notification: ");
                sb.append(bundle);
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
                if (bundle.getString("wzrk_pid") != null && this.read.AudioAttributesCompatParcelizer(context).IconCompatParcelizer(bundle.getString("wzrk_pid"))) {
                    this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Push Notification already rendered, not showing again");
                    return;
                }
                String strAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(bundle);
                if (strAudioAttributesCompatParcelizer == null) {
                    strAudioAttributesCompatParcelizer = "";
                }
                if (strAudioAttributesCompatParcelizer.isEmpty()) {
                    this.write.MediaBrowserCompatItemReceiver().write(this.write.write(), "Push notification message is empty, not rendering");
                    this.read.AudioAttributesCompatParcelizer(context).AudioAttributesCompatParcelizer();
                    String string2 = bundle.getString("pf", "");
                    if (TextUtils.isEmpty(string2)) {
                        return;
                    }
                    AudioAttributesCompatParcelizer(context, Integer.parseInt(string2));
                    return;
                }
            }
            if (this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(bundle, context).isEmpty()) {
                String str = ((PackageItemInfo) context.getApplicationInfo()).name;
            }
            read(context, bundle, i);
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.write.MediaBrowserCompatItemReceiver();
            this.write.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.write();
        }
    }

    private void IconCompatParcelizer(final String str, final getAdsId getadsid) {
        if (TextUtils.isEmpty(str) || getadsid == null) {
            return;
        }
        try {
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.write).IconCompatParcelizer().read("PushProviders#cacheToken", new Callable<Void>() { // from class: o.getContentResumeOffsetUs.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Void call() {
                    if (getContentResumeOffsetUs.this.AudioAttributesCompatParcelizer(str, getadsid)) {
                        return null;
                    }
                    String strRemoteActionCompatParcelizer = getadsid.RemoteActionCompatParcelizer();
                    if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                        return null;
                    }
                    RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(getContentResumeOffsetUs.this.AudioAttributesImplApi21Parcelizer, RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(getContentResumeOffsetUs.this.write, strRemoteActionCompatParcelizer), str);
                    CleverTapInstanceConfig cleverTapInstanceConfig = getContentResumeOffsetUs.this.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getadsid);
                    sb.append("Cached New Token successfully ");
                    sb.append(str);
                    cleverTapInstanceConfig.read("PushProvider", sb.toString());
                    return null;
                }
            });
        } catch (Throwable th) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
            StringBuilder sb = new StringBuilder();
            sb.append(getadsid);
            sb.append("Unable to cache token ");
            sb.append(str);
            cleverTapInstanceConfig.IconCompatParcelizer("PushProvider", sb.toString(), th);
        }
    }

    private void read(String str, getAdsId getadsid) {
        if (TextUtils.isEmpty(str) || getadsid == null) {
            return;
        }
        AudioAttributesImplBaseParcelizer(str, getadsid);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        Iterator<getAdsId> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            read((String) null, z, it.next());
        }
    }

    public final ArrayList<getAdsId> AudioAttributesCompatParcelizer() {
        ArrayList<getAdsId> arrayList = new ArrayList<>();
        Iterator<Timeline1> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPushType());
        }
        return arrayList;
    }

    private String IconCompatParcelizer(getAdsId getadsid) {
        if (getadsid != null) {
            String strRemoteActionCompatParcelizer = getadsid.RemoteActionCompatParcelizer();
            if (!TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                String strIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.write, strRemoteActionCompatParcelizer, null);
                CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
                StringBuilder sb = new StringBuilder();
                sb.append(getadsid);
                sb.append("getting Cached Token - ");
                sb.append(strIconCompatParcelizer);
                cleverTapInstanceConfig.read("PushProvider", sb.toString());
                return strIconCompatParcelizer;
            }
        }
        if (getadsid != null) {
            CleverTapInstanceConfig cleverTapInstanceConfig2 = this.write;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getadsid);
            sb2.append(" Unable to find cached Token for type ");
            cleverTapInstanceConfig2.read("PushProvider", sb2.toString());
        }
        return null;
    }

    private void AudioAttributesImplBaseParcelizer(String str, getAdsId getadsid) {
        write(str, getadsid);
    }

    public final boolean IconCompatParcelizer() {
        Iterator<getAdsId> it = AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            if (IconCompatParcelizer(it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.TimelinePeriod
    public final void RemoteActionCompatParcelizer(String str, getAdsId getadsid) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        read(str, getadsid);
    }

    public final void write() {
        MediaBrowserCompatSearchResultReceiver();
    }

    public final void AudioAttributesCompatParcelizer(Context context, int i) {
        this.write.MediaBrowserCompatItemReceiver().read();
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
        read(context);
        rendererWakeupListenerMediaBrowserCompatItemReceiver.read();
        if (i != read(context)) {
            IconCompatParcelizer(context, i);
            if (!this.write.RatingCompat() || this.write.MediaMetadataCompat()) {
                return;
            }
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.write).AudioAttributesCompatParcelizer("PushProviders").read("createOrResetWorker", new Callable<Void>() { // from class: o.getContentResumeOffsetUs.5
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Void call() {
                    getContentResumeOffsetUs.this.write(true);
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AudioAttributesCompatParcelizer(String str, getAdsId getadsid) {
        boolean z = (TextUtils.isEmpty(str) || getadsid == null || !str.equalsIgnoreCase(IconCompatParcelizer(getadsid))) ? false : true;
        if (getadsid != null) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
            StringBuilder sb = new StringBuilder();
            sb.append(getadsid);
            sb.append("Token Already available value: ");
            sb.append(z);
            cleverTapInstanceConfig.read("PushProvider", sb.toString());
        }
        return z;
    }

    public final void RemoteActionCompatParcelizer(Context context) {
        this.write.write();
        RendererWakeupListener.RatingCompat();
        if (!IconCompatParcelizer()) {
            this.write.write();
            RendererWakeupListener.RatingCompat();
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        if (IconCompatParcelizer(AudioAttributesCompatParcelizer("22:00", simpleDateFormat), AudioAttributesCompatParcelizer("06:00", simpleDateFormat), AudioAttributesCompatParcelizer(sb.toString(), simpleDateFormat))) {
            this.write.write();
            RendererWakeupListener.RatingCompat();
            return;
        }
        long jWrite = this.read.AudioAttributesCompatParcelizer(context).write();
        if (jWrite == 0 || jWrite > System.currentTimeMillis() - 86400000) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bk", 1);
                this.IconCompatParcelizer.write(jSONObject);
                this.write.write();
                RendererWakeupListener.RatingCompat();
            } catch (JSONException unused) {
                RendererWakeupListener.MediaMetadataCompat();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(Context context) {
        int iRemoteActionCompatParcelizer = RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(context, "pfjobid", -1);
        if (iRemoteActionCompatParcelizer != -1) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(iRemoteActionCompatParcelizer);
            RendererCapabilitiesFormatSupport.write(context, "pfjobid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(boolean z) {
        String strWrite = RendererCapabilitiesFormatSupport.write(this.AudioAttributesImplApi21Parcelizer, "pfworkid", "");
        int i = read(this.AudioAttributesImplApi21Parcelizer);
        if (strWrite.equals("") && i <= 0) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Pushamp - There is no running work and nothing to create");
            return;
        }
        if (i <= 0) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Pushamp - Cancelling worker as pingFrequency <=0 ");
            MediaMetadataCompat();
            return;
        }
        try {
            getChildIndexByWindowIndex getchildindexbywindowindexAudioAttributesCompatParcelizer = getChildIndexByWindowIndex.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            if (strWrite.equals("") || z) {
                e eVarAudioAttributesCompatParcelizer = new e.write().IconCompatParcelizer(ia.write).RemoteActionCompatParcelizer(false).RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                AbstractConcatenatedTimeline abstractConcatenatedTimelineWrite = new AbstractConcatenatedTimeline.read(CTPushAmpWorker.class, i, timeUnit, timeUnit).IconCompatParcelizer(eVarAudioAttributesCompatParcelizer).write();
                if (strWrite.equals("")) {
                    strWrite = this.write.write();
                }
                getchildindexbywindowindexAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strWrite, fa.write, abstractConcatenatedTimelineWrite);
                RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, "pfworkid", strWrite);
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
                String strWrite2 = this.write.write();
                StringBuilder sb = new StringBuilder("Pushamp - Finished scheduling periodic work request - ");
                sb.append(strWrite);
                sb.append(" with repeatInterval- ");
                sb.append(i);
                sb.append(" minutes");
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite2, sb.toString());
            }
        } catch (Exception e) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Pushamp - Failed scheduling/cancelling periodic work request".concat(String.valueOf(e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaMetadataCompat() {
        String strWrite = RendererCapabilitiesFormatSupport.write(this.AudioAttributesImplApi21Parcelizer, "pfworkid", "");
        if (strWrite.equals("")) {
            return;
        }
        try {
            getChildIndexByWindowIndex.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer).IconCompatParcelizer(strWrite);
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, "pfworkid", "");
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Pushamp - Successfully cancelled work");
        } catch (Exception unused) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Pushamp - Failure while cancelling work");
        }
    }

    private List<Timeline1> AudioAttributesImplApi21Parcelizer() {
        ArrayList arrayList = new ArrayList();
        Iterator<getAdsId> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            Timeline1 timeline1Write = write(it.next());
            if (timeline1Write != null) {
                arrayList.add(timeline1Write);
            }
        }
        return arrayList;
    }

    private Timeline1 write(getAdsId getadsid) {
        Timeline1 timeline1;
        Exception e;
        String strAudioAttributesCompatParcelizer = getadsid.AudioAttributesCompatParcelizer();
        Timeline1 timeline12 = null;
        try {
            timeline1 = (Timeline1) Class.forName(strAudioAttributesCompatParcelizer).getConstructor(TimelinePeriod.class, Context.class, CleverTapInstanceConfig.class).newInstance(this, this.AudioAttributesImplApi21Parcelizer, this.write);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException unused2) {
        } catch (InstantiationException unused3) {
        } catch (Exception e2) {
            timeline1 = null;
            e = e2;
        }
        try {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
            StringBuilder sb = new StringBuilder("Found provider:");
            sb.append(strAudioAttributesCompatParcelizer);
            cleverTapInstanceConfig.read("PushProvider", sb.toString());
            return timeline1;
        } catch (ClassNotFoundException unused4) {
            timeline12 = timeline1;
            this.write.read("PushProvider", "Unable to create provider ClassNotFoundException".concat(String.valueOf(strAudioAttributesCompatParcelizer)));
            return timeline12;
        } catch (IllegalAccessException unused5) {
            timeline12 = timeline1;
            this.write.read("PushProvider", "Unable to create provider IllegalAccessException".concat(String.valueOf(strAudioAttributesCompatParcelizer)));
            return timeline12;
        } catch (InstantiationException unused6) {
            timeline12 = timeline1;
            this.write.read("PushProvider", "Unable to create provider InstantiationException".concat(String.valueOf(strAudioAttributesCompatParcelizer)));
            return timeline12;
        } catch (Exception e3) {
            e = e3;
            CleverTapInstanceConfig cleverTapInstanceConfig2 = this.write;
            StringBuilder sb2 = new StringBuilder("Unable to create provider ");
            sb2.append(strAudioAttributesCompatParcelizer);
            sb2.append(" Exception:");
            sb2.append(e.getClass().getName());
            cleverTapInstanceConfig2.read("PushProvider", sb2.toString());
            return timeline1;
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        List<Timeline1> listAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer.isEmpty()) {
            this.write.read("PushProvider", "No push providers found!. Make sure to install at least one push provider");
            return;
        }
        for (Timeline1 timeline1 : listAudioAttributesImplApi21Parcelizer) {
            if (!IconCompatParcelizer(timeline1)) {
                CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
                StringBuilder sb = new StringBuilder("Invalid Provider: ");
                sb.append(timeline1.getClass());
                cleverTapInstanceConfig.read("PushProvider", sb.toString());
            } else if (!timeline1.isSupported()) {
                CleverTapInstanceConfig cleverTapInstanceConfig2 = this.write;
                StringBuilder sb2 = new StringBuilder("Unsupported Provider: ");
                sb2.append(timeline1.getClass());
                cleverTapInstanceConfig2.read("PushProvider", sb2.toString());
            } else if (timeline1.isAvailable()) {
                CleverTapInstanceConfig cleverTapInstanceConfig3 = this.write;
                StringBuilder sb3 = new StringBuilder("Available Provider: ");
                sb3.append(timeline1.getClass());
                cleverTapInstanceConfig3.read("PushProvider", sb3.toString());
                this.AudioAttributesCompatParcelizer.add(timeline1);
            } else {
                CleverTapInstanceConfig cleverTapInstanceConfig4 = this.write;
                StringBuilder sb4 = new StringBuilder("Unavailable Provider: ");
                sb4.append(timeline1.getClass());
                cleverTapInstanceConfig4.read("PushProvider", sb4.toString());
            }
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaBrowserCompatItemReceiver.addAll(this.RemoteActionCompatParcelizer);
        Iterator<Timeline1> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            this.MediaBrowserCompatItemReceiver.remove(it.next().getPushType());
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        for (getAdsId getadsid : this.write.AudioAttributesImplApi26Parcelizer()) {
            String str = getadsid.read();
            try {
                Class.forName(str);
                this.RemoteActionCompatParcelizer.add(getadsid);
                CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
                StringBuilder sb = new StringBuilder();
                sb.append("SDK Class Available :");
                sb.append(str);
                cleverTapInstanceConfig.read("PushProvider", sb.toString());
            } catch (Exception e) {
                CleverTapInstanceConfig cleverTapInstanceConfig2 = this.write;
                StringBuilder sb2 = new StringBuilder("SDK class Not available ");
                sb2.append(str);
                sb2.append(" Exception:");
                sb2.append(e.getClass().getName());
                cleverTapInstanceConfig2.read("PushProvider", sb2.toString());
            }
        }
    }

    private static int read(Context context) {
        return RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(context, "pf", PsExtractor.VIDEO_STREAM_MASK);
    }

    private void AudioAttributesImplBaseParcelizer() {
        AudioAttributesImplApi26Parcelizer();
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.write).AudioAttributesCompatParcelizer("PushProviders").read("asyncFindAvailableCTPushProviders", new Callable() { // from class: o.getAdGroupTimeUs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            }
        });
    }

    final /* synthetic */ Void RemoteActionCompatParcelizer() throws Exception {
        MediaBrowserCompatItemReceiver();
        MediaBrowserCompatCustomActionResultReceiver();
        return null;
    }

    private void RatingCompat() {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.write).AudioAttributesCompatParcelizer("PushProviders").read("createOrResetWorker", new Callable<Void>() { // from class: o.getContentResumeOffsetUs.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                getContentResumeOffsetUs.IconCompatParcelizer(getContentResumeOffsetUs.this.AudioAttributesImplApi21Parcelizer);
                if (!getContentResumeOffsetUs.this.write.RatingCompat() || getContentResumeOffsetUs.this.write.MediaMetadataCompat()) {
                    getContentResumeOffsetUs.this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(getContentResumeOffsetUs.this.write.write(), "Pushamp - Cancelling worker as background sync is disabled or config is analytics only");
                    getContentResumeOffsetUs.this.MediaMetadataCompat();
                    return null;
                }
                getContentResumeOffsetUs.this.write(false);
                return null;
            }
        });
    }

    private static boolean IconCompatParcelizer(Date date, Date date2, Date date3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date3);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date2);
        if (date2.compareTo(date) < 0) {
            if (calendar2.compareTo(calendar3) < 0) {
                calendar2.add(5, 1);
            }
            calendar3.add(5, 1);
        }
        return calendar2.compareTo(calendar) >= 0 && calendar2.compareTo(calendar3) < 0;
    }

    private boolean IconCompatParcelizer(Timeline1 timeline1) {
        if (70500 >= timeline1.minSDKSupportVersionCode()) {
            return true;
        }
        this.write.read("PushProvider", "Provider: %s version %s does not match the SDK version %s. Make sure all CleverTap dependencies are the same version.");
        return false;
    }

    private static Date AudioAttributesCompatParcelizer(String str, SimpleDateFormat simpleDateFormat) {
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            return new Date(0L);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void read(String str, boolean z, getAdsId getadsid) {
        if (getadsid != null) {
            if (TextUtils.isEmpty(str)) {
                str = IconCompatParcelizer(getadsid);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (this.RatingCompat) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                String str2 = z ? "register" : "unregister";
                try {
                    jSONObject2.put("action", str2);
                    jSONObject2.put("id", str);
                    jSONObject2.put("type", getadsid.IconCompatParcelizer());
                    jSONObject.put("data", jSONObject2);
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
                    String strWrite = this.write.write();
                    StringBuilder sb = new StringBuilder();
                    sb.append(getadsid);
                    sb.append(str2);
                    sb.append(" device token ");
                    sb.append(str);
                    rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
                    this.IconCompatParcelizer.IconCompatParcelizer(jSONObject);
                } catch (Throwable unused) {
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.write.MediaBrowserCompatItemReceiver();
                    this.write.write();
                    Objects.toString(getadsid);
                    rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer();
                }
            }
        }
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.write).AudioAttributesCompatParcelizer("PushProviders").read("PushProviders#refreshAllTokens", new Callable<Void>() { // from class: o.getContentResumeOffsetUs.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                getContentResumeOffsetUs.this.MediaBrowserCompatMediaItem();
                getContentResumeOffsetUs.this.MediaDescriptionCompat();
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatMediaItem() {
        for (Timeline1 timeline1 : this.AudioAttributesCompatParcelizer) {
            try {
                timeline1.requestToken();
            } catch (Throwable th) {
                this.write.IconCompatParcelizer("PushProvider", "Token Refresh error ".concat(String.valueOf(timeline1)), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaDescriptionCompat() {
        for (getAdsId getadsid : this.MediaBrowserCompatItemReceiver) {
            try {
                read(IconCompatParcelizer(getadsid), true, getadsid);
            } catch (Throwable th) {
                this.write.IconCompatParcelizer("PushProvider", "Token Refresh error ".concat(String.valueOf(getadsid)), th);
            }
        }
    }

    private void write(String str, getAdsId getadsid) {
        read(str, true, getadsid);
        IconCompatParcelizer(str, getadsid);
    }

    private static void IconCompatParcelizer(Context context, int i) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(context, "pf", i);
    }

    public final Object read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(getAdCountInAdGroup getadcountinadgroup) {
        this.AudioAttributesImplBaseParcelizer = getadcountinadgroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [o._coercedTypeDesc$AudioAttributesImplBaseParcelizer] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [o.getAdCountInAdGroup] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r2v26, types: [o.setAvailableCommands] */
    /* JADX WARN: Type inference failed for: r4v5, types: [o._coercedTypeDesc$AudioAttributesImplBaseParcelizer] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void read(Context context, Bundle bundle, int i) {
        int i2;
        String string;
        int iIconCompatParcelizer;
        ?? Equals;
        String strMediaBrowserCompatSearchResultReceiver;
        int iHashCode = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Unable to render notification, Notification Manager is null.");
            return;
        }
        String string2 = bundle.getString("wzrk_cid", "");
        if (string2.isEmpty()) {
            string = bundle.toString();
            i2 = 8;
        } else if (notificationManager.getNotificationChannel(string2) == null) {
            i2 = 9;
            string = string2;
        } else {
            i2 = -1;
            string = null;
        }
        if (i2 != -1) {
            generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(512, i2, string);
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), generatemediaperiodeventtime.RemoteActionCompatParcelizer());
            this.MediaBrowserCompatSearchResultReceiver.read(generatemediaperiodeventtime);
        }
        String strRemoteActionCompatParcelizer = PlayerPlaybackSuppressionReason.RemoteActionCompatParcelizer(notificationManager, string2, context);
        if (strRemoteActionCompatParcelizer == null || strRemoteActionCompatParcelizer.trim().isEmpty()) {
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Not rendering Push since channel id is null or blank.");
            return;
        }
        if (!PlayerPlaybackSuppressionReason.read(context, strRemoteActionCompatParcelizer)) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
            String strWrite = this.write.write();
            StringBuilder sb = new StringBuilder("Not rendering push notification as channel = ");
            sb.append(strRemoteActionCompatParcelizer);
            sb.append(" is blocked by user");
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
            return;
        }
        this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Rendering Push on channel = ".concat(String.valueOf(strRemoteActionCompatParcelizer)));
        try {
            strMediaBrowserCompatSearchResultReceiver = RendererState.IconCompatParcelizer(context).MediaBrowserCompatSearchResultReceiver();
        } catch (Throwable unused) {
            iIconCompatParcelizer = getChildTimelines.IconCompatParcelizer(context);
        }
        if (strMediaBrowserCompatSearchResultReceiver == null) {
            throw new IllegalArgumentException();
        }
        iIconCompatParcelizer = context.getResources().getIdentifier(strMediaBrowserCompatSearchResultReceiver, "drawable", context.getPackageName());
        if (iIconCompatParcelizer == 0) {
            throw new IllegalArgumentException();
        }
        this.AudioAttributesImplBaseParcelizer.write(iIconCompatParcelizer, context);
        String string3 = bundle.getString("pr");
        if (string3 != null) {
            Equals = string3.equals("high");
            if (string3.equals("max")) {
                Equals = 2;
            }
        } else {
            Equals = 0;
        }
        if (iHashCode == -1000) {
            try {
                Object obj = this.AudioAttributesImplBaseParcelizer.read(bundle);
                if (obj != null) {
                    if (obj instanceof Number) {
                        iHashCode = ((Number) obj).intValue();
                    } else if (obj instanceof String) {
                        try {
                            iHashCode = Integer.parseInt(obj.toString());
                            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.write.MediaBrowserCompatItemReceiver();
                            String strWrite2 = this.write.write();
                            StringBuilder sb2 = new StringBuilder("Converting collapse_key: ");
                            sb2.append(obj);
                            sb2.append(" to notificationId int: ");
                            sb2.append(iHashCode);
                            rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strWrite2, sb2.toString());
                        } catch (NumberFormatException unused2) {
                            iHashCode = obj.toString().hashCode();
                            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = this.write.MediaBrowserCompatItemReceiver();
                            String strWrite3 = this.write.write();
                            StringBuilder sb3 = new StringBuilder("Converting collapse_key: ");
                            sb3.append(obj);
                            sb3.append(" to notificationId int: ");
                            sb3.append(iHashCode);
                            rendererWakeupListenerMediaBrowserCompatItemReceiver3.write(strWrite3, sb3.toString());
                        }
                    }
                    iHashCode = Math.abs(iHashCode);
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver4 = this.write.MediaBrowserCompatItemReceiver();
                    String strWrite4 = this.write.write();
                    StringBuilder sb4 = new StringBuilder("Creating the notification id: ");
                    sb4.append(iHashCode);
                    sb4.append(" from collapse_key: ");
                    sb4.append(obj);
                    rendererWakeupListenerMediaBrowserCompatItemReceiver4.IconCompatParcelizer(strWrite4, sb4.toString());
                }
            } catch (NumberFormatException unused3) {
            }
        } else {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver5 = this.write.MediaBrowserCompatItemReceiver();
            String strWrite5 = this.write.write();
            StringBuilder sb5 = new StringBuilder("Have user provided notificationId: ");
            sb5.append(iHashCode);
            sb5.append(" won't use collapse_key (if any) as basis for notificationId");
            rendererWakeupListenerMediaBrowserCompatItemReceiver5.IconCompatParcelizer(strWrite5, sb5.toString());
        }
        if (iHashCode == -1000) {
            iHashCode = (int) (Math.random() * 100.0d);
            this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.write.write(), "Setting random notificationId: ".concat(String.valueOf(iHashCode)));
        }
        int i3 = iHashCode;
        ?? audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context, strRemoteActionCompatParcelizer);
        String string4 = bundle.getString("wzrk_bi", null);
        if (string4 != null) {
            try {
                int i4 = Integer.parseInt(string4);
                if (i4 >= 0) {
                    audioAttributesImplBaseParcelizer.write(i4);
                }
            } catch (Throwable unused4) {
            }
        }
        String string5 = bundle.getString("wzrk_bc", null);
        if (string5 != null) {
            try {
                int i5 = Integer.parseInt(string5);
                if (i5 >= 0) {
                    audioAttributesImplBaseParcelizer.read(i5);
                }
            } catch (Throwable unused5) {
            }
        }
        audioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(Equals);
        getAdCountInAdGroup getadcountinadgroup = this.AudioAttributesImplBaseParcelizer;
        ?? RemoteActionCompatParcelizer = audioAttributesImplBaseParcelizer;
        if (getadcountinadgroup instanceof setAvailableCommands) {
            RemoteActionCompatParcelizer = ((setAvailableCommands) getadcountinadgroup).RemoteActionCompatParcelizer(context, bundle, audioAttributesImplBaseParcelizer, this.write);
        }
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerWrite = this.AudioAttributesImplBaseParcelizer.write(bundle, context, RemoteActionCompatParcelizer, this.write, i3);
        if (audioAttributesImplBaseParcelizerWrite != null) {
            Notification notificationRemoteActionCompatParcelizer = audioAttributesImplBaseParcelizerWrite.RemoteActionCompatParcelizer();
            notificationManager.notify(i3, notificationRemoteActionCompatParcelizer);
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver6 = this.write.MediaBrowserCompatItemReceiver();
            String strWrite6 = this.write.write();
            StringBuilder sb6 = new StringBuilder("Rendered notification: ");
            sb6.append(notificationRemoteActionCompatParcelizer.toString());
            rendererWakeupListenerMediaBrowserCompatItemReceiver6.IconCompatParcelizer(strWrite6, sb6.toString());
            String string6 = bundle.getString("extras_from");
            if (string6 == null || !string6.equals("PTReceiver")) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append((System.currentTimeMillis() + 345600000) / 1000);
                long j = Long.parseLong(bundle.getString("wzrk_ttl", sb7.toString()));
                String string7 = bundle.getString("wzrk_pid");
                lambdasetDeviceMuted29 lambdasetdevicemuted29AudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(context);
                this.write.MediaBrowserCompatItemReceiver().read();
                lambdasetdevicemuted29AudioAttributesCompatParcelizer.write(string7, j);
                if (!"true".equals(bundle.getString("wzrk_rnv", ""))) {
                    generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(512, 10, bundle.toString());
                    this.write.MediaBrowserCompatItemReceiver();
                    generatemediaperiodeventtime2.RemoteActionCompatParcelizer();
                    RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
                    this.MediaBrowserCompatSearchResultReceiver.read(generatemediaperiodeventtime2);
                    return;
                }
                if (bundle.getLong("omr_invoke_time_in_millis", -1L) >= 0) {
                    System.currentTimeMillis();
                    this.write.MediaBrowserCompatItemReceiver().read();
                }
                this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(bundle);
            }
        }
    }
}
