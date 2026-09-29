package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinKeySerializersKt;
import kotlin.KotlinModuleCompanion;
import kotlin.Metadata;
import kotlin.getInstanceParameter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u000f\u0018B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u000f\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\r\u0010\u000f\u001a\u00020\u001c¢\u0006\u0004\b\u000f\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u000b\u001a\u00020\u0015¢\u0006\u0004\b\u0012\u0010!J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b\u001a\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010\u001e\u001a\u00020\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bH\u0002¢\u0006\u0004\b\u001e\u0010'R\u0014\u0010\u001e\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,R$\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010)R$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b\u001e\u0010)R\u0014\u0010*\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010)R$\u00100\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b\u0012\u0010)"}, d2 = {"Lo/KotlinModuleKt;", "", "T", "Lo/KotlinModuleWhenMappings;", "Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;", "p0", "<init>", "(Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;)V", "", "Lo/KotlinSerializersKt;", "", "p1", "p2", "(Ljava/util/List;II)V", "Lo/getInstanceParameter$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(I)Lo/getInstanceParameter$IconCompatParcelizer;", "", "write", "(I)V", "Lo/KotlinModuleCompanion$AudioAttributesCompatParcelizer;", "Lo/KotlinModuleKt$RemoteActionCompatParcelizer;", "(Lo/KotlinModuleCompanion$AudioAttributesCompatParcelizer;Lo/KotlinModuleKt$RemoteActionCompatParcelizer;)V", "Lo/newEncryptedObject;", "RemoteActionCompatParcelizer", "(Lo/newEncryptedObject;)I", "read", "(I)Ljava/lang/Object;", "Lo/getInstanceParameter$AudioAttributesCompatParcelizer;", "()Lo/getInstanceParameter$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;Lo/KotlinModuleKt$RemoteActionCompatParcelizer;)V", "Lo/KotlinModuleCompanion;", "(Lo/KotlinModuleCompanion;Lo/KotlinModuleKt$RemoteActionCompatParcelizer;)V", "Lo/getDefaultsjackson_module_kotlin;", "()Lo/getDefaultsjackson_module_kotlin;", "", "toString", "()Ljava/lang/String;", "(Ljava/util/List;)I", "AudioAttributesImplApi21Parcelizer", "()I", "MediaBrowserCompatCustomActionResultReceiver", "", "Ljava/util/List;", "I", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KotlinModuleKt<T> implements KotlinModuleWhenMappings<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KotlinModuleKt<Object> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int write;
    private int RemoteActionCompatParcelizer;
    private final List<KotlinSerializersKt<T>> read;

    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(int i);

        void AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, KotlinKeySerializersKt kotlinKeySerializersKt);

        void IconCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(int i);

        void read(KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2);
    }

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public KotlinModuleKt(List<KotlinSerializersKt<T>> list, int i, int i2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list);
        this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer(list);
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KotlinModuleKt(KotlinModuleCompanion.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer(), remoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer());
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private final int AudioAttributesImplApi21Parcelizer() {
        Integer numAudioAttributesImplApi21Parcelizer = getOrderDetails.AudioAttributesImplApi21Parcelizer(((KotlinSerializersKt) IntermediateLoginResponseBody.RatingCompat((List) this.read)).getRemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.write(numAudioAttributesImplApi21Parcelizer);
        return numAudioAttributesImplApi21Parcelizer.intValue();
    }

    private final int MediaBrowserCompatCustomActionResultReceiver() {
        Integer numMediaBrowserCompatItemReceiver = getOrderDetails.MediaBrowserCompatItemReceiver(((KotlinSerializersKt) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.read)).getRemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.write(numMediaBrowserCompatItemReceiver);
        return numMediaBrowserCompatItemReceiver.intValue();
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    private int getWrite() {
        return this.write;
    }

    private final void write(int p0) {
        if (p0 < 0 || p0 >= AudioAttributesImplApi26Parcelizer()) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(p0);
            sb.append(", Size: ");
            sb.append(AudioAttributesImplApi26Parcelizer());
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final String toString() {
        int audioAttributesImplBaseParcelizer = getAudioAttributesImplBaseParcelizer();
        ArrayList arrayList = new ArrayList(audioAttributesImplBaseParcelizer);
        for (int i = 0; i < audioAttributesImplBaseParcelizer; i++) {
            arrayList.add(RemoteActionCompatParcelizer(i));
        }
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, null, null, null, 0, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(getRemoteActionCompatParcelizer());
        sb.append(" placeholders), ");
        sb.append(strRemoteActionCompatParcelizer);
        sb.append(", (");
        sb.append(getWrite());
        sb.append(" placeholders)]");
        return sb.toString();
    }

    public final T read(int p0) {
        write(p0);
        int remoteActionCompatParcelizer = p0 - getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer < 0 || remoteActionCompatParcelizer >= getAudioAttributesImplBaseParcelizer()) {
            return null;
        }
        return RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
    }

    public final getDefaultsjackson_module_kotlin<T> read() {
        int remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        int write2 = getWrite();
        List<KotlinSerializersKt<T>> list = this.read;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((KotlinSerializersKt) it.next()).AudioAttributesCompatParcelizer());
        }
        return new getDefaultsjackson_module_kotlin<>(remoteActionCompatParcelizer, write2, arrayList);
    }

    private T RemoteActionCompatParcelizer(int p0) {
        int size = this.read.size();
        int i = 0;
        while (i < size) {
            int size2 = this.read.get(i).AudioAttributesCompatParcelizer().size();
            if (size2 > p0) {
                break;
            }
            p0 -= size2;
            i++;
        }
        return this.read.get(i).AudioAttributesCompatParcelizer().get(p0);
    }

    private int AudioAttributesImplApi26Parcelizer() {
        return getRemoteActionCompatParcelizer() + getAudioAttributesImplBaseParcelizer() + getWrite();
    }

    private static int IconCompatParcelizer(List<KotlinSerializersKt<T>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((KotlinSerializersKt) it.next()).AudioAttributesCompatParcelizer().size();
        }
        return size;
    }

    public final void write(KotlinModuleCompanion<T> p0, RemoteActionCompatParcelizer p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 instanceof KotlinModuleCompanion.RemoteActionCompatParcelizer) {
            IconCompatParcelizer((KotlinModuleCompanion.RemoteActionCompatParcelizer) p0, p1);
            return;
        }
        if (p0 instanceof KotlinModuleCompanion.AudioAttributesCompatParcelizer) {
            AudioAttributesCompatParcelizer((KotlinModuleCompanion.AudioAttributesCompatParcelizer) p0, p1);
        } else if (p0 instanceof KotlinModuleCompanion.write) {
            KotlinModuleCompanion.write writeVar = (KotlinModuleCompanion.write) p0;
            p1.read(writeVar.getAudioAttributesCompatParcelizer(), writeVar.getRemoteActionCompatParcelizer());
        } else if (p0 instanceof KotlinModuleCompanion.read) {
            throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
    }

    public final getInstanceParameter.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
        int audioAttributesImplBaseParcelizer = getAudioAttributesImplBaseParcelizer() / 2;
        return new getInstanceParameter.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer, audioAttributesImplBaseParcelizer, AudioAttributesImplApi21Parcelizer(), MediaBrowserCompatCustomActionResultReceiver());
    }

    public final getInstanceParameter.IconCompatParcelizer AudioAttributesCompatParcelizer(int p0) {
        int i = 0;
        int remoteActionCompatParcelizer = p0 - getRemoteActionCompatParcelizer();
        while (remoteActionCompatParcelizer >= this.read.get(i).AudioAttributesCompatParcelizer().size() && i < IntermediateLoginResponseBody.write((List) this.read)) {
            remoteActionCompatParcelizer -= this.read.get(i).AudioAttributesCompatParcelizer().size();
            i++;
        }
        KotlinSerializersKt<T> kotlinSerializersKt = this.read.get(i);
        int remoteActionCompatParcelizer2 = getRemoteActionCompatParcelizer();
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int write2 = getWrite();
        return kotlinSerializersKt.read(remoteActionCompatParcelizer, p0 - remoteActionCompatParcelizer2, ((iAudioAttributesImplApi26Parcelizer - p0) - write2) - 1, AudioAttributesImplApi21Parcelizer(), MediaBrowserCompatCustomActionResultReceiver());
    }

    private final void IconCompatParcelizer(KotlinModuleCompanion.RemoteActionCompatParcelizer<T> p0, RemoteActionCompatParcelizer p1) {
        int iIconCompatParcelizer = IconCompatParcelizer(p0.AudioAttributesCompatParcelizer());
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int i = read.IconCompatParcelizer[p0.getAudioAttributesCompatParcelizer().ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i == 2) {
            int iMin = Math.min(getRemoteActionCompatParcelizer(), iIconCompatParcelizer);
            getRemoteActionCompatParcelizer();
            int i2 = iIconCompatParcelizer - iMin;
            this.read.addAll(0, p0.AudioAttributesCompatParcelizer());
            this.AudioAttributesImplBaseParcelizer = getAudioAttributesImplBaseParcelizer() + iIconCompatParcelizer;
            this.RemoteActionCompatParcelizer = p0.getAudioAttributesImplApi26Parcelizer();
            p1.AudioAttributesCompatParcelizer(iMin);
            p1.RemoteActionCompatParcelizer(i2);
            int iAudioAttributesImplApi26Parcelizer2 = (AudioAttributesImplApi26Parcelizer() - iAudioAttributesImplApi26Parcelizer) - i2;
            if (iAudioAttributesImplApi26Parcelizer2 > 0) {
                p1.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer2);
            } else if (iAudioAttributesImplApi26Parcelizer2 < 0) {
                p1.IconCompatParcelizer(-iAudioAttributesImplApi26Parcelizer2);
            }
        } else if (i == 3) {
            int iMin2 = Math.min(getWrite(), iIconCompatParcelizer);
            getRemoteActionCompatParcelizer();
            getAudioAttributesImplBaseParcelizer();
            int i3 = iIconCompatParcelizer - iMin2;
            List<KotlinSerializersKt<T>> list = this.read;
            list.addAll(list.size(), p0.AudioAttributesCompatParcelizer());
            this.AudioAttributesImplBaseParcelizer = getAudioAttributesImplBaseParcelizer() + iIconCompatParcelizer;
            this.write = p0.getAudioAttributesImplBaseParcelizer();
            p1.AudioAttributesCompatParcelizer(iMin2);
            p1.RemoteActionCompatParcelizer(i3);
            int iAudioAttributesImplApi26Parcelizer3 = (AudioAttributesImplApi26Parcelizer() - iAudioAttributesImplApi26Parcelizer) - i3;
            if (iAudioAttributesImplApi26Parcelizer3 > 0) {
                AudioAttributesImplApi26Parcelizer();
                p1.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer3);
            } else if (iAudioAttributesImplApi26Parcelizer3 < 0) {
                AudioAttributesImplApi26Parcelizer();
                p1.IconCompatParcelizer(-iAudioAttributesImplApi26Parcelizer3);
            }
        }
        p1.read(p0.getMediaBrowserCompatCustomActionResultReceiver(), p0.getIconCompatParcelizer());
    }

    private final int RemoteActionCompatParcelizer(newEncryptedObject p0) {
        Iterator<KotlinSerializersKt<T>> it = this.read.iterator();
        int size = 0;
        while (it.hasNext()) {
            KotlinSerializersKt<T> next = it.next();
            int[] remoteActionCompatParcelizer = next.getRemoteActionCompatParcelizer();
            int length = remoteActionCompatParcelizer.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (p0.write(remoteActionCompatParcelizer[i])) {
                    size += next.AudioAttributesCompatParcelizer().size();
                    it.remove();
                    break;
                }
                i++;
            }
        }
        return size;
    }

    private final void AudioAttributesCompatParcelizer(KotlinModuleCompanion.AudioAttributesCompatParcelizer<T> p0, RemoteActionCompatParcelizer p1) {
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (p0.AudioAttributesCompatParcelizer() == accessgetStaticJsonKeyGetter.PREPEND) {
            int remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer = getAudioAttributesImplBaseParcelizer() - RemoteActionCompatParcelizer(new newEncryptedObject(p0.RemoteActionCompatParcelizer(), p0.IconCompatParcelizer()));
            this.RemoteActionCompatParcelizer = p0.write();
            int iAudioAttributesImplApi26Parcelizer2 = AudioAttributesImplApi26Parcelizer() - iAudioAttributesImplApi26Parcelizer;
            if (iAudioAttributesImplApi26Parcelizer2 > 0) {
                p1.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer2);
            } else if (iAudioAttributesImplApi26Parcelizer2 < 0) {
                p1.IconCompatParcelizer(-iAudioAttributesImplApi26Parcelizer2);
            }
            int iWrite = p0.write() - Math.max(0, remoteActionCompatParcelizer + iAudioAttributesImplApi26Parcelizer2);
            if (iWrite > 0) {
                p1.AudioAttributesCompatParcelizer(iWrite);
            }
            accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter = accessgetStaticJsonKeyGetter.PREPEND;
            KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
            p1.AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetter, KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write());
            return;
        }
        int write2 = getWrite();
        this.AudioAttributesImplBaseParcelizer = getAudioAttributesImplBaseParcelizer() - RemoteActionCompatParcelizer(new newEncryptedObject(p0.RemoteActionCompatParcelizer(), p0.IconCompatParcelizer()));
        this.write = p0.write();
        int iAudioAttributesImplApi26Parcelizer3 = AudioAttributesImplApi26Parcelizer() - iAudioAttributesImplApi26Parcelizer;
        if (iAudioAttributesImplApi26Parcelizer3 > 0) {
            p1.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer3);
        } else if (iAudioAttributesImplApi26Parcelizer3 < 0) {
            p1.IconCompatParcelizer(-iAudioAttributesImplApi26Parcelizer3);
        }
        int iWrite2 = p0.write() - (write2 - (iAudioAttributesImplApi26Parcelizer3 < 0 ? Math.min(write2, -iAudioAttributesImplApi26Parcelizer3) : 0));
        if (iWrite2 > 0) {
            AudioAttributesImplApi26Parcelizer();
            p0.write();
            p1.AudioAttributesCompatParcelizer(iWrite2);
        }
        accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter2 = accessgetStaticJsonKeyGetter.APPEND;
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion2 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        p1.AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetter2, KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write());
    }

    /* JADX INFO: renamed from: o.KotlinModuleKt$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/KotlinModuleKt$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "T", "Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;", "p0", "Lo/KotlinModuleKt;", "read", "(Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;)Lo/KotlinModuleKt;", "write", "Lo/KotlinModuleKt;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static <T> KotlinModuleKt<T> read(KotlinModuleCompanion.RemoteActionCompatParcelizer<T> p0) {
            if (p0 == null) {
                KotlinModuleKt<T> kotlinModuleKt = KotlinModuleKt.write;
                toMagicModuleMetaRepoModel.read(kotlinModuleKt, "");
                return kotlinModuleKt;
            }
            return new KotlinModuleKt<>(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = KotlinModuleCompanion.RemoteActionCompatParcelizer.write;
        write = new KotlinModuleKt<>(KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer.read());
    }
}
