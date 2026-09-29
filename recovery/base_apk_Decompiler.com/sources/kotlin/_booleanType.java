package kotlin;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class _booleanType {
    private static volatile _booleanType IconCompatParcelizer;
    private volatile int AudioAttributesImplApi21Parcelizer;
    private final Set<IconCompatParcelizer> AudioAttributesImplApi26Parcelizer;
    private final Handler AudioAttributesImplBaseParcelizer;
    private final ReadWriteLock MediaBrowserCompatCustomActionResultReceiver;
    private final write read;
    final boolean write;
    private static final Object RemoteActionCompatParcelizer = new Object();
    private static final Object AudioAttributesCompatParcelizer = new Object();

    public static abstract class IconCompatParcelizer {
        public void RemoteActionCompatParcelizer(Throwable th) {
        }

        public void read() {
        }
    }

    static class write {
        int AudioAttributesCompatParcelizer(CharSequence charSequence, int i) {
            return -1;
        }

        int RemoteActionCompatParcelizer(CharSequence charSequence, int i) {
            return -1;
        }

        CharSequence read(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        void write(EditorInfo editorInfo) {
        }
    }

    public static boolean read() {
        return IconCompatParcelizer != null;
    }

    public static _booleanType AudioAttributesCompatParcelizer() {
        _booleanType _booleantype;
        synchronized (RemoteActionCompatParcelizer) {
            _booleantype = IconCompatParcelizer;
            StringCollectionDeserializer.IconCompatParcelizer(_booleantype != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return _booleantype;
    }

    public void read(IconCompatParcelizer iconCompatParcelizer) {
        StringCollectionDeserializer.write(iconCompatParcelizer, "initCallback cannot be null");
        this.MediaBrowserCompatCustomActionResultReceiver.writeLock().lock();
        try {
            if (this.AudioAttributesImplApi21Parcelizer == 1 || this.AudioAttributesImplApi21Parcelizer == 2) {
                this.AudioAttributesImplBaseParcelizer.post(new read(iconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer));
            } else {
                this.AudioAttributesImplApi26Parcelizer.add(iconCompatParcelizer);
            }
        } finally {
            this.MediaBrowserCompatCustomActionResultReceiver.writeLock().unlock();
        }
    }

    public void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        StringCollectionDeserializer.write(iconCompatParcelizer, "initCallback cannot be null");
        this.MediaBrowserCompatCustomActionResultReceiver.writeLock().lock();
        try {
            this.AudioAttributesImplApi26Parcelizer.remove(iconCompatParcelizer);
        } finally {
            this.MediaBrowserCompatCustomActionResultReceiver.writeLock().unlock();
        }
    }

    public int IconCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.readLock().lock();
        try {
            return this.AudioAttributesImplApi21Parcelizer;
        } finally {
            this.MediaBrowserCompatCustomActionResultReceiver.readLock().unlock();
        }
    }

    private boolean RemoteActionCompatParcelizer() {
        return IconCompatParcelizer() == 1;
    }

    public int IconCompatParcelizer(CharSequence charSequence, int i) {
        StringCollectionDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer(), "Not initialized yet");
        StringCollectionDeserializer.write(charSequence, "charSequence cannot be null");
        return this.read.AudioAttributesCompatParcelizer(charSequence, i);
    }

    public int AudioAttributesCompatParcelizer(CharSequence charSequence, int i) {
        StringCollectionDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer(), "Not initialized yet");
        StringCollectionDeserializer.write(charSequence, "charSequence cannot be null");
        return this.read.RemoteActionCompatParcelizer(charSequence, i);
    }

    public static boolean RemoteActionCompatParcelizer(Editable editable, int i, KeyEvent keyEvent) {
        return DefaultAccessorNamingStrategy.read(editable, i, keyEvent);
    }

    public static boolean read(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return DefaultAccessorNamingStrategy.RemoteActionCompatParcelizer(inputConnection, editable, i, i2, z);
    }

    public CharSequence write(CharSequence charSequence) {
        return IconCompatParcelizer(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence IconCompatParcelizer(CharSequence charSequence, int i, int i2) {
        return write(charSequence, i, i2, Integer.MAX_VALUE);
    }

    public CharSequence write(CharSequence charSequence, int i, int i2, int i3) {
        return AudioAttributesCompatParcelizer(charSequence, i, i2, i3, 0);
    }

    public CharSequence AudioAttributesCompatParcelizer(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        StringCollectionDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer(), "Not initialized yet");
        StringCollectionDeserializer.RemoteActionCompatParcelizer(i, "start cannot be negative");
        StringCollectionDeserializer.RemoteActionCompatParcelizer(i2, "end cannot be negative");
        StringCollectionDeserializer.RemoteActionCompatParcelizer(i3, "maxEmojiCount cannot be negative");
        StringCollectionDeserializer.read(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        StringCollectionDeserializer.read(i <= charSequence.length(), "start should be < than charSequence length");
        StringCollectionDeserializer.read(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.write : false;
        } else {
            z = true;
        }
        return this.read.read(charSequence, i, i2, i3, z);
    }

    public void read(EditorInfo editorInfo) {
        if (!RemoteActionCompatParcelizer() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.read.write(editorInfo);
    }

    static class read implements Runnable {
        private final int IconCompatParcelizer;
        private final Throwable RemoteActionCompatParcelizer;
        private final List<IconCompatParcelizer> read;

        read(IconCompatParcelizer iconCompatParcelizer, int i) {
            this(Arrays.asList((IconCompatParcelizer) StringCollectionDeserializer.write(iconCompatParcelizer, "initCallback cannot be null")), i, null);
        }

        read(Collection<IconCompatParcelizer> collection, int i, Throwable th) {
            StringCollectionDeserializer.write(collection, "initCallbacks cannot be null");
            this.read = new ArrayList(collection);
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.read.size();
            int i = 0;
            if (this.IconCompatParcelizer != 1) {
                while (i < size) {
                    this.read.get(i).RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                    i++;
                }
            } else {
                while (i < size) {
                    this.read.get(i).read();
                    i++;
                }
            }
        }
    }
}
