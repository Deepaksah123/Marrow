package kotlin;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.C0170format;
import kotlin.keyFormat;
import kotlin.noTypeInfoBuilder;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class addFirst implements checkNotEmpty {
    private final boolean AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private long MediaMetadataCompat;
    private final pollFirst RatingCompat;
    private nonNullString RemoteActionCompatParcelizer;
    private boolean read;
    private String write;
    private final boolean[] AudioAttributesImplApi21Parcelizer = new boolean[3];
    private final offer MediaBrowserCompatSearchResultReceiver = new offer(7);
    private final offer AudioAttributesImplBaseParcelizer = new offer(8);
    private final offer MediaDescriptionCompat = new offer(6);
    private long MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
    private final AsPropertyTypeDeserializer MediaBrowserCompatMediaItem = new AsPropertyTypeDeserializer();

    public addFirst(pollFirst pollfirst, boolean z, boolean z2) {
        this.RatingCompat = pollfirst;
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.MediaMetadataCompat = 0L;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
        noTypeInfoBuilder.read(this.AudioAttributesImplApi21Parcelizer);
        this.MediaBrowserCompatSearchResultReceiver.write();
        this.AudioAttributesImplBaseParcelizer.write();
        this.MediaDescriptionCompat.write();
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read();
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.write = writeVar.IconCompatParcelizer();
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 2);
        this.RemoteActionCompatParcelizer = nonnullstringIconCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = new IconCompatParcelizer(nonnullstringIconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
        this.RatingCompat.write(findrawsupertypes, writeVar);
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.AudioAttributesImplApi26Parcelizer |= (i & 2) != 0;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        RemoteActionCompatParcelizer();
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        this.MediaMetadataCompat += (long) asPropertyTypeDeserializer.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, asPropertyTypeDeserializer.IconCompatParcelizer());
        while (true) {
            int i2 = noTypeInfoBuilder.read(bArrRemoteActionCompatParcelizer, iWrite, i, this.AudioAttributesImplApi21Parcelizer);
            if (i2 == i) {
                RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, iWrite, i);
                return;
            }
            int i3 = noTypeInfoBuilder.read(bArrRemoteActionCompatParcelizer, i2);
            int i4 = i2 - iWrite;
            if (i4 > 0) {
                RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, iWrite, i2);
            }
            int i5 = i - i2;
            long j = this.MediaMetadataCompat - ((long) i5);
            AudioAttributesCompatParcelizer(j, i5, i4 < 0 ? -i4 : 0, this.MediaBrowserCompatCustomActionResultReceiver);
            read(j, i3, this.MediaBrowserCompatCustomActionResultReceiver);
            iWrite = i2 + 3;
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
        RemoteActionCompatParcelizer();
        if (z) {
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.MediaMetadataCompat);
        }
    }

    private void read(long j, int i, long j2) {
        if (!this.read || this.MediaBrowserCompatItemReceiver.write()) {
            this.MediaBrowserCompatSearchResultReceiver.write(i);
            this.AudioAttributesImplBaseParcelizer.write(i);
        }
        this.MediaDescriptionCompat.write(i);
        this.MediaBrowserCompatItemReceiver.read(j, i, j2, this.AudioAttributesImplApi26Parcelizer);
    }

    private void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        if (!this.read || this.MediaBrowserCompatItemReceiver.write()) {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(bArr, i, i2);
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(bArr, i, i2);
        }
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(bArr, i, i2);
        this.MediaBrowserCompatItemReceiver.read(bArr, i, i2);
    }

    private void AudioAttributesCompatParcelizer(long j, int i, int i2, long j2) {
        if (!this.read || this.MediaBrowserCompatItemReceiver.write()) {
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(i2);
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(i2);
            if (!this.read) {
                if (this.MediaBrowserCompatSearchResultReceiver.read() && this.AudioAttributesImplBaseParcelizer.read()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.MediaBrowserCompatSearchResultReceiver.read, this.MediaBrowserCompatSearchResultReceiver.write));
                    arrayList.add(Arrays.copyOf(this.AudioAttributesImplBaseParcelizer.read, this.AudioAttributesImplBaseParcelizer.write));
                    noTypeInfoBuilder.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = noTypeInfoBuilder.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.read, 3, this.MediaBrowserCompatSearchResultReceiver.write);
                    noTypeInfoBuilder.read readVarAudioAttributesCompatParcelizer = noTypeInfoBuilder.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer.read, this.AudioAttributesImplBaseParcelizer.write);
                    this.RemoteActionCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.write).AudioAttributesImplApi26Parcelizer(MimeTypes.VIDEO_H264).RemoteActionCompatParcelizer(inclusion.IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer.onCustomAction, iconCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizerAudioAttributesCompatParcelizer.MediaDescriptionCompat)).onFastForward(iconCompatParcelizerAudioAttributesCompatParcelizer.onAddQueueItem).MediaBrowserCompatItemReceiver(iconCompatParcelizerAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver).IconCompatParcelizer(new keyFormat.read().IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer).read(iconCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer.read).AudioAttributesCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer.write + 8).write(iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer + 8).write()).write(iconCompatParcelizerAudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler).RemoteActionCompatParcelizer(arrayList).MediaMetadataCompat(iconCompatParcelizerAudioAttributesCompatParcelizer.MediaMetadataCompat).IconCompatParcelizer());
                    this.read = true;
                    this.MediaBrowserCompatItemReceiver.write(iconCompatParcelizerAudioAttributesCompatParcelizer);
                    this.MediaBrowserCompatItemReceiver.write(readVarAudioAttributesCompatParcelizer);
                    this.MediaBrowserCompatSearchResultReceiver.write();
                    this.AudioAttributesImplBaseParcelizer.write();
                }
            } else if (this.MediaBrowserCompatSearchResultReceiver.read()) {
                this.MediaBrowserCompatItemReceiver.write(noTypeInfoBuilder.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.read, 3, this.MediaBrowserCompatSearchResultReceiver.write));
                this.MediaBrowserCompatSearchResultReceiver.write();
            } else if (this.AudioAttributesImplBaseParcelizer.read()) {
                this.MediaBrowserCompatItemReceiver.write(noTypeInfoBuilder.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer.read, this.AudioAttributesImplBaseParcelizer.write));
                this.AudioAttributesImplBaseParcelizer.write();
            }
        }
        if (this.MediaDescriptionCompat.RemoteActionCompatParcelizer(i2)) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaDescriptionCompat.read, noTypeInfoBuilder.IconCompatParcelizer(this.MediaDescriptionCompat.read, this.MediaDescriptionCompat.write));
            this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver(4);
            this.RatingCompat.IconCompatParcelizer(j2, this.MediaBrowserCompatMediaItem);
        }
        if (this.MediaBrowserCompatItemReceiver.write(j, i, this.read)) {
            this.AudioAttributesImplApi26Parcelizer = false;
        }
    }

    private void RemoteActionCompatParcelizer() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
    }

    static final class IconCompatParcelizer {
        private final boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private final nonNullString AudioAttributesImplApi26Parcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private final _collectAndResolve IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private read MediaBrowserCompatSearchResultReceiver;
        private boolean MediaMetadataCompat;
        private boolean RatingCompat;
        private byte[] RemoteActionCompatParcelizer;
        private read handleMediaPlayPauseIfPendingOnHandler;
        private long onCommand;
        private long onCustomAction;
        private int read;
        private final boolean write;
        private final SparseArray<noTypeInfoBuilder.IconCompatParcelizer> onAddQueueItem = new SparseArray<>();
        private final SparseArray<noTypeInfoBuilder.read> MediaDescriptionCompat = new SparseArray<>();

        public IconCompatParcelizer(nonNullString nonnullstring, boolean z, boolean z2) {
            this.AudioAttributesImplApi26Parcelizer = nonnullstring;
            this.AudioAttributesCompatParcelizer = z;
            this.write = z2;
            byte b = 0;
            this.MediaBrowserCompatSearchResultReceiver = new read(b);
            this.handleMediaPlayPauseIfPendingOnHandler = new read(b);
            byte[] bArr = new byte[128];
            this.RemoteActionCompatParcelizer = bArr;
            this.IconCompatParcelizer = new _collectAndResolve(bArr, 0, 0);
            read();
        }

        public final boolean write() {
            return this.write;
        }

        public final void write(noTypeInfoBuilder.IconCompatParcelizer iconCompatParcelizer) {
            this.onAddQueueItem.append(iconCompatParcelizer.onCommand, iconCompatParcelizer);
        }

        public final void write(noTypeInfoBuilder.read readVar) {
            this.MediaDescriptionCompat.append(readVar.RemoteActionCompatParcelizer, readVar);
        }

        public final void read() {
            this.MediaBrowserCompatCustomActionResultReceiver = false;
            this.RatingCompat = false;
            this.handleMediaPlayPauseIfPendingOnHandler.read();
        }

        public final void read(long j, int i, long j2, boolean z) {
            this.AudioAttributesImplApi21Parcelizer = i;
            this.MediaBrowserCompatItemReceiver = j2;
            this.AudioAttributesImplBaseParcelizer = j;
            this.MediaBrowserCompatMediaItem = z;
            if (!this.AudioAttributesCompatParcelizer || i != 1) {
                if (!this.write) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            read readVar = this.MediaBrowserCompatSearchResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver = this.handleMediaPlayPauseIfPendingOnHandler;
            this.handleMediaPlayPauseIfPendingOnHandler = readVar;
            readVar.read();
            this.read = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void read(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instruction units count: 389
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.addFirst.IconCompatParcelizer.read(byte[], int, int):void");
        }

        public final boolean write(long j, int i, boolean z) {
            if (this.AudioAttributesImplApi21Parcelizer == 9 || (this.write && this.handleMediaPlayPauseIfPendingOnHandler.write(this.MediaBrowserCompatSearchResultReceiver))) {
                if (z && this.RatingCompat) {
                    RemoteActionCompatParcelizer(i + ((int) (j - this.AudioAttributesImplBaseParcelizer)));
                }
                this.onCommand = this.AudioAttributesImplBaseParcelizer;
                this.onCustomAction = this.MediaBrowserCompatItemReceiver;
                this.MediaMetadataCompat = false;
                this.RatingCompat = true;
            }
            RemoteActionCompatParcelizer();
            return this.MediaMetadataCompat;
        }

        public final void IconCompatParcelizer(long j) {
            RemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer = j;
            RemoteActionCompatParcelizer(0);
            this.RatingCompat = false;
        }

        private void RemoteActionCompatParcelizer() {
            boolean zIconCompatParcelizer = this.AudioAttributesCompatParcelizer ? this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer() : this.MediaBrowserCompatMediaItem;
            boolean z = this.MediaMetadataCompat;
            int i = this.AudioAttributesImplApi21Parcelizer;
            boolean z2 = true;
            if (i != 5 && (!zIconCompatParcelizer || i != 1)) {
                z2 = false;
            }
            this.MediaMetadataCompat = z | z2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void RemoteActionCompatParcelizer(int i) {
            long j = this.onCustomAction;
            if (j == C.TIME_UNSET) {
                return;
            }
            boolean z = this.MediaMetadataCompat;
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(j, z ? 1 : 0, (int) (this.AudioAttributesImplBaseParcelizer - this.onCommand), i, null);
        }

        static final class read {
            private int AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private boolean AudioAttributesImplApi26Parcelizer;
            private boolean AudioAttributesImplBaseParcelizer;
            private boolean IconCompatParcelizer;
            private boolean MediaBrowserCompatCustomActionResultReceiver;
            private int MediaBrowserCompatItemReceiver;
            private int MediaBrowserCompatMediaItem;
            private boolean MediaBrowserCompatSearchResultReceiver;
            private int MediaDescriptionCompat;
            private int MediaMetadataCompat;
            private int RatingCompat;
            private int RemoteActionCompatParcelizer;
            private noTypeInfoBuilder.IconCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
            private boolean read;
            private int write;

            private read() {
            }

            /* synthetic */ read(byte b) {
                this();
            }

            public final void read() {
                this.AudioAttributesImplApi26Parcelizer = false;
                this.MediaBrowserCompatSearchResultReceiver = false;
            }

            public final void AudioAttributesCompatParcelizer(int i) {
                this.MediaMetadataCompat = i;
                this.AudioAttributesImplApi26Parcelizer = true;
            }

            public final void read(noTypeInfoBuilder.IconCompatParcelizer iconCompatParcelizer, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer;
                this.MediaBrowserCompatMediaItem = i;
                this.MediaMetadataCompat = i2;
                this.AudioAttributesImplApi21Parcelizer = i3;
                this.MediaDescriptionCompat = i4;
                this.AudioAttributesImplBaseParcelizer = z;
                this.IconCompatParcelizer = z2;
                this.read = z3;
                this.MediaBrowserCompatCustomActionResultReceiver = z4;
                this.MediaBrowserCompatItemReceiver = i5;
                this.RatingCompat = i6;
                this.write = i7;
                this.RemoteActionCompatParcelizer = i8;
                this.AudioAttributesCompatParcelizer = i9;
                this.MediaBrowserCompatSearchResultReceiver = true;
                this.AudioAttributesImplApi26Parcelizer = true;
            }

            public final boolean IconCompatParcelizer() {
                if (!this.AudioAttributesImplApi26Parcelizer) {
                    return false;
                }
                int i = this.MediaMetadataCompat;
                return i == 7 || i == 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean write(read readVar) {
                int i;
                int i2;
                boolean z;
                if (!this.MediaBrowserCompatSearchResultReceiver) {
                    return false;
                }
                if (!readVar.MediaBrowserCompatSearchResultReceiver) {
                    return true;
                }
                noTypeInfoBuilder.IconCompatParcelizer iconCompatParcelizer = (noTypeInfoBuilder.IconCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
                noTypeInfoBuilder.IconCompatParcelizer iconCompatParcelizer2 = (noTypeInfoBuilder.IconCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(readVar.handleMediaPlayPauseIfPendingOnHandler);
                return (this.AudioAttributesImplApi21Parcelizer == readVar.AudioAttributesImplApi21Parcelizer && this.MediaDescriptionCompat == readVar.MediaDescriptionCompat && this.AudioAttributesImplBaseParcelizer == readVar.AudioAttributesImplBaseParcelizer && (!this.IconCompatParcelizer || !readVar.IconCompatParcelizer || this.read == readVar.read) && (((i = this.MediaBrowserCompatMediaItem) == (i2 = readVar.MediaBrowserCompatMediaItem) || (i != 0 && i2 != 0)) && ((iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver != 0 || iconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver != 0 || (this.RatingCompat == readVar.RatingCompat && this.write == readVar.write)) && ((iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver != 1 || iconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver != 1 || (this.RemoteActionCompatParcelizer == readVar.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == readVar.AudioAttributesCompatParcelizer)) && (z = this.MediaBrowserCompatCustomActionResultReceiver) == readVar.MediaBrowserCompatCustomActionResultReceiver && (!z || this.MediaBrowserCompatItemReceiver == readVar.MediaBrowserCompatItemReceiver))))) ? false : true;
            }
        }
    }
}
