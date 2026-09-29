package kotlin;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin._fromClass;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes2.dex */
public final class _fromVariable {
    private static final parseSchiFromParent RemoteActionCompatParcelizer = parseSchiFromParent.write(",");
    private final read AudioAttributesCompatParcelizer;
    private final RemoteActionCompatParcelizer IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final write read;
    private final IconCompatParcelizer write;

    /* synthetic */ _fromVariable(write writeVar, IconCompatParcelizer iconCompatParcelizer, read readVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, byte b) {
        this(writeVar, iconCompatParcelizer, readVar, remoteActionCompatParcelizer, i);
    }

    public static final class AudioAttributesCompatParcelizer {
        private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile(".*-.*");
        private String AudioAttributesImplApi21Parcelizer;
        private String AudioAttributesImplApi26Parcelizer;
        private final boolean AudioAttributesImplBaseParcelizer;
        private final boolean IconCompatParcelizer;
        private String MediaBrowserCompatCustomActionResultReceiver;
        private final boolean MediaBrowserCompatItemReceiver;
        private final _verifyAndResolvePlaceholders MediaBrowserCompatMediaItem;
        private final float MediaBrowserCompatSearchResultReceiver;
        private final String MediaMetadataCompat;
        private final long RemoteActionCompatParcelizer;
        private long read;
        private final _fromClass write;

        public AudioAttributesCompatParcelizer(_fromClass _fromclass, _verifyAndResolvePlaceholders _verifyandresolveplaceholders, long j, float f, String str, boolean z, boolean z2, boolean z3) {
            buildTypeSerializer.IconCompatParcelizer(j >= 0);
            buildTypeSerializer.IconCompatParcelizer(f == -3.4028235E38f || f > BitmapDescriptorFactory.HUE_RED);
            this.write = _fromclass;
            this.MediaBrowserCompatMediaItem = _verifyandresolveplaceholders;
            this.RemoteActionCompatParcelizer = j;
            this.MediaBrowserCompatSearchResultReceiver = f;
            this.MediaMetadataCompat = str;
            this.MediaBrowserCompatItemReceiver = z;
            this.IconCompatParcelizer = z2;
            this.AudioAttributesImplBaseParcelizer = z3;
            this.read = C.TIME_UNSET;
        }

        public static String read(_verifyAndResolvePlaceholders _verifyandresolveplaceholders) {
            buildTypeSerializer.IconCompatParcelizer(_verifyandresolveplaceholders != null);
            int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(_verifyandresolveplaceholders.MediaBrowserCompatItemReceiver().onPlayFromUri);
            if (iIconCompatParcelizer == -1) {
                iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(_verifyandresolveplaceholders.MediaBrowserCompatItemReceiver().AudioAttributesImplApi21Parcelizer);
            }
            if (iIconCompatParcelizer == 1) {
                return CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY;
            }
            if (iIconCompatParcelizer == 2) {
                return "v";
            }
            return null;
        }

        public final AudioAttributesCompatParcelizer read(long j) {
            buildTypeSerializer.IconCompatParcelizer(j >= 0);
            this.read = j;
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            return this;
        }

        public final AudioAttributesCompatParcelizer read(String str) {
            this.AudioAttributesImplApi26Parcelizer = str;
            return this;
        }

        public final AudioAttributesCompatParcelizer write(String str) {
            this.AudioAttributesImplApi21Parcelizer = str;
            return this;
        }

