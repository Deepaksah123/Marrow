package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import kotlin.C0170format;
import kotlin.keyFormat;
import kotlin.noTypeInfoBuilder;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class descendingIterator implements checkNotEmpty {
    private nonNullString AudioAttributesCompatParcelizer;
    private RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final pollFirst MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatSearchResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    private String write;
    private final boolean[] AudioAttributesImplBaseParcelizer = new boolean[3];
    private final offer MediaMetadataCompat = new offer(32);
    private final offer MediaDescriptionCompat = new offer(33);
    private final offer IconCompatParcelizer = new offer(34);
    private final offer MediaBrowserCompatCustomActionResultReceiver = new offer(39);
    private final offer MediaBrowserCompatMediaItem = new offer(40);
    private long read = C.TIME_UNSET;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi26Parcelizer = new AsPropertyTypeDeserializer();

    public descendingIterator(pollFirst pollfirst) {
        this.MediaBrowserCompatItemReceiver = pollfirst;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.MediaBrowserCompatSearchResultReceiver = 0L;
        this.read = C.TIME_UNSET;
        noTypeInfoBuilder.read(this.AudioAttributesImplBaseParcelizer);
        this.MediaMetadataCompat.write();
        this.MediaDescriptionCompat.write();
        this.IconCompatParcelizer.write();
        this.MediaBrowserCompatCustomActionResultReceiver.write();
        this.MediaBrowserCompatMediaItem.write();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.write();
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.write = writeVar.IconCompatParcelizer();
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 2);
        this.AudioAttributesCompatParcelizer = nonnullstringIconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = new RemoteActionCompatParcelizer(nonnullstringIconCompatParcelizer);
        this.MediaBrowserCompatItemReceiver.write(findrawsupertypes, writeVar);
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.read = j;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        read();
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int iWrite = asPropertyTypeDeserializer.write();
            int i = asPropertyTypeDeserializer.read();
            byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
            this.MediaBrowserCompatSearchResultReceiver += (long) asPropertyTypeDeserializer.IconCompatParcelizer();
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, asPropertyTypeDeserializer.IconCompatParcelizer());
            while (iWrite < i) {
                int i2 = noTypeInfoBuilder.read(bArrRemoteActionCompatParcelizer, iWrite, i, this.AudioAttributesImplBaseParcelizer);
                if (i2 == i) {
                    RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, iWrite, i);
                    return;
                }
                int iRemoteActionCompatParcelizer = noTypeInfoBuilder.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, i2);
                int i3 = i2 - iWrite;
                if (i3 > 0) {
                    RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, iWrite, i2);
                }
                int i4 = i - i2;
                long j = this.MediaBrowserCompatSearchResultReceiver - ((long) i4);
                write(j, i4, i3 < 0 ? -i3 : 0, this.read);
                read(j, i4, iRemoteActionCompatParcelizer, this.read);
                iWrite = i2 + 3;
            }
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
        read();
        if (z) {
            this.AudioAttributesImplApi21Parcelizer.write(this.MediaBrowserCompatSearchResultReceiver);
        }
    }

    private void read(long j, int i, int i2, long j2) {
        this.AudioAttributesImplApi21Parcelizer.write(j, i, i2, j2, this.RemoteActionCompatParcelizer);
        if (!this.RemoteActionCompatParcelizer) {
            this.MediaMetadataCompat.write(i2);
            this.MediaDescriptionCompat.write(i2);
            this.IconCompatParcelizer.write(i2);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.write(i2);
        this.MediaBrowserCompatMediaItem.write(i2);
    }

    private void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(bArr, i, i2);
        if (!this.RemoteActionCompatParcelizer) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(bArr, i, i2);
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(bArr, i, i2);
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(bArr, i, i2);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(bArr, i, i2);
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(bArr, i, i2);
    }

    private void write(long j, int i, int i2, long j2) {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(j, i, this.RemoteActionCompatParcelizer);
        if (!this.RemoteActionCompatParcelizer) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(i2);
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(i2);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(i2);
            if (this.MediaMetadataCompat.read() && this.MediaDescriptionCompat.read() && this.IconCompatParcelizer.read()) {
                this.AudioAttributesCompatParcelizer.write(IconCompatParcelizer(this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.IconCompatParcelizer));
                this.RemoteActionCompatParcelizer = true;
            }
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(i2)) {
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read, noTypeInfoBuilder.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read, this.MediaBrowserCompatCustomActionResultReceiver.write));
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer(5);
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(j2, this.AudioAttributesImplApi26Parcelizer);
        }
        if (this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i2)) {
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatMediaItem.read, noTypeInfoBuilder.IconCompatParcelizer(this.MediaBrowserCompatMediaItem.read, this.MediaBrowserCompatMediaItem.write));
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer(5);
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(j2, this.AudioAttributesImplApi26Parcelizer);
        }
    }

    private static C0170format IconCompatParcelizer(String str, offer offerVar, offer offerVar2, offer offerVar3) {
        byte[] bArr = new byte[offerVar.write + offerVar2.write + offerVar3.write];
        System.arraycopy(offerVar.read, 0, bArr, 0, offerVar.write);
        System.arraycopy(offerVar2.read, 0, bArr, offerVar.write, offerVar2.write);
        System.arraycopy(offerVar3.read, 0, bArr, offerVar.write + offerVar2.write, offerVar3.write);
        noTypeInfoBuilder.write writeVarIconCompatParcelizer = noTypeInfoBuilder.IconCompatParcelizer(offerVar2.read, 3, offerVar2.write);
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str).AudioAttributesImplApi26Parcelizer(MimeTypes.VIDEO_H265).RemoteActionCompatParcelizer(inclusion.write(writeVarIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver, writeVarIconCompatParcelizer.MediaMetadataCompat, writeVarIconCompatParcelizer.AudioAttributesImplApi26Parcelizer, writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer, writeVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer, writeVarIconCompatParcelizer.MediaBrowserCompatItemReceiver)).onFastForward(writeVarIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).MediaBrowserCompatItemReceiver(writeVarIconCompatParcelizer.MediaBrowserCompatMediaItem).IconCompatParcelizer(new keyFormat.read().IconCompatParcelizer(writeVarIconCompatParcelizer.IconCompatParcelizer).read(writeVarIconCompatParcelizer.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(writeVarIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer(writeVarIconCompatParcelizer.write + 8).write(writeVarIconCompatParcelizer.read + 8).write()).write(writeVarIconCompatParcelizer.RatingCompat).MediaMetadataCompat(writeVarIconCompatParcelizer.MediaDescriptionCompat).RemoteActionCompatParcelizer(Collections.singletonList(bArr)).IconCompatParcelizer();
    }

    private void read() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    static final class RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private final nonNullString AudioAttributesImplApi21Parcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private long MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private long MediaBrowserCompatSearchResultReceiver;
        private long RatingCompat;
        private boolean RemoteActionCompatParcelizer;
        private boolean read;
        private int write;

        private static boolean IconCompatParcelizer(int i) {
            return i < 32 || i == 40;
        }

        private static boolean read(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        public RemoteActionCompatParcelizer(nonNullString nonnullstring) {
            this.AudioAttributesImplApi21Parcelizer = nonnullstring;
        }

        public final void write() {
            this.RemoteActionCompatParcelizer = false;
            this.AudioAttributesCompatParcelizer = false;
            this.read = false;
            this.AudioAttributesImplApi26Parcelizer = false;
            this.AudioAttributesImplBaseParcelizer = false;
        }

        public final void write(long j, int i, int i2, long j2, boolean z) {
            this.AudioAttributesCompatParcelizer = false;
            this.read = false;
            this.MediaBrowserCompatItemReceiver = j2;
            this.write = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = j;
            if (!IconCompatParcelizer(i2)) {
                if (this.AudioAttributesImplApi26Parcelizer && !this.AudioAttributesImplBaseParcelizer) {
                    if (z) {
                        RemoteActionCompatParcelizer(i);
                    }
                    this.AudioAttributesImplApi26Parcelizer = false;
                }
                if (read(i2)) {
                    this.read = !this.AudioAttributesImplBaseParcelizer;
                    this.AudioAttributesImplBaseParcelizer = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.IconCompatParcelizer = z2;
            this.RemoteActionCompatParcelizer = z2 || i2 <= 9;
        }

        public final void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
            if (this.RemoteActionCompatParcelizer) {
                int i3 = this.write;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.AudioAttributesCompatParcelizer = (bArr[i4] & 128) != 0;
                    this.RemoteActionCompatParcelizer = false;
                } else {
                    this.write = i3 + (i2 - i);
                }
            }
        }

        public final void RemoteActionCompatParcelizer(long j, int i, boolean z) {
            if (this.AudioAttributesImplBaseParcelizer && this.AudioAttributesCompatParcelizer) {
                this.MediaBrowserCompatMediaItem = this.IconCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = false;
            } else if (this.read || this.AudioAttributesCompatParcelizer) {
                if (z && this.AudioAttributesImplApi26Parcelizer) {
                    RemoteActionCompatParcelizer(i + ((int) (j - this.MediaBrowserCompatCustomActionResultReceiver)));
                }
                this.RatingCompat = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatSearchResultReceiver = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatMediaItem = this.IconCompatParcelizer;
                this.AudioAttributesImplApi26Parcelizer = true;
            }
        }

        public final void write(long j) {
            this.MediaBrowserCompatMediaItem = this.IconCompatParcelizer;
            RemoteActionCompatParcelizer((int) (j - this.MediaBrowserCompatCustomActionResultReceiver));
            this.RatingCompat = this.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatCustomActionResultReceiver = j;
            RemoteActionCompatParcelizer(0);
            this.AudioAttributesImplApi26Parcelizer = false;
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
            long j = this.MediaBrowserCompatSearchResultReceiver;
            if (j == C.TIME_UNSET) {
                return;
            }
            boolean z = this.MediaBrowserCompatMediaItem;
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(j, z ? 1 : 0, (int) (this.MediaBrowserCompatCustomActionResultReceiver - this.RatingCompat), i, null);
        }
    }
}
