package kotlin;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import in.juspay.hyper.constants.LogSubCategory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.C0185kotlinModule;
import kotlin.accessgetNullToEmptyMapp;
import kotlin.accessgetUNIT_TYPEdelegatecp;
import kotlin.getRequiredMarkerFromAccessorLikeMethod;
import kotlin.jacksonObjectMapper;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes4.dex */
public final class ExtensionsKtkotlinModule1 {
    static final boolean IconCompatParcelizer = Log.isLoggable("MediaRouter", 3);
    static RemoteActionCompatParcelizer write;
    final Context AudioAttributesCompatParcelizer;
    final ArrayList<write> RemoteActionCompatParcelizer = new ArrayList<>();

    public static abstract class AudioAttributesCompatParcelizer {
    }

    ExtensionsKtkotlinModule1(Context context) {
        this.AudioAttributesCompatParcelizer = context;
    }

    public static ExtensionsKtkotlinModule1 write(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        write();
        if (write == null) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(context.getApplicationContext());
            write = remoteActionCompatParcelizer;
            remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        return write.IconCompatParcelizer(context);
    }

    public static List<MediaBrowserCompatCustomActionResultReceiver> AudioAttributesCompatParcelizer() {
        write();
        return write.read();
    }

    public static MediaBrowserCompatCustomActionResultReceiver read() {
        write();
        return write.AudioAttributesCompatParcelizer();
    }

