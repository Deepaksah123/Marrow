package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getContentType;", "", "Lo/calloc;", "p0", "p1", "Lo/asInt;", "IconCompatParcelizer", "(JJ)J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getContentType {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

    long IconCompatParcelizer(long p0, long p1);

    /* JADX INFO: renamed from: o.getContentType$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lo/getContentType$read;", "", "<init>", "()V", "Lo/getContentType;", "IconCompatParcelizer", "Lo/getContentType;", "AudioAttributesCompatParcelizer", "()Lo/getContentType;", "read", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "write", "MediaBrowserCompatItemReceiver", "Lo/getBindings;", "AudioAttributesImplBaseParcelizer", "Lo/getBindings;", "AudioAttributesImplApi21Parcelizer", "()Lo/getBindings;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private static final getContentType read = new C0092read();

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private static final getContentType AudioAttributesCompatParcelizer = new IconCompatParcelizer();

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private static final getContentType IconCompatParcelizer = new RemoteActionCompatParcelizer();

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private static final getContentType write = new write();

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private static final getContentType RemoteActionCompatParcelizer = new AudioAttributesImplApi26Parcelizer();

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private static final getBindings MediaBrowserCompatCustomActionResultReceiver = new getBindings(1.0f);

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private static final getContentType AudioAttributesImplBaseParcelizer = new AudioAttributesCompatParcelizer();

        private Companion() {
        }

        /* JADX INFO: renamed from: o.getContentType$read$read, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getContentType$read$read;", "Lo/getContentType;", "Lo/calloc;", "p0", "p1", "Lo/asInt;", "IconCompatParcelizer", "(JJ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0092read implements getContentType {
            C0092read() {
            }

            @Override // kotlin.getContentType
            public final long IconCompatParcelizer(long p0, long p1) {
                float fRemoteActionCompatParcelizer = getErasedSignature.RemoteActionCompatParcelizer(p0, p1);
                long j = -1;
                return asInt.read((((long) Float.floatToRawIntBits(fRemoteActionCompatParcelizer)) << 32) | (((long) Float.floatToRawIntBits(fRemoteActionCompatParcelizer)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
            }
        }

        public final getContentType AudioAttributesCompatParcelizer() {
            return read;
        }

        /* JADX INFO: renamed from: o.getContentType$read$IconCompatParcelizer */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getContentType$read$IconCompatParcelizer;", "Lo/getContentType;", "Lo/calloc;", "p0", "p1", "Lo/asInt;", "IconCompatParcelizer", "(JJ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer implements getContentType {
            IconCompatParcelizer() {
            }

            @Override // kotlin.getContentType
            public final long IconCompatParcelizer(long p0, long p1) {
                float f = getErasedSignature.read(p0, p1);
                long j = -1;
                return asInt.read((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
            }
        }

        public final getContentType IconCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: o.getContentType$read$RemoteActionCompatParcelizer */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getContentType$read$RemoteActionCompatParcelizer;", "Lo/getContentType;", "Lo/calloc;", "p0", "p1", "Lo/asInt;", "IconCompatParcelizer", "(JJ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer implements getContentType {
            RemoteActionCompatParcelizer() {
            }

            @Override // kotlin.getContentType
            public final long IconCompatParcelizer(long p0, long p1) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) p1) / Float.intBitsToFloat((int) p0);
                long j = -1;
                return asInt.read((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
            }
        }

        /* JADX INFO: renamed from: o.getContentType$read$write */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getContentType$read$write;", "Lo/getContentType;", "Lo/calloc;", "p0", "p1", "Lo/asInt;", "IconCompatParcelizer", "(JJ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements getContentType {
            write() {
            }

            @Override // kotlin.getContentType
            public final long IconCompatParcelizer(long p0, long p1) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (p1 >> 32)) / Float.intBitsToFloat((int) (p0 >> 32));
                long j = -1;
                return asInt.read((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
            }
        }

        public final getContentType RemoteActionCompatParcelizer() {
            return write;
        }

        /* JADX INFO: renamed from: o.getContentType$read$AudioAttributesImplApi26Parcelizer */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getContentType$read$AudioAttributesImplApi26Parcelizer;", "Lo/getContentType;", "Lo/calloc;", "p0", "p1", "Lo/asInt;", "IconCompatParcelizer", "(JJ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AudioAttributesImplApi26Parcelizer implements getContentType {
            AudioAttributesImplApi26Parcelizer() {
            }

            @Override // kotlin.getContentType
            public final long IconCompatParcelizer(long p0, long p1) {
                if (Float.intBitsToFloat((int) (p0 >> 32)) > Float.intBitsToFloat((int) (p1 >> 32)) || Float.intBitsToFloat((int) p0) > Float.intBitsToFloat((int) p1)) {
                    float f = getErasedSignature.read(p0, p1);
                    long j = -1;
                    return asInt.read((((long) Float.floatToRawIntBits(f)) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(f))));
                }
                long j2 = -1;
                return asInt.read((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(1.0f))));
            }
        }

        public final getContentType read() {
            return RemoteActionCompatParcelizer;
        }

        public final getBindings AudioAttributesImplApi21Parcelizer() {
            return MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: renamed from: o.getContentType$read$AudioAttributesCompatParcelizer */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getContentType$read$AudioAttributesCompatParcelizer;", "Lo/getContentType;", "Lo/calloc;", "p0", "p1", "Lo/asInt;", "IconCompatParcelizer", "(JJ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AudioAttributesCompatParcelizer implements getContentType {
            AudioAttributesCompatParcelizer() {
            }

            @Override // kotlin.getContentType
            public final long IconCompatParcelizer(long p0, long p1) {
                long j = -1;
                return asInt.read((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (p1 >> 32)) / Float.intBitsToFloat((int) (p0 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) p1) / Float.intBitsToFloat((int) p0))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
            }
        }

        public final getContentType write() {
            return AudioAttributesImplBaseParcelizer;
        }
    }
}
