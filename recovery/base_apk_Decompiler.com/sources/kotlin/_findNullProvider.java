package kotlin;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class _findNullProvider {
    private final int AudioAttributesCompatParcelizer;
    private final CharSequence AudioAttributesImplApi21Parcelizer;
    private final Bundle IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final CharSequence[] RemoteActionCompatParcelizer;
    private final boolean read;
    private final Set<String> write;

    _findNullProvider(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.AudioAttributesImplApi21Parcelizer = charSequence;
        this.RemoteActionCompatParcelizer = charSequenceArr;
        this.read = z;
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = bundle;
        this.write = set;
        if (read() == 2 && !write()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final CharSequence MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final CharSequence[] RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Set<String> IconCompatParcelizer() {
        return this.write;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        if (write()) {
            return false;
        }
        return ((RemoteActionCompatParcelizer() != null && RemoteActionCompatParcelizer().length != 0) || IconCompatParcelizer() == null || IconCompatParcelizer().isEmpty()) ? false : true;
    }

    public final boolean write() {
        return this.read;
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Bundle AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static final class read {
        private CharSequence AudioAttributesImplBaseParcelizer;
        private final String MediaBrowserCompatCustomActionResultReceiver;
        private CharSequence[] read;
        private final Set<String> RemoteActionCompatParcelizer = new HashSet();
        private final Bundle IconCompatParcelizer = new Bundle();
        private boolean write = true;
        private int AudioAttributesCompatParcelizer = 0;

        public read(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.MediaBrowserCompatCustomActionResultReceiver = str;
        }

        public final read AudioAttributesCompatParcelizer(CharSequence charSequence) {
            this.AudioAttributesImplBaseParcelizer = charSequence;
            return this;
        }

        public final read read(CharSequence[] charSequenceArr) {
            this.read = charSequenceArr;
            return this;
        }

        public final read read(String str) {
            this.RemoteActionCompatParcelizer.add(str);
            return this;
        }

        public final read IconCompatParcelizer(boolean z) {
            this.write = z;
            return this;
        }

        public final read write(int i) {
            this.AudioAttributesCompatParcelizer = i;
            return this;
        }

        public final read RemoteActionCompatParcelizer(Bundle bundle) {
            if (bundle != null) {
                this.IconCompatParcelizer.putAll(bundle);
            }
            return this;
        }

        public final _findNullProvider AudioAttributesCompatParcelizer() {
            return new _findNullProvider(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.read, this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
        }
    }

    public static Bundle IconCompatParcelizer(Intent intent) {
        return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(intent);
    }

    static RemoteInput[] read(_findNullProvider[] _findnullproviderArr) {
        if (_findnullproviderArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[_findnullproviderArr.length];
        for (int i = 0; i < _findnullproviderArr.length; i++) {
            remoteInputArr[i] = RemoteActionCompatParcelizer(_findnullproviderArr[i]);
        }
        return remoteInputArr;
    }

    private static RemoteInput RemoteActionCompatParcelizer(_findNullProvider _findnullprovider) {
        return RemoteActionCompatParcelizer.read(_findnullprovider);
    }

    static _findNullProvider RemoteActionCompatParcelizer(RemoteInput remoteInput) {
        return RemoteActionCompatParcelizer.IconCompatParcelizer(remoteInput);
    }

    static class AudioAttributesCompatParcelizer {
        static Set<String> write(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static RemoteInput.Builder RemoteActionCompatParcelizer(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    static class RemoteActionCompatParcelizer {
        static Bundle RemoteActionCompatParcelizer(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }

        static _findNullProvider IconCompatParcelizer(Object obj) {
            RemoteInput remoteInput = (RemoteInput) obj;
            read readVarRemoteActionCompatParcelizer = new read(remoteInput.getResultKey()).AudioAttributesCompatParcelizer(remoteInput.getLabel()).read(remoteInput.getChoices()).IconCompatParcelizer(remoteInput.getAllowFreeFormInput()).RemoteActionCompatParcelizer(remoteInput.getExtras());
            Set<String> setWrite = AudioAttributesCompatParcelizer.write(remoteInput);
            if (setWrite != null) {
                Iterator<String> it = setWrite.iterator();
                while (it.hasNext()) {
                    readVarRemoteActionCompatParcelizer.read(it.next());
                }
            }
            readVarRemoteActionCompatParcelizer.write(IconCompatParcelizer.IconCompatParcelizer(remoteInput));
            return readVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        public static RemoteInput read(_findNullProvider _findnullprovider) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(_findnullprovider.AudioAttributesImplBaseParcelizer()).setLabel(_findnullprovider.MediaBrowserCompatItemReceiver()).setChoices(_findnullprovider.RemoteActionCompatParcelizer()).setAllowFreeFormInput(_findnullprovider.write()).addExtras(_findnullprovider.AudioAttributesCompatParcelizer());
            Set<String> setIconCompatParcelizer = _findnullprovider.IconCompatParcelizer();
            if (setIconCompatParcelizer != null) {
                Iterator<String> it = setIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(builderAddExtras, it.next(), true);
                }
            }
            IconCompatParcelizer.write(builderAddExtras, _findnullprovider.read());
            return builderAddExtras.build();
        }
    }

    static class IconCompatParcelizer {
        static int IconCompatParcelizer(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder write(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }
}
