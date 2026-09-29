package kotlin;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 <2\u00020\u0001:\u0002;<B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u000eH\u0002J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000bH\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000bH\u0017J\b\u0010/\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000bH\u0017J\u0010\u00105\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u00106\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u00107\u001a\u00020\u0019H\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020:H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0016j\b\u0012\u0004\u0012\u00020\u000e`\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010*\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00102\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006="}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "provider", "Landroidx/lifecycle/LifecycleOwner;", "enforceMainThread", "", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "(Landroidx/lifecycle/LifecycleOwner;)V", "observerMap", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/lifecycle/Lifecycle$State;", "lifecycleOwner", "Ljava/lang/ref/WeakReference;", "addingObserverCounter", "", "handlingEvent", "newEventOccurred", "parentStates", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "markState", "", "currentState", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "(Landroidx/lifecycle/Lifecycle$State;)V", "_currentStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "handleLifecycleEvent", "event", "Landroidx/lifecycle/Lifecycle$Event;", "moveToState", "next", "isSynced", "()Z", "calculateTargetState", "observer", "addObserver", "popParentState", "pushParentState", "removeObserver", "observerCount", "getObserverCount", "()I", "forwardPass", "backwardPass", "sync", "enforceMainThreadIfNeeded", "methodName", "", "ObserverWithState", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class getSetterUnchecked extends anyIgnorals {
    public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(null);
    private final boolean AudioAttributesCompatParcelizer;
    private ArrayList<anyIgnorals.write> AudioAttributesImplApi21Parcelizer;
    private anyIgnorals.write AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<anyIgnorals.write> IconCompatParcelizer;
    private final WeakReference<hasGetter> MediaBrowserCompatCustomActionResultReceiver;
    private setPrimaryBackground<findExplicitNames, read> MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private boolean write;

    private getSetterUnchecked(hasGetter hasgetter, boolean z) {
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = new setPrimaryBackground<>();
        this.AudioAttributesImplApi26Parcelizer = anyIgnorals.write.IconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        this.MediaBrowserCompatCustomActionResultReceiver = new WeakReference<>(hasgetter);
        this.IconCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(anyIgnorals.write.IconCompatParcelizer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getSetterUnchecked(hasGetter hasgetter) {
        this(hasgetter, true);
        toMagicModuleMetaRepoModel.write(hasgetter, "");
    }

    @Override // kotlin.anyIgnorals
    /* JADX INFO: renamed from: read, reason: from getter */
    public final anyIgnorals.write getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(anyIgnorals.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        RemoteActionCompatParcelizer("setCurrentState");
        IconCompatParcelizer(writeVar);
    }

    public final void RemoteActionCompatParcelizer(anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        RemoteActionCompatParcelizer("handleLifecycleEvent");
        IconCompatParcelizer(readVar.IconCompatParcelizer());
    }

    private final void IconCompatParcelizer(anyIgnorals.write writeVar) {
        if (this.AudioAttributesImplApi26Parcelizer != writeVar) {
            getGetterUnchecked.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.get(), this.AudioAttributesImplApi26Parcelizer, writeVar);
            this.AudioAttributesImplApi26Parcelizer = writeVar;
            if (this.write || this.RemoteActionCompatParcelizer != 0) {
                this.AudioAttributesImplBaseParcelizer = true;
                return;
            }
            this.write = true;
            RemoteActionCompatParcelizer();
            this.write = false;
            if (this.AudioAttributesImplApi26Parcelizer == anyIgnorals.write.AudioAttributesCompatParcelizer) {
                this.MediaBrowserCompatItemReceiver = new setPrimaryBackground<>();
            }
        }
    }

    private final boolean AudioAttributesCompatParcelizer() {
        if (this.MediaBrowserCompatItemReceiver.read() == 0) {
            return true;
        }
        Map.Entry<findExplicitNames, read> entryRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.write(entryRemoteActionCompatParcelizer);
        anyIgnorals.write writeVarRemoteActionCompatParcelizer = entryRemoteActionCompatParcelizer.getValue().RemoteActionCompatParcelizer();
        Map.Entry<findExplicitNames, read> entryAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(entryAudioAttributesCompatParcelizer);
        anyIgnorals.write writeVarRemoteActionCompatParcelizer2 = entryAudioAttributesCompatParcelizer.getValue().RemoteActionCompatParcelizer();
        return writeVarRemoteActionCompatParcelizer == writeVarRemoteActionCompatParcelizer2 && this.AudioAttributesImplApi26Parcelizer == writeVarRemoteActionCompatParcelizer2;
    }

    private final anyIgnorals.write read(findExplicitNames findexplicitnames) {
        read value;
        Map.Entry<findExplicitNames, read> entryIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(findexplicitnames);
        anyIgnorals.write writeVar = null;
        anyIgnorals.write writeVarRemoteActionCompatParcelizer = (entryIconCompatParcelizer == null || (value = entryIconCompatParcelizer.getValue()) == null) ? null : value.RemoteActionCompatParcelizer();
        if (!this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            writeVar = this.AudioAttributesImplApi21Parcelizer.get(r0.size() - 1);
        }
        return AudioAttributesCompatParcelizer.read(AudioAttributesCompatParcelizer.read(this.AudioAttributesImplApi26Parcelizer, writeVarRemoteActionCompatParcelizer), writeVar);
    }

    @Override // kotlin.anyIgnorals
    public final void IconCompatParcelizer(findExplicitNames findexplicitnames) {
        hasGetter hasgetter;
        toMagicModuleMetaRepoModel.write(findexplicitnames, "");
        RemoteActionCompatParcelizer("addObserver");
        read readVar = new read(findexplicitnames, this.AudioAttributesImplApi26Parcelizer == anyIgnorals.write.AudioAttributesCompatParcelizer ? anyIgnorals.write.AudioAttributesCompatParcelizer : anyIgnorals.write.IconCompatParcelizer);
        if (this.MediaBrowserCompatItemReceiver.read(findexplicitnames, readVar) != null || (hasgetter = this.MediaBrowserCompatCustomActionResultReceiver.get()) == null) {
            return;
        }
        boolean z = this.RemoteActionCompatParcelizer != 0 || this.write;
        anyIgnorals.write writeVar = read(findexplicitnames);
        this.RemoteActionCompatParcelizer++;
        while (readVar.RemoteActionCompatParcelizer().compareTo(writeVar) < 0 && this.MediaBrowserCompatItemReceiver.read(findexplicitnames)) {
            AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer());
            anyIgnorals.read.Companion companion = anyIgnorals.read.INSTANCE;
            anyIgnorals.read readVarAudioAttributesCompatParcelizer = anyIgnorals.read.Companion.AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer());
            if (readVarAudioAttributesCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder("no event up from ");
                sb.append(readVar.RemoteActionCompatParcelizer());
                throw new IllegalStateException(sb.toString());
            }
            readVar.write(hasgetter, readVarAudioAttributesCompatParcelizer);
            IconCompatParcelizer();
            writeVar = read(findexplicitnames);
        }
        if (!z) {
            RemoteActionCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer--;
    }

    private final void IconCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.remove(r1.size() - 1);
    }

    private final void AudioAttributesCompatParcelizer(anyIgnorals.write writeVar) {
        this.AudioAttributesImplApi21Parcelizer.add(writeVar);
    }

    @Override // kotlin.anyIgnorals
    public final void AudioAttributesCompatParcelizer(findExplicitNames findexplicitnames) {
        toMagicModuleMetaRepoModel.write(findexplicitnames, "");
        RemoteActionCompatParcelizer("removeObserver");
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(findexplicitnames);
    }

    private final void read(hasGetter hasgetter) {
        ActionBarContainer<findExplicitNames, read>.write writeVarWrite = this.MediaBrowserCompatItemReceiver.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(writeVarWrite, "");
        ActionBarContainer<findExplicitNames, read>.write writeVar = writeVarWrite;
        while (writeVar.hasNext() && !this.AudioAttributesImplBaseParcelizer) {
            Map.Entry next = writeVar.next();
            findExplicitNames findexplicitnames = (findExplicitNames) next.getKey();
            read readVar = (read) next.getValue();
            while (readVar.RemoteActionCompatParcelizer().compareTo(this.AudioAttributesImplApi26Parcelizer) < 0 && !this.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatItemReceiver.read(findexplicitnames)) {
                AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer());
                anyIgnorals.read.Companion companion = anyIgnorals.read.INSTANCE;
                anyIgnorals.read readVarAudioAttributesCompatParcelizer = anyIgnorals.read.Companion.AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer());
                if (readVarAudioAttributesCompatParcelizer == null) {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    sb.append(readVar.RemoteActionCompatParcelizer());
                    throw new IllegalStateException(sb.toString());
                }
                readVar.write(hasgetter, readVarAudioAttributesCompatParcelizer);
                IconCompatParcelizer();
            }
        }
    }

    private final void AudioAttributesCompatParcelizer(hasGetter hasgetter) {
        Iterator<Map.Entry<findExplicitNames, read>> itIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itIconCompatParcelizer, "");
        while (itIconCompatParcelizer.hasNext() && !this.AudioAttributesImplBaseParcelizer) {
            Map.Entry<findExplicitNames, read> next = itIconCompatParcelizer.next();
            toMagicModuleMetaRepoModel.write(next);
            findExplicitNames key = next.getKey();
            read value = next.getValue();
            while (value.RemoteActionCompatParcelizer().compareTo(this.AudioAttributesImplApi26Parcelizer) > 0 && !this.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatItemReceiver.read(key)) {
                anyIgnorals.read.Companion companion = anyIgnorals.read.INSTANCE;
                anyIgnorals.read readVarIconCompatParcelizer = anyIgnorals.read.Companion.IconCompatParcelizer(value.RemoteActionCompatParcelizer());
                if (readVarIconCompatParcelizer == null) {
                    StringBuilder sb = new StringBuilder("no event down from ");
                    sb.append(value.RemoteActionCompatParcelizer());
                    throw new IllegalStateException(sb.toString());
                }
                AudioAttributesCompatParcelizer(readVarIconCompatParcelizer.IconCompatParcelizer());
                value.write(hasgetter, readVarIconCompatParcelizer);
                IconCompatParcelizer();
            }
        }
    }

    private final void RemoteActionCompatParcelizer() {
        hasGetter hasgetter = this.MediaBrowserCompatCustomActionResultReceiver.get();
        if (hasgetter == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!AudioAttributesCompatParcelizer()) {
            this.AudioAttributesImplBaseParcelizer = false;
            anyIgnorals.write writeVar = this.AudioAttributesImplApi26Parcelizer;
            Map.Entry<findExplicitNames, read> entryRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(entryRemoteActionCompatParcelizer);
            if (writeVar.compareTo(entryRemoteActionCompatParcelizer.getValue().RemoteActionCompatParcelizer()) < 0) {
                AudioAttributesCompatParcelizer(hasgetter);
            }
            Map.Entry<findExplicitNames, read> entryAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            if (!this.AudioAttributesImplBaseParcelizer && entryAudioAttributesCompatParcelizer != null && this.AudioAttributesImplApi26Parcelizer.compareTo(entryAudioAttributesCompatParcelizer.getValue().RemoteActionCompatParcelizer()) > 0) {
                read(hasgetter);
            }
        }
        this.AudioAttributesImplBaseParcelizer = false;
        this.IconCompatParcelizer.write(getAudioAttributesImplApi26Parcelizer());
    }

    private final void RemoteActionCompatParcelizer(String str) {
        if (!this.AudioAttributesCompatParcelizer || mergeAnnotations.read()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" must be called on the main thread");
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* synthetic */ getSetterUnchecked(hasGetter hasgetter, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(hasgetter, z);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class read {
        private findAccess AudioAttributesCompatParcelizer;
        private anyIgnorals.write write;

        public read(findExplicitNames findexplicitnames, anyIgnorals.write writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            toMagicModuleMetaRepoModel.write(findexplicitnames);
            this.AudioAttributesCompatParcelizer = removeNonVisible.write(findexplicitnames);
            this.write = writeVar;
        }

        public final anyIgnorals.write RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final void write(hasGetter hasgetter, anyIgnorals.read readVar) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            anyIgnorals.write writeVarIconCompatParcelizer = readVar.IconCompatParcelizer();
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getSetterUnchecked.read;
            this.write = AudioAttributesCompatParcelizer.read(this.write, writeVarIconCompatParcelizer);
            findAccess findaccess = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(hasgetter);
            findaccess.read(hasgetter, readVar);
            this.write = writeVarIconCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getSetterUnchecked$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/hasGetter;", "p0", "Lo/getSetterUnchecked;", "RemoteActionCompatParcelizer", "(Lo/hasGetter;)Lo/getSetterUnchecked;", "Lo/anyIgnorals$write;", "p1", "read", "(Lo/anyIgnorals$write;Lo/anyIgnorals$write;)Lo/anyIgnorals$write;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static getSetterUnchecked RemoteActionCompatParcelizer(hasGetter p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getSetterUnchecked(p0, false, null);
        }

        @getMagicModuleMeta
        public static anyIgnorals.write read(anyIgnorals.write p0, anyIgnorals.write p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (p1 == null || p1.compareTo(p0) >= 0) ? p0 : p1;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
