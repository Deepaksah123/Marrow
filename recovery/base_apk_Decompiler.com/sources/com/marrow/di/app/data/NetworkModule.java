package com.marrow.di.app.data;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.marrow.TrainingApplication;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.di.app.data.InterceptorModule;
import java.lang.reflect.Constructor;
import java.util.concurrent.TimeUnit;
import kotlin.AppThemeManager;
import kotlin.DefaultTrackNameProvider;
import kotlin.GTNudgeRequestModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MarrowTheme;
import kotlin.Metadata;
import kotlin.PlanSubscriptionRSModel;
import kotlin.RtspMediaSourceRtspUdpUnsupportedTransportException;
import kotlin.SingleSampleMediaPeriodSampleStreamImpl;
import kotlin.ThemeKtExternalSyntheticLambda3;
import kotlin.generatePayloadFormat;
import kotlin.getFirstAttemptTimeSeconds;
import kotlin.getMagicModuleMeta;
import kotlin.getPlanOldPrice;
import kotlin.getRenewGrpId;
import kotlin.getSampleFormats;
import kotlin.getStarred;
import kotlin.getStreamPositionUsForContent;
import kotlin.onDownstreamFormatChanged;
import kotlin.parseDrmSchemeData;
import kotlin.setGateway;
import kotlin.setSocketFactory;
import kotlin.setTimeoutMs;
import kotlin.setTreatLoadErrorsAsEndOfStream;
import kotlin.setUserAgent;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/di/app/data/NetworkModule;", "", "<init>", "()V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkModule {
    private static ThemeKtExternalSyntheticLambda3 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final SingleSampleMediaPeriodSampleStreamImpl read(@setGateway(IconCompatParcelizer = "firebase_retrofit") GTNudgeRequestModel gTNudgeRequestModel) {
        return INSTANCE.RemoteActionCompatParcelizer(gTNudgeRequestModel);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.NetworkModule$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJA\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\b\u0010\u001fJ\u0017\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010 J\u0019\u0010\b\u001a\u00020!2\b\b\u0001\u0010\u0006\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\b\u0010\"J\u001f\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\b\u0010#J\u0019\u0010\u001b\u001a\u00020$2\b\b\u0001\u0010\u0006\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001b\u0010%J\u0017\u0010\u0018\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020&H\u0007¢\u0006\u0004\b\u0018\u0010'J\u0017\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020(H\u0007¢\u0006\u0004\b\b\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*"}, d2 = {"Lcom/marrow/di/app/data/NetworkModule$write;", "", "<init>", "()V", "", "Lo/MarrowTheme;", "p0", "Lo/ThemeKtExternalSyntheticLambda3;", "read", "([Lo/MarrowTheme;)Lo/ThemeKtExternalSyntheticLambda3;", "Lo/RtspMediaSourceRtspUdpUnsupportedTransportException;", "Lo/setUserAgent;", "p1", "Lo/generatePayloadFormat;", "p2", "Lo/setSocketFactory;", "p3", "Lo/setTimeoutMs;", "p4", "Lo/onDownstreamFormatChanged;", "p5", "IconCompatParcelizer", "(Lo/RtspMediaSourceRtspUdpUnsupportedTransportException;Lo/setUserAgent;Lo/generatePayloadFormat;Lo/setSocketFactory;Lo/setTimeoutMs;Lo/onDownstreamFormatChanged;)Lo/ThemeKtExternalSyntheticLambda3;", "Lo/AppThemeManager;", "AudioAttributesCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda3;)Lo/AppThemeManager;", "Lo/PlanSubscriptionRSModel$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/PlanSubscriptionRSModel$IconCompatParcelizer;", "Lo/getStreamPositionUsForContent;", "Lo/GTNudgeRequestModel;", "(Lo/ThemeKtExternalSyntheticLambda3;Lo/PlanSubscriptionRSModel$IconCompatParcelizer;Lo/getStreamPositionUsForContent;)Lo/GTNudgeRequestModel;", "(Lo/setSocketFactory;)Lo/GTNudgeRequestModel;", "Lo/setTreatLoadErrorsAsEndOfStream;", "(Lo/GTNudgeRequestModel;)Lo/setTreatLoadErrorsAsEndOfStream;", "(Lo/setSocketFactory;Lo/PlanSubscriptionRSModel$IconCompatParcelizer;)Lo/GTNudgeRequestModel;", "Lo/SingleSampleMediaPeriodSampleStreamImpl;", "(Lo/GTNudgeRequestModel;)Lo/SingleSampleMediaPeriodSampleStreamImpl;", "Landroid/content/Context;", "(Landroid/content/Context;)Lo/GTNudgeRequestModel;", "", "(Ljava/lang/String;)Lo/GTNudgeRequestModel;", "Lo/ThemeKtExternalSyntheticLambda3;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static ThemeKtExternalSyntheticLambda3 read(MarrowTheme... p0) {
            if (NetworkModule.RemoteActionCompatParcelizer == null) {
                ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = new ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer().IconCompatParcelizer(60L, TimeUnit.SECONDS).AudioAttributesCompatParcelizer(60L, TimeUnit.SECONDS).RemoteActionCompatParcelizer(60L, TimeUnit.SECONDS);
                for (MarrowTheme marrowTheme : p0) {
                    audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer(marrowTheme);
                }
                NetworkModule.RemoteActionCompatParcelizer = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3 = NetworkModule.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda3);
            return themeKtExternalSyntheticLambda3;
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final ThemeKtExternalSyntheticLambda3 IconCompatParcelizer(RtspMediaSourceRtspUdpUnsupportedTransportException p0, setUserAgent p1, generatePayloadFormat p2, setSocketFactory p3, setTimeoutMs p4, onDownstreamFormatChanged p5) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            if (p5 == null) {
                return read(p0, p1, p2, p3, p4);
            }
            return read(p0, p1, p2, p3, p5, p4);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final AppThemeManager AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda3 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getDispatcher();
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final PlanSubscriptionRSModel.IconCompatParcelizer RemoteActionCompatParcelizer() {
            getStarred getstarredAudioAttributesCompatParcelizer = getStarred.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getstarredAudioAttributesCompatParcelizer, "");
            return getstarredAudioAttributesCompatParcelizer;
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        @setGateway(IconCompatParcelizer = "v3.1")
        public final GTNudgeRequestModel read(ThemeKtExternalSyntheticLambda3 p0, PlanSubscriptionRSModel.IconCompatParcelizer p1, getStreamPositionUsForContent p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            String sessionImpl = p2.setSessionImpl();
            String strR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = p2.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
            GTNudgeRequestModel.write writeVar = new GTNudgeRequestModel.write().read(p0);
            StringBuilder sb = new StringBuilder();
            sb.append(strR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
            sb.append("://");
            sb.append(sessionImpl);
            sb.append("/v3.1/");
            GTNudgeRequestModel gTNudgeRequestModel = writeVar.IconCompatParcelizer(sb.toString()).write(p1).read(getFirstAttemptTimeSeconds.RemoteActionCompatParcelizer()).read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gTNudgeRequestModel, "");
            return gTNudgeRequestModel;
        }

        @getMagicModuleMeta
        @setGateway(IconCompatParcelizer = "CDN")
        public final GTNudgeRequestModel read(setSocketFactory p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            GTNudgeRequestModel gTNudgeRequestModel = new GTNudgeRequestModel.write().IconCompatParcelizer("https://www.marrow.com/api/").read(getFirstAttemptTimeSeconds.RemoteActionCompatParcelizer()).read(new ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer().IconCompatParcelizer(p0).RemoteActionCompatParcelizer()).read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gTNudgeRequestModel, "");
            return gTNudgeRequestModel;
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final setTreatLoadErrorsAsEndOfStream read(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) setTreatLoadErrorsAsEndOfStream.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (setTreatLoadErrorsAsEndOfStream) obj;
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        @setGateway(IconCompatParcelizer = "firebase_retrofit")
        public final GTNudgeRequestModel read(setSocketFactory p0, PlanSubscriptionRSModel.IconCompatParcelizer p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            GTNudgeRequestModel gTNudgeRequestModel = new GTNudgeRequestModel.write().IconCompatParcelizer("https://us-central1-medengageclinical.cloudfunctions.net/").read(getFirstAttemptTimeSeconds.RemoteActionCompatParcelizer()).write(p1).read(new ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer().IconCompatParcelizer(p0).RemoteActionCompatParcelizer()).read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gTNudgeRequestModel, "");
            return gTNudgeRequestModel;
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final SingleSampleMediaPeriodSampleStreamImpl RemoteActionCompatParcelizer(@setGateway(IconCompatParcelizer = "firebase_retrofit") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) SingleSampleMediaPeriodSampleStreamImpl.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (SingleSampleMediaPeriodSampleStreamImpl) obj;
        }

        @getRenewGrpId
        @getMagicModuleMeta
        public final GTNudgeRequestModel AudioAttributesCompatParcelizer(Context p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            TrainingApplication trainingApplicationIconCompatParcelizer = TrainingApplication.IconCompatParcelizer(p0);
            getStreamPositionUsForContent getstreampositionusforcontentIconCompatParcelizer = DefaultTrackNameProvider.IconCompatParcelizer(p0);
            InterceptorModule.Companion companion = InterceptorModule.INSTANCE;
            toMagicModuleMetaRepoModel.write(trainingApplicationIconCompatParcelizer);
            TrainingApplication trainingApplication = trainingApplicationIconCompatParcelizer;
            setUserAgent setuseragentIconCompatParcelizer = InterceptorModule.Companion.IconCompatParcelizer(trainingApplication, getstreampositionusforcontentIconCompatParcelizer);
            generatePayloadFormat generatepayloadformat = new generatePayloadFormat(getstreampositionusforcontentIconCompatParcelizer);
            setSocketFactory setsocketfactoryWrite = new setSocketFactory().write(setSocketFactory.IconCompatParcelizer.NONE);
            RtspMediaSourceRtspUdpUnsupportedTransportException rtspMediaSourceRtspUdpUnsupportedTransportExceptionIconCompatParcelizer = InterceptorModule.INSTANCE.IconCompatParcelizer(getstreampositionusforcontentIconCompatParcelizer);
            TrainingApplication trainingApplication2 = trainingApplicationIconCompatParcelizer;
            TrainingApplication trainingApplication3 = trainingApplicationIconCompatParcelizer;
            getSampleFormats getsampleformatsMediaBrowserCompatSearchResultReceiver = trainingApplicationIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getsampleformatsMediaBrowserCompatSearchResultReceiver, "");
            try {
                Object[] objArr = {trainingApplication2, trainingApplication3, getsampleformatsMediaBrowserCompatSearchResultReceiver};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-814502049);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19367, Color.argb(0, 0, 0, 0) + 18, -1321571382, false, null, new Class[]{Application.class, ApplicationData.class, getSampleFormats.class});
                }
                Object objNewInstance = ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
                FirebaseRemoteConfig firebaseRemoteConfigAudioAttributesCompatParcelizer = FirebaseRemoteConfig.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(firebaseRemoteConfigAudioAttributesCompatParcelizer, "");
                parseDrmSchemeData parsedrmschemedata = new parseDrmSchemeData(firebaseRemoteConfigAudioAttributesCompatParcelizer, getstreampositionusforcontentIconCompatParcelizer);
                Object[] objArr2 = {trainingApplication2, parsedrmschemedata};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1980014144);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 18390), TextUtils.indexOf("", "", 0, 0) + 19883, (KeyEvent.getMaxKeyCode() >> 16) + 29, 139287253, false, null, new Class[]{Application.class, getSampleFormats.class});
                }
                Object objNewInstance2 = ((Constructor) objRemoteActionCompatParcelizer2).newInstance(objArr2);
                InterceptorModule.Companion companion2 = InterceptorModule.INSTANCE;
                setTimeoutMs settimeoutmsWrite$683f0737 = InterceptorModule.Companion.write$683f0737(trainingApplication, objNewInstance, objNewInstance2, parsedrmschemedata);
                toMagicModuleMetaRepoModel.write(setsocketfactoryWrite);
                ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3 = read(rtspMediaSourceRtspUdpUnsupportedTransportExceptionIconCompatParcelizer, setuseragentIconCompatParcelizer, generatepayloadformat, setsocketfactoryWrite, settimeoutmsWrite$683f0737);
                getStarred getstarredAudioAttributesCompatParcelizer = getStarred.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.write(getstarredAudioAttributesCompatParcelizer);
                return read(themeKtExternalSyntheticLambda3, getstarredAudioAttributesCompatParcelizer, getstreampositionusforcontentIconCompatParcelizer);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        @getMagicModuleMeta
        public static GTNudgeRequestModel read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            setSocketFactory setsocketfactoryWrite = new setSocketFactory().write(setSocketFactory.IconCompatParcelizer.NONE);
            ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(setsocketfactoryWrite);
            ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3RemoteActionCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer(setsocketfactoryWrite).RemoteActionCompatParcelizer();
            getStarred getstarredAudioAttributesCompatParcelizer = getStarred.AudioAttributesCompatParcelizer();
            GTNudgeRequestModel.write writeVar = new GTNudgeRequestModel.write().read(themeKtExternalSyntheticLambda3RemoteActionCompatParcelizer);
            writeVar.IconCompatParcelizer(p0);
            GTNudgeRequestModel gTNudgeRequestModel = writeVar.write(getstarredAudioAttributesCompatParcelizer).read(getFirstAttemptTimeSeconds.RemoteActionCompatParcelizer()).read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gTNudgeRequestModel, "");
            return gTNudgeRequestModel;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    @setGateway(IconCompatParcelizer = "firebase_retrofit")
    public static final GTNudgeRequestModel read(setSocketFactory setsocketfactory, PlanSubscriptionRSModel.IconCompatParcelizer iconCompatParcelizer) {
        return INSTANCE.read(setsocketfactory, iconCompatParcelizer);
    }

    @getMagicModuleMeta
    public static final GTNudgeRequestModel write(String str) {
        return Companion.read(str);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final ThemeKtExternalSyntheticLambda3 IconCompatParcelizer(RtspMediaSourceRtspUdpUnsupportedTransportException rtspMediaSourceRtspUdpUnsupportedTransportException, setUserAgent setuseragent, generatePayloadFormat generatepayloadformat, setSocketFactory setsocketfactory, setTimeoutMs settimeoutms, onDownstreamFormatChanged ondownstreamformatchanged) {
        return INSTANCE.IconCompatParcelizer(rtspMediaSourceRtspUdpUnsupportedTransportException, setuseragent, generatepayloadformat, setsocketfactory, settimeoutms, ondownstreamformatchanged);
    }

    @getMagicModuleMeta
    @setGateway(IconCompatParcelizer = "CDN")
    public static final GTNudgeRequestModel RemoteActionCompatParcelizer(setSocketFactory setsocketfactory) {
        return INSTANCE.read(setsocketfactory);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final PlanSubscriptionRSModel.IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return INSTANCE.RemoteActionCompatParcelizer();
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final AppThemeManager RemoteActionCompatParcelizer(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3) {
        return INSTANCE.AudioAttributesCompatParcelizer(themeKtExternalSyntheticLambda3);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    @setGateway(IconCompatParcelizer = "v3.1")
    public static final GTNudgeRequestModel AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3, PlanSubscriptionRSModel.IconCompatParcelizer iconCompatParcelizer, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.read(themeKtExternalSyntheticLambda3, iconCompatParcelizer, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final setTreatLoadErrorsAsEndOfStream AudioAttributesCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel gTNudgeRequestModel) {
        return INSTANCE.read(gTNudgeRequestModel);
    }
}
