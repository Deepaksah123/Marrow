package kotlin;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.addOnContextAvailableListener;

/* JADX INFO: loaded from: classes.dex */
public abstract class ensureViewModelStore {
    static addOnContextAvailableListener.read write = new addOnContextAvailableListener.read(new addOnContextAvailableListener.IconCompatParcelizer());
    private static int AudioAttributesCompatParcelizer = -100;
    private static StdKeyDeserializerStringCtorKeyDeserializer AudioAttributesImplApi26Parcelizer = null;
    private static StdKeyDeserializerStringCtorKeyDeserializer MediaBrowserCompatItemReceiver = null;
    private static Boolean AudioAttributesImplApi21Parcelizer = null;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = false;
    private static final setCustomView<WeakReference<ensureViewModelStore>> RemoteActionCompatParcelizer = new setCustomView<>();
    private static final Object read = new Object();
    private static final Object IconCompatParcelizer = new Object();

    public abstract void AudioAttributesCompatParcelizer(Configuration configuration);

    public abstract void AudioAttributesCompatParcelizer(Bundle bundle);

    public abstract void AudioAttributesCompatParcelizer(Toolbar toolbar);

    public abstract boolean AudioAttributesCompatParcelizer(int i);

    public abstract void AudioAttributesImplApi21Parcelizer();

    public Context AudioAttributesImplApi26Parcelizer() {
        return null;
    }

    public int AudioAttributesImplBaseParcelizer() {
        return -100;
    }

    public abstract void IconCompatParcelizer(int i);

    @Deprecated
    public void IconCompatParcelizer(Context context) {
    }

    public abstract void IconCompatParcelizer(View view);

    public abstract ActionBar MediaBrowserCompatCustomActionResultReceiver();

    public abstract MenuInflater MediaBrowserCompatItemReceiver();

    public abstract void MediaBrowserCompatMediaItem();

    public abstract void MediaBrowserCompatSearchResultReceiver();

    public abstract void MediaDescriptionCompat();

    public abstract void MediaMetadataCompat();

    public abstract void RatingCompat();

    public abstract void RemoteActionCompatParcelizer(View view, ViewGroup.LayoutParams layoutParams);

    public void bC_(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void read(int i) {
    }

    public abstract void read(Bundle bundle);

    public abstract void read(CharSequence charSequence);

    public abstract boolean read();

    public abstract <T extends View> T write(int i);

    public abstract void write(Bundle bundle);

    public abstract void write(View view, ViewGroup.LayoutParams layoutParams);

    public static ensureViewModelStore IconCompatParcelizer(Activity activity, accessonBackPresseds1027565324 accessonbackpresseds1027565324) {
        return new getOnBackPressedDispatcherannotations(activity, accessonbackpresseds1027565324);
    }

    public static ensureViewModelStore read(Dialog dialog, accessonBackPresseds1027565324 accessonbackpresseds1027565324) {
        return new getOnBackPressedDispatcherannotations(dialog, accessonbackpresseds1027565324);
    }

    ensureViewModelStore() {
    }

    public Context write(Context context) {
        IconCompatParcelizer(context);
        return context;
    }

    public static void RemoteActionCompatParcelizer(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && AudioAttributesCompatParcelizer != i) {
            AudioAttributesCompatParcelizer = i;
            onCommand();
        }
    }

    public static StdKeyDeserializerStringCtorKeyDeserializer AudioAttributesCompatParcelizer() {
        if (_getToStringResolver.write()) {
            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (objRemoteActionCompatParcelizer != null) {
                return StdKeyDeserializerStringCtorKeyDeserializer.read(RemoteActionCompatParcelizer.write(objRemoteActionCompatParcelizer));
            }
        } else {
            StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer = AudioAttributesImplApi26Parcelizer;
            if (stdKeyDeserializerStringCtorKeyDeserializer != null) {
                return stdKeyDeserializerStringCtorKeyDeserializer;
            }
        }
        return StdKeyDeserializerStringCtorKeyDeserializer.RemoteActionCompatParcelizer();
    }

    public static int write() {
        return AudioAttributesCompatParcelizer;
    }

