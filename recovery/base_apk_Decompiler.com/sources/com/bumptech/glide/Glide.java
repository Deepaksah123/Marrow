package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.ForwardingPlayer;
import kotlin.MediaSourceInfoHolder;
import kotlin.MediaSourceList;
import kotlin.access3900;
import kotlin.canKeepMediaPeriodHolder;
import kotlin.getFirstMediaPeriodInfo;
import kotlin.getFirstMediaPeriodInfoOfNextPeriod;
import kotlin.getKeySetId;
import kotlin.getMinStartPositionAfterAdGroupUs;
import kotlin.getPlayingPeriod;
import kotlin.getRendererOffset;
import kotlin.getUpdatedMediaPeriodInfo;
import kotlin.moveMediaSource;
import kotlin.moveMediaSourceRange;
import kotlin.setDrmSessionForClearPeriods;
import kotlin.setPeakBitrate;
import kotlin.setPixelWidthHeightRatio;
import kotlin.setRotationDegrees;
import kotlin.setSampleMimeType;
import kotlin.setSelectionFlags;
import kotlin.setStereoMode;
import kotlin.setSubtitleConfigurations;
import kotlin.setTileCountHorizontal;

/* JADX INFO: loaded from: classes2.dex */
public class Glide implements ComponentCallbacks2 {
    private static volatile Glide IconCompatParcelizer;
    private static volatile boolean RemoteActionCompatParcelizer;
    private final access3900 AudioAttributesCompatParcelizer;
    private final setDrmSessionForClearPeriods AudioAttributesImplApi26Parcelizer;
    private final setRotationDegrees AudioAttributesImplBaseParcelizer;
    private final getKeySetId MediaBrowserCompatCustomActionResultReceiver;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
    private final canKeepMediaPeriodHolder MediaDescriptionCompat;
    private final setSubtitleConfigurations read;
    private final getRendererOffset write;
    private final List<ForwardingPlayer> AudioAttributesImplApi21Parcelizer = new ArrayList();
    private setSampleMimeType MediaBrowserCompatMediaItem = setSampleMimeType.NORMAL;

    public interface AudioAttributesCompatParcelizer {
        getPlayingPeriod RemoteActionCompatParcelizer();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public static Glide read(Context context) {
        if (IconCompatParcelizer == null) {
            GeneratedAppGlideModule generatedAppGlideModuleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context.getApplicationContext());
            synchronized (Glide.class) {
                if (IconCompatParcelizer == null) {
                    write(context, generatedAppGlideModuleRemoteActionCompatParcelizer);
                }
            }
        }
        return IconCompatParcelizer;
    }

    private static void write(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (RemoteActionCompatParcelizer) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        RemoteActionCompatParcelizer = true;
        try {
            IconCompatParcelizer(context, generatedAppGlideModule);
        } finally {
            RemoteActionCompatParcelizer = false;
        }
    }

    private static void IconCompatParcelizer(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        IconCompatParcelizer(context, new setPixelWidthHeightRatio(), generatedAppGlideModule);
    }

