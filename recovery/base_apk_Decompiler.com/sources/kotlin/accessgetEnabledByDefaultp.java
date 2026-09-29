package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinKeySerializersKt;
import kotlin.KotlinModuleCompanion;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetEnabledByDefaultp<T> {
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private boolean read;
    private KotlinKeySerializers write;
    private final setCardContent<KotlinSerializersKt<T>> AudioAttributesCompatParcelizer = new setCardContent<>();
    private final setupModuleaddMixIn MediaBrowserCompatItemReceiver = new setupModuleaddMixIn();

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public final void IconCompatParcelizer(KotlinModuleCompanion<T> kotlinModuleCompanion) {
        toMagicModuleMetaRepoModel.write(kotlinModuleCompanion, "");
        this.read = true;
        if (kotlinModuleCompanion instanceof KotlinModuleCompanion.RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer((KotlinModuleCompanion.RemoteActionCompatParcelizer) kotlinModuleCompanion);
            return;
        }
        if (kotlinModuleCompanion instanceof KotlinModuleCompanion.AudioAttributesCompatParcelizer) {
            read((KotlinModuleCompanion.AudioAttributesCompatParcelizer) kotlinModuleCompanion);
        } else if (kotlinModuleCompanion instanceof KotlinModuleCompanion.write) {
            read((KotlinModuleCompanion.write) kotlinModuleCompanion);
        } else if (kotlinModuleCompanion instanceof KotlinModuleCompanion.read) {
            RemoteActionCompatParcelizer((KotlinModuleCompanion.read) kotlinModuleCompanion);
        }
    }

    private final void read(KotlinModuleCompanion.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        setupModuleaddMixIn setupmoduleaddmixin = this.MediaBrowserCompatItemReceiver;
        accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetterAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        setupmoduleaddmixin.AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetterAudioAttributesCompatParcelizer, KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write());
        int i = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().ordinal()];
        int i2 = 0;
        if (i == 1) {
            this.IconCompatParcelizer = audioAttributesCompatParcelizer.write();
            int i3 = audioAttributesCompatParcelizer.read();
            while (i2 < i3) {
                this.AudioAttributesCompatParcelizer.removeFirst();
                i2++;
            }
            return;
        }
        if (i == 2) {
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer.write();
            int i4 = audioAttributesCompatParcelizer.read();
            while (i2 < i4) {
                this.AudioAttributesCompatParcelizer.removeLast();
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Page drop type must be prepend or append");
    }

    private final void RemoteActionCompatParcelizer(KotlinModuleCompanion.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this.MediaBrowserCompatItemReceiver.read(remoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver());
        this.write = remoteActionCompatParcelizer.getIconCompatParcelizer();
        int i = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer().ordinal()];
        if (i == 1) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
            Iterator<Integer> it = getQues.read(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.AudioAttributesCompatParcelizer.addFirst(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer().get(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer()));
            }
            return;
        }
        if (i == 2) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer();
            this.AudioAttributesCompatParcelizer.addAll(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        } else if (i == 3) {
            this.AudioAttributesCompatParcelizer.clear();
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer();
            this.IconCompatParcelizer = remoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
            this.AudioAttributesCompatParcelizer.addAll(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        }
    }

    private final void read(KotlinModuleCompanion.write<T> writeVar) {
        this.MediaBrowserCompatItemReceiver.read(writeVar.getAudioAttributesCompatParcelizer());
        this.write = writeVar.getRemoteActionCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer(KotlinModuleCompanion.read<T> readVar) {
        if (readVar.getAudioAttributesCompatParcelizer() != null) {
            this.MediaBrowserCompatItemReceiver.read(readVar.getAudioAttributesCompatParcelizer());
        }
        if (readVar.getRead() != null) {
            this.write = readVar.getRead();
        }
        this.AudioAttributesCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer.add(new KotlinSerializersKt<>(0, readVar.write()));
    }

    public final List<KotlinModuleCompanion<T>> read() {
        if (!this.read) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        KotlinKeySerializers kotlinKeySerializersWrite = this.MediaBrowserCompatItemReceiver.write();
        if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = KotlinModuleCompanion.RemoteActionCompatParcelizer.write;
            arrayList.add(KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer.read(IntermediateLoginResponseBody.onPlay(this.AudioAttributesCompatParcelizer), this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, kotlinKeySerializersWrite, this.write));
            return arrayList;
        }
        arrayList.add(new KotlinModuleCompanion.write(kotlinKeySerializersWrite, this.write));
        return arrayList;
    }
}