    static StdKeyDeserializerStringCtorKeyDeserializer IconCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer;
    }

    static Object RemoteActionCompatParcelizer() {
        Context contextAudioAttributesImplApi26Parcelizer;
        Iterator<WeakReference<ensureViewModelStore>> it = RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ensureViewModelStore ensureviewmodelstore = it.next().get();
            if (ensureviewmodelstore != null && (contextAudioAttributesImplApi26Parcelizer = ensureviewmodelstore.AudioAttributesImplApi26Parcelizer()) != null) {
                return contextAudioAttributesImplApi26Parcelizer.getSystemService("locale");
            }
        }
        return null;
    }

    static boolean RemoteActionCompatParcelizer(Context context) {
        if (AudioAttributesImplApi21Parcelizer == null) {
            try {
                ServiceInfo serviceInfoRemoteActionCompatParcelizer = AppLocalesMetadataHolderService.RemoteActionCompatParcelizer(context);
                if (((PackageItemInfo) serviceInfoRemoteActionCompatParcelizer).metaData != null) {
                    AudioAttributesImplApi21Parcelizer = Boolean.valueOf(((PackageItemInfo) serviceInfoRemoteActionCompatParcelizer).metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AudioAttributesImplApi21Parcelizer = Boolean.FALSE;
            }
        }
        return AudioAttributesImplApi21Parcelizer.booleanValue();
    }

    static void read(final Context context) {
        if (RemoteActionCompatParcelizer(context)) {
            if (_getToStringResolver.write()) {
                if (MediaBrowserCompatCustomActionResultReceiver) {
                    return;
                }
                write.execute(new Runnable() { // from class: o.addObserverForBackInvokerlambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        ensureViewModelStore.AudioAttributesCompatParcelizer(context);
                    }
                });
                return;
            }
            synchronized (IconCompatParcelizer) {
                StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer = AudioAttributesImplApi26Parcelizer;
                if (stdKeyDeserializerStringCtorKeyDeserializer == null) {
                    if (MediaBrowserCompatItemReceiver == null) {
                        MediaBrowserCompatItemReceiver = StdKeyDeserializerStringCtorKeyDeserializer.RemoteActionCompatParcelizer(addOnContextAvailableListener.RemoteActionCompatParcelizer(context));
                    }
                    if (MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
                    } else {
                        AudioAttributesImplApi26Parcelizer = MediaBrowserCompatItemReceiver;
                    }
                } else if (!stdKeyDeserializerStringCtorKeyDeserializer.equals(MediaBrowserCompatItemReceiver)) {
                    StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer2 = AudioAttributesImplApi26Parcelizer;
                    MediaBrowserCompatItemReceiver = stdKeyDeserializerStringCtorKeyDeserializer2;
                    addOnContextAvailableListener.RemoteActionCompatParcelizer(context, stdKeyDeserializerStringCtorKeyDeserializer2.read());
                }
            }
        }
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(Context context) {
        addOnContextAvailableListener.read(context);
        MediaBrowserCompatCustomActionResultReceiver = true;
    }

    static void IconCompatParcelizer(ensureViewModelStore ensureviewmodelstore) {
        synchronized (read) {
            AudioAttributesCompatParcelizer(ensureviewmodelstore);
            RemoteActionCompatParcelizer.add(new WeakReference<>(ensureviewmodelstore));
        }
    }

    static void RemoteActionCompatParcelizer(ensureViewModelStore ensureviewmodelstore) {
        synchronized (read) {
            AudioAttributesCompatParcelizer(ensureviewmodelstore);
        }
    }

    private static void AudioAttributesCompatParcelizer(ensureViewModelStore ensureviewmodelstore) {
        synchronized (read) {
            Iterator<WeakReference<ensureViewModelStore>> it = RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                ensureViewModelStore ensureviewmodelstore2 = it.next().get();
                if (ensureviewmodelstore2 == ensureviewmodelstore || ensureviewmodelstore2 == null) {
                    it.remove();
                }
            }
        }
    }

    private static void onCommand() {
        synchronized (read) {
            Iterator<WeakReference<ensureViewModelStore>> it = RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                ensureViewModelStore ensureviewmodelstore = it.next().get();
                if (ensureviewmodelstore != null) {
                    ensureviewmodelstore.read();
                }
            }
        }
    }

    static class write {
        static LocaleList read(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class RemoteActionCompatParcelizer {
        static void RemoteActionCompatParcelizer(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }

        static LocaleList write(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }
}
