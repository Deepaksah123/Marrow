package kotlin;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.StreamKey;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonSerializableSchema {
    public final AudioAttributesImplApi21Parcelizer AudioAttributesCompatParcelizer;
    public final getSchema AudioAttributesImplApi21Parcelizer;

    @Deprecated
    public final AudioAttributesImplApi21Parcelizer AudioAttributesImplApi26Parcelizer;
    public final AudioAttributesCompatParcelizer IconCompatParcelizer;
    public final AudioAttributesImplBaseParcelizer MediaBrowserCompatItemReceiver;
    public final AudioAttributesImplApi26Parcelizer RemoteActionCompatParcelizer;

    @Deprecated
    public final RemoteActionCompatParcelizer read;
    public final String write;

    /* synthetic */ JsonSerializableSchema(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, getSchema getschema, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, byte b) {
        this(str, remoteActionCompatParcelizer, audioAttributesImplApi21Parcelizer, audioAttributesImplApi26Parcelizer, getschema, audioAttributesImplBaseParcelizer);
    }

    public static JsonSerializableSchema read(String str) {
        return new IconCompatParcelizer().IconCompatParcelizer(str).IconCompatParcelizer();
    }

    public static final class IconCompatParcelizer {
        private read AudioAttributesCompatParcelizer;
        private getSchema AudioAttributesImplApi21Parcelizer;
        private AudioAttributesImplApi26Parcelizer.read AudioAttributesImplApi26Parcelizer;
        private AudioAttributesImplBaseParcelizer AudioAttributesImplBaseParcelizer;
        private AudioAttributesCompatParcelizer.C0033AudioAttributesCompatParcelizer IconCompatParcelizer;
        private String MediaBrowserCompatCustomActionResultReceiver;
        private String MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatMediaItem;
        private Uri MediaBrowserCompatSearchResultReceiver;
        private initExtraTracks<MediaBrowserCompatItemReceiver> MediaDescriptionCompat;
        private List<StreamKey> RatingCompat;
        private write.read RemoteActionCompatParcelizer;
        private long read;
        private String write;

        /* synthetic */ IconCompatParcelizer(JsonSerializableSchema jsonSerializableSchema, byte b) {
            this(jsonSerializableSchema);
        }

        public IconCompatParcelizer() {
            this.IconCompatParcelizer = new AudioAttributesCompatParcelizer.C0033AudioAttributesCompatParcelizer();
            this.RemoteActionCompatParcelizer = new write.read((byte) 0);
            this.RatingCompat = Collections.emptyList();
            this.MediaDescriptionCompat = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            this.AudioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer.read();
            this.AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer.write;
            this.read = C.TIME_UNSET;
        }

        private IconCompatParcelizer(JsonSerializableSchema jsonSerializableSchema) {
            write.read readVar;
            this();
            this.IconCompatParcelizer = jsonSerializableSchema.IconCompatParcelizer.IconCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = jsonSerializableSchema.write;
            this.AudioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = jsonSerializableSchema.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer = jsonSerializableSchema.MediaBrowserCompatItemReceiver;
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
            if (audioAttributesImplApi21Parcelizer != null) {
                this.write = audioAttributesImplApi21Parcelizer.IconCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatSearchResultReceiver = audioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver;
                this.RatingCompat = audioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer;
                this.MediaDescriptionCompat = audioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatMediaItem = audioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer;
                if (audioAttributesImplApi21Parcelizer.read != null) {
                    readVar = audioAttributesImplApi21Parcelizer.read.read();
                } else {
                    readVar = new write.read((byte) 0);
                }
                this.RemoteActionCompatParcelizer = readVar;
                this.AudioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer;
                this.read = audioAttributesImplApi21Parcelizer.write;
            }
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.MediaBrowserCompatCustomActionResultReceiver = (String) buildTypeSerializer.IconCompatParcelizer(str);
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(String str) {
            return read(str == null ? null : Uri.parse(str));
        }

        public final IconCompatParcelizer read(Uri uri) {
            this.MediaBrowserCompatSearchResultReceiver = uri;
            return this;
        }

        public final IconCompatParcelizer read(String str) {
            this.MediaBrowserCompatItemReceiver = str;
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(List<MediaBrowserCompatItemReceiver> list) {
            this.MediaDescriptionCompat = initExtraTracks.write(list);
            return this;
        }

        public final IconCompatParcelizer write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi26Parcelizer = audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
            return this;
        }

        public final IconCompatParcelizer read(Object obj) {
            this.MediaBrowserCompatMediaItem = obj;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final JsonSerializableSchema IconCompatParcelizer() {
            buildTypeSerializer.write(this.RemoteActionCompatParcelizer.read == null || this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer != null);
            Uri uri = this.MediaBrowserCompatSearchResultReceiver;
            if (uri != null) {
                audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer(uri, this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer != null ? this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() : null, this.AudioAttributesCompatParcelizer, this.RatingCompat, this.write, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.read, (byte) 0);
            }
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer;
            String str = this.MediaBrowserCompatCustomActionResultReceiver;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.read();
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerWrite = this.AudioAttributesImplApi26Parcelizer.write();
            getSchema getschema = this.AudioAttributesImplApi21Parcelizer;
            if (getschema == null) {
                getschema = getSchema.AudioAttributesCompatParcelizer;
            }
            return new JsonSerializableSchema(str2, remoteActionCompatParcelizer, audioAttributesImplApi21Parcelizer, audioAttributesImplApi26ParcelizerWrite, getschema, this.AudioAttributesImplBaseParcelizer, (byte) 0);
        }
    }

    public static final class write {
        public final Uri AudioAttributesCompatParcelizer;

        @Deprecated
        public final initExtraTracks<Integer> AudioAttributesImplApi21Parcelizer;

        @Deprecated
        public final onMoovContainerAtomRead<String, String> AudioAttributesImplApi26Parcelizer;
        public final boolean AudioAttributesImplBaseParcelizer;
        public final boolean IconCompatParcelizer;

        @Deprecated
        public final UUID MediaBrowserCompatCustomActionResultReceiver;
        public final UUID MediaBrowserCompatItemReceiver;
        private final byte[] MediaBrowserCompatMediaItem;
        public final boolean RemoteActionCompatParcelizer;
        public final initExtraTracks<Integer> read;
        public final onMoovContainerAtomRead<String, String> write;

        /* synthetic */ write(read readVar, byte b) {
            this(readVar);
        }

        public static final class read {
            private byte[] AudioAttributesCompatParcelizer;
            private UUID AudioAttributesImplApi21Parcelizer;
            private boolean AudioAttributesImplBaseParcelizer;
            private boolean IconCompatParcelizer;
            private boolean MediaBrowserCompatItemReceiver;
            private onMoovContainerAtomRead<String, String> RemoteActionCompatParcelizer;
            private Uri read;
            private initExtraTracks<Integer> write;

            /* synthetic */ read(byte b) {
                this();
            }

            /* synthetic */ read(write writeVar, byte b) {
                this(writeVar);
            }

            @Deprecated
            private read() {
                this.RemoteActionCompatParcelizer = onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
                this.MediaBrowserCompatItemReceiver = true;
                this.write = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            }

            private read(write writeVar) {
                this.AudioAttributesImplApi21Parcelizer = writeVar.MediaBrowserCompatItemReceiver;
                this.read = writeVar.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = writeVar.write;
                this.AudioAttributesImplBaseParcelizer = writeVar.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = writeVar.AudioAttributesImplBaseParcelizer;
                this.IconCompatParcelizer = writeVar.IconCompatParcelizer;
                this.write = writeVar.read;
                this.AudioAttributesCompatParcelizer = writeVar.MediaBrowserCompatMediaItem;
            }

            public final write AudioAttributesCompatParcelizer() {
                return new write(this, (byte) 0);
            }
        }

        private write(read readVar) {
            buildTypeSerializer.write((readVar.IconCompatParcelizer && readVar.read == null) ? false : true);
            UUID uuid = (UUID) buildTypeSerializer.IconCompatParcelizer(readVar.AudioAttributesImplApi21Parcelizer);
            this.MediaBrowserCompatItemReceiver = uuid;
            this.MediaBrowserCompatCustomActionResultReceiver = uuid;
            this.AudioAttributesCompatParcelizer = readVar.read;
            this.AudioAttributesImplApi26Parcelizer = readVar.RemoteActionCompatParcelizer;
            this.write = readVar.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = readVar.AudioAttributesImplBaseParcelizer;
            this.IconCompatParcelizer = readVar.IconCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer = readVar.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplApi21Parcelizer = readVar.write;
            this.read = readVar.write;
            this.MediaBrowserCompatMediaItem = readVar.AudioAttributesCompatParcelizer != null ? Arrays.copyOf(readVar.AudioAttributesCompatParcelizer, readVar.AudioAttributesCompatParcelizer.length) : null;
        }

        public final byte[] AudioAttributesCompatParcelizer() {
            byte[] bArr = this.MediaBrowserCompatMediaItem;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final read read() {
            return new read(this, (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return this.MediaBrowserCompatItemReceiver.equals(writeVar.MediaBrowserCompatItemReceiver) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.write, writeVar.write) && this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer && this.IconCompatParcelizer == writeVar.IconCompatParcelizer && this.AudioAttributesImplBaseParcelizer == writeVar.AudioAttributesImplBaseParcelizer && this.read.equals(writeVar.read) && Arrays.equals(this.MediaBrowserCompatMediaItem, writeVar.MediaBrowserCompatMediaItem);
        }

        public final int hashCode() {
            int iHashCode = this.MediaBrowserCompatItemReceiver.hashCode();
            Uri uri = this.AudioAttributesCompatParcelizer;
            int iHashCode2 = uri != null ? uri.hashCode() : 0;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + this.write.hashCode()) * 31) + (this.RemoteActionCompatParcelizer ? 1 : 0)) * 31) + (this.IconCompatParcelizer ? 1 : 0)) * 31) + (this.AudioAttributesImplBaseParcelizer ? 1 : 0)) * 31) + this.read.hashCode()) * 31) + Arrays.hashCode(this.MediaBrowserCompatMediaItem);
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(7);
        }
    }

    public static final class read {
        public final Uri IconCompatParcelizer;
        public final Object read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return this.IconCompatParcelizer.equals(readVar.IconCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.read, readVar.read);
        }

        public final int hashCode() {
            int iHashCode = this.IconCompatParcelizer.hashCode();
            Object obj = this.read;
            return (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer {
        public final String AudioAttributesCompatParcelizer;
        public final List<StreamKey> AudioAttributesImplApi21Parcelizer;
        public final Object AudioAttributesImplApi26Parcelizer;

        @Deprecated
        public final List<MediaBrowserCompatCustomActionResultReceiver> AudioAttributesImplBaseParcelizer;
        public final String IconCompatParcelizer;
        public final initExtraTracks<MediaBrowserCompatItemReceiver> MediaBrowserCompatCustomActionResultReceiver;
        public final Uri MediaBrowserCompatItemReceiver;
        public final read RemoteActionCompatParcelizer;
        public final write read;
        public final long write;

        /* synthetic */ AudioAttributesImplApi21Parcelizer(Uri uri, String str, write writeVar, read readVar, List list, String str2, initExtraTracks initextratracks, Object obj, long j, byte b) {
            this(uri, str, writeVar, readVar, list, str2, initextratracks, obj, j);
        }

        private AudioAttributesImplApi21Parcelizer(Uri uri, String str, write writeVar, read readVar, List<StreamKey> list, String str2, initExtraTracks<MediaBrowserCompatItemReceiver> initextratracks, Object obj, long j) {
            this.MediaBrowserCompatItemReceiver = uri;
            this.AudioAttributesCompatParcelizer = DefaultBaseTypeLimitingValidator.MediaMetadataCompat(str);
            this.read = writeVar;
            this.RemoteActionCompatParcelizer = readVar;
            this.AudioAttributesImplApi21Parcelizer = list;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompatCustomActionResultReceiver = initextratracks;
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i = 0; i < initextratracks.size(); i++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(initextratracks.get(i).RemoteActionCompatParcelizer().read());
            }
            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.write = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesImplApi21Parcelizer)) {
                return false;
            }
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (AudioAttributesImplApi21Parcelizer) obj;
            return this.MediaBrowserCompatItemReceiver.equals(audioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.read, audioAttributesImplApi21Parcelizer.read) && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer.equals(audioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer) && LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, audioAttributesImplApi21Parcelizer.IconCompatParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver.equals(audioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi26Parcelizer, audioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer) && LaissezFaireSubTypeValidator.read(Long.valueOf(this.write), Long.valueOf(audioAttributesImplApi21Parcelizer.write));
        }

        public final int hashCode() {
            int iHashCode = this.MediaBrowserCompatItemReceiver.hashCode();
            String str = this.AudioAttributesCompatParcelizer;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            write writeVar = this.read;
            int iHashCode3 = writeVar == null ? 0 : writeVar.hashCode();
            read readVar = this.RemoteActionCompatParcelizer;
            int iHashCode4 = readVar == null ? 0 : readVar.hashCode();
            int iHashCode5 = this.AudioAttributesImplApi21Parcelizer.hashCode();
            String str2 = this.IconCompatParcelizer;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            int iHashCode7 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
            Object obj = this.AudioAttributesImplApi26Parcelizer;
            return (int) ((((long) ((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (obj != null ? obj.hashCode() : 0))) * 31) + this.write);
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(7);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final long IconCompatParcelizer;
        public final float RemoteActionCompatParcelizer;
        public final long read;
        public final float write;

        /* synthetic */ AudioAttributesImplApi26Parcelizer(read readVar, byte b) {
            this(readVar);
        }

        public static final class read {
            private long AudioAttributesCompatParcelizer;
            private long IconCompatParcelizer;
            private long RemoteActionCompatParcelizer;
            private float read;
            private float write;

            /* synthetic */ read(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, byte b) {
                this(audioAttributesImplApi26Parcelizer);
            }

            public read() {
                this.IconCompatParcelizer = C.TIME_UNSET;
                this.RemoteActionCompatParcelizer = C.TIME_UNSET;
                this.AudioAttributesCompatParcelizer = C.TIME_UNSET;
                this.read = -3.4028235E38f;
                this.write = -3.4028235E38f;
            }

            private read(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
                this.IconCompatParcelizer = audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = audioAttributesImplApi26Parcelizer.IconCompatParcelizer;
                this.AudioAttributesCompatParcelizer = audioAttributesImplApi26Parcelizer.read;
                this.read = audioAttributesImplApi26Parcelizer.write;
                this.write = audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
            }

            public final read RemoteActionCompatParcelizer(long j) {
                this.IconCompatParcelizer = j;
                return this;
            }

            public final read read(long j) {
                this.RemoteActionCompatParcelizer = j;
                return this;
            }

            public final read IconCompatParcelizer(long j) {
                this.AudioAttributesCompatParcelizer = j;
                return this;
            }

            public final read RemoteActionCompatParcelizer(float f) {
                this.read = f;
                return this;
            }

            public final read AudioAttributesCompatParcelizer(float f) {
                this.write = f;
                return this;
            }

            public final AudioAttributesImplApi26Parcelizer write() {
                return new AudioAttributesImplApi26Parcelizer(this, (byte) 0);
            }
        }

        static {
            new read().write();
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        }

        private AudioAttributesImplApi26Parcelizer(read readVar) {
            this(readVar.IconCompatParcelizer, readVar.RemoteActionCompatParcelizer, readVar.AudioAttributesCompatParcelizer, readVar.read, readVar.write);
        }

        @Deprecated
        private AudioAttributesImplApi26Parcelizer(long j, long j2, long j3, float f, float f2) {
            this.AudioAttributesCompatParcelizer = j;
            this.IconCompatParcelizer = j2;
            this.read = j3;
            this.write = f;
            this.RemoteActionCompatParcelizer = f2;
        }

        public final read RemoteActionCompatParcelizer() {
            return new read(this, (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesImplApi26Parcelizer)) {
                return false;
            }
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (AudioAttributesImplApi26Parcelizer) obj;
            return this.AudioAttributesCompatParcelizer == audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == audioAttributesImplApi26Parcelizer.IconCompatParcelizer && this.read == audioAttributesImplApi26Parcelizer.read && this.write == audioAttributesImplApi26Parcelizer.write && this.RemoteActionCompatParcelizer == audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            long j = this.AudioAttributesCompatParcelizer;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.IconCompatParcelizer;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.read;
            int i3 = (int) ((j3 >>> 32) ^ j3);
            float f = this.write;
            int iFloatToIntBits = f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0;
            float f2 = this.RemoteActionCompatParcelizer;
            return (((((((i * 31) + i2) * 31) + i3) * 31) + iFloatToIntBits) * 31) + (f2 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f2) : 0);
        }
    }

    public static class MediaBrowserCompatItemReceiver {
        public final String AudioAttributesCompatParcelizer;
        public final Uri AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final String RemoteActionCompatParcelizer;
        public final String read;
        public final String write;

        /* synthetic */ MediaBrowserCompatItemReceiver(write writeVar, byte b) {
            this(writeVar);
        }

        public static final class write {
            private String AudioAttributesCompatParcelizer;
            private Uri AudioAttributesImplApi26Parcelizer;
            private int IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private String RemoteActionCompatParcelizer;
            private String read;
            private String write;

            /* synthetic */ write(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, byte b) {
                this(mediaBrowserCompatItemReceiver);
            }

            private write(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
                this.AudioAttributesImplApi26Parcelizer = mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer;
                this.write = mediaBrowserCompatItemReceiver.write;
                this.AudioAttributesCompatParcelizer = mediaBrowserCompatItemReceiver.read;
                this.MediaBrowserCompatCustomActionResultReceiver = mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver;
                this.IconCompatParcelizer = mediaBrowserCompatItemReceiver.IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
                this.read = mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public MediaBrowserCompatCustomActionResultReceiver read() {
                return new MediaBrowserCompatCustomActionResultReceiver(this, (byte) 0);
            }
        }

        private MediaBrowserCompatItemReceiver(write writeVar) {
            this.AudioAttributesImplBaseParcelizer = writeVar.AudioAttributesImplApi26Parcelizer;
            this.write = writeVar.write;
            this.read = writeVar.AudioAttributesCompatParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = writeVar.MediaBrowserCompatCustomActionResultReceiver;
            this.IconCompatParcelizer = writeVar.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = writeVar.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = writeVar.read;
        }

        public final write RemoteActionCompatParcelizer() {
            return new write(this, (byte) 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaBrowserCompatItemReceiver)) {
                return false;
            }
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (MediaBrowserCompatItemReceiver) obj;
            return this.AudioAttributesImplBaseParcelizer.equals(mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer) && LaissezFaireSubTypeValidator.read(this.write, mediaBrowserCompatItemReceiver.write) && LaissezFaireSubTypeValidator.read(this.read, mediaBrowserCompatItemReceiver.read) && this.MediaBrowserCompatCustomActionResultReceiver == mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver && this.IconCompatParcelizer == mediaBrowserCompatItemReceiver.IconCompatParcelizer && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
        }

        public int hashCode() {
            int iHashCode = this.AudioAttributesImplBaseParcelizer.hashCode();
            String str = this.write;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.read;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            int i2 = this.IconCompatParcelizer;
            String str3 = this.AudioAttributesCompatParcelizer;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.RemoteActionCompatParcelizer;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + i2) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
        }
    }

    @Deprecated
    public static final class MediaBrowserCompatCustomActionResultReceiver extends MediaBrowserCompatItemReceiver {
        /* synthetic */ MediaBrowserCompatCustomActionResultReceiver(MediaBrowserCompatItemReceiver.write writeVar, byte b) {
            this(writeVar);
        }

        private MediaBrowserCompatCustomActionResultReceiver(MediaBrowserCompatItemReceiver.write writeVar) {
            super(writeVar, (byte) 0);
        }
    }

    public static class AudioAttributesCompatParcelizer {
        public final boolean AudioAttributesCompatParcelizer;
        public final boolean AudioAttributesImplApi21Parcelizer;
        public final long IconCompatParcelizer;
        public final long MediaBrowserCompatItemReceiver;
        public final long RemoteActionCompatParcelizer;
        public final boolean read;
        public final long write;

        /* synthetic */ AudioAttributesCompatParcelizer(C0033AudioAttributesCompatParcelizer c0033AudioAttributesCompatParcelizer, byte b) {
            this(c0033AudioAttributesCompatParcelizer);
        }

        static {
            new C0033AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
        }

        /* JADX INFO: renamed from: o.JsonSerializableSchema$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        public static final class C0033AudioAttributesCompatParcelizer {
            private long AudioAttributesCompatParcelizer;
            private boolean IconCompatParcelizer;
            private boolean RemoteActionCompatParcelizer;
            private boolean read;
            private long write;

            /* synthetic */ C0033AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
                this(audioAttributesCompatParcelizer);
            }

            public C0033AudioAttributesCompatParcelizer() {
                this.write = Long.MIN_VALUE;
            }

            private C0033AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
                this.write = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                this.IconCompatParcelizer = audioAttributesCompatParcelizer.read;
                this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                this.read = audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            }

            public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
                return new AudioAttributesCompatParcelizer(this, (byte) 0);
            }

            @Deprecated
            public final RemoteActionCompatParcelizer read() {
                return new RemoteActionCompatParcelizer(this, (byte) 0);
            }
        }

        private AudioAttributesCompatParcelizer(C0033AudioAttributesCompatParcelizer c0033AudioAttributesCompatParcelizer) {
            this.write = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(c0033AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
            this.IconCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(c0033AudioAttributesCompatParcelizer.write);
            this.MediaBrowserCompatItemReceiver = c0033AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = c0033AudioAttributesCompatParcelizer.write;
            this.read = c0033AudioAttributesCompatParcelizer.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = c0033AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = c0033AudioAttributesCompatParcelizer.read;
        }

        public final C0033AudioAttributesCompatParcelizer IconCompatParcelizer() {
            return new C0033AudioAttributesCompatParcelizer(this, (byte) 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.MediaBrowserCompatItemReceiver == audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver && this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.read == audioAttributesCompatParcelizer.read && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        }

        public int hashCode() {
            long j = this.MediaBrowserCompatItemReceiver;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.RemoteActionCompatParcelizer;
            return (((((((i * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.read ? 1 : 0)) * 31) + (this.AudioAttributesCompatParcelizer ? 1 : 0)) * 31) + (this.AudioAttributesImplApi21Parcelizer ? 1 : 0);
        }
    }

    @Deprecated
    public static final class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer {
        /* synthetic */ RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer.C0033AudioAttributesCompatParcelizer c0033AudioAttributesCompatParcelizer, byte b) {
            this(c0033AudioAttributesCompatParcelizer);
        }

        static {
            new AudioAttributesCompatParcelizer.C0033AudioAttributesCompatParcelizer().read();
        }

        private RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer.C0033AudioAttributesCompatParcelizer c0033AudioAttributesCompatParcelizer) {
            super(c0033AudioAttributesCompatParcelizer, (byte) 0);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer {
        public static final AudioAttributesImplBaseParcelizer write = new RemoteActionCompatParcelizer().read();
        public final Uri AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final Bundle read;

        /* synthetic */ AudioAttributesImplBaseParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        }

        public static final class RemoteActionCompatParcelizer {
            private Uri AudioAttributesCompatParcelizer;
            private String RemoteActionCompatParcelizer;
            private Bundle write;

            public final AudioAttributesImplBaseParcelizer read() {
                return new AudioAttributesImplBaseParcelizer(this, (byte) 0);
            }
        }

        private AudioAttributesImplBaseParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            this.IconCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            this.read = remoteActionCompatParcelizer.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesImplBaseParcelizer)) {
                return false;
            }
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (AudioAttributesImplBaseParcelizer) obj;
            if (LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, audioAttributesImplBaseParcelizer.IconCompatParcelizer)) {
                if ((this.read == null) == (audioAttributesImplBaseParcelizer.read == null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Uri uri = this.AudioAttributesCompatParcelizer;
            int iHashCode = uri == null ? 0 : uri.hashCode();
            String str = this.IconCompatParcelizer;
            return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.read != null ? 1 : 0);
        }
    }

    static {
        new IconCompatParcelizer().IconCompatParcelizer();
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
    }

    private JsonSerializableSchema(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, getSchema getschema, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        this.write = str;
        this.AudioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi26Parcelizer = audioAttributesImplApi21Parcelizer;
        this.RemoteActionCompatParcelizer = audioAttributesImplApi26Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = getschema;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.read = remoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = audioAttributesImplBaseParcelizer;
    }

    public final IconCompatParcelizer read() {
        return new IconCompatParcelizer(this, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonSerializableSchema)) {
            return false;
        }
        JsonSerializableSchema jsonSerializableSchema = (JsonSerializableSchema) obj;
        return LaissezFaireSubTypeValidator.read(this.write, jsonSerializableSchema.write) && this.IconCompatParcelizer.equals(jsonSerializableSchema.IconCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, jsonSerializableSchema.AudioAttributesCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, jsonSerializableSchema.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi21Parcelizer, jsonSerializableSchema.AudioAttributesImplApi21Parcelizer) && LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatItemReceiver, jsonSerializableSchema.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = audioAttributesImplApi21Parcelizer != null ? audioAttributesImplApi21Parcelizer.hashCode() : 0;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
    }
}