    private static void IconCompatParcelizer(Context context, setPixelWidthHeightRatio setpixelwidthheightratio, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<getFirstMediaPeriodInfoOfNextPeriod> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.RemoteActionCompatParcelizer()) {
            listEmptyList = new getMinStartPositionAfterAdGroupUs(applicationContext).RemoteActionCompatParcelizer();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.IconCompatParcelizer().isEmpty()) {
            Set<Class<?>> setIconCompatParcelizer = generatedAppGlideModule.IconCompatParcelizer();
            Iterator<getFirstMediaPeriodInfoOfNextPeriod> it = listEmptyList.iterator();
            while (it.hasNext()) {
                getFirstMediaPeriodInfoOfNextPeriod next = it.next();
                if (setIconCompatParcelizer.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Objects.toString(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<getFirstMediaPeriodInfoOfNextPeriod> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Objects.toString(it2.next().getClass());
            }
        }
        setpixelwidthheightratio.RemoteActionCompatParcelizer(generatedAppGlideModule != null ? generatedAppGlideModule.AudioAttributesCompatParcelizer() : null);
        for (getFirstMediaPeriodInfoOfNextPeriod getfirstmediaperiodinfoofnextperiod : listEmptyList) {
        }
        Glide glideRemoteActionCompatParcelizer = setpixelwidthheightratio.RemoteActionCompatParcelizer(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(glideRemoteActionCompatParcelizer);
        IconCompatParcelizer = glideRemoteActionCompatParcelizer;
    }

    private static GeneratedAppGlideModule RemoteActionCompatParcelizer(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            IconCompatParcelizer(e);
            return null;
        } catch (InstantiationException e2) {
            IconCompatParcelizer(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            IconCompatParcelizer(e3);
            return null;
        } catch (InvocationTargetException e4) {
            IconCompatParcelizer(e4);
            return null;
        }
    }

    private static void IconCompatParcelizer(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public Glide(Context context, setDrmSessionForClearPeriods setdrmsessionforclearperiods, getKeySetId getkeysetid, access3900 access3900Var, setSubtitleConfigurations setsubtitleconfigurations, canKeepMediaPeriodHolder cankeepmediaperiodholder, getRendererOffset getrendereroffset, int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Map<Class<?>, setTileCountHorizontal<?, ?>> map, List<getUpdatedMediaPeriodInfo<Object>> list, List<getFirstMediaPeriodInfoOfNextPeriod> list2, getFirstMediaPeriodInfo getfirstmediaperiodinfo, setPeakBitrate setpeakbitrate) {
        this.AudioAttributesImplApi26Parcelizer = setdrmsessionforclearperiods;
        this.AudioAttributesCompatParcelizer = access3900Var;
        this.read = setsubtitleconfigurations;
        this.MediaBrowserCompatCustomActionResultReceiver = getkeysetid;
        this.MediaDescriptionCompat = cankeepmediaperiodholder;
        this.write = getrendereroffset;
        this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = new setRotationDegrees(context, setsubtitleconfigurations, setStereoMode.IconCompatParcelizer(this, list2, getfirstmediaperiodinfo), new MediaSourceList(), audioAttributesCompatParcelizer, map, list, setdrmsessionforclearperiods, setpeakbitrate, i);
    }

    public final access3900 read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setSubtitleConfigurations write() {
        return this.read;
    }

    public final Context AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.getBaseContext();
    }

    public final getRendererOffset RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final setRotationDegrees IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        moveMediaSourceRange.write();
        this.MediaBrowserCompatCustomActionResultReceiver.write();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        this.read.write();
    }

    private void write(int i) {
        moveMediaSourceRange.write();
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            Iterator<ForwardingPlayer> it = this.AudioAttributesImplApi21Parcelizer.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i);
            }
        }
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(i);
        this.AudioAttributesCompatParcelizer.read(i);
        this.read.write(i);
    }

    private canKeepMediaPeriodHolder AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    private static canKeepMediaPeriodHolder AudioAttributesCompatParcelizer(Context context) {
        moveMediaSource.IconCompatParcelizer(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return read(context).AudioAttributesImplApi21Parcelizer();
    }

    public static ForwardingPlayer write(Context context) {
        return AudioAttributesCompatParcelizer(context).RemoteActionCompatParcelizer(context);
    }

    public static ForwardingPlayer write(View view) {
        return AudioAttributesCompatParcelizer(view.getContext()).RemoteActionCompatParcelizer(view);
    }

    public final setSelectionFlags AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    public final boolean AudioAttributesCompatParcelizer(MediaSourceInfoHolder<?> mediaSourceInfoHolder) {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            Iterator<ForwardingPlayer> it = this.AudioAttributesImplApi21Parcelizer.iterator();
            while (it.hasNext()) {
                if (it.next().RemoteActionCompatParcelizer(mediaSourceInfoHolder)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void IconCompatParcelizer(ForwardingPlayer forwardingPlayer) {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            if (this.AudioAttributesImplApi21Parcelizer.contains(forwardingPlayer)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.AudioAttributesImplApi21Parcelizer.add(forwardingPlayer);
        }
    }

    public final void RemoteActionCompatParcelizer(ForwardingPlayer forwardingPlayer) {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            if (!this.AudioAttributesImplApi21Parcelizer.contains(forwardingPlayer)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.AudioAttributesImplApi21Parcelizer.remove(forwardingPlayer);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        write(i);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        MediaBrowserCompatCustomActionResultReceiver();
    }
}
