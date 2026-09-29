package kotlin;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseByte {
    private static int IconCompatParcelizer;
    private int read;
    private int write;
    private ArrayList<JdkDeserializers> AudioAttributesImplBaseParcelizer = new ArrayList<>();
    private boolean RemoteActionCompatParcelizer = false;
    private ArrayList<write> AudioAttributesImplApi21Parcelizer = null;
    private int AudioAttributesCompatParcelizer = -1;

    public _parseByte(int i) {
        int i2 = IconCompatParcelizer;
        IconCompatParcelizer = i2 + 1;
        this.read = i2;
        this.write = i;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int write() {
        return this.read;
    }

    public final boolean IconCompatParcelizer(JdkDeserializers jdkDeserializers) {
        if (this.AudioAttributesImplBaseParcelizer.contains(jdkDeserializers)) {
            return false;
        }
        this.AudioAttributesImplBaseParcelizer.add(jdkDeserializers);
        return true;
    }

    private String RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return "Both";
        }
        return "Unknown";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoteActionCompatParcelizer());
        sb.append(" [");
        sb.append(this.read);
        sb.append("] <");
        String string = sb.toString();
        for (JdkDeserializers jdkDeserializers : this.AudioAttributesImplBaseParcelizer) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            sb2.append(jdkDeserializers.MediaBrowserCompatSearchResultReceiver());
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(" >");
        return sb3.toString();
    }

    public final void RemoteActionCompatParcelizer(int i, _parseByte _parsebyte) {
        for (JdkDeserializers jdkDeserializers : this.AudioAttributesImplBaseParcelizer) {
            _parsebyte.IconCompatParcelizer(jdkDeserializers);
            if (i == 0) {
                jdkDeserializers.write = _parsebyte.write();
            } else {
                jdkDeserializers.onSkipToNext = _parsebyte.write();
            }
        }
        this.AudioAttributesCompatParcelizer = _parsebyte.read;
    }

    public final int write(_getToStringLookup _gettostringlookup, int i) {
        if (this.AudioAttributesImplBaseParcelizer.size() == 0) {
            return 0;
        }
        return write(_gettostringlookup, this.AudioAttributesImplBaseParcelizer, i);
    }

    private int write(_getToStringLookup _gettostringlookup, ArrayList<JdkDeserializers> arrayList, int i) {
        int iAudioAttributesCompatParcelizer;
        int iAudioAttributesCompatParcelizer2;
        _long _longVar = (_long) arrayList.get(0).onPrepareFromMediaId();
        _gettostringlookup.IconCompatParcelizer();
        _longVar.IconCompatParcelizer(_gettostringlookup, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).IconCompatParcelizer(_gettostringlookup, false);
        }
        if (i == 0 && _longVar.onSkipToQueueItem > 0) {
            creatorProp.IconCompatParcelizer(_longVar, _gettostringlookup, arrayList, 0);
        }
        if (i == 1 && _longVar.ParcelableVolumeInfo > 0) {
            creatorProp.IconCompatParcelizer(_longVar, _gettostringlookup, arrayList, 1);
        }
        try {
            _gettostringlookup.AudioAttributesCompatParcelizer();
        } catch (Exception e) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append("\n");
            sb.append(Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            printStream.println(sb.toString());
        }
        this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.AudioAttributesImplApi21Parcelizer.add(new write(arrayList.get(i3), i));
        }
        if (i == 0) {
            iAudioAttributesCompatParcelizer = _getToStringLookup.AudioAttributesCompatParcelizer(_longVar.MediaMetadataCompat);
            iAudioAttributesCompatParcelizer2 = _getToStringLookup.AudioAttributesCompatParcelizer(_longVar.onPrepareFromMediaId);
            _gettostringlookup.IconCompatParcelizer();
        } else {
            iAudioAttributesCompatParcelizer = _getToStringLookup.AudioAttributesCompatParcelizer(_longVar.onSeekTo);
            iAudioAttributesCompatParcelizer2 = _getToStringLookup.AudioAttributesCompatParcelizer(_longVar.AudioAttributesImplApi26Parcelizer);
            _gettostringlookup.IconCompatParcelizer();
        }
        return iAudioAttributesCompatParcelizer2 - iAudioAttributesCompatParcelizer;
    }

    public final void read() {
        this.write = 2;
    }

    public final void write(ArrayList<_parseByte> arrayList) {
        int size = this.AudioAttributesImplBaseParcelizer.size();
        if (this.AudioAttributesCompatParcelizer != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                _parseByte _parsebyte = arrayList.get(i);
                if (this.AudioAttributesCompatParcelizer == _parsebyte.read) {
                    RemoteActionCompatParcelizer(this.write, _parsebyte);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    static class write {
        private int AudioAttributesCompatParcelizer;
        private WeakReference<JdkDeserializers> AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int RemoteActionCompatParcelizer;
        private int read;
        private int write;

        write(JdkDeserializers jdkDeserializers, int i) {
            this.AudioAttributesImplBaseParcelizer = new WeakReference<>(jdkDeserializers);
            this.write = _getToStringLookup.AudioAttributesCompatParcelizer(jdkDeserializers.MediaMetadataCompat);
            this.MediaBrowserCompatCustomActionResultReceiver = _getToStringLookup.AudioAttributesCompatParcelizer(jdkDeserializers.onSeekTo);
            this.read = _getToStringLookup.AudioAttributesCompatParcelizer(jdkDeserializers.onPrepareFromMediaId);
            this.RemoteActionCompatParcelizer = _getToStringLookup.AudioAttributesCompatParcelizer(jdkDeserializers.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesCompatParcelizer = _getToStringLookup.AudioAttributesCompatParcelizer(jdkDeserializers.read);
            this.IconCompatParcelizer = i;
        }
    }
}