        public final _fromVariable IconCompatParcelizer() {
            onContainerAtomRead<String, String> oncontaineratomreadAudioAttributesCompatParcelizer = this.write.write.AudioAttributesCompatParcelizer();
            getCurrentSampleFlags<String> it = oncontaineratomreadAudioAttributesCompatParcelizer.onCommand().iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(oncontaineratomreadAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(it.next()));
            }
            int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver().read, 1000);
            write.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new write.RemoteActionCompatParcelizer();
            if (!RemoteActionCompatParcelizer()) {
                if (this.write.RemoteActionCompatParcelizer()) {
                    remoteActionCompatParcelizer.write(iRemoteActionCompatParcelizer);
                }
                if (this.write.onCommand()) {
                    setName setnameAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer();
                    int iMax = this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver().read;
                    for (int i = 0; i < setnameAudioAttributesImplBaseParcelizer.write; i++) {
                        iMax = Math.max(iMax, setnameAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(i).read);
                    }
                    remoteActionCompatParcelizer.read(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(iMax, 1000));
                }
                if (this.write.AudioAttributesImplApi21Parcelizer()) {
                    remoteActionCompatParcelizer.IconCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.read));
                }
            }
            if (this.write.MediaBrowserCompatSearchResultReceiver()) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if (oncontaineratomreadAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(CmcdConfiguration.KEY_CMCD_OBJECT)) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(oncontaineratomreadAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(CmcdConfiguration.KEY_CMCD_OBJECT));
            }
            IconCompatParcelizer.read readVar = new IconCompatParcelizer.read();
            if (!RemoteActionCompatParcelizer() && this.write.write()) {
                readVar.write(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer));
            }
            if (this.write.MediaBrowserCompatCustomActionResultReceiver() && this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer() != -2147483647L) {
                readVar.RemoteActionCompatParcelizer(LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer(), 1000L));
            }
            if (this.write.IconCompatParcelizer()) {
                readVar.AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer((long) (this.RemoteActionCompatParcelizer / this.MediaBrowserCompatSearchResultReceiver)));
            }
            if (this.write.MediaMetadataCompat()) {
                readVar.AudioAttributesCompatParcelizer(this.IconCompatParcelizer || this.AudioAttributesImplBaseParcelizer);
            }
            if (this.write.AudioAttributesImplBaseParcelizer()) {
                readVar.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            }
            if (this.write.AudioAttributesImplApi26Parcelizer()) {
                readVar.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            }
            if (oncontaineratomreadAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(CmcdConfiguration.KEY_CMCD_REQUEST)) {
                readVar.write(oncontaineratomreadAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(CmcdConfiguration.KEY_CMCD_REQUEST));
            }
            read.C0056read c0056read = new read.C0056read();
            if (this.write.read()) {
                c0056read.read(this.write.read);
            }
            if (this.write.MediaBrowserCompatMediaItem()) {
                c0056read.write(this.write.AudioAttributesCompatParcelizer);
            }
            if (this.write.handleMediaPlayPauseIfPendingOnHandler()) {
                c0056read.IconCompatParcelizer(this.MediaMetadataCompat);
            }
            if (this.write.MediaDescriptionCompat()) {
                c0056read.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver ? CmcdHeadersFactory.STREAM_TYPE_LIVE : "v");
            }
            if (this.write.RatingCompat()) {
                c0056read.write(this.MediaBrowserCompatSearchResultReceiver);
            }
            if (oncontaineratomreadAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(CmcdConfiguration.KEY_CMCD_SESSION)) {
                c0056read.read(oncontaineratomreadAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(CmcdConfiguration.KEY_CMCD_SESSION));
            }
            RemoteActionCompatParcelizer.write writeVar = new RemoteActionCompatParcelizer.write();
            if (this.write.MediaBrowserCompatItemReceiver()) {
                _fromClass.write writeVar2 = this.write.write;
                writeVar.IconCompatParcelizer(C.RATE_UNSET_INT);
            }
            if (this.write.AudioAttributesCompatParcelizer()) {
                writeVar.write(this.IconCompatParcelizer);
            }
            if (oncontaineratomreadAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(CmcdConfiguration.KEY_CMCD_STATUS)) {
                writeVar.read(oncontaineratomreadAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(CmcdConfiguration.KEY_CMCD_STATUS));
            }
            return new _fromVariable(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), readVar.write(), c0056read.IconCompatParcelizer(), writeVar.IconCompatParcelizer(), this.write.IconCompatParcelizer, (byte) 0);
        }

        private boolean RemoteActionCompatParcelizer() {
            String str = this.MediaBrowserCompatCustomActionResultReceiver;
            return str != null && str.equals(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT);
        }

        private static void RemoteActionCompatParcelizer(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                buildTypeSerializer.write(AudioAttributesCompatParcelizer.matcher(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(it.next(), "=")[0]).matches());
            }
        }
    }

    private _fromVariable(write writeVar, IconCompatParcelizer iconCompatParcelizer, read readVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        this.read = writeVar;
        this.write = iconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = readVar;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    public final SubTypeValidator read(SubTypeValidator subTypeValidator) {
        AtomParsersStszSampleSizeBox<String, String> atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AtomParsersStszSampleSizeBox.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.read.AudioAttributesCompatParcelizer(atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.write.AudioAttributesCompatParcelizer(atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.AudioAttributesCompatParcelizer.write(atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.IconCompatParcelizer.read(atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (this.MediaBrowserCompatCustomActionResultReceiver == 0) {
            onMoovContainerAtomRead.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = onMoovContainerAtomRead.read();
            for (String str : atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCommand()) {
                List listWrite = atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(str);
                Collections.sort(listWrite);
                audioAttributesCompatParcelizer.read(str, RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(listWrite));
            }
            return subTypeValidator.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = atomParsersStszSampleSizeBoxMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer().values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) it.next());
        }
        Collections.sort(arrayList);
        return subTypeValidator.read().IconCompatParcelizer(subTypeValidator.AudioAttributesImplBaseParcelizer.buildUpon().appendQueryParameter("CMCD", RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(arrayList)).build()).write();
    }

    static final class write {
        public final int AudioAttributesCompatParcelizer;
        public final long IconCompatParcelizer;
        public final String RemoteActionCompatParcelizer;
        public final int read;
        public final initExtraTracks<String> write;

        /* synthetic */ write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        public static final class RemoteActionCompatParcelizer {
            private String IconCompatParcelizer;
            private int AudioAttributesCompatParcelizer = C.RATE_UNSET_INT;
            private int write = C.RATE_UNSET_INT;
            private long read = C.TIME_UNSET;
            private initExtraTracks<String> RemoteActionCompatParcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();

            public final RemoteActionCompatParcelizer write(int i) {
                buildTypeSerializer.IconCompatParcelizer(i >= 0 || i == -2147483647);
                this.AudioAttributesCompatParcelizer = i;
                return this;
            }

            public final RemoteActionCompatParcelizer read(int i) {
                buildTypeSerializer.IconCompatParcelizer(i >= 0 || i == -2147483647);
                this.write = i;
                return this;
            }

            public final RemoteActionCompatParcelizer IconCompatParcelizer(long j) {
                buildTypeSerializer.IconCompatParcelizer(j >= 0 || j == C.TIME_UNSET);
                this.read = j;
                return this;
            }

            public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
                this.IconCompatParcelizer = str;
                return this;
            }

            public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(List<String> list) {
                this.RemoteActionCompatParcelizer = initExtraTracks.write(list);
                return this;
            }

            public final write AudioAttributesCompatParcelizer() {
                return new write(this, (byte) 0);
            }
        }

        private write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            this.read = remoteActionCompatParcelizer.write;
            this.IconCompatParcelizer = remoteActionCompatParcelizer.read;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer;
            this.write = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(AtomParsersStszSampleSizeBox<String, String> atomParsersStszSampleSizeBox) {
            ArrayList arrayList = new ArrayList();
            if (this.AudioAttributesCompatParcelizer != -2147483647) {
                StringBuilder sb = new StringBuilder("br=");
                sb.append(this.AudioAttributesCompatParcelizer);
                arrayList.add(sb.toString());
            }
            if (this.read != -2147483647) {
                StringBuilder sb2 = new StringBuilder("tb=");
                sb2.append(this.read);
                arrayList.add(sb2.toString());
            }
            if (this.IconCompatParcelizer != C.TIME_UNSET) {
                StringBuilder sb3 = new StringBuilder("d=");
                sb3.append(this.IconCompatParcelizer);
                arrayList.add(sb3.toString());
            }
            if (!TextUtils.isEmpty(this.RemoteActionCompatParcelizer)) {
                StringBuilder sb4 = new StringBuilder("ot=");
                sb4.append(this.RemoteActionCompatParcelizer);
                arrayList.add(sb4.toString());
            }
            arrayList.addAll(this.write);
            if (arrayList.isEmpty()) {
                return;
            }
            atomParsersStszSampleSizeBox.read((Object) CmcdConfiguration.KEY_CMCD_OBJECT, (Iterable) arrayList);
        }
    }

    static final class IconCompatParcelizer {
        public final initExtraTracks<String> AudioAttributesCompatParcelizer;
        public final boolean AudioAttributesImplBaseParcelizer;
        public final long IconCompatParcelizer;
        public final String MediaBrowserCompatCustomActionResultReceiver;
        public final long RemoteActionCompatParcelizer;
        public final String read;
        public final long write;

        /* synthetic */ IconCompatParcelizer(read readVar, byte b) {
            this(readVar);
        }

        public static final class read {
            private String AudioAttributesCompatParcelizer;
            private String AudioAttributesImplApi26Parcelizer;
            private boolean AudioAttributesImplBaseParcelizer;
            private long RemoteActionCompatParcelizer = C.TIME_UNSET;
            private long IconCompatParcelizer = -2147483647L;
            private long write = C.TIME_UNSET;
            private initExtraTracks<String> read = initExtraTracks.AudioAttributesImplApi26Parcelizer();

            public final read write(long j) {
                buildTypeSerializer.IconCompatParcelizer(j >= 0 || j == C.TIME_UNSET);
                this.RemoteActionCompatParcelizer = ((j + 50) / 100) * 100;
                return this;
            }

            public final read RemoteActionCompatParcelizer(long j) {
                buildTypeSerializer.IconCompatParcelizer(j >= 0 || j == -2147483647L);
                this.IconCompatParcelizer = ((j + 50) / 100) * 100;
                return this;
            }

            public final read AudioAttributesCompatParcelizer(long j) {
                buildTypeSerializer.IconCompatParcelizer(j >= 0 || j == C.TIME_UNSET);
                this.write = ((j + 50) / 100) * 100;
                return this;
            }

            public final read AudioAttributesCompatParcelizer(boolean z) {
                this.AudioAttributesImplBaseParcelizer = z;
                return this;
            }

            public final read AudioAttributesCompatParcelizer(String str) {
                this.AudioAttributesCompatParcelizer = str == null ? null : Uri.encode(str);
                return this;
            }

            public final read IconCompatParcelizer(String str) {
                this.AudioAttributesImplApi26Parcelizer = str;
                return this;
            }

            public final read write(List<String> list) {
                this.read = initExtraTracks.write(list);
                return this;
            }

            public final IconCompatParcelizer write() {
                return new IconCompatParcelizer(this, (byte) 0);
            }
        }

        private IconCompatParcelizer(read readVar) {
            this.write = readVar.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = readVar.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = readVar.write;
            this.AudioAttributesImplBaseParcelizer = readVar.AudioAttributesImplBaseParcelizer;
            this.read = readVar.AudioAttributesCompatParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = readVar.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesCompatParcelizer = readVar.read;
        }

        public final void AudioAttributesCompatParcelizer(AtomParsersStszSampleSizeBox<String, String> atomParsersStszSampleSizeBox) {
            ArrayList arrayList = new ArrayList();
            if (this.write != C.TIME_UNSET) {
                StringBuilder sb = new StringBuilder("bl=");
                sb.append(this.write);
                arrayList.add(sb.toString());
            }
            if (this.IconCompatParcelizer != -2147483647L) {
                StringBuilder sb2 = new StringBuilder("mtp=");
                sb2.append(this.IconCompatParcelizer);
                arrayList.add(sb2.toString());
            }
            if (this.RemoteActionCompatParcelizer != C.TIME_UNSET) {
                StringBuilder sb3 = new StringBuilder("dl=");
                sb3.append(this.RemoteActionCompatParcelizer);
                arrayList.add(sb3.toString());
            }
            if (this.AudioAttributesImplBaseParcelizer) {
                arrayList.add("su");
            }
            if (!TextUtils.isEmpty(this.read)) {
                arrayList.add(LaissezFaireSubTypeValidator.read("%s=\"%s\"", "nor", this.read));
            }
            if (!TextUtils.isEmpty(this.MediaBrowserCompatCustomActionResultReceiver)) {
                arrayList.add(LaissezFaireSubTypeValidator.read("%s=\"%s\"", "nrr", this.MediaBrowserCompatCustomActionResultReceiver));
            }
            arrayList.addAll(this.AudioAttributesCompatParcelizer);
            if (arrayList.isEmpty()) {
                return;
            }
            atomParsersStszSampleSizeBox.read((Object) CmcdConfiguration.KEY_CMCD_REQUEST, (Iterable) arrayList);
        }
    }

    static final class read {
        public final initExtraTracks<String> AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompatCustomActionResultReceiver;
        public final float RemoteActionCompatParcelizer;
        public final String read;
        public final String write;

        /* synthetic */ read(C0056read c0056read, byte b) {
            this(c0056read);
        }

        /* JADX INFO: renamed from: o._fromVariable$read$read, reason: collision with other inner class name */
        public static final class C0056read {
            private initExtraTracks<String> AudioAttributesCompatParcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            private String IconCompatParcelizer;
            private String MediaBrowserCompatCustomActionResultReceiver;
            private String RemoteActionCompatParcelizer;
            private float read;
            private String write;

            public final C0056read read(String str) {
                buildTypeSerializer.IconCompatParcelizer(str == null || str.length() <= 64);
                this.write = str;
                return this;
            }

            public final C0056read write(String str) {
                buildTypeSerializer.IconCompatParcelizer(str == null || str.length() <= 64);
                this.IconCompatParcelizer = str;
                return this;
            }

            public final C0056read IconCompatParcelizer(String str) {
                this.MediaBrowserCompatCustomActionResultReceiver = str;
                return this;
            }

            public final C0056read RemoteActionCompatParcelizer(String str) {
                this.RemoteActionCompatParcelizer = str;
                return this;
            }

            public final C0056read write(float f) {
                buildTypeSerializer.IconCompatParcelizer(f > BitmapDescriptorFactory.HUE_RED || f == -3.4028235E38f);
                this.read = f;
                return this;
            }

            public final C0056read read(List<String> list) {
                this.AudioAttributesCompatParcelizer = initExtraTracks.write(list);
                return this;
            }

            public final read IconCompatParcelizer() {
                return new read(this, (byte) 0);
            }
        }

        private read(C0056read c0056read) {
            this.write = c0056read.write;
            this.IconCompatParcelizer = c0056read.IconCompatParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = c0056read.MediaBrowserCompatCustomActionResultReceiver;
            this.read = c0056read.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = c0056read.read;
            this.AudioAttributesCompatParcelizer = c0056read.AudioAttributesCompatParcelizer;
        }

        public final void write(AtomParsersStszSampleSizeBox<String, String> atomParsersStszSampleSizeBox) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.write)) {
                arrayList.add(LaissezFaireSubTypeValidator.read("%s=\"%s\"", CmcdConfiguration.KEY_CONTENT_ID, this.write));
            }
            if (!TextUtils.isEmpty(this.IconCompatParcelizer)) {
                arrayList.add(LaissezFaireSubTypeValidator.read("%s=\"%s\"", CmcdConfiguration.KEY_SESSION_ID, this.IconCompatParcelizer));
            }
            if (!TextUtils.isEmpty(this.MediaBrowserCompatCustomActionResultReceiver)) {
                StringBuilder sb = new StringBuilder("sf=");
                sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
                arrayList.add(sb.toString());
            }
            if (!TextUtils.isEmpty(this.read)) {
                StringBuilder sb2 = new StringBuilder("st=");
                sb2.append(this.read);
                arrayList.add(sb2.toString());
            }
            float f = this.RemoteActionCompatParcelizer;
            if (f != -3.4028235E38f && f != 1.0f) {
                arrayList.add(LaissezFaireSubTypeValidator.read("%s=%.2f", "pr", Float.valueOf(f)));
            }
            arrayList.addAll(this.AudioAttributesCompatParcelizer);
            if (arrayList.isEmpty()) {
                return;
            }
            atomParsersStszSampleSizeBox.read((Object) CmcdConfiguration.KEY_CMCD_SESSION, (Iterable) arrayList);
        }
    }

    static final class RemoteActionCompatParcelizer {
        public final int RemoteActionCompatParcelizer;
        public final boolean read;
        public final initExtraTracks<String> write;

        /* synthetic */ RemoteActionCompatParcelizer(write writeVar, byte b) {
            this(writeVar);
        }

        public static final class write {
            private boolean AudioAttributesCompatParcelizer;
            private int write = C.RATE_UNSET_INT;
            private initExtraTracks<String> IconCompatParcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();

            public final write IconCompatParcelizer(int i) {
                buildTypeSerializer.IconCompatParcelizer(true);
                this.write = C.RATE_UNSET_INT;
                return this;
            }

            public final write write(boolean z) {
                this.AudioAttributesCompatParcelizer = z;
                return this;
            }

            public final write read(List<String> list) {
                this.IconCompatParcelizer = initExtraTracks.write(list);
                return this;
            }

            public final RemoteActionCompatParcelizer IconCompatParcelizer() {
                return new RemoteActionCompatParcelizer(this, (byte) 0);
            }
        }

        private RemoteActionCompatParcelizer(write writeVar) {
            this.RemoteActionCompatParcelizer = writeVar.write;
            this.read = writeVar.AudioAttributesCompatParcelizer;
            this.write = writeVar.IconCompatParcelizer;
        }

        public final void read(AtomParsersStszSampleSizeBox<String, String> atomParsersStszSampleSizeBox) {
            ArrayList arrayList = new ArrayList();
            if (this.RemoteActionCompatParcelizer != -2147483647) {
                StringBuilder sb = new StringBuilder("rtp=");
                sb.append(this.RemoteActionCompatParcelizer);
                arrayList.add(sb.toString());
            }
            if (this.read) {
                arrayList.add("bs");
            }
            arrayList.addAll(this.write);
            if (arrayList.isEmpty()) {
                return;
            }
            atomParsersStszSampleSizeBox.read((Object) CmcdConfiguration.KEY_CMCD_STATUS, (Iterable) arrayList);
        }
    }
}
