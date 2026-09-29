package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0002\u001d\u0019BE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u001e\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010\u0019\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u001a\u0010\u001f\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010 "}, d2 = {"Lo/updateStateAndInformListeners;", "", "", "p0", "Lo/shouldHandleCommand;", "p1", "", "p2", "", "Lo/getPlaceholderState;", "p3", "Lo/handleClearVideoOutput;", "p4", "p5", "<init>", "(Ljava/lang/String;Lo/shouldHandleCommand;ZLjava/util/List;Lo/handleClearVideoOutput;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "write", "IconCompatParcelizer", "Lo/shouldHandleCommand;", "()Lo/shouldHandleCommand;", "RemoteActionCompatParcelizer", "Z", "AudioAttributesImplApi26Parcelizer", "()Z", "read", "Ljava/util/List;", "()Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "Lo/handleClearVideoOutput;", "()Lo/handleClearVideoOutput;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateStateAndInformListeners {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final handleClearVideoOutput write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final shouldHandleCommand<?> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<getPlaceholderState> RemoteActionCompatParcelizer;

    private updateStateAndInformListeners(String str, shouldHandleCommand<?> shouldhandlecommand, boolean z, List<getPlaceholderState> list, handleClearVideoOutput handleclearvideooutput, boolean z2) {
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = shouldhandlecommand;
        this.read = z;
        this.RemoteActionCompatParcelizer = list;
        this.write = handleclearvideooutput;
        this.AudioAttributesImplApi26Parcelizer = z2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final shouldHandleCommand<?> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final List<getPlaceholderState> read() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final handleClearVideoOutput getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((updateStateAndInformListeners) p0).IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomTemplate {\nname = ");
        sb.append(this.IconCompatParcelizer);
        sb.append(",\nisVisual = ");
        sb.append(this.read);
        sb.append(",\ntype = ");
        sb.append(this.write);
        sb.append(",\nargs = {\n");
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ",\n", null, null, 0, null, new getAnswerMap() { // from class: o.updateStateForPendingOperation
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return updateStateAndInformListeners.IconCompatParcelizer((getPlaceholderState) obj);
            }
        }, 30));
        sb.append("\n}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence IconCompatParcelizer(getPlaceholderState getplaceholderstate) {
        toMagicModuleMetaRepoModel.write(getplaceholderstate, "");
        StringBuilder sb = new StringBuilder("\t");
        sb.append(getplaceholderstate.AudioAttributesCompatParcelizer());
        sb.append(" = ");
        Object objWrite = getplaceholderstate.write();
        if (objWrite == null) {
            objWrite = getplaceholderstate.read();
        }
        sb.append(objWrite);
        return sb.toString();
    }

    public /* synthetic */ updateStateAndInformListeners(String str, shouldHandleCommand shouldhandlecommand, boolean z, List list, handleClearVideoOutput handleclearvideooutput, boolean z2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, shouldhandlecommand, z, list, handleclearvideooutput, z2);
    }

    public static final class RemoteActionCompatParcelizer extends write<handleDecreaseDeviceVolume, RemoteActionCompatParcelizer> {
        private final RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(boolean z) {
            super(handleClearVideoOutput.RemoteActionCompatParcelizer, true, null);
            this.RemoteActionCompatParcelizer = this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.updateStateAndInformListeners.write
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0004B\u0019\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u000eJ\u001d\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u000f\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\u000f\u001a\u00028\u00018%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010!R\u001c\u0010\u0019\u001a\u00020\u00078\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u0010\u0010 \"\u0004\b\u0010\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0001\u0001-"}, d2 = {"Lo/updateStateAndInformListeners$write;", "Lo/shouldHandleCommand;", "P", "T", "", "Lo/handleClearVideoOutput;", "p0", "", "p1", "<init>", "(Lo/handleClearVideoOutput;Z)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/updateStateAndInformListeners$write;", "(Ljava/lang/String;Ljava/lang/String;)Lo/updateStateAndInformListeners$write;", "RemoteActionCompatParcelizer", "read", "(Lo/shouldHandleCommand;)Lo/updateStateAndInformListeners$write;", "Lo/updateStateAndInformListeners;", "IconCompatParcelizer", "()Lo/updateStateAndInformListeners;", "Lo/handleIncreaseDeviceVolume;", "p2", "", "(Ljava/lang/String;Lo/handleIncreaseDeviceVolume;Ljava/lang/Object;)V", "write", "(Ljava/lang/String;)V", "", "Lo/getPlaceholderState;", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/handleClearVideoOutput;", "Z", "()Lo/updateStateAndInformListeners$write;", "()V", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "", "Ljava/util/Set;", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "", "Ljava/util/List;", "MediaBrowserCompatItemReceiver", "Lo/shouldHandleCommand;", "Lo/updateStateAndInformListeners$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class write<P extends shouldHandleCommand<?>, T extends write<P, T>> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final Set<String> AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private String read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final handleClearVideoOutput IconCompatParcelizer;
        private P MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final Set<String> AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private boolean write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final List<getPlaceholderState> MediaBrowserCompatCustomActionResultReceiver;

        protected abstract T write();

        private write(handleClearVideoOutput handleclearvideooutput, boolean z) {
            this.IconCompatParcelizer = handleclearvideooutput;
            this.AudioAttributesCompatParcelizer = z;
            this.AudioAttributesImplBaseParcelizer = new LinkedHashSet();
            this.AudioAttributesImplApi21Parcelizer = new LinkedHashSet();
            this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
        }

        public final void read() {
            this.write = true;
        }

        public final T AudioAttributesCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.read != null) {
                StringBuilder sb = new StringBuilder("CustomTemplate name is already set as \"");
                sb.append(this.read);
                sb.append('\"');
                throw new getPlaceholderMediaItemData(sb.toString(), null, 2, null);
            }
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) p0)) {
                throw new getPlaceholderMediaItemData("CustomTemplate must have a non-blank name", null, 2, null);
            }
            this.read = p0;
            return (T) write();
        }

        public final T AudioAttributesCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            RemoteActionCompatParcelizer(p0, handleIncreaseDeviceVolume.AudioAttributesImplApi26Parcelizer, p1);
            return (T) write();
        }

        public final T RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            RemoteActionCompatParcelizer(str, handleIncreaseDeviceVolume.IconCompatParcelizer, Boolean.FALSE);
            return (T) write();
        }

        public final T read(P p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.MediaBrowserCompatItemReceiver = p0;
            return (T) write();
        }

        public final updateStateAndInformListeners IconCompatParcelizer() {
            P p = this.MediaBrowserCompatItemReceiver;
            if (p == null) {
                throw new getPlaceholderMediaItemData("CustomTemplate must have a presenter", null, 2, null);
            }
            String str = this.read;
            if (str == null) {
                throw new getPlaceholderMediaItemData("CustomTemplate must have a name", null, 2, null);
            }
            return new updateStateAndInformListeners(str, p, this.AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer(), this.IconCompatParcelizer, this.write, null);
        }

        private void RemoteActionCompatParcelizer(String p0, handleIncreaseDeviceVolume p1, Object p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            String str = p0;
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
                throw new getPlaceholderMediaItemData("Argument name must not be blank", null, 2, null);
            }
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, ".") || TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p0, ".") || TestGroupLSModel.write((CharSequence) str, (CharSequence) "..", false)) {
                throw new getPlaceholderMediaItemData("Argument name must not begin or end with a \".\" nor have consecutive \".\"", null, 2, null);
            }
            if (this.AudioAttributesImplBaseParcelizer.contains(p0)) {
                StringBuilder sb = new StringBuilder("Argument with name \"");
                sb.append(p0);
                sb.append("\" is already defined");
                throw new getPlaceholderMediaItemData(sb.toString(), null, 2, null);
            }
            write(p0);
            this.MediaBrowserCompatCustomActionResultReceiver.add(new getPlaceholderState(p0, p1, p2));
            this.AudioAttributesImplBaseParcelizer.add(p0);
        }

        private final void write(String p0) {
            String str = p0;
            for (int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) str, '.', 0, false, 4); iIconCompatParcelizer != -1; iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) str, '.', iIconCompatParcelizer + 1, false, 4)) {
                String strSubstring = p0.substring(0, iIconCompatParcelizer);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                if (this.AudioAttributesImplBaseParcelizer.contains(strSubstring)) {
                    StringBuilder sb = new StringBuilder("Argument with name \"");
                    sb.append(p0);
                    sb.append("\" is already defined");
                    throw new getPlaceholderMediaItemData(sb.toString(), null, 2, null);
                }
                this.AudioAttributesImplApi21Parcelizer.add(strSubstring);
            }
            if (this.AudioAttributesImplApi21Parcelizer.contains(p0)) {
                StringBuilder sb2 = new StringBuilder("Argument with name \"");
                sb2.append(p0);
                sb2.append("\" is already defined");
                throw new getPlaceholderMediaItemData(sb2.toString(), null, 2, null);
            }
        }

        private final List<getPlaceholderState> RemoteActionCompatParcelizer() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (getPlaceholderState getplaceholderstate : this.MediaBrowserCompatCustomActionResultReceiver) {
                String str = (String) IntermediateLoginResponseBody.RatingCompat(TestGroupLSModel.write(getplaceholderstate.AudioAttributesCompatParcelizer(), new String[]{"."}, 2, 2));
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (linkedHashMap2.containsKey(str)) {
                    List list = (List) linkedHashMap.get(str);
                    if (list != null) {
                        list.add(getplaceholderstate);
                    }
                } else {
                    linkedHashMap2.put(str, IntermediateLoginResponseBody.write(getplaceholderstate));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) IntermediateLoginResponseBody.onPlay((Iterable) ((Map.Entry) it.next()).getValue()), new Comparator() { // from class: o.updateStateAndInformListeners.write.3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return getConfigExpirySeconds.read(((getPlaceholderState) t).AudioAttributesCompatParcelizer(), ((getPlaceholderState) t2).AudioAttributesCompatParcelizer());
                    }
                }));
            }
            return arrayList;
        }

        public /* synthetic */ write(handleClearVideoOutput handleclearvideooutput, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(handleclearvideooutput, z);
        }
    }
}