    public static void write(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        write();
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverIconCompatParcelizer = write.IconCompatParcelizer();
        if (write.AudioAttributesCompatParcelizer() != mediaBrowserCompatCustomActionResultReceiverIconCompatParcelizer) {
            write.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiverIconCompatParcelizer, i);
        } else {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = write;
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), i);
        }
    }

    public static boolean RemoteActionCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        write();
        return write.RemoteActionCompatParcelizer(c0185kotlinModule, 1);
    }

    public final void RemoteActionCompatParcelizer(C0185kotlinModule c0185kotlinModule, IconCompatParcelizer iconCompatParcelizer) {
        RemoteActionCompatParcelizer(c0185kotlinModule, iconCompatParcelizer, 0);
    }

    public final void RemoteActionCompatParcelizer(C0185kotlinModule c0185kotlinModule, IconCompatParcelizer iconCompatParcelizer, int i) {
        write writeVar;
        boolean z;
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (iconCompatParcelizer == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        write();
        if (IconCompatParcelizer) {
            Objects.toString(c0185kotlinModule);
            Objects.toString(iconCompatParcelizer);
            Integer.toHexString(i);
        }
        int iIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer);
        if (iIconCompatParcelizer < 0) {
            writeVar = new write(this, iconCompatParcelizer);
            this.RemoteActionCompatParcelizer.add(writeVar);
        } else {
            writeVar = this.RemoteActionCompatParcelizer.get(iIconCompatParcelizer);
        }
        if (((~writeVar.AudioAttributesCompatParcelizer) & i) != 0) {
            writeVar.AudioAttributesCompatParcelizer |= i;
            z = true;
        } else {
            z = false;
        }
        if (!writeVar.write.AudioAttributesCompatParcelizer(c0185kotlinModule)) {
            writeVar.write = new C0185kotlinModule.AudioAttributesCompatParcelizer(writeVar.write).RemoteActionCompatParcelizer(c0185kotlinModule).IconCompatParcelizer();
        } else if (!z) {
            return;
        }
        write.AudioAttributesImplApi26Parcelizer();
    }

    public final void read(IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        write();
        if (IconCompatParcelizer) {
            Objects.toString(iconCompatParcelizer);
        }
        int iIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer);
        if (iIconCompatParcelizer >= 0) {
            this.RemoteActionCompatParcelizer.remove(iIconCompatParcelizer);
            write.AudioAttributesImplApi26Parcelizer();
        }
    }

    private int IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (this.RemoteActionCompatParcelizer.get(i).IconCompatParcelizer == iconCompatParcelizer) {
                return i;
            }
        }
        return -1;
    }

    public static MediaSessionCompat.Token RemoteActionCompatParcelizer() {
        return write.write();
    }

    static void write() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static class MediaBrowserCompatCustomActionResultReceiver {
        private boolean AudioAttributesCompatParcelizer;
        private String AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        ConstructorValueCreator IconCompatParcelizer;
        private boolean MediaBrowserCompatItemReceiver;
        private Uri MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private Bundle MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private String RatingCompat;
        boolean RemoteActionCompatParcelizer;
        private final read handleMediaPlayPauseIfPendingOnHandler;
        private IntentSender onAddQueueItem;
        private Display onCommand;
        private int onMediaButtonEvent;
        private int onPause;
        final String read;
        final String write;
        private final ArrayList<IntentFilter> MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
        private int onCustomAction = -1;

        MediaBrowserCompatCustomActionResultReceiver(read readVar, String str, String str2) {
            this.handleMediaPlayPauseIfPendingOnHandler = readVar;
            this.write = str;
            this.read = str2;
        }

        public final read MediaBrowserCompatMediaItem() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return this.read;
        }

        public final String AudioAttributesImplBaseParcelizer() {
            return this.RatingCompat;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final Uri MediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final boolean onMediaButtonEvent() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final int write() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean onFastForward() {
            ExtensionsKtkotlinModule1.write();
            return ExtensionsKtkotlinModule1.write.AudioAttributesCompatParcelizer() == this;
        }

        public final boolean onCustomAction() {
            ExtensionsKtkotlinModule1.write();
            return ExtensionsKtkotlinModule1.write.RemoteActionCompatParcelizer() == this;
        }

        public final boolean IconCompatParcelizer(C0185kotlinModule c0185kotlinModule) {
            if (c0185kotlinModule == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            ExtensionsKtkotlinModule1.write();
            return c0185kotlinModule.write(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        public final boolean read(String str) {
            ExtensionsKtkotlinModule1.write();
            int size = this.MediaBrowserCompatCustomActionResultReceiver.size();
            for (int i = 0; i < size; i++) {
                if (this.MediaBrowserCompatCustomActionResultReceiver.get(i).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public final int MediaMetadataCompat() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return this.MediaMetadataCompat;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final boolean handleMediaPlayPauseIfPendingOnHandler() {
            if (onCustomAction() || this.AudioAttributesImplBaseParcelizer == 3) {
                return true;
            }
            return RemoteActionCompatParcelizer(this) && read("android.media.intent.category.LIVE_AUDIO") && !read("android.media.intent.category.LIVE_VIDEO");
        }

        final boolean onPause() {
            return this.IconCompatParcelizer != null && this.RemoteActionCompatParcelizer;
        }

        private static boolean RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            return TextUtils.equals(mediaBrowserCompatCustomActionResultReceiver.RatingCompat().AudioAttributesImplApi21Parcelizer().write(), LogSubCategory.LifeCycle.ANDROID);
        }

        public final int onAddQueueItem() {
            return this.onMediaButtonEvent;
        }

        public final int MediaDescriptionCompat() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public final int onCommand() {
            return this.onPause;
        }

        public final boolean read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            ExtensionsKtkotlinModule1.write();
            ExtensionsKtkotlinModule1.write.RemoteActionCompatParcelizer(this, Math.min(this.onPause, Math.max(0, i)));
        }

        public final void IconCompatParcelizer(int i) {
            ExtensionsKtkotlinModule1.write();
            if (i != 0) {
                ExtensionsKtkotlinModule1.write.IconCompatParcelizer(this, i);
            }
        }

        public final int MediaBrowserCompatSearchResultReceiver() {
            return this.onCustomAction;
        }

        public final void onPlayFromMediaId() {
            ExtensionsKtkotlinModule1.write();
            ExtensionsKtkotlinModule1.write.IconCompatParcelizer(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
            sb.append(this.read);
            sb.append(", name=");
            sb.append(this.RatingCompat);
            sb.append(", description=");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            sb.append(", iconUri=");
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append(", enabled=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", connecting=");
            sb.append(this.MediaBrowserCompatItemReceiver);
            sb.append(", connectionState=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", canDisconnect=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", playbackType=");
            sb.append(this.MediaBrowserCompatSearchResultReceiver);
            sb.append(", playbackStream=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", deviceType=");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append(", volumeHandling=");
            sb.append(this.onMediaButtonEvent);
            sb.append(", volume=");
            sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            sb.append(", volumeMax=");
            sb.append(this.onPause);
            sb.append(", presentationDisplayId=");
            sb.append(this.onCustomAction);
            sb.append(", extras=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", settingsIntent=");
            sb.append(this.onAddQueueItem);
            sb.append(", providerPackageName=");
            sb.append(this.handleMediaPlayPauseIfPendingOnHandler.read());
            sb.append(" }");
            return sb.toString();
        }

        int IconCompatParcelizer(ConstructorValueCreator constructorValueCreator) {
            if (this.IconCompatParcelizer != constructorValueCreator) {
                return RemoteActionCompatParcelizer(constructorValueCreator);
            }
            return 0;
        }

        final int RemoteActionCompatParcelizer(ConstructorValueCreator constructorValueCreator) {
            this.IconCompatParcelizer = constructorValueCreator;
            int i = 0;
            if (constructorValueCreator == null) {
                return 0;
            }
            int i2 = 1;
            if (!configureFromStringCreator.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) constructorValueCreator.MediaBrowserCompatMediaItem())) {
                this.RatingCompat = constructorValueCreator.MediaBrowserCompatMediaItem();
                i = 1;
            }
            if (!configureFromStringCreator.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) constructorValueCreator.MediaBrowserCompatItemReceiver())) {
                this.AudioAttributesImplApi21Parcelizer = constructorValueCreator.MediaBrowserCompatItemReceiver();
                i = 1;
            }
            if (!configureFromStringCreator.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, constructorValueCreator.AudioAttributesImplApi26Parcelizer())) {
                this.MediaBrowserCompatMediaItem = constructorValueCreator.AudioAttributesImplApi26Parcelizer();
                i = 1;
            }
            if (this.RemoteActionCompatParcelizer != constructorValueCreator.onMediaButtonEvent()) {
                this.RemoteActionCompatParcelizer = constructorValueCreator.onMediaButtonEvent();
                i = 1;
            }
            if (this.MediaBrowserCompatItemReceiver != constructorValueCreator.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.MediaBrowserCompatItemReceiver = constructorValueCreator.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                i = 1;
            }
            if (this.AudioAttributesImplApi26Parcelizer != constructorValueCreator.AudioAttributesCompatParcelizer()) {
                this.AudioAttributesImplApi26Parcelizer = constructorValueCreator.AudioAttributesCompatParcelizer();
                i = 1;
            }
            if (!this.MediaBrowserCompatCustomActionResultReceiver.equals(constructorValueCreator.read())) {
                this.MediaBrowserCompatCustomActionResultReceiver.clear();
                this.MediaBrowserCompatCustomActionResultReceiver.addAll(constructorValueCreator.read());
                i = 1;
            }
            if (this.MediaBrowserCompatSearchResultReceiver != constructorValueCreator.MediaDescriptionCompat()) {
                this.MediaBrowserCompatSearchResultReceiver = constructorValueCreator.MediaDescriptionCompat();
                i = 1;
            }
            if (this.MediaMetadataCompat != constructorValueCreator.RatingCompat()) {
                this.MediaMetadataCompat = constructorValueCreator.RatingCompat();
                i = 1;
            }
            if (this.AudioAttributesImplBaseParcelizer != constructorValueCreator.AudioAttributesImplBaseParcelizer()) {
                this.AudioAttributesImplBaseParcelizer = constructorValueCreator.AudioAttributesImplBaseParcelizer();
            } else {
                i2 = i;
            }
            int i3 = 3;
            if (this.onMediaButtonEvent != constructorValueCreator.onCommand()) {
                this.onMediaButtonEvent = constructorValueCreator.onCommand();
                i2 = 3;
            }
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != constructorValueCreator.handleMediaPlayPauseIfPendingOnHandler()) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constructorValueCreator.handleMediaPlayPauseIfPendingOnHandler();
                i2 = 3;
            }
            if (this.onPause != constructorValueCreator.onCustomAction()) {
                this.onPause = constructorValueCreator.onCustomAction();
            } else {
                i3 = i2;
            }
            if (this.onCustomAction != constructorValueCreator.MediaMetadataCompat()) {
                this.onCustomAction = constructorValueCreator.MediaMetadataCompat();
                this.onCommand = null;
                i3 |= 5;
            }
            if (!configureFromStringCreator.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, constructorValueCreator.MediaBrowserCompatCustomActionResultReceiver())) {
                this.MediaDescriptionCompat = constructorValueCreator.MediaBrowserCompatCustomActionResultReceiver();
                i3 |= 1;
            }
            if (!configureFromStringCreator.RemoteActionCompatParcelizer(this.onAddQueueItem, constructorValueCreator.onAddQueueItem())) {
                this.onAddQueueItem = constructorValueCreator.onAddQueueItem();
                i3 |= 1;
            }
            if (this.AudioAttributesCompatParcelizer == constructorValueCreator.IconCompatParcelizer()) {
                return i3;
            }
            this.AudioAttributesCompatParcelizer = constructorValueCreator.IconCompatParcelizer();
            return i3 | 5;
        }

        final String IconCompatParcelizer() {
            return this.write;
        }

        public final jacksonObjectMapper RatingCompat() {
            return this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer();
        }
    }

    public static class AudioAttributesImplApi21Parcelizer extends MediaBrowserCompatCustomActionResultReceiver {
        private List<MediaBrowserCompatCustomActionResultReceiver> AudioAttributesCompatParcelizer;

        AudioAttributesImplApi21Parcelizer(read readVar, String str, String str2) {
            super(readVar, str, str2);
            this.AudioAttributesCompatParcelizer = new ArrayList();
        }

        public final List<MediaBrowserCompatCustomActionResultReceiver> AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver
        public final String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append('[');
            int size = this.AudioAttributesCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.AudioAttributesCompatParcelizer.get(i));
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // o.ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver
        final int IconCompatParcelizer(ConstructorValueCreator constructorValueCreator) {
            if (this.IconCompatParcelizer != constructorValueCreator) {
                this.IconCompatParcelizer = constructorValueCreator;
                if (constructorValueCreator != null) {
                    List<String> listAudioAttributesImplApi21Parcelizer = constructorValueCreator.AudioAttributesImplApi21Parcelizer();
                    ArrayList arrayList = new ArrayList();
                    if (listAudioAttributesImplApi21Parcelizer == null) {
                        i = 1;
                    } else {
                        i = listAudioAttributesImplApi21Parcelizer.size() != this.AudioAttributesCompatParcelizer.size() ? 1 : 0;
                        Iterator<String> it = listAudioAttributesImplApi21Parcelizer.iterator();
                        while (it.hasNext()) {
                            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer = ExtensionsKtkotlinModule1.write.AudioAttributesCompatParcelizer(ExtensionsKtkotlinModule1.write.read(MediaBrowserCompatMediaItem(), it.next()));
                            if (mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer != null) {
                                arrayList.add(mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer);
                                if (i == 0 && !this.AudioAttributesCompatParcelizer.contains(mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer)) {
                                    i = 1;
                                }
                            }
                        }
                    }
                    if (i != 0) {
                        this.AudioAttributesCompatParcelizer = arrayList;
                    }
                }
            }
            return super.RemoteActionCompatParcelizer(constructorValueCreator) | i;
        }
    }

    public static final class read {
        final List<MediaBrowserCompatCustomActionResultReceiver> AudioAttributesCompatParcelizer = new ArrayList();
        private kotlinModuledefault RemoteActionCompatParcelizer;
        private final jacksonObjectMapper.RemoteActionCompatParcelizer read;
        final jacksonObjectMapper write;

        read(jacksonObjectMapper jacksonobjectmapper) {
            this.write = jacksonobjectmapper;
            this.read = jacksonobjectmapper.AudioAttributesImplApi21Parcelizer();
        }

        public final jacksonObjectMapper AudioAttributesCompatParcelizer() {
            ExtensionsKtkotlinModule1.write();
            return this.write;
        }

        public final String read() {
            return this.read.write();
        }

        public final ComponentName RemoteActionCompatParcelizer() {
            return this.read.RemoteActionCompatParcelizer();
        }

        final boolean AudioAttributesCompatParcelizer(kotlinModuledefault kotlinmoduledefault) {
            if (this.RemoteActionCompatParcelizer == kotlinmoduledefault) {
                return false;
            }
            this.RemoteActionCompatParcelizer = kotlinmoduledefault;
            return true;
        }

        final int read(String str) {
            int size = this.AudioAttributesCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                if (this.AudioAttributesCompatParcelizer.get(i).write.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=");
            sb.append(read());
            sb.append(" }");
            return sb.toString();
        }
    }

    public static abstract class IconCompatParcelizer {
        public void AudioAttributesCompatParcelizer() {
        }

        public void AudioAttributesImplBaseParcelizer() {
        }

        public void IconCompatParcelizer() {
        }

        public void MediaBrowserCompatCustomActionResultReceiver() {
        }

        public void MediaBrowserCompatItemReceiver() {
        }

        public void RemoteActionCompatParcelizer() {
        }

        public void RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        }

        public void read() {
        }

        public void write() {
        }

        public final void AudioAttributesImplApi26Parcelizer() {
            AudioAttributesImplBaseParcelizer();
        }
    }

    static final class write {
        public int AudioAttributesCompatParcelizer;
        public final IconCompatParcelizer IconCompatParcelizer;
        public final ExtensionsKtkotlinModule1 read;
        public C0185kotlinModule write = C0185kotlinModule.read;

        public write(ExtensionsKtkotlinModule1 extensionsKtkotlinModule1, IconCompatParcelizer iconCompatParcelizer) {
            this.read = extensionsKtkotlinModule1;
            this.IconCompatParcelizer = iconCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            return (this.AudioAttributesCompatParcelizer & 2) != 0 || mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.write);
        }
    }

    static final class RemoteActionCompatParcelizer implements getRequiredMarkerFromAccessorLikeMethod.AudioAttributesCompatParcelizer, accessgetNullToEmptyMapp.IconCompatParcelizer {
        private MediaBrowserCompatCustomActionResultReceiver AudioAttributesImplApi21Parcelizer;
        final getRequiredMarkerFromAccessorLikeMethod AudioAttributesImplApi26Parcelizer;
        private C0183jsonMapper AudioAttributesImplBaseParcelizer;
        MediaSessionCompat IconCompatParcelizer;
        private MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatCustomActionResultReceiver;
        private MediaSessionCompat MediaBrowserCompatItemReceiver;
        private final boolean MediaBrowserCompatMediaItem;
        private C0030RemoteActionCompatParcelizer MediaDescriptionCompat;
        private final findValueNullProvider MediaMetadataCompat;
        private MediaBrowserCompatCustomActionResultReceiver onCommand;
        private accessgetNullToEmptyMapp onCustomAction;
        private jacksonObjectMapper.AudioAttributesCompatParcelizer onMediaButtonEvent;
        final Context write;
        final ArrayList<WeakReference<ExtensionsKtkotlinModule1>> read = new ArrayList<>();
        private final ArrayList<MediaBrowserCompatCustomActionResultReceiver> handleMediaPlayPauseIfPendingOnHandler = new ArrayList<>();
        private final Map<StringArrayDeserializer<String, String>, String> onPlayFromMediaId = new HashMap();
        private final ArrayList<read> RatingCompat = new ArrayList<>();
        private final ArrayList<AudioAttributesCompatParcelizer> onAddQueueItem = new ArrayList<>();
        final accessgetUNIT_TYPEdelegatecp.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new accessgetUNIT_TYPEdelegatecp.RemoteActionCompatParcelizer();
        private final read MediaBrowserCompatSearchResultReceiver = new read();
        final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();
        private final Map<String, jacksonObjectMapper.AudioAttributesCompatParcelizer> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new HashMap();
        private MediaSessionCompat.MediaBrowserCompatItemReceiver onPause = new MediaSessionCompat.MediaBrowserCompatItemReceiver() { // from class: o.ExtensionsKtkotlinModule1.RemoteActionCompatParcelizer.5
            @Override // android.support.v4.media.session.MediaSessionCompat.MediaBrowserCompatItemReceiver
            public final void read() {
                MediaSessionCompat mediaSessionCompat = RemoteActionCompatParcelizer.this.IconCompatParcelizer;
            }
        };

        /* JADX INFO: renamed from: o.ExtensionsKtkotlinModule1$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        final class C0030RemoteActionCompatParcelizer {
        }

        public final MediaSessionCompat.Token write() {
            return null;
        }

        RemoteActionCompatParcelizer(Context context) {
            this.write = context;
            this.MediaMetadataCompat = findValueNullProvider.RemoteActionCompatParcelizer(context);
            this.MediaBrowserCompatMediaItem = _neitherNull.RemoteActionCompatParcelizer((ActivityManager) context.getSystemService("activity"));
            this.AudioAttributesImplApi26Parcelizer = getRequiredMarkerFromAccessorLikeMethod.AudioAttributesCompatParcelizer(context, this);
        }

        public final void AudioAttributesImplApi21Parcelizer() {
            read(this.AudioAttributesImplApi26Parcelizer);
            accessgetNullToEmptyMapp accessgetnulltoemptymapp = new accessgetNullToEmptyMapp(this.write, this);
            this.onCustomAction = accessgetnulltoemptymapp;
            accessgetnulltoemptymapp.IconCompatParcelizer();
        }

        public final ExtensionsKtkotlinModule1 IconCompatParcelizer(Context context) {
            int size = this.read.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ExtensionsKtkotlinModule1 extensionsKtkotlinModule1 = this.read.get(size).get();
                    if (extensionsKtkotlinModule1 == null) {
                        this.read.remove(size);
                    } else if (extensionsKtkotlinModule1.AudioAttributesCompatParcelizer == context) {
                        return extensionsKtkotlinModule1;
                    }
                } else {
                    ExtensionsKtkotlinModule1 extensionsKtkotlinModule12 = new ExtensionsKtkotlinModule1(context);
                    this.read.add(new WeakReference<>(extensionsKtkotlinModule12));
                    return extensionsKtkotlinModule12;
                }
            }
        }

        public final void RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i) {
            jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2;
            if (mediaBrowserCompatCustomActionResultReceiver == this.onCommand && (audioAttributesCompatParcelizer2 = this.onMediaButtonEvent) != null) {
                audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(i);
            } else {
                if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty() || (audioAttributesCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(mediaBrowserCompatCustomActionResultReceiver.write)) == null) {
                    return;
                }
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
            }
        }

        public final void IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i) {
            jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            if (mediaBrowserCompatCustomActionResultReceiver != this.onCommand || (audioAttributesCompatParcelizer = this.onMediaButtonEvent) == null) {
                return;
            }
            audioAttributesCompatParcelizer.write(i);
        }

        public final MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer(String str) {
            for (MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver : this.handleMediaPlayPauseIfPendingOnHandler) {
                if (mediaBrowserCompatCustomActionResultReceiver.read.equals(str)) {
                    return mediaBrowserCompatCustomActionResultReceiver;
                }
            }
            return null;
        }

        public final List<MediaBrowserCompatCustomActionResultReceiver> read() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        final MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer() {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
            if (mediaBrowserCompatCustomActionResultReceiver != null) {
                return mediaBrowserCompatCustomActionResultReceiver;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        final MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer() {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.onCommand;
            if (mediaBrowserCompatCustomActionResultReceiver != null) {
                return mediaBrowserCompatCustomActionResultReceiver;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        final void IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, 3);
        }

        final void AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i) {
            if (!this.handleMediaPlayPauseIfPendingOnHandler.contains(mediaBrowserCompatCustomActionResultReceiver)) {
                Objects.toString(mediaBrowserCompatCustomActionResultReceiver);
            } else if (!mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                Objects.toString(mediaBrowserCompatCustomActionResultReceiver);
            } else {
                write(mediaBrowserCompatCustomActionResultReceiver, i);
            }
        }

        public final boolean RemoteActionCompatParcelizer(C0185kotlinModule c0185kotlinModule, int i) {
            if (c0185kotlinModule.write()) {
                return false;
            }
            if (this.MediaBrowserCompatMediaItem) {
                return true;
            }
            int size = this.handleMediaPlayPauseIfPendingOnHandler.size();
            for (int i2 = 0; i2 < size; i2++) {
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.handleMediaPlayPauseIfPendingOnHandler.get(i2);
                if (!mediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler() && mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(c0185kotlinModule)) {
                    return true;
                }
            }
            return false;
        }

        public final void AudioAttributesImplApi26Parcelizer() {
            C0185kotlinModule.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new C0185kotlinModule.AudioAttributesCompatParcelizer();
            int size = this.read.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ExtensionsKtkotlinModule1 extensionsKtkotlinModule1 = this.read.get(size).get();
                if (extensionsKtkotlinModule1 == null) {
                    this.read.remove(size);
                } else {
                    int size2 = extensionsKtkotlinModule1.RemoteActionCompatParcelizer.size();
                    for (int i = 0; i < size2; i++) {
                        write writeVar = extensionsKtkotlinModule1.RemoteActionCompatParcelizer.get(i);
                        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(writeVar.write);
                        if ((writeVar.AudioAttributesCompatParcelizer & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((writeVar.AudioAttributesCompatParcelizer & 4) != 0 && !this.MediaBrowserCompatMediaItem) {
                            z = true;
                        }
                        if ((writeVar.AudioAttributesCompatParcelizer & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            C0185kotlinModule c0185kotlinModuleIconCompatParcelizer = z ? audioAttributesCompatParcelizer.IconCompatParcelizer() : C0185kotlinModule.read;
            C0183jsonMapper c0183jsonMapper = this.AudioAttributesImplBaseParcelizer;
            if (c0183jsonMapper != null && c0183jsonMapper.write().equals(c0185kotlinModuleIconCompatParcelizer) && this.AudioAttributesImplBaseParcelizer.read() == z2) {
                return;
            }
            if (c0185kotlinModuleIconCompatParcelizer.write() && !z2) {
                if (this.AudioAttributesImplBaseParcelizer == null) {
                    return;
                } else {
                    this.AudioAttributesImplBaseParcelizer = null;
                }
            } else {
                this.AudioAttributesImplBaseParcelizer = new C0183jsonMapper(c0185kotlinModuleIconCompatParcelizer, z2);
            }
            if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                Objects.toString(this.AudioAttributesImplBaseParcelizer);
            }
            int size3 = this.RatingCompat.size();
            for (int i2 = 0; i2 < size3; i2++) {
                this.RatingCompat.get(i2).write.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            }
        }

        @Override // o.accessgetNullToEmptyMapp.IconCompatParcelizer
        public final void read(jacksonObjectMapper jacksonobjectmapper) {
            if (AudioAttributesCompatParcelizer(jacksonobjectmapper) < 0) {
                read readVar = new read(jacksonobjectmapper);
                this.RatingCompat.add(readVar);
                if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                    readVar.toString();
                }
                this.RemoteActionCompatParcelizer.read(513, readVar);
                read(readVar, jacksonobjectmapper.IconCompatParcelizer());
                jacksonobjectmapper.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
                jacksonobjectmapper.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            }
        }

        @Override // o.accessgetNullToEmptyMapp.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(jacksonObjectMapper jacksonobjectmapper) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jacksonobjectmapper);
            if (iAudioAttributesCompatParcelizer >= 0) {
                jacksonobjectmapper.AudioAttributesCompatParcelizer((jacksonObjectMapper.write) null);
                jacksonobjectmapper.AudioAttributesCompatParcelizer((C0183jsonMapper) null);
                read readVar = this.RatingCompat.get(iAudioAttributesCompatParcelizer);
                read(readVar, (kotlinModuledefault) null);
                if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                    Objects.toString(readVar);
                }
                this.RemoteActionCompatParcelizer.read(514, readVar);
                this.RatingCompat.remove(iAudioAttributesCompatParcelizer);
            }
        }

        final void RemoteActionCompatParcelizer(jacksonObjectMapper jacksonobjectmapper, kotlinModuledefault kotlinmoduledefault) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jacksonobjectmapper);
            if (iAudioAttributesCompatParcelizer >= 0) {
                read(this.RatingCompat.get(iAudioAttributesCompatParcelizer), kotlinmoduledefault);
            }
        }

        private int AudioAttributesCompatParcelizer(jacksonObjectMapper jacksonobjectmapper) {
            int size = this.RatingCompat.size();
            for (int i = 0; i < size; i++) {
                if (this.RatingCompat.get(i).write == jacksonobjectmapper) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void read(read readVar, kotlinModuledefault kotlinmoduledefault) {
            int i;
            boolean z;
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
            if (readVar.AudioAttributesCompatParcelizer(kotlinmoduledefault)) {
                if (kotlinmoduledefault == null) {
                    i = 0;
                    z = false;
                } else if (kotlinmoduledefault.write()) {
                    List<ConstructorValueCreator> list = kotlinmoduledefault.read();
                    int size = list.size();
                    ArrayList<StringArrayDeserializer> arrayList = new ArrayList();
                    ArrayList<StringArrayDeserializer> arrayList2 = new ArrayList();
                    int i2 = 0;
                    z = false;
                    for (int i3 = 0; i3 < size; i3++) {
                        ConstructorValueCreator constructorValueCreator = list.get(i3);
                        String strMediaBrowserCompatSearchResultReceiver = constructorValueCreator.MediaBrowserCompatSearchResultReceiver();
                        int i4 = readVar.read(strMediaBrowserCompatSearchResultReceiver);
                        boolean z2 = constructorValueCreator.AudioAttributesImplApi21Parcelizer() != null;
                        if (i4 < 0) {
                            String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(readVar, strMediaBrowserCompatSearchResultReceiver);
                            MediaBrowserCompatCustomActionResultReceiver audioAttributesImplApi21Parcelizer = z2 ? new AudioAttributesImplApi21Parcelizer(readVar, strMediaBrowserCompatSearchResultReceiver, strAudioAttributesCompatParcelizer) : new MediaBrowserCompatCustomActionResultReceiver(readVar, strMediaBrowserCompatSearchResultReceiver, strAudioAttributesCompatParcelizer);
                            readVar.AudioAttributesCompatParcelizer.add(i2, audioAttributesImplApi21Parcelizer);
                            this.handleMediaPlayPauseIfPendingOnHandler.add(audioAttributesImplApi21Parcelizer);
                            if (z2) {
                                arrayList.add(new StringArrayDeserializer(audioAttributesImplApi21Parcelizer, constructorValueCreator));
                            } else {
                                audioAttributesImplApi21Parcelizer.IconCompatParcelizer(constructorValueCreator);
                                if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                                    audioAttributesImplApi21Parcelizer.toString();
                                }
                                this.RemoteActionCompatParcelizer.read(257, audioAttributesImplApi21Parcelizer);
                            }
                            i2++;
                        } else if (i4 < i2) {
                            Objects.toString(constructorValueCreator);
                        } else {
                            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2 = readVar.AudioAttributesCompatParcelizer.get(i4);
                            if ((mediaBrowserCompatCustomActionResultReceiver2 instanceof AudioAttributesImplApi21Parcelizer) != z2) {
                                if (z2) {
                                    mediaBrowserCompatCustomActionResultReceiver = new AudioAttributesImplApi21Parcelizer(readVar, strMediaBrowserCompatSearchResultReceiver, mediaBrowserCompatCustomActionResultReceiver2.MediaBrowserCompatCustomActionResultReceiver());
                                } else {
                                    mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(readVar, strMediaBrowserCompatSearchResultReceiver, mediaBrowserCompatCustomActionResultReceiver2.MediaBrowserCompatCustomActionResultReceiver());
                                }
                                mediaBrowserCompatCustomActionResultReceiver2 = mediaBrowserCompatCustomActionResultReceiver;
                                readVar.AudioAttributesCompatParcelizer.set(i4, mediaBrowserCompatCustomActionResultReceiver2);
                            }
                            int i5 = i2 + 1;
                            Collections.swap(readVar.AudioAttributesCompatParcelizer, i4, i2);
                            if (mediaBrowserCompatCustomActionResultReceiver2 instanceof AudioAttributesImplApi21Parcelizer) {
                                arrayList2.add(new StringArrayDeserializer(mediaBrowserCompatCustomActionResultReceiver2, constructorValueCreator));
                            } else if (RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver2, constructorValueCreator) != 0 && mediaBrowserCompatCustomActionResultReceiver2 == this.onCommand) {
                                z = true;
                            }
                            i2 = i5;
                        }
                    }
                    for (StringArrayDeserializer stringArrayDeserializer : arrayList) {
                        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver3 = (MediaBrowserCompatCustomActionResultReceiver) stringArrayDeserializer.RemoteActionCompatParcelizer;
                        mediaBrowserCompatCustomActionResultReceiver3.IconCompatParcelizer((ConstructorValueCreator) stringArrayDeserializer.IconCompatParcelizer);
                        if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                            Objects.toString(mediaBrowserCompatCustomActionResultReceiver3);
                        }
                        this.RemoteActionCompatParcelizer.read(257, mediaBrowserCompatCustomActionResultReceiver3);
                    }
                    for (StringArrayDeserializer stringArrayDeserializer2 : arrayList2) {
                        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver4 = (MediaBrowserCompatCustomActionResultReceiver) stringArrayDeserializer2.RemoteActionCompatParcelizer;
                        if (RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver4, (ConstructorValueCreator) stringArrayDeserializer2.IconCompatParcelizer) != 0 && mediaBrowserCompatCustomActionResultReceiver4 == this.onCommand) {
                            z = true;
                        }
                    }
                    i = i2;
                } else {
                    Objects.toString(kotlinmoduledefault);
                    i = 0;
                    z = false;
                }
                for (int size2 = readVar.AudioAttributesCompatParcelizer.size() - 1; size2 >= i; size2--) {
                    MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver5 = readVar.AudioAttributesCompatParcelizer.get(size2);
                    mediaBrowserCompatCustomActionResultReceiver5.IconCompatParcelizer((ConstructorValueCreator) null);
                    this.handleMediaPlayPauseIfPendingOnHandler.remove(mediaBrowserCompatCustomActionResultReceiver5);
                }
                AudioAttributesCompatParcelizer(z);
                for (int size3 = readVar.AudioAttributesCompatParcelizer.size() - 1; size3 >= i; size3--) {
                    MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverRemove = readVar.AudioAttributesCompatParcelizer.remove(size3);
                    if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                        Objects.toString(mediaBrowserCompatCustomActionResultReceiverRemove);
                    }
                    this.RemoteActionCompatParcelizer.read(BZip2Constants.MAX_ALPHA_SIZE, mediaBrowserCompatCustomActionResultReceiverRemove);
                }
                if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                    Objects.toString(readVar);
                }
                this.RemoteActionCompatParcelizer.read(515, readVar);
            }
        }

        private int RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, ConstructorValueCreator constructorValueCreator) {
            int iIconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(constructorValueCreator);
            if (iIconCompatParcelizer != 0) {
                if ((iIconCompatParcelizer & 1) != 0) {
                    if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                        Objects.toString(mediaBrowserCompatCustomActionResultReceiver);
                    }
                    this.RemoteActionCompatParcelizer.read(259, mediaBrowserCompatCustomActionResultReceiver);
                }
                if ((iIconCompatParcelizer & 2) != 0) {
                    if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                        Objects.toString(mediaBrowserCompatCustomActionResultReceiver);
                    }
                    this.RemoteActionCompatParcelizer.read(260, mediaBrowserCompatCustomActionResultReceiver);
                }
                if ((iIconCompatParcelizer & 4) != 0) {
                    if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                        Objects.toString(mediaBrowserCompatCustomActionResultReceiver);
                    }
                    this.RemoteActionCompatParcelizer.read(261, mediaBrowserCompatCustomActionResultReceiver);
                }
            }
            return iIconCompatParcelizer;
        }

        private String AudioAttributesCompatParcelizer(read readVar, String str) {
            String strFlattenToShortString = readVar.RemoteActionCompatParcelizer().flattenToShortString();
            StringBuilder sb = new StringBuilder();
            sb.append(strFlattenToShortString);
            sb.append(":");
            sb.append(str);
            String string = sb.toString();
            if (read(string) < 0) {
                this.onPlayFromMediaId.put(new StringArrayDeserializer<>(strFlattenToShortString, str), string);
                return string;
            }
            int i = 2;
            while (true) {
                String str2 = String.format(Locale.US, "%s_%d", string, Integer.valueOf(i));
                if (read(str2) < 0) {
                    this.onPlayFromMediaId.put(new StringArrayDeserializer<>(strFlattenToShortString, str), str2);
                    return str2;
                }
                i++;
            }
        }

        private int read(String str) {
            int size = this.handleMediaPlayPauseIfPendingOnHandler.size();
            for (int i = 0; i < size; i++) {
                if (this.handleMediaPlayPauseIfPendingOnHandler.get(i).read.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        final String read(read readVar, String str) {
            return this.onPlayFromMediaId.get(new StringArrayDeserializer(readVar.RemoteActionCompatParcelizer().flattenToShortString(), str));
        }

        final void AudioAttributesCompatParcelizer(boolean z) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
            if (mediaBrowserCompatCustomActionResultReceiver != null && !mediaBrowserCompatCustomActionResultReceiver.onPause()) {
                Objects.toString(this.AudioAttributesImplApi21Parcelizer);
                this.AudioAttributesImplApi21Parcelizer = null;
            }
            if (this.AudioAttributesImplApi21Parcelizer == null && !this.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
                Iterator<MediaBrowserCompatCustomActionResultReceiver> it = this.handleMediaPlayPauseIfPendingOnHandler.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediaBrowserCompatCustomActionResultReceiver next = it.next();
                    if (write(next) && next.onPause()) {
                        this.AudioAttributesImplApi21Parcelizer = next;
                        Objects.toString(this.AudioAttributesImplApi21Parcelizer);
                        break;
                    }
                }
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (mediaBrowserCompatCustomActionResultReceiver2 != null && !mediaBrowserCompatCustomActionResultReceiver2.onPause()) {
                Objects.toString(this.MediaBrowserCompatCustomActionResultReceiver);
                this.MediaBrowserCompatCustomActionResultReceiver = null;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver == null && !this.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
                Iterator<MediaBrowserCompatCustomActionResultReceiver> it2 = this.handleMediaPlayPauseIfPendingOnHandler.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    MediaBrowserCompatCustomActionResultReceiver next2 = it2.next();
                    if (AudioAttributesCompatParcelizer(next2) && next2.onPause()) {
                        this.MediaBrowserCompatCustomActionResultReceiver = next2;
                        Objects.toString(this.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                    }
                }
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver3 = this.onCommand;
            if (mediaBrowserCompatCustomActionResultReceiver3 == null || !mediaBrowserCompatCustomActionResultReceiver3.onPause()) {
                Objects.toString(this.onCommand);
                write(IconCompatParcelizer(), 0);
                return;
            }
            if (z) {
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver4 = this.onCommand;
                if (mediaBrowserCompatCustomActionResultReceiver4 instanceof AudioAttributesImplApi21Parcelizer) {
                    List<MediaBrowserCompatCustomActionResultReceiver> listAudioAttributesCompatParcelizer = ((AudioAttributesImplApi21Parcelizer) mediaBrowserCompatCustomActionResultReceiver4).AudioAttributesCompatParcelizer();
                    HashSet hashSet = new HashSet();
                    Iterator<MediaBrowserCompatCustomActionResultReceiver> it3 = listAudioAttributesCompatParcelizer.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(it3.next().write);
                    }
                    Iterator<Map.Entry<String, jacksonObjectMapper.AudioAttributesCompatParcelizer>> it4 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry<String, jacksonObjectMapper.AudioAttributesCompatParcelizer> next3 = it4.next();
                        if (!hashSet.contains(next3.getKey())) {
                            jacksonObjectMapper.AudioAttributesCompatParcelizer value = next3.getValue();
                            value.IconCompatParcelizer();
                            value.write();
                            it4.remove();
                        }
                    }
                    for (MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver5 : listAudioAttributesCompatParcelizer) {
                        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.containsKey(mediaBrowserCompatCustomActionResultReceiver5.write)) {
                            jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver5.RatingCompat().IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver5.write, this.onCommand.write);
                            audioAttributesCompatParcelizerIconCompatParcelizer.read();
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.put(mediaBrowserCompatCustomActionResultReceiver5.write, audioAttributesCompatParcelizerIconCompatParcelizer);
                        }
                    }
                }
                AudioAttributesImplBaseParcelizer();
            }
        }

        final MediaBrowserCompatCustomActionResultReceiver IconCompatParcelizer() {
            for (MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver : this.handleMediaPlayPauseIfPendingOnHandler) {
                if (mediaBrowserCompatCustomActionResultReceiver != this.AudioAttributesImplApi21Parcelizer && AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver) && mediaBrowserCompatCustomActionResultReceiver.onPause()) {
                    return mediaBrowserCompatCustomActionResultReceiver;
                }
            }
            return this.AudioAttributesImplApi21Parcelizer;
        }

        private boolean AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            return mediaBrowserCompatCustomActionResultReceiver.RatingCompat() == this.AudioAttributesImplApi26Parcelizer && mediaBrowserCompatCustomActionResultReceiver.read("android.media.intent.category.LIVE_AUDIO") && !mediaBrowserCompatCustomActionResultReceiver.read("android.media.intent.category.LIVE_VIDEO");
        }

        private boolean write(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            return mediaBrowserCompatCustomActionResultReceiver.RatingCompat() == this.AudioAttributesImplApi26Parcelizer && mediaBrowserCompatCustomActionResultReceiver.write.equals("DEFAULT_ROUTE");
        }

        private void write(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i) {
            if (ExtensionsKtkotlinModule1.write == null || (this.MediaBrowserCompatCustomActionResultReceiver != null && mediaBrowserCompatCustomActionResultReceiver.onCustomAction())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 3; i2 < stackTrace.length; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (ExtensionsKtkotlinModule1.write == null) {
                    this.write.getPackageName();
                    sb.toString();
                } else {
                    this.write.getPackageName();
                    sb.toString();
                }
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2 = this.onCommand;
            if (mediaBrowserCompatCustomActionResultReceiver2 != mediaBrowserCompatCustomActionResultReceiver) {
                if (mediaBrowserCompatCustomActionResultReceiver2 != null) {
                    if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                        Objects.toString(this.onCommand);
                    }
                    this.RemoteActionCompatParcelizer.read(this.onCommand, i);
                    jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onMediaButtonEvent;
                    if (audioAttributesCompatParcelizer != null) {
                        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
                        this.onMediaButtonEvent.write();
                        this.onMediaButtonEvent = null;
                    }
                    if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty()) {
                        for (jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 : this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.values()) {
                            audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer(i);
                            audioAttributesCompatParcelizer2.write();
                        }
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.clear();
                    }
                }
                this.onCommand = mediaBrowserCompatCustomActionResultReceiver;
                jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = mediaBrowserCompatCustomActionResultReceiver.RatingCompat().read(mediaBrowserCompatCustomActionResultReceiver.write);
                this.onMediaButtonEvent = audioAttributesCompatParcelizer3;
                if (audioAttributesCompatParcelizer3 != null) {
                    audioAttributesCompatParcelizer3.read();
                }
                if (ExtensionsKtkotlinModule1.IconCompatParcelizer) {
                    Objects.toString(this.onCommand);
                }
                this.RemoteActionCompatParcelizer.read(262, this.onCommand);
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver3 = this.onCommand;
                if (mediaBrowserCompatCustomActionResultReceiver3 instanceof AudioAttributesImplApi21Parcelizer) {
                    List<MediaBrowserCompatCustomActionResultReceiver> listAudioAttributesCompatParcelizer = ((AudioAttributesImplApi21Parcelizer) mediaBrowserCompatCustomActionResultReceiver3).AudioAttributesCompatParcelizer();
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.clear();
                    for (MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver4 : listAudioAttributesCompatParcelizer) {
                        jacksonObjectMapper.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver4.RatingCompat().IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver4.write, this.onCommand.write);
                        audioAttributesCompatParcelizerIconCompatParcelizer.read();
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.put(mediaBrowserCompatCustomActionResultReceiver4.write, audioAttributesCompatParcelizerIconCompatParcelizer);
                    }
                }
                AudioAttributesImplBaseParcelizer();
            }
        }

        @Override // o.getRequiredMarkerFromAccessorLikeMethod.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(String str) {
            read readVar;
            int i;
            this.RemoteActionCompatParcelizer.removeMessages(262);
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            if (iAudioAttributesCompatParcelizer < 0 || (i = (readVar = this.RatingCompat.get(iAudioAttributesCompatParcelizer)).read(str)) < 0) {
                return;
            }
            readVar.AudioAttributesCompatParcelizer.get(i).onPlayFromMediaId();
        }

        private void AudioAttributesImplBaseParcelizer() {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.onCommand;
            if (mediaBrowserCompatCustomActionResultReceiver != null) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat();
                this.AudioAttributesCompatParcelizer.write = this.onCommand.onCommand();
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer = this.onCommand.onAddQueueItem();
                this.AudioAttributesCompatParcelizer.read = this.onCommand.AudioAttributesImplApi21Parcelizer();
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = this.onCommand.MediaMetadataCompat();
                int size = this.onAddQueueItem.size();
                for (int i = 0; i < size; i++) {
                    this.onAddQueueItem.get(i).RemoteActionCompatParcelizer();
                }
            }
        }

        final class read extends jacksonObjectMapper.write {
            read() {
            }

            @Override // o.jacksonObjectMapper.write
            public final void read(jacksonObjectMapper jacksonobjectmapper, kotlinModuledefault kotlinmoduledefault) {
                RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer(jacksonobjectmapper, kotlinmoduledefault);
            }
        }

        final class AudioAttributesCompatParcelizer {
            final /* synthetic */ RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
            private final accessgetUNIT_TYPEdelegatecp write;

            public final void RemoteActionCompatParcelizer() {
                this.write.write(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
            }
        }

        final class IconCompatParcelizer extends Handler {
            private final ArrayList<write> RemoteActionCompatParcelizer = new ArrayList<>();

            IconCompatParcelizer() {
            }

            public final void read(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public final void read(Object obj, int i) {
                Message messageObtainMessage = obtainMessage(TarConstants.VERSION_OFFSET, obj);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.sendToTarget();
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && RemoteActionCompatParcelizer.this.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver().equals(((MediaBrowserCompatCustomActionResultReceiver) obj).MediaBrowserCompatCustomActionResultReceiver())) {
                    RemoteActionCompatParcelizer.this.AudioAttributesCompatParcelizer(true);
                }
                IconCompatParcelizer(i, obj);
                try {
                    int size = RemoteActionCompatParcelizer.this.read.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ExtensionsKtkotlinModule1 extensionsKtkotlinModule1 = RemoteActionCompatParcelizer.this.read.get(size).get();
                        if (extensionsKtkotlinModule1 == null) {
                            RemoteActionCompatParcelizer.this.read.remove(size);
                        } else {
                            this.RemoteActionCompatParcelizer.addAll(extensionsKtkotlinModule1.RemoteActionCompatParcelizer);
                        }
                    }
                    int size2 = this.RemoteActionCompatParcelizer.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(i3), i, obj);
                    }
                } finally {
                    this.RemoteActionCompatParcelizer.clear();
                }
            }

            private void IconCompatParcelizer(int i, Object obj) {
                if (i != 262) {
                    switch (i) {
                        case 257:
                            RemoteActionCompatParcelizer.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer((MediaBrowserCompatCustomActionResultReceiver) obj);
                            break;
                        case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                            RemoteActionCompatParcelizer.this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer((MediaBrowserCompatCustomActionResultReceiver) obj);
                            break;
                        case 259:
                            RemoteActionCompatParcelizer.this.AudioAttributesImplApi26Parcelizer.write((MediaBrowserCompatCustomActionResultReceiver) obj);
                            break;
                    }
                    return;
                }
                RemoteActionCompatParcelizer.this.AudioAttributesImplApi26Parcelizer.read((MediaBrowserCompatCustomActionResultReceiver) obj);
            }

            private static void IconCompatParcelizer(write writeVar, int i, Object obj) {
                ExtensionsKtkotlinModule1 extensionsKtkotlinModule1 = writeVar.read;
                IconCompatParcelizer iconCompatParcelizer = writeVar.IconCompatParcelizer;
                int i2 = 65280 & i;
                if (i2 != 256) {
                    if (i2 == 512) {
                        switch (i) {
                            case 513:
                                iconCompatParcelizer.IconCompatParcelizer();
                                break;
                            case 514:
                                iconCompatParcelizer.write();
                                break;
                            case 515:
                                iconCompatParcelizer.RemoteActionCompatParcelizer();
                                break;
                        }
                    }
                    return;
                }
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) obj;
                if (writeVar.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver)) {
                    switch (i) {
                        case 257:
                            iconCompatParcelizer.read();
                            break;
                        case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                            iconCompatParcelizer.MediaBrowserCompatItemReceiver();
                            break;
                        case 259:
                            iconCompatParcelizer.AudioAttributesCompatParcelizer();
                            break;
                        case 260:
                            iconCompatParcelizer.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
                            break;
                        case 262:
                            iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                            break;
                        case TarConstants.VERSION_OFFSET /* 263 */:
                            iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                            break;
                    }
                }
            }
        }
    }
}
